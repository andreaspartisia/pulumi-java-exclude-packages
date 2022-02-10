// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.EnvgroupArgs;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="google-native:apigee/v1:Envgroup")
public class Envgroup extends io.pulumi.resources.CustomResource {
    @OutputExport(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt;
    }
    @OutputExport(name="hostnames", type=List.class, parameters={String.class})
    private Output<List<String>> hostnames;

    public Output<List<String>> getHostnames() {
        return this.hostnames;
    }
    @OutputExport(name="lastModifiedAt", type=String.class, parameters={})
    private Output<String> lastModifiedAt;

    public Output<String> getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> getState() {
        return this.state;
    }

    public Envgroup(String name, EnvgroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Envgroup", name, args == null ? EnvgroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Envgroup(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Envgroup", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Envgroup get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Envgroup(name, id, options);
    }
}