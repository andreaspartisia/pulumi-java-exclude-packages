// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso;

import io.pulumi.awsnative.sso.enums.AssignmentPrincipalType;
import io.pulumi.awsnative.sso.enums.AssignmentTargetType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignmentArgs Empty = new AssignmentArgs();

    /**
     * The sso instance that the permission set is owned.
     * 
     */
    @InputImport(name="instanceArn", required=true)
    private final Input<String> instanceArn;

    public Input<String> getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * The permission set that the assignemt will be assigned
     * 
     */
    @InputImport(name="permissionSetArn", required=true)
    private final Input<String> permissionSetArn;

    public Input<String> getPermissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * The assignee's identifier, user id/group id
     * 
     */
    @InputImport(name="principalId", required=true)
    private final Input<String> principalId;

    public Input<String> getPrincipalId() {
        return this.principalId;
    }

    /**
     * The assignee's type, user/group
     * 
     */
    @InputImport(name="principalType", required=true)
    private final Input<AssignmentPrincipalType> principalType;

    public Input<AssignmentPrincipalType> getPrincipalType() {
        return this.principalType;
    }

    /**
     * The account id to be provisioned.
     * 
     */
    @InputImport(name="targetId", required=true)
    private final Input<String> targetId;

    public Input<String> getTargetId() {
        return this.targetId;
    }

    /**
     * The type of resource to be provsioned to, only aws account now
     * 
     */
    @InputImport(name="targetType", required=true)
    private final Input<AssignmentTargetType> targetType;

    public Input<AssignmentTargetType> getTargetType() {
        return this.targetType;
    }

    public AssignmentArgs(
        Input<String> instanceArn,
        Input<String> permissionSetArn,
        Input<String> principalId,
        Input<AssignmentPrincipalType> principalType,
        Input<String> targetId,
        Input<AssignmentTargetType> targetType) {
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.permissionSetArn = Objects.requireNonNull(permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalType = Objects.requireNonNull(principalType, "expected parameter 'principalType' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
        this.targetType = Objects.requireNonNull(targetType, "expected parameter 'targetType' to be non-null");
    }

    private AssignmentArgs() {
        this.instanceArn = Input.empty();
        this.permissionSetArn = Input.empty();
        this.principalId = Input.empty();
        this.principalType = Input.empty();
        this.targetId = Input.empty();
        this.targetType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> instanceArn;
        private Input<String> permissionSetArn;
        private Input<String> principalId;
        private Input<AssignmentPrincipalType> principalType;
        private Input<String> targetId;
        private Input<AssignmentTargetType> targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.permissionSetArn = defaults.permissionSetArn;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.targetId = defaults.targetId;
    	      this.targetType = defaults.targetType;
        }

        public Builder setInstanceArn(Input<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }

        public Builder setInstanceArn(String instanceArn) {
            this.instanceArn = Input.of(Objects.requireNonNull(instanceArn));
            return this;
        }

        public Builder setPermissionSetArn(Input<String> permissionSetArn) {
            this.permissionSetArn = Objects.requireNonNull(permissionSetArn);
            return this;
        }

        public Builder setPermissionSetArn(String permissionSetArn) {
            this.permissionSetArn = Input.of(Objects.requireNonNull(permissionSetArn));
            return this;
        }

        public Builder setPrincipalId(Input<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Input.of(Objects.requireNonNull(principalId));
            return this;
        }

        public Builder setPrincipalType(Input<AssignmentPrincipalType> principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }

        public Builder setPrincipalType(AssignmentPrincipalType principalType) {
            this.principalType = Input.of(Objects.requireNonNull(principalType));
            return this;
        }

        public Builder setTargetId(Input<String> targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }

        public Builder setTargetId(String targetId) {
            this.targetId = Input.of(Objects.requireNonNull(targetId));
            return this;
        }

        public Builder setTargetType(Input<AssignmentTargetType> targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }

        public Builder setTargetType(AssignmentTargetType targetType) {
            this.targetType = Input.of(Objects.requireNonNull(targetType));
            return this;
        }

        public AssignmentArgs build() {
            return new AssignmentArgs(instanceArn, permissionSetArn, principalId, principalType, targetId, targetType);
        }
    }
}