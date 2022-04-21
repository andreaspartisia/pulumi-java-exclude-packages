// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakeanalytics;

import com.pulumi.azurenative.datalakeanalytics.enums.AADObjectType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComputePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputePolicyArgs Empty = new ComputePolicyArgs();

    /**
     * The name of the Data Lake Analytics account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * The name of the compute policy to create or update.
     * 
     */
    @Import(name="computePolicyName")
    private @Nullable Output<String> computePolicyName;

    public Optional<Output<String>> computePolicyName() {
        return Optional.ofNullable(this.computePolicyName);
    }

    /**
     * The maximum degree of parallelism per job this user can use to submit jobs. This property, the min priority per job property, or both must be passed.
     * 
     */
    @Import(name="maxDegreeOfParallelismPerJob")
    private @Nullable Output<Integer> maxDegreeOfParallelismPerJob;

    public Optional<Output<Integer>> maxDegreeOfParallelismPerJob() {
        return Optional.ofNullable(this.maxDegreeOfParallelismPerJob);
    }

    /**
     * The minimum priority per job this user can use to submit jobs. This property, the max degree of parallelism per job property, or both must be passed.
     * 
     */
    @Import(name="minPriorityPerJob")
    private @Nullable Output<Integer> minPriorityPerJob;

    public Optional<Output<Integer>> minPriorityPerJob() {
        return Optional.ofNullable(this.minPriorityPerJob);
    }

    /**
     * The AAD object identifier for the entity to create a policy for.
     * 
     */
    @Import(name="objectId", required=true)
    private Output<String> objectId;

    public Output<String> objectId() {
        return this.objectId;
    }

    /**
     * The type of AAD object the object identifier refers to.
     * 
     */
    @Import(name="objectType", required=true)
    private Output<Either<String,AADObjectType>> objectType;

    public Output<Either<String,AADObjectType>> objectType() {
        return this.objectType;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ComputePolicyArgs() {}

    private ComputePolicyArgs(ComputePolicyArgs $) {
        this.accountName = $.accountName;
        this.computePolicyName = $.computePolicyName;
        this.maxDegreeOfParallelismPerJob = $.maxDegreeOfParallelismPerJob;
        this.minPriorityPerJob = $.minPriorityPerJob;
        this.objectId = $.objectId;
        this.objectType = $.objectType;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComputePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComputePolicyArgs $;

        public Builder() {
            $ = new ComputePolicyArgs();
        }

        public Builder(ComputePolicyArgs defaults) {
            $ = new ComputePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder computePolicyName(@Nullable Output<String> computePolicyName) {
            $.computePolicyName = computePolicyName;
            return this;
        }

        public Builder computePolicyName(String computePolicyName) {
            return computePolicyName(Output.of(computePolicyName));
        }

        public Builder maxDegreeOfParallelismPerJob(@Nullable Output<Integer> maxDegreeOfParallelismPerJob) {
            $.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
            return this;
        }

        public Builder maxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
            return maxDegreeOfParallelismPerJob(Output.of(maxDegreeOfParallelismPerJob));
        }

        public Builder minPriorityPerJob(@Nullable Output<Integer> minPriorityPerJob) {
            $.minPriorityPerJob = minPriorityPerJob;
            return this;
        }

        public Builder minPriorityPerJob(Integer minPriorityPerJob) {
            return minPriorityPerJob(Output.of(minPriorityPerJob));
        }

        public Builder objectId(Output<String> objectId) {
            $.objectId = objectId;
            return this;
        }

        public Builder objectId(String objectId) {
            return objectId(Output.of(objectId));
        }

        public Builder objectType(Output<Either<String,AADObjectType>> objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder objectType(Either<String,AADObjectType> objectType) {
            return objectType(Output.of(objectType));
        }

        public Builder objectType(String objectType) {
            return objectType(Either.ofLeft(objectType));
        }

        public Builder objectType(AADObjectType objectType) {
            return objectType(Either.ofRight(objectType));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ComputePolicyArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.objectId = Objects.requireNonNull($.objectId, "expected parameter 'objectId' to be non-null");
            $.objectType = Objects.requireNonNull($.objectType, "expected parameter 'objectType' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
