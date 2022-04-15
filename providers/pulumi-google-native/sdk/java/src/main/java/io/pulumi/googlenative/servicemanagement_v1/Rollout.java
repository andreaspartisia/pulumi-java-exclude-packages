// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.servicemanagement_v1.RolloutArgs;
import io.pulumi.googlenative.servicemanagement_v1.outputs.DeleteServiceStrategyResponse;
import io.pulumi.googlenative.servicemanagement_v1.outputs.TrafficPercentStrategyResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new service configuration rollout. Based on rollout, the Google Service Management will roll out the service configurations to different backend services. For example, the logging configuration will be pushed to Google Cloud Logging. Please note that any previous pending and running Rollouts and associated Operations will be automatically cancelled so that the latest Rollout will not be blocked by previous Rollouts. Only the 100 most recent (in any state) and the last 10 successful (if not already part of the set of 100 most recent) rollouts are kept for each service. The rest will be deleted eventually. Operation
 * Auto-naming is currently not supported for this resource.
 * Note - this resource's API doesn't support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:servicemanagement/v1:Rollout")
public class Rollout extends io.pulumi.resources.CustomResource {
    /**
     * Creation time of the rollout. Readonly.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation time of the rollout. Readonly.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
     */
    @Export(name="deleteServiceStrategy", type=DeleteServiceStrategyResponse.class, parameters={})
    private Output<DeleteServiceStrategyResponse> deleteServiceStrategy;

    /**
     * @return The strategy associated with a rollout to delete a `ManagedService`. Readonly.
     * 
     */
    public Output<DeleteServiceStrategyResponse> deleteServiceStrategy() {
        return this.deleteServiceStrategy;
    }
    /**
     * Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, '.', '_' and '-' are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where "date" is the create date in ISO 8601 format. "revision number" is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is '2016-02-16r1'
     * 
     */
    @Export(name="rolloutId", type=String.class, parameters={})
    private Output<String> rolloutId;

    /**
     * @return Optional. Unique identifier of this Rollout. Must be no longer than 63 characters and only lower case letters, digits, '.', '_' and '-' are allowed. If not specified by client, the server will generate one. The generated id will have the form of , where "date" is the create date in ISO 8601 format. "revision number" is a monotonically increasing positive number that is reset every day for each service. An example of the generated rollout_id is '2016-02-16r1'
     * 
     */
    public Output<String> rolloutId() {
        return this.rolloutId;
    }
    /**
     * The name of the service associated with this Rollout.
     * 
     */
    @Export(name="serviceName", type=String.class, parameters={})
    private Output<String> serviceName;

    /**
     * @return The name of the service associated with this Rollout.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }
    /**
     * The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of this rollout. Readonly. In case of a failed rollout, the system will automatically rollback to the current Rollout version. Readonly.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Google Service Control selects service configurations based on traffic percentage.
     * 
     */
    @Export(name="trafficPercentStrategy", type=TrafficPercentStrategyResponse.class, parameters={})
    private Output<TrafficPercentStrategyResponse> trafficPercentStrategy;

    /**
     * @return Google Service Control selects service configurations based on traffic percentage.
     * 
     */
    public Output<TrafficPercentStrategyResponse> trafficPercentStrategy() {
        return this.trafficPercentStrategy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rollout(String name) {
        this(name, RolloutArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rollout(String name, RolloutArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rollout(String name, RolloutArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:servicemanagement/v1:Rollout", name, args == null ? RolloutArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rollout(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:servicemanagement/v1:Rollout", name, null, makeResourceOptions(options, id));
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
    public static Rollout get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Rollout(name, id, options);
    }
}
