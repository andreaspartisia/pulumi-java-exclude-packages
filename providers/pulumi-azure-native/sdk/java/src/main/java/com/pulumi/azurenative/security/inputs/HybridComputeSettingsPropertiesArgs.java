// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.enums.AutoProvision;
import com.pulumi.azurenative.security.inputs.ProxyServerPropertiesArgs;
import com.pulumi.azurenative.security.inputs.ServicePrincipalPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for hybrid compute management
 * 
 */
public final class HybridComputeSettingsPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final HybridComputeSettingsPropertiesArgs Empty = new HybridComputeSettingsPropertiesArgs();

    /**
     * Whether or not to automatically install Azure Arc (hybrid compute) agents on machines
     * 
     */
    @Import(name="autoProvision", required=true)
    private Output<Either<String,AutoProvision>> autoProvision;

    public Output<Either<String,AutoProvision>> autoProvision() {
        return this.autoProvision;
    }

    /**
     * For a non-Azure machine that is not connected directly to the internet, specify a proxy server that the non-Azure machine can use.
     * 
     */
    @Import(name="proxyServer")
    private @Nullable Output<ProxyServerPropertiesArgs> proxyServer;

    public Optional<Output<ProxyServerPropertiesArgs>> proxyServer() {
        return Optional.ofNullable(this.proxyServer);
    }

    /**
     * The location where the metadata of machines will be stored
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The name of the resource group where Arc (Hybrid Compute) connectors are connected.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * An object to access resources that are secured by an Azure AD tenant.
     * 
     */
    @Import(name="servicePrincipal")
    private @Nullable Output<ServicePrincipalPropertiesArgs> servicePrincipal;

    public Optional<Output<ServicePrincipalPropertiesArgs>> servicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    private HybridComputeSettingsPropertiesArgs() {}

    private HybridComputeSettingsPropertiesArgs(HybridComputeSettingsPropertiesArgs $) {
        this.autoProvision = $.autoProvision;
        this.proxyServer = $.proxyServer;
        this.region = $.region;
        this.resourceGroupName = $.resourceGroupName;
        this.servicePrincipal = $.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HybridComputeSettingsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HybridComputeSettingsPropertiesArgs $;

        public Builder() {
            $ = new HybridComputeSettingsPropertiesArgs();
        }

        public Builder(HybridComputeSettingsPropertiesArgs defaults) {
            $ = new HybridComputeSettingsPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoProvision(Output<Either<String,AutoProvision>> autoProvision) {
            $.autoProvision = autoProvision;
            return this;
        }

        public Builder autoProvision(Either<String,AutoProvision> autoProvision) {
            return autoProvision(Output.of(autoProvision));
        }

        public Builder autoProvision(String autoProvision) {
            return autoProvision(Either.ofLeft(autoProvision));
        }

        public Builder autoProvision(AutoProvision autoProvision) {
            return autoProvision(Either.ofRight(autoProvision));
        }

        public Builder proxyServer(@Nullable Output<ProxyServerPropertiesArgs> proxyServer) {
            $.proxyServer = proxyServer;
            return this;
        }

        public Builder proxyServer(ProxyServerPropertiesArgs proxyServer) {
            return proxyServer(Output.of(proxyServer));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder servicePrincipal(@Nullable Output<ServicePrincipalPropertiesArgs> servicePrincipal) {
            $.servicePrincipal = servicePrincipal;
            return this;
        }

        public Builder servicePrincipal(ServicePrincipalPropertiesArgs servicePrincipal) {
            return servicePrincipal(Output.of(servicePrincipal));
        }

        public HybridComputeSettingsPropertiesArgs build() {
            $.autoProvision = Objects.requireNonNull($.autoProvision, "expected parameter 'autoProvision' to be non-null");
            return $;
        }
    }

}
