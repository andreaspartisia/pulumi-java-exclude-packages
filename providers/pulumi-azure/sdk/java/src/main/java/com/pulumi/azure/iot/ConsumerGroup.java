// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.iot.ConsumerGroupArgs;
import com.pulumi.azure.iot.inputs.ConsumerGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Consumer Group within an IotHub
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
 *         var exampleIoTHub = new IoTHub(&#34;exampleIoTHub&#34;, IoTHubArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .sku(IoTHubSku.builder()
 *                 .name(&#34;S1&#34;)
 *                 .capacity(&#34;1&#34;)
 *                 .build())
 *             .tags(Map.of(&#34;purpose&#34;, &#34;testing&#34;))
 *             .build());
 * 
 *         var exampleConsumerGroup = new ConsumerGroup(&#34;exampleConsumerGroup&#34;, ConsumerGroupArgs.builder()        
 *             .iothubName(exampleIoTHub.getName())
 *             .eventhubEndpointName(&#34;events&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * IoTHub Consumer Groups can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:iot/consumerGroup:ConsumerGroup group1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/IotHubs/hub1/eventHubEndpoints/events/ConsumerGroups/group1
 * ```
 * 
 */
@ResourceType(type="azure:iot/consumerGroup:ConsumerGroup")
public class ConsumerGroup extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Event Hub-compatible endpoint in the IoT hub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="eventhubEndpointName", type=String.class, parameters={})
    private Output<String> eventhubEndpointName;

    /**
     * @return The name of the Event Hub-compatible endpoint in the IoT hub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> eventhubEndpointName() {
        return this.eventhubEndpointName;
    }
    /**
     * The name of the IoT Hub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="iothubName", type=String.class, parameters={})
    private Output<String> iothubName;

    /**
     * @return The name of the IoT Hub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> iothubName() {
        return this.iothubName;
    }
    /**
     * The name of this Consumer Group. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of this Consumer Group. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group that contains the IoT hub. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the IoT hub. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConsumerGroup(String name) {
        this(name, ConsumerGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConsumerGroup(String name, ConsumerGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsumerGroup(String name, ConsumerGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/consumerGroup:ConsumerGroup", name, args == null ? ConsumerGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConsumerGroup(String name, Output<String> id, @Nullable ConsumerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/consumerGroup:ConsumerGroup", name, state, makeResourceOptions(options, id));
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
    public static ConsumerGroup get(String name, Output<String> id, @Nullable ConsumerGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConsumerGroup(name, id, state, options);
    }
}
