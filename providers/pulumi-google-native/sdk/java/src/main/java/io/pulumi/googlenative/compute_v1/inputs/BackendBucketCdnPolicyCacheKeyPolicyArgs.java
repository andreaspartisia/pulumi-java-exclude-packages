// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendBucketCdnPolicyCacheKeyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendBucketCdnPolicyCacheKeyPolicyArgs Empty = new BackendBucketCdnPolicyCacheKeyPolicyArgs();

    @InputImport(name="includeHttpHeaders")
    private final @Nullable Input<List<String>> includeHttpHeaders;

    public Input<List<String>> getIncludeHttpHeaders() {
        return this.includeHttpHeaders == null ? Input.empty() : this.includeHttpHeaders;
    }

    @InputImport(name="queryStringWhitelist")
    private final @Nullable Input<List<String>> queryStringWhitelist;

    public Input<List<String>> getQueryStringWhitelist() {
        return this.queryStringWhitelist == null ? Input.empty() : this.queryStringWhitelist;
    }

    public BackendBucketCdnPolicyCacheKeyPolicyArgs(
        @Nullable Input<List<String>> includeHttpHeaders,
        @Nullable Input<List<String>> queryStringWhitelist) {
        this.includeHttpHeaders = includeHttpHeaders;
        this.queryStringWhitelist = queryStringWhitelist;
    }

    private BackendBucketCdnPolicyCacheKeyPolicyArgs() {
        this.includeHttpHeaders = Input.empty();
        this.queryStringWhitelist = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyCacheKeyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> includeHttpHeaders;
        private @Nullable Input<List<String>> queryStringWhitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyCacheKeyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHttpHeaders = defaults.includeHttpHeaders;
    	      this.queryStringWhitelist = defaults.queryStringWhitelist;
        }

        public Builder setIncludeHttpHeaders(@Nullable Input<List<String>> includeHttpHeaders) {
            this.includeHttpHeaders = includeHttpHeaders;
            return this;
        }

        public Builder setIncludeHttpHeaders(@Nullable List<String> includeHttpHeaders) {
            this.includeHttpHeaders = Input.ofNullable(includeHttpHeaders);
            return this;
        }

        public Builder setQueryStringWhitelist(@Nullable Input<List<String>> queryStringWhitelist) {
            this.queryStringWhitelist = queryStringWhitelist;
            return this;
        }

        public Builder setQueryStringWhitelist(@Nullable List<String> queryStringWhitelist) {
            this.queryStringWhitelist = Input.ofNullable(queryStringWhitelist);
            return this;
        }

        public BackendBucketCdnPolicyCacheKeyPolicyArgs build() {
            return new BackendBucketCdnPolicyCacheKeyPolicyArgs(includeHttpHeaders, queryStringWhitelist);
        }
    }
}