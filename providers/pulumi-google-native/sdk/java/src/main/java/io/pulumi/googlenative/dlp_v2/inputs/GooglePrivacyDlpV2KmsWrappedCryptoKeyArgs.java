// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs Empty = new GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs();

    @InputImport(name="cryptoKeyName", required=true)
    private final Input<String> cryptoKeyName;

    public Input<String> getCryptoKeyName() {
        return this.cryptoKeyName;
    }

    @InputImport(name="wrappedKey", required=true)
    private final Input<String> wrappedKey;

    public Input<String> getWrappedKey() {
        return this.wrappedKey;
    }

    public GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs(
        Input<String> cryptoKeyName,
        Input<String> wrappedKey) {
        this.cryptoKeyName = Objects.requireNonNull(cryptoKeyName, "expected parameter 'cryptoKeyName' to be non-null");
        this.wrappedKey = Objects.requireNonNull(wrappedKey, "expected parameter 'wrappedKey' to be non-null");
    }

    private GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs() {
        this.cryptoKeyName = Input.empty();
        this.wrappedKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> cryptoKeyName;
        private Input<String> wrappedKey;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKeyName = defaults.cryptoKeyName;
    	      this.wrappedKey = defaults.wrappedKey;
        }

        public Builder setCryptoKeyName(Input<String> cryptoKeyName) {
            this.cryptoKeyName = Objects.requireNonNull(cryptoKeyName);
            return this;
        }

        public Builder setCryptoKeyName(String cryptoKeyName) {
            this.cryptoKeyName = Input.of(Objects.requireNonNull(cryptoKeyName));
            return this;
        }

        public Builder setWrappedKey(Input<String> wrappedKey) {
            this.wrappedKey = Objects.requireNonNull(wrappedKey);
            return this;
        }

        public Builder setWrappedKey(String wrappedKey) {
            this.wrappedKey = Input.of(Objects.requireNonNull(wrappedKey));
            return this;
        }

        public GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs build() {
            return new GooglePrivacyDlpV2KmsWrappedCryptoKeyArgs(cryptoKeyName, wrappedKey);
        }
    }
}