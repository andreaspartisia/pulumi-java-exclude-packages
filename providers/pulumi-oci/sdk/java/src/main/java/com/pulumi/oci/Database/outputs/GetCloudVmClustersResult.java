// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetCloudVmClustersCloudVmCluster;
import com.pulumi.oci.Database.outputs.GetCloudVmClustersFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetCloudVmClustersResult {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
     * 
     */
    private final @Nullable String cloudExadataInfrastructureId;
    /**
     * @return The list of cloud_vm_clusters.
     * 
     */
    private final List<GetCloudVmClustersCloudVmCluster> cloudVmClusters;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return The user-friendly name for the cloud VM cluster. The name does not need to be unique.
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable List<GetCloudVmClustersFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The current state of the cloud VM cluster.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetCloudVmClustersResult(
        @CustomType.Parameter("cloudExadataInfrastructureId") @Nullable String cloudExadataInfrastructureId,
        @CustomType.Parameter("cloudVmClusters") List<GetCloudVmClustersCloudVmCluster> cloudVmClusters,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("filters") @Nullable List<GetCloudVmClustersFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("state") @Nullable String state) {
        this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
        this.cloudVmClusters = cloudVmClusters;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.filters = filters;
        this.id = id;
        this.state = state;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cloud Exadata infrastructure.
     * 
     */
    public Optional<String> cloudExadataInfrastructureId() {
        return Optional.ofNullable(this.cloudExadataInfrastructureId);
    }
    /**
     * @return The list of cloud_vm_clusters.
     * 
     */
    public List<GetCloudVmClustersCloudVmCluster> cloudVmClusters() {
        return this.cloudVmClusters;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The user-friendly name for the cloud VM cluster. The name does not need to be unique.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public List<GetCloudVmClustersFilter> filters() {
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
     * @return The current state of the cloud VM cluster.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudVmClustersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudExadataInfrastructureId;
        private List<GetCloudVmClustersCloudVmCluster> cloudVmClusters;
        private String compartmentId;
        private @Nullable String displayName;
        private @Nullable List<GetCloudVmClustersFilter> filters;
        private String id;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudVmClustersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudExadataInfrastructureId = defaults.cloudExadataInfrastructureId;
    	      this.cloudVmClusters = defaults.cloudVmClusters;
    	      this.compartmentId = defaults.compartmentId;
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
        }

        public Builder cloudExadataInfrastructureId(@Nullable String cloudExadataInfrastructureId) {
            this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
            return this;
        }
        public Builder cloudVmClusters(List<GetCloudVmClustersCloudVmCluster> cloudVmClusters) {
            this.cloudVmClusters = Objects.requireNonNull(cloudVmClusters);
            return this;
        }
        public Builder cloudVmClusters(GetCloudVmClustersCloudVmCluster... cloudVmClusters) {
            return cloudVmClusters(List.of(cloudVmClusters));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder filters(@Nullable List<GetCloudVmClustersFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetCloudVmClustersFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetCloudVmClustersResult build() {
            return new GetCloudVmClustersResult(cloudExadataInfrastructureId, cloudVmClusters, compartmentId, displayName, filters, id, state);
        }
    }
}
