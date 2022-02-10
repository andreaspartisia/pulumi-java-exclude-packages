// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.autonomousdevelopmentplatform.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataPoolEncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataPoolEncryptionResponse Empty = new DataPoolEncryptionResponse();

    @InputImport(name="keyName", required=true)
    private final String keyName;

    public String getKeyName() {
        return this.keyName;
    }

    @InputImport(name="keyVaultUri", required=true)
    private final String keyVaultUri;

    public String getKeyVaultUri() {
        return this.keyVaultUri;
    }

    @InputImport(name="keyVersion")
    private final @Nullable String keyVersion;

    public Optional<String> getKeyVersion() {
        return this.keyVersion == null ? Optional.empty() : Optional.ofNullable(this.keyVersion);
    }

    @InputImport(name="userAssignedIdentity", required=true)
    private final String userAssignedIdentity;

    public String getUserAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    public DataPoolEncryptionResponse(
        String keyName,
        String keyVaultUri,
        @Nullable String keyVersion,
        String userAssignedIdentity) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.keyVaultUri = Objects.requireNonNull(keyVaultUri, "expected parameter 'keyVaultUri' to be non-null");
        this.keyVersion = keyVersion;
        this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity, "expected parameter 'userAssignedIdentity' to be non-null");
    }

    private DataPoolEncryptionResponse() {
        this.keyName = null;
        this.keyVaultUri = null;
        this.keyVersion = null;
        this.userAssignedIdentity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataPoolEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String keyVaultUri;
        private @Nullable String keyVersion;
        private String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(DataPoolEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKeyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }

        public Builder setKeyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder setUserAssignedIdentity(String userAssignedIdentity) {
            this.userAssignedIdentity = Objects.requireNonNull(userAssignedIdentity);
            return this;
        }

        public DataPoolEncryptionResponse build() {
            return new DataPoolEncryptionResponse(keyName, keyVaultUri, keyVersion, userAssignedIdentity);
        }
    }
}