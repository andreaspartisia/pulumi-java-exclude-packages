// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.databoxedge.enums.DataBoxEdgeDeviceStatus;
import com.pulumi.azurenative.databoxedge.inputs.ResourceIdentityArgs;
import com.pulumi.azurenative.databoxedge.inputs.SkuArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * The status of the Data Box Edge/Gateway device.
     * 
     */
    @Import(name="dataBoxEdgeDeviceStatus")
    private @Nullable Output<Either<String,DataBoxEdgeDeviceStatus>> dataBoxEdgeDeviceStatus;

    public Optional<Output<Either<String,DataBoxEdgeDeviceStatus>>> dataBoxEdgeDeviceStatus() {
        return Optional.ofNullable(this.dataBoxEdgeDeviceStatus);
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * Msi identity of the resource
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ResourceIdentityArgs> identity;

    public Optional<Output<ResourceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * The location of the device. This is a supported and registered Azure geographical region (for example, West US, East US, or Southeast Asia). The geographical region of a device cannot be changed once it is created, but if an identical geographical region is specified on update, the request will succeed.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU type.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<SkuArgs> sku;

    public Optional<Output<SkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * The list of tags that describe the device. These tags can be used to view and group this device (across resource groups).
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DeviceArgs() {}

    private DeviceArgs(DeviceArgs $) {
        this.dataBoxEdgeDeviceStatus = $.dataBoxEdgeDeviceStatus;
        this.deviceName = $.deviceName;
        this.identity = $.identity;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeviceArgs $;

        public Builder() {
            $ = new DeviceArgs();
        }

        public Builder(DeviceArgs defaults) {
            $ = new DeviceArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataBoxEdgeDeviceStatus(@Nullable Output<Either<String,DataBoxEdgeDeviceStatus>> dataBoxEdgeDeviceStatus) {
            $.dataBoxEdgeDeviceStatus = dataBoxEdgeDeviceStatus;
            return this;
        }

        public Builder dataBoxEdgeDeviceStatus(Either<String,DataBoxEdgeDeviceStatus> dataBoxEdgeDeviceStatus) {
            return dataBoxEdgeDeviceStatus(Output.of(dataBoxEdgeDeviceStatus));
        }

        public Builder dataBoxEdgeDeviceStatus(String dataBoxEdgeDeviceStatus) {
            return dataBoxEdgeDeviceStatus(Either.ofLeft(dataBoxEdgeDeviceStatus));
        }

        public Builder dataBoxEdgeDeviceStatus(DataBoxEdgeDeviceStatus dataBoxEdgeDeviceStatus) {
            return dataBoxEdgeDeviceStatus(Either.ofRight(dataBoxEdgeDeviceStatus));
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public Builder identity(@Nullable Output<ResourceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(ResourceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(SkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DeviceArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
