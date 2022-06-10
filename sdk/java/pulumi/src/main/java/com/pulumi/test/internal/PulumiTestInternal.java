package com.pulumi.test.internal;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.pulumi.Config;
import com.pulumi.Context;
import com.pulumi.Log;
import com.pulumi.context.internal.ConfigContextInternal;
import com.pulumi.context.internal.ContextInternal;
import com.pulumi.context.internal.LoggingContextInternal;
import com.pulumi.context.internal.OutputContextInternal;
import com.pulumi.core.Output;
import com.pulumi.core.internal.Internal;
import com.pulumi.core.internal.OutputData;
import com.pulumi.core.internal.OutputFactory;
import com.pulumi.core.internal.annotations.InternalUse;
import com.pulumi.deployment.EmptyMocks;
import com.pulumi.deployment.MockEngine;
import com.pulumi.deployment.MockMonitor;
import com.pulumi.deployment.MockRunner;
import com.pulumi.deployment.Mocks;
import com.pulumi.deployment.internal.DeploymentImpl;
import com.pulumi.deployment.internal.DeploymentInstanceInternal;
import com.pulumi.deployment.internal.DeploymentInternal;
import com.pulumi.deployment.internal.DeploymentTests;
import com.pulumi.deployment.internal.Engine;
import com.pulumi.deployment.internal.EngineLogger;
import com.pulumi.deployment.internal.Monitor;
import com.pulumi.deployment.internal.Runner;
import com.pulumi.deployment.internal.TestOptions;
import com.pulumi.internal.PulumiInternal;
import com.pulumi.test.PulumiTest;
import com.pulumi.test.TestResult;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.pulumi.deployment.internal.DeploymentTests.defaultLogger;
import static java.util.Objects.requireNonNull;

/**
 * Provides an internal test Pulumi entrypoint and exposes various internals for the testing purposes.
 */
@InternalUse
public class PulumiTestInternal extends PulumiInternal implements PulumiTest {

    private final Log log;
    private final MockEngine engine;
    private final MockMonitor monitor;

    @InternalUse
    public PulumiTestInternal(
            Runner runner,
            MockEngine engine,
            MockMonitor monitor,
            Log log,
            ContextInternal stackContext
    ) {
        super(runner, stackContext);
        this.log = requireNonNull(log);
        this.engine = requireNonNull(engine);
        this.monitor = requireNonNull(monitor);
    }

    /**
     * @return return the {@link Runner} used by the test
     */
    @InternalUse
    public Runner runner() {
        return this.runner;
    }

    /**
     * @return return the {@link Engine} used by the test
     */
    @InternalUse
    public Engine engine() {
        return this.engine;
    }

    /**
     * @return return the {@link Monitor} used by the test
     */
    @InternalUse
    public Monitor monitor() {
        return this.monitor;
    }

    /**
     * @return return the {@link Log} used by the test
     */
    @InternalUse
    public Log log() {
        return this.log;
    }

    public TestResult runTest(Consumer<Context> stackCallback) {
        return runTestAsync(stackCallback).join();
    }

    public CompletableFuture<TestResult> runTestAsync(
            Consumer<Context> stackCallback
    ) {
        return runAsyncResult(stackCallback).thenApply(r -> new TestResult(
                r.exitCode(),
                this.monitor.resources,
                r.exceptions(),
                ImmutableList.copyOf(this.engine.getErrors()),
                this.stackContext.exports()
        ));
    }

    /**
     * @see PulumiTest#cleanup()
     */
    public static void cleanup() {
        DeploymentTests.cleanupDeploymentMocks();
    }

    @InternalUse
    @CanIgnoreReturnValue
    public static <T> OutputData<T> extractOutputData(Output<T> output) {
        return Internal.of(output).getDataAsync().join();
    }

    @InternalUse
    public static final class APIInternal implements PulumiTest.API {

        private final Builder builder = new Builder();

        @Override
        public PulumiTest.API withOptions(TestOptions options) {
            this.builder.options(options);
            return this;
        }

        @Override
        public PulumiTest.API withMocks(Mocks mocks) {
            this.builder.mocks(mocks);
            return this;
        }

        @Override
        public TestResult runTest(Consumer<Context> stack) {
            return builder.build().runTest(stack);
        }

        @Override
        public CompletableFuture<TestResult> runTestAsync(Consumer<Context> stack) {
            return builder.build().runTestAsync(stack);
        }
    }

    /**
     * @return a new {@link Builder} for {@link PulumiTestInternal}
     */
    @InternalUse
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The {@link PulumiTestInternal} builder.
     */
    @InternalUse
    public static final class Builder {

        @Nullable
        private TestOptions options;

        // internal details
        @Nullable
        private Runner runner;
        @Nullable
        private MockEngine engine;
        @Nullable
        private MockMonitor monitor;
        @Nullable
        private Mocks mocks;
        @Nullable
        private Log log;

        // very internal details
        @Nullable
        private Logger standardLogger;
        @Nullable
        private EngineLogger engineLogger;
        @Nullable
        private DeploymentImpl.Config config;
        @Nullable
        private DeploymentImpl.DeploymentState state;
        @Nullable
        private Function<DeploymentImpl.DeploymentState, DeploymentInternal> deploymentFactory;

        /**
         * @param options the {@link TestOptions} to use
         * @return a Pulumi test program entrypoint with given {@link TestOptions}
         * @see PulumiTest.API#withOptions(TestOptions)
         */
        public Builder options(TestOptions options) {
            this.options = requireNonNull(options);
            return this;
        }

        /**
         * @param mocks the {@link com.pulumi.deployment.internal.Monitor} mocks to use
         * @return a Pulumi test program entrypoint with given {@link TestOptions}
         * @see PulumiTest.API#withMocks(Mocks)
         */
        public Builder mocks(Mocks mocks) {
            this.mocks = requireNonNull(mocks);
            return this;
        }

        public PulumiTestInternal.Builder standardLogger(Logger standardLogger) {
            this.standardLogger = requireNonNull(standardLogger);
            return this;
        }

        /**
         * Set configuration to use for this test
         *
         * @param allConfig        the configuration key-value map
         * @param configSecretKeys the secret key names
         * @return this {@link PulumiTestInternal.Builder}
         */
        public PulumiTestInternal.Builder config(Map<String, String> allConfig, Set<String> configSecretKeys) {
            return internalConfig(new DeploymentImpl.Config(
                    ImmutableMap.copyOf(allConfig), ImmutableSet.copyOf(configSecretKeys)
            ));
        }

        /**
         * Set configuration to use for this test
         *
         * @param allConfig the configuration key-value map
         * @return this {@link PulumiTestInternal.Builder}
         */
        public PulumiTestInternal.Builder config(Map<String, String> allConfig) {
            return internalConfig(new DeploymentImpl.Config(
                    ImmutableMap.copyOf(allConfig), ImmutableSet.of()
            ));
        }

        private PulumiTestInternal.Builder internalConfig(DeploymentImpl.Config config) {
            this.config = requireNonNull(config);
            return this;
        }

        /**
         * Modify the deployment factory used in the test
         *
         * @param deploymentFactory the factory for
         * @return this {@link Builder}
         */
        public Builder deploymentFactory(
                Function<DeploymentImpl.DeploymentState, DeploymentInternal> deploymentFactory
        ) {
            this.deploymentFactory = requireNonNull(deploymentFactory);
            return this;
        }

        /**
         * @return a {@link PulumiTestInternal} instance created from this {@link Builder}
         */
        public PulumiTestInternal build() {
            if (this.options == null) {
                this.options = TestOptions.Empty;
            }
            if (this.standardLogger == null) {
                this.standardLogger = defaultLogger();
            }
            // FIXME: this instance is different then the one in DeploymentState
            if (this.engineLogger == null) {
                this.engineLogger = new DeploymentImpl.DefaultEngineLogger(
                        this.standardLogger,
                        () -> this.state.runner,
                        () -> this.engine
                );
            }
            // FIXME: this instance is different then the one in Deployment
            if (this.log == null) {
                this.log = new Log(this.engineLogger);
            }
            // FIXME: this runner is being ignored right now in DeploymentState
            if (this.runner == null) {
                this.runner = new MockRunner();
            }
            if (this.engine == null) {
                this.engine = new MockEngine();
            }
            if (this.mocks == null) {
                this.mocks = new EmptyMocks();
            }
            if (this.monitor == null) {
                this.monitor = new MockMonitor(this.mocks, this.log);
            }
            if (this.config == null) {
                this.config = new DeploymentImpl.Config(ImmutableMap.of(), ImmutableSet.of());
            }
            if (this.state == null) {
                this.state = new DeploymentImpl.DeploymentState(
                        this.config,
                        this.standardLogger,
                        this.options.projectName(),
                        this.options.stackName(),
                        this.options.preview(),
                        this.engine,
                        this.monitor
                );
            }
            if (this.deploymentFactory == null) {
                this.deploymentFactory = DeploymentImpl::new;
            }
            var deployment = deploymentFactory.apply(this.state);
            // FIXME: this is needed because we create runner inside DeploymentState currently
            this.runner = deployment.getRunner();
            DeploymentImpl.setInstance(new DeploymentInstanceInternal(deployment));

            Function<String, Config> configFactory = (name) -> new Config(this.config, name);
            var configContext = new ConfigContextInternal(this.options.projectName(), configFactory);
            var loggingContext = new LoggingContextInternal(this.log);
            var outputFactory = new OutputFactory(this.runner);
            var outputsContext = new OutputContextInternal(outputFactory);

            var context = new ContextInternal(
                    this.options.projectName(),
                    this.options.stackName(),
                    loggingContext, configContext, outputsContext,
                    this.options.resourceTransformations()
            );
            return new PulumiTestInternal(
                    this.runner, this.engine, this.monitor, this.log, context
            );
        }
    }

    public static Logger logger(Level level) {
        var standardLogger = Logger.getLogger(DeploymentTests.class.getName());
        standardLogger.setLevel(level);
        return standardLogger;
    }
}
