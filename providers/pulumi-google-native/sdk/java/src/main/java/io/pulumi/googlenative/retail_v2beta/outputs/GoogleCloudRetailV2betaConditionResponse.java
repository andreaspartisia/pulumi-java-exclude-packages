// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaConditionQueryTermResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaConditionTimeRangeResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRetailV2betaConditionResponse {
    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
     */
    private final List<GoogleCloudRetailV2betaConditionTimeRangeResponse> activeTimeRange;
    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
     */
    private final List<GoogleCloudRetailV2betaConditionQueryTermResponse> queryTerms;

    @CustomType.Constructor
    private GoogleCloudRetailV2betaConditionResponse(
        @CustomType.Parameter("activeTimeRange") List<GoogleCloudRetailV2betaConditionTimeRangeResponse> activeTimeRange,
        @CustomType.Parameter("queryTerms") List<GoogleCloudRetailV2betaConditionQueryTermResponse> queryTerms) {
        this.activeTimeRange = activeTimeRange;
        this.queryTerms = queryTerms;
    }

    /**
     * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
     * 
    */
    public List<GoogleCloudRetailV2betaConditionTimeRangeResponse> activeTimeRange() {
        return this.activeTimeRange;
    }
    /**
     * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
     * 
    */
    public List<GoogleCloudRetailV2betaConditionQueryTermResponse> queryTerms() {
        return this.queryTerms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2betaConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudRetailV2betaConditionTimeRangeResponse> activeTimeRange;
        private List<GoogleCloudRetailV2betaConditionQueryTermResponse> queryTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2betaConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTimeRange = defaults.activeTimeRange;
    	      this.queryTerms = defaults.queryTerms;
        }

        public Builder activeTimeRange(List<GoogleCloudRetailV2betaConditionTimeRangeResponse> activeTimeRange) {
            this.activeTimeRange = Objects.requireNonNull(activeTimeRange);
            return this;
        }
        public Builder activeTimeRange(GoogleCloudRetailV2betaConditionTimeRangeResponse... activeTimeRange) {
            return activeTimeRange(List.of(activeTimeRange));
        }
        public Builder queryTerms(List<GoogleCloudRetailV2betaConditionQueryTermResponse> queryTerms) {
            this.queryTerms = Objects.requireNonNull(queryTerms);
            return this;
        }
        public Builder queryTerms(GoogleCloudRetailV2betaConditionQueryTermResponse... queryTerms) {
            return queryTerms(List.of(queryTerms));
        }        public GoogleCloudRetailV2betaConditionResponse build() {
            return new GoogleCloudRetailV2betaConditionResponse(activeTimeRange, queryTerms);
        }
    }
}
