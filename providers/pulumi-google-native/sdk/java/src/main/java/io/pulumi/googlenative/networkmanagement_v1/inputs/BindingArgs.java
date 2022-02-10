// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.networkmanagement_v1.inputs.ExprArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BindingArgs Empty = new BindingArgs();

    @InputImport(name="condition")
    private final @Nullable Input<ExprArgs> condition;

    public Input<ExprArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="members")
    private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    @InputImport(name="role")
    private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public BindingArgs(
        @Nullable Input<ExprArgs> condition,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.members = members;
        this.role = role;
    }

    private BindingArgs() {
        this.condition = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ExprArgs> condition;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(BindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<ExprArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable ExprArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
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

        public BindingArgs build() {
            return new BindingArgs(condition, members, role);
        }
    }
}