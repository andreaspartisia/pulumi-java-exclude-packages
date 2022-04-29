// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Database.outputs.GetVmClusterRecommendedNetworkVmNetworkNode;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVmClusterRecommendedNetworkVmNetwork {
    /**
     * @return The network domain name.
     * 
     */
    private final String domainName;
    /**
     * @return The network gateway.
     * 
     */
    private final String gateway;
    /**
     * @return The network netmask.
     * 
     */
    private final String netmask;
    /**
     * @return The network type.
     * 
     */
    private final String networkType;
    /**
     * @return The list of node details.
     * 
     */
    private final List<GetVmClusterRecommendedNetworkVmNetworkNode> nodes;
    /**
     * @return The network VLAN ID.
     * 
     */
    private final String vlanId;

    @CustomType.Constructor
    private GetVmClusterRecommendedNetworkVmNetwork(
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("gateway") String gateway,
        @CustomType.Parameter("netmask") String netmask,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("nodes") List<GetVmClusterRecommendedNetworkVmNetworkNode> nodes,
        @CustomType.Parameter("vlanId") String vlanId) {
        this.domainName = domainName;
        this.gateway = gateway;
        this.netmask = netmask;
        this.networkType = networkType;
        this.nodes = nodes;
        this.vlanId = vlanId;
    }

    /**
     * @return The network domain name.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The network gateway.
     * 
     */
    public String gateway() {
        return this.gateway;
    }
    /**
     * @return The network netmask.
     * 
     */
    public String netmask() {
        return this.netmask;
    }
    /**
     * @return The network type.
     * 
     */
    public String networkType() {
        return this.networkType;
    }
    /**
     * @return The list of node details.
     * 
     */
    public List<GetVmClusterRecommendedNetworkVmNetworkNode> nodes() {
        return this.nodes;
    }
    /**
     * @return The network VLAN ID.
     * 
     */
    public String vlanId() {
        return this.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVmClusterRecommendedNetworkVmNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private String gateway;
        private String netmask;
        private String networkType;
        private List<GetVmClusterRecommendedNetworkVmNetworkNode> nodes;
        private String vlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVmClusterRecommendedNetworkVmNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.gateway = defaults.gateway;
    	      this.netmask = defaults.netmask;
    	      this.networkType = defaults.networkType;
    	      this.nodes = defaults.nodes;
    	      this.vlanId = defaults.vlanId;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder gateway(String gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }
        public Builder netmask(String netmask) {
            this.netmask = Objects.requireNonNull(netmask);
            return this;
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder nodes(List<GetVmClusterRecommendedNetworkVmNetworkNode> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(GetVmClusterRecommendedNetworkVmNetworkNode... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder vlanId(String vlanId) {
            this.vlanId = Objects.requireNonNull(vlanId);
            return this;
        }        public GetVmClusterRecommendedNetworkVmNetwork build() {
            return new GetVmClusterRecommendedNetworkVmNetwork(domainName, gateway, netmask, networkType, nodes, vlanId);
        }
    }
}
