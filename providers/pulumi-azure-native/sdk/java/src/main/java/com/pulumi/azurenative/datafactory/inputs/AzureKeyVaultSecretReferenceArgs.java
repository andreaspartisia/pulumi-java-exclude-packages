// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Key Vault secret reference.
 * 
 */
public final class AzureKeyVaultSecretReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureKeyVaultSecretReferenceArgs Empty = new AzureKeyVaultSecretReferenceArgs();

    /**
     * The name of the secret in Azure Key Vault. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="secretName", required=true)
      private final Output<Object> secretName;

    public Output<Object> secretName() {
        return this.secretName;
    }

    /**
     * The version of the secret in Azure Key Vault. The default value is the latest version of the secret. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="secretVersion")
      private final @Nullable Output<Object> secretVersion;

    public Output<Object> secretVersion() {
        return this.secretVersion == null ? Codegen.empty() : this.secretVersion;
    }

    /**
     * The Azure Key Vault linked service reference.
     * 
     */
    @Import(name="store", required=true)
      private final Output<LinkedServiceReferenceArgs> store;

    public Output<LinkedServiceReferenceArgs> store() {
        return this.store;
    }

    /**
     * Type of the secret.
     * Expected value is 'AzureKeyVaultSecret'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public AzureKeyVaultSecretReferenceArgs(
        Output<Object> secretName,
        @Nullable Output<Object> secretVersion,
        Output<LinkedServiceReferenceArgs> store,
        Output<String> type) {
        this.secretName = Objects.requireNonNull(secretName, "expected parameter 'secretName' to be non-null");
        this.secretVersion = secretVersion;
        this.store = Objects.requireNonNull(store, "expected parameter 'store' to be non-null");
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private AzureKeyVaultSecretReferenceArgs() {
        this.secretName = Codegen.empty();
        this.secretVersion = Codegen.empty();
        this.store = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureKeyVaultSecretReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Object> secretName;
        private @Nullable Output<Object> secretVersion;
        private Output<LinkedServiceReferenceArgs> store;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureKeyVaultSecretReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.store = defaults.store;
    	      this.type = defaults.type;
        }

        public Builder secretName(Output<Object> secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }
        public Builder secretName(Object secretName) {
            this.secretName = Output.of(Objects.requireNonNull(secretName));
            return this;
        }
        public Builder secretVersion(@Nullable Output<Object> secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }
        public Builder secretVersion(@Nullable Object secretVersion) {
            this.secretVersion = Codegen.ofNullable(secretVersion);
            return this;
        }
        public Builder store(Output<LinkedServiceReferenceArgs> store) {
            this.store = Objects.requireNonNull(store);
            return this;
        }
        public Builder store(LinkedServiceReferenceArgs store) {
            this.store = Output.of(Objects.requireNonNull(store));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AzureKeyVaultSecretReferenceArgs build() {
            return new AzureKeyVaultSecretReferenceArgs(secretName, secretVersion, store, type);
        }
    }
}
