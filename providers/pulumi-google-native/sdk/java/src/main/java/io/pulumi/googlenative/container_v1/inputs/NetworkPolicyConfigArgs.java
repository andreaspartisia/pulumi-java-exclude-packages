// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for NetworkPolicy. This only tracks whether the addon is enabled or not on the Master, it does not track whether network policy is enabled for the nodes.
 * 
 */
public final class NetworkPolicyConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPolicyConfigArgs Empty = new NetworkPolicyConfigArgs();

    /**
     * Whether NetworkPolicy is enabled for this cluster.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    public NetworkPolicyConfigArgs(@Nullable Output<Boolean> disabled) {
        this.disabled = disabled;
    }

    private NetworkPolicyConfigArgs() {
        this.disabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPolicyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPolicyConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }        public NetworkPolicyConfigArgs build() {
            return new NetworkPolicyConfigArgs(disabled);
        }
    }
}
