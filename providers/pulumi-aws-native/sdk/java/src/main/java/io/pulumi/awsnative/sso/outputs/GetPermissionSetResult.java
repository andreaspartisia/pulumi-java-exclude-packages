// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso.outputs;

import io.pulumi.awsnative.sso.outputs.PermissionSetTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPermissionSetResult {
    /**
     * The permission set description.
     * 
     */
    private final @Nullable String description;
    /**
     * The inline policy to put in permission set.
     * 
     */
    private final @Nullable Object inlinePolicy;
    private final @Nullable List<String> managedPolicies;
    /**
     * The permission set that the policy will be attached to
     * 
     */
    private final @Nullable String permissionSetArn;
    /**
     * The relay state URL that redirect links to any service in the AWS Management Console.
     * 
     */
    private final @Nullable String relayStateType;
    /**
     * The length of time that a user can be signed in to an AWS account.
     * 
     */
    private final @Nullable String sessionDuration;
    private final @Nullable List<PermissionSetTag> tags;

    @OutputCustomType.Constructor({"description","inlinePolicy","managedPolicies","permissionSetArn","relayStateType","sessionDuration","tags"})
    private GetPermissionSetResult(
        @Nullable String description,
        @Nullable Object inlinePolicy,
        @Nullable List<String> managedPolicies,
        @Nullable String permissionSetArn,
        @Nullable String relayStateType,
        @Nullable String sessionDuration,
        @Nullable List<PermissionSetTag> tags) {
        this.description = description;
        this.inlinePolicy = inlinePolicy;
        this.managedPolicies = managedPolicies;
        this.permissionSetArn = permissionSetArn;
        this.relayStateType = relayStateType;
        this.sessionDuration = sessionDuration;
        this.tags = tags;
    }

    /**
     * The permission set description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The inline policy to put in permission set.
     * 
     */
    public Optional<Object> getInlinePolicy() {
        return Optional.ofNullable(this.inlinePolicy);
    }
    public List<String> getManagedPolicies() {
        return this.managedPolicies == null ? List.of() : this.managedPolicies;
    }
    /**
     * The permission set that the policy will be attached to
     * 
     */
    public Optional<String> getPermissionSetArn() {
        return Optional.ofNullable(this.permissionSetArn);
    }
    /**
     * The relay state URL that redirect links to any service in the AWS Management Console.
     * 
     */
    public Optional<String> getRelayStateType() {
        return Optional.ofNullable(this.relayStateType);
    }
    /**
     * The length of time that a user can be signed in to an AWS account.
     * 
     */
    public Optional<String> getSessionDuration() {
        return Optional.ofNullable(this.sessionDuration);
    }
    public List<PermissionSetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Object inlinePolicy;
        private @Nullable List<String> managedPolicies;
        private @Nullable String permissionSetArn;
        private @Nullable String relayStateType;
        private @Nullable String sessionDuration;
        private @Nullable List<PermissionSetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.inlinePolicy = defaults.inlinePolicy;
    	      this.managedPolicies = defaults.managedPolicies;
    	      this.permissionSetArn = defaults.permissionSetArn;
    	      this.relayStateType = defaults.relayStateType;
    	      this.sessionDuration = defaults.sessionDuration;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setInlinePolicy(@Nullable Object inlinePolicy) {
            this.inlinePolicy = inlinePolicy;
            return this;
        }

        public Builder setManagedPolicies(@Nullable List<String> managedPolicies) {
            this.managedPolicies = managedPolicies;
            return this;
        }

        public Builder setPermissionSetArn(@Nullable String permissionSetArn) {
            this.permissionSetArn = permissionSetArn;
            return this;
        }

        public Builder setRelayStateType(@Nullable String relayStateType) {
            this.relayStateType = relayStateType;
            return this;
        }

        public Builder setSessionDuration(@Nullable String sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }

        public Builder setTags(@Nullable List<PermissionSetTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetPermissionSetResult build() {
            return new GetPermissionSetResult(description, inlinePolicy, managedPolicies, permissionSetArn, relayStateType, sessionDuration, tags);
        }
    }
}