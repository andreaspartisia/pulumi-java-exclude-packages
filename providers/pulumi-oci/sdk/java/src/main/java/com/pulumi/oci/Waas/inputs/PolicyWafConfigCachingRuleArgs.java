// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Waas.inputs.PolicyWafConfigCachingRuleCriteriaArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyWafConfigCachingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyWafConfigCachingRuleArgs Empty = new PolicyWafConfigCachingRuleArgs();

    /**
     * (Updatable) The action to take against requests from detected bots. If unspecified, defaults to `DETECT`.
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return (Updatable) The action to take against requests from detected bots. If unspecified, defaults to `DETECT`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * (Updatable) The duration to cache content for the caching rule, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`. Example: `PT1H`
     * 
     */
    @Import(name="cachingDuration")
    private @Nullable Output<String> cachingDuration;

    /**
     * @return (Updatable) The duration to cache content for the caching rule, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`. Example: `PT1H`
     * 
     */
    public Optional<Output<String>> cachingDuration() {
        return Optional.ofNullable(this.cachingDuration);
    }

    /**
     * (Updatable) The duration to cache content in the user&#39;s browser, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`. Example: `PT1H`
     * 
     */
    @Import(name="clientCachingDuration")
    private @Nullable Output<String> clientCachingDuration;

    /**
     * @return (Updatable) The duration to cache content in the user&#39;s browser, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`. Example: `PT1H`
     * 
     */
    public Optional<Output<String>> clientCachingDuration() {
        return Optional.ofNullable(this.clientCachingDuration);
    }

    /**
     * (Updatable) When defined, the JavaScript Challenge would be applied only for the requests that matched all the listed conditions.
     * 
     */
    @Import(name="criterias", required=true)
    private Output<List<PolicyWafConfigCachingRuleCriteriaArgs>> criterias;

    /**
     * @return (Updatable) When defined, the JavaScript Challenge would be applied only for the requests that matched all the listed conditions.
     * 
     */
    public Output<List<PolicyWafConfigCachingRuleCriteriaArgs>> criterias() {
        return this.criterias;
    }

    /**
     * (Updatable) Enables or disables client caching. Browsers use the `Cache-Control` header value for caching content locally in the browser. This setting overrides the addition of a `Cache-Control` header in responses.
     * 
     */
    @Import(name="isClientCachingEnabled")
    private @Nullable Output<Boolean> isClientCachingEnabled;

    /**
     * @return (Updatable) Enables or disables client caching. Browsers use the `Cache-Control` header value for caching content locally in the browser. This setting overrides the addition of a `Cache-Control` header in responses.
     * 
     */
    public Optional<Output<Boolean>> isClientCachingEnabled() {
        return Optional.ofNullable(this.isClientCachingEnabled);
    }

    /**
     * (Updatable) The unique key for the caching rule.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return (Updatable) The unique key for the caching rule.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * (Updatable) The unique name of the whitelist.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return (Updatable) The unique name of the whitelist.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private PolicyWafConfigCachingRuleArgs() {}

    private PolicyWafConfigCachingRuleArgs(PolicyWafConfigCachingRuleArgs $) {
        this.action = $.action;
        this.cachingDuration = $.cachingDuration;
        this.clientCachingDuration = $.clientCachingDuration;
        this.criterias = $.criterias;
        this.isClientCachingEnabled = $.isClientCachingEnabled;
        this.key = $.key;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyWafConfigCachingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyWafConfigCachingRuleArgs $;

        public Builder() {
            $ = new PolicyWafConfigCachingRuleArgs();
        }

        public Builder(PolicyWafConfigCachingRuleArgs defaults) {
            $ = new PolicyWafConfigCachingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action (Updatable) The action to take against requests from detected bots. If unspecified, defaults to `DETECT`.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action (Updatable) The action to take against requests from detected bots. If unspecified, defaults to `DETECT`.
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param cachingDuration (Updatable) The duration to cache content for the caching rule, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`. Example: `PT1H`
         * 
         * @return builder
         * 
         */
        public Builder cachingDuration(@Nullable Output<String> cachingDuration) {
            $.cachingDuration = cachingDuration;
            return this;
        }

        /**
         * @param cachingDuration (Updatable) The duration to cache content for the caching rule, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`. Example: `PT1H`
         * 
         * @return builder
         * 
         */
        public Builder cachingDuration(String cachingDuration) {
            return cachingDuration(Output.of(cachingDuration));
        }

        /**
         * @param clientCachingDuration (Updatable) The duration to cache content in the user&#39;s browser, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`. Example: `PT1H`
         * 
         * @return builder
         * 
         */
        public Builder clientCachingDuration(@Nullable Output<String> clientCachingDuration) {
            $.clientCachingDuration = clientCachingDuration;
            return this;
        }

        /**
         * @param clientCachingDuration (Updatable) The duration to cache content in the user&#39;s browser, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`. Example: `PT1H`
         * 
         * @return builder
         * 
         */
        public Builder clientCachingDuration(String clientCachingDuration) {
            return clientCachingDuration(Output.of(clientCachingDuration));
        }

        /**
         * @param criterias (Updatable) When defined, the JavaScript Challenge would be applied only for the requests that matched all the listed conditions.
         * 
         * @return builder
         * 
         */
        public Builder criterias(Output<List<PolicyWafConfigCachingRuleCriteriaArgs>> criterias) {
            $.criterias = criterias;
            return this;
        }

        /**
         * @param criterias (Updatable) When defined, the JavaScript Challenge would be applied only for the requests that matched all the listed conditions.
         * 
         * @return builder
         * 
         */
        public Builder criterias(List<PolicyWafConfigCachingRuleCriteriaArgs> criterias) {
            return criterias(Output.of(criterias));
        }

        /**
         * @param criterias (Updatable) When defined, the JavaScript Challenge would be applied only for the requests that matched all the listed conditions.
         * 
         * @return builder
         * 
         */
        public Builder criterias(PolicyWafConfigCachingRuleCriteriaArgs... criterias) {
            return criterias(List.of(criterias));
        }

        /**
         * @param isClientCachingEnabled (Updatable) Enables or disables client caching. Browsers use the `Cache-Control` header value for caching content locally in the browser. This setting overrides the addition of a `Cache-Control` header in responses.
         * 
         * @return builder
         * 
         */
        public Builder isClientCachingEnabled(@Nullable Output<Boolean> isClientCachingEnabled) {
            $.isClientCachingEnabled = isClientCachingEnabled;
            return this;
        }

        /**
         * @param isClientCachingEnabled (Updatable) Enables or disables client caching. Browsers use the `Cache-Control` header value for caching content locally in the browser. This setting overrides the addition of a `Cache-Control` header in responses.
         * 
         * @return builder
         * 
         */
        public Builder isClientCachingEnabled(Boolean isClientCachingEnabled) {
            return isClientCachingEnabled(Output.of(isClientCachingEnabled));
        }

        /**
         * @param key (Updatable) The unique key for the caching rule.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key (Updatable) The unique key for the caching rule.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param name (Updatable) The unique name of the whitelist.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Updatable) The unique name of the whitelist.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PolicyWafConfigCachingRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.criterias = Objects.requireNonNull($.criterias, "expected parameter 'criterias' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
