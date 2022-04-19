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
 * Azure Data Lake Analytics linked service.
 * 
 */
public final class AzureDataLakeAnalyticsLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureDataLakeAnalyticsLinkedServiceResponse Empty = new AzureDataLakeAnalyticsLinkedServiceResponse();

    /**
     * The Azure Data Lake Analytics account name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accountName", required=true)
      private final Object accountName;

    public Object accountName() {
        return this.accountName;
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
     * Azure Data Lake Analytics URI Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="dataLakeAnalyticsUri")
      private final @Nullable Object dataLakeAnalyticsUri;

    public Optional<Object> dataLakeAnalyticsUri() {
        return this.dataLakeAnalyticsUri == null ? Optional.empty() : Optional.ofNullable(this.dataLakeAnalyticsUri);
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
     * Data Lake Analytics account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="resourceGroupName")
      private final @Nullable Object resourceGroupName;

    public Optional<Object> resourceGroupName() {
        return this.resourceGroupName == null ? Optional.empty() : Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The ID of the application used to authenticate against the Azure Data Lake Analytics account. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Object servicePrincipalId;

    public Optional<Object> servicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The Key of the application used to authenticate against the Azure Data Lake Analytics account.
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey() {
        return this.servicePrincipalKey == null ? null : this.servicePrincipalKey;
    }

    /**
     * Data Lake Analytics account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable Object subscriptionId;

    public Optional<Object> subscriptionId() {
        return this.subscriptionId == null ? Optional.empty() : Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant", required=true)
      private final Object tenant;

    public Object tenant() {
        return this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureDataLakeAnalytics'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AzureDataLakeAnalyticsLinkedServiceResponse(
        Object accountName,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object dataLakeAnalyticsUri,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object resourceGroupName,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object subscriptionId,
        Object tenant,
        String type) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.resourceGroupName = resourceGroupName;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.subscriptionId = subscriptionId;
        this.tenant = Objects.requireNonNull(tenant, "expected parameter 'tenant' to be non-null");
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private AzureDataLakeAnalyticsLinkedServiceResponse() {
        this.accountName = null;
        this.annotations = List.of();
        this.connectVia = null;
        this.dataLakeAnalyticsUri = null;
        this.description = null;
        this.encryptedCredential = null;
        this.parameters = Map.of();
        this.resourceGroupName = null;
        this.servicePrincipalId = null;
        this.servicePrincipalKey = null;
        this.subscriptionId = null;
        this.tenant = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeAnalyticsLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object accountName;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object dataLakeAnalyticsUri;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object resourceGroupName;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object subscriptionId;
        private Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeAnalyticsLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.dataLakeAnalyticsUri = defaults.dataLakeAnalyticsUri;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder accountName(Object accountName) {
            this.accountName = Objects.requireNonNull(accountName);
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
        public Builder dataLakeAnalyticsUri(@Nullable Object dataLakeAnalyticsUri) {
            this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
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
        public Builder resourceGroupName(@Nullable Object resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }
        public Builder subscriptionId(@Nullable Object subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder tenant(Object tenant) {
            this.tenant = Objects.requireNonNull(tenant);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureDataLakeAnalyticsLinkedServiceResponse build() {
            return new AzureDataLakeAnalyticsLinkedServiceResponse(accountName, annotations, connectVia, dataLakeAnalyticsUri, description, encryptedCredential, parameters, resourceGroupName, servicePrincipalId, servicePrincipalKey, subscriptionId, tenant, type);
        }
    }
}
