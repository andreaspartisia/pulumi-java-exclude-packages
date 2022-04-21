// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FirewallPolicyIntrusionDetectionStateType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Intrusion detection signatures specification states.
 * 
 */
public final class FirewallPolicyIntrusionDetectionSignatureSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyIntrusionDetectionSignatureSpecificationArgs Empty = new FirewallPolicyIntrusionDetectionSignatureSpecificationArgs();

    /**
     * Signature id.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The signature state.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Either<String,FirewallPolicyIntrusionDetectionStateType>> mode;

    public Optional<Output<Either<String,FirewallPolicyIntrusionDetectionStateType>>> mode() {
        return Optional.ofNullable(this.mode);
    }

    private FirewallPolicyIntrusionDetectionSignatureSpecificationArgs() {}

    private FirewallPolicyIntrusionDetectionSignatureSpecificationArgs(FirewallPolicyIntrusionDetectionSignatureSpecificationArgs $) {
        this.id = $.id;
        this.mode = $.mode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyIntrusionDetectionSignatureSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyIntrusionDetectionSignatureSpecificationArgs $;

        public Builder() {
            $ = new FirewallPolicyIntrusionDetectionSignatureSpecificationArgs();
        }

        public Builder(FirewallPolicyIntrusionDetectionSignatureSpecificationArgs defaults) {
            $ = new FirewallPolicyIntrusionDetectionSignatureSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder mode(@Nullable Output<Either<String,FirewallPolicyIntrusionDetectionStateType>> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(Either<String,FirewallPolicyIntrusionDetectionStateType> mode) {
            return mode(Output.of(mode));
        }

        public Builder mode(String mode) {
            return mode(Either.ofLeft(mode));
        }

        public Builder mode(FirewallPolicyIntrusionDetectionStateType mode) {
            return mode(Either.ofRight(mode));
        }

        public FirewallPolicyIntrusionDetectionSignatureSpecificationArgs build() {
            return $;
        }
    }

}
