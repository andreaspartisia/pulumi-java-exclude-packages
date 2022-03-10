// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableEncryptionConfiguration {
    /**
     * The self link or full name of a key which should be used to
     * encrypt this table.  Note that the default bigquery service account will need to have
     * encrypt/decrypt permissions on this key - you may want to see the
     * `gcp.bigquery.getDefaultServiceAccount` datasource and the
     * `gcp.kms.CryptoKeyIAMBinding` resource.
     * 
     */
    private final String kmsKeyName;
    /**
     * The self link or full name of the kms key version used to encrypt this table.
     * 
     */
    private final @Nullable String kmsKeyVersion;

    @OutputCustomType.Constructor
    private TableEncryptionConfiguration(
        @OutputCustomType.Parameter("kmsKeyName") String kmsKeyName,
        @OutputCustomType.Parameter("kmsKeyVersion") @Nullable String kmsKeyVersion) {
        this.kmsKeyName = kmsKeyName;
        this.kmsKeyVersion = kmsKeyVersion;
    }

    /**
     * The self link or full name of a key which should be used to
     * encrypt this table.  Note that the default bigquery service account will need to have
     * encrypt/decrypt permissions on this key - you may want to see the
     * `gcp.bigquery.getDefaultServiceAccount` datasource and the
     * `gcp.kms.CryptoKeyIAMBinding` resource.
     * 
    */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * The self link or full name of the kms key version used to encrypt this table.
     * 
    */
    public Optional<String> getKmsKeyVersion() {
        return Optional.ofNullable(this.kmsKeyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private @Nullable String kmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(TableEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyVersion = defaults.kmsKeyVersion;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setKmsKeyVersion(@Nullable String kmsKeyVersion) {
            this.kmsKeyVersion = kmsKeyVersion;
            return this;
        }
        public TableEncryptionConfiguration build() {
            return new TableEncryptionConfiguration(kmsKeyName, kmsKeyVersion);
        }
    }
}
