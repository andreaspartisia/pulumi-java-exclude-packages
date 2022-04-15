// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourceCommitmentResponse {
    /**
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * 
     */
    private final String acceleratorType;
    /**
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * 
     */
    private final String amount;
    /**
     * Type of resource for which this commitment applies. Possible values are VCPU and MEMORY
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ResourceCommitmentResponse(
        @CustomType.Parameter("acceleratorType") String acceleratorType,
        @CustomType.Parameter("amount") String amount,
        @CustomType.Parameter("type") String type) {
        this.acceleratorType = acceleratorType;
        this.amount = amount;
        this.type = type;
    }

    /**
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * 
    */
    public String acceleratorType() {
        return this.acceleratorType;
    }
    /**
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * 
    */
    public String amount() {
        return this.amount;
    }
    /**
     * Type of resource for which this commitment applies. Possible values are VCPU and MEMORY
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceCommitmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String acceleratorType;
        private String amount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceCommitmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.amount = defaults.amount;
    	      this.type = defaults.type;
        }

        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public Builder amount(String amount) {
            this.amount = Objects.requireNonNull(amount);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ResourceCommitmentResponse build() {
            return new ResourceCommitmentResponse(acceleratorType, amount, type);
        }
    }
}
