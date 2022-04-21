// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.PolicyStatus;
import com.pulumi.azurenative.containerregistry.enums.TrustPolicyType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The content trust policy for a container registry.
 * 
 */
public final class TrustPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TrustPolicyArgs Empty = new TrustPolicyArgs();

    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,PolicyStatus>> status;

    public Optional<Output<Either<String,PolicyStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The type of trust policy.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,TrustPolicyType>> type;

    public Optional<Output<Either<String,TrustPolicyType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private TrustPolicyArgs() {}

    private TrustPolicyArgs(TrustPolicyArgs $) {
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrustPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrustPolicyArgs $;

        public Builder() {
            $ = new TrustPolicyArgs();
        }

        public Builder(TrustPolicyArgs defaults) {
            $ = new TrustPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder status(@Nullable Output<Either<String,PolicyStatus>> status) {
            $.status = status;
            return this;
        }

        public Builder status(Either<String,PolicyStatus> status) {
            return status(Output.of(status));
        }

        public Builder status(String status) {
            return status(Either.ofLeft(status));
        }

        public Builder status(PolicyStatus status) {
            return status(Either.ofRight(status));
        }

        public Builder type(@Nullable Output<Either<String,TrustPolicyType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,TrustPolicyType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(TrustPolicyType type) {
            return type(Either.ofRight(type));
        }

        public TrustPolicyArgs build() {
            $.status = Codegen.stringProp("status").left(PolicyStatus.class).output().arg($.status).def("disabled").getNullable();
            $.type = Codegen.stringProp("type").left(TrustPolicyType.class).output().arg($.type).def("Notary").getNullable();
            return $;
        }
    }

}
