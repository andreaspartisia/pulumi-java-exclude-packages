// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Sets the scheduling options for this node.
 * 
 */
public final class SchedulingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchedulingConfigResponse Empty = new SchedulingConfigResponse();

    /**
     * Defines whether the node is preemptible.
     * 
     */
    @Import(name="preemptible", required=true)
      private final Boolean preemptible;

    public Boolean preemptible() {
        return this.preemptible;
    }

    /**
     * Whether the node is created under a reservation.
     * 
     */
    @Import(name="reserved", required=true)
      private final Boolean reserved;

    public Boolean reserved() {
        return this.reserved;
    }

    public SchedulingConfigResponse(
        Boolean preemptible,
        Boolean reserved) {
        this.preemptible = Objects.requireNonNull(preemptible, "expected parameter 'preemptible' to be non-null");
        this.reserved = Objects.requireNonNull(reserved, "expected parameter 'reserved' to be non-null");
    }

    private SchedulingConfigResponse() {
        this.preemptible = null;
        this.reserved = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean preemptible;
        private Boolean reserved;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preemptible = defaults.preemptible;
    	      this.reserved = defaults.reserved;
        }

        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }
        public Builder reserved(Boolean reserved) {
            this.reserved = Objects.requireNonNull(reserved);
            return this;
        }        public SchedulingConfigResponse build() {
            return new SchedulingConfigResponse(preemptible, reserved);
        }
    }
}
