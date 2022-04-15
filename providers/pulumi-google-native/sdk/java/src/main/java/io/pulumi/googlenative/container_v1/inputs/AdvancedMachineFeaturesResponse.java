// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies options for controlling advanced machine features.
 * 
 */
public final class AdvancedMachineFeaturesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdvancedMachineFeaturesResponse Empty = new AdvancedMachineFeaturesResponse();

    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    @Import(name="threadsPerCore", required=true)
      private final String threadsPerCore;

    public String threadsPerCore() {
        return this.threadsPerCore;
    }

    public AdvancedMachineFeaturesResponse(String threadsPerCore) {
        this.threadsPerCore = Objects.requireNonNull(threadsPerCore, "expected parameter 'threadsPerCore' to be non-null");
    }

    private AdvancedMachineFeaturesResponse() {
        this.threadsPerCore = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedMachineFeaturesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedMachineFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder threadsPerCore(String threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }        public AdvancedMachineFeaturesResponse build() {
            return new AdvancedMachineFeaturesResponse(threadsPerCore);
        }
    }
}
