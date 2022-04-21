// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.analysisservices.inputs;

import com.pulumi.azurenative.analysisservices.enums.SkuTier;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the SKU name and Azure pricing tier for Analysis Services resource.
 * 
 */
public final class ResourceSkuArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceSkuArgs Empty = new ResourceSkuArgs();

    /**
     * The number of instances in the read only query pool.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Integer> capacity;

    public Optional<Output<Integer>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * Name of the SKU level.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The name of the Azure pricing tier to which the SKU applies.
     * 
     */
    @Import(name="tier")
    private @Nullable Output<Either<String,SkuTier>> tier;

    public Optional<Output<Either<String,SkuTier>>> tier() {
        return Optional.ofNullable(this.tier);
    }

    private ResourceSkuArgs() {}

    private ResourceSkuArgs(ResourceSkuArgs $) {
        this.capacity = $.capacity;
        this.name = $.name;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSkuArgs $;

        public Builder() {
            $ = new ResourceSkuArgs();
        }

        public Builder(ResourceSkuArgs defaults) {
            $ = new ResourceSkuArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(Integer capacity) {
            return capacity(Output.of(capacity));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tier(@Nullable Output<Either<String,SkuTier>> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(Either<String,SkuTier> tier) {
            return tier(Output.of(tier));
        }

        public Builder tier(String tier) {
            return tier(Either.ofLeft(tier));
        }

        public Builder tier(SkuTier tier) {
            return tier(Either.ofRight(tier));
        }

        public ResourceSkuArgs build() {
            $.capacity = Codegen.integerProp("capacity").output().arg($.capacity).def(1).getNullable();
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
