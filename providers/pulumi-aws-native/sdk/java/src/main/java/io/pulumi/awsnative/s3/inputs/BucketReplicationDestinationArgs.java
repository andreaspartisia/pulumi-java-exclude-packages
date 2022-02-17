// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.inputs;

import io.pulumi.awsnative.s3.enums.BucketReplicationDestinationStorageClass;
import io.pulumi.awsnative.s3.inputs.BucketAccessControlTranslationArgs;
import io.pulumi.awsnative.s3.inputs.BucketEncryptionConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.BucketMetricsArgs;
import io.pulumi.awsnative.s3.inputs.BucketReplicationTimeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies which Amazon S3 bucket to store replicated objects in and their storage class.
 * 
 */
public final class BucketReplicationDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketReplicationDestinationArgs Empty = new BucketReplicationDestinationArgs();

    @InputImport(name="accessControlTranslation")
    private final @Nullable Input<BucketAccessControlTranslationArgs> accessControlTranslation;

    public Input<BucketAccessControlTranslationArgs> getAccessControlTranslation() {
        return this.accessControlTranslation == null ? Input.empty() : this.accessControlTranslation;
    }

    @InputImport(name="account")
    private final @Nullable Input<String> account;

    public Input<String> getAccount() {
        return this.account == null ? Input.empty() : this.account;
    }

    @InputImport(name="bucket", required=true)
    private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    @InputImport(name="encryptionConfiguration")
    private final @Nullable Input<BucketEncryptionConfigurationArgs> encryptionConfiguration;

    public Input<BucketEncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Input.empty() : this.encryptionConfiguration;
    }

    @InputImport(name="metrics")
    private final @Nullable Input<BucketMetricsArgs> metrics;

    public Input<BucketMetricsArgs> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    @InputImport(name="replicationTime")
    private final @Nullable Input<BucketReplicationTimeArgs> replicationTime;

    public Input<BucketReplicationTimeArgs> getReplicationTime() {
        return this.replicationTime == null ? Input.empty() : this.replicationTime;
    }

    /**
     * The storage class to use when replicating objects, such as S3 Standard or reduced redundancy.
     * 
     */
    @InputImport(name="storageClass")
    private final @Nullable Input<BucketReplicationDestinationStorageClass> storageClass;

    public Input<BucketReplicationDestinationStorageClass> getStorageClass() {
        return this.storageClass == null ? Input.empty() : this.storageClass;
    }

    public BucketReplicationDestinationArgs(
        @Nullable Input<BucketAccessControlTranslationArgs> accessControlTranslation,
        @Nullable Input<String> account,
        Input<String> bucket,
        @Nullable Input<BucketEncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Input<BucketMetricsArgs> metrics,
        @Nullable Input<BucketReplicationTimeArgs> replicationTime,
        @Nullable Input<BucketReplicationDestinationStorageClass> storageClass) {
        this.accessControlTranslation = accessControlTranslation;
        this.account = account;
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.encryptionConfiguration = encryptionConfiguration;
        this.metrics = metrics;
        this.replicationTime = replicationTime;
        this.storageClass = storageClass;
    }

    private BucketReplicationDestinationArgs() {
        this.accessControlTranslation = Input.empty();
        this.account = Input.empty();
        this.bucket = Input.empty();
        this.encryptionConfiguration = Input.empty();
        this.metrics = Input.empty();
        this.replicationTime = Input.empty();
        this.storageClass = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BucketAccessControlTranslationArgs> accessControlTranslation;
        private @Nullable Input<String> account;
        private Input<String> bucket;
        private @Nullable Input<BucketEncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Input<BucketMetricsArgs> metrics;
        private @Nullable Input<BucketReplicationTimeArgs> replicationTime;
        private @Nullable Input<BucketReplicationDestinationStorageClass> storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlTranslation = defaults.accessControlTranslation;
    	      this.account = defaults.account;
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.metrics = defaults.metrics;
    	      this.replicationTime = defaults.replicationTime;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder setAccessControlTranslation(@Nullable Input<BucketAccessControlTranslationArgs> accessControlTranslation) {
            this.accessControlTranslation = accessControlTranslation;
            return this;
        }

        public Builder setAccessControlTranslation(@Nullable BucketAccessControlTranslationArgs accessControlTranslation) {
            this.accessControlTranslation = Input.ofNullable(accessControlTranslation);
            return this;
        }

        public Builder setAccount(@Nullable Input<String> account) {
            this.account = account;
            return this;
        }

        public Builder setAccount(@Nullable String account) {
            this.account = Input.ofNullable(account);
            return this;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable Input<BucketEncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setEncryptionConfiguration(@Nullable BucketEncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Input.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder setMetrics(@Nullable Input<BucketMetricsArgs> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMetrics(@Nullable BucketMetricsArgs metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder setReplicationTime(@Nullable Input<BucketReplicationTimeArgs> replicationTime) {
            this.replicationTime = replicationTime;
            return this;
        }

        public Builder setReplicationTime(@Nullable BucketReplicationTimeArgs replicationTime) {
            this.replicationTime = Input.ofNullable(replicationTime);
            return this;
        }

        public Builder setStorageClass(@Nullable Input<BucketReplicationDestinationStorageClass> storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Builder setStorageClass(@Nullable BucketReplicationDestinationStorageClass storageClass) {
            this.storageClass = Input.ofNullable(storageClass);
            return this;
        }

        public BucketReplicationDestinationArgs build() {
            return new BucketReplicationDestinationArgs(accessControlTranslation, account, bucket, encryptionConfiguration, metrics, replicationTime, storageClass);
        }
    }
}