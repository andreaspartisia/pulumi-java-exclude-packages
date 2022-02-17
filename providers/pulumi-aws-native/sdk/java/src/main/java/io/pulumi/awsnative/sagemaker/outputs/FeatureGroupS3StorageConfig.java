// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FeatureGroupS3StorageConfig {
    private final @Nullable String kmsKeyId;
    private final String s3Uri;

    @OutputCustomType.Constructor({"kmsKeyId","s3Uri"})
    private FeatureGroupS3StorageConfig(
        @Nullable String kmsKeyId,
        String s3Uri) {
        this.kmsKeyId = kmsKeyId;
        this.s3Uri = Objects.requireNonNull(s3Uri);
    }

    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    public String getS3Uri() {
        return this.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupS3StorageConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private String s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupS3StorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder setKmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder setS3Uri(String s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }

        public FeatureGroupS3StorageConfig build() {
            return new FeatureGroupS3StorageConfig(kmsKeyId, s3Uri);
        }
    }
}