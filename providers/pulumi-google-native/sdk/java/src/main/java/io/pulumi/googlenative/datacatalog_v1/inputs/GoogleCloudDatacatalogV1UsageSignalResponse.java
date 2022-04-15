// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * The set of all usage signals that Data Catalog stores. Note: Usually, these signals are updated daily. In rare cases, an update may fail but will be performed again on the next day.
 * 
 */
public final class GoogleCloudDatacatalogV1UsageSignalResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatacatalogV1UsageSignalResponse Empty = new GoogleCloudDatacatalogV1UsageSignalResponse();

    /**
     * The end timestamp of the duration of usage statistics.
     * 
     */
    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String updateTime() {
        return this.updateTime;
    }

    /**
     * Usage statistics over each of the predefined time ranges. Supported time ranges are `{"24H", "7D", "30D"}`.
     * 
     */
    @Import(name="usageWithinTimeRange", required=true)
      private final Map<String,String> usageWithinTimeRange;

    public Map<String,String> usageWithinTimeRange() {
        return this.usageWithinTimeRange;
    }

    public GoogleCloudDatacatalogV1UsageSignalResponse(
        String updateTime,
        Map<String,String> usageWithinTimeRange) {
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
        this.usageWithinTimeRange = Objects.requireNonNull(usageWithinTimeRange, "expected parameter 'usageWithinTimeRange' to be non-null");
    }

    private GoogleCloudDatacatalogV1UsageSignalResponse() {
        this.updateTime = null;
        this.usageWithinTimeRange = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1UsageSignalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String updateTime;
        private Map<String,String> usageWithinTimeRange;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1UsageSignalResponse defaults) {
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
        }        public GoogleCloudDatacatalogV1UsageSignalResponse build() {
            return new GoogleCloudDatacatalogV1UsageSignalResponse(updateTime, usageWithinTimeRange);
        }
    }
}
