// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.healthcareapis.inputs;

import com.pulumi.azurenative.healthcareapis.enums.PublicNetworkAccess;
import com.pulumi.azurenative.healthcareapis.inputs.PrivateEndpointConnectionArgs;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceAccessPolicyEntryArgs;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceAcrConfigurationInfoArgs;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceAuthenticationConfigurationInfoArgs;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceCorsConfigurationInfoArgs;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceCosmosDbConfigurationInfoArgs;
import com.pulumi.azurenative.healthcareapis.inputs.ServiceExportConfigurationInfoArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of a service instance.
 * 
 */
public final class ServicesPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicesPropertiesArgs Empty = new ServicesPropertiesArgs();

    /**
     * The access policies of the service instance.
     * 
     */
    @Import(name="accessPolicies")
    private @Nullable Output<List<ServiceAccessPolicyEntryArgs>> accessPolicies;

    public Optional<Output<List<ServiceAccessPolicyEntryArgs>>> accessPolicies() {
        return Optional.ofNullable(this.accessPolicies);
    }

    /**
     * The azure container registry settings used for convert data operation of the service instance.
     * 
     */
    @Import(name="acrConfiguration")
    private @Nullable Output<ServiceAcrConfigurationInfoArgs> acrConfiguration;

    public Optional<Output<ServiceAcrConfigurationInfoArgs>> acrConfiguration() {
        return Optional.ofNullable(this.acrConfiguration);
    }

    /**
     * The authentication configuration for the service instance.
     * 
     */
    @Import(name="authenticationConfiguration")
    private @Nullable Output<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration;

    public Optional<Output<ServiceAuthenticationConfigurationInfoArgs>> authenticationConfiguration() {
        return Optional.ofNullable(this.authenticationConfiguration);
    }

    /**
     * The settings for the CORS configuration of the service instance.
     * 
     */
    @Import(name="corsConfiguration")
    private @Nullable Output<ServiceCorsConfigurationInfoArgs> corsConfiguration;

    public Optional<Output<ServiceCorsConfigurationInfoArgs>> corsConfiguration() {
        return Optional.ofNullable(this.corsConfiguration);
    }

    /**
     * The settings for the Cosmos DB database backing the service.
     * 
     */
    @Import(name="cosmosDbConfiguration")
    private @Nullable Output<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration;

    public Optional<Output<ServiceCosmosDbConfigurationInfoArgs>> cosmosDbConfiguration() {
        return Optional.ofNullable(this.cosmosDbConfiguration);
    }

    /**
     * The settings for the export operation of the service instance.
     * 
     */
    @Import(name="exportConfiguration")
    private @Nullable Output<ServiceExportConfigurationInfoArgs> exportConfiguration;

    public Optional<Output<ServiceExportConfigurationInfoArgs>> exportConfiguration() {
        return Optional.ofNullable(this.exportConfiguration);
    }

    /**
     * The list of private endpoint connections that are set up for this resource.
     * 
     */
    @Import(name="privateEndpointConnections")
    private @Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections;

    public Optional<Output<List<PrivateEndpointConnectionArgs>>> privateEndpointConnections() {
        return Optional.ofNullable(this.privateEndpointConnections);
    }

    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    @Import(name="publicNetworkAccess")
    private @Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Optional<Output<Either<String,PublicNetworkAccess>>> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    private ServicesPropertiesArgs() {}

    private ServicesPropertiesArgs(ServicesPropertiesArgs $) {
        this.accessPolicies = $.accessPolicies;
        this.acrConfiguration = $.acrConfiguration;
        this.authenticationConfiguration = $.authenticationConfiguration;
        this.corsConfiguration = $.corsConfiguration;
        this.cosmosDbConfiguration = $.cosmosDbConfiguration;
        this.exportConfiguration = $.exportConfiguration;
        this.privateEndpointConnections = $.privateEndpointConnections;
        this.publicNetworkAccess = $.publicNetworkAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicesPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicesPropertiesArgs $;

        public Builder() {
            $ = new ServicesPropertiesArgs();
        }

        public Builder(ServicesPropertiesArgs defaults) {
            $ = new ServicesPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessPolicies(@Nullable Output<List<ServiceAccessPolicyEntryArgs>> accessPolicies) {
            $.accessPolicies = accessPolicies;
            return this;
        }

        public Builder accessPolicies(List<ServiceAccessPolicyEntryArgs> accessPolicies) {
            return accessPolicies(Output.of(accessPolicies));
        }

        public Builder accessPolicies(ServiceAccessPolicyEntryArgs... accessPolicies) {
            return accessPolicies(List.of(accessPolicies));
        }

        public Builder acrConfiguration(@Nullable Output<ServiceAcrConfigurationInfoArgs> acrConfiguration) {
            $.acrConfiguration = acrConfiguration;
            return this;
        }

        public Builder acrConfiguration(ServiceAcrConfigurationInfoArgs acrConfiguration) {
            return acrConfiguration(Output.of(acrConfiguration));
        }

        public Builder authenticationConfiguration(@Nullable Output<ServiceAuthenticationConfigurationInfoArgs> authenticationConfiguration) {
            $.authenticationConfiguration = authenticationConfiguration;
            return this;
        }

        public Builder authenticationConfiguration(ServiceAuthenticationConfigurationInfoArgs authenticationConfiguration) {
            return authenticationConfiguration(Output.of(authenticationConfiguration));
        }

        public Builder corsConfiguration(@Nullable Output<ServiceCorsConfigurationInfoArgs> corsConfiguration) {
            $.corsConfiguration = corsConfiguration;
            return this;
        }

        public Builder corsConfiguration(ServiceCorsConfigurationInfoArgs corsConfiguration) {
            return corsConfiguration(Output.of(corsConfiguration));
        }

        public Builder cosmosDbConfiguration(@Nullable Output<ServiceCosmosDbConfigurationInfoArgs> cosmosDbConfiguration) {
            $.cosmosDbConfiguration = cosmosDbConfiguration;
            return this;
        }

        public Builder cosmosDbConfiguration(ServiceCosmosDbConfigurationInfoArgs cosmosDbConfiguration) {
            return cosmosDbConfiguration(Output.of(cosmosDbConfiguration));
        }

        public Builder exportConfiguration(@Nullable Output<ServiceExportConfigurationInfoArgs> exportConfiguration) {
            $.exportConfiguration = exportConfiguration;
            return this;
        }

        public Builder exportConfiguration(ServiceExportConfigurationInfoArgs exportConfiguration) {
            return exportConfiguration(Output.of(exportConfiguration));
        }

        public Builder privateEndpointConnections(@Nullable Output<List<PrivateEndpointConnectionArgs>> privateEndpointConnections) {
            $.privateEndpointConnections = privateEndpointConnections;
            return this;
        }

        public Builder privateEndpointConnections(List<PrivateEndpointConnectionArgs> privateEndpointConnections) {
            return privateEndpointConnections(Output.of(privateEndpointConnections));
        }

        public Builder privateEndpointConnections(PrivateEndpointConnectionArgs... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }

        public Builder publicNetworkAccess(@Nullable Output<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            $.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder publicNetworkAccess(Either<String,PublicNetworkAccess> publicNetworkAccess) {
            return publicNetworkAccess(Output.of(publicNetworkAccess));
        }

        public Builder publicNetworkAccess(String publicNetworkAccess) {
            return publicNetworkAccess(Either.ofLeft(publicNetworkAccess));
        }

        public Builder publicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
            return publicNetworkAccess(Either.ofRight(publicNetworkAccess));
        }

        public ServicesPropertiesArgs build() {
            return $;
        }
    }

}
