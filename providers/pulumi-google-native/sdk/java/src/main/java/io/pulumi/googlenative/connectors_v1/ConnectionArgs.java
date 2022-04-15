// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.connectors_v1.inputs.AuthConfigArgs;
import io.pulumi.googlenative.connectors_v1.inputs.ConfigVariableArgs;
import io.pulumi.googlenative.connectors_v1.inputs.LockConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionArgs Empty = new ConnectionArgs();

    /**
     * Optional. Configuration for establishing the connection's authentication with an external system.
     * 
     */
    @Import(name="authConfig")
      private final @Nullable Output<AuthConfigArgs> authConfig;

    public Output<AuthConfigArgs> authConfig() {
        return this.authConfig == null ? Codegen.empty() : this.authConfig;
    }

    /**
     * Optional. Configuration for configuring the connection with an external system.
     * 
     */
    @Import(name="configVariables")
      private final @Nullable Output<List<ConfigVariableArgs>> configVariables;

    public Output<List<ConfigVariableArgs>> configVariables() {
        return this.configVariables == null ? Codegen.empty() : this.configVariables;
    }

    @Import(name="connectionId", required=true)
      private final Output<String> connectionId;

    public Output<String> connectionId() {
        return this.connectionId;
    }

    /**
     * Connector version on which the connection is created. The format is: projects/*{@literal /}locations/global/providers/*{@literal /}connectors/*{@literal /}versions/*
     * 
     */
    @Import(name="connectorVersion", required=true)
      private final Output<String> connectorVersion;

    public Output<String> connectorVersion() {
        return this.connectorVersion;
    }

    /**
     * Optional. Description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optional. Configuration that indicates whether or not the Connection can be edited.
     * 
     */
    @Import(name="lockConfig")
      private final @Nullable Output<LockConfigArgs> lockConfig;

    public Output<LockConfigArgs> lockConfig() {
        return this.lockConfig == null ? Codegen.empty() : this.lockConfig;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. Service account needed for runtime plane to access GCP resources.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Optional. Suspended indicates if a user has suspended a connection or not.
     * 
     */
    @Import(name="suspended")
      private final @Nullable Output<Boolean> suspended;

    public Output<Boolean> suspended() {
        return this.suspended == null ? Codegen.empty() : this.suspended;
    }

    public ConnectionArgs(
        @Nullable Output<AuthConfigArgs> authConfig,
        @Nullable Output<List<ConfigVariableArgs>> configVariables,
        Output<String> connectionId,
        Output<String> connectorVersion,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<LockConfigArgs> lockConfig,
        @Nullable Output<String> project,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<Boolean> suspended) {
        this.authConfig = authConfig;
        this.configVariables = configVariables;
        this.connectionId = Objects.requireNonNull(connectionId, "expected parameter 'connectionId' to be non-null");
        this.connectorVersion = Objects.requireNonNull(connectorVersion, "expected parameter 'connectorVersion' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.lockConfig = lockConfig;
        this.project = project;
        this.serviceAccount = serviceAccount;
        this.suspended = suspended;
    }

    private ConnectionArgs() {
        this.authConfig = Codegen.empty();
        this.configVariables = Codegen.empty();
        this.connectionId = Codegen.empty();
        this.connectorVersion = Codegen.empty();
        this.description = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.lockConfig = Codegen.empty();
        this.project = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.suspended = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AuthConfigArgs> authConfig;
        private @Nullable Output<List<ConfigVariableArgs>> configVariables;
        private Output<String> connectionId;
        private Output<String> connectorVersion;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<LockConfigArgs> lockConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<Boolean> suspended;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authConfig = defaults.authConfig;
    	      this.configVariables = defaults.configVariables;
    	      this.connectionId = defaults.connectionId;
    	      this.connectorVersion = defaults.connectorVersion;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.lockConfig = defaults.lockConfig;
    	      this.project = defaults.project;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.suspended = defaults.suspended;
        }

        public Builder authConfig(@Nullable Output<AuthConfigArgs> authConfig) {
            this.authConfig = authConfig;
            return this;
        }
        public Builder authConfig(@Nullable AuthConfigArgs authConfig) {
            this.authConfig = Codegen.ofNullable(authConfig);
            return this;
        }
        public Builder configVariables(@Nullable Output<List<ConfigVariableArgs>> configVariables) {
            this.configVariables = configVariables;
            return this;
        }
        public Builder configVariables(@Nullable List<ConfigVariableArgs> configVariables) {
            this.configVariables = Codegen.ofNullable(configVariables);
            return this;
        }
        public Builder configVariables(ConfigVariableArgs... configVariables) {
            return configVariables(List.of(configVariables));
        }
        public Builder connectionId(Output<String> connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }
        public Builder connectionId(String connectionId) {
            this.connectionId = Output.of(Objects.requireNonNull(connectionId));
            return this;
        }
        public Builder connectorVersion(Output<String> connectorVersion) {
            this.connectorVersion = Objects.requireNonNull(connectorVersion);
            return this;
        }
        public Builder connectorVersion(String connectorVersion) {
            this.connectorVersion = Output.of(Objects.requireNonNull(connectorVersion));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder lockConfig(@Nullable Output<LockConfigArgs> lockConfig) {
            this.lockConfig = lockConfig;
            return this;
        }
        public Builder lockConfig(@Nullable LockConfigArgs lockConfig) {
            this.lockConfig = Codegen.ofNullable(lockConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder suspended(@Nullable Output<Boolean> suspended) {
            this.suspended = suspended;
            return this;
        }
        public Builder suspended(@Nullable Boolean suspended) {
            this.suspended = Codegen.ofNullable(suspended);
            return this;
        }        public ConnectionArgs build() {
            return new ConnectionArgs(authConfig, configVariables, connectionId, connectorVersion, description, labels, location, lockConfig, project, serviceAccount, suspended);
        }
    }
}
