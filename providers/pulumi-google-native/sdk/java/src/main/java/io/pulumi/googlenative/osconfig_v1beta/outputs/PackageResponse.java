// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PackageResponse {
    /**
     * The desired_state the agent should maintain for this package. The default is to ensure the package is installed.
     * 
     */
    private final String desiredState;
    /**
     * Type of package manager that can be used to install this package. If a system does not have the package manager, the package is not installed or removed no error message is returned. By default, or if you specify `ANY`, the agent attempts to install and remove this package using the default package manager. This is useful when creating a policy that applies to different types of systems. The default behavior is ANY.
     * 
     */
    private final String manager;
    /**
     * The name of the package. A package is uniquely identified for conflict validation by checking the package name and the manager(s) that the package targets.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private PackageResponse(
        @CustomType.Parameter("desiredState") String desiredState,
        @CustomType.Parameter("manager") String manager,
        @CustomType.Parameter("name") String name) {
        this.desiredState = desiredState;
        this.manager = manager;
        this.name = name;
    }

    /**
     * The desired_state the agent should maintain for this package. The default is to ensure the package is installed.
     * 
    */
    public String desiredState() {
        return this.desiredState;
    }
    /**
     * Type of package manager that can be used to install this package. If a system does not have the package manager, the package is not installed or removed no error message is returned. By default, or if you specify `ANY`, the agent attempts to install and remove this package using the default package manager. This is useful when creating a policy that applies to different types of systems. The default behavior is ANY.
     * 
    */
    public String manager() {
        return this.manager;
    }
    /**
     * The name of the package. A package is uniquely identified for conflict validation by checking the package name and the manager(s) that the package targets.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String desiredState;
        private String manager;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.manager = defaults.manager;
    	      this.name = defaults.name;
        }

        public Builder desiredState(String desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }
        public Builder manager(String manager) {
            this.manager = Objects.requireNonNull(manager);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public PackageResponse build() {
            return new PackageResponse(desiredState, manager, name);
        }
    }
}
