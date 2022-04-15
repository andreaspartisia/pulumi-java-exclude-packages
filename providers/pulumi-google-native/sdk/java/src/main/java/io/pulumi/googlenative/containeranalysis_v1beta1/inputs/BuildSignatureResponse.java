// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Message encapsulating the signature of the verified build.
 * 
 */
public final class BuildSignatureResponse extends io.pulumi.resources.InvokeArgs {

    public static final BuildSignatureResponse Empty = new BuildSignatureResponse();

    /**
     * An ID for the key used to sign. This could be either an ID for the key stored in `public_key` (such as the ID or fingerprint for a PGP key, or the CN for a cert), or a reference to an external key (such as a reference to a key in Cloud Key Management Service).
     * 
     */
    @Import(name="keyId", required=true)
      private final String keyId;

    public String keyId() {
        return this.keyId;
    }

    /**
     * The type of the key, either stored in `public_key` or referenced in `key_id`.
     * 
     */
    @Import(name="keyType", required=true)
      private final String keyType;

    public String keyType() {
        return this.keyType;
    }

    /**
     * Public key of the builder which can be used to verify that the related findings are valid and unchanged. If `key_type` is empty, this defaults to PEM encoded public keys. This field may be empty if `key_id` references an external key. For Cloud Build based signatures, this is a PEM encoded public key. To verify the Cloud Build signature, place the contents of this field into a file (public.pem). The signature field is base64-decoded into its binary representation in signature.bin, and the provenance bytes from `BuildDetails` are base64-decoded into a binary representation in signed.bin. OpenSSL can then verify the signature: `openssl sha256 -verify public.pem -signature signature.bin signed.bin`
     * 
     */
    @Import(name="publicKey", required=true)
      private final String publicKey;

    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Signature of the related `BuildProvenance`. In JSON, this is base-64 encoded.
     * 
     */
    @Import(name="signature", required=true)
      private final String signature;

    public String signature() {
        return this.signature;
    }

    public BuildSignatureResponse(
        String keyId,
        String keyType,
        String publicKey,
        String signature) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
        this.publicKey = Objects.requireNonNull(publicKey, "expected parameter 'publicKey' to be non-null");
        this.signature = Objects.requireNonNull(signature, "expected parameter 'signature' to be non-null");
    }

    private BuildSignatureResponse() {
        this.keyId = null;
        this.keyType = null;
        this.publicKey = null;
        this.signature = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildSignatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;
        private String keyType;
        private String publicKey;
        private String signature;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildSignatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.keyType = defaults.keyType;
    	      this.publicKey = defaults.publicKey;
    	      this.signature = defaults.signature;
        }

        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }
        public Builder publicKey(String publicKey) {
            this.publicKey = Objects.requireNonNull(publicKey);
            return this;
        }
        public Builder signature(String signature) {
            this.signature = Objects.requireNonNull(signature);
            return this;
        }        public BuildSignatureResponse build() {
            return new BuildSignatureResponse(keyId, keyType, publicKey, signature);
        }
    }
}
