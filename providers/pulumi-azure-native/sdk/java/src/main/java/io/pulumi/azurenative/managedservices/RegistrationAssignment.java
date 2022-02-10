// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.managedservices.RegistrationAssignmentArgs;
import io.pulumi.azurenative.managedservices.outputs.RegistrationAssignmentPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:managedservices:RegistrationAssignment")
public class RegistrationAssignment extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="properties", type=RegistrationAssignmentPropertiesResponse.class, parameters={})
    private Output<RegistrationAssignmentPropertiesResponse> properties;

    public Output<RegistrationAssignmentPropertiesResponse> getProperties() {
        return this.properties;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public RegistrationAssignment(String name, RegistrationAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managedservices:RegistrationAssignment", name, args == null ? RegistrationAssignmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RegistrationAssignment(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:managedservices:RegistrationAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:managedservices/v20180601preview:RegistrationAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:managedservices/v20190401preview:RegistrationAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:managedservices/v20190601:RegistrationAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:managedservices/v20190901:RegistrationAssignment").build()),
                Input.of(Alias.builder().setType("azure-native:managedservices/v20200201preview:RegistrationAssignment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static RegistrationAssignment get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegistrationAssignment(name, id, options);
    }
}