// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.run_v1alpha1.inputs.EnvVarSourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvVarArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvVarArgs Empty = new EnvVarArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    @InputImport(name="valueFrom")
    private final @Nullable Input<EnvVarSourceArgs> valueFrom;

    public Input<EnvVarSourceArgs> getValueFrom() {
        return this.valueFrom == null ? Input.empty() : this.valueFrom;
    }

    public EnvVarArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> value,
        @Nullable Input<EnvVarSourceArgs> valueFrom) {
        this.name = name;
        this.value = value;
        this.valueFrom = valueFrom;
    }

    private EnvVarArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
        this.valueFrom = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvVarArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> value;
        private @Nullable Input<EnvVarSourceArgs> valueFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvVarArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueFrom = defaults.valueFrom;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public Builder setValueFrom(@Nullable Input<EnvVarSourceArgs> valueFrom) {
            this.valueFrom = valueFrom;
            return this;
        }

        public Builder setValueFrom(@Nullable EnvVarSourceArgs valueFrom) {
            this.valueFrom = Input.ofNullable(valueFrom);
            return this;
        }

        public EnvVarArgs build() {
            return new EnvVarArgs(name, value, valueFrom);
        }
    }
}