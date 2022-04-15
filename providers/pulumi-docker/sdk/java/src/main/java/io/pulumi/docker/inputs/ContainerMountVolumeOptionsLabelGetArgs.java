// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ContainerMountVolumeOptionsLabelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerMountVolumeOptionsLabelGetArgs Empty = new ContainerMountVolumeOptionsLabelGetArgs();

    @Import(name="label", required=true)
      private final Output<String> label;

    public Output<String> label() {
        return this.label;
    }

    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public ContainerMountVolumeOptionsLabelGetArgs(
        Output<String> label,
        Output<String> value) {
        this.label = Objects.requireNonNull(label, "expected parameter 'label' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ContainerMountVolumeOptionsLabelGetArgs() {
        this.label = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerMountVolumeOptionsLabelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> label;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerMountVolumeOptionsLabelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.label = defaults.label;
    	      this.value = defaults.value;
        }

        public Builder label(Output<String> label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder label(String label) {
            this.label = Output.of(Objects.requireNonNull(label));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public ContainerMountVolumeOptionsLabelGetArgs build() {
            return new ContainerMountVolumeOptionsLabelGetArgs(label, value);
        }
    }
}
