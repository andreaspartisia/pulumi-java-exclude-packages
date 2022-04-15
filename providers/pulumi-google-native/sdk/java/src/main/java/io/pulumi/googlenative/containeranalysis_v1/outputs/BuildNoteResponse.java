// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BuildNoteResponse {
    /**
     * Immutable. Version of the builder which produced this build.
     * 
     */
    private final String builderVersion;

    @CustomType.Constructor
    private BuildNoteResponse(@CustomType.Parameter("builderVersion") String builderVersion) {
        this.builderVersion = builderVersion;
    }

    /**
     * Immutable. Version of the builder which produced this build.
     * 
    */
    public String builderVersion() {
        return this.builderVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String builderVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builderVersion = defaults.builderVersion;
        }

        public Builder builderVersion(String builderVersion) {
            this.builderVersion = Objects.requireNonNull(builderVersion);
            return this;
        }        public BuildNoteResponse build() {
            return new BuildNoteResponse(builderVersion);
        }
    }
}
