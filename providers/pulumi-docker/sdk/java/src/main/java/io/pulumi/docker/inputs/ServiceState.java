// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.docker.inputs.ServiceAuthGetArgs;
import io.pulumi.docker.inputs.ServiceConvergeConfigGetArgs;
import io.pulumi.docker.inputs.ServiceEndpointSpecGetArgs;
import io.pulumi.docker.inputs.ServiceLabelGetArgs;
import io.pulumi.docker.inputs.ServiceModeGetArgs;
import io.pulumi.docker.inputs.ServiceRollbackConfigGetArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecGetArgs;
import io.pulumi.docker.inputs.ServiceUpdateConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * Configuration for the authentication for pulling the images of the service
     * 
     */
    @InputImport(name="auth")
      private final @Nullable Input<ServiceAuthGetArgs> auth;

    public Input<ServiceAuthGetArgs> getAuth() {
        return this.auth == null ? Input.empty() : this.auth;
    }

    /**
     * A configuration to ensure that a service converges aka reaches the desired that of all task up and running
     * 
     */
    @InputImport(name="convergeConfig")
      private final @Nullable Input<ServiceConvergeConfigGetArgs> convergeConfig;

    public Input<ServiceConvergeConfigGetArgs> getConvergeConfig() {
        return this.convergeConfig == null ? Input.empty() : this.convergeConfig;
    }

    /**
     * Properties that can be configured to access and load balance a service
     * 
     */
    @InputImport(name="endpointSpec")
      private final @Nullable Input<ServiceEndpointSpecGetArgs> endpointSpec;

    public Input<ServiceEndpointSpecGetArgs> getEndpointSpec() {
        return this.endpointSpec == null ? Input.empty() : this.endpointSpec;
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<List<ServiceLabelGetArgs>> labels;

    public Input<List<ServiceLabelGetArgs>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Scheduling mode for the service
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<ServiceModeGetArgs> mode;

    public Input<ServiceModeGetArgs> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * Name of the service
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specification for the rollback strategy of the service
     * 
     */
    @InputImport(name="rollbackConfig")
      private final @Nullable Input<ServiceRollbackConfigGetArgs> rollbackConfig;

    public Input<ServiceRollbackConfigGetArgs> getRollbackConfig() {
        return this.rollbackConfig == null ? Input.empty() : this.rollbackConfig;
    }

    /**
     * User modifiable task configuration
     * 
     */
    @InputImport(name="taskSpec")
      private final @Nullable Input<ServiceTaskSpecGetArgs> taskSpec;

    public Input<ServiceTaskSpecGetArgs> getTaskSpec() {
        return this.taskSpec == null ? Input.empty() : this.taskSpec;
    }

    /**
     * Specification for the update strategy of the service
     * 
     */
    @InputImport(name="updateConfig")
      private final @Nullable Input<ServiceUpdateConfigGetArgs> updateConfig;

    public Input<ServiceUpdateConfigGetArgs> getUpdateConfig() {
        return this.updateConfig == null ? Input.empty() : this.updateConfig;
    }

    public ServiceState(
        @Nullable Input<ServiceAuthGetArgs> auth,
        @Nullable Input<ServiceConvergeConfigGetArgs> convergeConfig,
        @Nullable Input<ServiceEndpointSpecGetArgs> endpointSpec,
        @Nullable Input<List<ServiceLabelGetArgs>> labels,
        @Nullable Input<ServiceModeGetArgs> mode,
        @Nullable Input<String> name,
        @Nullable Input<ServiceRollbackConfigGetArgs> rollbackConfig,
        @Nullable Input<ServiceTaskSpecGetArgs> taskSpec,
        @Nullable Input<ServiceUpdateConfigGetArgs> updateConfig) {
        this.auth = auth;
        this.convergeConfig = convergeConfig;
        this.endpointSpec = endpointSpec;
        this.labels = labels;
        this.mode = mode;
        this.name = name;
        this.rollbackConfig = rollbackConfig;
        this.taskSpec = taskSpec;
        this.updateConfig = updateConfig;
    }

    private ServiceState() {
        this.auth = Input.empty();
        this.convergeConfig = Input.empty();
        this.endpointSpec = Input.empty();
        this.labels = Input.empty();
        this.mode = Input.empty();
        this.name = Input.empty();
        this.rollbackConfig = Input.empty();
        this.taskSpec = Input.empty();
        this.updateConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceAuthGetArgs> auth;
        private @Nullable Input<ServiceConvergeConfigGetArgs> convergeConfig;
        private @Nullable Input<ServiceEndpointSpecGetArgs> endpointSpec;
        private @Nullable Input<List<ServiceLabelGetArgs>> labels;
        private @Nullable Input<ServiceModeGetArgs> mode;
        private @Nullable Input<String> name;
        private @Nullable Input<ServiceRollbackConfigGetArgs> rollbackConfig;
        private @Nullable Input<ServiceTaskSpecGetArgs> taskSpec;
        private @Nullable Input<ServiceUpdateConfigGetArgs> updateConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.convergeConfig = defaults.convergeConfig;
    	      this.endpointSpec = defaults.endpointSpec;
    	      this.labels = defaults.labels;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.rollbackConfig = defaults.rollbackConfig;
    	      this.taskSpec = defaults.taskSpec;
    	      this.updateConfig = defaults.updateConfig;
        }

        public Builder setAuth(@Nullable Input<ServiceAuthGetArgs> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setAuth(@Nullable ServiceAuthGetArgs auth) {
            this.auth = Input.ofNullable(auth);
            return this;
        }

        public Builder setConvergeConfig(@Nullable Input<ServiceConvergeConfigGetArgs> convergeConfig) {
            this.convergeConfig = convergeConfig;
            return this;
        }

        public Builder setConvergeConfig(@Nullable ServiceConvergeConfigGetArgs convergeConfig) {
            this.convergeConfig = Input.ofNullable(convergeConfig);
            return this;
        }

        public Builder setEndpointSpec(@Nullable Input<ServiceEndpointSpecGetArgs> endpointSpec) {
            this.endpointSpec = endpointSpec;
            return this;
        }

        public Builder setEndpointSpec(@Nullable ServiceEndpointSpecGetArgs endpointSpec) {
            this.endpointSpec = Input.ofNullable(endpointSpec);
            return this;
        }

        public Builder setLabels(@Nullable Input<List<ServiceLabelGetArgs>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable List<ServiceLabelGetArgs> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setMode(@Nullable Input<ServiceModeGetArgs> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable ServiceModeGetArgs mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRollbackConfig(@Nullable Input<ServiceRollbackConfigGetArgs> rollbackConfig) {
            this.rollbackConfig = rollbackConfig;
            return this;
        }

        public Builder setRollbackConfig(@Nullable ServiceRollbackConfigGetArgs rollbackConfig) {
            this.rollbackConfig = Input.ofNullable(rollbackConfig);
            return this;
        }

        public Builder setTaskSpec(@Nullable Input<ServiceTaskSpecGetArgs> taskSpec) {
            this.taskSpec = taskSpec;
            return this;
        }

        public Builder setTaskSpec(@Nullable ServiceTaskSpecGetArgs taskSpec) {
            this.taskSpec = Input.ofNullable(taskSpec);
            return this;
        }

        public Builder setUpdateConfig(@Nullable Input<ServiceUpdateConfigGetArgs> updateConfig) {
            this.updateConfig = updateConfig;
            return this;
        }

        public Builder setUpdateConfig(@Nullable ServiceUpdateConfigGetArgs updateConfig) {
            this.updateConfig = Input.ofNullable(updateConfig);
            return this;
        }
        public ServiceState build() {
            return new ServiceState(auth, convergeConfig, endpointSpec, labels, mode, name, rollbackConfig, taskSpec, updateConfig);
        }
    }
}