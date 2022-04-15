// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudidentity_v1.inputs.EntityKeyArgs;
import io.pulumi.googlenative.cloudidentity_v1.inputs.MembershipRoleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipArgs Empty = new MembershipArgs();

    @Import(name="groupId", required=true)
      private final Output<String> groupId;

    public Output<String> groupId() {
        return this.groupId;
    }

    /**
     * Immutable. The `EntityKey` of the member.
     * 
     */
    @Import(name="preferredMemberKey", required=true)
      private final Output<EntityKeyArgs> preferredMemberKey;

    public Output<EntityKeyArgs> preferredMemberKey() {
        return this.preferredMemberKey;
    }

    /**
     * The `MembershipRole`s that apply to the `Membership`. If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`. Must not contain duplicate `MembershipRole`s with the same `name`.
     * 
     */
    @Import(name="roles")
      private final @Nullable Output<List<MembershipRoleArgs>> roles;

    public Output<List<MembershipRoleArgs>> roles() {
        return this.roles == null ? Codegen.empty() : this.roles;
    }

    public MembershipArgs(
        Output<String> groupId,
        Output<EntityKeyArgs> preferredMemberKey,
        @Nullable Output<List<MembershipRoleArgs>> roles) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.preferredMemberKey = Objects.requireNonNull(preferredMemberKey, "expected parameter 'preferredMemberKey' to be non-null");
        this.roles = roles;
    }

    private MembershipArgs() {
        this.groupId = Codegen.empty();
        this.preferredMemberKey = Codegen.empty();
        this.roles = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> groupId;
        private Output<EntityKeyArgs> preferredMemberKey;
        private @Nullable Output<List<MembershipRoleArgs>> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.preferredMemberKey = defaults.preferredMemberKey;
    	      this.roles = defaults.roles;
        }

        public Builder groupId(Output<String> groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Output.of(Objects.requireNonNull(groupId));
            return this;
        }
        public Builder preferredMemberKey(Output<EntityKeyArgs> preferredMemberKey) {
            this.preferredMemberKey = Objects.requireNonNull(preferredMemberKey);
            return this;
        }
        public Builder preferredMemberKey(EntityKeyArgs preferredMemberKey) {
            this.preferredMemberKey = Output.of(Objects.requireNonNull(preferredMemberKey));
            return this;
        }
        public Builder roles(@Nullable Output<List<MembershipRoleArgs>> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(@Nullable List<MembershipRoleArgs> roles) {
            this.roles = Codegen.ofNullable(roles);
            return this;
        }
        public Builder roles(MembershipRoleArgs... roles) {
            return roles(List.of(roles));
        }        public MembershipArgs build() {
            return new MembershipArgs(groupId, preferredMemberKey, roles);
        }
    }
}
