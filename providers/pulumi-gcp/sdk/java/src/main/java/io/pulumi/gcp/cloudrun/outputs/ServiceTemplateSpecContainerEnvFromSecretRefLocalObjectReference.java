// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference {
    /**
     * Volume's name.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference(@OutputCustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * Volume's name.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference build() {
            return new ServiceTemplateSpecContainerEnvFromSecretRefLocalObjectReference(name);
        }
    }
}
