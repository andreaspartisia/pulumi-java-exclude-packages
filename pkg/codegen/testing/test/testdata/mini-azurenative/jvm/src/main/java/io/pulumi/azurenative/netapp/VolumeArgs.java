// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    @Import(name="throughputMibps")
      private final @Nullable Output<Double> throughputMibps;

    public Output<Double> throughputMibps() {
        return this.throughputMibps == null ? Codegen.empty() : this.throughputMibps;
    }

    /**
     * Maximum storage quota allowed for a file system in bytes. This is a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     * 
     */
    @Import(name="usageThreshold", required=true)
      private final Output<Double> usageThreshold;

    public Output<Double> usageThreshold() {
        return this.usageThreshold;
    }

    public VolumeArgs(
        @Nullable Output<Double> throughputMibps,
        Output<Double> usageThreshold) {
        this.throughputMibps = throughputMibps == null ? Codegen.ofNullable(0e+00) : throughputMibps;
        this.usageThreshold = usageThreshold == null ? Codegen.ofNullable(1.073741824e+11) : Objects.requireNonNull(usageThreshold, "expected parameter 'usageThreshold' to be non-null");
    }

    private VolumeArgs() {
        this.throughputMibps = Codegen.empty();
        this.usageThreshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> throughputMibps;
        private Output<Double> usageThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.throughputMibps = defaults.throughputMibps;
    	      this.usageThreshold = defaults.usageThreshold;
        }

        public Builder throughputMibps(@Nullable Output<Double> throughputMibps) {
            this.throughputMibps = throughputMibps;
            return this;
        }
        public Builder throughputMibps(@Nullable Double throughputMibps) {
            this.throughputMibps = Codegen.ofNullable(throughputMibps);
            return this;
        }
        public Builder usageThreshold(Output<Double> usageThreshold) {
            this.usageThreshold = Objects.requireNonNull(usageThreshold);
            return this;
        }
        public Builder usageThreshold(Double usageThreshold) {
            this.usageThreshold = Output.of(Objects.requireNonNull(usageThreshold));
            return this;
        }        public VolumeArgs build() {
            return new VolumeArgs(throughputMibps, usageThreshold);
        }
    }
}
