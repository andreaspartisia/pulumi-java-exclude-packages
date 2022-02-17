// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigee.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.apigee.inputs.EnvironmentIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentIamMemberState Empty = new EnvironmentIamMemberState();

    @InputImport(name="condition")
    private final @Nullable Input<EnvironmentIamMemberConditionGetArgs> condition;

    public Input<EnvironmentIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="envId")
    private final @Nullable Input<String> envId;

    public Input<String> getEnvId() {
        return this.envId == null ? Input.empty() : this.envId;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="member")
    private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
    }

    @InputImport(name="orgId")
    private final @Nullable Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId == null ? Input.empty() : this.orgId;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.apigee.EnvironmentIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public EnvironmentIamMemberState(
        @Nullable Input<EnvironmentIamMemberConditionGetArgs> condition,
        @Nullable Input<String> envId,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> orgId,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.envId = envId;
        this.etag = etag;
        this.member = member;
        this.orgId = orgId;
        this.role = role;
    }

    private EnvironmentIamMemberState() {
        this.condition = Input.empty();
        this.envId = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.orgId = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EnvironmentIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> envId;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> orgId;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.envId = defaults.envId;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.orgId = defaults.orgId;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<EnvironmentIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable EnvironmentIamMemberConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEnvId(@Nullable Input<String> envId) {
            this.envId = envId;
            return this;
        }

        public Builder setEnvId(@Nullable String envId) {
            this.envId = Input.ofNullable(envId);
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

        public Builder setMember(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder setMember(@Nullable String member) {
            this.member = Input.ofNullable(member);
            return this;
        }

        public Builder setOrgId(@Nullable Input<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder setOrgId(@Nullable String orgId) {
            this.orgId = Input.ofNullable(orgId);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public EnvironmentIamMemberState build() {
            return new EnvironmentIamMemberState(condition, envId, etag, member, orgId, role);
        }
    }
}