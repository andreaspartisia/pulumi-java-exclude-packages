// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.logging.ProjectExclusionArgs;
import io.pulumi.gcp.logging.inputs.ProjectExclusionState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a project-level logging exclusion. For more information see:
 * 
 * * [API documentation](https://cloud.google.com/logging/docs/reference/v2/rest/v2/projects.exclusions)
 * * How-to Guides
 *     * [Excluding Logs](https://cloud.google.com/logging/docs/exclusions)
 * 
 * > You can specify exclusions for log sinks created by the provider by using the exclusions field of `gcp.logging.ProjectSink`
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Project-level logging exclusions can be imported using their URI, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:logging/projectExclusion:ProjectExclusion my_exclusion projects/my-project/exclusions/my-exclusion
 * ```
 * 
 */
@ResourceType(type="gcp:logging/projectExclusion:ProjectExclusion")
public class ProjectExclusion extends io.pulumi.resources.CustomResource {
    /**
     * A human-readable description.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    @OutputExport(name="disabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    public Output</* @Nullable */ Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    @OutputExport(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    public Output<String> getFilter() {
        return this.filter;
    }
    /**
     * The name of the logging exclusion.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the logging exclusion.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The project to create the exclusion in. If omitted, the project associated with the provider is
     * used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The project to create the exclusion in. If omitted, the project associated with the provider is
     * used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ProjectExclusion(String name, ProjectExclusionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/projectExclusion:ProjectExclusion", name, args == null ? ProjectExclusionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ProjectExclusion(String name, Input<String> id, @Nullable ProjectExclusionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:logging/projectExclusion:ProjectExclusion", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ProjectExclusion get(String name, Input<String> id, @Nullable ProjectExclusionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ProjectExclusion(name, id, state, options);
    }
}