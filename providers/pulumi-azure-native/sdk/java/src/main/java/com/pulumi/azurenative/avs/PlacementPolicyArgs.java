// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.azurenative.avs.inputs.VmHostPlacementPolicyPropertiesArgs;
import com.pulumi.azurenative.avs.inputs.VmVmPlacementPolicyPropertiesArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PlacementPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PlacementPolicyArgs Empty = new PlacementPolicyArgs();

    /**
     * Name of the cluster in the private cloud
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * Name of the VMware vSphere Distributed Resource Scheduler (DRS) placement policy
     * 
     */
    @Import(name="placementPolicyName")
    private @Nullable Output<String> placementPolicyName;

    public Optional<Output<String>> placementPolicyName() {
        return Optional.ofNullable(this.placementPolicyName);
    }

    /**
     * Name of the private cloud
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * placement policy properties
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs>> properties;

    public Optional<Output<Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private PlacementPolicyArgs() {}

    private PlacementPolicyArgs(PlacementPolicyArgs $) {
        this.clusterName = $.clusterName;
        this.placementPolicyName = $.placementPolicyName;
        this.privateCloudName = $.privateCloudName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PlacementPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PlacementPolicyArgs $;

        public Builder() {
            $ = new PlacementPolicyArgs();
        }

        public Builder(PlacementPolicyArgs defaults) {
            $ = new PlacementPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder placementPolicyName(@Nullable Output<String> placementPolicyName) {
            $.placementPolicyName = placementPolicyName;
            return this;
        }

        public Builder placementPolicyName(String placementPolicyName) {
            return placementPolicyName(Output.of(placementPolicyName));
        }

        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
        }

        public Builder properties(@Nullable Output<Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs>> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(Either<VmHostPlacementPolicyPropertiesArgs,VmVmPlacementPolicyPropertiesArgs> properties) {
            return properties(Output.of(properties));
        }

        public Builder properties(VmHostPlacementPolicyPropertiesArgs properties) {
            return properties(Either.ofLeft(properties));
        }

        public Builder properties(VmVmPlacementPolicyPropertiesArgs properties) {
            return properties(Either.ofRight(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public PlacementPolicyArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
