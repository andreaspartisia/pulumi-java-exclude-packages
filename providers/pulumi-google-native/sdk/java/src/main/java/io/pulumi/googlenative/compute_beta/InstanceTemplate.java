// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_beta.InstanceTemplateArgs;
import io.pulumi.googlenative.compute_beta.outputs.InstancePropertiesResponse;
import io.pulumi.googlenative.compute_beta.outputs.SourceInstanceParamsResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an instance template in the specified project using the data that is included in the request. If you are creating a new template to update an existing instance group, your new instance template must use the same network or, if applicable, the same subnetwork as the original template.
 * 
 */
@ResourceType(type="google-native:compute/beta:InstanceTemplate")
public class InstanceTemplate extends io.pulumi.resources.CustomResource {
    /**
     * The creation timestamp for this instance template in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return The creation timestamp for this instance template in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The resource type, which is always compute#instanceTemplate for instance templates.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The resource type, which is always compute#instanceTemplate for instance templates.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The instance properties for this instance template.
     * 
     */
    @Export(name="properties", type=InstancePropertiesResponse.class, parameters={})
    private Output<InstancePropertiesResponse> properties;

    /**
     * @return The instance properties for this instance template.
     * 
     */
    public Output<InstancePropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The URL for this instance template. The server defines this URL.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URL for this instance template. The server defines this URL.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    @Export(name="sourceInstance", type=String.class, parameters={})
    private Output<String> sourceInstance;

    /**
     * @return The source instance used to create the template. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instances/instance - projects/project/zones/zone/instances/instance
     * 
     */
    public Output<String> sourceInstance() {
        return this.sourceInstance;
    }
    /**
     * The source instance params to use to create this instance template.
     * 
     */
    @Export(name="sourceInstanceParams", type=SourceInstanceParamsResponse.class, parameters={})
    private Output<SourceInstanceParamsResponse> sourceInstanceParams;

    /**
     * @return The source instance params to use to create this instance template.
     * 
     */
    public Output<SourceInstanceParamsResponse> sourceInstanceParams() {
        return this.sourceInstanceParams;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceTemplate(String name) {
        this(name, InstanceTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceTemplate(String name, @Nullable InstanceTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceTemplate(String name, @Nullable InstanceTemplateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:InstanceTemplate", name, args == null ? InstanceTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceTemplate(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/beta:InstanceTemplate", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceTemplate get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new InstanceTemplate(name, id, options);
    }
}
