// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetWaasPoliciesWaasPolicyWafConfigProtectionSetting {
    /**
     * @return The list of allowed HTTP methods. If unspecified, default to `[OPTIONS, GET, HEAD, POST]`. This setting only applies if a corresponding protection rule is enabled, such as the &#34;Restrict HTTP Request Methods&#34; rule (key: 911100).
     * 
     */
    private final List<String> allowedHttpMethods;
    /**
     * @return If `action` is set to `BLOCK`, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to `SET_RESPONSE_CODE`.
     * 
     */
    private final String blockAction;
    /**
     * @return The error code to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`.
     * 
     */
    private final String blockErrorPageCode;
    /**
     * @return The description text to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `Access blocked by website owner. Please contact support.`
     * 
     */
    private final String blockErrorPageDescription;
    /**
     * @return The message to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to &#39;Access to the website is blocked.&#39;
     * 
     */
    private final String blockErrorPageMessage;
    /**
     * @return The response code returned when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`. The list of available response codes: `400`, `401`, `403`, `405`, `409`, `411`, `412`, `413`, `414`, `415`, `416`, `500`, `501`, `502`, `503`, `504`, `507`.
     * 
     */
    private final Integer blockResponseCode;
    /**
     * @return Inspects the response body of origin responses. Can be used to detect leakage of sensitive data. If unspecified, defaults to `false`.
     * 
     */
    private final Boolean isResponseInspected;
    /**
     * @return The maximum number of arguments allowed to be passed to your application before an action is taken. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to `255`. This setting only applies if a corresponding protection rule is enabled, such as the &#34;Number of Arguments Limits&#34; rule (key: 960335).  Example: If `maxArgumentCount` to `2` for the Max Number of Arguments protection rule (key: 960335), the following requests would be blocked: `GET /myapp/path?query=one&amp;query=two&amp;query=three` `POST /myapp/path` with Body `{&#34;argument1&#34;:&#34;one&#34;,&#34;argument2&#34;:&#34;two&#34;,&#34;argument3&#34;:&#34;three&#34;}`
     * 
     */
    private final Integer maxArgumentCount;
    /**
     * @return The maximum length allowed for each argument name, in characters. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to `400`. This setting only applies if a corresponding protection rule is enabled, such as the &#34;Values Limits&#34; rule (key: 960208).
     * 
     */
    private final Integer maxNameLengthPerArgument;
    /**
     * @return The maximum response size to be fully inspected, in binary kilobytes (KiB). Anything over this limit will be partially inspected. If unspecified, defaults to `1024`.
     * 
     */
    private final Integer maxResponseSizeInKiB;
    /**
     * @return The maximum length allowed for the sum of the argument name and value, in characters. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to `64000`. This setting only applies if a corresponding protection rule is enabled, such as the &#34;Total Arguments Limits&#34; rule (key: 960341).
     * 
     */
    private final Integer maxTotalNameLengthOfArguments;
    /**
     * @return The list of media types to allow for inspection, if `isResponseInspected` is enabled. Only responses with MIME types in this list will be inspected. If unspecified, defaults to `[&#34;text/html&#34;, &#34;text/plain&#34;, &#34;text/xml&#34;]`.
     * 
     */
    private final List<String> mediaTypes;
    /**
     * @return The length of time to analyze traffic traffic, in days. After the analysis period, `WafRecommendations` will be populated. If unspecified, defaults to `10`.
     * 
     */
    private final Integer recommendationsPeriodInDays;

    @CustomType.Constructor
    private GetWaasPoliciesWaasPolicyWafConfigProtectionSetting(
        @CustomType.Parameter("allowedHttpMethods") List<String> allowedHttpMethods,
        @CustomType.Parameter("blockAction") String blockAction,
        @CustomType.Parameter("blockErrorPageCode") String blockErrorPageCode,
        @CustomType.Parameter("blockErrorPageDescription") String blockErrorPageDescription,
        @CustomType.Parameter("blockErrorPageMessage") String blockErrorPageMessage,
        @CustomType.Parameter("blockResponseCode") Integer blockResponseCode,
        @CustomType.Parameter("isResponseInspected") Boolean isResponseInspected,
        @CustomType.Parameter("maxArgumentCount") Integer maxArgumentCount,
        @CustomType.Parameter("maxNameLengthPerArgument") Integer maxNameLengthPerArgument,
        @CustomType.Parameter("maxResponseSizeInKiB") Integer maxResponseSizeInKiB,
        @CustomType.Parameter("maxTotalNameLengthOfArguments") Integer maxTotalNameLengthOfArguments,
        @CustomType.Parameter("mediaTypes") List<String> mediaTypes,
        @CustomType.Parameter("recommendationsPeriodInDays") Integer recommendationsPeriodInDays) {
        this.allowedHttpMethods = allowedHttpMethods;
        this.blockAction = blockAction;
        this.blockErrorPageCode = blockErrorPageCode;
        this.blockErrorPageDescription = blockErrorPageDescription;
        this.blockErrorPageMessage = blockErrorPageMessage;
        this.blockResponseCode = blockResponseCode;
        this.isResponseInspected = isResponseInspected;
        this.maxArgumentCount = maxArgumentCount;
        this.maxNameLengthPerArgument = maxNameLengthPerArgument;
        this.maxResponseSizeInKiB = maxResponseSizeInKiB;
        this.maxTotalNameLengthOfArguments = maxTotalNameLengthOfArguments;
        this.mediaTypes = mediaTypes;
        this.recommendationsPeriodInDays = recommendationsPeriodInDays;
    }

    /**
     * @return The list of allowed HTTP methods. If unspecified, default to `[OPTIONS, GET, HEAD, POST]`. This setting only applies if a corresponding protection rule is enabled, such as the &#34;Restrict HTTP Request Methods&#34; rule (key: 911100).
     * 
     */
    public List<String> allowedHttpMethods() {
        return this.allowedHttpMethods;
    }
    /**
     * @return If `action` is set to `BLOCK`, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to `SET_RESPONSE_CODE`.
     * 
     */
    public String blockAction() {
        return this.blockAction;
    }
    /**
     * @return The error code to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`.
     * 
     */
    public String blockErrorPageCode() {
        return this.blockErrorPageCode;
    }
    /**
     * @return The description text to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `Access blocked by website owner. Please contact support.`
     * 
     */
    public String blockErrorPageDescription() {
        return this.blockErrorPageDescription;
    }
    /**
     * @return The message to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to &#39;Access to the website is blocked.&#39;
     * 
     */
    public String blockErrorPageMessage() {
        return this.blockErrorPageMessage;
    }
    /**
     * @return The response code returned when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`. The list of available response codes: `400`, `401`, `403`, `405`, `409`, `411`, `412`, `413`, `414`, `415`, `416`, `500`, `501`, `502`, `503`, `504`, `507`.
     * 
     */
    public Integer blockResponseCode() {
        return this.blockResponseCode;
    }
    /**
     * @return Inspects the response body of origin responses. Can be used to detect leakage of sensitive data. If unspecified, defaults to `false`.
     * 
     */
    public Boolean isResponseInspected() {
        return this.isResponseInspected;
    }
    /**
     * @return The maximum number of arguments allowed to be passed to your application before an action is taken. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to `255`. This setting only applies if a corresponding protection rule is enabled, such as the &#34;Number of Arguments Limits&#34; rule (key: 960335).  Example: If `maxArgumentCount` to `2` for the Max Number of Arguments protection rule (key: 960335), the following requests would be blocked: `GET /myapp/path?query=one&amp;query=two&amp;query=three` `POST /myapp/path` with Body `{&#34;argument1&#34;:&#34;one&#34;,&#34;argument2&#34;:&#34;two&#34;,&#34;argument3&#34;:&#34;three&#34;}`
     * 
     */
    public Integer maxArgumentCount() {
        return this.maxArgumentCount;
    }
    /**
     * @return The maximum length allowed for each argument name, in characters. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to `400`. This setting only applies if a corresponding protection rule is enabled, such as the &#34;Values Limits&#34; rule (key: 960208).
     * 
     */
    public Integer maxNameLengthPerArgument() {
        return this.maxNameLengthPerArgument;
    }
    /**
     * @return The maximum response size to be fully inspected, in binary kilobytes (KiB). Anything over this limit will be partially inspected. If unspecified, defaults to `1024`.
     * 
     */
    public Integer maxResponseSizeInKiB() {
        return this.maxResponseSizeInKiB;
    }
    /**
     * @return The maximum length allowed for the sum of the argument name and value, in characters. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to `64000`. This setting only applies if a corresponding protection rule is enabled, such as the &#34;Total Arguments Limits&#34; rule (key: 960341).
     * 
     */
    public Integer maxTotalNameLengthOfArguments() {
        return this.maxTotalNameLengthOfArguments;
    }
    /**
     * @return The list of media types to allow for inspection, if `isResponseInspected` is enabled. Only responses with MIME types in this list will be inspected. If unspecified, defaults to `[&#34;text/html&#34;, &#34;text/plain&#34;, &#34;text/xml&#34;]`.
     * 
     */
    public List<String> mediaTypes() {
        return this.mediaTypes;
    }
    /**
     * @return The length of time to analyze traffic traffic, in days. After the analysis period, `WafRecommendations` will be populated. If unspecified, defaults to `10`.
     * 
     */
    public Integer recommendationsPeriodInDays() {
        return this.recommendationsPeriodInDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWaasPoliciesWaasPolicyWafConfigProtectionSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedHttpMethods;
        private String blockAction;
        private String blockErrorPageCode;
        private String blockErrorPageDescription;
        private String blockErrorPageMessage;
        private Integer blockResponseCode;
        private Boolean isResponseInspected;
        private Integer maxArgumentCount;
        private Integer maxNameLengthPerArgument;
        private Integer maxResponseSizeInKiB;
        private Integer maxTotalNameLengthOfArguments;
        private List<String> mediaTypes;
        private Integer recommendationsPeriodInDays;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWaasPoliciesWaasPolicyWafConfigProtectionSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHttpMethods = defaults.allowedHttpMethods;
    	      this.blockAction = defaults.blockAction;
    	      this.blockErrorPageCode = defaults.blockErrorPageCode;
    	      this.blockErrorPageDescription = defaults.blockErrorPageDescription;
    	      this.blockErrorPageMessage = defaults.blockErrorPageMessage;
    	      this.blockResponseCode = defaults.blockResponseCode;
    	      this.isResponseInspected = defaults.isResponseInspected;
    	      this.maxArgumentCount = defaults.maxArgumentCount;
    	      this.maxNameLengthPerArgument = defaults.maxNameLengthPerArgument;
    	      this.maxResponseSizeInKiB = defaults.maxResponseSizeInKiB;
    	      this.maxTotalNameLengthOfArguments = defaults.maxTotalNameLengthOfArguments;
    	      this.mediaTypes = defaults.mediaTypes;
    	      this.recommendationsPeriodInDays = defaults.recommendationsPeriodInDays;
        }

        public Builder allowedHttpMethods(List<String> allowedHttpMethods) {
            this.allowedHttpMethods = Objects.requireNonNull(allowedHttpMethods);
            return this;
        }
        public Builder allowedHttpMethods(String... allowedHttpMethods) {
            return allowedHttpMethods(List.of(allowedHttpMethods));
        }
        public Builder blockAction(String blockAction) {
            this.blockAction = Objects.requireNonNull(blockAction);
            return this;
        }
        public Builder blockErrorPageCode(String blockErrorPageCode) {
            this.blockErrorPageCode = Objects.requireNonNull(blockErrorPageCode);
            return this;
        }
        public Builder blockErrorPageDescription(String blockErrorPageDescription) {
            this.blockErrorPageDescription = Objects.requireNonNull(blockErrorPageDescription);
            return this;
        }
        public Builder blockErrorPageMessage(String blockErrorPageMessage) {
            this.blockErrorPageMessage = Objects.requireNonNull(blockErrorPageMessage);
            return this;
        }
        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = Objects.requireNonNull(blockResponseCode);
            return this;
        }
        public Builder isResponseInspected(Boolean isResponseInspected) {
            this.isResponseInspected = Objects.requireNonNull(isResponseInspected);
            return this;
        }
        public Builder maxArgumentCount(Integer maxArgumentCount) {
            this.maxArgumentCount = Objects.requireNonNull(maxArgumentCount);
            return this;
        }
        public Builder maxNameLengthPerArgument(Integer maxNameLengthPerArgument) {
            this.maxNameLengthPerArgument = Objects.requireNonNull(maxNameLengthPerArgument);
            return this;
        }
        public Builder maxResponseSizeInKiB(Integer maxResponseSizeInKiB) {
            this.maxResponseSizeInKiB = Objects.requireNonNull(maxResponseSizeInKiB);
            return this;
        }
        public Builder maxTotalNameLengthOfArguments(Integer maxTotalNameLengthOfArguments) {
            this.maxTotalNameLengthOfArguments = Objects.requireNonNull(maxTotalNameLengthOfArguments);
            return this;
        }
        public Builder mediaTypes(List<String> mediaTypes) {
            this.mediaTypes = Objects.requireNonNull(mediaTypes);
            return this;
        }
        public Builder mediaTypes(String... mediaTypes) {
            return mediaTypes(List.of(mediaTypes));
        }
        public Builder recommendationsPeriodInDays(Integer recommendationsPeriodInDays) {
            this.recommendationsPeriodInDays = Objects.requireNonNull(recommendationsPeriodInDays);
            return this;
        }        public GetWaasPoliciesWaasPolicyWafConfigProtectionSetting build() {
            return new GetWaasPoliciesWaasPolicyWafConfigProtectionSetting(allowedHttpMethods, blockAction, blockErrorPageCode, blockErrorPageDescription, blockErrorPageMessage, blockResponseCode, isResponseInspected, maxArgumentCount, maxNameLengthPerArgument, maxResponseSizeInKiB, maxTotalNameLengthOfArguments, mediaTypes, recommendationsPeriodInDays);
        }
    }
}
