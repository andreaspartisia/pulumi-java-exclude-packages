// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventgrid.TopicArgs;
import com.pulumi.azure.eventgrid.inputs.TopicState;
import com.pulumi.azure.eventgrid.outputs.TopicIdentity;
import com.pulumi.azure.eventgrid.outputs.TopicInboundIpRule;
import com.pulumi.azure.eventgrid.outputs.TopicInputMappingDefaultValues;
import com.pulumi.azure.eventgrid.outputs.TopicInputMappingFields;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an EventGrid Topic
 * 
 * &gt; **Note:** at this time EventGrid Topic&#39;s are only available in a limited number of regions.
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
 *         var exampleTopic = new Topic(&#34;exampleTopic&#34;, TopicArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .tags(Map.of(&#34;environment&#34;, &#34;Production&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * EventGrid Topic&#39;s can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:eventgrid/topic:Topic topic1 /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.EventGrid/topics/topic1
 * ```
 * 
 */
@ResourceType(type="azure:eventgrid/topic:Topic")
public class Topic extends com.pulumi.resources.CustomResource {
    /**
     * The Endpoint associated with the EventGrid Topic.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The Endpoint associated with the EventGrid Topic.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * An `identity` block as defined below.
     * 
     */
    @Export(name="identity", type=TopicIdentity.class, parameters={})
    private Output</* @Nullable */ TopicIdentity> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Output<Optional<TopicIdentity>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * One or more `inbound_ip_rule` blocks as defined below.
     * 
     */
    @Export(name="inboundIpRules", type=List.class, parameters={TopicInboundIpRule.class})
    private Output</* @Nullable */ List<TopicInboundIpRule>> inboundIpRules;

    /**
     * @return One or more `inbound_ip_rule` blocks as defined below.
     * 
     */
    public Output<Optional<List<TopicInboundIpRule>>> inboundIpRules() {
        return Codegen.optional(this.inboundIpRules);
    }
    /**
     * A `input_mapping_default_values` block as defined below.
     * 
     */
    @Export(name="inputMappingDefaultValues", type=TopicInputMappingDefaultValues.class, parameters={})
    private Output</* @Nullable */ TopicInputMappingDefaultValues> inputMappingDefaultValues;

    /**
     * @return A `input_mapping_default_values` block as defined below.
     * 
     */
    public Output<Optional<TopicInputMappingDefaultValues>> inputMappingDefaultValues() {
        return Codegen.optional(this.inputMappingDefaultValues);
    }
    /**
     * A `input_mapping_fields` block as defined below.
     * 
     */
    @Export(name="inputMappingFields", type=TopicInputMappingFields.class, parameters={})
    private Output</* @Nullable */ TopicInputMappingFields> inputMappingFields;

    /**
     * @return A `input_mapping_fields` block as defined below.
     * 
     */
    public Output<Optional<TopicInputMappingFields>> inputMappingFields() {
        return Codegen.optional(this.inputMappingFields);
    }
    /**
     * Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="inputSchema", type=String.class, parameters={})
    private Output</* @Nullable */ String> inputSchema;

    /**
     * @return Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> inputSchema() {
        return Codegen.optional(this.inputSchema);
    }
    /**
     * Whether local authentication methods is enabled for the EventGrid Topic. Defaults to `true`.
     * 
     */
    @Export(name="localAuthEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> localAuthEnabled;

    /**
     * @return Whether local authentication methods is enabled for the EventGrid Topic. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> localAuthEnabled() {
        return Codegen.optional(this.localAuthEnabled);
    }
    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Specifies the name of the EventGrid Topic resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the EventGrid Topic resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Primary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    @Export(name="primaryAccessKey", type=String.class, parameters={})
    private Output<String> primaryAccessKey;

    /**
     * @return The Primary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    public Output<String> primaryAccessKey() {
        return this.primaryAccessKey;
    }
    /**
     * Whether or not public network access is allowed for this server. Defaults to `true`.
     * 
     */
    @Export(name="publicNetworkAccessEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether or not public network access is allowed for this server. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> publicNetworkAccessEnabled() {
        return Codegen.optional(this.publicNetworkAccessEnabled);
    }
    /**
     * The name of the resource group in which the EventGrid Topic exists. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventGrid Topic exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The Secondary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    @Export(name="secondaryAccessKey", type=String.class, parameters={})
    private Output<String> secondaryAccessKey;

    /**
     * @return The Secondary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    public Output<String> secondaryAccessKey() {
        return this.secondaryAccessKey;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Topic(String name) {
        this(name, TopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Topic(String name, TopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Topic(String name, TopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventgrid/topic:Topic", name, args == null ? TopicArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Topic(String name, Output<String> id, @Nullable TopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventgrid/topic:Topic", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure:eventhub/eventGridTopic:EventGridTopic").build())
            ))
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
    public static Topic get(String name, Output<String> id, @Nullable TopicState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Topic(name, id, state, options);
    }
}
