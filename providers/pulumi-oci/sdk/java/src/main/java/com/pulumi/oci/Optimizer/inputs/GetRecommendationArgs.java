// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRecommendationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRecommendationArgs Empty = new GetRecommendationArgs();

    /**
     * The unique OCID associated with the recommendation.
     * 
     */
    @Import(name="recommendationId", required=true)
    private String recommendationId;

    /**
     * @return The unique OCID associated with the recommendation.
     * 
     */
    public String recommendationId() {
        return this.recommendationId;
    }

    private GetRecommendationArgs() {}

    private GetRecommendationArgs(GetRecommendationArgs $) {
        this.recommendationId = $.recommendationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRecommendationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRecommendationArgs $;

        public Builder() {
            $ = new GetRecommendationArgs();
        }

        public Builder(GetRecommendationArgs defaults) {
            $ = new GetRecommendationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param recommendationId The unique OCID associated with the recommendation.
         * 
         * @return builder
         * 
         */
        public Builder recommendationId(String recommendationId) {
            $.recommendationId = recommendationId;
            return this;
        }

        public GetRecommendationArgs build() {
            $.recommendationId = Objects.requireNonNull($.recommendationId, "expected parameter 'recommendationId' to be non-null");
            return $;
        }
    }

}
