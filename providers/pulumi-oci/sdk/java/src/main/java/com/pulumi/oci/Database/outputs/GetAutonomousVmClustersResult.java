// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetAutonomousVmClustersAutonomousVmCluster;
import com.pulumi.oci.Database.outputs.GetAutonomousVmClustersFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAutonomousVmClustersResult {
    /**
     * @return The list of autonomous_vm_clusters.
     * 
     */
    private final List<GetAutonomousVmClustersAutonomousVmCluster> autonomousVmClusters;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     * 
     */
    private final @Nullable String exadataInfrastructureId;
    private final @Nullable List<GetAutonomousVmClustersFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The current state of the Autonomous VM cluster.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetAutonomousVmClustersResult(
        @CustomType.Parameter("autonomousVmClusters") List<GetAutonomousVmClustersAutonomousVmCluster> autonomousVmClusters,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("exadataInfrastructureId") @Nullable String exadataInfrastructureId,
        @CustomType.Parameter("filters") @Nullable List<GetAutonomousVmClustersFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("state") @Nullable String state) {
        this.autonomousVmClusters = autonomousVmClusters;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.filters = filters;
        this.id = id;
        this.state = state;
    }

    /**
     * @return The list of autonomous_vm_clusters.
     * 
     */
    public List<GetAutonomousVmClustersAutonomousVmCluster> autonomousVmClusters() {
        return this.autonomousVmClusters;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     * 
     */
    public Optional<String> exadataInfrastructureId() {
        return Optional.ofNullable(this.exadataInfrastructureId);
    }
    public List<GetAutonomousVmClustersFilter> filters() {
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
     * @return The current state of the Autonomous VM cluster.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousVmClustersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAutonomousVmClustersAutonomousVmCluster> autonomousVmClusters;
        private String compartmentId;
        private @Nullable String displayName;
        private @Nullable String exadataInfrastructureId;
        private @Nullable List<GetAutonomousVmClustersFilter> filters;
        private String id;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutonomousVmClustersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autonomousVmClusters = defaults.autonomousVmClusters;
    	      this.compartmentId = defaults.compartmentId;
    	      this.displayName = defaults.displayName;
    	      this.exadataInfrastructureId = defaults.exadataInfrastructureId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
        }

        public Builder autonomousVmClusters(List<GetAutonomousVmClustersAutonomousVmCluster> autonomousVmClusters) {
            this.autonomousVmClusters = Objects.requireNonNull(autonomousVmClusters);
            return this;
        }
        public Builder autonomousVmClusters(GetAutonomousVmClustersAutonomousVmCluster... autonomousVmClusters) {
            return autonomousVmClusters(List.of(autonomousVmClusters));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder exadataInfrastructureId(@Nullable String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            return this;
        }
        public Builder filters(@Nullable List<GetAutonomousVmClustersFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAutonomousVmClustersFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetAutonomousVmClustersResult build() {
            return new GetAutonomousVmClustersResult(autonomousVmClusters, compartmentId, displayName, exadataInfrastructureId, filters, id, state);
        }
    }
}
