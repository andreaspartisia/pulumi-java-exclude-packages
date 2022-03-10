// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch {
    /**
     * Inspect all query arguments.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body;
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method;
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

    @OutputCustomType.Constructor
    private WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch(
        @OutputCustomType.Parameter("allQueryArguments") @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments,
        @OutputCustomType.Parameter("body") @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body,
        @OutputCustomType.Parameter("method") @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method,
        @OutputCustomType.Parameter("queryString") @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString,
        @OutputCustomType.Parameter("singleHeader") @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader,
        @OutputCustomType.Parameter("singleQueryArgument") @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument,
        @OutputCustomType.Parameter("uriPath") @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    /**
     * Inspect all query arguments.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments> getAllQueryArguments() {
        return Optional.ofNullable(this.allQueryArguments);
    }
    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody> getBody() {
        return Optional.ofNullable(this.body);
    }
    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod> getMethod() {
        return Optional.ofNullable(this.method);
    }
    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString> getQueryString() {
        return Optional.ofNullable(this.queryString);
    }
    /**
     * Inspect a single header. See Single Header below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader> getSingleHeader() {
        return Optional.ofNullable(this.singleHeader);
    }
    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument> getSingleQueryArgument() {
        return Optional.ofNullable(this.singleQueryArgument);
    }
    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath> getUriPath() {
        return Optional.ofNullable(this.uriPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument;
        private @Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchAllQueryArguments allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchBody body) {
            this.body = body;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchMethod method) {
            this.method = method;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchQueryString queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleHeader singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchSingleQueryArgument singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatchUriPath uriPath) {
            this.uriPath = uriPath;
            return this;
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementXssMatchStatementFieldToMatch(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}