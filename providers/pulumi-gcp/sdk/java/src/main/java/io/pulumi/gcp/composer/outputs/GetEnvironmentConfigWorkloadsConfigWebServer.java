// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentConfigWorkloadsConfigWebServer {
    private final Double cpu;
    private final Double memoryGb;
    private final Double storageGb;

    @OutputCustomType.Constructor
    private GetEnvironmentConfigWorkloadsConfigWebServer(
        @OutputCustomType.Parameter("cpu") Double cpu,
        @OutputCustomType.Parameter("memoryGb") Double memoryGb,
        @OutputCustomType.Parameter("storageGb") Double storageGb) {
        this.cpu = cpu;
        this.memoryGb = memoryGb;
        this.storageGb = storageGb;
    }

    public Double getCpu() {
        return this.cpu;
    }
    public Double getMemoryGb() {
        return this.memoryGb;
    }
    public Double getStorageGb() {
        return this.storageGb;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfigWebServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Double memoryGb;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWorkloadsConfigWebServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder setCpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setMemoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }

        public Builder setStorageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }
        public GetEnvironmentConfigWorkloadsConfigWebServer build() {
            return new GetEnvironmentConfigWorkloadsConfigWebServer(cpu, memoryGb, storageGb);
        }
    }
}
