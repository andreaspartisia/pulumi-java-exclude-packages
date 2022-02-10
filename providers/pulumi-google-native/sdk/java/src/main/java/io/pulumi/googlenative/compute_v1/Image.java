// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_v1.ImageArgs;
import io.pulumi.googlenative.compute_v1.outputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_v1.outputs.DeprecationStatusResponse;
import io.pulumi.googlenative.compute_v1.outputs.GuestOsFeatureResponse;
import io.pulumi.googlenative.compute_v1.outputs.ImageRawDiskResponse;
import io.pulumi.googlenative.compute_v1.outputs.InitialStateConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="google-native:compute/v1:Image")
public class Image extends io.pulumi.resources.CustomResource {
    @OutputExport(name="archiveSizeBytes", type=String.class, parameters={})
    private Output<String> archiveSizeBytes;

    public Output<String> getArchiveSizeBytes() {
        return this.archiveSizeBytes;
    }
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    @OutputExport(name="deprecated", type=DeprecationStatusResponse.class, parameters={})
    private Output<DeprecationStatusResponse> deprecated;

    public Output<DeprecationStatusResponse> getDeprecated() {
        return this.deprecated;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    public Output<String> getDescription() {
        return this.description;
    }
    @OutputExport(name="diskSizeGb", type=String.class, parameters={})
    private Output<String> diskSizeGb;

    public Output<String> getDiskSizeGb() {
        return this.diskSizeGb;
    }
    @OutputExport(name="family", type=String.class, parameters={})
    private Output<String> family;

    public Output<String> getFamily() {
        return this.family;
    }
    @OutputExport(name="guestOsFeatures", type=List.class, parameters={GuestOsFeatureResponse.class})
    private Output<List<GuestOsFeatureResponse>> guestOsFeatures;

    public Output<List<GuestOsFeatureResponse>> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }
    @OutputExport(name="imageEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> imageEncryptionKey;

    public Output<CustomerEncryptionKeyResponse> getImageEncryptionKey() {
        return this.imageEncryptionKey;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }
    @OutputExport(name="labelFingerprint", type=String.class, parameters={})
    private Output<String> labelFingerprint;

    public Output<String> getLabelFingerprint() {
        return this.labelFingerprint;
    }
    @OutputExport(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels;
    }
    @OutputExport(name="licenseCodes", type=List.class, parameters={String.class})
    private Output<List<String>> licenseCodes;

    public Output<List<String>> getLicenseCodes() {
        return this.licenseCodes;
    }
    @OutputExport(name="licenses", type=List.class, parameters={String.class})
    private Output<List<String>> licenses;

    public Output<List<String>> getLicenses() {
        return this.licenses;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="rawDisk", type=ImageRawDiskResponse.class, parameters={})
    private Output<ImageRawDiskResponse> rawDisk;

    public Output<ImageRawDiskResponse> getRawDisk() {
        return this.rawDisk;
    }
    @OutputExport(name="satisfiesPzs", type=Boolean.class, parameters={})
    private Output<Boolean> satisfiesPzs;

    public Output<Boolean> getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    @OutputExport(name="shieldedInstanceInitialState", type=InitialStateConfigResponse.class, parameters={})
    private Output<InitialStateConfigResponse> shieldedInstanceInitialState;

    public Output<InitialStateConfigResponse> getShieldedInstanceInitialState() {
        return this.shieldedInstanceInitialState;
    }
    @OutputExport(name="sourceDisk", type=String.class, parameters={})
    private Output<String> sourceDisk;

    public Output<String> getSourceDisk() {
        return this.sourceDisk;
    }
    @OutputExport(name="sourceDiskEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceDiskEncryptionKey;

    public Output<CustomerEncryptionKeyResponse> getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey;
    }
    @OutputExport(name="sourceDiskId", type=String.class, parameters={})
    private Output<String> sourceDiskId;

    public Output<String> getSourceDiskId() {
        return this.sourceDiskId;
    }
    @OutputExport(name="sourceImage", type=String.class, parameters={})
    private Output<String> sourceImage;

    public Output<String> getSourceImage() {
        return this.sourceImage;
    }
    @OutputExport(name="sourceImageEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceImageEncryptionKey;

    public Output<CustomerEncryptionKeyResponse> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    @OutputExport(name="sourceImageId", type=String.class, parameters={})
    private Output<String> sourceImageId;

    public Output<String> getSourceImageId() {
        return this.sourceImageId;
    }
    @OutputExport(name="sourceSnapshot", type=String.class, parameters={})
    private Output<String> sourceSnapshot;

    public Output<String> getSourceSnapshot() {
        return this.sourceSnapshot;
    }
    @OutputExport(name="sourceSnapshotEncryptionKey", type=CustomerEncryptionKeyResponse.class, parameters={})
    private Output<CustomerEncryptionKeyResponse> sourceSnapshotEncryptionKey;

    public Output<CustomerEncryptionKeyResponse> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }
    @OutputExport(name="sourceSnapshotId", type=String.class, parameters={})
    private Output<String> sourceSnapshotId;

    public Output<String> getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    @OutputExport(name="sourceType", type=String.class, parameters={})
    private Output<String> sourceType;

    public Output<String> getSourceType() {
        return this.sourceType;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="storageLocations", type=List.class, parameters={String.class})
    private Output<List<String>> storageLocations;

    public Output<List<String>> getStorageLocations() {
        return this.storageLocations;
    }

    public Image(String name, @Nullable ImageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:Image", name, args == null ? ImageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Image(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/v1:Image", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Image get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Image(name, id, options);
    }
}