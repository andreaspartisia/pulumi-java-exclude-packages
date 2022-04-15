// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EncryptionConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionConfigurationResponse Empty = new EncryptionConfigurationResponse();

    /**
     * [Optional] Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table. The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
     */
    @Import(name="kmsKeyName", required=true)
      private final String kmsKeyName;

    public String kmsKeyName() {
        return this.kmsKeyName;
    }

    public EncryptionConfigurationResponse(String kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private EncryptionConfigurationResponse() {
        this.kmsKeyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }        public EncryptionConfigurationResponse build() {
            return new EncryptionConfigurationResponse(kmsKeyName);
        }
    }
}
