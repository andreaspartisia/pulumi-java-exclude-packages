// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetBotmanJavascriptInjectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanJavascriptInjectionPlainArgs Empty = new GetBotmanJavascriptInjectionPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="securityPolicyId", required=true)
    private String securityPolicyId;

    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetBotmanJavascriptInjectionPlainArgs() {}

    private GetBotmanJavascriptInjectionPlainArgs(GetBotmanJavascriptInjectionPlainArgs $) {
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanJavascriptInjectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanJavascriptInjectionPlainArgs $;

        public Builder() {
            $ = new GetBotmanJavascriptInjectionPlainArgs();
        }

        public Builder(GetBotmanJavascriptInjectionPlainArgs defaults) {
            $ = new GetBotmanJavascriptInjectionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetBotmanJavascriptInjectionPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetBotmanJavascriptInjectionPlainArgs", "configId");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("GetBotmanJavascriptInjectionPlainArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
