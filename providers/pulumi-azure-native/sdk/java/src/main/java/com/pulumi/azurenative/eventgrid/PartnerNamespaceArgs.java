// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.eventgrid.enums.PublicNetworkAccess;
import com.pulumi.azurenative.eventgrid.inputs.InboundIpRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PartnerNamespaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PartnerNamespaceArgs Empty = new PartnerNamespaceArgs();

    /**
     * This boolean is used to enable or disable local auth. Default value is false. When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to the partner namespace.
     * 
     */
    @Import(name="disableLocalAuth")
      private final @Nullable Output<Boolean> disableLocalAuth;

    public Output<Boolean> disableLocalAuth() {
        return this.disableLocalAuth == null ? Codegen.empty() : this.disableLocalAuth;
    }

    /**
     * This can be used to restrict traffic from specific IPs instead of all IPs. Note: These are considered only if PublicNetworkAccess is enabled.
     * 
     */
    @Import(name="inboundIpRules")
      private final @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules;

    public Output<List<InboundIpRuleArgs>> inboundIpRules() {
        return this.inboundIpRules == null ? Codegen.empty() : this.inboundIpRules;
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of the partner namespace.
     * 
     */
    @Import(name="partnerNamespaceName")
      private final @Nullable Output<String> partnerNamespaceName;

    public Output<String> partnerNamespaceName() {
        return this.partnerNamespaceName == null ? Codegen.empty() : this.partnerNamespaceName;
    }

    /**
     * The fully qualified ARM Id of the partner registration that should be associated with this partner namespace. This takes the following format:
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/partnerRegistrations/{partnerRegistrationName}.
     * 
     */
    @Import(name="partnerRegistrationFullyQualifiedId")
      private final @Nullable Output<String> partnerRegistrationFullyQualifiedId;

    public Output<String> partnerRegistrationFullyQualifiedId() {
        return this.partnerRegistrationFullyQualifiedId == null ? Codegen.empty() : this.partnerRegistrationFullyQualifiedId;
    }

    /**
     * This determines if traffic is allowed over public network. By default it is enabled.
     * You can further restrict to specific IPs by configuring <seealso cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.PartnerNamespaceProperties.InboundIpRules" />
     * 
     */
    @Import(name="publicNetworkAccess")
      private final @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Output<Either<String,PublicNetworkAccess>> publicNetworkAccess() {
        return this.publicNetworkAccess == null ? Codegen.empty() : this.publicNetworkAccess;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags of the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public PartnerNamespaceArgs(
        @Nullable Output<Boolean> disableLocalAuth,
        @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules,
        @Nullable Output<String> location,
        @Nullable Output<String> partnerNamespaceName,
        @Nullable Output<String> partnerRegistrationFullyQualifiedId,
        @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.disableLocalAuth = Codegen.booleanProp("disableLocalAuth").output().arg(disableLocalAuth).def(false).getNullable();
        this.inboundIpRules = inboundIpRules;
        this.location = location;
        this.partnerNamespaceName = partnerNamespaceName;
        this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
        this.publicNetworkAccess = Codegen.stringProp("publicNetworkAccess").left(PublicNetworkAccess.class).output().arg(publicNetworkAccess).def("Enabled").getNullable();
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private PartnerNamespaceArgs() {
        this.disableLocalAuth = Codegen.empty();
        this.inboundIpRules = Codegen.empty();
        this.location = Codegen.empty();
        this.partnerNamespaceName = Codegen.empty();
        this.partnerRegistrationFullyQualifiedId = Codegen.empty();
        this.publicNetworkAccess = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PartnerNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disableLocalAuth;
        private @Nullable Output<List<InboundIpRuleArgs>> inboundIpRules;
        private @Nullable Output<String> location;
        private @Nullable Output<String> partnerNamespaceName;
        private @Nullable Output<String> partnerRegistrationFullyQualifiedId;
        private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PartnerNamespaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableLocalAuth = defaults.disableLocalAuth;
    	      this.inboundIpRules = defaults.inboundIpRules;
    	      this.location = defaults.location;
    	      this.partnerNamespaceName = defaults.partnerNamespaceName;
    	      this.partnerRegistrationFullyQualifiedId = defaults.partnerRegistrationFullyQualifiedId;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder disableLocalAuth(@Nullable Output<Boolean> disableLocalAuth) {
            this.disableLocalAuth = disableLocalAuth;
            return this;
        }
        public Builder disableLocalAuth(@Nullable Boolean disableLocalAuth) {
            this.disableLocalAuth = Codegen.ofNullable(disableLocalAuth);
            return this;
        }
        public Builder inboundIpRules(@Nullable Output<List<InboundIpRuleArgs>> inboundIpRules) {
            this.inboundIpRules = inboundIpRules;
            return this;
        }
        public Builder inboundIpRules(@Nullable List<InboundIpRuleArgs> inboundIpRules) {
            this.inboundIpRules = Codegen.ofNullable(inboundIpRules);
            return this;
        }
        public Builder inboundIpRules(InboundIpRuleArgs... inboundIpRules) {
            return inboundIpRules(List.of(inboundIpRules));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder partnerNamespaceName(@Nullable Output<String> partnerNamespaceName) {
            this.partnerNamespaceName = partnerNamespaceName;
            return this;
        }
        public Builder partnerNamespaceName(@Nullable String partnerNamespaceName) {
            this.partnerNamespaceName = Codegen.ofNullable(partnerNamespaceName);
            return this;
        }
        public Builder partnerRegistrationFullyQualifiedId(@Nullable Output<String> partnerRegistrationFullyQualifiedId) {
            this.partnerRegistrationFullyQualifiedId = partnerRegistrationFullyQualifiedId;
            return this;
        }
        public Builder partnerRegistrationFullyQualifiedId(@Nullable String partnerRegistrationFullyQualifiedId) {
            this.partnerRegistrationFullyQualifiedId = Codegen.ofNullable(partnerRegistrationFullyQualifiedId);
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }
        public Builder publicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Codegen.ofNullable(publicNetworkAccess);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public PartnerNamespaceArgs build() {
            return new PartnerNamespaceArgs(disableLocalAuth, inboundIpRules, location, partnerNamespaceName, partnerRegistrationFullyQualifiedId, publicNetworkAccess, resourceGroupName, tags);
        }
    }
}
