// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sql always encrypted properties.
 * 
 */
public final class SqlAlwaysEncryptedPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final SqlAlwaysEncryptedPropertiesResponse Empty = new SqlAlwaysEncryptedPropertiesResponse();

    /**
     * Sql always encrypted AKV authentication type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="alwaysEncryptedAkvAuthType", required=true)
    private String alwaysEncryptedAkvAuthType;

    public String alwaysEncryptedAkvAuthType() {
        return this.alwaysEncryptedAkvAuthType;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * The client ID of the application in Azure Active Directory used for Azure Key Vault authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Object servicePrincipalId;

    public Optional<Object> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key of the service principal used to authenticate against Azure Key Vault.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    private SqlAlwaysEncryptedPropertiesResponse() {}

    private SqlAlwaysEncryptedPropertiesResponse(SqlAlwaysEncryptedPropertiesResponse $) {
        this.alwaysEncryptedAkvAuthType = $.alwaysEncryptedAkvAuthType;
        this.credential = $.credential;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlAlwaysEncryptedPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlAlwaysEncryptedPropertiesResponse $;

        public Builder() {
            $ = new SqlAlwaysEncryptedPropertiesResponse();
        }

        public Builder(SqlAlwaysEncryptedPropertiesResponse defaults) {
            $ = new SqlAlwaysEncryptedPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder alwaysEncryptedAkvAuthType(String alwaysEncryptedAkvAuthType) {
            $.alwaysEncryptedAkvAuthType = alwaysEncryptedAkvAuthType;
            return this;
        }

        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            $.credential = credential;
            return this;
        }

        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder servicePrincipalKey(AzureKeyVaultSecretReferenceResponse servicePrincipalKey) {
            return servicePrincipalKey(Either.ofLeft(servicePrincipalKey));
        }

        public Builder servicePrincipalKey(SecureStringResponse servicePrincipalKey) {
            return servicePrincipalKey(Either.ofRight(servicePrincipalKey));
        }

        public SqlAlwaysEncryptedPropertiesResponse build() {
            $.alwaysEncryptedAkvAuthType = Objects.requireNonNull($.alwaysEncryptedAkvAuthType, "expected parameter 'alwaysEncryptedAkvAuthType' to be non-null");
            return $;
        }
    }

}
