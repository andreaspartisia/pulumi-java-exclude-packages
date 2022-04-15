// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies options for controlling advanced machine features. Options that would traditionally be configured in a BIOS belong here. Features that require operating system support may have corresponding entries in the GuestOsFeatures of an Image (e.g., whether or not the OS in the Image supports nested virtualization being enabled or disabled).
 * 
 */
public final class AdvancedMachineFeaturesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdvancedMachineFeaturesResponse Empty = new AdvancedMachineFeaturesResponse();

    /**
     * Whether to enable nested virtualization or not (default is false).
     * 
     */
    @Import(name="enableNestedVirtualization", required=true)
      private final Boolean enableNestedVirtualization;

    public Boolean enableNestedVirtualization() {
        return this.enableNestedVirtualization;
    }

    /**
     * Whether to enable UEFI networking for instance creation.
     * 
     */
    @Import(name="enableUefiNetworking", required=true)
      private final Boolean enableUefiNetworking;

    public Boolean enableUefiNetworking() {
        return this.enableUefiNetworking;
    }

    /**
     * The number of threads per physical core. To disable simultaneous multithreading (SMT) set this to 1. If unset, the maximum number of threads supported per core by the underlying processor is assumed.
     * 
     */
    @Import(name="threadsPerCore", required=true)
      private final Integer threadsPerCore;

    public Integer threadsPerCore() {
        return this.threadsPerCore;
    }

    public AdvancedMachineFeaturesResponse(
        Boolean enableNestedVirtualization,
        Boolean enableUefiNetworking,
        Integer threadsPerCore) {
        this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization, "expected parameter 'enableNestedVirtualization' to be non-null");
        this.enableUefiNetworking = Objects.requireNonNull(enableUefiNetworking, "expected parameter 'enableUefiNetworking' to be non-null");
        this.threadsPerCore = Objects.requireNonNull(threadsPerCore, "expected parameter 'threadsPerCore' to be non-null");
    }

    private AdvancedMachineFeaturesResponse() {
        this.enableNestedVirtualization = null;
        this.enableUefiNetworking = null;
        this.threadsPerCore = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedMachineFeaturesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableNestedVirtualization;
        private Boolean enableUefiNetworking;
        private Integer threadsPerCore;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedMachineFeaturesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNestedVirtualization = defaults.enableNestedVirtualization;
    	      this.enableUefiNetworking = defaults.enableUefiNetworking;
    	      this.threadsPerCore = defaults.threadsPerCore;
        }

        public Builder enableNestedVirtualization(Boolean enableNestedVirtualization) {
            this.enableNestedVirtualization = Objects.requireNonNull(enableNestedVirtualization);
            return this;
        }
        public Builder enableUefiNetworking(Boolean enableUefiNetworking) {
            this.enableUefiNetworking = Objects.requireNonNull(enableUefiNetworking);
            return this;
        }
        public Builder threadsPerCore(Integer threadsPerCore) {
            this.threadsPerCore = Objects.requireNonNull(threadsPerCore);
            return this;
        }        public AdvancedMachineFeaturesResponse build() {
            return new AdvancedMachineFeaturesResponse(enableNestedVirtualization, enableUefiNetworking, threadsPerCore);
        }
    }
}
