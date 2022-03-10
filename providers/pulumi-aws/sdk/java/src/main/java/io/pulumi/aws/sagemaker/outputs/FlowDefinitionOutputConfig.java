// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowDefinitionOutputConfig {
    /**
     * The Amazon Key Management Service (KMS) key ARN for server-side encryption.
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * The Amazon S3 path where the object containing human output will be made available.
     * 
     */
    private final String s3OutputPath;

    @OutputCustomType.Constructor
    private FlowDefinitionOutputConfig(
        @OutputCustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @OutputCustomType.Parameter("s3OutputPath") String s3OutputPath) {
        this.kmsKeyId = kmsKeyId;
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * The Amazon Key Management Service (KMS) key ARN for server-side encryption.
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * The Amazon S3 path where the object containing human output will be made available.
     * 
    */
    public String getS3OutputPath() {
        return this.s3OutputPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowDefinitionOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private String s3OutputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowDefinitionOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3OutputPath = defaults.s3OutputPath;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setS3OutputPath(String s3OutputPath) {
            this.s3OutputPath = Objects.requireNonNull(s3OutputPath);
            return this;
        }
        public FlowDefinitionOutputConfig build() {
            return new FlowDefinitionOutputConfig(kmsKeyId, s3OutputPath);
        }
    }
}