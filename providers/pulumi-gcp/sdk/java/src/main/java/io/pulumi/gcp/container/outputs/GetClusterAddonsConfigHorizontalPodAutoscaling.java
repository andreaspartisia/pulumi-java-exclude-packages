// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetClusterAddonsConfigHorizontalPodAutoscaling {
    private final Boolean disabled;

    @OutputCustomType.Constructor
    private GetClusterAddonsConfigHorizontalPodAutoscaling(@OutputCustomType.Parameter("disabled") Boolean disabled) {
        this.disabled = disabled;
    }

    public Boolean getDisabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAddonsConfigHorizontalPodAutoscaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAddonsConfigHorizontalPodAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder setDisabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public GetClusterAddonsConfigHorizontalPodAutoscaling build() {
            return new GetClusterAddonsConfigHorizontalPodAutoscaling(disabled);
        }
    }
}
