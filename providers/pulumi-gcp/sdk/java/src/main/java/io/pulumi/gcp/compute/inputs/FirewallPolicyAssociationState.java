// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyAssociationState Empty = new FirewallPolicyAssociationState();

    /**
     * The target that the firewall policy is attached to.
     * 
     */
    @InputImport(name="attachmentTarget")
    private final @Nullable Input<String> attachmentTarget;

    public Input<String> getAttachmentTarget() {
        return this.attachmentTarget == null ? Input.empty() : this.attachmentTarget;
    }

    /**
     * The firewall policy ID of the association.
     * 
     */
    @InputImport(name="firewallPolicy")
    private final @Nullable Input<String> firewallPolicy;

    public Input<String> getFirewallPolicy() {
        return this.firewallPolicy == null ? Input.empty() : this.firewallPolicy;
    }

    /**
     * The name for an association.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The short name of the firewall policy of the association.
     * 
     */
    @InputImport(name="shortName")
    private final @Nullable Input<String> shortName;

    public Input<String> getShortName() {
        return this.shortName == null ? Input.empty() : this.shortName;
    }

    public FirewallPolicyAssociationState(
        @Nullable Input<String> attachmentTarget,
        @Nullable Input<String> firewallPolicy,
        @Nullable Input<String> name,
        @Nullable Input<String> shortName) {
        this.attachmentTarget = attachmentTarget;
        this.firewallPolicy = firewallPolicy;
        this.name = name;
        this.shortName = shortName;
    }

    private FirewallPolicyAssociationState() {
        this.attachmentTarget = Input.empty();
        this.firewallPolicy = Input.empty();
        this.name = Input.empty();
        this.shortName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> attachmentTarget;
        private @Nullable Input<String> firewallPolicy;
        private @Nullable Input<String> name;
        private @Nullable Input<String> shortName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentTarget = defaults.attachmentTarget;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.name = defaults.name;
    	      this.shortName = defaults.shortName;
        }

        public Builder setAttachmentTarget(@Nullable Input<String> attachmentTarget) {
            this.attachmentTarget = attachmentTarget;
            return this;
        }

        public Builder setAttachmentTarget(@Nullable String attachmentTarget) {
            this.attachmentTarget = Input.ofNullable(attachmentTarget);
            return this;
        }

        public Builder setFirewallPolicy(@Nullable Input<String> firewallPolicy) {
            this.firewallPolicy = firewallPolicy;
            return this;
        }

        public Builder setFirewallPolicy(@Nullable String firewallPolicy) {
            this.firewallPolicy = Input.ofNullable(firewallPolicy);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setShortName(@Nullable Input<String> shortName) {
            this.shortName = shortName;
            return this;
        }

        public Builder setShortName(@Nullable String shortName) {
            this.shortName = Input.ofNullable(shortName);
            return this;
        }

        public FirewallPolicyAssociationState build() {
            return new FirewallPolicyAssociationState(attachmentTarget, firewallPolicy, name, shortName);
        }
    }
}