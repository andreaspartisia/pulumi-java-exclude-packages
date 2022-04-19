// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The type of IoT Security recommendation.
 * 
 */
public final class RecommendationConfigurationPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final RecommendationConfigurationPropertiesResponse Empty = new RecommendationConfigurationPropertiesResponse();

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The type of IoT Security recommendation.
     * 
     */
    @Import(name="recommendationType", required=true)
      private final String recommendationType;

    public String recommendationType() {
        return this.recommendationType;
    }

    /**
     * Recommendation status. When the recommendation status is disabled recommendations are not generated.
     * 
     */
    @Import(name="status", required=true)
      private final String status;

    public String status() {
        return this.status;
    }

    public RecommendationConfigurationPropertiesResponse(
        String name,
        String recommendationType,
        String status) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.recommendationType = Objects.requireNonNull(recommendationType, "expected parameter 'recommendationType' to be non-null");
        this.status = Codegen.stringProp("status").arg(status).def("Enabled").require();
    }

    private RecommendationConfigurationPropertiesResponse() {
        this.name = null;
        this.recommendationType = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendationConfigurationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String recommendationType;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendationConfigurationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.recommendationType = defaults.recommendationType;
    	      this.status = defaults.status;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder recommendationType(String recommendationType) {
            this.recommendationType = Objects.requireNonNull(recommendationType);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public RecommendationConfigurationPropertiesResponse build() {
            return new RecommendationConfigurationPropertiesResponse(name, recommendationType, status);
        }
    }
}
