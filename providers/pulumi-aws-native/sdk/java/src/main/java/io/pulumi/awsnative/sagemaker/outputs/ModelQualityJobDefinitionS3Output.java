// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.enums.ModelQualityJobDefinitionS3OutputS3UploadMode;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ModelQualityJobDefinitionS3Output {
    /**
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job. LocalPath is an absolute path for the output data.
     * 
     */
    private final String localPath;
    /**
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * 
     */
    private final @Nullable ModelQualityJobDefinitionS3OutputS3UploadMode s3UploadMode;
    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * 
     */
    private final String s3Uri;

    @OutputCustomType.Constructor({"localPath","s3UploadMode","s3Uri"})
    private ModelQualityJobDefinitionS3Output(
        String localPath,
        @Nullable ModelQualityJobDefinitionS3OutputS3UploadMode s3UploadMode,
        String s3Uri) {
        this.localPath = Objects.requireNonNull(localPath);
        this.s3UploadMode = s3UploadMode;
        this.s3Uri = Objects.requireNonNull(s3Uri);
    }

    /**
     * The local path to the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job. LocalPath is an absolute path for the output data.
     * 
     */
    public String getLocalPath() {
        return this.localPath;
    }
    /**
     * Whether to upload the results of the monitoring job continuously or after the job completes.
     * 
     */
    public Optional<ModelQualityJobDefinitionS3OutputS3UploadMode> getS3UploadMode() {
        return Optional.ofNullable(this.s3UploadMode);
    }
    /**
     * A URI that identifies the Amazon S3 storage location where Amazon SageMaker saves the results of a monitoring job.
     * 
     */
    public String getS3Uri() {
        return this.s3Uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionS3Output defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String localPath;
        private @Nullable ModelQualityJobDefinitionS3OutputS3UploadMode s3UploadMode;
        private String s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionS3Output defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.localPath = defaults.localPath;
    	      this.s3UploadMode = defaults.s3UploadMode;
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder setLocalPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }

        public Builder setS3UploadMode(@Nullable ModelQualityJobDefinitionS3OutputS3UploadMode s3UploadMode) {
            this.s3UploadMode = s3UploadMode;
            return this;
        }

        public Builder setS3Uri(String s3Uri) {
            this.s3Uri = Objects.requireNonNull(s3Uri);
            return this;
        }

        public ModelQualityJobDefinitionS3Output build() {
            return new ModelQualityJobDefinitionS3Output(localPath, s3UploadMode, s3Uri);
        }
    }
}