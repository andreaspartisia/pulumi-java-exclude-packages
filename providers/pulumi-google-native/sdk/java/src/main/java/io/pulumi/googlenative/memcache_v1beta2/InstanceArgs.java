// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1beta2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.memcache_v1beta2.enums.InstanceMemcacheVersion;
import io.pulumi.googlenative.memcache_v1beta2.inputs.InstanceMessageArgs;
import io.pulumi.googlenative.memcache_v1beta2.inputs.MemcacheParametersArgs;
import io.pulumi.googlenative.memcache_v1beta2.inputs.NodeConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The full name of the Google Compute Engine [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left unspecified, the `default` network will be used.
     * 
     */
    @Import(name="authorizedNetwork")
      private final @Nullable Output<String> authorizedNetwork;

    public Output<String> authorizedNetwork() {
        return this.authorizedNetwork == null ? Codegen.empty() : this.authorizedNetwork;
    }

    /**
     * User provided name for the instance, which is only used for display purposes. Cannot be more than 80 characters.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * List of messages that describe the current state of the Memcached instance.
     * 
     */
    @Import(name="instanceMessages")
      private final @Nullable Output<List<InstanceMessageArgs>> instanceMessages;

    public Output<List<InstanceMessageArgs>> instanceMessages() {
        return this.instanceMessages == null ? Codegen.empty() : this.instanceMessages;
    }

    /**
     * Resource labels to represent user-provided metadata. Refer to cloud documentation on labels for more details. https://cloud.google.com/compute/docs/labeling-resources
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
     * The major version of Memcached software. If not provided, latest supported version will be used. Currently the latest supported major version is `MEMCACHE_1_5`. The minor version will be automatically determined by our system based on the latest supported minor version.
     * 
     */
    @Import(name="memcacheVersion")
      private final @Nullable Output<InstanceMemcacheVersion> memcacheVersion;

    public Output<InstanceMemcacheVersion> memcacheVersion() {
        return this.memcacheVersion == null ? Codegen.empty() : this.memcacheVersion;
    }

    /**
     * Unique name of the resource in this scope including project and location using the form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Memcached instances are managed and addressed at the regional level so `location_id` here refers to a Google Cloud region; however, users may choose which zones Memcached nodes should be provisioned in within an instance. Refer to zones field for more details.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Configuration for Memcached nodes.
     * 
     */
    @Import(name="nodeConfig", required=true)
      private final Output<NodeConfigArgs> nodeConfig;

    public Output<NodeConfigArgs> nodeConfig() {
        return this.nodeConfig;
    }

    /**
     * Number of nodes in the Memcached instance.
     * 
     */
    @Import(name="nodeCount", required=true)
      private final Output<Integer> nodeCount;

    public Output<Integer> nodeCount() {
        return this.nodeCount;
    }

    /**
     * User defined parameters to apply to the memcached process on each node.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<MemcacheParametersArgs> parameters;

    public Output<MemcacheParametersArgs> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Zones in which Memcached nodes should be provisioned. Memcached nodes will be equally distributed across these zones. If not provided, the service will by default create nodes in all zones in the region for the instance.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> zones() {
        return this.zones == null ? Codegen.empty() : this.zones;
    }

    public InstanceArgs(
        @Nullable Output<String> authorizedNetwork,
        @Nullable Output<String> displayName,
        Output<String> instanceId,
        @Nullable Output<List<InstanceMessageArgs>> instanceMessages,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<InstanceMemcacheVersion> memcacheVersion,
        @Nullable Output<String> name,
        Output<NodeConfigArgs> nodeConfig,
        Output<Integer> nodeCount,
        @Nullable Output<MemcacheParametersArgs> parameters,
        @Nullable Output<String> project,
        @Nullable Output<List<String>> zones) {
        this.authorizedNetwork = authorizedNetwork;
        this.displayName = displayName;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.instanceMessages = instanceMessages;
        this.labels = labels;
        this.location = location;
        this.memcacheVersion = memcacheVersion;
        this.name = name;
        this.nodeConfig = Objects.requireNonNull(nodeConfig, "expected parameter 'nodeConfig' to be non-null");
        this.nodeCount = Objects.requireNonNull(nodeCount, "expected parameter 'nodeCount' to be non-null");
        this.parameters = parameters;
        this.project = project;
        this.zones = zones;
    }

    private InstanceArgs() {
        this.authorizedNetwork = Codegen.empty();
        this.displayName = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.instanceMessages = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.memcacheVersion = Codegen.empty();
        this.name = Codegen.empty();
        this.nodeConfig = Codegen.empty();
        this.nodeCount = Codegen.empty();
        this.parameters = Codegen.empty();
        this.project = Codegen.empty();
        this.zones = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizedNetwork;
        private @Nullable Output<String> displayName;
        private Output<String> instanceId;
        private @Nullable Output<List<InstanceMessageArgs>> instanceMessages;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<InstanceMemcacheVersion> memcacheVersion;
        private @Nullable Output<String> name;
        private Output<NodeConfigArgs> nodeConfig;
        private Output<Integer> nodeCount;
        private @Nullable Output<MemcacheParametersArgs> parameters;
        private @Nullable Output<String> project;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.displayName = defaults.displayName;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceMessages = defaults.instanceMessages;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.memcacheVersion = defaults.memcacheVersion;
    	      this.name = defaults.name;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.zones = defaults.zones;
        }

        public Builder authorizedNetwork(@Nullable Output<String> authorizedNetwork) {
            this.authorizedNetwork = authorizedNetwork;
            return this;
        }
        public Builder authorizedNetwork(@Nullable String authorizedNetwork) {
            this.authorizedNetwork = Codegen.ofNullable(authorizedNetwork);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder instanceMessages(@Nullable Output<List<InstanceMessageArgs>> instanceMessages) {
            this.instanceMessages = instanceMessages;
            return this;
        }
        public Builder instanceMessages(@Nullable List<InstanceMessageArgs> instanceMessages) {
            this.instanceMessages = Codegen.ofNullable(instanceMessages);
            return this;
        }
        public Builder instanceMessages(InstanceMessageArgs... instanceMessages) {
            return instanceMessages(List.of(instanceMessages));
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
        public Builder memcacheVersion(@Nullable Output<InstanceMemcacheVersion> memcacheVersion) {
            this.memcacheVersion = memcacheVersion;
            return this;
        }
        public Builder memcacheVersion(@Nullable InstanceMemcacheVersion memcacheVersion) {
            this.memcacheVersion = Codegen.ofNullable(memcacheVersion);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder nodeConfig(Output<NodeConfigArgs> nodeConfig) {
            this.nodeConfig = Objects.requireNonNull(nodeConfig);
            return this;
        }
        public Builder nodeConfig(NodeConfigArgs nodeConfig) {
            this.nodeConfig = Output.of(Objects.requireNonNull(nodeConfig));
            return this;
        }
        public Builder nodeCount(Output<Integer> nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Output.of(Objects.requireNonNull(nodeCount));
            return this;
        }
        public Builder parameters(@Nullable Output<MemcacheParametersArgs> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable MemcacheParametersArgs parameters) {
            this.parameters = Codegen.ofNullable(parameters);
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
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Codegen.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public InstanceArgs build() {
            return new InstanceArgs(authorizedNetwork, displayName, instanceId, instanceMessages, labels, location, memcacheVersion, name, nodeConfig, nodeCount, parameters, project, zones);
        }
    }
}
