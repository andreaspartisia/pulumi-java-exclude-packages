// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.outputs;

import com.pulumi.azure.hdinsight.outputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleCapacity;
import com.pulumi.azure.hdinsight.outputs.InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InteractiveQueryClusterRolesWorkerNodeAutoscale {
    /**
     * @return A `capacity` block as defined below.
     * 
     */
    private final @Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleCapacity capacity;
    /**
     * @return A `recurrence` block as defined below.
     * 
     */
    private final @Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence recurrence;

    @CustomType.Constructor
    private InteractiveQueryClusterRolesWorkerNodeAutoscale(
        @CustomType.Parameter("capacity") @Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleCapacity capacity,
        @CustomType.Parameter("recurrence") @Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence recurrence) {
        this.capacity = capacity;
        this.recurrence = recurrence;
    }

    /**
     * @return A `capacity` block as defined below.
     * 
     */
    public Optional<InteractiveQueryClusterRolesWorkerNodeAutoscaleCapacity> capacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * @return A `recurrence` block as defined below.
     * 
     */
    public Optional<InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence> recurrence() {
        return Optional.ofNullable(this.recurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InteractiveQueryClusterRolesWorkerNodeAutoscale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleCapacity capacity;
        private @Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence recurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(InteractiveQueryClusterRolesWorkerNodeAutoscale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.recurrence = defaults.recurrence;
        }

        public Builder capacity(@Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleCapacity capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder recurrence(@Nullable InteractiveQueryClusterRolesWorkerNodeAutoscaleRecurrence recurrence) {
            this.recurrence = recurrence;
            return this;
        }        public InteractiveQueryClusterRolesWorkerNodeAutoscale build() {
            return new InteractiveQueryClusterRolesWorkerNodeAutoscale(capacity, recurrence);
        }
    }
}
