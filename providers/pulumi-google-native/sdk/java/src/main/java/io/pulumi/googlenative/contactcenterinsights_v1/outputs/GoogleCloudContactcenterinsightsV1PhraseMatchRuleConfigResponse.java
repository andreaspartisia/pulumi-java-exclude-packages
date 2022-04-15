// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse;
import java.util.Objects;

@CustomType
public final class GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse {
    /**
     * The configuration for the exact match rule.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig;

    @CustomType.Constructor
    private GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse(@CustomType.Parameter("exactMatchConfig") GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig) {
        this.exactMatchConfig = exactMatchConfig;
    }

    /**
     * The configuration for the exact match rule.
     * 
    */
    public GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig() {
        return this.exactMatchConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatchConfig = defaults.exactMatchConfig;
        }

        public Builder exactMatchConfig(GoogleCloudContactcenterinsightsV1ExactMatchConfigResponse exactMatchConfig) {
            this.exactMatchConfig = Objects.requireNonNull(exactMatchConfig);
            return this;
        }        public GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse build() {
            return new GoogleCloudContactcenterinsightsV1PhraseMatchRuleConfigResponse(exactMatchConfig);
        }
    }
}
