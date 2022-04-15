// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Timestamps associated with this resource in a particular system.
 * 
 */
public final class GoogleCloudDatacatalogV1SystemTimestampsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1SystemTimestampsResponse Empty = new GoogleCloudDatacatalogV1SystemTimestampsResponse();

    /**
     * Creation timestamp of the resource within the given system.
     * 
     */
    @Import(name="createTime", required=true)
      private final String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * Expiration timestamp of the resource within the given system. Currently only applicable to BigQuery resources.
     * 
     */
    @Import(name="expireTime", required=true)
      private final String expireTime;

    public String expireTime() {
        return this.expireTime;
    }

    /**
     * Timestamp of the last modification of the resource or its metadata within a given system. Note: Depending on the source system, not every modification updates this timestamp. For example, BigQuery timestamps every metadata modification but not data or permission changes.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String updateTime() {
        return this.updateTime;
    }

    public GoogleCloudDatacatalogV1SystemTimestampsResponse(
        String createTime,
        String expireTime,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.expireTime = Objects.requireNonNull(expireTime, "expected parameter 'expireTime' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private GoogleCloudDatacatalogV1SystemTimestampsResponse() {
        this.createTime = null;
        this.expireTime = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1SystemTimestampsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String expireTime;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1SystemTimestampsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.expireTime = defaults.expireTime;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GoogleCloudDatacatalogV1SystemTimestampsResponse build() {
            return new GoogleCloudDatacatalogV1SystemTimestampsResponse(createTime, expireTime, updateTime);
        }
    }
}
