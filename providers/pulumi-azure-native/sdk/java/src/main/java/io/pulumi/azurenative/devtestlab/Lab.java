// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.LabArgs;
import io.pulumi.azurenative.devtestlab.outputs.LabAnnouncementPropertiesResponse;
import io.pulumi.azurenative.devtestlab.outputs.LabSupportPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:devtestlab:Lab")
public class Lab extends io.pulumi.resources.CustomResource {
    @OutputExport(name="announcement", type=LabAnnouncementPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ LabAnnouncementPropertiesResponse> announcement;

    public Output</* @Nullable */ LabAnnouncementPropertiesResponse> getAnnouncement() {
        return this.announcement;
    }
    @OutputExport(name="artifactsStorageAccount", type=String.class, parameters={})
    private Output<String> artifactsStorageAccount;

    public Output<String> getArtifactsStorageAccount() {
        return this.artifactsStorageAccount;
    }
    @OutputExport(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    public Output<String> getCreatedDate() {
        return this.createdDate;
    }
    @OutputExport(name="defaultPremiumStorageAccount", type=String.class, parameters={})
    private Output<String> defaultPremiumStorageAccount;

    public Output<String> getDefaultPremiumStorageAccount() {
        return this.defaultPremiumStorageAccount;
    }
    @OutputExport(name="defaultStorageAccount", type=String.class, parameters={})
    private Output<String> defaultStorageAccount;

    public Output<String> getDefaultStorageAccount() {
        return this.defaultStorageAccount;
    }
    @OutputExport(name="environmentPermission", type=String.class, parameters={})
    private Output</* @Nullable */ String> environmentPermission;

    public Output</* @Nullable */ String> getEnvironmentPermission() {
        return this.environmentPermission;
    }
    @OutputExport(name="extendedProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> extendedProperties;

    public Output</* @Nullable */ Map<String,String>> getExtendedProperties() {
        return this.extendedProperties;
    }
    @OutputExport(name="labStorageType", type=String.class, parameters={})
    private Output</* @Nullable */ String> labStorageType;

    public Output</* @Nullable */ String> getLabStorageType() {
        return this.labStorageType;
    }
    @OutputExport(name="loadBalancerId", type=String.class, parameters={})
    private Output<String> loadBalancerId;

    public Output<String> getLoadBalancerId() {
        return this.loadBalancerId;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="mandatoryArtifactsResourceIdsLinux", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> mandatoryArtifactsResourceIdsLinux;

    public Output</* @Nullable */ List<String>> getMandatoryArtifactsResourceIdsLinux() {
        return this.mandatoryArtifactsResourceIdsLinux;
    }
    @OutputExport(name="mandatoryArtifactsResourceIdsWindows", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> mandatoryArtifactsResourceIdsWindows;

    public Output</* @Nullable */ List<String>> getMandatoryArtifactsResourceIdsWindows() {
        return this.mandatoryArtifactsResourceIdsWindows;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="networkSecurityGroupId", type=String.class, parameters={})
    private Output<String> networkSecurityGroupId;

    public Output<String> getNetworkSecurityGroupId() {
        return this.networkSecurityGroupId;
    }
    @OutputExport(name="premiumDataDiskStorageAccount", type=String.class, parameters={})
    private Output<String> premiumDataDiskStorageAccount;

    public Output<String> getPremiumDataDiskStorageAccount() {
        return this.premiumDataDiskStorageAccount;
    }
    @OutputExport(name="premiumDataDisks", type=String.class, parameters={})
    private Output</* @Nullable */ String> premiumDataDisks;

    public Output</* @Nullable */ String> getPremiumDataDisks() {
        return this.premiumDataDisks;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="publicIpId", type=String.class, parameters={})
    private Output<String> publicIpId;

    public Output<String> getPublicIpId() {
        return this.publicIpId;
    }
    @OutputExport(name="support", type=LabSupportPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ LabSupportPropertiesResponse> support;

    public Output</* @Nullable */ LabSupportPropertiesResponse> getSupport() {
        return this.support;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="uniqueIdentifier", type=String.class, parameters={})
    private Output<String> uniqueIdentifier;

    public Output<String> getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    @OutputExport(name="vaultName", type=String.class, parameters={})
    private Output<String> vaultName;

    public Output<String> getVaultName() {
        return this.vaultName;
    }
    @OutputExport(name="vmCreationResourceGroup", type=String.class, parameters={})
    private Output<String> vmCreationResourceGroup;

    public Output<String> getVmCreationResourceGroup() {
        return this.vmCreationResourceGroup;
    }

    public Lab(String name, LabArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Lab", name, args == null ? LabArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Lab(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devtestlab:Lab", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20150521preview:Lab").build()),
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20160515:Lab").build()),
                Input.of(Alias.builder().setType("azure-native:devtestlab/v20180915:Lab").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Lab get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Lab(name, id, options);
    }
}