// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.SubscriptionDiagnosticSettingArgs;
import io.pulumi.azurenative.insights.outputs.SubscriptionLogSettingsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:insights:SubscriptionDiagnosticSetting")
public class SubscriptionDiagnosticSetting extends io.pulumi.resources.CustomResource {
    @OutputExport(name="eventHubAuthorizationRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubAuthorizationRuleId;

    public Output</* @Nullable */ String> getEventHubAuthorizationRuleId() {
        return this.eventHubAuthorizationRuleId;
    }
    @OutputExport(name="eventHubName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubName;

    public Output</* @Nullable */ String> getEventHubName() {
        return this.eventHubName;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    @OutputExport(name="logs", type=List.class, parameters={SubscriptionLogSettingsResponse.class})
    private Output</* @Nullable */ List<SubscriptionLogSettingsResponse>> logs;

    public Output</* @Nullable */ List<SubscriptionLogSettingsResponse>> getLogs() {
        return this.logs;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="serviceBusRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusRuleId;

    public Output</* @Nullable */ String> getServiceBusRuleId() {
        return this.serviceBusRuleId;
    }
    @OutputExport(name="storageAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountId;

    public Output</* @Nullable */ String> getStorageAccountId() {
        return this.storageAccountId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="workspaceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> workspaceId;

    public Output</* @Nullable */ String> getWorkspaceId() {
        return this.workspaceId;
    }

    public SubscriptionDiagnosticSetting(String name, @Nullable SubscriptionDiagnosticSettingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:SubscriptionDiagnosticSetting", name, args == null ? SubscriptionDiagnosticSettingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubscriptionDiagnosticSetting(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:SubscriptionDiagnosticSetting", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20170501preview:SubscriptionDiagnosticSetting").build()),
                Input.of(Alias.builder().setType("azure-native:insights/v20210501preview:SubscriptionDiagnosticSetting").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static SubscriptionDiagnosticSetting get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubscriptionDiagnosticSetting(name, id, options);
    }
}