// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.IncidentLabelResponse;
import io.pulumi.azurenative.securityinsights.outputs.IncidentOwnerInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomationRuleModifyPropertiesActionResponseActionConfiguration {
    private final @Nullable String classification;
    private final @Nullable String classificationComment;
    private final @Nullable String classificationReason;
    private final @Nullable List<IncidentLabelResponse> labels;
    private final @Nullable IncidentOwnerInfoResponse owner;
    private final @Nullable String severity;
    private final @Nullable String status;

    @OutputCustomType.Constructor({"classification","classificationComment","classificationReason","labels","owner","severity","status"})
    private AutomationRuleModifyPropertiesActionResponseActionConfiguration(
        @Nullable String classification,
        @Nullable String classificationComment,
        @Nullable String classificationReason,
        @Nullable List<IncidentLabelResponse> labels,
        @Nullable IncidentOwnerInfoResponse owner,
        @Nullable String severity,
        @Nullable String status) {
        this.classification = classification;
        this.classificationComment = classificationComment;
        this.classificationReason = classificationReason;
        this.labels = labels;
        this.owner = owner;
        this.severity = severity;
        this.status = status;
    }

    public Optional<String> getClassification() {
        return Optional.ofNullable(this.classification);
    }
    public Optional<String> getClassificationComment() {
        return Optional.ofNullable(this.classificationComment);
    }
    public Optional<String> getClassificationReason() {
        return Optional.ofNullable(this.classificationReason);
    }
    public List<IncidentLabelResponse> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    public Optional<IncidentOwnerInfoResponse> getOwner() {
        return Optional.ofNullable(this.owner);
    }
    public Optional<String> getSeverity() {
        return Optional.ofNullable(this.severity);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationRuleModifyPropertiesActionResponseActionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String classification;
        private @Nullable String classificationComment;
        private @Nullable String classificationReason;
        private @Nullable List<IncidentLabelResponse> labels;
        private @Nullable IncidentOwnerInfoResponse owner;
        private @Nullable String severity;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationRuleModifyPropertiesActionResponseActionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classification = defaults.classification;
    	      this.classificationComment = defaults.classificationComment;
    	      this.classificationReason = defaults.classificationReason;
    	      this.labels = defaults.labels;
    	      this.owner = defaults.owner;
    	      this.severity = defaults.severity;
    	      this.status = defaults.status;
        }

        public Builder setClassification(@Nullable String classification) {
            this.classification = classification;
            return this;
        }

        public Builder setClassificationComment(@Nullable String classificationComment) {
            this.classificationComment = classificationComment;
            return this;
        }

        public Builder setClassificationReason(@Nullable String classificationReason) {
            this.classificationReason = classificationReason;
            return this;
        }

        public Builder setLabels(@Nullable List<IncidentLabelResponse> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setOwner(@Nullable IncidentOwnerInfoResponse owner) {
            this.owner = owner;
            return this;
        }

        public Builder setSeverity(@Nullable String severity) {
            this.severity = severity;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public AutomationRuleModifyPropertiesActionResponseActionConfiguration build() {
            return new AutomationRuleModifyPropertiesActionResponseActionConfiguration(classification, classificationComment, classificationReason, labels, owner, severity, status);
        }
    }
}