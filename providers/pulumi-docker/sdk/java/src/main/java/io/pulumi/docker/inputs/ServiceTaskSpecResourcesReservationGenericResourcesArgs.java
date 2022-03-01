// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecResourcesReservationGenericResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecResourcesReservationGenericResourcesArgs Empty = new ServiceTaskSpecResourcesReservationGenericResourcesArgs();

    @InputImport(name="discreteResourcesSpecs")
      private final @Nullable Input<List<String>> discreteResourcesSpecs;

    public Input<List<String>> getDiscreteResourcesSpecs() {
        return this.discreteResourcesSpecs == null ? Input.empty() : this.discreteResourcesSpecs;
    }

    @InputImport(name="namedResourcesSpecs")
      private final @Nullable Input<List<String>> namedResourcesSpecs;

    public Input<List<String>> getNamedResourcesSpecs() {
        return this.namedResourcesSpecs == null ? Input.empty() : this.namedResourcesSpecs;
    }

    public ServiceTaskSpecResourcesReservationGenericResourcesArgs(
        @Nullable Input<List<String>> discreteResourcesSpecs,
        @Nullable Input<List<String>> namedResourcesSpecs) {
        this.discreteResourcesSpecs = discreteResourcesSpecs;
        this.namedResourcesSpecs = namedResourcesSpecs;
    }

    private ServiceTaskSpecResourcesReservationGenericResourcesArgs() {
        this.discreteResourcesSpecs = Input.empty();
        this.namedResourcesSpecs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecResourcesReservationGenericResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> discreteResourcesSpecs;
        private @Nullable Input<List<String>> namedResourcesSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecResourcesReservationGenericResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.discreteResourcesSpecs = defaults.discreteResourcesSpecs;
    	      this.namedResourcesSpecs = defaults.namedResourcesSpecs;
        }

        public Builder setDiscreteResourcesSpecs(@Nullable Input<List<String>> discreteResourcesSpecs) {
            this.discreteResourcesSpecs = discreteResourcesSpecs;
            return this;
        }

        public Builder setDiscreteResourcesSpecs(@Nullable List<String> discreteResourcesSpecs) {
            this.discreteResourcesSpecs = Input.ofNullable(discreteResourcesSpecs);
            return this;
        }

        public Builder setNamedResourcesSpecs(@Nullable Input<List<String>> namedResourcesSpecs) {
            this.namedResourcesSpecs = namedResourcesSpecs;
            return this;
        }

        public Builder setNamedResourcesSpecs(@Nullable List<String> namedResourcesSpecs) {
            this.namedResourcesSpecs = Input.ofNullable(namedResourcesSpecs);
            return this;
        }
        public ServiceTaskSpecResourcesReservationGenericResourcesArgs build() {
            return new ServiceTaskSpecResourcesReservationGenericResourcesArgs(discreteResourcesSpecs, namedResourcesSpecs);
        }
    }
}
