// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * RoleRef contains information that points to the role being used
 * 
 */
public final class RoleRefArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleRefArgs Empty = new RoleRefArgs();

    /**
     * APIGroup is the group for the resource being referenced
     * 
     */
    @InputImport(name="apiGroup", required=true)
    private final Input<String> apiGroup;

    public Input<String> getApiGroup() {
        return this.apiGroup;
    }

    /**
     * Kind is the type of resource being referenced
     * 
     */
    @InputImport(name="kind", required=true)
    private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Name is the name of resource being referenced
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public RoleRefArgs(
        Input<String> apiGroup,
        Input<String> kind,
        Input<String> name) {
        this.apiGroup = Objects.requireNonNull(apiGroup, "expected parameter 'apiGroup' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private RoleRefArgs() {
        this.apiGroup = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleRefArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiGroup;
        private Input<String> kind;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleRefArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroup = defaults.apiGroup;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
        }

        public Builder setApiGroup(Input<String> apiGroup) {
            this.apiGroup = Objects.requireNonNull(apiGroup);
            return this;
        }

        public Builder setApiGroup(String apiGroup) {
            this.apiGroup = Input.of(Objects.requireNonNull(apiGroup));
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public RoleRefArgs build() {
            return new RoleRefArgs(apiGroup, kind, name);
        }
    }
}