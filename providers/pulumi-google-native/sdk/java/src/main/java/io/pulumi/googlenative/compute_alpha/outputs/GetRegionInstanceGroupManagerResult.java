// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.DistributionPolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerActionsSummaryResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerAllInstancesConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerAutoHealingPolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerInstanceLifecyclePolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerStandbyPolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerStatusResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerUpdatePolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerVersionResponse;
import io.pulumi.googlenative.compute_alpha.outputs.NamedPortResponse;
import io.pulumi.googlenative.compute_alpha.outputs.StatefulPolicyResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRegionInstanceGroupManagerResult {
    private final InstanceGroupManagerAllInstancesConfigResponse allInstancesConfig;
    private final List<InstanceGroupManagerAutoHealingPolicyResponse> autoHealingPolicies;
    private final String baseInstanceName;
    private final String creationTimestamp;
    private final InstanceGroupManagerActionsSummaryResponse currentActions;
    private final String description;
    private final DistributionPolicyResponse distributionPolicy;
    private final String failoverAction;
    private final String fingerprint;
    private final String instanceGroup;
    private final InstanceGroupManagerInstanceLifecyclePolicyResponse instanceLifecyclePolicy;
    private final String instanceTemplate;
    private final String kind;
    private final String name;
    private final List<NamedPortResponse> namedPorts;
    private final String region;
    private final String selfLink;
    private final String selfLinkWithId;
    private final String serviceAccount;
    private final InstanceGroupManagerStandbyPolicyResponse standbyPolicy;
    private final StatefulPolicyResponse statefulPolicy;
    private final InstanceGroupManagerStatusResponse status;
    private final List<String> targetPools;
    private final Integer targetSize;
    private final Integer targetStoppedSize;
    private final Integer targetSuspendedSize;
    private final InstanceGroupManagerUpdatePolicyResponse updatePolicy;
    private final List<InstanceGroupManagerVersionResponse> versions;
    private final String zone;

    @OutputCustomType.Constructor({"allInstancesConfig","autoHealingPolicies","baseInstanceName","creationTimestamp","currentActions","description","distributionPolicy","failoverAction","fingerprint","instanceGroup","instanceLifecyclePolicy","instanceTemplate","kind","name","namedPorts","region","selfLink","selfLinkWithId","serviceAccount","standbyPolicy","statefulPolicy","status","targetPools","targetSize","targetStoppedSize","targetSuspendedSize","updatePolicy","versions","zone"})
    private GetRegionInstanceGroupManagerResult(
        InstanceGroupManagerAllInstancesConfigResponse allInstancesConfig,
        List<InstanceGroupManagerAutoHealingPolicyResponse> autoHealingPolicies,
        String baseInstanceName,
        String creationTimestamp,
        InstanceGroupManagerActionsSummaryResponse currentActions,
        String description,
        DistributionPolicyResponse distributionPolicy,
        String failoverAction,
        String fingerprint,
        String instanceGroup,
        InstanceGroupManagerInstanceLifecyclePolicyResponse instanceLifecyclePolicy,
        String instanceTemplate,
        String kind,
        String name,
        List<NamedPortResponse> namedPorts,
        String region,
        String selfLink,
        String selfLinkWithId,
        String serviceAccount,
        InstanceGroupManagerStandbyPolicyResponse standbyPolicy,
        StatefulPolicyResponse statefulPolicy,
        InstanceGroupManagerStatusResponse status,
        List<String> targetPools,
        Integer targetSize,
        Integer targetStoppedSize,
        Integer targetSuspendedSize,
        InstanceGroupManagerUpdatePolicyResponse updatePolicy,
        List<InstanceGroupManagerVersionResponse> versions,
        String zone) {
        this.allInstancesConfig = Objects.requireNonNull(allInstancesConfig);
        this.autoHealingPolicies = Objects.requireNonNull(autoHealingPolicies);
        this.baseInstanceName = Objects.requireNonNull(baseInstanceName);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.currentActions = Objects.requireNonNull(currentActions);
        this.description = Objects.requireNonNull(description);
        this.distributionPolicy = Objects.requireNonNull(distributionPolicy);
        this.failoverAction = Objects.requireNonNull(failoverAction);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.instanceGroup = Objects.requireNonNull(instanceGroup);
        this.instanceLifecyclePolicy = Objects.requireNonNull(instanceLifecyclePolicy);
        this.instanceTemplate = Objects.requireNonNull(instanceTemplate);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.namedPorts = Objects.requireNonNull(namedPorts);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
        this.serviceAccount = Objects.requireNonNull(serviceAccount);
        this.standbyPolicy = Objects.requireNonNull(standbyPolicy);
        this.statefulPolicy = Objects.requireNonNull(statefulPolicy);
        this.status = Objects.requireNonNull(status);
        this.targetPools = Objects.requireNonNull(targetPools);
        this.targetSize = Objects.requireNonNull(targetSize);
        this.targetStoppedSize = Objects.requireNonNull(targetStoppedSize);
        this.targetSuspendedSize = Objects.requireNonNull(targetSuspendedSize);
        this.updatePolicy = Objects.requireNonNull(updatePolicy);
        this.versions = Objects.requireNonNull(versions);
        this.zone = Objects.requireNonNull(zone);
    }

    public InstanceGroupManagerAllInstancesConfigResponse getAllInstancesConfig() {
        return this.allInstancesConfig;
    }
    public List<InstanceGroupManagerAutoHealingPolicyResponse> getAutoHealingPolicies() {
        return this.autoHealingPolicies;
    }
    public String getBaseInstanceName() {
        return this.baseInstanceName;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public InstanceGroupManagerActionsSummaryResponse getCurrentActions() {
        return this.currentActions;
    }
    public String getDescription() {
        return this.description;
    }
    public DistributionPolicyResponse getDistributionPolicy() {
        return this.distributionPolicy;
    }
    public String getFailoverAction() {
        return this.failoverAction;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }
    public String getInstanceGroup() {
        return this.instanceGroup;
    }
    public InstanceGroupManagerInstanceLifecyclePolicyResponse getInstanceLifecyclePolicy() {
        return this.instanceLifecyclePolicy;
    }
    public String getInstanceTemplate() {
        return this.instanceTemplate;
    }
    public String getKind() {
        return this.kind;
    }
    public String getName() {
        return this.name;
    }
    public List<NamedPortResponse> getNamedPorts() {
        return this.namedPorts;
    }
    public String getRegion() {
        return this.region;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    public InstanceGroupManagerStandbyPolicyResponse getStandbyPolicy() {
        return this.standbyPolicy;
    }
    public StatefulPolicyResponse getStatefulPolicy() {
        return this.statefulPolicy;
    }
    public InstanceGroupManagerStatusResponse getStatus() {
        return this.status;
    }
    public List<String> getTargetPools() {
        return this.targetPools;
    }
    public Integer getTargetSize() {
        return this.targetSize;
    }
    public Integer getTargetStoppedSize() {
        return this.targetStoppedSize;
    }
    public Integer getTargetSuspendedSize() {
        return this.targetSuspendedSize;
    }
    public InstanceGroupManagerUpdatePolicyResponse getUpdatePolicy() {
        return this.updatePolicy;
    }
    public List<InstanceGroupManagerVersionResponse> getVersions() {
        return this.versions;
    }
    public String getZone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceGroupManagerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerAllInstancesConfigResponse allInstancesConfig;
        private List<InstanceGroupManagerAutoHealingPolicyResponse> autoHealingPolicies;
        private String baseInstanceName;
        private String creationTimestamp;
        private InstanceGroupManagerActionsSummaryResponse currentActions;
        private String description;
        private DistributionPolicyResponse distributionPolicy;
        private String failoverAction;
        private String fingerprint;
        private String instanceGroup;
        private InstanceGroupManagerInstanceLifecyclePolicyResponse instanceLifecyclePolicy;
        private String instanceTemplate;
        private String kind;
        private String name;
        private List<NamedPortResponse> namedPorts;
        private String region;
        private String selfLink;
        private String selfLinkWithId;
        private String serviceAccount;
        private InstanceGroupManagerStandbyPolicyResponse standbyPolicy;
        private StatefulPolicyResponse statefulPolicy;
        private InstanceGroupManagerStatusResponse status;
        private List<String> targetPools;
        private Integer targetSize;
        private Integer targetStoppedSize;
        private Integer targetSuspendedSize;
        private InstanceGroupManagerUpdatePolicyResponse updatePolicy;
        private List<InstanceGroupManagerVersionResponse> versions;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionInstanceGroupManagerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allInstancesConfig = defaults.allInstancesConfig;
    	      this.autoHealingPolicies = defaults.autoHealingPolicies;
    	      this.baseInstanceName = defaults.baseInstanceName;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.currentActions = defaults.currentActions;
    	      this.description = defaults.description;
    	      this.distributionPolicy = defaults.distributionPolicy;
    	      this.failoverAction = defaults.failoverAction;
    	      this.fingerprint = defaults.fingerprint;
    	      this.instanceGroup = defaults.instanceGroup;
    	      this.instanceLifecyclePolicy = defaults.instanceLifecyclePolicy;
    	      this.instanceTemplate = defaults.instanceTemplate;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.namedPorts = defaults.namedPorts;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.standbyPolicy = defaults.standbyPolicy;
    	      this.statefulPolicy = defaults.statefulPolicy;
    	      this.status = defaults.status;
    	      this.targetPools = defaults.targetPools;
    	      this.targetSize = defaults.targetSize;
    	      this.targetStoppedSize = defaults.targetStoppedSize;
    	      this.targetSuspendedSize = defaults.targetSuspendedSize;
    	      this.updatePolicy = defaults.updatePolicy;
    	      this.versions = defaults.versions;
    	      this.zone = defaults.zone;
        }

        public Builder setAllInstancesConfig(InstanceGroupManagerAllInstancesConfigResponse allInstancesConfig) {
            this.allInstancesConfig = Objects.requireNonNull(allInstancesConfig);
            return this;
        }

        public Builder setAutoHealingPolicies(List<InstanceGroupManagerAutoHealingPolicyResponse> autoHealingPolicies) {
            this.autoHealingPolicies = Objects.requireNonNull(autoHealingPolicies);
            return this;
        }

        public Builder setBaseInstanceName(String baseInstanceName) {
            this.baseInstanceName = Objects.requireNonNull(baseInstanceName);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setCurrentActions(InstanceGroupManagerActionsSummaryResponse currentActions) {
            this.currentActions = Objects.requireNonNull(currentActions);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDistributionPolicy(DistributionPolicyResponse distributionPolicy) {
            this.distributionPolicy = Objects.requireNonNull(distributionPolicy);
            return this;
        }

        public Builder setFailoverAction(String failoverAction) {
            this.failoverAction = Objects.requireNonNull(failoverAction);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setInstanceGroup(String instanceGroup) {
            this.instanceGroup = Objects.requireNonNull(instanceGroup);
            return this;
        }

        public Builder setInstanceLifecyclePolicy(InstanceGroupManagerInstanceLifecyclePolicyResponse instanceLifecyclePolicy) {
            this.instanceLifecyclePolicy = Objects.requireNonNull(instanceLifecyclePolicy);
            return this;
        }

        public Builder setInstanceTemplate(String instanceTemplate) {
            this.instanceTemplate = Objects.requireNonNull(instanceTemplate);
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

        public Builder setNamedPorts(List<NamedPortResponse> namedPorts) {
            this.namedPorts = Objects.requireNonNull(namedPorts);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setSelfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setStandbyPolicy(InstanceGroupManagerStandbyPolicyResponse standbyPolicy) {
            this.standbyPolicy = Objects.requireNonNull(standbyPolicy);
            return this;
        }

        public Builder setStatefulPolicy(StatefulPolicyResponse statefulPolicy) {
            this.statefulPolicy = Objects.requireNonNull(statefulPolicy);
            return this;
        }

        public Builder setStatus(InstanceGroupManagerStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTargetPools(List<String> targetPools) {
            this.targetPools = Objects.requireNonNull(targetPools);
            return this;
        }

        public Builder setTargetSize(Integer targetSize) {
            this.targetSize = Objects.requireNonNull(targetSize);
            return this;
        }

        public Builder setTargetStoppedSize(Integer targetStoppedSize) {
            this.targetStoppedSize = Objects.requireNonNull(targetStoppedSize);
            return this;
        }

        public Builder setTargetSuspendedSize(Integer targetSuspendedSize) {
            this.targetSuspendedSize = Objects.requireNonNull(targetSuspendedSize);
            return this;
        }

        public Builder setUpdatePolicy(InstanceGroupManagerUpdatePolicyResponse updatePolicy) {
            this.updatePolicy = Objects.requireNonNull(updatePolicy);
            return this;
        }

        public Builder setVersions(List<InstanceGroupManagerVersionResponse> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }

        public GetRegionInstanceGroupManagerResult build() {
            return new GetRegionInstanceGroupManagerResult(allInstancesConfig, autoHealingPolicies, baseInstanceName, creationTimestamp, currentActions, description, distributionPolicy, failoverAction, fingerprint, instanceGroup, instanceLifecyclePolicy, instanceTemplate, kind, name, namedPorts, region, selfLink, selfLinkWithId, serviceAccount, standbyPolicy, statefulPolicy, status, targetPools, targetSize, targetStoppedSize, targetSuspendedSize, updatePolicy, versions, zone);
        }
    }
}