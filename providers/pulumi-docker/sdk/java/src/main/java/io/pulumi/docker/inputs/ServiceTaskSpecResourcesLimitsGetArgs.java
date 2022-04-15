// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecResourcesLimitsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecResourcesLimitsGetArgs Empty = new ServiceTaskSpecResourcesLimitsGetArgs();

    @Import(name="memoryBytes")
      private final @Nullable Output<Integer> memoryBytes;

    public Output<Integer> memoryBytes() {
        return this.memoryBytes == null ? Codegen.empty() : this.memoryBytes;
    }

    @Import(name="nanoCpus")
      private final @Nullable Output<Integer> nanoCpus;

    public Output<Integer> nanoCpus() {
        return this.nanoCpus == null ? Codegen.empty() : this.nanoCpus;
    }

    public ServiceTaskSpecResourcesLimitsGetArgs(
        @Nullable Output<Integer> memoryBytes,
        @Nullable Output<Integer> nanoCpus) {
        this.memoryBytes = memoryBytes;
        this.nanoCpus = nanoCpus;
    }

    private ServiceTaskSpecResourcesLimitsGetArgs() {
        this.memoryBytes = Codegen.empty();
        this.nanoCpus = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecResourcesLimitsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> memoryBytes;
        private @Nullable Output<Integer> nanoCpus;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecResourcesLimitsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryBytes = defaults.memoryBytes;
    	      this.nanoCpus = defaults.nanoCpus;
        }

        public Builder memoryBytes(@Nullable Output<Integer> memoryBytes) {
            this.memoryBytes = memoryBytes;
            return this;
        }
        public Builder memoryBytes(@Nullable Integer memoryBytes) {
            this.memoryBytes = Codegen.ofNullable(memoryBytes);
            return this;
        }
        public Builder nanoCpus(@Nullable Output<Integer> nanoCpus) {
            this.nanoCpus = nanoCpus;
            return this;
        }
        public Builder nanoCpus(@Nullable Integer nanoCpus) {
            this.nanoCpus = Codegen.ofNullable(nanoCpus);
            return this;
        }        public ServiceTaskSpecResourcesLimitsGetArgs build() {
            return new ServiceTaskSpecResourcesLimitsGetArgs(memoryBytes, nanoCpus);
        }
    }
}
