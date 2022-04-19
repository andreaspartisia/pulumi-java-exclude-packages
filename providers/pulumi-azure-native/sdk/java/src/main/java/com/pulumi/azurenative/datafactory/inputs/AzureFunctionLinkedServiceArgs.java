// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Function linked service.
 * 
 */
public final class AzureFunctionLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFunctionLinkedServiceArgs Empty = new AzureFunctionLinkedServiceArgs();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * Type of authentication (Required to specify MSI) used to connect to AzureFunction. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authentication")
      private final @Nullable Output<Object> authentication;

    public Output<Object> authentication() {
        return this.authentication == null ? Codegen.empty() : this.authentication;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Output<IntegrationRuntimeReferenceArgs> connectVia() {
        return this.connectVia == null ? Codegen.empty() : this.connectVia;
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable Output<CredentialReferenceArgs> credential;

    public Output<CredentialReferenceArgs> credential() {
        return this.credential == null ? Codegen.empty() : this.credential;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Output<Object> encryptedCredential;

    public Output<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Codegen.empty() : this.encryptedCredential;
    }

    /**
     * The endpoint of the Azure Function App. URL will be in the format https://<accountName>.azurewebsites.net.
     * 
     */
    @Import(name="functionAppUrl", required=true)
      private final Output<Object> functionAppUrl;

    public Output<Object> functionAppUrl() {
        return this.functionAppUrl;
    }

    /**
     * Function or Host key for Azure Function App.
     * 
     */
    @Import(name="functionKey")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> functionKey;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> functionKey() {
        return this.functionKey == null ? Codegen.empty() : this.functionKey;
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Allowed token audiences for azure function.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<Object> resourceId;

    public Output<Object> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    /**
     * Type of linked service.
     * Expected value is 'AzureFunction'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public AzureFunctionLinkedServiceArgs(
        @Nullable Output<List<Object>> annotations,
        @Nullable Output<Object> authentication,
        @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia,
        @Nullable Output<CredentialReferenceArgs> credential,
        @Nullable Output<String> description,
        @Nullable Output<Object> encryptedCredential,
        Output<Object> functionAppUrl,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> functionKey,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Object> resourceId,
        Output<String> type) {
        this.annotations = annotations;
        this.authentication = authentication;
        this.connectVia = connectVia;
        this.credential = credential;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.functionAppUrl = Objects.requireNonNull(functionAppUrl, "expected parameter 'functionAppUrl' to be non-null");
        this.functionKey = functionKey;
        this.parameters = parameters;
        this.resourceId = resourceId;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private AzureFunctionLinkedServiceArgs() {
        this.annotations = Codegen.empty();
        this.authentication = Codegen.empty();
        this.connectVia = Codegen.empty();
        this.credential = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptedCredential = Codegen.empty();
        this.functionAppUrl = Codegen.empty();
        this.functionKey = Codegen.empty();
        this.parameters = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private @Nullable Output<Object> authentication;
        private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;
        private @Nullable Output<CredentialReferenceArgs> credential;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> encryptedCredential;
        private Output<Object> functionAppUrl;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> functionKey;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Object> resourceId;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionLinkedServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.authentication = defaults.authentication;
    	      this.connectVia = defaults.connectVia;
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.functionAppUrl = defaults.functionAppUrl;
    	      this.functionKey = defaults.functionKey;
    	      this.parameters = defaults.parameters;
    	      this.resourceId = defaults.resourceId;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder authentication(@Nullable Output<Object> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable Object authentication) {
            this.authentication = Codegen.ofNullable(authentication);
            return this;
        }
        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceArgs connectVia) {
            this.connectVia = Codegen.ofNullable(connectVia);
            return this;
        }
        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            this.credential = credential;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceArgs credential) {
            this.credential = Codegen.ofNullable(credential);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = Codegen.ofNullable(encryptedCredential);
            return this;
        }
        public Builder functionAppUrl(Output<Object> functionAppUrl) {
            this.functionAppUrl = Objects.requireNonNull(functionAppUrl);
            return this;
        }
        public Builder functionAppUrl(Object functionAppUrl) {
            this.functionAppUrl = Output.of(Objects.requireNonNull(functionAppUrl));
            return this;
        }
        public Builder functionKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> functionKey) {
            this.functionKey = functionKey;
            return this;
        }
        public Builder functionKey(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> functionKey) {
            this.functionKey = Codegen.ofNullable(functionKey);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder resourceId(@Nullable Output<Object> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable Object resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AzureFunctionLinkedServiceArgs build() {
            return new AzureFunctionLinkedServiceArgs(annotations, authentication, connectVia, credential, description, encryptedCredential, functionAppUrl, functionKey, parameters, resourceId, type);
        }
    }
}
