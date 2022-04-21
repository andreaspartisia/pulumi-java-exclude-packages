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
 * Dynamics CRM linked service.
 * 
 */
public final class DynamicsCrmLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final DynamicsCrmLinkedServiceResponse Empty = new DynamicsCrmLinkedServiceResponse();

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable List<Object> annotations;

    public Optional<List<Object>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The authentication type to connect to Dynamics CRM server. &#39;Office365&#39; for online scenario, &#39;Ifd&#39; for on-premises with Ifd scenario, &#39;AADServicePrincipal&#39; for Server-To-Server authentication in online scenario. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="authenticationType", required=true)
    private Object authenticationType;

    public Object authenticationType() {
        return this.authenticationType;
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * The deployment type of the Dynamics CRM instance. &#39;Online&#39; for Dynamics CRM Online and &#39;OnPremisesWithIfd&#39; for Dynamics CRM on-premises with Ifd. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="deploymentType", required=true)
    private Object deploymentType;

    public Object deploymentType() {
        return this.deploymentType;
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * The host name of the on-premises Dynamics CRM server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="hostName")
    private @Nullable Object hostName;

    public Optional<Object> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * The organization name of the Dynamics CRM instance. The property is required for on-prem and required for online when there are more than one Dynamics CRM instances associated with the user. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="organizationName")
    private @Nullable Object organizationName;

    public Optional<Object> organizationName() {
        return Optional.ofNullable(this.organizationName);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Optional<Map<String,ParameterSpecificationResponse>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Password to access the Dynamics CRM instance.
     * 
     */
    @Import(name="password")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The port of on-premises Dynamics CRM server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="port")
    private @Nullable Object port;

    public Optional<Object> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is &#39;ServicePrincipalKey&#39;, servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is &#39;ServicePrincipalCert&#39;, servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     */
    @Import(name="servicePrincipalCredential")
    private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential;

    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> servicePrincipalCredential() {
        return Optional.ofNullable(this.servicePrincipalCredential);
    }

    /**
     * The service principal credential type to use in Server-To-Server authentication. &#39;ServicePrincipalKey&#39; for key/secret, &#39;ServicePrincipalCert&#39; for certificate. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalCredentialType")
    private @Nullable Object servicePrincipalCredentialType;

    public Optional<Object> servicePrincipalCredentialType() {
        return Optional.ofNullable(this.servicePrincipalCredentialType);
    }

    /**
     * The client ID of the application in Azure Active Directory used for Server-To-Server authentication. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Object servicePrincipalId;

    public Optional<Object> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The URL to the Microsoft Dynamics CRM server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="serviceUri")
    private @Nullable Object serviceUri;

    public Optional<Object> serviceUri() {
        return Optional.ofNullable(this.serviceUri);
    }

    /**
     * Type of linked service.
     * Expected value is &#39;DynamicsCrm&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * User name to access the Dynamics CRM instance. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="username")
    private @Nullable Object username;

    public Optional<Object> username() {
        return Optional.ofNullable(this.username);
    }

    private DynamicsCrmLinkedServiceResponse() {}

    private DynamicsCrmLinkedServiceResponse(DynamicsCrmLinkedServiceResponse $) {
        this.annotations = $.annotations;
        this.authenticationType = $.authenticationType;
        this.connectVia = $.connectVia;
        this.deploymentType = $.deploymentType;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.hostName = $.hostName;
        this.organizationName = $.organizationName;
        this.parameters = $.parameters;
        this.password = $.password;
        this.port = $.port;
        this.servicePrincipalCredential = $.servicePrincipalCredential;
        this.servicePrincipalCredentialType = $.servicePrincipalCredentialType;
        this.servicePrincipalId = $.servicePrincipalId;
        this.serviceUri = $.serviceUri;
        this.type = $.type;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicsCrmLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicsCrmLinkedServiceResponse $;

        public Builder() {
            $ = new DynamicsCrmLinkedServiceResponse();
        }

        public Builder(DynamicsCrmLinkedServiceResponse defaults) {
            $ = new DynamicsCrmLinkedServiceResponse(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder authenticationType(Object authenticationType) {
            $.authenticationType = authenticationType;
            return this;
        }

        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder deploymentType(Object deploymentType) {
            $.deploymentType = deploymentType;
            return this;
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder hostName(@Nullable Object hostName) {
            $.hostName = hostName;
            return this;
        }

        public Builder organizationName(@Nullable Object organizationName) {
            $.organizationName = organizationName;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder password(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> password) {
            $.password = password;
            return this;
        }

        public Builder password(AzureKeyVaultSecretReferenceResponse password) {
            return password(Either.ofLeft(password));
        }

        public Builder password(SecureStringResponse password) {
            return password(Either.ofRight(password));
        }

        public Builder port(@Nullable Object port) {
            $.port = port;
            return this;
        }

        public Builder servicePrincipalCredential(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalCredential) {
            $.servicePrincipalCredential = servicePrincipalCredential;
            return this;
        }

        public Builder servicePrincipalCredential(AzureKeyVaultSecretReferenceResponse servicePrincipalCredential) {
            return servicePrincipalCredential(Either.ofLeft(servicePrincipalCredential));
        }

        public Builder servicePrincipalCredential(SecureStringResponse servicePrincipalCredential) {
            return servicePrincipalCredential(Either.ofRight(servicePrincipalCredential));
        }

        public Builder servicePrincipalCredentialType(@Nullable Object servicePrincipalCredentialType) {
            $.servicePrincipalCredentialType = servicePrincipalCredentialType;
            return this;
        }

        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder serviceUri(@Nullable Object serviceUri) {
            $.serviceUri = serviceUri;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder username(@Nullable Object username) {
            $.username = username;
            return this;
        }

        public DynamicsCrmLinkedServiceResponse build() {
            $.authenticationType = Objects.requireNonNull($.authenticationType, "expected parameter 'authenticationType' to be non-null");
            $.deploymentType = Objects.requireNonNull($.deploymentType, "expected parameter 'deploymentType' to be non-null");
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
