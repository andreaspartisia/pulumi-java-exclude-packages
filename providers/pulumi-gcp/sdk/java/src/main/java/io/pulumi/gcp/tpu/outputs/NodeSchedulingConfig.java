// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tpu.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class NodeSchedulingConfig {
    /**
     * Defines whether the TPU instance is preemptible.
     * 
     */
    private final Boolean preemptible;

    @OutputCustomType.Constructor
    private NodeSchedulingConfig(@OutputCustomType.Parameter("preemptible") Boolean preemptible) {
        this.preemptible = preemptible;
    }

    /**
     * Defines whether the TPU instance is preemptible.
     * 
    */
    public Boolean getPreemptible() {
        return this.preemptible;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSchedulingConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSchedulingConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preemptible = defaults.preemptible;
        }

        public Builder setPreemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }
        public NodeSchedulingConfig build() {
            return new NodeSchedulingConfig(preemptible);
        }
    }
}
