// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.tpu_v1.enums.NodeHealth;
import io.pulumi.googlenative.tpu_v1.inputs.SchedulingConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeArgs Empty = new NodeArgs();

    /**
     * The type of hardware accelerators associated with this node.
     * 
     */
    @Import(name="acceleratorType", required=true)
      private final Output<String> acceleratorType;

    public Output<String> acceleratorType() {
        return this.acceleratorType;
    }

    /**
     * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user's provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    @Import(name="cidrBlock")
      private final @Nullable Output<String> cidrBlock;

    public Output<String> cidrBlock() {
        return this.cidrBlock == null ? Codegen.empty() : this.cidrBlock;
    }

    /**
     * The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The health status of the TPU node.
     * 
     */
    @Import(name="health")
      private final @Nullable Output<NodeHealth> health;

    public Output<NodeHealth> health() {
        return this.health == null ? Codegen.empty() : this.health;
    }

    /**
     * Resource labels to represent user-provided metadata.
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
     * The name of a network they wish to peer the TPU node to. It must be a preexisting Compute Engine network inside of the project on which this API has been activated. If none is provided, "default" will be used.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    @Import(name="nodeId")
      private final @Nullable Output<String> nodeId;

    public Output<String> nodeId() {
        return this.nodeId == null ? Codegen.empty() : this.nodeId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The scheduling options for this node.
     * 
     */
    @Import(name="schedulingConfig")
      private final @Nullable Output<SchedulingConfigArgs> schedulingConfig;

    public Output<SchedulingConfigArgs> schedulingConfig() {
        return this.schedulingConfig == null ? Codegen.empty() : this.schedulingConfig;
    }

    /**
     * The version of Tensorflow running in the Node.
     * 
     */
    @Import(name="tensorflowVersion", required=true)
      private final Output<String> tensorflowVersion;

    public Output<String> tensorflowVersion() {
        return this.tensorflowVersion;
    }

    /**
     * Whether the VPC peering for the node is set up through Service Networking API. The VPC Peering should be set up before provisioning the node. If this field is set, cidr_block field should not be specified. If the network, that you want to peer the TPU Node to, is Shared VPC networks, the node must be created with this this field enabled.
     * 
     */
    @Import(name="useServiceNetworking")
      private final @Nullable Output<Boolean> useServiceNetworking;

    public Output<Boolean> useServiceNetworking() {
        return this.useServiceNetworking == null ? Codegen.empty() : this.useServiceNetworking;
    }

    public NodeArgs(
        Output<String> acceleratorType,
        @Nullable Output<String> cidrBlock,
        @Nullable Output<String> description,
        @Nullable Output<NodeHealth> health,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> network,
        @Nullable Output<String> nodeId,
        @Nullable Output<String> project,
        @Nullable Output<SchedulingConfigArgs> schedulingConfig,
        Output<String> tensorflowVersion,
        @Nullable Output<Boolean> useServiceNetworking) {
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
        this.cidrBlock = cidrBlock;
        this.description = description;
        this.health = health;
        this.labels = labels;
        this.location = location;
        this.network = network;
        this.nodeId = nodeId;
        this.project = project;
        this.schedulingConfig = schedulingConfig;
        this.tensorflowVersion = Objects.requireNonNull(tensorflowVersion, "expected parameter 'tensorflowVersion' to be non-null");
        this.useServiceNetworking = useServiceNetworking;
    }

    private NodeArgs() {
        this.acceleratorType = Codegen.empty();
        this.cidrBlock = Codegen.empty();
        this.description = Codegen.empty();
        this.health = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.network = Codegen.empty();
        this.nodeId = Codegen.empty();
        this.project = Codegen.empty();
        this.schedulingConfig = Codegen.empty();
        this.tensorflowVersion = Codegen.empty();
        this.useServiceNetworking = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> acceleratorType;
        private @Nullable Output<String> cidrBlock;
        private @Nullable Output<String> description;
        private @Nullable Output<NodeHealth> health;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> network;
        private @Nullable Output<String> nodeId;
        private @Nullable Output<String> project;
        private @Nullable Output<SchedulingConfigArgs> schedulingConfig;
        private Output<String> tensorflowVersion;
        private @Nullable Output<Boolean> useServiceNetworking;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.description = defaults.description;
    	      this.health = defaults.health;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.network = defaults.network;
    	      this.nodeId = defaults.nodeId;
    	      this.project = defaults.project;
    	      this.schedulingConfig = defaults.schedulingConfig;
    	      this.tensorflowVersion = defaults.tensorflowVersion;
    	      this.useServiceNetworking = defaults.useServiceNetworking;
        }

        public Builder acceleratorType(Output<String> acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Output.of(Objects.requireNonNull(acceleratorType));
            return this;
        }
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Codegen.ofNullable(cidrBlock);
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
        public Builder health(@Nullable Output<NodeHealth> health) {
            this.health = health;
            return this;
        }
        public Builder health(@Nullable NodeHealth health) {
            this.health = Codegen.ofNullable(health);
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
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder nodeId(@Nullable Output<String> nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Builder nodeId(@Nullable String nodeId) {
            this.nodeId = Codegen.ofNullable(nodeId);
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
        public Builder schedulingConfig(@Nullable Output<SchedulingConfigArgs> schedulingConfig) {
            this.schedulingConfig = schedulingConfig;
            return this;
        }
        public Builder schedulingConfig(@Nullable SchedulingConfigArgs schedulingConfig) {
            this.schedulingConfig = Codegen.ofNullable(schedulingConfig);
            return this;
        }
        public Builder tensorflowVersion(Output<String> tensorflowVersion) {
            this.tensorflowVersion = Objects.requireNonNull(tensorflowVersion);
            return this;
        }
        public Builder tensorflowVersion(String tensorflowVersion) {
            this.tensorflowVersion = Output.of(Objects.requireNonNull(tensorflowVersion));
            return this;
        }
        public Builder useServiceNetworking(@Nullable Output<Boolean> useServiceNetworking) {
            this.useServiceNetworking = useServiceNetworking;
            return this;
        }
        public Builder useServiceNetworking(@Nullable Boolean useServiceNetworking) {
            this.useServiceNetworking = Codegen.ofNullable(useServiceNetworking);
            return this;
        }        public NodeArgs build() {
            return new NodeArgs(acceleratorType, cidrBlock, description, health, labels, location, network, nodeId, project, schedulingConfig, tensorflowVersion, useServiceNetworking);
        }
    }
}
