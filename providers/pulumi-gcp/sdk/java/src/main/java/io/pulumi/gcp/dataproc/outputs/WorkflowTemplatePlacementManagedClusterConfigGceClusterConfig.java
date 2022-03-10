// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig {
    /**
     * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    private final @Nullable Boolean internalIpOnly;
    /**
     * The Compute Engine metadata entries to add to all instances (see (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither `network_uri` nor `subnetwork_uri` is specified, the "default" network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see /regions/global/default`*`default`
     * 
     */
    private final @Nullable String network;
    /**
     * Optional. Node Group Affinity for sole-tenant clusters.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity nodeGroupAffinity;
    /**
     * Optional. The type of IPv6 access for a cluster. Possible values: PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED, INHERIT_FROM_SUBNETWORK, OUTBOUND, BIDIRECTIONAL
     * 
     */
    private final @Nullable String privateIpv6GoogleAccess;
    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity reservationAffinity;
    /**
     * Optional. The (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    private final @Nullable String serviceAccount;
    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: * https://www.googleapis.com/auth/cloud.useraccounts.readonly * https://www.googleapis.com/auth/devstorage.read_write * https://www.googleapis.com/auth/logging.write If no scopes are specified, the following defaults are also provided: * https://www.googleapis.com/auth/bigquery * https://www.googleapis.com/auth/bigtable.admin.table * https://www.googleapis.com/auth/bigtable.data * https://www.googleapis.com/auth/devstorage.full_control
     * 
     */
    private final @Nullable List<String> serviceAccountScopes;
    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects//regions/us-east1/subnetworks/sub0` * `sub0`
     * 
     */
    private final @Nullable String subnetwork;
    /**
     * The Compute Engine tags to add to all instances (see (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    private final @Nullable List<String> tags;
    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` * `us-central1-f`
     * 
     */
    private final @Nullable String zone;

    @OutputCustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig(
        @OutputCustomType.Parameter("internalIpOnly") @Nullable Boolean internalIpOnly,
        @OutputCustomType.Parameter("metadata") @Nullable Map<String,String> metadata,
        @OutputCustomType.Parameter("network") @Nullable String network,
        @OutputCustomType.Parameter("nodeGroupAffinity") @Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity nodeGroupAffinity,
        @OutputCustomType.Parameter("privateIpv6GoogleAccess") @Nullable String privateIpv6GoogleAccess,
        @OutputCustomType.Parameter("reservationAffinity") @Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity reservationAffinity,
        @OutputCustomType.Parameter("serviceAccount") @Nullable String serviceAccount,
        @OutputCustomType.Parameter("serviceAccountScopes") @Nullable List<String> serviceAccountScopes,
        @OutputCustomType.Parameter("subnetwork") @Nullable String subnetwork,
        @OutputCustomType.Parameter("tags") @Nullable List<String> tags,
        @OutputCustomType.Parameter("zone") @Nullable String zone) {
        this.internalIpOnly = internalIpOnly;
        this.metadata = metadata;
        this.network = network;
        this.nodeGroupAffinity = nodeGroupAffinity;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.subnetwork = subnetwork;
        this.tags = tags;
        this.zone = zone;
    }

    /**
     * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This `internal_ip_only` restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
    */
    public Optional<Boolean> getInternalIpOnly() {
        return Optional.ofNullable(this.internalIpOnly);
    }
    /**
     * The Compute Engine metadata entries to add to all instances (see (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither `network_uri` nor `subnetwork_uri` is specified, the "default" network of the project is used, if it exists. Cannot be a "Custom Subnet Network" (see /regions/global/default`*`default`
     * 
    */
    public Optional<String> getNetwork() {
        return Optional.ofNullable(this.network);
    }
    /**
     * Optional. Node Group Affinity for sole-tenant clusters.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity> getNodeGroupAffinity() {
        return Optional.ofNullable(this.nodeGroupAffinity);
    }
    /**
     * Optional. The type of IPv6 access for a cluster. Possible values: PRIVATE_IPV6_GOOGLE_ACCESS_UNSPECIFIED, INHERIT_FROM_SUBNETWORK, OUTBOUND, BIDIRECTIONAL
     * 
    */
    public Optional<String> getPrivateIpv6GoogleAccess() {
        return Optional.ofNullable(this.privateIpv6GoogleAccess);
    }
    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity> getReservationAffinity() {
        return Optional.ofNullable(this.reservationAffinity);
    }
    /**
     * Optional. The (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
    */
    public Optional<String> getServiceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: * https://www.googleapis.com/auth/cloud.useraccounts.readonly * https://www.googleapis.com/auth/devstorage.read_write * https://www.googleapis.com/auth/logging.write If no scopes are specified, the following defaults are also provided: * https://www.googleapis.com/auth/bigquery * https://www.googleapis.com/auth/bigtable.admin.table * https://www.googleapis.com/auth/bigtable.data * https://www.googleapis.com/auth/devstorage.full_control
     * 
    */
    public List<String> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? List.of() : this.serviceAccountScopes;
    }
    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects//regions/us-east1/subnetworks/sub0` * `sub0`
     * 
    */
    public Optional<String> getSubnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }
    /**
     * The Compute Engine tags to add to all instances (see (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
    */
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the "global" region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present. A full URL, partial URI, or short name are valid. Examples: * `https://www.googleapis.com/compute/v1/projects/` * `us-central1-f`
     * 
    */
    public Optional<String> getZone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean internalIpOnly;
        private @Nullable Map<String,String> metadata;
        private @Nullable String network;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity nodeGroupAffinity;
        private @Nullable String privateIpv6GoogleAccess;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity reservationAffinity;
        private @Nullable String serviceAccount;
        private @Nullable List<String> serviceAccountScopes;
        private @Nullable String subnetwork;
        private @Nullable List<String> tags;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.nodeGroupAffinity = defaults.nodeGroupAffinity;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder setInternalIpOnly(@Nullable Boolean internalIpOnly) {
            this.internalIpOnly = internalIpOnly;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = network;
            return this;
        }

        public Builder setNodeGroupAffinity(@Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinity nodeGroupAffinity) {
            this.nodeGroupAffinity = nodeGroupAffinity;
            return this;
        }

        public Builder setPrivateIpv6GoogleAccess(@Nullable String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder setReservationAffinity(@Nullable WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigReservationAffinity reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccountScopes(@Nullable List<String> serviceAccountScopes) {
            this.serviceAccountScopes = serviceAccountScopes;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setZone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfig(internalIpOnly, metadata, network, nodeGroupAffinity, privateIpv6GoogleAccess, reservationAffinity, serviceAccount, serviceAccountScopes, subnetwork, tags, zone);
        }
    }
}
