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
 * Amazon Marketplace Web Service linked service.
 * 
 */
public final class AmazonMWSLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AmazonMWSLinkedServiceArgs Empty = new AmazonMWSLinkedServiceArgs();

    /**
     * The access key id used to access data.
     * 
     */
    @Import(name="accessKeyId", required=true)
    private Output<Object> accessKeyId;

    public Output<Object> accessKeyId() {
        return this.accessKeyId;
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
     * The endpoint of the Amazon MWS server, (i.e. mws.amazonservices.com)
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<Object> endpoint;

    public Output<Object> endpoint() {
        return this.endpoint;
    }

    /**
     * The Amazon Marketplace ID you want to retrieve data from. To retrieve data from multiple Marketplace IDs, separate them with a comma (,). (i.e. A2EUQ1WTGCTBG2)
     * 
     */
    @Import(name="marketplaceID", required=true)
    private Output<Object> marketplaceID;

    public Output<Object> marketplaceID() {
        return this.marketplaceID;
    }

    /**
     * The Amazon MWS authentication token.
     * 
     */
    @Import(name="mwsAuthToken")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> mwsAuthToken;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> mwsAuthToken() {
        return Optional.ofNullable(this.mwsAuthToken);
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
     * The secret key used to access data.
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretKey;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * The Amazon seller ID.
     * 
     */
    @Import(name="sellerID", required=true)
    private Output<Object> sellerID;

    public Output<Object> sellerID() {
        return this.sellerID;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;AmazonMWS&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Specifies whether the data source endpoints are encrypted using HTTPS. The default value is true.
     * 
     */
    @Import(name="useEncryptedEndpoints")
    private @Nullable Output<Object> useEncryptedEndpoints;

    public Optional<Output<Object>> useEncryptedEndpoints() {
        return Optional.ofNullable(this.useEncryptedEndpoints);
    }

    /**
     * Specifies whether to require the host name in the server&#39;s certificate to match the host name of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="useHostVerification")
    private @Nullable Output<Object> useHostVerification;

    public Optional<Output<Object>> useHostVerification() {
        return Optional.ofNullable(this.useHostVerification);
    }

    /**
     * Specifies whether to verify the identity of the server when connecting over SSL. The default value is true.
     * 
     */
    @Import(name="usePeerVerification")
    private @Nullable Output<Object> usePeerVerification;

    public Optional<Output<Object>> usePeerVerification() {
        return Optional.ofNullable(this.usePeerVerification);
    }

    private AmazonMWSLinkedServiceArgs() {}

    private AmazonMWSLinkedServiceArgs(AmazonMWSLinkedServiceArgs $) {
        this.accessKeyId = $.accessKeyId;
        this.annotations = $.annotations;
        this.connectVia = $.connectVia;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.endpoint = $.endpoint;
        this.marketplaceID = $.marketplaceID;
        this.mwsAuthToken = $.mwsAuthToken;
        this.parameters = $.parameters;
        this.secretKey = $.secretKey;
        this.sellerID = $.sellerID;
        this.type = $.type;
        this.useEncryptedEndpoints = $.useEncryptedEndpoints;
        this.useHostVerification = $.useHostVerification;
        this.usePeerVerification = $.usePeerVerification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AmazonMWSLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AmazonMWSLinkedServiceArgs $;

        public Builder() {
            $ = new AmazonMWSLinkedServiceArgs();
        }

        public Builder(AmazonMWSLinkedServiceArgs defaults) {
            $ = new AmazonMWSLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKeyId(Output<Object> accessKeyId) {
            $.accessKeyId = accessKeyId;
            return this;
        }

        public Builder accessKeyId(Object accessKeyId) {
            return accessKeyId(Output.of(accessKeyId));
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

        public Builder endpoint(Output<Object> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(Object endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder marketplaceID(Output<Object> marketplaceID) {
            $.marketplaceID = marketplaceID;
            return this;
        }

        public Builder marketplaceID(Object marketplaceID) {
            return marketplaceID(Output.of(marketplaceID));
        }

        public Builder mwsAuthToken(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> mwsAuthToken) {
            $.mwsAuthToken = mwsAuthToken;
            return this;
        }

        public Builder mwsAuthToken(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> mwsAuthToken) {
            return mwsAuthToken(Output.of(mwsAuthToken));
        }

        public Builder mwsAuthToken(AzureKeyVaultSecretReferenceArgs mwsAuthToken) {
            return mwsAuthToken(Either.ofLeft(mwsAuthToken));
        }

        public Builder mwsAuthToken(SecureStringArgs mwsAuthToken) {
            return mwsAuthToken(Either.ofRight(mwsAuthToken));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder secretKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        public Builder secretKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public Builder secretKey(AzureKeyVaultSecretReferenceArgs secretKey) {
            return secretKey(Either.ofLeft(secretKey));
        }

        public Builder secretKey(SecureStringArgs secretKey) {
            return secretKey(Either.ofRight(secretKey));
        }

        public Builder sellerID(Output<Object> sellerID) {
            $.sellerID = sellerID;
            return this;
        }

        public Builder sellerID(Object sellerID) {
            return sellerID(Output.of(sellerID));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder useEncryptedEndpoints(@Nullable Output<Object> useEncryptedEndpoints) {
            $.useEncryptedEndpoints = useEncryptedEndpoints;
            return this;
        }

        public Builder useEncryptedEndpoints(Object useEncryptedEndpoints) {
            return useEncryptedEndpoints(Output.of(useEncryptedEndpoints));
        }

        public Builder useHostVerification(@Nullable Output<Object> useHostVerification) {
            $.useHostVerification = useHostVerification;
            return this;
        }

        public Builder useHostVerification(Object useHostVerification) {
            return useHostVerification(Output.of(useHostVerification));
        }

        public Builder usePeerVerification(@Nullable Output<Object> usePeerVerification) {
            $.usePeerVerification = usePeerVerification;
            return this;
        }

        public Builder usePeerVerification(Object usePeerVerification) {
            return usePeerVerification(Output.of(usePeerVerification));
        }

        public AmazonMWSLinkedServiceArgs build() {
            $.accessKeyId = Objects.requireNonNull($.accessKeyId, "expected parameter 'accessKeyId' to be non-null");
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.marketplaceID = Objects.requireNonNull($.marketplaceID, "expected parameter 'marketplaceID' to be non-null");
            $.sellerID = Objects.requireNonNull($.sellerID, "expected parameter 'sellerID' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
