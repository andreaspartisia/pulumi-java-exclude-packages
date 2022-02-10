// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.QueueAuthorizationRuleArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:servicebus:QueueAuthorizationRule")
public class QueueAuthorizationRule extends io.pulumi.resources.CustomResource {
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="rights", type=List.class, parameters={String.class})
    private Output<List<String>> rights;

    public Output<List<String>> getRights() {
        return this.rights;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public QueueAuthorizationRule(String name, QueueAuthorizationRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:QueueAuthorizationRule", name, args == null ? QueueAuthorizationRuleArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private QueueAuthorizationRule(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:servicebus:QueueAuthorizationRule", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:servicebus/v20140901:QueueAuthorizationRule").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20150801:QueueAuthorizationRule").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20170401:QueueAuthorizationRule").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20180101preview:QueueAuthorizationRule").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20210101preview:QueueAuthorizationRule").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20210601preview:QueueAuthorizationRule").build()),
                Input.of(Alias.builder().setType("azure-native:servicebus/v20211101:QueueAuthorizationRule").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static QueueAuthorizationRule get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new QueueAuthorizationRule(name, id, options);
    }
}