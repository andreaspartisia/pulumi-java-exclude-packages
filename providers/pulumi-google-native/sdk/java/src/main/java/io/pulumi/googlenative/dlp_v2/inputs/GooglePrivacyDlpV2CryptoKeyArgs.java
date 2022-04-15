// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TransientCryptoKeyArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2UnwrappedCryptoKeyArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is a data encryption key (DEK) (as opposed to a key encryption key (KEK) stored by Cloud Key Management Service (Cloud KMS). When using Cloud KMS to wrap or unwrap a DEK, be sure to set an appropriate IAM policy on the KEK to ensure an attacker cannot unwrap the DEK.
 * 
 */
public final class GooglePrivacyDlpV2CryptoKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2CryptoKeyArgs Empty = new GooglePrivacyDlpV2CryptoKeyArgs();

    /**
     * Key wrapped using Cloud KMS
     * 
     */
    @Import(name="kmsWrapped")
      private final @Nullable Output<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> kmsWrapped;

    public Output<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> kmsWrapped() {
        return this.kmsWrapped == null ? Codegen.empty() : this.kmsWrapped;
    }

    /**
     * Transient crypto key
     * 
     */
    @Import(name="transient")
      private final @Nullable Output<GooglePrivacyDlpV2TransientCryptoKeyArgs> transient_;

    public Output<GooglePrivacyDlpV2TransientCryptoKeyArgs> transient_() {
        return this.transient_ == null ? Codegen.empty() : this.transient_;
    }

    /**
     * Unwrapped crypto key
     * 
     */
    @Import(name="unwrapped")
      private final @Nullable Output<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> unwrapped;

    public Output<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> unwrapped() {
        return this.unwrapped == null ? Codegen.empty() : this.unwrapped;
    }

    public GooglePrivacyDlpV2CryptoKeyArgs(
        @Nullable Output<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> kmsWrapped,
        @Nullable Output<GooglePrivacyDlpV2TransientCryptoKeyArgs> transient_,
        @Nullable Output<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> unwrapped) {
        this.kmsWrapped = kmsWrapped;
        this.transient_ = transient_;
        this.unwrapped = unwrapped;
    }

    private GooglePrivacyDlpV2CryptoKeyArgs() {
        this.kmsWrapped = Codegen.empty();
        this.transient_ = Codegen.empty();
        this.unwrapped = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CryptoKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> kmsWrapped;
        private @Nullable Output<GooglePrivacyDlpV2TransientCryptoKeyArgs> transient_;
        private @Nullable Output<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> unwrapped;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CryptoKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsWrapped = defaults.kmsWrapped;
    	      this.transient_ = defaults.transient_;
    	      this.unwrapped = defaults.unwrapped;
        }

        public Builder kmsWrapped(@Nullable Output<GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs> kmsWrapped) {
            this.kmsWrapped = kmsWrapped;
            return this;
        }
        public Builder kmsWrapped(@Nullable GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs kmsWrapped) {
            this.kmsWrapped = Codegen.ofNullable(kmsWrapped);
            return this;
        }
        public Builder transient_(@Nullable Output<GooglePrivacyDlpV2TransientCryptoKeyArgs> transient_) {
            this.transient_ = transient_;
            return this;
        }
        public Builder transient_(@Nullable GooglePrivacyDlpV2TransientCryptoKeyArgs transient_) {
            this.transient_ = Codegen.ofNullable(transient_);
            return this;
        }
        public Builder unwrapped(@Nullable Output<GooglePrivacyDlpV2UnwrappedCryptoKeyArgs> unwrapped) {
            this.unwrapped = unwrapped;
            return this;
        }
        public Builder unwrapped(@Nullable GooglePrivacyDlpV2UnwrappedCryptoKeyArgs unwrapped) {
            this.unwrapped = Codegen.ofNullable(unwrapped);
            return this;
        }        public GooglePrivacyDlpV2CryptoKeyArgs build() {
            return new GooglePrivacyDlpV2CryptoKeyArgs(kmsWrapped, transient_, unwrapped);
        }
    }
}
