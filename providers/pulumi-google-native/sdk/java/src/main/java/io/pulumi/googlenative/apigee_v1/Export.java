// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.ExportArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Submit a data export job to be processed in the background. If the request is successful, the API returns a 201 status, a URI that can be used to retrieve the status of the export job, and the `state` value of "enqueued".
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:apigee/v1:Export")
public class Export extends io.pulumi.resources.CustomResource {
    /**
     * Time the export job was created.
     * 
     */
    @io.pulumi.core.annotations.Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return Time the export job was created.
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Name of the datastore that is the destination of the export job [datastore]
     * 
     */
    @io.pulumi.core.annotations.Export(name="datastoreName", type=String.class, parameters={})
    private Output<String> datastoreName;

    /**
     * @return Name of the datastore that is the destination of the export job [datastore]
     * 
     */
    public Output<String> datastoreName() {
        return this.datastoreName;
    }
    /**
     * Description of the export job.
     * 
     */
    @io.pulumi.core.annotations.Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Description of the export job.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Error is set when export fails
     * 
     */
    @io.pulumi.core.annotations.Export(name="error", type=String.class, parameters={})
    private Output<String> error;

    /**
     * @return Error is set when export fails
     * 
     */
    public Output<String> error() {
        return this.error;
    }
    /**
     * Execution time for this export job. If the job is still in progress, it will be set to the amount of time that has elapsed since`created`, in seconds. Else, it will set to (`updated` - `created`), in seconds.
     * 
     */
    @io.pulumi.core.annotations.Export(name="executionTime", type=String.class, parameters={})
    private Output<String> executionTime;

    /**
     * @return Execution time for this export job. If the job is still in progress, it will be set to the amount of time that has elapsed since`created`, in seconds. Else, it will set to (`updated` - `created`), in seconds.
     * 
     */
    public Output<String> executionTime() {
        return this.executionTime;
    }
    /**
     * Display name of the export job.
     * 
     */
    @io.pulumi.core.annotations.Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Display name of the export job.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Self link of the export job. A URI that can be used to retrieve the status of an export job. Example: `/organizations/myorg/environments/myenv/analytics/exports/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
     */
    @io.pulumi.core.annotations.Export(name="self", type=String.class, parameters={})
    private Output<String> self;

    /**
     * @return Self link of the export job. A URI that can be used to retrieve the status of an export job. Example: `/organizations/myorg/environments/myenv/analytics/exports/9cfc0d85-0f30-46d6-ae6f-318d0cb961bd`
     * 
     */
    public Output<String> self() {
        return this.self;
    }
    /**
     * Status of the export job. Valid values include `enqueued`, `running`, `completed`, and `failed`.
     * 
     */
    @io.pulumi.core.annotations.Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return Status of the export job. Valid values include `enqueued`, `running`, `completed`, and `failed`.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Time the export job was last updated.
     * 
     */
    @io.pulumi.core.annotations.Export(name="updated", type=String.class, parameters={})
    private Output<String> updated;

    /**
     * @return Time the export job was last updated.
     * 
     */
    public Output<String> updated() {
        return this.updated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Export(String name) {
        this(name, ExportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Export(String name, ExportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Export(String name, ExportArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Export", name, args == null ? ExportArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Export(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:Export", name, null, makeResourceOptions(options, id));
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
    public static Export get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Export(name, id, options);
    }
}
