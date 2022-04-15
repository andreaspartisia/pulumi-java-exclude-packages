// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CloudHealthcareSourceResponse {
    /**
     * Full path of a Cloud Healthcare API resource.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private CloudHealthcareSourceResponse(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * Full path of a Cloud Healthcare API resource.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudHealthcareSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudHealthcareSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public CloudHealthcareSourceResponse build() {
            return new CloudHealthcareSourceResponse(name);
        }
    }
}
