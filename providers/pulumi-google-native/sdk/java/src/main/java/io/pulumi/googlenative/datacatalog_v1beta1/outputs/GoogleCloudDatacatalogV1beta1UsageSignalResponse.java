// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1beta1UsageSignalResponse {
    /**
     * The timestamp of the end of the usage statistics duration.
     * 
     */
    private final String updateTime;
    /**
     * Usage statistics over each of the pre-defined time ranges, supported strings for time ranges are {"24H", "7D", "30D"}.
     * 
     */
    private final Map<String,String> usageWithinTimeRange;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1beta1UsageSignalResponse(
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("usageWithinTimeRange") Map<String,String> usageWithinTimeRange) {
        this.updateTime = updateTime;
        this.usageWithinTimeRange = usageWithinTimeRange;
    }

    /**
     * The timestamp of the end of the usage statistics duration.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * Usage statistics over each of the pre-defined time ranges, supported strings for time ranges are {"24H", "7D", "30D"}.
     * 
    */
    public Map<String,String> usageWithinTimeRange() {
        return this.usageWithinTimeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1beta1UsageSignalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String updateTime;
        private Map<String,String> usageWithinTimeRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1beta1UsageSignalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.updateTime = defaults.updateTime;
    	      this.usageWithinTimeRange = defaults.usageWithinTimeRange;
        }

        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder usageWithinTimeRange(Map<String,String> usageWithinTimeRange) {
            this.usageWithinTimeRange = Objects.requireNonNull(usageWithinTimeRange);
            return this;
        }        public GoogleCloudDatacatalogV1beta1UsageSignalResponse build() {
            return new GoogleCloudDatacatalogV1beta1UsageSignalResponse(updateTime, usageWithinTimeRange);
        }
    }
}
