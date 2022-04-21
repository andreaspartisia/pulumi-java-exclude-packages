// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.azurenative.costmanagement.enums.CostAllocationResourceType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Source resources for cost allocation
 * 
 */
public final class SourceCostAllocationResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceCostAllocationResourceArgs Empty = new SourceCostAllocationResourceArgs();

    /**
     * If resource type is dimension, this must be either ResourceGroupName or SubscriptionId. If resource type is tag, this must be a valid Azure tag
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Type of resources contained in this cost allocation rule
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<Either<String,CostAllocationResourceType>> resourceType;

    public Output<Either<String,CostAllocationResourceType>> resourceType() {
        return this.resourceType;
    }

    /**
     * Source Resources for cost allocation. This list cannot contain more than 25 values.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private SourceCostAllocationResourceArgs() {}

    private SourceCostAllocationResourceArgs(SourceCostAllocationResourceArgs $) {
        this.name = $.name;
        this.resourceType = $.resourceType;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceCostAllocationResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceCostAllocationResourceArgs $;

        public Builder() {
            $ = new SourceCostAllocationResourceArgs();
        }

        public Builder(SourceCostAllocationResourceArgs defaults) {
            $ = new SourceCostAllocationResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceType(Output<Either<String,CostAllocationResourceType>> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(Either<String,CostAllocationResourceType> resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Either.ofLeft(resourceType));
        }

        public Builder resourceType(CostAllocationResourceType resourceType) {
            return resourceType(Either.ofRight(resourceType));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public SourceCostAllocationResourceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
