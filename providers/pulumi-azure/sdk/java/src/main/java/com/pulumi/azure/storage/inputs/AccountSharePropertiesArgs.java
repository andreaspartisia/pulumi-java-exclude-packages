// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.storage.inputs;

import com.pulumi.azure.storage.inputs.AccountSharePropertiesCorsRuleArgs;
import com.pulumi.azure.storage.inputs.AccountSharePropertiesRetentionPolicyArgs;
import com.pulumi.azure.storage.inputs.AccountSharePropertiesSmbArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountSharePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountSharePropertiesArgs Empty = new AccountSharePropertiesArgs();

    /**
     * A `cors_rule` block as defined below.
     * 
     */
    @Import(name="corsRules")
    private @Nullable Output<List<AccountSharePropertiesCorsRuleArgs>> corsRules;

    /**
     * @return A `cors_rule` block as defined below.
     * 
     */
    public Optional<Output<List<AccountSharePropertiesCorsRuleArgs>>> corsRules() {
        return Optional.ofNullable(this.corsRules);
    }

    /**
     * A `retention_policy` block as defined below.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<AccountSharePropertiesRetentionPolicyArgs> retentionPolicy;

    /**
     * @return A `retention_policy` block as defined below.
     * 
     */
    public Optional<Output<AccountSharePropertiesRetentionPolicyArgs>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * A `smb` block as defined below.
     * 
     */
    @Import(name="smb")
    private @Nullable Output<AccountSharePropertiesSmbArgs> smb;

    /**
     * @return A `smb` block as defined below.
     * 
     */
    public Optional<Output<AccountSharePropertiesSmbArgs>> smb() {
        return Optional.ofNullable(this.smb);
    }

    private AccountSharePropertiesArgs() {}

    private AccountSharePropertiesArgs(AccountSharePropertiesArgs $) {
        this.corsRules = $.corsRules;
        this.retentionPolicy = $.retentionPolicy;
        this.smb = $.smb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountSharePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountSharePropertiesArgs $;

        public Builder() {
            $ = new AccountSharePropertiesArgs();
        }

        public Builder(AccountSharePropertiesArgs defaults) {
            $ = new AccountSharePropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param corsRules A `cors_rule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(@Nullable Output<List<AccountSharePropertiesCorsRuleArgs>> corsRules) {
            $.corsRules = corsRules;
            return this;
        }

        /**
         * @param corsRules A `cors_rule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(List<AccountSharePropertiesCorsRuleArgs> corsRules) {
            return corsRules(Output.of(corsRules));
        }

        /**
         * @param corsRules A `cors_rule` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder corsRules(AccountSharePropertiesCorsRuleArgs... corsRules) {
            return corsRules(List.of(corsRules));
        }

        /**
         * @param retentionPolicy A `retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Output<AccountSharePropertiesRetentionPolicyArgs> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy A `retention_policy` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(AccountSharePropertiesRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        /**
         * @param smb A `smb` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder smb(@Nullable Output<AccountSharePropertiesSmbArgs> smb) {
            $.smb = smb;
            return this;
        }

        /**
         * @param smb A `smb` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder smb(AccountSharePropertiesSmbArgs smb) {
            return smb(Output.of(smb));
        }

        public AccountSharePropertiesArgs build() {
            return $;
        }
    }

}
