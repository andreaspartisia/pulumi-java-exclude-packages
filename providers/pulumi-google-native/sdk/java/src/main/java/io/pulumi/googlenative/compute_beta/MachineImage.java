// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.MachineImageArgs;
import io.pulumi.googlenative.compute_beta.outputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_beta.outputs.InstancePropertiesResponse;
import io.pulumi.googlenative.compute_beta.outputs.SavedDiskResponse;
import io.pulumi.googlenative.compute_beta.outputs.SourceDiskEncryptionKeyResponse;
import io.pulumi.googlenative.compute_beta.outputs.SourceInstancePropertiesResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a machine image in the specified project using the data that is included in the request. If you are creating a new machine image to update an existing instance, your new machine image should use the same network or, if applicable, the same subnetwork as the original instance.
 * 
 */
@ResourceType(type="google-native:compute/beta:MachineImage")
public class MachineImage extends io.pulumi.resources.CustomResource {
    /**
     * The creation timestamp for this machine image in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return The creation timestamp for this machine image in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    @Export(name="guestFlush", type=Boolean.class, parameters={})
    private Output<Boolean> guestFlush;

    /**
     * @return [Input Only] Whether to attempt an application consistent machine image by informing the OS to prepare for the snapshot process. Currently only supported on Windows instances using the Volume Shadow Copy Service (VSS).
     * 
     */
    public Output<Boolean> guestFlush() {
        return this.guestFlush;
    }
    /**
     * Properties of source instance
     * 
     */
    @Export(name="instanceProperties", type=InstancePropertiesResponse.class, parameters={})
    private Output<InstancePropertiesResponse> instanceProperties;

    /**
     * @return Properties of source instance
     * 
     */
    public Output<InstancePropertiesResponse> instanceProperties() {
        return this.instanceProperties;
    }
    /**
     * The resource type, which is always compute#machineImage for machine image.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The resource type, which is always compute#machineImage for machine image.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
     * 
     */
    @Export(name="machineImageEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> machineImageEncryptionKey;

    /**
     * @return Encrypts the machine image using a customer-supplied encryption key. After you encrypt a machine image using a customer-supplied key, you must provide the same key if you use the machine image later. For example, you must provide the encryption key when you create an instance from the encrypted machine image in a future request. Customer-supplied encryption keys do not protect access to metadata of the machine image. If you do not provide an encryption key when creating the machine image, then the machine image will be encrypted using an automatically generated key and you do not need to provide a key to use the machine image later.
     * 
     */
    public Output<CustomerEncryptionKeyResponse> machineImageEncryptionKey() {
        return this.machineImageEncryptionKey;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Reserved for future use.
     * 
     */
    @Export(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    /**
     * @return Reserved for future use.
     * 
     */
    public Output<Boolean> satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * An array of Machine Image specific properties for disks attached to the source instance
     * 
     */
    @Export(name="savedDisks", type=List.class, parameters={SavedDiskResponse.class})
    private Output<List<SavedDiskResponse>> savedDisks;

    /**
     * @return An array of Machine Image specific properties for disks attached to the source instance
     * 
     */
    public Output<List<SavedDiskResponse>> savedDisks() {
        return this.savedDisks;
    }
    /**
     * The URL for this machine image. The server defines this URL.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URL for this machine image. The server defines this URL.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    @Export(name="sourceDiskEncryptionKeys", type=List.class, parameters={SourceDiskEncryptionKeyResponse.class})
    private Output<List<SourceDiskEncryptionKeyResponse>> sourceDiskEncryptionKeys;

    /**
     * @return [Input Only] The customer-supplied encryption key of the disks attached to the source instance. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    public Output<List<SourceDiskEncryptionKeyResponse>> sourceDiskEncryptionKeys() {
        return this.sourceDiskEncryptionKeys;
    }
    /**
     * The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    @Export(name="sourceInstance", type=String.class, parameters={})
    private Output<String> sourceInstance;

    /**
     * @return The source instance used to create the machine image. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    public Output<String> sourceInstance() {
        return this.sourceInstance;
    }
    /**
     * DEPRECATED: Please use instance_properties instead for source instance related properties. New properties will not be added to this field.
     * 
     */
    @Export(name="sourceInstanceProperties", type=SourceInstancePropertiesResponse.class, parameters={})
    private Output<SourceInstancePropertiesResponse> sourceInstanceProperties;

    /**
     * @return DEPRECATED: Please use instance_properties instead for source instance related properties. New properties will not be added to this field.
     * 
     */
    public Output<SourceInstancePropertiesResponse> sourceInstanceProperties() {
        return this.sourceInstanceProperties;
    }
    /**
     * The status of the machine image. One of the following values: INVALID, CREATING, READY, DELETING, and UPLOADING.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the machine image. One of the following values: INVALID, CREATING, READY, DELETING, and UPLOADING.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    @Export(name="storageLocations", type=List.class, parameters={String.class})
    private Output<List<String>> storageLocations;

    /**
     * @return The regional or multi-regional Cloud Storage bucket location where the machine image is stored.
     * 
     */
    public Output<List<String>> storageLocations() {
        return this.storageLocations;
    }
    /**
     * Total size of the storage used by the machine image.
     * 
     */
    @Export(name="totalStorageBytes", type=String.class, parameters={})
    private Output<String> totalStorageBytes;

    /**
     * @return Total size of the storage used by the machine image.
     * 
     */
    public Output<String> totalStorageBytes() {
        return this.totalStorageBytes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MachineImage(String name) {
        this(name, MachineImageArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MachineImage(String name, MachineImageArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MachineImage(String name, MachineImageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:MachineImage", name, args == null ? MachineImageArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MachineImage(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:MachineImage", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static MachineImage get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MachineImage(name, id, options);
    }
}
