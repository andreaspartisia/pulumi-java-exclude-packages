// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.aws.appsync.inputs.FunctionSyncConfigLambdaConflictHandlerConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionSyncConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionSyncConfigArgs Empty = new FunctionSyncConfigArgs();

    /**
     * The Conflict Detection strategy to use. Valid values are `NONE` and `VERSION`.
     * 
     */
    @InputImport(name="conflictDetection")
      private final @Nullable Input<String> conflictDetection;

    public Input<String> getConflictDetection() {
        return this.conflictDetection == null ? Input.empty() : this.conflictDetection;
    }

    /**
     * The Conflict Resolution strategy to perform in the event of a conflict. Valid values are `NONE`, `OPTIMISTIC_CONCURRENCY`, `AUTOMERGE`, and `LAMBDA`.
     * 
     */
    @InputImport(name="conflictHandler")
      private final @Nullable Input<String> conflictHandler;

    public Input<String> getConflictHandler() {
        return this.conflictHandler == null ? Input.empty() : this.conflictHandler;
    }

    /**
     * The Lambda Conflict Handler Config when configuring `LAMBDA` as the Conflict Handler. See Lambda Conflict Handler Config.
     * 
     */
    @InputImport(name="lambdaConflictHandlerConfig")
      private final @Nullable Input<FunctionSyncConfigLambdaConflictHandlerConfigArgs> lambdaConflictHandlerConfig;

    public Input<FunctionSyncConfigLambdaConflictHandlerConfigArgs> getLambdaConflictHandlerConfig() {
        return this.lambdaConflictHandlerConfig == null ? Input.empty() : this.lambdaConflictHandlerConfig;
    }

    public FunctionSyncConfigArgs(
        @Nullable Input<String> conflictDetection,
        @Nullable Input<String> conflictHandler,
        @Nullable Input<FunctionSyncConfigLambdaConflictHandlerConfigArgs> lambdaConflictHandlerConfig) {
        this.conflictDetection = conflictDetection;
        this.conflictHandler = conflictHandler;
        this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
    }

    private FunctionSyncConfigArgs() {
        this.conflictDetection = Input.empty();
        this.conflictHandler = Input.empty();
        this.lambdaConflictHandlerConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionSyncConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> conflictDetection;
        private @Nullable Input<String> conflictHandler;
        private @Nullable Input<FunctionSyncConfigLambdaConflictHandlerConfigArgs> lambdaConflictHandlerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionSyncConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictDetection = defaults.conflictDetection;
    	      this.conflictHandler = defaults.conflictHandler;
    	      this.lambdaConflictHandlerConfig = defaults.lambdaConflictHandlerConfig;
        }

        public Builder setConflictDetection(@Nullable Input<String> conflictDetection) {
            this.conflictDetection = conflictDetection;
            return this;
        }

        public Builder setConflictDetection(@Nullable String conflictDetection) {
            this.conflictDetection = Input.ofNullable(conflictDetection);
            return this;
        }

        public Builder setConflictHandler(@Nullable Input<String> conflictHandler) {
            this.conflictHandler = conflictHandler;
            return this;
        }

        public Builder setConflictHandler(@Nullable String conflictHandler) {
            this.conflictHandler = Input.ofNullable(conflictHandler);
            return this;
        }

        public Builder setLambdaConflictHandlerConfig(@Nullable Input<FunctionSyncConfigLambdaConflictHandlerConfigArgs> lambdaConflictHandlerConfig) {
            this.lambdaConflictHandlerConfig = lambdaConflictHandlerConfig;
            return this;
        }

        public Builder setLambdaConflictHandlerConfig(@Nullable FunctionSyncConfigLambdaConflictHandlerConfigArgs lambdaConflictHandlerConfig) {
            this.lambdaConflictHandlerConfig = Input.ofNullable(lambdaConflictHandlerConfig);
            return this;
        }
        public FunctionSyncConfigArgs build() {
            return new FunctionSyncConfigArgs(conflictDetection, conflictHandler, lambdaConflictHandlerConfig);
        }
    }
}