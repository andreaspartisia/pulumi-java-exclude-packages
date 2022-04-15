// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for controlling how IPs are allocated in the cluster.
 * 
 */
public final class IPAllocationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAllocationPolicyArgs Empty = new IPAllocationPolicyArgs();

    /**
     * The IP address range for the cluster pod IPs. If this field is set, then `cluster.cluster_ipv4_cidr` must be left blank. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="clusterIpv4CidrBlock")
      private final @Nullable Output<String> clusterIpv4CidrBlock;

    public Output<String> clusterIpv4CidrBlock() {
        return this.clusterIpv4CidrBlock == null ? Codegen.empty() : this.clusterIpv4CidrBlock;
    }

    /**
     * The name of the secondary range to be used for the cluster CIDR block. The secondary range will be used for pod IP addresses. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
     */
    @Import(name="clusterSecondaryRangeName")
      private final @Nullable Output<String> clusterSecondaryRangeName;

    public Output<String> clusterSecondaryRangeName() {
        return this.clusterSecondaryRangeName == null ? Codegen.empty() : this.clusterSecondaryRangeName;
    }

    /**
     * Whether a new subnetwork will be created automatically for the cluster. This field is only applicable when `use_ip_aliases` is true.
     * 
     */
    @Import(name="createSubnetwork")
      private final @Nullable Output<Boolean> createSubnetwork;

    public Output<Boolean> createSubnetwork() {
        return this.createSubnetwork == null ? Codegen.empty() : this.createSubnetwork;
    }

    /**
     * The IP address range of the instance IPs in this cluster. This is applicable only if `create_subnetwork` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="nodeIpv4CidrBlock")
      private final @Nullable Output<String> nodeIpv4CidrBlock;

    public Output<String> nodeIpv4CidrBlock() {
        return this.nodeIpv4CidrBlock == null ? Codegen.empty() : this.nodeIpv4CidrBlock;
    }

    /**
     * The IP address range of the services IPs in this cluster. If blank, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. Set to blank to have a range chosen with the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="servicesIpv4CidrBlock")
      private final @Nullable Output<String> servicesIpv4CidrBlock;

    public Output<String> servicesIpv4CidrBlock() {
        return this.servicesIpv4CidrBlock == null ? Codegen.empty() : this.servicesIpv4CidrBlock;
    }

    /**
     * The name of the secondary range to be used as for the services CIDR block. The secondary range will be used for service ClusterIPs. This must be an existing secondary range associated with the cluster subnetwork. This field is only applicable with use_ip_aliases is true and create_subnetwork is false.
     * 
     */
    @Import(name="servicesSecondaryRangeName")
      private final @Nullable Output<String> servicesSecondaryRangeName;

    public Output<String> servicesSecondaryRangeName() {
        return this.servicesSecondaryRangeName == null ? Codegen.empty() : this.servicesSecondaryRangeName;
    }

    /**
     * A custom subnetwork name to be used if `create_subnetwork` is true. If this field is empty, then an automatic name will be chosen for the new subnetwork.
     * 
     */
    @Import(name="subnetworkName")
      private final @Nullable Output<String> subnetworkName;

    public Output<String> subnetworkName() {
        return this.subnetworkName == null ? Codegen.empty() : this.subnetworkName;
    }

    /**
     * The IP address range of the Cloud TPUs in this cluster. If unspecified, a range will be automatically chosen with the default size. This field is only applicable when `use_ip_aliases` is true. If unspecified, the range will use the default size. Set to /netmask (e.g. `/14`) to have a range chosen with a specific netmask. Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g. `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`, `192.168.0.0/16`) to pick a specific range to use.
     * 
     */
    @Import(name="tpuIpv4CidrBlock")
      private final @Nullable Output<String> tpuIpv4CidrBlock;

    public Output<String> tpuIpv4CidrBlock() {
        return this.tpuIpv4CidrBlock == null ? Codegen.empty() : this.tpuIpv4CidrBlock;
    }

    /**
     * Whether alias IPs will be used for pod IPs in the cluster. This is used in conjunction with use_routes. It cannot be true if use_routes is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    @Import(name="useIpAliases")
      private final @Nullable Output<Boolean> useIpAliases;

    public Output<Boolean> useIpAliases() {
        return this.useIpAliases == null ? Codegen.empty() : this.useIpAliases;
    }

    /**
     * Whether routes will be used for pod IPs in the cluster. This is used in conjunction with use_ip_aliases. It cannot be true if use_ip_aliases is true. If both use_ip_aliases and use_routes are false, then the server picks the default IP allocation mode
     * 
     */
    @Import(name="useRoutes")
      private final @Nullable Output<Boolean> useRoutes;

    public Output<Boolean> useRoutes() {
        return this.useRoutes == null ? Codegen.empty() : this.useRoutes;
    }

    public IPAllocationPolicyArgs(
        @Nullable Output<String> clusterIpv4CidrBlock,
        @Nullable Output<String> clusterSecondaryRangeName,
        @Nullable Output<Boolean> createSubnetwork,
        @Nullable Output<String> nodeIpv4CidrBlock,
        @Nullable Output<String> servicesIpv4CidrBlock,
        @Nullable Output<String> servicesSecondaryRangeName,
        @Nullable Output<String> subnetworkName,
        @Nullable Output<String> tpuIpv4CidrBlock,
        @Nullable Output<Boolean> useIpAliases,
        @Nullable Output<Boolean> useRoutes) {
        this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
        this.clusterSecondaryRangeName = clusterSecondaryRangeName;
        this.createSubnetwork = createSubnetwork;
        this.nodeIpv4CidrBlock = nodeIpv4CidrBlock;
        this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
        this.servicesSecondaryRangeName = servicesSecondaryRangeName;
        this.subnetworkName = subnetworkName;
        this.tpuIpv4CidrBlock = tpuIpv4CidrBlock;
        this.useIpAliases = useIpAliases;
        this.useRoutes = useRoutes;
    }

    private IPAllocationPolicyArgs() {
        this.clusterIpv4CidrBlock = Codegen.empty();
        this.clusterSecondaryRangeName = Codegen.empty();
        this.createSubnetwork = Codegen.empty();
        this.nodeIpv4CidrBlock = Codegen.empty();
        this.servicesIpv4CidrBlock = Codegen.empty();
        this.servicesSecondaryRangeName = Codegen.empty();
        this.subnetworkName = Codegen.empty();
        this.tpuIpv4CidrBlock = Codegen.empty();
        this.useIpAliases = Codegen.empty();
        this.useRoutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAllocationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterIpv4CidrBlock;
        private @Nullable Output<String> clusterSecondaryRangeName;
        private @Nullable Output<Boolean> createSubnetwork;
        private @Nullable Output<String> nodeIpv4CidrBlock;
        private @Nullable Output<String> servicesIpv4CidrBlock;
        private @Nullable Output<String> servicesSecondaryRangeName;
        private @Nullable Output<String> subnetworkName;
        private @Nullable Output<String> tpuIpv4CidrBlock;
        private @Nullable Output<Boolean> useIpAliases;
        private @Nullable Output<Boolean> useRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAllocationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIpv4CidrBlock = defaults.clusterIpv4CidrBlock;
    	      this.clusterSecondaryRangeName = defaults.clusterSecondaryRangeName;
    	      this.createSubnetwork = defaults.createSubnetwork;
    	      this.nodeIpv4CidrBlock = defaults.nodeIpv4CidrBlock;
    	      this.servicesIpv4CidrBlock = defaults.servicesIpv4CidrBlock;
    	      this.servicesSecondaryRangeName = defaults.servicesSecondaryRangeName;
    	      this.subnetworkName = defaults.subnetworkName;
    	      this.tpuIpv4CidrBlock = defaults.tpuIpv4CidrBlock;
    	      this.useIpAliases = defaults.useIpAliases;
    	      this.useRoutes = defaults.useRoutes;
        }

        public Builder clusterIpv4CidrBlock(@Nullable Output<String> clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
            return this;
        }
        public Builder clusterIpv4CidrBlock(@Nullable String clusterIpv4CidrBlock) {
            this.clusterIpv4CidrBlock = Codegen.ofNullable(clusterIpv4CidrBlock);
            return this;
        }
        public Builder clusterSecondaryRangeName(@Nullable Output<String> clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = clusterSecondaryRangeName;
            return this;
        }
        public Builder clusterSecondaryRangeName(@Nullable String clusterSecondaryRangeName) {
            this.clusterSecondaryRangeName = Codegen.ofNullable(clusterSecondaryRangeName);
            return this;
        }
        public Builder createSubnetwork(@Nullable Output<Boolean> createSubnetwork) {
            this.createSubnetwork = createSubnetwork;
            return this;
        }
        public Builder createSubnetwork(@Nullable Boolean createSubnetwork) {
            this.createSubnetwork = Codegen.ofNullable(createSubnetwork);
            return this;
        }
        public Builder nodeIpv4CidrBlock(@Nullable Output<String> nodeIpv4CidrBlock) {
            this.nodeIpv4CidrBlock = nodeIpv4CidrBlock;
            return this;
        }
        public Builder nodeIpv4CidrBlock(@Nullable String nodeIpv4CidrBlock) {
            this.nodeIpv4CidrBlock = Codegen.ofNullable(nodeIpv4CidrBlock);
            return this;
        }
        public Builder servicesIpv4CidrBlock(@Nullable Output<String> servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
            return this;
        }
        public Builder servicesIpv4CidrBlock(@Nullable String servicesIpv4CidrBlock) {
            this.servicesIpv4CidrBlock = Codegen.ofNullable(servicesIpv4CidrBlock);
            return this;
        }
        public Builder servicesSecondaryRangeName(@Nullable Output<String> servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = servicesSecondaryRangeName;
            return this;
        }
        public Builder servicesSecondaryRangeName(@Nullable String servicesSecondaryRangeName) {
            this.servicesSecondaryRangeName = Codegen.ofNullable(servicesSecondaryRangeName);
            return this;
        }
        public Builder subnetworkName(@Nullable Output<String> subnetworkName) {
            this.subnetworkName = subnetworkName;
            return this;
        }
        public Builder subnetworkName(@Nullable String subnetworkName) {
            this.subnetworkName = Codegen.ofNullable(subnetworkName);
            return this;
        }
        public Builder tpuIpv4CidrBlock(@Nullable Output<String> tpuIpv4CidrBlock) {
            this.tpuIpv4CidrBlock = tpuIpv4CidrBlock;
            return this;
        }
        public Builder tpuIpv4CidrBlock(@Nullable String tpuIpv4CidrBlock) {
            this.tpuIpv4CidrBlock = Codegen.ofNullable(tpuIpv4CidrBlock);
            return this;
        }
        public Builder useIpAliases(@Nullable Output<Boolean> useIpAliases) {
            this.useIpAliases = useIpAliases;
            return this;
        }
        public Builder useIpAliases(@Nullable Boolean useIpAliases) {
            this.useIpAliases = Codegen.ofNullable(useIpAliases);
            return this;
        }
        public Builder useRoutes(@Nullable Output<Boolean> useRoutes) {
            this.useRoutes = useRoutes;
            return this;
        }
        public Builder useRoutes(@Nullable Boolean useRoutes) {
            this.useRoutes = Codegen.ofNullable(useRoutes);
            return this;
        }        public IPAllocationPolicyArgs build() {
            return new IPAllocationPolicyArgs(clusterIpv4CidrBlock, clusterSecondaryRangeName, createSubnetwork, nodeIpv4CidrBlock, servicesIpv4CidrBlock, servicesSecondaryRangeName, subnetworkName, tpuIpv4CidrBlock, useIpAliases, useRoutes);
        }
    }
}
