// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.enums.NodeGroupAutoscalingPolicyMode;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupAutoscalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupAutoscalingPolicyArgs Empty = new NodeGroupAutoscalingPolicyArgs();

    /**
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * 
     */
    @Import(name="maxNodes")
      private final @Nullable Output<Integer> maxNodes;

    public Output<Integer> maxNodes() {
        return this.maxNodes == null ? Codegen.empty() : this.maxNodes;
    }

    /**
     * The minimum number of nodes that the group should have.
     * 
     */
    @Import(name="minNodes")
      private final @Nullable Output<Integer> minNodes;

    public Output<Integer> minNodes() {
        return this.minNodes == null ? Codegen.empty() : this.minNodes;
    }

    /**
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<NodeGroupAutoscalingPolicyMode> mode;

    public Output<NodeGroupAutoscalingPolicyMode> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    public NodeGroupAutoscalingPolicyArgs(
        @Nullable Output<Integer> maxNodes,
        @Nullable Output<Integer> minNodes,
        @Nullable Output<NodeGroupAutoscalingPolicyMode> mode) {
        this.maxNodes = maxNodes;
        this.minNodes = minNodes;
        this.mode = mode;
    }

    private NodeGroupAutoscalingPolicyArgs() {
        this.maxNodes = Codegen.empty();
        this.minNodes = Codegen.empty();
        this.mode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxNodes;
        private @Nullable Output<Integer> minNodes;
        private @Nullable Output<NodeGroupAutoscalingPolicyMode> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupAutoscalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodes = defaults.maxNodes;
    	      this.minNodes = defaults.minNodes;
    	      this.mode = defaults.mode;
        }

        public Builder maxNodes(@Nullable Output<Integer> maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }
        public Builder maxNodes(@Nullable Integer maxNodes) {
            this.maxNodes = Codegen.ofNullable(maxNodes);
            return this;
        }
        public Builder minNodes(@Nullable Output<Integer> minNodes) {
            this.minNodes = minNodes;
            return this;
        }
        public Builder minNodes(@Nullable Integer minNodes) {
            this.minNodes = Codegen.ofNullable(minNodes);
            return this;
        }
        public Builder mode(@Nullable Output<NodeGroupAutoscalingPolicyMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable NodeGroupAutoscalingPolicyMode mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }        public NodeGroupAutoscalingPolicyArgs build() {
            return new NodeGroupAutoscalingPolicyArgs(maxNodes, minNodes, mode);
        }
    }
}
