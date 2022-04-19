// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.enums.Bypass;
import com.pulumi.azurenative.storage.enums.DefaultAction;
import com.pulumi.azurenative.storage.inputs.IPRuleArgs;
import com.pulumi.azurenative.storage.inputs.ResourceAccessRuleArgs;
import com.pulumi.azurenative.storage.inputs.VirtualNetworkRuleArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network rule set
 * 
 */
public final class NetworkRuleSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkRuleSetArgs Empty = new NetworkRuleSetArgs();

    /**
     * Specifies whether traffic is bypassed for Logging/Metrics/AzureServices. Possible values are any combination of Logging|Metrics|AzureServices (For example, "Logging, Metrics"), or None to bypass none of those traffics.
     * 
     */
    @Import(name="bypass")
      private final @Nullable Output<Either<String,Bypass>> bypass;

    public Output<Either<String,Bypass>> bypass() {
        return this.bypass == null ? Codegen.empty() : this.bypass;
    }

    /**
     * Specifies the default action of allow or deny when no other rules match.
     * 
     */
    @Import(name="defaultAction", required=true)
      private final Output<DefaultAction> defaultAction;

    public Output<DefaultAction> defaultAction() {
        return this.defaultAction;
    }

    /**
     * Sets the IP ACL rules
     * 
     */
    @Import(name="ipRules")
      private final @Nullable Output<List<IPRuleArgs>> ipRules;

    public Output<List<IPRuleArgs>> ipRules() {
        return this.ipRules == null ? Codegen.empty() : this.ipRules;
    }

    /**
     * Sets the resource access rules
     * 
     */
    @Import(name="resourceAccessRules")
      private final @Nullable Output<List<ResourceAccessRuleArgs>> resourceAccessRules;

    public Output<List<ResourceAccessRuleArgs>> resourceAccessRules() {
        return this.resourceAccessRules == null ? Codegen.empty() : this.resourceAccessRules;
    }

    /**
     * Sets the virtual network rules
     * 
     */
    @Import(name="virtualNetworkRules")
      private final @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

    public Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules() {
        return this.virtualNetworkRules == null ? Codegen.empty() : this.virtualNetworkRules;
    }

    public NetworkRuleSetArgs(
        @Nullable Output<Either<String,Bypass>> bypass,
        Output<DefaultAction> defaultAction,
        @Nullable Output<List<IPRuleArgs>> ipRules,
        @Nullable Output<List<ResourceAccessRuleArgs>> resourceAccessRules,
        @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
        this.bypass = Codegen.stringProp("bypass").left(Bypass.class).output().arg(bypass).def("AzureServices").getNullable();
        this.defaultAction = Codegen.objectProp("defaultAction", DefaultAction.class).output().arg(defaultAction).def(DefaultAction.Allow).require();
        this.ipRules = ipRules;
        this.resourceAccessRules = resourceAccessRules;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    private NetworkRuleSetArgs() {
        this.bypass = Codegen.empty();
        this.defaultAction = Codegen.empty();
        this.ipRules = Codegen.empty();
        this.resourceAccessRules = Codegen.empty();
        this.virtualNetworkRules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Bypass>> bypass;
        private Output<DefaultAction> defaultAction;
        private @Nullable Output<List<IPRuleArgs>> ipRules;
        private @Nullable Output<List<ResourceAccessRuleArgs>> resourceAccessRules;
        private @Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypass = defaults.bypass;
    	      this.defaultAction = defaults.defaultAction;
    	      this.ipRules = defaults.ipRules;
    	      this.resourceAccessRules = defaults.resourceAccessRules;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder bypass(@Nullable Output<Either<String,Bypass>> bypass) {
            this.bypass = bypass;
            return this;
        }
        public Builder bypass(@Nullable Either<String,Bypass> bypass) {
            this.bypass = Codegen.ofNullable(bypass);
            return this;
        }
        public Builder defaultAction(Output<DefaultAction> defaultAction) {
            this.defaultAction = Objects.requireNonNull(defaultAction);
            return this;
        }
        public Builder defaultAction(DefaultAction defaultAction) {
            this.defaultAction = Output.of(Objects.requireNonNull(defaultAction));
            return this;
        }
        public Builder ipRules(@Nullable Output<List<IPRuleArgs>> ipRules) {
            this.ipRules = ipRules;
            return this;
        }
        public Builder ipRules(@Nullable List<IPRuleArgs> ipRules) {
            this.ipRules = Codegen.ofNullable(ipRules);
            return this;
        }
        public Builder ipRules(IPRuleArgs... ipRules) {
            return ipRules(List.of(ipRules));
        }
        public Builder resourceAccessRules(@Nullable Output<List<ResourceAccessRuleArgs>> resourceAccessRules) {
            this.resourceAccessRules = resourceAccessRules;
            return this;
        }
        public Builder resourceAccessRules(@Nullable List<ResourceAccessRuleArgs> resourceAccessRules) {
            this.resourceAccessRules = Codegen.ofNullable(resourceAccessRules);
            return this;
        }
        public Builder resourceAccessRules(ResourceAccessRuleArgs... resourceAccessRules) {
            return resourceAccessRules(List.of(resourceAccessRules));
        }
        public Builder virtualNetworkRules(@Nullable Output<List<VirtualNetworkRuleArgs>> virtualNetworkRules) {
            this.virtualNetworkRules = virtualNetworkRules;
            return this;
        }
        public Builder virtualNetworkRules(@Nullable List<VirtualNetworkRuleArgs> virtualNetworkRules) {
            this.virtualNetworkRules = Codegen.ofNullable(virtualNetworkRules);
            return this;
        }
        public Builder virtualNetworkRules(VirtualNetworkRuleArgs... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public NetworkRuleSetArgs build() {
            return new NetworkRuleSetArgs(bypass, defaultAction, ipRules, resourceAccessRules, virtualNetworkRules);
        }
    }
}
