// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterVpcConfig {
    /**
     * Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
     * 
     */
    private final @Nullable String clusterSecurityGroupId;
    /**
     * Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
     * 
     */
    private final @Nullable Boolean endpointPrivateAccess;
    /**
     * Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
     * 
     */
    private final @Nullable Boolean endpointPublicAccess;
    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    private final @Nullable List<String> publicAccessCidrs;
    /**
     * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * 
     */
    private final List<String> subnetIds;
    /**
     * ID of the VPC associated with your cluster.
     * 
     */
    private final @Nullable String vpcId;

    @OutputCustomType.Constructor
    private ClusterVpcConfig(
        @OutputCustomType.Parameter("clusterSecurityGroupId") @Nullable String clusterSecurityGroupId,
        @OutputCustomType.Parameter("endpointPrivateAccess") @Nullable Boolean endpointPrivateAccess,
        @OutputCustomType.Parameter("endpointPublicAccess") @Nullable Boolean endpointPublicAccess,
        @OutputCustomType.Parameter("publicAccessCidrs") @Nullable List<String> publicAccessCidrs,
        @OutputCustomType.Parameter("securityGroupIds") @Nullable List<String> securityGroupIds,
        @OutputCustomType.Parameter("subnetIds") List<String> subnetIds,
        @OutputCustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.clusterSecurityGroupId = clusterSecurityGroupId;
        this.endpointPrivateAccess = endpointPrivateAccess;
        this.endpointPublicAccess = endpointPublicAccess;
        this.publicAccessCidrs = publicAccessCidrs;
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    /**
     * Cluster security group that was created by Amazon EKS for the cluster. Managed node groups use this security group for control-plane-to-data-plane communication.
     * 
    */
    public Optional<String> getClusterSecurityGroupId() {
        return Optional.ofNullable(this.clusterSecurityGroupId);
    }
    /**
     * Whether the Amazon EKS private API server endpoint is enabled. Default is `false`.
     * 
    */
    public Optional<Boolean> getEndpointPrivateAccess() {
        return Optional.ofNullable(this.endpointPrivateAccess);
    }
    /**
     * Whether the Amazon EKS public API server endpoint is enabled. Default is `true`.
     * 
    */
    public Optional<Boolean> getEndpointPublicAccess() {
        return Optional.ofNullable(this.endpointPublicAccess);
    }
    /**
     * List of CIDR blocks. Indicates which CIDR blocks can access the Amazon EKS public API server endpoint when enabled. EKS defaults this to a list with `0.0.0.0/0`. This provider will only perform drift detection of its value when present in a configuration.
     * 
    */
    public List<String> getPublicAccessCidrs() {
        return this.publicAccessCidrs == null ? List.of() : this.publicAccessCidrs;
    }
    /**
     * List of security group IDs for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * List of subnet IDs. Must be in at least two different availability zones. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    /**
     * ID of the VPC associated with your cluster.
     * 
    */
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterSecurityGroupId;
        private @Nullable Boolean endpointPrivateAccess;
        private @Nullable Boolean endpointPublicAccess;
        private @Nullable List<String> publicAccessCidrs;
        private @Nullable List<String> securityGroupIds;
        private List<String> subnetIds;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSecurityGroupId = defaults.clusterSecurityGroupId;
    	      this.endpointPrivateAccess = defaults.endpointPrivateAccess;
    	      this.endpointPublicAccess = defaults.endpointPublicAccess;
    	      this.publicAccessCidrs = defaults.publicAccessCidrs;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setClusterSecurityGroupId(@Nullable String clusterSecurityGroupId) {
            this.clusterSecurityGroupId = clusterSecurityGroupId;
            return this;
        }

        public Builder setEndpointPrivateAccess(@Nullable Boolean endpointPrivateAccess) {
            this.endpointPrivateAccess = endpointPrivateAccess;
            return this;
        }

        public Builder setEndpointPublicAccess(@Nullable Boolean endpointPublicAccess) {
            this.endpointPublicAccess = endpointPublicAccess;
            return this;
        }

        public Builder setPublicAccessCidrs(@Nullable List<String> publicAccessCidrs) {
            this.publicAccessCidrs = publicAccessCidrs;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public ClusterVpcConfig build() {
            return new ClusterVpcConfig(clusterSecurityGroupId, endpointPrivateAccess, endpointPublicAccess, publicAccessCidrs, securityGroupIds, subnetIds, vpcId);
        }
    }
}