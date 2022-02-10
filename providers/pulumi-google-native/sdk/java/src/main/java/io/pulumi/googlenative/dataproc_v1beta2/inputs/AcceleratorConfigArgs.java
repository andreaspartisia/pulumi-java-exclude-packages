// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AcceleratorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AcceleratorConfigArgs Empty = new AcceleratorConfigArgs();

    @InputImport(name="acceleratorCount")
    private final @Nullable Input<Integer> acceleratorCount;

    public Input<Integer> getAcceleratorCount() {
        return this.acceleratorCount == null ? Input.empty() : this.acceleratorCount;
    }

    @InputImport(name="acceleratorTypeUri")
    private final @Nullable Input<String> acceleratorTypeUri;

    public Input<String> getAcceleratorTypeUri() {
        return this.acceleratorTypeUri == null ? Input.empty() : this.acceleratorTypeUri;
    }

    public AcceleratorConfigArgs(
        @Nullable Input<Integer> acceleratorCount,
        @Nullable Input<String> acceleratorTypeUri) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorTypeUri = acceleratorTypeUri;
    }

    private AcceleratorConfigArgs() {
        this.acceleratorCount = Input.empty();
        this.acceleratorTypeUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> acceleratorCount;
        private @Nullable Input<String> acceleratorTypeUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorTypeUri = defaults.acceleratorTypeUri;
        }

        public Builder setAcceleratorCount(@Nullable Input<Integer> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder setAcceleratorCount(@Nullable Integer acceleratorCount) {
            this.acceleratorCount = Input.ofNullable(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorTypeUri(@Nullable Input<String> acceleratorTypeUri) {
            this.acceleratorTypeUri = acceleratorTypeUri;
            return this;
        }

        public Builder setAcceleratorTypeUri(@Nullable String acceleratorTypeUri) {
            this.acceleratorTypeUri = Input.ofNullable(acceleratorTypeUri);
            return this;
        }

        public AcceleratorConfigArgs build() {
            return new AcceleratorConfigArgs(acceleratorCount, acceleratorTypeUri);
        }
    }
}