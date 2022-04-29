// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.AiAnomalyDetection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDetectionDataAssetDataSourceDetailVersionSpecificDetail {
    /**
     * @return Bucket Name for influx connection
     * 
     */
    private final String bucket;
    /**
     * @return DB Name for influx connection
     * 
     */
    private final String databaseName;
    /**
     * @return Data source type where actually data asset is being stored
     * 
     */
    private final String influxVersion;
    /**
     * @return Org name for the influx db
     * 
     */
    private final String organizationName;
    /**
     * @return retention policy is how long the bucket would last
     * 
     */
    private final String retentionPolicyName;

    @CustomType.Constructor
    private GetDetectionDataAssetDataSourceDetailVersionSpecificDetail(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("influxVersion") String influxVersion,
        @CustomType.Parameter("organizationName") String organizationName,
        @CustomType.Parameter("retentionPolicyName") String retentionPolicyName) {
        this.bucket = bucket;
        this.databaseName = databaseName;
        this.influxVersion = influxVersion;
        this.organizationName = organizationName;
        this.retentionPolicyName = retentionPolicyName;
    }

    /**
     * @return Bucket Name for influx connection
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return DB Name for influx connection
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return Data source type where actually data asset is being stored
     * 
     */
    public String influxVersion() {
        return this.influxVersion;
    }
    /**
     * @return Org name for the influx db
     * 
     */
    public String organizationName() {
        return this.organizationName;
    }
    /**
     * @return retention policy is how long the bucket would last
     * 
     */
    public String retentionPolicyName() {
        return this.retentionPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDetectionDataAssetDataSourceDetailVersionSpecificDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String databaseName;
        private String influxVersion;
        private String organizationName;
        private String retentionPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDetectionDataAssetDataSourceDetailVersionSpecificDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.databaseName = defaults.databaseName;
    	      this.influxVersion = defaults.influxVersion;
    	      this.organizationName = defaults.organizationName;
    	      this.retentionPolicyName = defaults.retentionPolicyName;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder influxVersion(String influxVersion) {
            this.influxVersion = Objects.requireNonNull(influxVersion);
            return this;
        }
        public Builder organizationName(String organizationName) {
            this.organizationName = Objects.requireNonNull(organizationName);
            return this;
        }
        public Builder retentionPolicyName(String retentionPolicyName) {
            this.retentionPolicyName = Objects.requireNonNull(retentionPolicyName);
            return this;
        }        public GetDetectionDataAssetDataSourceDetailVersionSpecificDetail build() {
            return new GetDetectionDataAssetDataSourceDetailVersionSpecificDetail(bucket, databaseName, influxVersion, organizationName, retentionPolicyName);
        }
    }
}
