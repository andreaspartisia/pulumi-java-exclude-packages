// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerMountTmpfsOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerMountTmpfsOptionsGetArgs Empty = new ContainerMountTmpfsOptionsGetArgs();

    @InputImport(name="mode")
      private final @Nullable Input<Integer> mode;

    public Input<Integer> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="sizeBytes")
      private final @Nullable Input<Integer> sizeBytes;

    public Input<Integer> getSizeBytes() {
        return this.sizeBytes == null ? Input.empty() : this.sizeBytes;
    }

    public ContainerMountTmpfsOptionsGetArgs(
        @Nullable Input<Integer> mode,
        @Nullable Input<Integer> sizeBytes) {
        this.mode = mode;
        this.sizeBytes = sizeBytes;
    }

    private ContainerMountTmpfsOptionsGetArgs() {
        this.mode = Input.empty();
        this.sizeBytes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerMountTmpfsOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> mode;
        private @Nullable Input<Integer> sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerMountTmpfsOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder setMode(@Nullable Input<Integer> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Integer mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setSizeBytes(@Nullable Input<Integer> sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }

        public Builder setSizeBytes(@Nullable Integer sizeBytes) {
            this.sizeBytes = Input.ofNullable(sizeBytes);
            return this;
        }
        public ContainerMountTmpfsOptionsGetArgs build() {
            return new ContainerMountTmpfsOptionsGetArgs(mode, sizeBytes);
        }
    }
}
