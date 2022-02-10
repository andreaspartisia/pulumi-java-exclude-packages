// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.AzPowerShellSetupResponse;
import io.pulumi.azurenative.datafactory.inputs.CmdkeySetupResponse;
import io.pulumi.azurenative.datafactory.inputs.ComponentSetupResponse;
import io.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import io.pulumi.azurenative.datafactory.inputs.EnvironmentVariableSetupResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeCustomSetupScriptPropertiesResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeDataProxyPropertiesResponse;
import io.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeSsisCatalogInfoResponse;
import io.pulumi.azurenative.datafactory.inputs.PackageStoreResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationRuntimeSsisPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationRuntimeSsisPropertiesResponse Empty = new IntegrationRuntimeSsisPropertiesResponse();

    @InputImport(name="catalogInfo")
    private final @Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo;

    public Optional<IntegrationRuntimeSsisCatalogInfoResponse> getCatalogInfo() {
        return this.catalogInfo == null ? Optional.empty() : Optional.ofNullable(this.catalogInfo);
    }

    @InputImport(name="credential")
    private final @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> getCredential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
    }

    @InputImport(name="customSetupScriptProperties")
    private final @Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties;

    public Optional<IntegrationRuntimeCustomSetupScriptPropertiesResponse> getCustomSetupScriptProperties() {
        return this.customSetupScriptProperties == null ? Optional.empty() : Optional.ofNullable(this.customSetupScriptProperties);
    }

    @InputImport(name="dataProxyProperties")
    private final @Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties;

    public Optional<IntegrationRuntimeDataProxyPropertiesResponse> getDataProxyProperties() {
        return this.dataProxyProperties == null ? Optional.empty() : Optional.ofNullable(this.dataProxyProperties);
    }

    @InputImport(name="edition")
    private final @Nullable String edition;

    public Optional<String> getEdition() {
        return this.edition == null ? Optional.empty() : Optional.ofNullable(this.edition);
    }

    @InputImport(name="expressCustomSetupProperties")
    private final @Nullable List<Object> expressCustomSetupProperties;

    public List<Object> getExpressCustomSetupProperties() {
        return this.expressCustomSetupProperties == null ? List.of() : this.expressCustomSetupProperties;
    }

    @InputImport(name="licenseType")
    private final @Nullable String licenseType;

    public Optional<String> getLicenseType() {
        return this.licenseType == null ? Optional.empty() : Optional.ofNullable(this.licenseType);
    }

    @InputImport(name="packageStores")
    private final @Nullable List<PackageStoreResponse> packageStores;

    public List<PackageStoreResponse> getPackageStores() {
        return this.packageStores == null ? List.of() : this.packageStores;
    }

    public IntegrationRuntimeSsisPropertiesResponse(
        @Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo,
        @Nullable CredentialReferenceResponse credential,
        @Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties,
        @Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties,
        @Nullable String edition,
        @Nullable List<Object> expressCustomSetupProperties,
        @Nullable String licenseType,
        @Nullable List<PackageStoreResponse> packageStores) {
        this.catalogInfo = catalogInfo;
        this.credential = credential;
        this.customSetupScriptProperties = customSetupScriptProperties;
        this.dataProxyProperties = dataProxyProperties;
        this.edition = edition;
        this.expressCustomSetupProperties = expressCustomSetupProperties;
        this.licenseType = licenseType;
        this.packageStores = packageStores;
    }

    private IntegrationRuntimeSsisPropertiesResponse() {
        this.catalogInfo = null;
        this.credential = null;
        this.customSetupScriptProperties = null;
        this.dataProxyProperties = null;
        this.edition = null;
        this.expressCustomSetupProperties = List.of();
        this.licenseType = null;
        this.packageStores = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties;
        private @Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties;
        private @Nullable String edition;
        private @Nullable List<Object> expressCustomSetupProperties;
        private @Nullable String licenseType;
        private @Nullable List<PackageStoreResponse> packageStores;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogInfo = defaults.catalogInfo;
    	      this.credential = defaults.credential;
    	      this.customSetupScriptProperties = defaults.customSetupScriptProperties;
    	      this.dataProxyProperties = defaults.dataProxyProperties;
    	      this.edition = defaults.edition;
    	      this.expressCustomSetupProperties = defaults.expressCustomSetupProperties;
    	      this.licenseType = defaults.licenseType;
    	      this.packageStores = defaults.packageStores;
        }

        public Builder setCatalogInfo(@Nullable IntegrationRuntimeSsisCatalogInfoResponse catalogInfo) {
            this.catalogInfo = catalogInfo;
            return this;
        }

        public Builder setCredential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }

        public Builder setCustomSetupScriptProperties(@Nullable IntegrationRuntimeCustomSetupScriptPropertiesResponse customSetupScriptProperties) {
            this.customSetupScriptProperties = customSetupScriptProperties;
            return this;
        }

        public Builder setDataProxyProperties(@Nullable IntegrationRuntimeDataProxyPropertiesResponse dataProxyProperties) {
            this.dataProxyProperties = dataProxyProperties;
            return this;
        }

        public Builder setEdition(@Nullable String edition) {
            this.edition = edition;
            return this;
        }

        public Builder setExpressCustomSetupProperties(@Nullable List<Object> expressCustomSetupProperties) {
            this.expressCustomSetupProperties = expressCustomSetupProperties;
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setPackageStores(@Nullable List<PackageStoreResponse> packageStores) {
            this.packageStores = packageStores;
            return this;
        }

        public IntegrationRuntimeSsisPropertiesResponse build() {
            return new IntegrationRuntimeSsisPropertiesResponse(catalogInfo, credential, customSetupScriptProperties, dataProxyProperties, edition, expressCustomSetupProperties, licenseType, packageStores);
        }
    }
}