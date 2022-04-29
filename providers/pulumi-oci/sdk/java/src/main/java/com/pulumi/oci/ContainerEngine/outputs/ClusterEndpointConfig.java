// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ContainerEngine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterEndpointConfig {
    /**
     * @return Whether the cluster should be assigned a public IP address. Defaults to false. If set to true on a private subnet, the cluster provisioning will fail.
     * 
     */
    private final @Nullable Boolean isPublicIpEnabled;
    /**
     * @return A list of the OCIDs of the network security groups (NSGs) to apply to the cluster endpoint. For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/).
     * 
     */
    private final @Nullable List<String> nsgIds;
    /**
     * @return The OCID of the regional subnet in which to place the Cluster endpoint.
     * 
     */
    private final String subnetId;

    @CustomType.Constructor
    private ClusterEndpointConfig(
        @CustomType.Parameter("isPublicIpEnabled") @Nullable Boolean isPublicIpEnabled,
        @CustomType.Parameter("nsgIds") @Nullable List<String> nsgIds,
        @CustomType.Parameter("subnetId") String subnetId) {
        this.isPublicIpEnabled = isPublicIpEnabled;
        this.nsgIds = nsgIds;
        this.subnetId = subnetId;
    }

    /**
     * @return Whether the cluster should be assigned a public IP address. Defaults to false. If set to true on a private subnet, the cluster provisioning will fail.
     * 
     */
    public Optional<Boolean> isPublicIpEnabled() {
        return Optional.ofNullable(this.isPublicIpEnabled);
    }
    /**
     * @return A list of the OCIDs of the network security groups (NSGs) to apply to the cluster endpoint. For more information about NSGs, see [NetworkSecurityGroup](https://docs.cloud.oracle.com/iaas/api/#/en/iaas/20160918/NetworkSecurityGroup/).
     * 
     */
    public List<String> nsgIds() {
        return this.nsgIds == null ? List.of() : this.nsgIds;
    }
    /**
     * @return The OCID of the regional subnet in which to place the Cluster endpoint.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEndpointConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isPublicIpEnabled;
        private @Nullable List<String> nsgIds;
        private String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEndpointConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPublicIpEnabled = defaults.isPublicIpEnabled;
    	      this.nsgIds = defaults.nsgIds;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder isPublicIpEnabled(@Nullable Boolean isPublicIpEnabled) {
            this.isPublicIpEnabled = isPublicIpEnabled;
            return this;
        }
        public Builder nsgIds(@Nullable List<String> nsgIds) {
            this.nsgIds = nsgIds;
            return this;
        }
        public Builder nsgIds(String... nsgIds) {
            return nsgIds(List.of(nsgIds));
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }        public ClusterEndpointConfig build() {
            return new ClusterEndpointConfig(isPublicIpEnabled, nsgIds, subnetId);
        }
    }
}
