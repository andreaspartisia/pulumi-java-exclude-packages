// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAutonomousDatabaseBackupConfig {
    /**
     * @return Name of [Object Storage](https://docs.cloud.oracle.com/iaas/Content/Object/Concepts/objectstorageoverview.htm) bucket to use for storing manual backups.
     * 
     */
    private final String manualBackupBucketName;
    /**
     * @return The manual backup destination type.
     * 
     */
    private final String manualBackupType;

    @CustomType.Constructor
    private GetAutonomousDatabaseBackupConfig(
        @CustomType.Parameter("manualBackupBucketName") String manualBackupBucketName,
        @CustomType.Parameter("manualBackupType") String manualBackupType) {
        this.manualBackupBucketName = manualBackupBucketName;
        this.manualBackupType = manualBackupType;
    }

    /**
     * @return Name of [Object Storage](https://docs.cloud.oracle.com/iaas/Content/Object/Concepts/objectstorageoverview.htm) bucket to use for storing manual backups.
     * 
     */
    public String manualBackupBucketName() {
        return this.manualBackupBucketName;
    }
    /**
     * @return The manual backup destination type.
     * 
     */
    public String manualBackupType() {
        return this.manualBackupType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousDatabaseBackupConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String manualBackupBucketName;
        private String manualBackupType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutonomousDatabaseBackupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.manualBackupBucketName = defaults.manualBackupBucketName;
    	      this.manualBackupType = defaults.manualBackupType;
        }

        public Builder manualBackupBucketName(String manualBackupBucketName) {
            this.manualBackupBucketName = Objects.requireNonNull(manualBackupBucketName);
            return this;
        }
        public Builder manualBackupType(String manualBackupType) {
            this.manualBackupType = Objects.requireNonNull(manualBackupType);
            return this;
        }        public GetAutonomousDatabaseBackupConfig build() {
            return new GetAutonomousDatabaseBackupConfig(manualBackupBucketName, manualBackupType);
        }
    }
}
