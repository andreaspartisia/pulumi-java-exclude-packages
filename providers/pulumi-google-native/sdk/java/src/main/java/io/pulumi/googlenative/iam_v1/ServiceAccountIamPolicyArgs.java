// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.iam_v1.inputs.AuditConfigArgs;
import io.pulumi.googlenative.iam_v1.inputs.BindingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAccountIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAccountIamPolicyArgs Empty = new ServiceAccountIamPolicyArgs();

    @InputImport(name="auditConfigs")
    private final @Nullable Input<List<AuditConfigArgs>> auditConfigs;

    public Input<List<AuditConfigArgs>> getAuditConfigs() {
        return this.auditConfigs == null ? Input.empty() : this.auditConfigs;
    }

    @InputImport(name="bindings")
    private final @Nullable Input<List<BindingArgs>> bindings;

    public Input<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Input.empty() : this.bindings;
    }

    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="serviceAccountId", required=true)
    private final Input<String> serviceAccountId;

    public Input<String> getServiceAccountId() {
        return this.serviceAccountId;
    }

    @InputImport(name="updateMask")
    private final @Nullable Input<String> updateMask;

    public Input<String> getUpdateMask() {
        return this.updateMask == null ? Input.empty() : this.updateMask;
    }

    @InputImport(name="version")
    private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public ServiceAccountIamPolicyArgs(
        @Nullable Input<List<AuditConfigArgs>> auditConfigs,
        @Nullable Input<List<BindingArgs>> bindings,
        @Nullable Input<String> etag,
        @Nullable Input<String> project,
        Input<String> serviceAccountId,
        @Nullable Input<String> updateMask,
        @Nullable Input<Integer> version) {
        this.auditConfigs = auditConfigs;
        this.bindings = bindings;
        this.etag = etag;
        this.project = project;
        this.serviceAccountId = Objects.requireNonNull(serviceAccountId, "expected parameter 'serviceAccountId' to be non-null");
        this.updateMask = updateMask;
        this.version = version;
    }

    private ServiceAccountIamPolicyArgs() {
        this.auditConfigs = Input.empty();
        this.bindings = Input.empty();
        this.etag = Input.empty();
        this.project = Input.empty();
        this.serviceAccountId = Input.empty();
        this.updateMask = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccountIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AuditConfigArgs>> auditConfigs;
        private @Nullable Input<List<BindingArgs>> bindings;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> project;
        private Input<String> serviceAccountId;
        private @Nullable Input<String> updateMask;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccountIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditConfigs = defaults.auditConfigs;
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.project = defaults.project;
    	      this.serviceAccountId = defaults.serviceAccountId;
    	      this.updateMask = defaults.updateMask;
    	      this.version = defaults.version;
        }

        public Builder setAuditConfigs(@Nullable Input<List<AuditConfigArgs>> auditConfigs) {
            this.auditConfigs = auditConfigs;
            return this;
        }

        public Builder setAuditConfigs(@Nullable List<AuditConfigArgs> auditConfigs) {
            this.auditConfigs = Input.ofNullable(auditConfigs);
            return this;
        }

        public Builder setBindings(@Nullable Input<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder setBindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Input.ofNullable(bindings);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setServiceAccountId(Input<String> serviceAccountId) {
            this.serviceAccountId = Objects.requireNonNull(serviceAccountId);
            return this;
        }

        public Builder setServiceAccountId(String serviceAccountId) {
            this.serviceAccountId = Input.of(Objects.requireNonNull(serviceAccountId));
            return this;
        }

        public Builder setUpdateMask(@Nullable Input<String> updateMask) {
            this.updateMask = updateMask;
            return this;
        }

        public Builder setUpdateMask(@Nullable String updateMask) {
            this.updateMask = Input.ofNullable(updateMask);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public ServiceAccountIamPolicyArgs build() {
            return new ServiceAccountIamPolicyArgs(auditConfigs, bindings, etag, project, serviceAccountId, updateMask, version);
        }
    }
}