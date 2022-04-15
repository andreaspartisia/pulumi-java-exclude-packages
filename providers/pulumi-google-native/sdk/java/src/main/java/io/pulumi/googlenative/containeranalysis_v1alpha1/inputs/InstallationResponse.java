// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.LocationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * This represents how a particular software package may be installed on a system.
 * 
 */
public final class InstallationResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstallationResponse Empty = new InstallationResponse();

    /**
     * All of the places within the filesystem versions of this package have been found.
     * 
     */
    @Import(name="location", required=true)
      private final List<LocationResponse> location;

    public List<LocationResponse> location() {
        return this.location;
    }

    /**
     * The name of the installed package.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public InstallationResponse(
        List<LocationResponse> location,
        String name) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private InstallationResponse() {
        this.location = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstallationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LocationResponse> location;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(InstallationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
        }

        public Builder location(List<LocationResponse> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(LocationResponse... location) {
            return location(List.of(location));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public InstallationResponse build() {
            return new InstallationResponse(location, name);
        }
    }
}
