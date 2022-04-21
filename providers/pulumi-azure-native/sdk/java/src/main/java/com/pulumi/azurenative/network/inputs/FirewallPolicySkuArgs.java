// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FirewallPolicySkuTier;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SKU of Firewall policy.
 * 
 */
public final class FirewallPolicySkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicySkuArgs Empty = new FirewallPolicySkuArgs();

    /**
     * Tier of Firewall Policy.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<Either<String,FirewallPolicySkuTier>> tier;

    public Optional<Output<Either<String,FirewallPolicySkuTier>>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private FirewallPolicySkuArgs() {}

    private FirewallPolicySkuArgs(FirewallPolicySkuArgs $) {
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicySkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicySkuArgs $;

        public Builder() {
            $ = new FirewallPolicySkuArgs();
        }

        public Builder(FirewallPolicySkuArgs defaults) {
            $ = new FirewallPolicySkuArgs(Objects.requireNonNull(defaults));
        }

        public Builder tier(@Nullable Output<Either<String,FirewallPolicySkuTier>> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(Either<String,FirewallPolicySkuTier> tier) {
            return tier(Output.of(tier));
        }

        public Builder tier(String tier) {
            return tier(Either.ofLeft(tier));
        }

        public Builder tier(FirewallPolicySkuTier tier) {
            return tier(Either.ofRight(tier));
        }

        public FirewallPolicySkuArgs build() {
            return $;
        }
    }

}
