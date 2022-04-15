// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.datapipelines_v1.PipelineArgs;
import io.pulumi.googlenative.datapipelines_v1.outputs.GoogleCloudDatapipelinesV1ScheduleSpecResponse;
import io.pulumi.googlenative.datapipelines_v1.outputs.GoogleCloudDatapipelinesV1WorkloadResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a pipeline. For a batch pipeline, you can pass scheduler information. Data Pipelines uses the scheduler information to create an internal scheduler that runs jobs periodically. If the internal scheduler is not configured, you can use RunPipeline to run jobs.
 * 
 */
@ResourceType(type="google-native:datapipelines/v1:Pipeline")
public class Pipeline extends io.pulumi.resources.CustomResource {
    /**
     * Immutable. The timestamp when the pipeline was initially created. Set by the Data Pipelines service.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Immutable. The timestamp when the pipeline was initially created. Set by the Data Pipelines service.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The display name of the pipeline. It can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), and underscores (_).
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the pipeline. It can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), and underscores (_).
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Number of jobs.
     * 
     */
    @Export(name="jobCount", type=Integer.class, parameters={})
    private Output<Integer> jobCount;

    /**
     * @return Number of jobs.
     * 
     */
    public Output<Integer> jobCount() {
        return this.jobCount;
    }
    /**
     * Immutable. The timestamp when the pipeline was last modified. Set by the Data Pipelines service.
     * 
     */
    @Export(name="lastUpdateTime", type=String.class, parameters={})
    private Output<String> lastUpdateTime;

    /**
     * @return Immutable. The timestamp when the pipeline was last modified. Set by the Data Pipelines service.
     * 
     */
    public Output<String> lastUpdateTime() {
        return this.lastUpdateTime;
    }
    /**
     * The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), and periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects). * `LOCATION_ID` is the canonical ID for the pipeline's location. The list of available locations can be obtained by calling `google.cloud.location.Locations.ListLocations`. Note that the Data Pipelines service is not available in all regions. It depends on Cloud Scheduler, an App Engine application, so it's only available in [App Engine regions](https://cloud.google.com/about/locations#region). * `PIPELINE_ID` is the ID of the pipeline. Must be unique for the selected project and location.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The pipeline name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/pipelines/PIPELINE_ID`. * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), and periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects). * `LOCATION_ID` is the canonical ID for the pipeline's location. The list of available locations can be obtained by calling `google.cloud.location.Locations.ListLocations`. Note that the Data Pipelines service is not available in all regions. It depends on Cloud Scheduler, an App Engine application, so it's only available in [App Engine regions](https://cloud.google.com/about/locations#region). * `PIPELINE_ID` is the ID of the pipeline. Must be unique for the selected project and location.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Immutable. The sources of the pipeline (for example, Dataplex). The keys and values are set by the corresponding sources during pipeline creation.
     * 
     */
    @Export(name="pipelineSources", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> pipelineSources;

    /**
     * @return Immutable. The sources of the pipeline (for example, Dataplex). The keys and values are set by the corresponding sources during pipeline creation.
     * 
     */
    public Output<Map<String,String>> pipelineSources() {
        return this.pipelineSources;
    }
    /**
     * Internal scheduling information for a pipeline. If this information is provided, periodic jobs will be created per the schedule. If not, users are responsible for creating jobs externally.
     * 
     */
    @Export(name="scheduleInfo", type=GoogleCloudDatapipelinesV1ScheduleSpecResponse.class, parameters={})
    private Output<GoogleCloudDatapipelinesV1ScheduleSpecResponse> scheduleInfo;

    /**
     * @return Internal scheduling information for a pipeline. If this information is provided, periodic jobs will be created per the schedule. If not, users are responsible for creating jobs externally.
     * 
     */
    public Output<GoogleCloudDatapipelinesV1ScheduleSpecResponse> scheduleInfo() {
        return this.scheduleInfo;
    }
    /**
     * Optional. A service account email to be used with the Cloud Scheduler job. If not specified, the default compute engine service account will be used.
     * 
     */
    @Export(name="schedulerServiceAccountEmail", type=String.class, parameters={})
    private Output<String> schedulerServiceAccountEmail;

    /**
     * @return Optional. A service account email to be used with the Cloud Scheduler job. If not specified, the default compute engine service account will be used.
     * 
     */
    public Output<String> schedulerServiceAccountEmail() {
        return this.schedulerServiceAccountEmail;
    }
    /**
     * The state of the pipeline. When the pipeline is created, the state is set to 'PIPELINE_STATE_ACTIVE' by default. State changes can be requested by setting the state to stopping, paused, or resuming. State cannot be changed through UpdatePipeline requests.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the pipeline. When the pipeline is created, the state is set to 'PIPELINE_STATE_ACTIVE' by default. State changes can be requested by setting the state to stopping, paused, or resuming. State cannot be changed through UpdatePipeline requests.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The type of the pipeline. This field affects the scheduling of the pipeline and the type of metrics to show for the pipeline.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the pipeline. This field affects the scheduling of the pipeline and the type of metrics to show for the pipeline.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Workload information for creating new jobs.
     * 
     */
    @Export(name="workload", type=GoogleCloudDatapipelinesV1WorkloadResponse.class, parameters={})
    private Output<GoogleCloudDatapipelinesV1WorkloadResponse> workload;

    /**
     * @return Workload information for creating new jobs.
     * 
     */
    public Output<GoogleCloudDatapipelinesV1WorkloadResponse> workload() {
        return this.workload;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datapipelines/v1:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:datapipelines/v1:Pipeline", name, null, makeResourceOptions(options, id));
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
    public static Pipeline get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, options);
    }
}
