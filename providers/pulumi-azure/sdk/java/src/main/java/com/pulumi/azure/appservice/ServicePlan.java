// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.ServicePlanArgs;
import com.pulumi.azure.appservice.inputs.ServicePlanState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an App Service: Service Plan.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleServicePlan = new ServicePlan(&#34;exampleServicePlan&#34;, ServicePlanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(&#34;West Europe&#34;)
 *             .osType(&#34;Linux&#34;)
 *             .skuName(&#34;P1v2&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * AppServices can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/servicePlan:ServicePlan example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/serverfarms/farm1
 * ```
 * 
 */
@ResourceType(type="azure:appservice/servicePlan:ServicePlan")
public class ServicePlan extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the App Service Environment to create this Service Plan in.
     * 
     */
    @Export(name="appServiceEnvironmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> appServiceEnvironmentId;

    /**
     * @return The ID of the App Service Environment to create this Service Plan in.
     * 
     */
    public Output<Optional<String>> appServiceEnvironmentId() {
        return Codegen.optional(this.appServiceEnvironmentId);
    }
    /**
     * A string representing the Kind of Service Plan.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return A string representing the Kind of Service Plan.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The Azure Region where the Service Plan should exist. Changing this forces a new AppService to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Service Plan should exist. Changing this forces a new AppService to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The maximum number of workers to use in an Elastic SKU Plan. Cannot be set unless using an Elastic SKU.
     * 
     */
    @Export(name="maximumElasticWorkerCount", type=Integer.class, parameters={})
    private Output<Integer> maximumElasticWorkerCount;

    /**
     * @return The maximum number of workers to use in an Elastic SKU Plan. Cannot be set unless using an Elastic SKU.
     * 
     */
    public Output<Integer> maximumElasticWorkerCount() {
        return this.maximumElasticWorkerCount;
    }
    /**
     * The name which should be used for this Service Plan. Changing this forces a new AppService to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Service Plan. Changing this forces a new AppService to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The O/S type for the App Services to be hosted in this plan. Possible values include `Windows`, `Linux`, and `WindowsContainer`.
     * 
     */
    @Export(name="osType", type=String.class, parameters={})
    private Output<String> osType;

    /**
     * @return The O/S type for the App Services to be hosted in this plan. Possible values include `Windows`, `Linux`, and `WindowsContainer`.
     * 
     */
    public Output<String> osType() {
        return this.osType;
    }
    /**
     * Should Per Site Scaling be enabled. Defaults to `false`.
     * 
     */
    @Export(name="perSiteScalingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> perSiteScalingEnabled;

    /**
     * @return Should Per Site Scaling be enabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> perSiteScalingEnabled() {
        return Codegen.optional(this.perSiteScalingEnabled);
    }
    /**
     * Whether this is a reserved Service Plan Type. `true` if `os_type` is `Linux`, otherwise `false`.
     * 
     */
    @Export(name="reserved", type=Boolean.class, parameters={})
    private Output<Boolean> reserved;

    /**
     * @return Whether this is a reserved Service Plan Type. `true` if `os_type` is `Linux`, otherwise `false`.
     * 
     */
    public Output<Boolean> reserved() {
        return this.reserved;
    }
    /**
     * The name of the Resource Group where the AppService should exist. Changing this forces a new AppService to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the AppService should exist. Changing this forces a new AppService to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The SKU for the plan. Possible values include `B1`, `B2`, `B3`, `D1`, `F1`, `FREE`, `I1`, `I2`, `I3`, `I1v2`, `I2v2`, `I3v2`, `P1v2`, `P2v2`, `P3v2`, `P1v3`, `P2v3`, `P3v3`, `S1`, `S2`, `S3`, `SHARED`, `EP1`, `EP2`, `EP3`, `WS1`, `WS2`, and `WS3`.
     * 
     */
    @Export(name="skuName", type=String.class, parameters={})
    private Output<String> skuName;

    /**
     * @return The SKU for the plan. Possible values include `B1`, `B2`, `B3`, `D1`, `F1`, `FREE`, `I1`, `I2`, `I3`, `I1v2`, `I2v2`, `I3v2`, `P1v2`, `P2v2`, `P3v2`, `P1v3`, `P2v3`, `P3v3`, `S1`, `S2`, `S3`, `SHARED`, `EP1`, `EP2`, `EP3`, `WS1`, `WS2`, and `WS3`.
     * 
     */
    public Output<String> skuName() {
        return this.skuName;
    }
    /**
     * A mapping of tags which should be assigned to the AppService.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the AppService.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The number of Workers (instances) to be allocated.
     * 
     */
    @Export(name="workerCount", type=Integer.class, parameters={})
    private Output<Integer> workerCount;

    /**
     * @return The number of Workers (instances) to be allocated.
     * 
     */
    public Output<Integer> workerCount() {
        return this.workerCount;
    }
    /**
     * Should the Service Plan balance across Availability Zones in the region. Defaults to `false`.
     * 
     */
    @Export(name="zoneBalancingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> zoneBalancingEnabled;

    /**
     * @return Should the Service Plan balance across Availability Zones in the region. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> zoneBalancingEnabled() {
        return Codegen.optional(this.zoneBalancingEnabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicePlan(String name) {
        this(name, ServicePlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicePlan(String name, ServicePlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePlan(String name, ServicePlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/servicePlan:ServicePlan", name, args == null ? ServicePlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServicePlan(String name, Output<String> id, @Nullable ServicePlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/servicePlan:ServicePlan", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static ServicePlan get(String name, Output<String> id, @Nullable ServicePlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServicePlan(name, id, state, options);
    }
}
