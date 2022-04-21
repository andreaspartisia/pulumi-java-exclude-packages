// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.AzureFirewallNatRCActionType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AzureFirewall NAT Rule Collection Action.
 * 
 */
public final class AzureFirewallNatRCActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFirewallNatRCActionArgs Empty = new AzureFirewallNatRCActionArgs();

    /**
     * The type of action.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,AzureFirewallNatRCActionType>> type;

    public Optional<Output<Either<String,AzureFirewallNatRCActionType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private AzureFirewallNatRCActionArgs() {}

    private AzureFirewallNatRCActionArgs(AzureFirewallNatRCActionArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureFirewallNatRCActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureFirewallNatRCActionArgs $;

        public Builder() {
            $ = new AzureFirewallNatRCActionArgs();
        }

        public Builder(AzureFirewallNatRCActionArgs defaults) {
            $ = new AzureFirewallNatRCActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<Either<String,AzureFirewallNatRCActionType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,AzureFirewallNatRCActionType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(AzureFirewallNatRCActionType type) {
            return type(Either.ofRight(type));
        }

        public AzureFirewallNatRCActionArgs build() {
            return $;
        }
    }

}
