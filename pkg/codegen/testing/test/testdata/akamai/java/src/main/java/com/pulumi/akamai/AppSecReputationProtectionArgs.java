// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AppSecReputationProtectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSecReputationProtectionArgs Empty = new AppSecReputationProtectionArgs();

    /**
     * Unique identifier of the security configuration
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * Whether to enable reputation protection
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether to enable reputation protection
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Unique identifier of the security policy
     * 
     */
    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private AppSecReputationProtectionArgs() {}

    private AppSecReputationProtectionArgs(AppSecReputationProtectionArgs $) {
        this.configId = $.configId;
        this.enabled = $.enabled;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecReputationProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecReputationProtectionArgs $;

        public Builder() {
            $ = new AppSecReputationProtectionArgs();
        }

        public Builder(AppSecReputationProtectionArgs defaults) {
            $ = new AppSecReputationProtectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId Unique identifier of the security configuration
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param enabled Whether to enable reputation protection
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable reputation protection
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * @param securityPolicyId Unique identifier of the security policy
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public AppSecReputationProtectionArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("AppSecReputationProtectionArgs", "configId");
            }
            if ($.enabled == null) {
                throw new MissingRequiredPropertyException("AppSecReputationProtectionArgs", "enabled");
            }
            if ($.securityPolicyId == null) {
                throw new MissingRequiredPropertyException("AppSecReputationProtectionArgs", "securityPolicyId");
            }
            return $;
        }
    }

}
