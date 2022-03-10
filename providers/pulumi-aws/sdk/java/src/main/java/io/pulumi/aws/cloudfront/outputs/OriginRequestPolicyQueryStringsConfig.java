// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.OriginRequestPolicyQueryStringsConfigQueryStrings;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OriginRequestPolicyQueryStringsConfig {
    private final String queryStringBehavior;
    private final @Nullable OriginRequestPolicyQueryStringsConfigQueryStrings queryStrings;

    @OutputCustomType.Constructor
    private OriginRequestPolicyQueryStringsConfig(
        @OutputCustomType.Parameter("queryStringBehavior") String queryStringBehavior,
        @OutputCustomType.Parameter("queryStrings") @Nullable OriginRequestPolicyQueryStringsConfigQueryStrings queryStrings) {
        this.queryStringBehavior = queryStringBehavior;
        this.queryStrings = queryStrings;
    }

    public String getQueryStringBehavior() {
        return this.queryStringBehavior;
    }
    public Optional<OriginRequestPolicyQueryStringsConfigQueryStrings> getQueryStrings() {
        return Optional.ofNullable(this.queryStrings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginRequestPolicyQueryStringsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String queryStringBehavior;
        private @Nullable OriginRequestPolicyQueryStringsConfigQueryStrings queryStrings;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginRequestPolicyQueryStringsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryStringBehavior = defaults.queryStringBehavior;
    	      this.queryStrings = defaults.queryStrings;
        }

        public Builder setQueryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public Builder setQueryStrings(@Nullable OriginRequestPolicyQueryStringsConfigQueryStrings queryStrings) {
            this.queryStrings = queryStrings;
            return this;
        }
        public OriginRequestPolicyQueryStringsConfig build() {
            return new OriginRequestPolicyQueryStringsConfig(queryStringBehavior, queryStrings);
        }
    }
}