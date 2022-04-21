// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
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
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Data Lake Analytics linked service.
 * 
 */
public final class AzureDataLakeAnalyticsLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureDataLakeAnalyticsLinkedServiceArgs Empty = new AzureDataLakeAnalyticsLinkedServiceArgs();

    /**
     * The Azure Data Lake Analytics account name. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="accountName", required=true)
    private Output<Object> accountName;

    public Output<Object> accountName() {
        return this.accountName;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Azure Data Lake Analytics URI Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="dataLakeAnalyticsUri")
    private @Nullable Output<Object> dataLakeAnalyticsUri;

    public Optional<Output<Object>> dataLakeAnalyticsUri() {
        return Optional.ofNullable(this.dataLakeAnalyticsUri);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Data Lake Analytics account resource group name (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<Object> resourceGroupName;

    public Optional<Output<Object>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The ID of the application used to authenticate against the Azure Data Lake Analytics account. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<Object> servicePrincipalId;

    public Optional<Output<Object>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The Key of the application used to authenticate against the Azure Data Lake Analytics account.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * Data Lake Analytics account subscription ID (if different from Data Factory account). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<Object> subscriptionId;

    public Optional<Output<Object>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant", required=true)
    private Output<Object> tenant;

    public Output<Object> tenant() {
        return this.tenant;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AzureDataLakeAnalytics&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private AzureDataLakeAnalyticsLinkedServiceArgs() {}

    private AzureDataLakeAnalyticsLinkedServiceArgs(AzureDataLakeAnalyticsLinkedServiceArgs $) {
        this.accountName = $.accountName;
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.dataLakeAnalyticsUri = $.dataLakeAnalyticsUri;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.parameters = $.parameters;
        this.resourceGroupName = $.resourceGroupName;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.subscriptionId = $.subscriptionId;
        this.tenant = $.tenant;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureDataLakeAnalyticsLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureDataLakeAnalyticsLinkedServiceArgs $;

        public Builder() {
            $ = new AzureDataLakeAnalyticsLinkedServiceArgs();
        }

        public Builder(AzureDataLakeAnalyticsLinkedServiceArgs defaults) {
            $ = new AzureDataLakeAnalyticsLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<Object> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(Object accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder dataLakeAnalyticsUri(@Nullable Output<Object> dataLakeAnalyticsUri) {
            $.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
            return this;
        }

        public Builder dataLakeAnalyticsUri(Object dataLakeAnalyticsUri) {
            return dataLakeAnalyticsUri(Output.of(dataLakeAnalyticsUri));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder resourceGroupName(@Nullable Output<Object> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(Object resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalId(Object servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        public Builder servicePrincipalKey(AzureKeyVaultSecretReferenceArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofLeft(servicePrincipalKey));
        }

        public Builder servicePrincipalKey(SecureStringArgs servicePrincipalKey) {
            return servicePrincipalKey(Either.ofRight(servicePrincipalKey));
        }

        public Builder subscriptionId(@Nullable Output<Object> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(Object subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public Builder tenant(Output<Object> tenant) {
            $.tenant = tenant;
            return this;
        }

        public Builder tenant(Object tenant) {
            return tenant(Output.of(tenant));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureDataLakeAnalyticsLinkedServiceArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.tenant = Objects.requireNonNull($.tenant, "expected parameter 'tenant' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
