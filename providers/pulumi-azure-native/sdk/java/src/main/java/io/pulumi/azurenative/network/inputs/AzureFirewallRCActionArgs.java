// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.AzureFirewallRCActionType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureFirewallRCActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFirewallRCActionArgs Empty = new AzureFirewallRCActionArgs();

    @InputImport(name="type")
    private final @Nullable Input<Either<String,AzureFirewallRCActionType>> type;

    public Input<Either<String,AzureFirewallRCActionType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public AzureFirewallRCActionArgs(@Nullable Input<Either<String,AzureFirewallRCActionType>> type) {
        this.type = type;
    }

    private AzureFirewallRCActionArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallRCActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AzureFirewallRCActionType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallRCActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<Either<String,AzureFirewallRCActionType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,AzureFirewallRCActionType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public AzureFirewallRCActionArgs build() {
            return new AzureFirewallRCActionArgs(type);
        }
    }
}