// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class SlsaCompletenessResponse extends io.pulumi.resources.InvokeArgs {

    public static final SlsaCompletenessResponse Empty = new SlsaCompletenessResponse();

    @InputImport(name="arguments", required=true)
    private final Boolean arguments;

    public Boolean getArguments() {
        return this.arguments;
    }

    @InputImport(name="environment", required=true)
    private final Boolean environment;

    public Boolean getEnvironment() {
        return this.environment;
    }

    @InputImport(name="materials", required=true)
    private final Boolean materials;

    public Boolean getMaterials() {
        return this.materials;
    }

    public SlsaCompletenessResponse(
        Boolean arguments,
        Boolean environment,
        Boolean materials) {
        this.arguments = Objects.requireNonNull(arguments, "expected parameter 'arguments' to be non-null");
        this.environment = Objects.requireNonNull(environment, "expected parameter 'environment' to be non-null");
        this.materials = Objects.requireNonNull(materials, "expected parameter 'materials' to be non-null");
    }

    private SlsaCompletenessResponse() {
        this.arguments = null;
        this.environment = null;
        this.materials = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaCompletenessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean arguments;
        private Boolean environment;
        private Boolean materials;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaCompletenessResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.environment = defaults.environment;
    	      this.materials = defaults.materials;
        }

        public Builder setArguments(Boolean arguments) {
            this.arguments = Objects.requireNonNull(arguments);
            return this;
        }

        public Builder setEnvironment(Boolean environment) {
            this.environment = Objects.requireNonNull(environment);
            return this;
        }

        public Builder setMaterials(Boolean materials) {
            this.materials = Objects.requireNonNull(materials);
            return this;
        }

        public SlsaCompletenessResponse build() {
            return new SlsaCompletenessResponse(arguments, environment, materials);
        }
    }
}