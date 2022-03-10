// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs();

    /**
     * Inspect all query arguments.
     * 
     */
    @InputImport(name="allQueryArguments")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;

    public Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> getAllQueryArguments() {
        return this.allQueryArguments == null ? Input.empty() : this.allQueryArguments;
    }

    /**
     * Inspect the request body, which immediately follows the request headers.
     * 
     */
    @InputImport(name="body")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;

    public Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> getBody() {
        return this.body == null ? Input.empty() : this.body;
    }

    /**
     * Inspect the HTTP method. The method indicates the type of operation that the request is asking the origin to perform.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;

    public Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> getMethod() {
        return this.method == null ? Input.empty() : this.method;
    }

    /**
     * Inspect the query string. This is the part of a URL that appears after a `?` character, if any.
     * 
     */
    @InputImport(name="queryString")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;

    public Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> getQueryString() {
        return this.queryString == null ? Input.empty() : this.queryString;
    }

    /**
     * Inspect a single header. See Single Header below for details.
     * 
     */
    @InputImport(name="singleHeader")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;

    public Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> getSingleHeader() {
        return this.singleHeader == null ? Input.empty() : this.singleHeader;
    }

    /**
     * Inspect a single query argument. See Single Query Argument below for details.
     * 
     */
    @InputImport(name="singleQueryArgument")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;

    public Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> getSingleQueryArgument() {
        return this.singleQueryArgument == null ? Input.empty() : this.singleQueryArgument;
    }

    /**
     * Inspect the request URI path. This is the part of a web request that identifies a resource, for example, `/images/daily-ad.jpg`.
     * 
     */
    @InputImport(name="uriPath")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

    public Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> getUriPath() {
        return this.uriPath == null ? Input.empty() : this.uriPath;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs(
        @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments,
        @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body,
        @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method,
        @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString,
        @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader,
        @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument,
        @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
        this.allQueryArguments = allQueryArguments;
        this.body = body;
        this.method = method;
        this.queryString = queryString;
        this.singleHeader = singleHeader;
        this.singleQueryArgument = singleQueryArgument;
        this.uriPath = uriPath;
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs() {
        this.allQueryArguments = Input.empty();
        this.body = Input.empty();
        this.method = Input.empty();
        this.queryString = Input.empty();
        this.singleHeader = Input.empty();
        this.singleQueryArgument = Input.empty();
        this.uriPath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument;
        private @Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allQueryArguments = defaults.allQueryArguments;
    	      this.body = defaults.body;
    	      this.method = defaults.method;
    	      this.queryString = defaults.queryString;
    	      this.singleHeader = defaults.singleHeader;
    	      this.singleQueryArgument = defaults.singleQueryArgument;
    	      this.uriPath = defaults.uriPath;
        }

        public Builder setAllQueryArguments(@Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs> allQueryArguments) {
            this.allQueryArguments = allQueryArguments;
            return this;
        }

        public Builder setAllQueryArguments(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchAllQueryArgumentsGetArgs allQueryArguments) {
            this.allQueryArguments = Input.ofNullable(allQueryArguments);
            return this;
        }

        public Builder setBody(@Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs> body) {
            this.body = body;
            return this;
        }

        public Builder setBody(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchBodyGetArgs body) {
            this.body = Input.ofNullable(body);
            return this;
        }

        public Builder setMethod(@Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs> method) {
            this.method = method;
            return this;
        }

        public Builder setMethod(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchMethodGetArgs method) {
            this.method = Input.ofNullable(method);
            return this;
        }

        public Builder setQueryString(@Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs> queryString) {
            this.queryString = queryString;
            return this;
        }

        public Builder setQueryString(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchQueryStringGetArgs queryString) {
            this.queryString = Input.ofNullable(queryString);
            return this;
        }

        public Builder setSingleHeader(@Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs> singleHeader) {
            this.singleHeader = singleHeader;
            return this;
        }

        public Builder setSingleHeader(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleHeaderGetArgs singleHeader) {
            this.singleHeader = Input.ofNullable(singleHeader);
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs> singleQueryArgument) {
            this.singleQueryArgument = singleQueryArgument;
            return this;
        }

        public Builder setSingleQueryArgument(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchSingleQueryArgumentGetArgs singleQueryArgument) {
            this.singleQueryArgument = Input.ofNullable(singleQueryArgument);
            return this;
        }

        public Builder setUriPath(@Nullable Input<WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs> uriPath) {
            this.uriPath = uriPath;
            return this;
        }

        public Builder setUriPath(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchUriPathGetArgs uriPath) {
            this.uriPath = Input.ofNullable(uriPath);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementByteMatchStatementFieldToMatchGetArgs(allQueryArguments, body, method, queryString, singleHeader, singleQueryArgument, uriPath);
        }
    }
}