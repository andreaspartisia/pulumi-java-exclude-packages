// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus.inputs;

import com.pulumi.azurenative.servicebus.enums.NetworkRuleIPAction;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of NetWorkRuleSet - IpRules resource.
 * 
 */
public final class NWRuleSetIpRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final NWRuleSetIpRulesArgs Empty = new NWRuleSetIpRulesArgs();

    /**
     * The IP Filter Action
     * 
     */
    @Import(name="action")
      private final @Nullable Output<Either<String,NetworkRuleIPAction>> action;

    public Output<Either<String,NetworkRuleIPAction>> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * IP Mask
     * 
     */
    @Import(name="ipMask")
      private final @Nullable Output<String> ipMask;

    public Output<String> ipMask() {
        return this.ipMask == null ? Codegen.empty() : this.ipMask;
    }

    public NWRuleSetIpRulesArgs(
        @Nullable Output<Either<String,NetworkRuleIPAction>> action,
        @Nullable Output<String> ipMask) {
        this.action = Codegen.stringProp("action").left(NetworkRuleIPAction.class).output().arg(action).def("Allow").getNullable();
        this.ipMask = ipMask;
    }

    private NWRuleSetIpRulesArgs() {
        this.action = Codegen.empty();
        this.ipMask = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NWRuleSetIpRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,NetworkRuleIPAction>> action;
        private @Nullable Output<String> ipMask;

        public Builder() {
    	      // Empty
        }

        public Builder(NWRuleSetIpRulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.ipMask = defaults.ipMask;
        }

        public Builder action(@Nullable Output<Either<String,NetworkRuleIPAction>> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable Either<String,NetworkRuleIPAction> action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder ipMask(@Nullable Output<String> ipMask) {
            this.ipMask = ipMask;
            return this;
        }
        public Builder ipMask(@Nullable String ipMask) {
            this.ipMask = Codegen.ofNullable(ipMask);
            return this;
        }        public NWRuleSetIpRulesArgs build() {
            return new NWRuleSetIpRulesArgs(action, ipMask);
        }
    }
}
