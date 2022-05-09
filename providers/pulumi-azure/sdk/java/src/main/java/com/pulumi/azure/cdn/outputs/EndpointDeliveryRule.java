// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleCacheExpirationAction;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleCacheKeyQueryStringAction;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleCookiesCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleDeviceCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleHttpVersionCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleModifyRequestHeaderAction;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleModifyResponseHeaderAction;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRulePostArgCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleQueryStringCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleRemoteAddressCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleRequestBodyCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleRequestHeaderCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleRequestMethodCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleRequestSchemeCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleRequestUriCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleUrlFileExtensionCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleUrlFileNameCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleUrlPathCondition;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleUrlRedirectAction;
import com.pulumi.azure.cdn.outputs.EndpointDeliveryRuleUrlRewriteAction;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointDeliveryRule {
    /**
     * @return A `cache_expiration_action` block as defined above.
     * 
     */
    private final @Nullable EndpointDeliveryRuleCacheExpirationAction cacheExpirationAction;
    /**
     * @return A `cache_key_query_string_action` block as defined above.
     * 
     */
    private final @Nullable EndpointDeliveryRuleCacheKeyQueryStringAction cacheKeyQueryStringAction;
    /**
     * @return A `cookies_condition` block as defined above.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleCookiesCondition> cookiesConditions;
    /**
     * @return A `device_condition` block as defined below.
     * 
     */
    private final @Nullable EndpointDeliveryRuleDeviceCondition deviceCondition;
    /**
     * @return A `http_version_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleHttpVersionCondition> httpVersionConditions;
    /**
     * @return A `modify_request_header_action` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleModifyRequestHeaderAction> modifyRequestHeaderActions;
    /**
     * @return A `modify_response_header_action` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleModifyResponseHeaderAction> modifyResponseHeaderActions;
    /**
     * @return The Name which should be used for this Delivery Rule.
     * 
     */
    private final String name;
    /**
     * @return The order used for this rule. The order values should be sequential and begin at `1`.
     * 
     */
    private final Integer order;
    /**
     * @return A `post_arg_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRulePostArgCondition> postArgConditions;
    /**
     * @return A `query_string_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleQueryStringCondition> queryStringConditions;
    /**
     * @return A `remote_address_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleRemoteAddressCondition> remoteAddressConditions;
    /**
     * @return A `request_body_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleRequestBodyCondition> requestBodyConditions;
    /**
     * @return A `request_header_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleRequestHeaderCondition> requestHeaderConditions;
    /**
     * @return A `request_method_condition` block as defined below.
     * 
     */
    private final @Nullable EndpointDeliveryRuleRequestMethodCondition requestMethodCondition;
    /**
     * @return A `request_scheme_condition` block as defined below.
     * 
     */
    private final @Nullable EndpointDeliveryRuleRequestSchemeCondition requestSchemeCondition;
    /**
     * @return A `request_uri_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleRequestUriCondition> requestUriConditions;
    /**
     * @return A `url_file_extension_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleUrlFileExtensionCondition> urlFileExtensionConditions;
    /**
     * @return A `url_file_name_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleUrlFileNameCondition> urlFileNameConditions;
    /**
     * @return A `url_path_condition` block as defined below.
     * 
     */
    private final @Nullable List<EndpointDeliveryRuleUrlPathCondition> urlPathConditions;
    /**
     * @return A `url_redirect_action` block as defined below.
     * 
     */
    private final @Nullable EndpointDeliveryRuleUrlRedirectAction urlRedirectAction;
    /**
     * @return A `url_rewrite_action` block as defined below.
     * 
     */
    private final @Nullable EndpointDeliveryRuleUrlRewriteAction urlRewriteAction;

    @CustomType.Constructor
    private EndpointDeliveryRule(
        @CustomType.Parameter("cacheExpirationAction") @Nullable EndpointDeliveryRuleCacheExpirationAction cacheExpirationAction,
        @CustomType.Parameter("cacheKeyQueryStringAction") @Nullable EndpointDeliveryRuleCacheKeyQueryStringAction cacheKeyQueryStringAction,
        @CustomType.Parameter("cookiesConditions") @Nullable List<EndpointDeliveryRuleCookiesCondition> cookiesConditions,
        @CustomType.Parameter("deviceCondition") @Nullable EndpointDeliveryRuleDeviceCondition deviceCondition,
        @CustomType.Parameter("httpVersionConditions") @Nullable List<EndpointDeliveryRuleHttpVersionCondition> httpVersionConditions,
        @CustomType.Parameter("modifyRequestHeaderActions") @Nullable List<EndpointDeliveryRuleModifyRequestHeaderAction> modifyRequestHeaderActions,
        @CustomType.Parameter("modifyResponseHeaderActions") @Nullable List<EndpointDeliveryRuleModifyResponseHeaderAction> modifyResponseHeaderActions,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("order") Integer order,
        @CustomType.Parameter("postArgConditions") @Nullable List<EndpointDeliveryRulePostArgCondition> postArgConditions,
        @CustomType.Parameter("queryStringConditions") @Nullable List<EndpointDeliveryRuleQueryStringCondition> queryStringConditions,
        @CustomType.Parameter("remoteAddressConditions") @Nullable List<EndpointDeliveryRuleRemoteAddressCondition> remoteAddressConditions,
        @CustomType.Parameter("requestBodyConditions") @Nullable List<EndpointDeliveryRuleRequestBodyCondition> requestBodyConditions,
        @CustomType.Parameter("requestHeaderConditions") @Nullable List<EndpointDeliveryRuleRequestHeaderCondition> requestHeaderConditions,
        @CustomType.Parameter("requestMethodCondition") @Nullable EndpointDeliveryRuleRequestMethodCondition requestMethodCondition,
        @CustomType.Parameter("requestSchemeCondition") @Nullable EndpointDeliveryRuleRequestSchemeCondition requestSchemeCondition,
        @CustomType.Parameter("requestUriConditions") @Nullable List<EndpointDeliveryRuleRequestUriCondition> requestUriConditions,
        @CustomType.Parameter("urlFileExtensionConditions") @Nullable List<EndpointDeliveryRuleUrlFileExtensionCondition> urlFileExtensionConditions,
        @CustomType.Parameter("urlFileNameConditions") @Nullable List<EndpointDeliveryRuleUrlFileNameCondition> urlFileNameConditions,
        @CustomType.Parameter("urlPathConditions") @Nullable List<EndpointDeliveryRuleUrlPathCondition> urlPathConditions,
        @CustomType.Parameter("urlRedirectAction") @Nullable EndpointDeliveryRuleUrlRedirectAction urlRedirectAction,
        @CustomType.Parameter("urlRewriteAction") @Nullable EndpointDeliveryRuleUrlRewriteAction urlRewriteAction) {
        this.cacheExpirationAction = cacheExpirationAction;
        this.cacheKeyQueryStringAction = cacheKeyQueryStringAction;
        this.cookiesConditions = cookiesConditions;
        this.deviceCondition = deviceCondition;
        this.httpVersionConditions = httpVersionConditions;
        this.modifyRequestHeaderActions = modifyRequestHeaderActions;
        this.modifyResponseHeaderActions = modifyResponseHeaderActions;
        this.name = name;
        this.order = order;
        this.postArgConditions = postArgConditions;
        this.queryStringConditions = queryStringConditions;
        this.remoteAddressConditions = remoteAddressConditions;
        this.requestBodyConditions = requestBodyConditions;
        this.requestHeaderConditions = requestHeaderConditions;
        this.requestMethodCondition = requestMethodCondition;
        this.requestSchemeCondition = requestSchemeCondition;
        this.requestUriConditions = requestUriConditions;
        this.urlFileExtensionConditions = urlFileExtensionConditions;
        this.urlFileNameConditions = urlFileNameConditions;
        this.urlPathConditions = urlPathConditions;
        this.urlRedirectAction = urlRedirectAction;
        this.urlRewriteAction = urlRewriteAction;
    }

    /**
     * @return A `cache_expiration_action` block as defined above.
     * 
     */
    public Optional<EndpointDeliveryRuleCacheExpirationAction> cacheExpirationAction() {
        return Optional.ofNullable(this.cacheExpirationAction);
    }
    /**
     * @return A `cache_key_query_string_action` block as defined above.
     * 
     */
    public Optional<EndpointDeliveryRuleCacheKeyQueryStringAction> cacheKeyQueryStringAction() {
        return Optional.ofNullable(this.cacheKeyQueryStringAction);
    }
    /**
     * @return A `cookies_condition` block as defined above.
     * 
     */
    public List<EndpointDeliveryRuleCookiesCondition> cookiesConditions() {
        return this.cookiesConditions == null ? List.of() : this.cookiesConditions;
    }
    /**
     * @return A `device_condition` block as defined below.
     * 
     */
    public Optional<EndpointDeliveryRuleDeviceCondition> deviceCondition() {
        return Optional.ofNullable(this.deviceCondition);
    }
    /**
     * @return A `http_version_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleHttpVersionCondition> httpVersionConditions() {
        return this.httpVersionConditions == null ? List.of() : this.httpVersionConditions;
    }
    /**
     * @return A `modify_request_header_action` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleModifyRequestHeaderAction> modifyRequestHeaderActions() {
        return this.modifyRequestHeaderActions == null ? List.of() : this.modifyRequestHeaderActions;
    }
    /**
     * @return A `modify_response_header_action` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleModifyResponseHeaderAction> modifyResponseHeaderActions() {
        return this.modifyResponseHeaderActions == null ? List.of() : this.modifyResponseHeaderActions;
    }
    /**
     * @return The Name which should be used for this Delivery Rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The order used for this rule. The order values should be sequential and begin at `1`.
     * 
     */
    public Integer order() {
        return this.order;
    }
    /**
     * @return A `post_arg_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRulePostArgCondition> postArgConditions() {
        return this.postArgConditions == null ? List.of() : this.postArgConditions;
    }
    /**
     * @return A `query_string_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleQueryStringCondition> queryStringConditions() {
        return this.queryStringConditions == null ? List.of() : this.queryStringConditions;
    }
    /**
     * @return A `remote_address_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleRemoteAddressCondition> remoteAddressConditions() {
        return this.remoteAddressConditions == null ? List.of() : this.remoteAddressConditions;
    }
    /**
     * @return A `request_body_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleRequestBodyCondition> requestBodyConditions() {
        return this.requestBodyConditions == null ? List.of() : this.requestBodyConditions;
    }
    /**
     * @return A `request_header_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleRequestHeaderCondition> requestHeaderConditions() {
        return this.requestHeaderConditions == null ? List.of() : this.requestHeaderConditions;
    }
    /**
     * @return A `request_method_condition` block as defined below.
     * 
     */
    public Optional<EndpointDeliveryRuleRequestMethodCondition> requestMethodCondition() {
        return Optional.ofNullable(this.requestMethodCondition);
    }
    /**
     * @return A `request_scheme_condition` block as defined below.
     * 
     */
    public Optional<EndpointDeliveryRuleRequestSchemeCondition> requestSchemeCondition() {
        return Optional.ofNullable(this.requestSchemeCondition);
    }
    /**
     * @return A `request_uri_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleRequestUriCondition> requestUriConditions() {
        return this.requestUriConditions == null ? List.of() : this.requestUriConditions;
    }
    /**
     * @return A `url_file_extension_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleUrlFileExtensionCondition> urlFileExtensionConditions() {
        return this.urlFileExtensionConditions == null ? List.of() : this.urlFileExtensionConditions;
    }
    /**
     * @return A `url_file_name_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleUrlFileNameCondition> urlFileNameConditions() {
        return this.urlFileNameConditions == null ? List.of() : this.urlFileNameConditions;
    }
    /**
     * @return A `url_path_condition` block as defined below.
     * 
     */
    public List<EndpointDeliveryRuleUrlPathCondition> urlPathConditions() {
        return this.urlPathConditions == null ? List.of() : this.urlPathConditions;
    }
    /**
     * @return A `url_redirect_action` block as defined below.
     * 
     */
    public Optional<EndpointDeliveryRuleUrlRedirectAction> urlRedirectAction() {
        return Optional.ofNullable(this.urlRedirectAction);
    }
    /**
     * @return A `url_rewrite_action` block as defined below.
     * 
     */
    public Optional<EndpointDeliveryRuleUrlRewriteAction> urlRewriteAction() {
        return Optional.ofNullable(this.urlRewriteAction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeliveryRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EndpointDeliveryRuleCacheExpirationAction cacheExpirationAction;
        private @Nullable EndpointDeliveryRuleCacheKeyQueryStringAction cacheKeyQueryStringAction;
        private @Nullable List<EndpointDeliveryRuleCookiesCondition> cookiesConditions;
        private @Nullable EndpointDeliveryRuleDeviceCondition deviceCondition;
        private @Nullable List<EndpointDeliveryRuleHttpVersionCondition> httpVersionConditions;
        private @Nullable List<EndpointDeliveryRuleModifyRequestHeaderAction> modifyRequestHeaderActions;
        private @Nullable List<EndpointDeliveryRuleModifyResponseHeaderAction> modifyResponseHeaderActions;
        private String name;
        private Integer order;
        private @Nullable List<EndpointDeliveryRulePostArgCondition> postArgConditions;
        private @Nullable List<EndpointDeliveryRuleQueryStringCondition> queryStringConditions;
        private @Nullable List<EndpointDeliveryRuleRemoteAddressCondition> remoteAddressConditions;
        private @Nullable List<EndpointDeliveryRuleRequestBodyCondition> requestBodyConditions;
        private @Nullable List<EndpointDeliveryRuleRequestHeaderCondition> requestHeaderConditions;
        private @Nullable EndpointDeliveryRuleRequestMethodCondition requestMethodCondition;
        private @Nullable EndpointDeliveryRuleRequestSchemeCondition requestSchemeCondition;
        private @Nullable List<EndpointDeliveryRuleRequestUriCondition> requestUriConditions;
        private @Nullable List<EndpointDeliveryRuleUrlFileExtensionCondition> urlFileExtensionConditions;
        private @Nullable List<EndpointDeliveryRuleUrlFileNameCondition> urlFileNameConditions;
        private @Nullable List<EndpointDeliveryRuleUrlPathCondition> urlPathConditions;
        private @Nullable EndpointDeliveryRuleUrlRedirectAction urlRedirectAction;
        private @Nullable EndpointDeliveryRuleUrlRewriteAction urlRewriteAction;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeliveryRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheExpirationAction = defaults.cacheExpirationAction;
    	      this.cacheKeyQueryStringAction = defaults.cacheKeyQueryStringAction;
    	      this.cookiesConditions = defaults.cookiesConditions;
    	      this.deviceCondition = defaults.deviceCondition;
    	      this.httpVersionConditions = defaults.httpVersionConditions;
    	      this.modifyRequestHeaderActions = defaults.modifyRequestHeaderActions;
    	      this.modifyResponseHeaderActions = defaults.modifyResponseHeaderActions;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.postArgConditions = defaults.postArgConditions;
    	      this.queryStringConditions = defaults.queryStringConditions;
    	      this.remoteAddressConditions = defaults.remoteAddressConditions;
    	      this.requestBodyConditions = defaults.requestBodyConditions;
    	      this.requestHeaderConditions = defaults.requestHeaderConditions;
    	      this.requestMethodCondition = defaults.requestMethodCondition;
    	      this.requestSchemeCondition = defaults.requestSchemeCondition;
    	      this.requestUriConditions = defaults.requestUriConditions;
    	      this.urlFileExtensionConditions = defaults.urlFileExtensionConditions;
    	      this.urlFileNameConditions = defaults.urlFileNameConditions;
    	      this.urlPathConditions = defaults.urlPathConditions;
    	      this.urlRedirectAction = defaults.urlRedirectAction;
    	      this.urlRewriteAction = defaults.urlRewriteAction;
        }

        public Builder cacheExpirationAction(@Nullable EndpointDeliveryRuleCacheExpirationAction cacheExpirationAction) {
            this.cacheExpirationAction = cacheExpirationAction;
            return this;
        }
        public Builder cacheKeyQueryStringAction(@Nullable EndpointDeliveryRuleCacheKeyQueryStringAction cacheKeyQueryStringAction) {
            this.cacheKeyQueryStringAction = cacheKeyQueryStringAction;
            return this;
        }
        public Builder cookiesConditions(@Nullable List<EndpointDeliveryRuleCookiesCondition> cookiesConditions) {
            this.cookiesConditions = cookiesConditions;
            return this;
        }
        public Builder cookiesConditions(EndpointDeliveryRuleCookiesCondition... cookiesConditions) {
            return cookiesConditions(List.of(cookiesConditions));
        }
        public Builder deviceCondition(@Nullable EndpointDeliveryRuleDeviceCondition deviceCondition) {
            this.deviceCondition = deviceCondition;
            return this;
        }
        public Builder httpVersionConditions(@Nullable List<EndpointDeliveryRuleHttpVersionCondition> httpVersionConditions) {
            this.httpVersionConditions = httpVersionConditions;
            return this;
        }
        public Builder httpVersionConditions(EndpointDeliveryRuleHttpVersionCondition... httpVersionConditions) {
            return httpVersionConditions(List.of(httpVersionConditions));
        }
        public Builder modifyRequestHeaderActions(@Nullable List<EndpointDeliveryRuleModifyRequestHeaderAction> modifyRequestHeaderActions) {
            this.modifyRequestHeaderActions = modifyRequestHeaderActions;
            return this;
        }
        public Builder modifyRequestHeaderActions(EndpointDeliveryRuleModifyRequestHeaderAction... modifyRequestHeaderActions) {
            return modifyRequestHeaderActions(List.of(modifyRequestHeaderActions));
        }
        public Builder modifyResponseHeaderActions(@Nullable List<EndpointDeliveryRuleModifyResponseHeaderAction> modifyResponseHeaderActions) {
            this.modifyResponseHeaderActions = modifyResponseHeaderActions;
            return this;
        }
        public Builder modifyResponseHeaderActions(EndpointDeliveryRuleModifyResponseHeaderAction... modifyResponseHeaderActions) {
            return modifyResponseHeaderActions(List.of(modifyResponseHeaderActions));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public Builder postArgConditions(@Nullable List<EndpointDeliveryRulePostArgCondition> postArgConditions) {
            this.postArgConditions = postArgConditions;
            return this;
        }
        public Builder postArgConditions(EndpointDeliveryRulePostArgCondition... postArgConditions) {
            return postArgConditions(List.of(postArgConditions));
        }
        public Builder queryStringConditions(@Nullable List<EndpointDeliveryRuleQueryStringCondition> queryStringConditions) {
            this.queryStringConditions = queryStringConditions;
            return this;
        }
        public Builder queryStringConditions(EndpointDeliveryRuleQueryStringCondition... queryStringConditions) {
            return queryStringConditions(List.of(queryStringConditions));
        }
        public Builder remoteAddressConditions(@Nullable List<EndpointDeliveryRuleRemoteAddressCondition> remoteAddressConditions) {
            this.remoteAddressConditions = remoteAddressConditions;
            return this;
        }
        public Builder remoteAddressConditions(EndpointDeliveryRuleRemoteAddressCondition... remoteAddressConditions) {
            return remoteAddressConditions(List.of(remoteAddressConditions));
        }
        public Builder requestBodyConditions(@Nullable List<EndpointDeliveryRuleRequestBodyCondition> requestBodyConditions) {
            this.requestBodyConditions = requestBodyConditions;
            return this;
        }
        public Builder requestBodyConditions(EndpointDeliveryRuleRequestBodyCondition... requestBodyConditions) {
            return requestBodyConditions(List.of(requestBodyConditions));
        }
        public Builder requestHeaderConditions(@Nullable List<EndpointDeliveryRuleRequestHeaderCondition> requestHeaderConditions) {
            this.requestHeaderConditions = requestHeaderConditions;
            return this;
        }
        public Builder requestHeaderConditions(EndpointDeliveryRuleRequestHeaderCondition... requestHeaderConditions) {
            return requestHeaderConditions(List.of(requestHeaderConditions));
        }
        public Builder requestMethodCondition(@Nullable EndpointDeliveryRuleRequestMethodCondition requestMethodCondition) {
            this.requestMethodCondition = requestMethodCondition;
            return this;
        }
        public Builder requestSchemeCondition(@Nullable EndpointDeliveryRuleRequestSchemeCondition requestSchemeCondition) {
            this.requestSchemeCondition = requestSchemeCondition;
            return this;
        }
        public Builder requestUriConditions(@Nullable List<EndpointDeliveryRuleRequestUriCondition> requestUriConditions) {
            this.requestUriConditions = requestUriConditions;
            return this;
        }
        public Builder requestUriConditions(EndpointDeliveryRuleRequestUriCondition... requestUriConditions) {
            return requestUriConditions(List.of(requestUriConditions));
        }
        public Builder urlFileExtensionConditions(@Nullable List<EndpointDeliveryRuleUrlFileExtensionCondition> urlFileExtensionConditions) {
            this.urlFileExtensionConditions = urlFileExtensionConditions;
            return this;
        }
        public Builder urlFileExtensionConditions(EndpointDeliveryRuleUrlFileExtensionCondition... urlFileExtensionConditions) {
            return urlFileExtensionConditions(List.of(urlFileExtensionConditions));
        }
        public Builder urlFileNameConditions(@Nullable List<EndpointDeliveryRuleUrlFileNameCondition> urlFileNameConditions) {
            this.urlFileNameConditions = urlFileNameConditions;
            return this;
        }
        public Builder urlFileNameConditions(EndpointDeliveryRuleUrlFileNameCondition... urlFileNameConditions) {
            return urlFileNameConditions(List.of(urlFileNameConditions));
        }
        public Builder urlPathConditions(@Nullable List<EndpointDeliveryRuleUrlPathCondition> urlPathConditions) {
            this.urlPathConditions = urlPathConditions;
            return this;
        }
        public Builder urlPathConditions(EndpointDeliveryRuleUrlPathCondition... urlPathConditions) {
            return urlPathConditions(List.of(urlPathConditions));
        }
        public Builder urlRedirectAction(@Nullable EndpointDeliveryRuleUrlRedirectAction urlRedirectAction) {
            this.urlRedirectAction = urlRedirectAction;
            return this;
        }
        public Builder urlRewriteAction(@Nullable EndpointDeliveryRuleUrlRewriteAction urlRewriteAction) {
            this.urlRewriteAction = urlRewriteAction;
            return this;
        }        public EndpointDeliveryRule build() {
            return new EndpointDeliveryRule(cacheExpirationAction, cacheKeyQueryStringAction, cookiesConditions, deviceCondition, httpVersionConditions, modifyRequestHeaderActions, modifyResponseHeaderActions, name, order, postArgConditions, queryStringConditions, remoteAddressConditions, requestBodyConditions, requestHeaderConditions, requestMethodCondition, requestSchemeCondition, requestUriConditions, urlFileExtensionConditions, urlFileNameConditions, urlPathConditions, urlRedirectAction, urlRewriteAction);
        }
    }
}
