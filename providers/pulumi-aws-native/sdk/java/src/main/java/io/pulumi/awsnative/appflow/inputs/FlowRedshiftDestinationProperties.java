// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.FlowErrorHandlingConfig;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowRedshiftDestinationProperties extends io.pulumi.resources.InvokeArgs {

    public static final FlowRedshiftDestinationProperties Empty = new FlowRedshiftDestinationProperties();

    @InputImport(name="bucketPrefix")
    private final @Nullable String bucketPrefix;

    public Optional<String> getBucketPrefix() {
        return this.bucketPrefix == null ? Optional.empty() : Optional.ofNullable(this.bucketPrefix);
    }

    @InputImport(name="errorHandlingConfig")
    private final @Nullable FlowErrorHandlingConfig errorHandlingConfig;

    public Optional<FlowErrorHandlingConfig> getErrorHandlingConfig() {
        return this.errorHandlingConfig == null ? Optional.empty() : Optional.ofNullable(this.errorHandlingConfig);
    }

    @InputImport(name="intermediateBucketName", required=true)
    private final String intermediateBucketName;

    public String getIntermediateBucketName() {
        return this.intermediateBucketName;
    }

    @InputImport(name="object", required=true)
    private final String object;

    public String getObject() {
        return this.object;
    }

    public FlowRedshiftDestinationProperties(
        @Nullable String bucketPrefix,
        @Nullable FlowErrorHandlingConfig errorHandlingConfig,
        String intermediateBucketName,
        String object) {
        this.bucketPrefix = bucketPrefix;
        this.errorHandlingConfig = errorHandlingConfig;
        this.intermediateBucketName = Objects.requireNonNull(intermediateBucketName, "expected parameter 'intermediateBucketName' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowRedshiftDestinationProperties() {
        this.bucketPrefix = null;
        this.errorHandlingConfig = null;
        this.intermediateBucketName = null;
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowRedshiftDestinationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucketPrefix;
        private @Nullable FlowErrorHandlingConfig errorHandlingConfig;
        private String intermediateBucketName;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowRedshiftDestinationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.errorHandlingConfig = defaults.errorHandlingConfig;
    	      this.intermediateBucketName = defaults.intermediateBucketName;
    	      this.object = defaults.object;
        }

        public Builder setBucketPrefix(@Nullable String bucketPrefix) {
            this.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder setErrorHandlingConfig(@Nullable FlowErrorHandlingConfig errorHandlingConfig) {
            this.errorHandlingConfig = errorHandlingConfig;
            return this;
        }

        public Builder setIntermediateBucketName(String intermediateBucketName) {
            this.intermediateBucketName = Objects.requireNonNull(intermediateBucketName);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public FlowRedshiftDestinationProperties build() {
            return new FlowRedshiftDestinationProperties(bucketPrefix, errorHandlingConfig, intermediateBucketName, object);
        }
    }
}