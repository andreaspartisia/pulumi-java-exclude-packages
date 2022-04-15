// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.inputs.AllocationSpecificSKUAllocationReservedInstancePropertiesArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This reservation type allows to pre allocate specific instance configuration. Next ID: 5
 * 
 */
public final class AllocationSpecificSKUReservationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllocationSpecificSKUReservationArgs Empty = new AllocationSpecificSKUReservationArgs();

    /**
     * Specifies the number of resources that are allocated.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<String> count;

    public Output<String> count() {
        return this.count == null ? Codegen.empty() : this.count;
    }

    /**
     * The instance properties for the reservation.
     * 
     */
    @Import(name="instanceProperties")
      private final @Nullable Output<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties;

    public Output<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties() {
        return this.instanceProperties == null ? Codegen.empty() : this.instanceProperties;
    }

    public AllocationSpecificSKUReservationArgs(
        @Nullable Output<String> count,
        @Nullable Output<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties) {
        this.count = count;
        this.instanceProperties = instanceProperties;
    }

    private AllocationSpecificSKUReservationArgs() {
        this.count = Codegen.empty();
        this.instanceProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUReservationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> count;
        private @Nullable Output<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUReservationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.instanceProperties = defaults.instanceProperties;
        }

        public Builder count(@Nullable Output<String> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable String count) {
            this.count = Codegen.ofNullable(count);
            return this;
        }
        public Builder instanceProperties(@Nullable Output<AllocationSpecificSKUAllocationReservedInstancePropertiesArgs> instanceProperties) {
            this.instanceProperties = instanceProperties;
            return this;
        }
        public Builder instanceProperties(@Nullable AllocationSpecificSKUAllocationReservedInstancePropertiesArgs instanceProperties) {
            this.instanceProperties = Codegen.ofNullable(instanceProperties);
            return this;
        }        public AllocationSpecificSKUReservationArgs build() {
            return new AllocationSpecificSKUReservationArgs(count, instanceProperties);
        }
    }
}
