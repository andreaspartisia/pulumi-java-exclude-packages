// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.IdentityForCmkResponse;
import io.pulumi.azurenative.machinelearningservices.inputs.KeyVaultPropertiesResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptionPropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionPropertyResponse Empty = new EncryptionPropertyResponse();

    @InputImport(name="identity")
    private final @Nullable IdentityForCmkResponse identity;

    public Optional<IdentityForCmkResponse> getIdentity() {
        return this.identity == null ? Optional.empty() : Optional.ofNullable(this.identity);
    }

    @InputImport(name="keyVaultProperties", required=true)
    private final KeyVaultPropertiesResponse keyVaultProperties;

    public KeyVaultPropertiesResponse getKeyVaultProperties() {
        return this.keyVaultProperties;
    }

    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public EncryptionPropertyResponse(
        @Nullable IdentityForCmkResponse identity,
        KeyVaultPropertiesResponse keyVaultProperties,
        String status) {
        this.identity = identity;
        this.keyVaultProperties = Objects.requireNonNull(keyVaultProperties, "expected parameter 'keyVaultProperties' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private EncryptionPropertyResponse() {
        this.identity = null;
        this.keyVaultProperties = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IdentityForCmkResponse identity;
        private KeyVaultPropertiesResponse keyVaultProperties;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.keyVaultProperties = defaults.keyVaultProperties;
    	      this.status = defaults.status;
        }

        public Builder setIdentity(@Nullable IdentityForCmkResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setKeyVaultProperties(KeyVaultPropertiesResponse keyVaultProperties) {
            this.keyVaultProperties = Objects.requireNonNull(keyVaultProperties);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public EncryptionPropertyResponse build() {
            return new EncryptionPropertyResponse(identity, keyVaultProperties, status);
        }
    }
}