// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class CorsRuleResponse {
    private final List<String> allowedHeaders;
    private final List<String> allowedMethods;
    private final List<String> allowedOrigins;
    private final List<String> exposedHeaders;
    private final Integer maxAgeInSeconds;

    @OutputCustomType.Constructor({"allowedHeaders","allowedMethods","allowedOrigins","exposedHeaders","maxAgeInSeconds"})
    private CorsRuleResponse(
        List<String> allowedHeaders,
        List<String> allowedMethods,
        List<String> allowedOrigins,
        List<String> exposedHeaders,
        Integer maxAgeInSeconds) {
        this.allowedHeaders = Objects.requireNonNull(allowedHeaders);
        this.allowedMethods = Objects.requireNonNull(allowedMethods);
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
        this.exposedHeaders = Objects.requireNonNull(exposedHeaders);
        this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds);
    }

    public List<String> getAllowedHeaders() {
        return this.allowedHeaders;
    }
    public List<String> getAllowedMethods() {
        return this.allowedMethods;
    }
    public List<String> getAllowedOrigins() {
        return this.allowedOrigins;
    }
    public List<String> getExposedHeaders() {
        return this.exposedHeaders;
    }
    public Integer getMaxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedHeaders;
        private List<String> allowedMethods;
        private List<String> allowedOrigins;
        private List<String> exposedHeaders;
        private Integer maxAgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        public Builder setAllowedHeaders(List<String> allowedHeaders) {
            this.allowedHeaders = Objects.requireNonNull(allowedHeaders);
            return this;
        }

        public Builder setAllowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }

        public Builder setAllowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }

        public Builder setExposedHeaders(List<String> exposedHeaders) {
            this.exposedHeaders = Objects.requireNonNull(exposedHeaders);
            return this;
        }

        public Builder setMaxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds);
            return this;
        }

        public CorsRuleResponse build() {
            return new CorsRuleResponse(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, maxAgeInSeconds);
        }
    }
}