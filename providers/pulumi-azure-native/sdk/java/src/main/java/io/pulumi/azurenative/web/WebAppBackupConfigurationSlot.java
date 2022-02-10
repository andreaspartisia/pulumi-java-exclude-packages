// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.WebAppBackupConfigurationSlotArgs;
import io.pulumi.azurenative.web.outputs.BackupScheduleResponse;
import io.pulumi.azurenative.web.outputs.DatabaseBackupSettingResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:web:WebAppBackupConfigurationSlot")
public class WebAppBackupConfigurationSlot extends io.pulumi.resources.CustomResource {
    @OutputExport(name="backupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> backupName;

    public Output</* @Nullable */ String> getBackupName() {
        return this.backupName;
    }
    @OutputExport(name="backupSchedule", type=BackupScheduleResponse.class, parameters={})
    private Output</* @Nullable */ BackupScheduleResponse> backupSchedule;

    public Output</* @Nullable */ BackupScheduleResponse> getBackupSchedule() {
        return this.backupSchedule;
    }
    @OutputExport(name="databases", type=List.class, parameters={DatabaseBackupSettingResponse.class})
    private Output</* @Nullable */ List<DatabaseBackupSettingResponse>> databases;

    public Output</* @Nullable */ List<DatabaseBackupSettingResponse>> getDatabases() {
        return this.databases;
    }
    @OutputExport(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="storageAccountUrl", type=String.class, parameters={})
    private Output<String> storageAccountUrl;

    public Output<String> getStorageAccountUrl() {
        return this.storageAccountUrl;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WebAppBackupConfigurationSlot(String name, WebAppBackupConfigurationSlotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppBackupConfigurationSlot", name, args == null ? WebAppBackupConfigurationSlotArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebAppBackupConfigurationSlot(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:web:WebAppBackupConfigurationSlot", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:web/v20150801:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20160801:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20180201:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20181101:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20190801:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200601:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20200901:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201001:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20201201:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210101:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210115:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210201:WebAppBackupConfigurationSlot").build()),
                Input.of(Alias.builder().setType("azure-native:web/v20210301:WebAppBackupConfigurationSlot").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static WebAppBackupConfigurationSlot get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebAppBackupConfigurationSlot(name, id, options);
    }
}