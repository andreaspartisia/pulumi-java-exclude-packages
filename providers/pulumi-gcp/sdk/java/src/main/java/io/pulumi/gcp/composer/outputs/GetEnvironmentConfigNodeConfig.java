// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigNodeConfigIpAllocationPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentConfigNodeConfig {
    private final Integer diskSizeGb;
    private final Boolean enableIpMasqAgent;
    private final List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies;
    private final String machineType;
    private final Integer maxPodsPerNode;
    private final String network;
    private final List<String> oauthScopes;
    private final String serviceAccount;
    private final String subnetwork;
    private final List<String> tags;
    private final String zone;

    @OutputCustomType.Constructor({"diskSizeGb","enableIpMasqAgent","ipAllocationPolicies","machineType","maxPodsPerNode","network","oauthScopes","serviceAccount","subnetwork","tags","zone"})
    private GetEnvironmentConfigNodeConfig(
        Integer diskSizeGb,
        Boolean enableIpMasqAgent,
        List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies,
        String machineType,
        Integer maxPodsPerNode,
        String network,
        List<String> oauthScopes,
        String serviceAccount,
        String subnetwork,
        List<String> tags,
        String zone) {
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.enableIpMasqAgent = Objects.requireNonNull(enableIpMasqAgent);
        this.ipAllocationPolicies = Objects.requireNonNull(ipAllocationPolicies);
        this.machineType = Objects.requireNonNull(machineType);
        this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
        this.network = Objects.requireNonNull(network);
        this.oauthScopes = Objects.requireNonNull(oauthScopes);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.subnetwork = Objects.requireNonNull(subnetwork);
        this.tags = Objects.requireNonNull(tags);
        this.zone = Objects.requireNonNull(zone);
    }

    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    public Boolean getEnableIpMasqAgent() {
        return this.enableIpMasqAgent;
    }
    public List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> getIpAllocationPolicies() {
        return this.ipAllocationPolicies;
    }
    public String getMachineType() {
        return this.machineType;
    }
    public Integer getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }
    public String getNetwork() {
        return this.network;
    }
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    public String getSubnetwork() {
        return this.subnetwork;
    }
    public List<String> getTags() {
        return this.tags;
    }
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskSizeGb;
        private Boolean enableIpMasqAgent;
        private List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies;
        private String machineType;
        private Integer maxPodsPerNode;
        private String network;
        private List<String> oauthScopes;
        private String serviceAccount;
        private String subnetwork;
        private List<String> tags;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.enableIpMasqAgent = defaults.enableIpMasqAgent;
    	      this.ipAllocationPolicies = defaults.ipAllocationPolicies;
    	      this.machineType = defaults.machineType;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.network = defaults.network;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder setDiskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setEnableIpMasqAgent(Boolean enableIpMasqAgent) {
            this.enableIpMasqAgent = Objects.requireNonNull(enableIpMasqAgent);
            return this;
        }

        public Builder setIpAllocationPolicies(List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies) {
            this.ipAllocationPolicies = Objects.requireNonNull(ipAllocationPolicies);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMaxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setOauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetEnvironmentConfigNodeConfig build() {
            return new GetEnvironmentConfigNodeConfig(diskSizeGb, enableIpMasqAgent, ipAllocationPolicies, machineType, maxPodsPerNode, network, oauthScopes, serviceAccount, subnetwork, tags, zone);
        }
    }
}