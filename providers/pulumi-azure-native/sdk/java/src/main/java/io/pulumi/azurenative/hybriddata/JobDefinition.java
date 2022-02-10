// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybriddata.JobDefinitionArgs;
import io.pulumi.azurenative.hybriddata.outputs.CustomerSecretResponse;
import io.pulumi.azurenative.hybriddata.outputs.ScheduleResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:hybriddata:JobDefinition")
public class JobDefinition extends io.pulumi.resources.CustomResource {
    @OutputExport(name="customerSecrets", type=List.class, parameters={CustomerSecretResponse.class})
    private Output</* @Nullable */ List<CustomerSecretResponse>> customerSecrets;

    public Output</* @Nullable */ List<CustomerSecretResponse>> getCustomerSecrets() {
        return this.customerSecrets;
    }
    @OutputExport(name="dataServiceInput", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> dataServiceInput;

    public Output</* @Nullable */ Object> getDataServiceInput() {
        return this.dataServiceInput;
    }
    @OutputExport(name="dataSinkId", type=String.class, parameters={})
    private Output<String> dataSinkId;

    public Output<String> getDataSinkId() {
        return this.dataSinkId;
    }
    @OutputExport(name="dataSourceId", type=String.class, parameters={})
    private Output<String> dataSourceId;

    public Output<String> getDataSourceId() {
        return this.dataSourceId;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedTime;

    public Output</* @Nullable */ String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="runLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> runLocation;

    public Output</* @Nullable */ String> getRunLocation() {
        return this.runLocation;
    }
    @OutputExport(name="schedules", type=List.class, parameters={ScheduleResponse.class})
    private Output</* @Nullable */ List<ScheduleResponse>> schedules;

    public Output</* @Nullable */ List<ScheduleResponse>> getSchedules() {
        return this.schedules;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="userConfirmation", type=String.class, parameters={})
    private Output</* @Nullable */ String> userConfirmation;

    public Output</* @Nullable */ String> getUserConfirmation() {
        return this.userConfirmation;
    }

    public JobDefinition(String name, JobDefinitionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:JobDefinition", name, args == null ? JobDefinitionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private JobDefinition(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:JobDefinition", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:hybriddata/v20160601:JobDefinition").build()),
                Input.of(Alias.builder().setType("azure-native:hybriddata/v20190601:JobDefinition").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static JobDefinition get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new JobDefinition(name, id, options);
    }
}