// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecSecurityPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecSecurityPolicyArgs Empty = new GetAppSecSecurityPolicyArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="securityPolicyName")
    private @Nullable Output<String> securityPolicyName;

    public Optional<Output<String>> securityPolicyName() {
        return Optional.ofNullable(this.securityPolicyName);
    }

    private GetAppSecSecurityPolicyArgs() {}

    private GetAppSecSecurityPolicyArgs(GetAppSecSecurityPolicyArgs $) {
        this.configId = $.configId;
        this.securityPolicyName = $.securityPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecSecurityPolicyArgs $;

        public Builder() {
            $ = new GetAppSecSecurityPolicyArgs();
        }

        public Builder(GetAppSecSecurityPolicyArgs defaults) {
            $ = new GetAppSecSecurityPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder securityPolicyName(@Nullable Output<String> securityPolicyName) {
            $.securityPolicyName = securityPolicyName;
            return this;
        }

        public Builder securityPolicyName(String securityPolicyName) {
            return securityPolicyName(Output.of(securityPolicyName));
        }

        public GetAppSecSecurityPolicyArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetAppSecSecurityPolicyArgs", "configId");
            }
            return $;
        }
    }

}
