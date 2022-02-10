// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IotHubDefinitionDescriptionResponse {
    private final @Nullable Integer allocationWeight;
    private final @Nullable Boolean applyAllocationPolicy;
    private final String connectionString;
    private final String location;
    private final String name;

    @OutputCustomType.Constructor({"allocationWeight","applyAllocationPolicy","connectionString","location","name"})
    private IotHubDefinitionDescriptionResponse(
        @Nullable Integer allocationWeight,
        @Nullable Boolean applyAllocationPolicy,
        String connectionString,
        String location,
        String name) {
        this.allocationWeight = allocationWeight;
        this.applyAllocationPolicy = applyAllocationPolicy;
        this.connectionString = Objects.requireNonNull(connectionString);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
    }

    public Optional<Integer> getAllocationWeight() {
        return Optional.ofNullable(this.allocationWeight);
    }
    public Optional<Boolean> getApplyAllocationPolicy() {
        return Optional.ofNullable(this.applyAllocationPolicy);
    }
    public String getConnectionString() {
        return this.connectionString;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubDefinitionDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allocationWeight;
        private @Nullable Boolean applyAllocationPolicy;
        private String connectionString;
        private String location;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubDefinitionDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationWeight = defaults.allocationWeight;
    	      this.applyAllocationPolicy = defaults.applyAllocationPolicy;
    	      this.connectionString = defaults.connectionString;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
        }

        public Builder setAllocationWeight(@Nullable Integer allocationWeight) {
            this.allocationWeight = allocationWeight;
            return this;
        }

        public Builder setApplyAllocationPolicy(@Nullable Boolean applyAllocationPolicy) {
            this.applyAllocationPolicy = applyAllocationPolicy;
            return this;
        }

        public Builder setConnectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public IotHubDefinitionDescriptionResponse build() {
            return new IotHubDefinitionDescriptionResponse(allocationWeight, applyAllocationPolicy, connectionString, location, name);
        }
    }
}