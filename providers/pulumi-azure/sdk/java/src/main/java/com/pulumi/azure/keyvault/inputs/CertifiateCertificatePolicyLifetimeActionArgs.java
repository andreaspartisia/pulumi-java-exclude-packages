// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.keyvault.inputs;

import com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionActionArgs;
import com.pulumi.azure.keyvault.inputs.CertifiateCertificatePolicyLifetimeActionTriggerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


public final class CertifiateCertificatePolicyLifetimeActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertifiateCertificatePolicyLifetimeActionArgs Empty = new CertifiateCertificatePolicyLifetimeActionArgs();

    /**
     * A `action` block as defined below.
     * 
     */
    @Import(name="action", required=true)
    private Output<CertifiateCertificatePolicyLifetimeActionActionArgs> action;

    /**
     * @return A `action` block as defined below.
     * 
     */
    public Output<CertifiateCertificatePolicyLifetimeActionActionArgs> action() {
        return this.action;
    }

    /**
     * A `trigger` block as defined below.
     * 
     */
    @Import(name="trigger", required=true)
    private Output<CertifiateCertificatePolicyLifetimeActionTriggerArgs> trigger;

    /**
     * @return A `trigger` block as defined below.
     * 
     */
    public Output<CertifiateCertificatePolicyLifetimeActionTriggerArgs> trigger() {
        return this.trigger;
    }

    private CertifiateCertificatePolicyLifetimeActionArgs() {}

    private CertifiateCertificatePolicyLifetimeActionArgs(CertifiateCertificatePolicyLifetimeActionArgs $) {
        this.action = $.action;
        this.trigger = $.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertifiateCertificatePolicyLifetimeActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertifiateCertificatePolicyLifetimeActionArgs $;

        public Builder() {
            $ = new CertifiateCertificatePolicyLifetimeActionArgs();
        }

        public Builder(CertifiateCertificatePolicyLifetimeActionArgs defaults) {
            $ = new CertifiateCertificatePolicyLifetimeActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action A `action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<CertifiateCertificatePolicyLifetimeActionActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action A `action` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder action(CertifiateCertificatePolicyLifetimeActionActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param trigger A `trigger` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder trigger(Output<CertifiateCertificatePolicyLifetimeActionTriggerArgs> trigger) {
            $.trigger = trigger;
            return this;
        }

        /**
         * @param trigger A `trigger` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder trigger(CertifiateCertificatePolicyLifetimeActionTriggerArgs trigger) {
            return trigger(Output.of(trigger));
        }

        public CertifiateCertificatePolicyLifetimeActionArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.trigger = Objects.requireNonNull($.trigger, "expected parameter 'trigger' to be non-null");
            return $;
        }
    }

}
