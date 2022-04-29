// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Monitoring.outputs.GetMetricDataFilter;
import com.pulumi.oci.Monitoring.outputs.GetMetricDataMetricData;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetMetricDataResult {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the resources from which the aggregated data was returned.
     * 
     */
    private final String compartmentId;
    private final @Nullable Boolean compartmentIdInSubtree;
    private final @Nullable String endTime;
    private final @Nullable List<GetMetricDataFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The list of metric_data.
     * 
     */
    private final List<GetMetricDataMetricData> metricDatas;
    /**
     * @return The reference provided in a metric definition to indicate the source service or application that emitted the metric.  Example: `oci_computeagent`
     * 
     */
    private final String namespace;
    private final String query;
    /**
     * @return The time between calculated aggregation windows. Use with the query interval to vary the frequency at which aggregated data points are returned. For example, use a query interval of 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute frequency. The resolution must be equal or less than the interval in the query. The default resolution is 1m (one minute). Supported values: `1m`-`60m`, `1h`-`24h`, `1d`.  Example: `5m`
     * 
     */
    private final @Nullable String resolution;
    /**
     * @return Resource group provided with the posted metric. A resource group is a custom string that you can match when retrieving custom metrics. Only one resource group can be applied per metric. A valid resourceGroup value starts with an alphabetical character and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).  Example: `frontend-fleet`
     * 
     */
    private final @Nullable String resourceGroup;
    private final @Nullable String startTime;

    @CustomType.Constructor
    private GetMetricDataResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("compartmentIdInSubtree") @Nullable Boolean compartmentIdInSubtree,
        @CustomType.Parameter("endTime") @Nullable String endTime,
        @CustomType.Parameter("filters") @Nullable List<GetMetricDataFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("metricDatas") List<GetMetricDataMetricData> metricDatas,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("resolution") @Nullable String resolution,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("startTime") @Nullable String startTime) {
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.endTime = endTime;
        this.filters = filters;
        this.id = id;
        this.metricDatas = metricDatas;
        this.namespace = namespace;
        this.query = query;
        this.resolution = resolution;
        this.resourceGroup = resourceGroup;
        this.startTime = startTime;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the resources from which the aggregated data was returned.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    public List<GetMetricDataFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The list of metric_data.
     * 
     */
    public List<GetMetricDataMetricData> metricDatas() {
        return this.metricDatas;
    }
    /**
     * @return The reference provided in a metric definition to indicate the source service or application that emitted the metric.  Example: `oci_computeagent`
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    public String query() {
        return this.query;
    }
    /**
     * @return The time between calculated aggregation windows. Use with the query interval to vary the frequency at which aggregated data points are returned. For example, use a query interval of 5 minutes with a resolution of 1 minute to retrieve five-minute aggregations at a one-minute frequency. The resolution must be equal or less than the interval in the query. The default resolution is 1m (one minute). Supported values: `1m`-`60m`, `1h`-`24h`, `1d`.  Example: `5m`
     * 
     */
    public Optional<String> resolution() {
        return Optional.ofNullable(this.resolution);
    }
    /**
     * @return Resource group provided with the posted metric. A resource group is a custom string that you can match when retrieving custom metrics. Only one resource group can be applied per metric. A valid resourceGroup value starts with an alphabetical character and includes only alphanumeric characters, periods (.), underscores (_), hyphens (-), and dollar signs ($).  Example: `frontend-fleet`
     * 
     */
    public Optional<String> resourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetricDataResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private @Nullable Boolean compartmentIdInSubtree;
        private @Nullable String endTime;
        private @Nullable List<GetMetricDataFilter> filters;
        private String id;
        private List<GetMetricDataMetricData> metricDatas;
        private String namespace;
        private String query;
        private @Nullable String resolution;
        private @Nullable String resourceGroup;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetricDataResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.compartmentIdInSubtree = defaults.compartmentIdInSubtree;
    	      this.endTime = defaults.endTime;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.metricDatas = defaults.metricDatas;
    	      this.namespace = defaults.namespace;
    	      this.query = defaults.query;
    	      this.resolution = defaults.resolution;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.startTime = defaults.startTime;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder filters(@Nullable List<GetMetricDataFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetMetricDataFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder metricDatas(List<GetMetricDataMetricData> metricDatas) {
            this.metricDatas = Objects.requireNonNull(metricDatas);
            return this;
        }
        public Builder metricDatas(GetMetricDataMetricData... metricDatas) {
            return metricDatas(List.of(metricDatas));
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder resolution(@Nullable String resolution) {
            this.resolution = resolution;
            return this;
        }
        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }        public GetMetricDataResult build() {
            return new GetMetricDataResult(compartmentId, compartmentIdInSubtree, endTime, filters, id, metricDatas, namespace, query, resolution, resourceGroup, startTime);
        }
    }
}
