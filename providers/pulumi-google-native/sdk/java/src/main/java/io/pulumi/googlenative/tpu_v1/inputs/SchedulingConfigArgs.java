// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sets the scheduling options for this node.
 * 
 */
public final class SchedulingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingConfigArgs Empty = new SchedulingConfigArgs();

    /**
     * Defines whether the node is preemptible.
     * 
     */
    @Import(name="preemptible")
      private final @Nullable Output<Boolean> preemptible;

    public Output<Boolean> preemptible() {
        return this.preemptible == null ? Codegen.empty() : this.preemptible;
    }

    /**
     * Whether the node is created under a reservation.
     * 
     */
    @Import(name="reserved")
      private final @Nullable Output<Boolean> reserved;

    public Output<Boolean> reserved() {
        return this.reserved == null ? Codegen.empty() : this.reserved;
    }

    public SchedulingConfigArgs(
        @Nullable Output<Boolean> preemptible,
        @Nullable Output<Boolean> reserved) {
        this.preemptible = preemptible;
        this.reserved = reserved;
    }

    private SchedulingConfigArgs() {
        this.preemptible = Codegen.empty();
        this.reserved = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> preemptible;
        private @Nullable Output<Boolean> reserved;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preemptible = defaults.preemptible;
    	      this.reserved = defaults.reserved;
        }

        public Builder preemptible(@Nullable Output<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = Codegen.ofNullable(preemptible);
            return this;
        }
        public Builder reserved(@Nullable Output<Boolean> reserved) {
            this.reserved = reserved;
            return this;
        }
        public Builder reserved(@Nullable Boolean reserved) {
            this.reserved = Codegen.ofNullable(reserved);
            return this;
        }        public SchedulingConfigArgs build() {
            return new SchedulingConfigArgs(preemptible, reserved);
        }
    }
}
