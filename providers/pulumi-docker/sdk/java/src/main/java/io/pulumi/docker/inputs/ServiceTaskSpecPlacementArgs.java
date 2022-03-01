// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.docker.inputs.ServiceTaskSpecPlacementPlatformArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecPlacementArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecPlacementArgs Empty = new ServiceTaskSpecPlacementArgs();

    @InputImport(name="constraints")
      private final @Nullable Input<List<String>> constraints;

    public Input<List<String>> getConstraints() {
        return this.constraints == null ? Input.empty() : this.constraints;
    }

    @InputImport(name="maxReplicas")
      private final @Nullable Input<Integer> maxReplicas;

    public Input<Integer> getMaxReplicas() {
        return this.maxReplicas == null ? Input.empty() : this.maxReplicas;
    }

    @InputImport(name="platforms")
      private final @Nullable Input<List<ServiceTaskSpecPlacementPlatformArgs>> platforms;

    public Input<List<ServiceTaskSpecPlacementPlatformArgs>> getPlatforms() {
        return this.platforms == null ? Input.empty() : this.platforms;
    }

    @InputImport(name="prefs")
      private final @Nullable Input<List<String>> prefs;

    public Input<List<String>> getPrefs() {
        return this.prefs == null ? Input.empty() : this.prefs;
    }

    public ServiceTaskSpecPlacementArgs(
        @Nullable Input<List<String>> constraints,
        @Nullable Input<Integer> maxReplicas,
        @Nullable Input<List<ServiceTaskSpecPlacementPlatformArgs>> platforms,
        @Nullable Input<List<String>> prefs) {
        this.constraints = constraints;
        this.maxReplicas = maxReplicas;
        this.platforms = platforms;
        this.prefs = prefs;
    }

    private ServiceTaskSpecPlacementArgs() {
        this.constraints = Input.empty();
        this.maxReplicas = Input.empty();
        this.platforms = Input.empty();
        this.prefs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecPlacementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> constraints;
        private @Nullable Input<Integer> maxReplicas;
        private @Nullable Input<List<ServiceTaskSpecPlacementPlatformArgs>> platforms;
        private @Nullable Input<List<String>> prefs;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecPlacementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constraints = defaults.constraints;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.platforms = defaults.platforms;
    	      this.prefs = defaults.prefs;
        }

        public Builder setConstraints(@Nullable Input<List<String>> constraints) {
            this.constraints = constraints;
            return this;
        }

        public Builder setConstraints(@Nullable List<String> constraints) {
            this.constraints = Input.ofNullable(constraints);
            return this;
        }

        public Builder setMaxReplicas(@Nullable Input<Integer> maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }

        public Builder setMaxReplicas(@Nullable Integer maxReplicas) {
            this.maxReplicas = Input.ofNullable(maxReplicas);
            return this;
        }

        public Builder setPlatforms(@Nullable Input<List<ServiceTaskSpecPlacementPlatformArgs>> platforms) {
            this.platforms = platforms;
            return this;
        }

        public Builder setPlatforms(@Nullable List<ServiceTaskSpecPlacementPlatformArgs> platforms) {
            this.platforms = Input.ofNullable(platforms);
            return this;
        }

        public Builder setPrefs(@Nullable Input<List<String>> prefs) {
            this.prefs = prefs;
            return this;
        }

        public Builder setPrefs(@Nullable List<String> prefs) {
            this.prefs = Input.ofNullable(prefs);
            return this;
        }
        public ServiceTaskSpecPlacementArgs build() {
            return new ServiceTaskSpecPlacementArgs(constraints, maxReplicas, platforms, prefs);
        }
    }
}
