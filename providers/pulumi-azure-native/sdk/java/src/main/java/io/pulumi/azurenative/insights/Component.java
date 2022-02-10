// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.ComponentArgs;
import io.pulumi.azurenative.insights.outputs.PrivateLinkScopedResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:insights:Component")
public class Component extends io.pulumi.resources.CustomResource {
    @OutputExport(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    public Output<String> getAppId() {
        return this.appId;
    }
    @OutputExport(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    public Output<String> getApplicationId() {
        return this.applicationId;
    }
    @OutputExport(name="applicationType", type=String.class, parameters={})
    private Output<String> applicationType;

    public Output<String> getApplicationType() {
        return this.applicationType;
    }
    @OutputExport(name="connectionString", type=String.class, parameters={})
    private Output<String> connectionString;

    public Output<String> getConnectionString() {
        return this.connectionString;
    }
    @OutputExport(name="creationDate", type=String.class, parameters={})
    private Output<String> creationDate;

    public Output<String> getCreationDate() {
        return this.creationDate;
    }
    @OutputExport(name="disableIpMasking", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disableIpMasking;

    public Output</* @Nullable */ Boolean> getDisableIpMasking() {
        return this.disableIpMasking;
    }
    @OutputExport(name="flowType", type=String.class, parameters={})
    private Output</* @Nullable */ String> flowType;

    public Output</* @Nullable */ String> getFlowType() {
        return this.flowType;
    }
    @OutputExport(name="hockeyAppId", type=String.class, parameters={})
    private Output</* @Nullable */ String> hockeyAppId;

    public Output</* @Nullable */ String> getHockeyAppId() {
        return this.hockeyAppId;
    }
    @OutputExport(name="hockeyAppToken", type=String.class, parameters={})
    private Output<String> hockeyAppToken;

    public Output<String> getHockeyAppToken() {
        return this.hockeyAppToken;
    }
    @OutputExport(name="immediatePurgeDataOn30Days", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> immediatePurgeDataOn30Days;

    public Output</* @Nullable */ Boolean> getImmediatePurgeDataOn30Days() {
        return this.immediatePurgeDataOn30Days;
    }
    @OutputExport(name="ingestionMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> ingestionMode;

    public Output</* @Nullable */ String> getIngestionMode() {
        return this.ingestionMode;
    }
    @OutputExport(name="instrumentationKey", type=String.class, parameters={})
    private Output<String> instrumentationKey;

    public Output<String> getInstrumentationKey() {
        return this.instrumentationKey;
    }
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
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
    @OutputExport(name="privateLinkScopedResources", type=List.class, parameters={PrivateLinkScopedResourceResponse.class})
    private Output<List<PrivateLinkScopedResourceResponse>> privateLinkScopedResources;

    public Output<List<PrivateLinkScopedResourceResponse>> getPrivateLinkScopedResources() {
        return this.privateLinkScopedResources;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="requestSource", type=String.class, parameters={})
    private Output</* @Nullable */ String> requestSource;

    public Output</* @Nullable */ String> getRequestSource() {
        return this.requestSource;
    }
    @OutputExport(name="retentionInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> retentionInDays;

    public Output</* @Nullable */ Integer> getRetentionInDays() {
        return this.retentionInDays;
    }
    @OutputExport(name="samplingPercentage", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> samplingPercentage;

    public Output</* @Nullable */ Double> getSamplingPercentage() {
        return this.samplingPercentage;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    public Output<String> getTenantId() {
        return this.tenantId;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Component(String name, ComponentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:Component", name, args == null ? ComponentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Component(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:Component", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20150501:Component").build()),
                Input.of(Alias.builder().setType("azure-native:insights/v20180501preview:Component").build()),
                Input.of(Alias.builder().setType("azure-native:insights/v20200202:Component").build()),
                Input.of(Alias.builder().setType("azure-native:insights/v20200202preview:Component").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Component get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Component(name, id, options);
    }
}