// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecLogDriverArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecLogDriverArgs Empty = new ServiceTaskSpecLogDriverArgs();

    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="options")
      private final @Nullable Input<Map<String,String>> options;

    public Input<Map<String,String>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    public ServiceTaskSpecLogDriverArgs(
        Input<String> name,
        @Nullable Input<Map<String,String>> options) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.options = options;
    }

    private ServiceTaskSpecLogDriverArgs() {
        this.name = Input.empty();
        this.options = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecLogDriverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private @Nullable Input<Map<String,String>> options;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecLogDriverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.options = defaults.options;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setOptions(@Nullable Input<Map<String,String>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable Map<String,String> options) {
            this.options = Input.ofNullable(options);
            return this;
        }
        public ServiceTaskSpecLogDriverArgs build() {
            return new ServiceTaskSpecLogDriverArgs(name, options);
        }
    }
}
