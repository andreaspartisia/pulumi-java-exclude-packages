// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateNetworkInterfaceAccessConfig;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateNetworkInterfaceAliasIpRange;
import io.pulumi.gcp.compute.outputs.InstanceFromTemplateNetworkInterfaceIpv6AccessConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceFromTemplateNetworkInterface {
    private final @Nullable List<InstanceFromTemplateNetworkInterfaceAccessConfig> accessConfigs;
    private final @Nullable List<InstanceFromTemplateNetworkInterfaceAliasIpRange> aliasIpRanges;
    private final @Nullable List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs;
    private final @Nullable String ipv6AccessType;
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    private final @Nullable String name;
    private final @Nullable String network;
    private final @Nullable String networkIp;
    private final @Nullable String nicType;
    private final @Nullable Integer queueCount;
    private final @Nullable String stackType;
    private final @Nullable String subnetwork;
    private final @Nullable String subnetworkProject;

    @OutputCustomType.Constructor
    private InstanceFromTemplateNetworkInterface(
        @OutputCustomType.Parameter("accessConfigs") @Nullable List<InstanceFromTemplateNetworkInterfaceAccessConfig> accessConfigs,
        @OutputCustomType.Parameter("aliasIpRanges") @Nullable List<InstanceFromTemplateNetworkInterfaceAliasIpRange> aliasIpRanges,
        @OutputCustomType.Parameter("ipv6AccessConfigs") @Nullable List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs,
        @OutputCustomType.Parameter("ipv6AccessType") @Nullable String ipv6AccessType,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("network") @Nullable String network,
        @OutputCustomType.Parameter("networkIp") @Nullable String networkIp,
        @OutputCustomType.Parameter("nicType") @Nullable String nicType,
        @OutputCustomType.Parameter("queueCount") @Nullable Integer queueCount,
        @OutputCustomType.Parameter("stackType") @Nullable String stackType,
        @OutputCustomType.Parameter("subnetwork") @Nullable String subnetwork,
        @OutputCustomType.Parameter("subnetworkProject") @Nullable String subnetworkProject) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6AccessType = ipv6AccessType;
        this.name = name;
        this.network = network;
        this.networkIp = networkIp;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subnetwork = subnetwork;
        this.subnetworkProject = subnetworkProject;
    }

    public List<InstanceFromTemplateNetworkInterfaceAccessConfig> getAccessConfigs() {
        return this.accessConfigs == null ? List.of() : this.accessConfigs;
    }
    public List<InstanceFromTemplateNetworkInterfaceAliasIpRange> getAliasIpRanges() {
        return this.aliasIpRanges == null ? List.of() : this.aliasIpRanges;
    }
    public List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfig> getIpv6AccessConfigs() {
        return this.ipv6AccessConfigs == null ? List.of() : this.ipv6AccessConfigs;
    }
    public Optional<String> getIpv6AccessType() {
        return Optional.ofNullable(this.ipv6AccessType);
    }
    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getNetwork() {
        return Optional.ofNullable(this.network);
    }
    public Optional<String> getNetworkIp() {
        return Optional.ofNullable(this.networkIp);
    }
    public Optional<String> getNicType() {
        return Optional.ofNullable(this.nicType);
    }
    public Optional<Integer> getQueueCount() {
        return Optional.ofNullable(this.queueCount);
    }
    public Optional<String> getStackType() {
        return Optional.ofNullable(this.stackType);
    }
    public Optional<String> getSubnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }
    public Optional<String> getSubnetworkProject() {
        return Optional.ofNullable(this.subnetworkProject);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InstanceFromTemplateNetworkInterfaceAccessConfig> accessConfigs;
        private @Nullable List<InstanceFromTemplateNetworkInterfaceAliasIpRange> aliasIpRanges;
        private @Nullable List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs;
        private @Nullable String ipv6AccessType;
        private @Nullable String name;
        private @Nullable String network;
        private @Nullable String networkIp;
        private @Nullable String nicType;
        private @Nullable Integer queueCount;
        private @Nullable String stackType;
        private @Nullable String subnetwork;
        private @Nullable String subnetworkProject;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIp = defaults.networkIp;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subnetwork = defaults.subnetwork;
    	      this.subnetworkProject = defaults.subnetworkProject;
        }

        public Builder setAccessConfigs(@Nullable List<InstanceFromTemplateNetworkInterfaceAccessConfig> accessConfigs) {
            this.accessConfigs = accessConfigs;
            return this;
        }

        public Builder setAliasIpRanges(@Nullable List<InstanceFromTemplateNetworkInterfaceAliasIpRange> aliasIpRanges) {
            this.aliasIpRanges = aliasIpRanges;
            return this;
        }

        public Builder setIpv6AccessConfigs(@Nullable List<InstanceFromTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }

        public Builder setIpv6AccessType(@Nullable String ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = network;
            return this;
        }

        public Builder setNetworkIp(@Nullable String networkIp) {
            this.networkIp = networkIp;
            return this;
        }

        public Builder setNicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder setQueueCount(@Nullable Integer queueCount) {
            this.queueCount = queueCount;
            return this;
        }

        public Builder setStackType(@Nullable String stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setSubnetworkProject(@Nullable String subnetworkProject) {
            this.subnetworkProject = subnetworkProject;
            return this;
        }
        public InstanceFromTemplateNetworkInterface build() {
            return new InstanceFromTemplateNetworkInterface(accessConfigs, aliasIpRanges, ipv6AccessConfigs, ipv6AccessType, name, network, networkIp, nicType, queueCount, stackType, subnetwork, subnetworkProject);
        }
    }
}
