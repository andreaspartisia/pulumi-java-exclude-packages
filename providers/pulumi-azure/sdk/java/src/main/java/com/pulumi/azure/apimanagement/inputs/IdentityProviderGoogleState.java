// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IdentityProviderGoogleState extends com.pulumi.resources.ResourceArgs {

    public static final IdentityProviderGoogleState Empty = new IdentityProviderGoogleState();

    /**
     * The Name of the API Management Service where this Google Identity Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="apiManagementName")
    private @Nullable Output<String> apiManagementName;

    /**
     * @return The Name of the API Management Service where this Google Identity Provider should be created. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> apiManagementName() {
        return Optional.ofNullable(this.apiManagementName);
    }

    /**
     * Client Id for Google Sign-in.
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return Client Id for Google Sign-in.
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * Client secret for Google Sign-in.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return Client secret for Google Sign-in.
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    private IdentityProviderGoogleState() {}

    private IdentityProviderGoogleState(IdentityProviderGoogleState $) {
        this.apiManagementName = $.apiManagementName;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityProviderGoogleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityProviderGoogleState $;

        public Builder() {
            $ = new IdentityProviderGoogleState();
        }

        public Builder(IdentityProviderGoogleState defaults) {
            $ = new IdentityProviderGoogleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiManagementName The Name of the API Management Service where this Google Identity Provider should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(@Nullable Output<String> apiManagementName) {
            $.apiManagementName = apiManagementName;
            return this;
        }

        /**
         * @param apiManagementName The Name of the API Management Service where this Google Identity Provider should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder apiManagementName(String apiManagementName) {
            return apiManagementName(Output.of(apiManagementName));
        }

        /**
         * @param clientId Client Id for Google Sign-in.
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Client Id for Google Sign-in.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Client secret for Google Sign-in.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Client secret for Google Sign-in.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the API Management Service exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public IdentityProviderGoogleState build() {
            return $;
        }
    }

}
