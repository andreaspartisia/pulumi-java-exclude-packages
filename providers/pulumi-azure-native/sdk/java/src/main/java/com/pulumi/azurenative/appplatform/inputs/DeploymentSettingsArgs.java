// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.azurenative.appplatform.enums.RuntimeVersion;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deployment settings payload
 * 
 */
public final class DeploymentSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeploymentSettingsArgs Empty = new DeploymentSettingsArgs();

    /**
     * Required CPU, basic tier should be 1, standard tier should be in range (1, 4)
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<Integer> cpu;

    public Optional<Output<Integer>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * Collection of environment variables
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * JVM parameter
     * 
     */
    @Import(name="jvmOptions")
    private @Nullable Output<String> jvmOptions;

    public Optional<Output<String>> jvmOptions() {
        return Optional.ofNullable(this.jvmOptions);
    }

    /**
     * Required Memory size in GB, basic tier should be in range (1, 2), standard tier should be in range (1, 8)
     * 
     */
    @Import(name="memoryInGB")
    private @Nullable Output<Integer> memoryInGB;

    public Optional<Output<Integer>> memoryInGB() {
        return Optional.ofNullable(this.memoryInGB);
    }

    /**
     * The path to the .NET executable relative to zip root
     * 
     */
    @Import(name="netCoreMainEntryPath")
    private @Nullable Output<String> netCoreMainEntryPath;

    public Optional<Output<String>> netCoreMainEntryPath() {
        return Optional.ofNullable(this.netCoreMainEntryPath);
    }

    /**
     * Runtime version
     * 
     */
    @Import(name="runtimeVersion")
    private @Nullable Output<Either<String,RuntimeVersion>> runtimeVersion;

    public Optional<Output<Either<String,RuntimeVersion>>> runtimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    private DeploymentSettingsArgs() {}

    private DeploymentSettingsArgs(DeploymentSettingsArgs $) {
        this.cpu = $.cpu;
        this.environmentVariables = $.environmentVariables;
        this.jvmOptions = $.jvmOptions;
        this.memoryInGB = $.memoryInGB;
        this.netCoreMainEntryPath = $.netCoreMainEntryPath;
        this.runtimeVersion = $.runtimeVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeploymentSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeploymentSettingsArgs $;

        public Builder() {
            $ = new DeploymentSettingsArgs();
        }

        public Builder(DeploymentSettingsArgs defaults) {
            $ = new DeploymentSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder cpu(@Nullable Output<Integer> cpu) {
            $.cpu = cpu;
            return this;
        }

        public Builder cpu(Integer cpu) {
            return cpu(Output.of(cpu));
        }

        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        public Builder jvmOptions(@Nullable Output<String> jvmOptions) {
            $.jvmOptions = jvmOptions;
            return this;
        }

        public Builder jvmOptions(String jvmOptions) {
            return jvmOptions(Output.of(jvmOptions));
        }

        public Builder memoryInGB(@Nullable Output<Integer> memoryInGB) {
            $.memoryInGB = memoryInGB;
            return this;
        }

        public Builder memoryInGB(Integer memoryInGB) {
            return memoryInGB(Output.of(memoryInGB));
        }

        public Builder netCoreMainEntryPath(@Nullable Output<String> netCoreMainEntryPath) {
            $.netCoreMainEntryPath = netCoreMainEntryPath;
            return this;
        }

        public Builder netCoreMainEntryPath(String netCoreMainEntryPath) {
            return netCoreMainEntryPath(Output.of(netCoreMainEntryPath));
        }

        public Builder runtimeVersion(@Nullable Output<Either<String,RuntimeVersion>> runtimeVersion) {
            $.runtimeVersion = runtimeVersion;
            return this;
        }

        public Builder runtimeVersion(Either<String,RuntimeVersion> runtimeVersion) {
            return runtimeVersion(Output.of(runtimeVersion));
        }

        public Builder runtimeVersion(String runtimeVersion) {
            return runtimeVersion(Either.ofLeft(runtimeVersion));
        }

        public Builder runtimeVersion(RuntimeVersion runtimeVersion) {
            return runtimeVersion(Either.ofRight(runtimeVersion));
        }

        public DeploymentSettingsArgs build() {
            $.cpu = Codegen.integerProp("cpu").output().arg($.cpu).def(1).getNullable();
            $.memoryInGB = Codegen.integerProp("memoryInGB").output().arg($.memoryInGB).def(1).getNullable();
            $.runtimeVersion = Codegen.stringProp("runtimeVersion").left(RuntimeVersion.class).output().arg($.runtimeVersion).def("Java_8").getNullable();
            return $;
        }
    }

}
