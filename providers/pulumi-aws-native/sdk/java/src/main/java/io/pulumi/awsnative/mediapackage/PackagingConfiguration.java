// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.mediapackage.PackagingConfigurationArgs;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationCmafPackage;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationDashPackage;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationHlsPackage;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationMssPackage;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::MediaPackage::PackagingConfiguration
 * 
 */
@ResourceType(type="aws-native:mediapackage:PackagingConfiguration")
public class PackagingConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the PackagingConfiguration.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the PackagingConfiguration.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A CMAF packaging configuration.
     * 
     */
    @OutputExport(name="cmafPackage", type=PackagingConfigurationCmafPackage.class, parameters={})
    private Output</* @Nullable */ PackagingConfigurationCmafPackage> cmafPackage;

    /**
     * @return A CMAF packaging configuration.
     * 
     */
    public Output</* @Nullable */ PackagingConfigurationCmafPackage> getCmafPackage() {
        return this.cmafPackage;
    }
    /**
     * A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * 
     */
    @OutputExport(name="dashPackage", type=PackagingConfigurationDashPackage.class, parameters={})
    private Output</* @Nullable */ PackagingConfigurationDashPackage> dashPackage;

    /**
     * @return A Dynamic Adaptive Streaming over HTTP (DASH) packaging configuration.
     * 
     */
    public Output</* @Nullable */ PackagingConfigurationDashPackage> getDashPackage() {
        return this.dashPackage;
    }
    /**
     * An HTTP Live Streaming (HLS) packaging configuration.
     * 
     */
    @OutputExport(name="hlsPackage", type=PackagingConfigurationHlsPackage.class, parameters={})
    private Output</* @Nullable */ PackagingConfigurationHlsPackage> hlsPackage;

    /**
     * @return An HTTP Live Streaming (HLS) packaging configuration.
     * 
     */
    public Output</* @Nullable */ PackagingConfigurationHlsPackage> getHlsPackage() {
        return this.hlsPackage;
    }
    /**
     * A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * 
     */
    @OutputExport(name="mssPackage", type=PackagingConfigurationMssPackage.class, parameters={})
    private Output</* @Nullable */ PackagingConfigurationMssPackage> mssPackage;

    /**
     * @return A Microsoft Smooth Streaming (MSS) PackagingConfiguration.
     * 
     */
    public Output</* @Nullable */ PackagingConfigurationMssPackage> getMssPackage() {
        return this.mssPackage;
    }
    /**
     * The ID of a PackagingGroup.
     * 
     */
    @OutputExport(name="packagingGroupId", type=String.class, parameters={})
    private Output<String> packagingGroupId;

    /**
     * @return The ID of a PackagingGroup.
     * 
     */
    public Output<String> getPackagingGroupId() {
        return this.packagingGroupId;
    }
    /**
     * A collection of tags associated with a resource
     * 
     */
    @OutputExport(name="tags", type=List.class, parameters={PackagingConfigurationTag.class})
    private Output</* @Nullable */ List<PackagingConfigurationTag>> tags;

    /**
     * @return A collection of tags associated with a resource
     * 
     */
    public Output</* @Nullable */ List<PackagingConfigurationTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PackagingConfiguration(String name, PackagingConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:mediapackage:PackagingConfiguration", name, args == null ? PackagingConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PackagingConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:mediapackage:PackagingConfiguration", name, null, makeResourceOptions(options, id));
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
    public static PackagingConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PackagingConfiguration(name, id, options);
    }
}