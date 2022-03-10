// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobQueryDestinationEncryptionConfiguration {
    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table.
     * The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
     */
    private final String kmsKeyName;
    /**
     * - 
     * Describes the Cloud KMS encryption key version used to protect destination BigQuery table.
     * 
     */
    private final @Nullable String kmsKeyVersion;

    @OutputCustomType.Constructor
    private JobQueryDestinationEncryptionConfiguration(
        @OutputCustomType.Parameter("kmsKeyName") String kmsKeyName,
        @OutputCustomType.Parameter("kmsKeyVersion") @Nullable String kmsKeyVersion) {
        this.kmsKeyName = kmsKeyName;
        this.kmsKeyVersion = kmsKeyVersion;
    }

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table.
     * The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
    */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * - 
     * Describes the Cloud KMS encryption key version used to protect destination BigQuery table.
     * 
    */
    public Optional<String> getKmsKeyVersion() {
        return Optional.ofNullable(this.kmsKeyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryDestinationEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private @Nullable String kmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryDestinationEncryptionConfiguration defaults) {
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
        public JobQueryDestinationEncryptionConfiguration build() {
            return new JobQueryDestinationEncryptionConfiguration(kmsKeyName, kmsKeyVersion);
        }
    }
}
