// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.azurenative.apimanagement.enums.IdentityProviderType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IdentityProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityProviderArgs Empty = new IdentityProviderArgs();

    /**
     * List of Allowed Tenants when configuring Azure Active Directory login.
     * 
     */
    @Import(name="allowedTenants")
    private @Nullable Output<List<String>> allowedTenants;

    public Optional<Output<List<String>>> allowedTenants() {
        return Optional.ofNullable(this.allowedTenants);
    }

    /**
     * OpenID Connect discovery endpoint hostname for AAD or AAD B2C.
     * 
     */
    @Import(name="authority")
    private @Nullable Output<String> authority;

    public Optional<Output<String>> authority() {
        return Optional.ofNullable(this.authority);
    }

    /**
     * Client Id of the Application in the external Identity Provider. It is App ID for Facebook login, Client ID for Google login, App ID for Microsoft.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Client secret of the Application in external Identity Provider, used to authenticate login request. For example, it is App Secret for Facebook login, API Key for Google login, Public Key for Microsoft. This property will not be filled on &#39;GET&#39; operations! Use &#39;/listSecrets&#39; POST request to get the value.
     * 
     */
    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    /**
     * Identity Provider Type identifier.
     * 
     */
    @Import(name="identityProviderName")
    private @Nullable Output<String> identityProviderName;

    public Optional<Output<String>> identityProviderName() {
        return Optional.ofNullable(this.identityProviderName);
    }

    /**
     * Password Reset Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @Import(name="passwordResetPolicyName")
    private @Nullable Output<String> passwordResetPolicyName;

    public Optional<Output<String>> passwordResetPolicyName() {
        return Optional.ofNullable(this.passwordResetPolicyName);
    }

    /**
     * Profile Editing Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @Import(name="profileEditingPolicyName")
    private @Nullable Output<String> profileEditingPolicyName;

    public Optional<Output<String>> profileEditingPolicyName() {
        return Optional.ofNullable(this.profileEditingPolicyName);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Signin Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @Import(name="signinPolicyName")
    private @Nullable Output<String> signinPolicyName;

    public Optional<Output<String>> signinPolicyName() {
        return Optional.ofNullable(this.signinPolicyName);
    }

    /**
     * The TenantId to use instead of Common when logging into Active Directory
     * 
     */
    @Import(name="signinTenant")
    private @Nullable Output<String> signinTenant;

    public Optional<Output<String>> signinTenant() {
        return Optional.ofNullable(this.signinTenant);
    }

    /**
     * Signup Policy Name. Only applies to AAD B2C Identity Provider.
     * 
     */
    @Import(name="signupPolicyName")
    private @Nullable Output<String> signupPolicyName;

    public Optional<Output<String>> signupPolicyName() {
        return Optional.ofNullable(this.signupPolicyName);
    }

    /**
     * Identity Provider Type identifier.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,IdentityProviderType>> type;

    public Optional<Output<Either<String,IdentityProviderType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private IdentityProviderArgs() {}

    private IdentityProviderArgs(IdentityProviderArgs $) {
        this.allowedTenants = $.allowedTenants;
        this.authority = $.authority;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.identityProviderName = $.identityProviderName;
        this.passwordResetPolicyName = $.passwordResetPolicyName;
        this.profileEditingPolicyName = $.profileEditingPolicyName;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.signinPolicyName = $.signinPolicyName;
        this.signinTenant = $.signinTenant;
        this.signupPolicyName = $.signupPolicyName;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityProviderArgs $;

        public Builder() {
            $ = new IdentityProviderArgs();
        }

        public Builder(IdentityProviderArgs defaults) {
            $ = new IdentityProviderArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedTenants(@Nullable Output<List<String>> allowedTenants) {
            $.allowedTenants = allowedTenants;
            return this;
        }

        public Builder allowedTenants(List<String> allowedTenants) {
            return allowedTenants(Output.of(allowedTenants));
        }

        public Builder allowedTenants(String... allowedTenants) {
            return allowedTenants(List.of(allowedTenants));
        }

        public Builder authority(@Nullable Output<String> authority) {
            $.authority = authority;
            return this;
        }

        public Builder authority(String authority) {
            return authority(Output.of(authority));
        }

        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public Builder identityProviderName(@Nullable Output<String> identityProviderName) {
            $.identityProviderName = identityProviderName;
            return this;
        }

        public Builder identityProviderName(String identityProviderName) {
            return identityProviderName(Output.of(identityProviderName));
        }

        public Builder passwordResetPolicyName(@Nullable Output<String> passwordResetPolicyName) {
            $.passwordResetPolicyName = passwordResetPolicyName;
            return this;
        }

        public Builder passwordResetPolicyName(String passwordResetPolicyName) {
            return passwordResetPolicyName(Output.of(passwordResetPolicyName));
        }

        public Builder profileEditingPolicyName(@Nullable Output<String> profileEditingPolicyName) {
            $.profileEditingPolicyName = profileEditingPolicyName;
            return this;
        }

        public Builder profileEditingPolicyName(String profileEditingPolicyName) {
            return profileEditingPolicyName(Output.of(profileEditingPolicyName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder signinPolicyName(@Nullable Output<String> signinPolicyName) {
            $.signinPolicyName = signinPolicyName;
            return this;
        }

        public Builder signinPolicyName(String signinPolicyName) {
            return signinPolicyName(Output.of(signinPolicyName));
        }

        public Builder signinTenant(@Nullable Output<String> signinTenant) {
            $.signinTenant = signinTenant;
            return this;
        }

        public Builder signinTenant(String signinTenant) {
            return signinTenant(Output.of(signinTenant));
        }

        public Builder signupPolicyName(@Nullable Output<String> signupPolicyName) {
            $.signupPolicyName = signupPolicyName;
            return this;
        }

        public Builder signupPolicyName(String signupPolicyName) {
            return signupPolicyName(Output.of(signupPolicyName));
        }

        public Builder type(@Nullable Output<Either<String,IdentityProviderType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,IdentityProviderType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(IdentityProviderType type) {
            return type(Either.ofRight(type));
        }

        public IdentityProviderArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
