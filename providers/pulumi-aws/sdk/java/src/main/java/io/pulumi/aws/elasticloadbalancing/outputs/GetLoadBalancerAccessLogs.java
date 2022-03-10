// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetLoadBalancerAccessLogs {
    private final String bucket;
    private final String bucketPrefix;
    private final Boolean enabled;
    private final Integer interval;

    @OutputCustomType.Constructor
    private GetLoadBalancerAccessLogs(
        @OutputCustomType.Parameter("bucket") String bucket,
        @OutputCustomType.Parameter("bucketPrefix") String bucketPrefix,
        @OutputCustomType.Parameter("enabled") Boolean enabled,
        @OutputCustomType.Parameter("interval") Integer interval) {
        this.bucket = bucket;
        this.bucketPrefix = bucketPrefix;
        this.enabled = enabled;
        this.interval = interval;
    }

    public String getBucket() {
        return this.bucket;
    }
    public String getBucketPrefix() {
        return this.bucketPrefix;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerAccessLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String bucketPrefix;
        private Boolean enabled;
        private Integer interval;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerAccessLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketPrefix = defaults.bucketPrefix;
    	      this.enabled = defaults.enabled;
    	      this.interval = defaults.interval;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucketPrefix(String bucketPrefix) {
            this.bucketPrefix = Objects.requireNonNull(bucketPrefix);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setInterval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public GetLoadBalancerAccessLogs build() {
            return new GetLoadBalancerAccessLogs(bucket, bucketPrefix, enabled, interval);
        }
    }
}