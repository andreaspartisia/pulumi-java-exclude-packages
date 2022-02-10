// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.migrate.MoveResourceArgs;
import io.pulumi.azurenative.migrate.outputs.MoveResourcePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:migrate:MoveResource")
public class MoveResource extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=MoveResourcePropertiesResponse.class, parameters={})
    private Output<MoveResourcePropertiesResponse> properties;

    public Output<MoveResourcePropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public MoveResource(String name, MoveResourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:MoveResource", name, args == null ? MoveResourceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MoveResource(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:migrate:MoveResource", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:migrate/v20191001preview:MoveResource").build()),
                Input.of(Alias.builder().setType("azure-native:migrate/v20210101:MoveResource").build()),
                Input.of(Alias.builder().setType("azure-native:migrate/v20210801:MoveResource").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static MoveResource get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MoveResource(name, id, options);
    }
}