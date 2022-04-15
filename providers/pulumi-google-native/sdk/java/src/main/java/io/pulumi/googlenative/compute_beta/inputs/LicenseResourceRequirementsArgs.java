// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LicenseResourceRequirementsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LicenseResourceRequirementsArgs Empty = new LicenseResourceRequirementsArgs();

    /**
     * Minimum number of guest cpus required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    @Import(name="minGuestCpuCount")
      private final @Nullable Output<Integer> minGuestCpuCount;

    public Output<Integer> minGuestCpuCount() {
        return this.minGuestCpuCount == null ? Codegen.empty() : this.minGuestCpuCount;
    }

    /**
     * Minimum memory required to use the Instance. Enforced at Instance creation and Instance start.
     * 
     */
    @Import(name="minMemoryMb")
      private final @Nullable Output<Integer> minMemoryMb;

    public Output<Integer> minMemoryMb() {
        return this.minMemoryMb == null ? Codegen.empty() : this.minMemoryMb;
    }

    public LicenseResourceRequirementsArgs(
        @Nullable Output<Integer> minGuestCpuCount,
        @Nullable Output<Integer> minMemoryMb) {
        this.minGuestCpuCount = minGuestCpuCount;
        this.minMemoryMb = minMemoryMb;
    }

    private LicenseResourceRequirementsArgs() {
        this.minGuestCpuCount = Codegen.empty();
        this.minMemoryMb = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseResourceRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minGuestCpuCount;
        private @Nullable Output<Integer> minMemoryMb;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseResourceRequirementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minGuestCpuCount = defaults.minGuestCpuCount;
    	      this.minMemoryMb = defaults.minMemoryMb;
        }

        public Builder minGuestCpuCount(@Nullable Output<Integer> minGuestCpuCount) {
            this.minGuestCpuCount = minGuestCpuCount;
            return this;
        }
        public Builder minGuestCpuCount(@Nullable Integer minGuestCpuCount) {
            this.minGuestCpuCount = Codegen.ofNullable(minGuestCpuCount);
            return this;
        }
        public Builder minMemoryMb(@Nullable Output<Integer> minMemoryMb) {
            this.minMemoryMb = minMemoryMb;
            return this;
        }
        public Builder minMemoryMb(@Nullable Integer minMemoryMb) {
            this.minMemoryMb = Codegen.ofNullable(minMemoryMb);
            return this;
        }        public LicenseResourceRequirementsArgs build() {
            return new LicenseResourceRequirementsArgs(minGuestCpuCount, minMemoryMb);
        }
    }
}
