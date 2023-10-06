// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CpCodeArgs extends com.pulumi.resources.ResourceArgs {

    public static final CpCodeArgs Empty = new CpCodeArgs();

    @Import(name="contractId", required=true)
    private Output<String> contractId;

    public Output<String> contractId() {
        return this.contractId;
    }

    @Import(name="groupId", required=true)
    private Output<String> groupId;

    public Output<String> groupId() {
        return this.groupId;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="productId")
    private @Nullable Output<String> productId;

    public Optional<Output<String>> productId() {
        return Optional.ofNullable(this.productId);
    }

    private CpCodeArgs() {}

    private CpCodeArgs(CpCodeArgs $) {
        this.contractId = $.contractId;
        this.groupId = $.groupId;
        this.name = $.name;
        this.productId = $.productId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CpCodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CpCodeArgs $;

        public Builder() {
            $ = new CpCodeArgs();
        }

        public Builder(CpCodeArgs defaults) {
            $ = new CpCodeArgs(Objects.requireNonNull(defaults));
        }

        public Builder contractId(Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        public Builder groupId(Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder productId(@Nullable Output<String> productId) {
            $.productId = productId;
            return this;
        }

        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        public CpCodeArgs build() {
            if ($.contractId == null) {
                throw new MissingRequiredPropertyException("CpCodeArgs", "contractId");
            }
            if ($.groupId == null) {
                throw new MissingRequiredPropertyException("CpCodeArgs", "groupId");
            }
            return $;
        }
    }

}
