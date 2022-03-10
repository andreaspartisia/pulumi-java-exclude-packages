// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.aws.fsx.outputs.DataRepositoryAssociationS3AutoExportPolicy;
import io.pulumi.aws.fsx.outputs.DataRepositoryAssociationS3AutoImportPolicy;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataRepositoryAssociationS3 {
    /**
     * Specifies the type of updated objects that will be automatically exported from your file system to the linked S3 bucket. See the `events` configuration block.
     * 
     */
    private final @Nullable DataRepositoryAssociationS3AutoExportPolicy autoExportPolicy;
    /**
     * Specifies the type of updated objects that will be automatically imported from the linked S3 bucket to your file system. See the `events` configuration block.
     * 
     */
    private final @Nullable DataRepositoryAssociationS3AutoImportPolicy autoImportPolicy;

    @OutputCustomType.Constructor
    private DataRepositoryAssociationS3(
        @OutputCustomType.Parameter("autoExportPolicy") @Nullable DataRepositoryAssociationS3AutoExportPolicy autoExportPolicy,
        @OutputCustomType.Parameter("autoImportPolicy") @Nullable DataRepositoryAssociationS3AutoImportPolicy autoImportPolicy) {
        this.autoExportPolicy = autoExportPolicy;
        this.autoImportPolicy = autoImportPolicy;
    }

    /**
     * Specifies the type of updated objects that will be automatically exported from your file system to the linked S3 bucket. See the `events` configuration block.
     * 
    */
    public Optional<DataRepositoryAssociationS3AutoExportPolicy> getAutoExportPolicy() {
        return Optional.ofNullable(this.autoExportPolicy);
    }
    /**
     * Specifies the type of updated objects that will be automatically imported from the linked S3 bucket to your file system. See the `events` configuration block.
     * 
    */
    public Optional<DataRepositoryAssociationS3AutoImportPolicy> getAutoImportPolicy() {
        return Optional.ofNullable(this.autoImportPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataRepositoryAssociationS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataRepositoryAssociationS3AutoExportPolicy autoExportPolicy;
        private @Nullable DataRepositoryAssociationS3AutoImportPolicy autoImportPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DataRepositoryAssociationS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoExportPolicy = defaults.autoExportPolicy;
    	      this.autoImportPolicy = defaults.autoImportPolicy;
        }

        public Builder setAutoExportPolicy(@Nullable DataRepositoryAssociationS3AutoExportPolicy autoExportPolicy) {
            this.autoExportPolicy = autoExportPolicy;
            return this;
        }

        public Builder setAutoImportPolicy(@Nullable DataRepositoryAssociationS3AutoImportPolicy autoImportPolicy) {
            this.autoImportPolicy = autoImportPolicy;
            return this;
        }
        public DataRepositoryAssociationS3 build() {
            return new DataRepositoryAssociationS3(autoExportPolicy, autoImportPolicy);
        }
    }
}