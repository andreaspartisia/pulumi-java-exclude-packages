// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CustomerEncryptionKeyResponse {
    /**
     * The name of the encryption key that is stored in Google Cloud KMS. For example: "kmsKeyName": "projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key
     * 
     */
    private final String kmsKeyName;
    /**
     * The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. For example: "kmsKeyServiceAccount": "name@project_id.iam.gserviceaccount.com/
     * 
     */
    private final String kmsKeyServiceAccount;
    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: "rawKey": "SGVsbG8gZnJvbSBHb29nbGUgQ2xvdWQgUGxhdGZvcm0="
     * 
     */
    private final String rawKey;
    /**
     * Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: "rsaEncryptedKey": "ieCx/NcW06PcT7Ep1X6LUTc/hLvUDYyzSZPPVCVPTVEohpeHASqC8uw5TzyO9U+Fka9JFH z0mBibXUInrC/jEk014kCK/NPjYgEMOyssZ4ZINPKxlUh2zn1bV+MCaTICrdmuSBTWlUUiFoD D6PYznLwh8ZNdaheCeZ8ewEXgFQ8V+sDroLaN3Xs3MDTXQEMMoNUXMCZEIpg9Vtp9x2oe==" The key must meet the following requirements before you can provide it to Compute Engine: 1. The key is wrapped using a RSA public key certificate provided by Google. 2. After being wrapped, the key must be encoded in RFC 4648 base64 encoding. Gets the RSA public key certificate provided by Google at: https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
     * 
     */
    private final String rsaEncryptedKey;
    /**
     * [Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key that protects this resource.
     * 
     */
    private final String sha256;

    @CustomType.Constructor
    private CustomerEncryptionKeyResponse(
        @CustomType.Parameter("kmsKeyName") String kmsKeyName,
        @CustomType.Parameter("kmsKeyServiceAccount") String kmsKeyServiceAccount,
        @CustomType.Parameter("rawKey") String rawKey,
        @CustomType.Parameter("rsaEncryptedKey") String rsaEncryptedKey,
        @CustomType.Parameter("sha256") String sha256) {
        this.kmsKeyName = kmsKeyName;
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
        this.rsaEncryptedKey = rsaEncryptedKey;
        this.sha256 = sha256;
    }

    /**
     * The name of the encryption key that is stored in Google Cloud KMS. For example: "kmsKeyName": "projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key
     * 
    */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. For example: "kmsKeyServiceAccount": "name@project_id.iam.gserviceaccount.com/
     * 
    */
    public String kmsKeyServiceAccount() {
        return this.kmsKeyServiceAccount;
    }
    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: "rawKey": "SGVsbG8gZnJvbSBHb29nbGUgQ2xvdWQgUGxhdGZvcm0="
     * 
    */
    public String rawKey() {
        return this.rawKey;
    }
    /**
     * Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: "rsaEncryptedKey": "ieCx/NcW06PcT7Ep1X6LUTc/hLvUDYyzSZPPVCVPTVEohpeHASqC8uw5TzyO9U+Fka9JFH z0mBibXUInrC/jEk014kCK/NPjYgEMOyssZ4ZINPKxlUh2zn1bV+MCaTICrdmuSBTWlUUiFoD D6PYznLwh8ZNdaheCeZ8ewEXgFQ8V+sDroLaN3Xs3MDTXQEMMoNUXMCZEIpg9Vtp9x2oe==" The key must meet the following requirements before you can provide it to Compute Engine: 1. The key is wrapped using a RSA public key certificate provided by Google. 2. After being wrapped, the key must be encoded in RFC 4648 base64 encoding. Gets the RSA public key certificate provided by Google at: https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
     * 
    */
    public String rsaEncryptedKey() {
        return this.rsaEncryptedKey;
    }
    /**
     * [Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key that protects this resource.
     * 
    */
    public String sha256() {
        return this.sha256;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerEncryptionKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private String kmsKeyServiceAccount;
        private String rawKey;
        private String rsaEncryptedKey;
        private String sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerEncryptionKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.rsaEncryptedKey = defaults.rsaEncryptedKey;
    	      this.sha256 = defaults.sha256;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder kmsKeyServiceAccount(String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = Objects.requireNonNull(kmsKeyServiceAccount);
            return this;
        }
        public Builder rawKey(String rawKey) {
            this.rawKey = Objects.requireNonNull(rawKey);
            return this;
        }
        public Builder rsaEncryptedKey(String rsaEncryptedKey) {
            this.rsaEncryptedKey = Objects.requireNonNull(rsaEncryptedKey);
            return this;
        }
        public Builder sha256(String sha256) {
            this.sha256 = Objects.requireNonNull(sha256);
            return this;
        }        public CustomerEncryptionKeyResponse build() {
            return new CustomerEncryptionKeyResponse(kmsKeyName, kmsKeyServiceAccount, rawKey, rsaEncryptedKey, sha256);
        }
    }
}
