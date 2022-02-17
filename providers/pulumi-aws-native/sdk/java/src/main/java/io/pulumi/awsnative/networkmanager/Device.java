// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkmanager;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkmanager.DeviceArgs;
import io.pulumi.awsnative.networkmanager.outputs.DeviceLocation;
import io.pulumi.awsnative.networkmanager.outputs.DeviceTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The AWS::NetworkManager::Device type describes a device.
 * 
 */
@ResourceType(type="aws-native:networkmanager:Device")
public class Device extends io.pulumi.resources.CustomResource {
    /**
     * The description of the device.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the device.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The Amazon Resource Name (ARN) of the device.
     * 
     */
    @OutputExport(name="deviceArn", type=String.class, parameters={})
    private Output<String> deviceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the device.
     * 
     */
    public Output<String> getDeviceArn() {
        return this.deviceArn;
    }
    /**
     * The ID of the device.
     * 
     */
    @OutputExport(name="deviceId", type=String.class, parameters={})
    private Output<String> deviceId;

    /**
     * @return The ID of the device.
     * 
     */
    public Output<String> getDeviceId() {
        return this.deviceId;
    }
    /**
     * The ID of the global network.
     * 
     */
    @OutputExport(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> getGlobalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The site location.
     * 
     */
    @OutputExport(name="location", type=DeviceLocation.class, parameters={})
    private Output</* @Nullable */ DeviceLocation> location;

    /**
     * @return The site location.
     * 
     */
    public Output</* @Nullable */ DeviceLocation> getLocation() {
        return this.location;
    }
    /**
     * The device model
     * 
     */
    @OutputExport(name="model", type=String.class, parameters={})
    private Output</* @Nullable */ String> model;

    /**
     * @return The device model
     * 
     */
    public Output</* @Nullable */ String> getModel() {
        return this.model;
    }
    /**
     * The device serial number.
     * 
     */
    @OutputExport(name="serialNumber", type=String.class, parameters={})
    private Output</* @Nullable */ String> serialNumber;

    /**
     * @return The device serial number.
     * 
     */
    public Output</* @Nullable */ String> getSerialNumber() {
        return this.serialNumber;
    }
    /**
     * The site ID.
     * 
     */
    @OutputExport(name="siteId", type=String.class, parameters={})
    private Output</* @Nullable */ String> siteId;

    /**
     * @return The site ID.
     * 
     */
    public Output</* @Nullable */ String> getSiteId() {
        return this.siteId;
    }
    /**
     * The tags for the device.
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={DeviceTag.class})
    private Output</* @Nullable */ List<DeviceTag>> tags;

    /**
     * @return The tags for the device.
     * 
     */
    public Output</* @Nullable */ List<DeviceTag>> getTags() {
        return this.tags;
    }
    /**
     * The device type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The device type.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }
    /**
     * The device vendor.
     * 
     */
    @OutputExport(name="vendor", type=String.class, parameters={})
    private Output</* @Nullable */ String> vendor;

    /**
     * @return The device vendor.
     * 
     */
    public Output</* @Nullable */ String> getVendor() {
        return this.vendor;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Device(String name, DeviceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:Device", name, args == null ? DeviceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Device(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:Device", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Device get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Device(name, id, options);
    }
}