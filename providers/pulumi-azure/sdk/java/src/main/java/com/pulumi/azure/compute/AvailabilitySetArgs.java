// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AvailabilitySetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AvailabilitySetArgs Empty = new AvailabilitySetArgs();

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies whether the availability set is managed or not. Possible values are `true` (to specify aligned) or `false` (to specify classic). Default is `true`.
     * 
     */
    @Import(name="managed")
    private @Nullable Output<Boolean> managed;

    /**
     * @return Specifies whether the availability set is managed or not. Possible values are `true` (to specify aligned) or `false` (to specify classic). Default is `true`.
     * 
     */
    public Optional<Output<Boolean>> managed() {
        return Optional.ofNullable(this.managed);
    }

    /**
     * Specifies the name of the availability set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the availability set. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the number of fault domains that are used. Defaults to `3`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="platformFaultDomainCount")
    private @Nullable Output<Integer> platformFaultDomainCount;

    /**
     * @return Specifies the number of fault domains that are used. Defaults to `3`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> platformFaultDomainCount() {
        return Optional.ofNullable(this.platformFaultDomainCount);
    }

    /**
     * Specifies the number of update domains that are used. Defaults to `5`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="platformUpdateDomainCount")
    private @Nullable Output<Integer> platformUpdateDomainCount;

    /**
     * @return Specifies the number of update domains that are used. Defaults to `5`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> platformUpdateDomainCount() {
        return Optional.ofNullable(this.platformUpdateDomainCount);
    }

    /**
     * The ID of the Proximity Placement Group to which this Virtual Machine should be assigned. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="proximityPlacementGroupId")
    private @Nullable Output<String> proximityPlacementGroupId;

    /**
     * @return The ID of the Proximity Placement Group to which this Virtual Machine should be assigned. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> proximityPlacementGroupId() {
        return Optional.ofNullable(this.proximityPlacementGroupId);
    }

    /**
     * The name of the resource group in which to create the availability set. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which to create the availability set. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AvailabilitySetArgs() {}

    private AvailabilitySetArgs(AvailabilitySetArgs $) {
        this.location = $.location;
        this.managed = $.managed;
        this.name = $.name;
        this.platformFaultDomainCount = $.platformFaultDomainCount;
        this.platformUpdateDomainCount = $.platformUpdateDomainCount;
        this.proximityPlacementGroupId = $.proximityPlacementGroupId;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AvailabilitySetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilitySetArgs $;

        public Builder() {
            $ = new AvailabilitySetArgs();
        }

        public Builder(AvailabilitySetArgs defaults) {
            $ = new AvailabilitySetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param managed Specifies whether the availability set is managed or not. Possible values are `true` (to specify aligned) or `false` (to specify classic). Default is `true`.
         * 
         * @return builder
         * 
         */
        public Builder managed(@Nullable Output<Boolean> managed) {
            $.managed = managed;
            return this;
        }

        /**
         * @param managed Specifies whether the availability set is managed or not. Possible values are `true` (to specify aligned) or `false` (to specify classic). Default is `true`.
         * 
         * @return builder
         * 
         */
        public Builder managed(Boolean managed) {
            return managed(Output.of(managed));
        }

        /**
         * @param name Specifies the name of the availability set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the availability set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param platformFaultDomainCount Specifies the number of fault domains that are used. Defaults to `3`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder platformFaultDomainCount(@Nullable Output<Integer> platformFaultDomainCount) {
            $.platformFaultDomainCount = platformFaultDomainCount;
            return this;
        }

        /**
         * @param platformFaultDomainCount Specifies the number of fault domains that are used. Defaults to `3`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder platformFaultDomainCount(Integer platformFaultDomainCount) {
            return platformFaultDomainCount(Output.of(platformFaultDomainCount));
        }

        /**
         * @param platformUpdateDomainCount Specifies the number of update domains that are used. Defaults to `5`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder platformUpdateDomainCount(@Nullable Output<Integer> platformUpdateDomainCount) {
            $.platformUpdateDomainCount = platformUpdateDomainCount;
            return this;
        }

        /**
         * @param platformUpdateDomainCount Specifies the number of update domains that are used. Defaults to `5`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder platformUpdateDomainCount(Integer platformUpdateDomainCount) {
            return platformUpdateDomainCount(Output.of(platformUpdateDomainCount));
        }

        /**
         * @param proximityPlacementGroupId The ID of the Proximity Placement Group to which this Virtual Machine should be assigned. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder proximityPlacementGroupId(@Nullable Output<String> proximityPlacementGroupId) {
            $.proximityPlacementGroupId = proximityPlacementGroupId;
            return this;
        }

        /**
         * @param proximityPlacementGroupId The ID of the Proximity Placement Group to which this Virtual Machine should be assigned. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder proximityPlacementGroupId(String proximityPlacementGroupId) {
            return proximityPlacementGroupId(Output.of(proximityPlacementGroupId));
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the availability set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which to create the availability set. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AvailabilitySetArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
