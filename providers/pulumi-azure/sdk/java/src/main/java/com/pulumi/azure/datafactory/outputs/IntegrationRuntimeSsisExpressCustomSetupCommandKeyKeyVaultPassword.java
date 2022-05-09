// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.datafactory.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPassword {
    /**
     * @return Specifies the name of an existing Key Vault Data Factory Linked Service.
     * 
     */
    private final String linkedServiceName;
    /**
     * @return A map of parameters to associate with the Key Vault Data Factory Linked Service.
     * 
     */
    private final @Nullable Map<String,String> parameters;
    /**
     * @return Specifies the secret name in Azure Key Vault.
     * 
     */
    private final String secretName;
    /**
     * @return Specifies the secret version in Azure Key Vault.
     * 
     */
    private final @Nullable String secretVersion;

    @CustomType.Constructor
    private IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPassword(
        @CustomType.Parameter("linkedServiceName") String linkedServiceName,
        @CustomType.Parameter("parameters") @Nullable Map<String,String> parameters,
        @CustomType.Parameter("secretName") String secretName,
        @CustomType.Parameter("secretVersion") @Nullable String secretVersion) {
        this.linkedServiceName = linkedServiceName;
        this.parameters = parameters;
        this.secretName = secretName;
        this.secretVersion = secretVersion;
    }

    /**
     * @return Specifies the name of an existing Key Vault Data Factory Linked Service.
     * 
     */
    public String linkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * @return A map of parameters to associate with the Key Vault Data Factory Linked Service.
     * 
     */
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return Specifies the secret name in Azure Key Vault.
     * 
     */
    public String secretName() {
        return this.secretName;
    }
    /**
     * @return Specifies the secret version in Azure Key Vault.
     * 
     */
    public Optional<String> secretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPassword defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String linkedServiceName;
        private @Nullable Map<String,String> parameters;
        private String secretName;
        private @Nullable String secretVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPassword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
        }

        public Builder linkedServiceName(String linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }        public IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPassword build() {
            return new IntegrationRuntimeSsisExpressCustomSetupCommandKeyKeyVaultPassword(linkedServiceName, parameters, secretName, secretVersion);
        }
    }
}
