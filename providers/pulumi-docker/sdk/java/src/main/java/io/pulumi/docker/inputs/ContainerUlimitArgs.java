// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ContainerUlimitArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerUlimitArgs Empty = new ContainerUlimitArgs();

    @InputImport(name="hard", required=true)
      private final Input<Integer> hard;

    public Input<Integer> getHard() {
        return this.hard;
    }

    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="soft", required=true)
      private final Input<Integer> soft;

    public Input<Integer> getSoft() {
        return this.soft;
    }

    public ContainerUlimitArgs(
        Input<Integer> hard,
        Input<String> name,
        Input<Integer> soft) {
        this.hard = Objects.requireNonNull(hard, "expected parameter 'hard' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.soft = Objects.requireNonNull(soft, "expected parameter 'soft' to be non-null");
    }

    private ContainerUlimitArgs() {
        this.hard = Input.empty();
        this.name = Input.empty();
        this.soft = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerUlimitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> hard;
        private Input<String> name;
        private Input<Integer> soft;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerUlimitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hard = defaults.hard;
    	      this.name = defaults.name;
    	      this.soft = defaults.soft;
        }

        public Builder setHard(Input<Integer> hard) {
            this.hard = Objects.requireNonNull(hard);
            return this;
        }

        public Builder setHard(Integer hard) {
            this.hard = Input.of(Objects.requireNonNull(hard));
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

        public Builder setSoft(Input<Integer> soft) {
            this.soft = Objects.requireNonNull(soft);
            return this;
        }

        public Builder setSoft(Integer soft) {
            this.soft = Input.of(Objects.requireNonNull(soft));
            return this;
        }
        public ContainerUlimitArgs build() {
            return new ContainerUlimitArgs(hard, name, soft);
        }
    }
}
