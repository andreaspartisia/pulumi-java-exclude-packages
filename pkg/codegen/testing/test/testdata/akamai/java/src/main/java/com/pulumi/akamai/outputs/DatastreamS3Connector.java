// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatastreamS3Connector {
    private String accessKey;
    private String bucket;
    private @Nullable Boolean compressLogs;
    private String displayName;
    private String path;
    private String region;
    private String secretAccessKey;

    private DatastreamS3Connector() {}
    public String accessKey() {
        return this.accessKey;
    }
    public String bucket() {
        return this.bucket;
    }
    public Optional<Boolean> compressLogs() {
        return Optional.ofNullable(this.compressLogs);
    }
    public String displayName() {
        return this.displayName;
    }
    public String path() {
        return this.path;
    }
    public String region() {
        return this.region;
    }
    public String secretAccessKey() {
        return this.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastreamS3Connector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accessKey;
        private String bucket;
        private @Nullable Boolean compressLogs;
        private String displayName;
        private String path;
        private String region;
        private String secretAccessKey;
        public Builder() {}
        public Builder(DatastreamS3Connector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.bucket = defaults.bucket;
    	      this.compressLogs = defaults.compressLogs;
    	      this.displayName = defaults.displayName;
    	      this.path = defaults.path;
    	      this.region = defaults.region;
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        @CustomType.Setter
        public Builder accessKey(String accessKey) {
            if (accessKey == null) {
              throw new MissingRequiredPropertyException("DatastreamS3Connector", "accessKey");
            }
            this.accessKey = accessKey;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            if (bucket == null) {
              throw new MissingRequiredPropertyException("DatastreamS3Connector", "bucket");
            }
            this.bucket = bucket;
            return this;
        }
        @CustomType.Setter
        public Builder compressLogs(@Nullable Boolean compressLogs) {

            this.compressLogs = compressLogs;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("DatastreamS3Connector", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("DatastreamS3Connector", "path");
            }
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            if (region == null) {
              throw new MissingRequiredPropertyException("DatastreamS3Connector", "region");
            }
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder secretAccessKey(String secretAccessKey) {
            if (secretAccessKey == null) {
              throw new MissingRequiredPropertyException("DatastreamS3Connector", "secretAccessKey");
            }
            this.secretAccessKey = secretAccessKey;
            return this;
        }
        public DatastreamS3Connector build() {
            final var _resultValue = new DatastreamS3Connector();
            _resultValue.accessKey = accessKey;
            _resultValue.bucket = bucket;
            _resultValue.compressLogs = compressLogs;
            _resultValue.displayName = displayName;
            _resultValue.path = path;
            _resultValue.region = region;
            _resultValue.secretAccessKey = secretAccessKey;
            return _resultValue;
        }
    }
}
