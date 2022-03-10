// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TableServerSideEncryption {
    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
     */
    private final Boolean enabled;
    /**
     * The ARN of the CMK that should be used for the AWS KMS encryption.
     * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
     */
    private final @Nullable String kmsKeyArn;

    @OutputCustomType.Constructor
    private TableServerSideEncryption(
        @OutputCustomType.Parameter("enabled") Boolean enabled,
        @OutputCustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn) {
        this.enabled = enabled;
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * Indicates whether ttl is enabled (true) or disabled (false).
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The ARN of the CMK that should be used for the AWS KMS encryption.
     * This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
    */
    public Optional<String> getKmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableServerSideEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TableServerSideEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setKmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public TableServerSideEncryption build() {
            return new TableServerSideEncryption(enabled, kmsKeyArn);
        }
    }
}