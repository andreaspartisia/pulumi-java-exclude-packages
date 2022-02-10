// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.CredentialResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.DeploymentLabelEntryResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.DeploymentOutputEntryResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.DeploymentUpdateResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.OperationResponse;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.TargetConfigurationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetDeploymentResult {
    private final CredentialResponse credential;
    private final String description;
    private final String fingerprint;
    private final String insertTime;
    private final List<DeploymentLabelEntryResponse> labels;
    private final String manifest;
    private final String name;
    private final OperationResponse operation;
    private final List<DeploymentOutputEntryResponse> outputs;
    private final String selfLink;
    private final TargetConfigurationResponse target;
    private final DeploymentUpdateResponse update;
    private final String updateTime;

    @OutputCustomType.Constructor({"credential","description","fingerprint","insertTime","labels","manifest","name","operation","outputs","selfLink","target","update","updateTime"})
    private GetDeploymentResult(
        CredentialResponse credential,
        String description,
        String fingerprint,
        String insertTime,
        List<DeploymentLabelEntryResponse> labels,
        String manifest,
        String name,
        OperationResponse operation,
        List<DeploymentOutputEntryResponse> outputs,
        String selfLink,
        TargetConfigurationResponse target,
        DeploymentUpdateResponse update,
        String updateTime) {
        this.credential = Objects.requireNonNull(credential);
        this.description = Objects.requireNonNull(description);
        this.fingerprint = Objects.requireNonNull(fingerprint);
        this.insertTime = Objects.requireNonNull(insertTime);
        this.labels = Objects.requireNonNull(labels);
        this.manifest = Objects.requireNonNull(manifest);
        this.name = Objects.requireNonNull(name);
        this.operation = Objects.requireNonNull(operation);
        this.outputs = Objects.requireNonNull(outputs);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.target = Objects.requireNonNull(target);
        this.update = Objects.requireNonNull(update);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    public CredentialResponse getCredential() {
        return this.credential;
    }
    public String getDescription() {
        return this.description;
    }
    public String getFingerprint() {
        return this.fingerprint;
    }
    public String getInsertTime() {
        return this.insertTime;
    }
    public List<DeploymentLabelEntryResponse> getLabels() {
        return this.labels;
    }
    public String getManifest() {
        return this.manifest;
    }
    public String getName() {
        return this.name;
    }
    public OperationResponse getOperation() {
        return this.operation;
    }
    public List<DeploymentOutputEntryResponse> getOutputs() {
        return this.outputs;
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public TargetConfigurationResponse getTarget() {
        return this.target;
    }
    public DeploymentUpdateResponse getUpdate() {
        return this.update;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CredentialResponse credential;
        private String description;
        private String fingerprint;
        private String insertTime;
        private List<DeploymentLabelEntryResponse> labels;
        private String manifest;
        private String name;
        private OperationResponse operation;
        private List<DeploymentOutputEntryResponse> outputs;
        private String selfLink;
        private TargetConfigurationResponse target;
        private DeploymentUpdateResponse update;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credential = defaults.credential;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.insertTime = defaults.insertTime;
    	      this.labels = defaults.labels;
    	      this.manifest = defaults.manifest;
    	      this.name = defaults.name;
    	      this.operation = defaults.operation;
    	      this.outputs = defaults.outputs;
    	      this.selfLink = defaults.selfLink;
    	      this.target = defaults.target;
    	      this.update = defaults.update;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCredential(CredentialResponse credential) {
            this.credential = Objects.requireNonNull(credential);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }

        public Builder setInsertTime(String insertTime) {
            this.insertTime = Objects.requireNonNull(insertTime);
            return this;
        }

        public Builder setLabels(List<DeploymentLabelEntryResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setManifest(String manifest) {
            this.manifest = Objects.requireNonNull(manifest);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperation(OperationResponse operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setOutputs(List<DeploymentOutputEntryResponse> outputs) {
            this.outputs = Objects.requireNonNull(outputs);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setTarget(TargetConfigurationResponse target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setUpdate(DeploymentUpdateResponse update) {
            this.update = Objects.requireNonNull(update);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }

        public GetDeploymentResult build() {
            return new GetDeploymentResult(credential, description, fingerprint, insertTime, labels, manifest, name, operation, outputs, selfLink, target, update, updateTime);
        }
    }
}