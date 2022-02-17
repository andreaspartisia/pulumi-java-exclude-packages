// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolIamBindingArgs Empty = new CaPoolIamBindingArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="caPool", required=true)
    private final Input<String> caPool;

    public Input<String> getCaPool() {
        return this.caPool;
    }

    @InputImport(name="condition")
    private final @Nullable Input<CaPoolIamBindingConditionArgs> condition;

    public Input<CaPoolIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Location of the CaPool. A full list of valid locations can be found by
     * running `gcloud privateca locations list`.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="members", required=true)
    private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.certificateauthority.CaPoolIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
    private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public CaPoolIamBindingArgs(
        Input<String> caPool,
        @Nullable Input<CaPoolIamBindingConditionArgs> condition,
        @Nullable Input<String> location,
        Input<List<String>> members,
        @Nullable Input<String> project,
        Input<String> role) {
        this.caPool = Objects.requireNonNull(caPool, "expected parameter 'caPool' to be non-null");
        this.condition = condition;
        this.location = location;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private CaPoolIamBindingArgs() {
        this.caPool = Input.empty();
        this.condition = Input.empty();
        this.location = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> caPool;
        private @Nullable Input<CaPoolIamBindingConditionArgs> condition;
        private @Nullable Input<String> location;
        private Input<List<String>> members;
        private @Nullable Input<String> project;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caPool = defaults.caPool;
    	      this.condition = defaults.condition;
    	      this.location = defaults.location;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setCaPool(Input<String> caPool) {
            this.caPool = Objects.requireNonNull(caPool);
            return this;
        }

        public Builder setCaPool(String caPool) {
            this.caPool = Input.of(Objects.requireNonNull(caPool));
            return this;
        }

        public Builder setCondition(@Nullable Input<CaPoolIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable CaPoolIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
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

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }

        public CaPoolIamBindingArgs build() {
            return new CaPoolIamBindingArgs(caPool, condition, location, members, project, role);
        }
    }
}