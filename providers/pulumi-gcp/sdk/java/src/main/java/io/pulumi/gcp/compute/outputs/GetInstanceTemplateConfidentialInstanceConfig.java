// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceTemplateConfidentialInstanceConfig {
    private final Boolean enableConfidentialCompute;

    @OutputCustomType.Constructor
    private GetInstanceTemplateConfidentialInstanceConfig(@OutputCustomType.Parameter("enableConfidentialCompute") Boolean enableConfidentialCompute) {
        this.enableConfidentialCompute = enableConfidentialCompute;
    }

    public Boolean getEnableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateConfidentialInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableConfidentialCompute;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateConfidentialInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
        }

        public Builder setEnableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }
        public GetInstanceTemplateConfidentialInstanceConfig build() {
            return new GetInstanceTemplateConfidentialInstanceConfig(enableConfidentialCompute);
        }
    }
}
