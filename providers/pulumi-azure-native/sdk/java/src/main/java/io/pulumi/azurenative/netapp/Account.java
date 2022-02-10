// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.netapp.AccountArgs;
import io.pulumi.azurenative.netapp.outputs.AccountEncryptionResponse;
import io.pulumi.azurenative.netapp.outputs.ActiveDirectoryResponse;
import io.pulumi.azurenative.netapp.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:netapp:Account")
public class Account extends io.pulumi.resources.CustomResource {
    @OutputExport(name="activeDirectories", type=List.class, parameters={ActiveDirectoryResponse.class})
    private Output</* @Nullable */ List<ActiveDirectoryResponse>> activeDirectories;

    public Output</* @Nullable */ List<ActiveDirectoryResponse>> getActiveDirectories() {
        return this.activeDirectories;
    }
    @OutputExport(name="encryption", type=AccountEncryptionResponse.class, parameters={})
    private Output</* @Nullable */ AccountEncryptionResponse> encryption;

    public Output</* @Nullable */ AccountEncryptionResponse> getEncryption() {
        return this.encryption;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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

    public Account(String name, AccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Account", name, args == null ? AccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Account(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:netapp:Account", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:netapp/v20170815:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20190501:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20190601:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20190701:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20190801:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20191001:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20191101:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200201:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200301:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200501:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200601:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200701:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200801:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20200901:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20201101:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20201201:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210201:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210401:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210401preview:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210601:Account").build()),
                Input.of(Alias.builder().setType("azure-native:netapp/v20210801:Account").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Account get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Account(name, id, options);
    }
}