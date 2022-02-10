// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.AccessConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.AliasIpRangeResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NetworkInterfaceResponse {
    private final List<AccessConfigResponse> accessConfigs;
    private final List<AliasIpRangeResponse> aliasIpRanges;
    private final String fingerprint;
    private final List<AccessConfigResponse> ipv6AccessConfigs;
    private final String ipv6AccessType;
    private final String ipv6Address;
    private final String kind;
    private final String name;
    private final String network;
    private final String networkIP;
    private final String nicType;
    private final Integer queueCount;
    private final String stackType;
    private final String subnetwork;

    @OutputCustomType.Constructor({"accessConfigs","aliasIpRanges","fingerprint","ipv6AccessConfigs","ipv6AccessType","ipv6Address","kind","name","network","networkIP","nicType","queueCount","stackType","subnetwork"})
    private NetworkInterfaceResponse(
        List<AccessConfigResponse> accessConfigs,
        List<AliasIpRangeResponse> aliasIpRanges,
        String fingerprint,
        List<AccessConfigResponse> ipv6AccessConfigs,
        String ipv6AccessType,
        String ipv6Address,
        String kind,
        String name,
        String network,
        String networkIP,
        String nicType,
        Integer queueCount,
        String stackType,
        String subnetwork) {
        this.accessConfigs = Objects.requireNonNull(accessConfigs);
        this.aliasIpRanges = Objects.requireNonNull(aliasIpRanges);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.ipv6AccessConfigs = Objects.requireNonNull(ipv6AccessConfigs);
        this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
        this.ipv6Address = Objects.requireNonNull(ipv6Address);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.networkIP = Objects.requireNonNull(networkIP);
        this.nicType = Objects.requireNonNull(nicType);
        this.queueCount = Objects.requireNonNull(queueCount);
        this.stackType = Objects.requireNonNull(stackType);
        this.subnetwork = Objects.requireNonNull(subnetwork);
    }

    public List<AccessConfigResponse> getAccessConfigs() {
        return this.accessConfigs;
    }
    public List<AliasIpRangeResponse> getAliasIpRanges() {
        return this.aliasIpRanges;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }
    public List<AccessConfigResponse> getIpv6AccessConfigs() {
        return this.ipv6AccessConfigs;
    }
    public String getIpv6AccessType() {
        return this.ipv6AccessType;
    }
    public String getIpv6Address() {
        return this.ipv6Address;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public String getNetwork() {
        return this.network;
    }
    public String getNetworkIP() {
        return this.networkIP;
    }
    public String getNicType() {
        return this.nicType;
    }
    public Integer getQueueCount() {
        return this.queueCount;
    }
    public String getStackType() {
        return this.stackType;
    }
    public String getSubnetwork() {
        return this.subnetwork;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AccessConfigResponse> accessConfigs;
        private List<AliasIpRangeResponse> aliasIpRanges;
        private String fingerprint;
        private List<AccessConfigResponse> ipv6AccessConfigs;
        private String ipv6AccessType;
        private String ipv6Address;
        private String kind;
        private String name;
        private String network;
        private String networkIP;
        private String nicType;
        private Integer queueCount;
        private String stackType;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.fingerprint = defaults.fingerprint;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIP = defaults.networkIP;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setAccessConfigs(List<AccessConfigResponse> accessConfigs) {
            this.accessConfigs = Objects.requireNonNull(accessConfigs);
            return this;
        }

        public Builder setAliasIpRanges(List<AliasIpRangeResponse> aliasIpRanges) {
            this.aliasIpRanges = Objects.requireNonNull(aliasIpRanges);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setIpv6AccessConfigs(List<AccessConfigResponse> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Objects.requireNonNull(ipv6AccessConfigs);
            return this;
        }

        public Builder setIpv6AccessType(String ipv6AccessType) {
            this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
            return this;
        }

        public Builder setIpv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetworkIP(String networkIP) {
            this.networkIP = Objects.requireNonNull(networkIP);
            return this;
        }

        public Builder setNicType(String nicType) {
            this.nicType = Objects.requireNonNull(nicType);
            return this;
        }

        public Builder setQueueCount(Integer queueCount) {
            this.queueCount = Objects.requireNonNull(queueCount);
            return this;
        }

        public Builder setStackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public NetworkInterfaceResponse build() {
            return new NetworkInterfaceResponse(accessConfigs, aliasIpRanges, fingerprint, ipv6AccessConfigs, ipv6AccessType, ipv6Address, kind, name, network, networkIP, nicType, queueCount, stackType, subnetwork);
        }
    }
}