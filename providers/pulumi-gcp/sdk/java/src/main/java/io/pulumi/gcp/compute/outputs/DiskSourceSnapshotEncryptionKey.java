// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiskSourceSnapshotEncryptionKey {
    /**
     * The self link of the encryption key used to encrypt the disk. Also called KmsKeyName
     * in the cloud console. Your project's Compute Engine System service account
     * (`service-{{PROJECT_NUMBER}}@compute-system.iam.gserviceaccount.com`) must have
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
     * See https://cloud.google.com/compute/docs/disks/customer-managed-encryption#encrypt_a_new_persistent_disk_with_your_own_keys
     * 
     */
    private final @Nullable String kmsKeySelfLink;
    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    private final @Nullable String kmsKeyServiceAccount;
    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    private final @Nullable String rawKey;
    /**
     * - 
     * The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
     * encryption key that protects this resource.
     * 
     */
    private final @Nullable String sha256;

    @OutputCustomType.Constructor({"kmsKeySelfLink","kmsKeyServiceAccount","rawKey","sha256"})
    private DiskSourceSnapshotEncryptionKey(
        @Nullable String kmsKeySelfLink,
        @Nullable String kmsKeyServiceAccount,
        @Nullable String rawKey,
        @Nullable String sha256) {
        this.kmsKeySelfLink = kmsKeySelfLink;
        this.kmsKeyServiceAccount = kmsKeyServiceAccount;
        this.rawKey = rawKey;
        this.sha256 = sha256;
    }

    /**
     * The self link of the encryption key used to encrypt the disk. Also called KmsKeyName
     * in the cloud console. Your project's Compute Engine System service account
     * (`service-{{PROJECT_NUMBER}}@compute-system.iam.gserviceaccount.com`) must have
     * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to use this feature.
     * See https://cloud.google.com/compute/docs/disks/customer-managed-encryption#encrypt_a_new_persistent_disk_with_your_own_keys
     * 
     */
    public Optional<String> getKmsKeySelfLink() {
        return Optional.ofNullable(this.kmsKeySelfLink);
    }
    /**
     * The service account used for the encryption request for the given KMS key.
     * If absent, the Compute Engine Service Agent service account is used.
     * 
     */
    public Optional<String> getKmsKeyServiceAccount() {
        return Optional.ofNullable(this.kmsKeyServiceAccount);
    }
    /**
     * Specifies a 256-bit customer-supplied encryption key, encoded in
     * RFC 4648 base64 to either encrypt or decrypt this resource.
     * 
     */
    public Optional<String> getRawKey() {
        return Optional.ofNullable(this.rawKey);
    }
    /**
     * - 
     * The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied
     * encryption key that protects this resource.
     * 
     */
    public Optional<String> getSha256() {
        return Optional.ofNullable(this.sha256);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskSourceSnapshotEncryptionKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeySelfLink;
        private @Nullable String kmsKeyServiceAccount;
        private @Nullable String rawKey;
        private @Nullable String sha256;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskSourceSnapshotEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
    	      this.rawKey = defaults.rawKey;
    	      this.sha256 = defaults.sha256;
        }

        public Builder setKmsKeySelfLink(@Nullable String kmsKeySelfLink) {
            this.kmsKeySelfLink = kmsKeySelfLink;
            return this;
        }

        public Builder setKmsKeyServiceAccount(@Nullable String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return this;
        }

        public Builder setRawKey(@Nullable String rawKey) {
            this.rawKey = rawKey;
            return this;
        }

        public Builder setSha256(@Nullable String sha256) {
            this.sha256 = sha256;
            return this;
        }

        public DiskSourceSnapshotEncryptionKey build() {
            return new DiskSourceSnapshotEncryptionKey(kmsKeySelfLink, kmsKeyServiceAccount, rawKey, sha256);
        }
    }
}