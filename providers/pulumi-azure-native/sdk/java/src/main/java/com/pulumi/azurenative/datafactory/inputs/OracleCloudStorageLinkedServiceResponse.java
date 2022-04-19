// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Linked service for Oracle Cloud Storage.
 * 
 */
public final class OracleCloudStorageLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final OracleCloudStorageLinkedServiceResponse Empty = new OracleCloudStorageLinkedServiceResponse();

    /**
     * The access key identifier of the Oracle Cloud Storage Identity and Access Management (IAM) user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accessKeyId")
      private final @Nullable Object accessKeyId;

    public Optional<Object> accessKeyId() {
        return this.accessKeyId == null ? Optional.empty() : Optional.ofNullable(this.accessKeyId);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * The secret access key of the Oracle Cloud Storage Identity and Access Management (IAM) user.
     * 
     */
    @Import(name="secretAccessKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey() {
        return this.secretAccessKey == null ? null : this.secretAccessKey;
    }

    /**
     * This value specifies the endpoint to access with the Oracle Cloud Storage Connector. This is an optional property; change it only if you want to try a different service endpoint or want to switch between https and http. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUrl")
      private final @Nullable Object serviceUrl;

    public Optional<Object> serviceUrl() {
        return this.serviceUrl == null ? Optional.empty() : Optional.ofNullable(this.serviceUrl);
    }

    /**
     * Type of linked service.
     * Expected value is 'OracleCloudStorage'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public OracleCloudStorageLinkedServiceResponse(
        @Nullable Object accessKeyId,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey,
        @Nullable Object serviceUrl,
        String type) {
        this.accessKeyId = accessKeyId;
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.secretAccessKey = secretAccessKey;
        this.serviceUrl = serviceUrl;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private OracleCloudStorageLinkedServiceResponse() {
        this.accessKeyId = null;
        this.annotations = List.of();
        this.connectVia = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.secretAccessKey = null;
        this.serviceUrl = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OracleCloudStorageLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object accessKeyId;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey;
        private @Nullable Object serviceUrl;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OracleCloudStorageLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.secretAccessKey = defaults.secretAccessKey;
    	      this.serviceUrl = defaults.serviceUrl;
    	      this.type = defaults.type;
        }

        public Builder accessKeyId(@Nullable Object accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder secretAccessKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            return this;
        }
        public Builder serviceUrl(@Nullable Object serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public OracleCloudStorageLinkedServiceResponse build() {
            return new OracleCloudStorageLinkedServiceResponse(accessKeyId, annotations, connectVia, description, encryptedCredential, parameters, secretAccessKey, serviceUrl, type);
        }
    }
}
