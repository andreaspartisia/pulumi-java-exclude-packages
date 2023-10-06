// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetAppSecThreatIntelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecThreatIntelPlainArgs Empty = new GetAppSecThreatIntelPlainArgs();

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

    private GetAppSecThreatIntelPlainArgs() {}

    private GetAppSecThreatIntelPlainArgs(GetAppSecThreatIntelPlainArgs $) {
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecThreatIntelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecThreatIntelPlainArgs $;

        public Builder() {
            $ = new GetAppSecThreatIntelPlainArgs();
        }

        public Builder(GetAppSecThreatIntelPlainArgs defaults) {
            $ = new GetAppSecThreatIntelPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetAppSecThreatIntelPlainArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecThreatIntelPlainArgs", "configId");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("GetAppSecThreatIntelPlainArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
