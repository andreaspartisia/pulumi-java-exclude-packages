// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.ObjectStorage.NamespaceMetadataArgs;
import com.pulumi.oci.ObjectStorage.inputs.NamespaceMetadataState;
import com.pulumi.oci.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="oci:ObjectStorage/namespaceMetadata:NamespaceMetadata")
public class NamespaceMetadata extends com.pulumi.resources.CustomResource {
    @Export(name="defaultS3compartmentId", type=String.class, parameters={})
    private Output<String> defaultS3compartmentId;

    public Output<String> defaultS3compartmentId() {
        return this.defaultS3compartmentId;
    }
    @Export(name="defaultSwiftCompartmentId", type=String.class, parameters={})
    private Output<String> defaultSwiftCompartmentId;

    public Output<String> defaultSwiftCompartmentId() {
        return this.defaultSwiftCompartmentId;
    }
    @Export(name="namespace", type=String.class, parameters={})
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NamespaceMetadata(String name) {
        this(name, NamespaceMetadataArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NamespaceMetadata(String name, NamespaceMetadataArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NamespaceMetadata(String name, NamespaceMetadataArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:ObjectStorage/namespaceMetadata:NamespaceMetadata", name, args == null ? NamespaceMetadataArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NamespaceMetadata(String name, Output<String> id, @Nullable NamespaceMetadataState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:ObjectStorage/namespaceMetadata:NamespaceMetadata", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NamespaceMetadata get(String name, Output<String> id, @Nullable NamespaceMetadataState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NamespaceMetadata(name, id, state, options);
    }
}
