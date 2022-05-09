// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.bot.ChannelWebChatArgs;
import com.pulumi.azure.bot.inputs.ChannelWebChatState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Web Chat integration for a Bot Channel
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
 *         final var current = Output.of(CoreFunctions.getClientConfig());
 * 
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleChannelsRegistration = new ChannelsRegistration(&#34;exampleChannelsRegistration&#34;, ChannelsRegistrationArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(&#34;F0&#34;)
 *             .microsoftAppId(current.apply(getClientConfigResult -&gt; getClientConfigResult.getClientId()))
 *             .build());
 * 
 *         var exampleChannelWebChat = new ChannelWebChat(&#34;exampleChannelWebChat&#34;, ChannelWebChatArgs.builder()        
 *             .botName(exampleChannelsRegistration.getName())
 *             .location(exampleChannelsRegistration.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .siteNames(&#34;TestSite&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Web Chat Channels can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:bot/channelWebChat:ChannelWebChat example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.BotService/botServices/botService1/channels/WebChatChannel
 * ```
 * 
 */
@ResourceType(type="azure:bot/channelWebChat:ChannelWebChat")
public class ChannelWebChat extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="botName", type=String.class, parameters={})
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
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
     * The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the Web Chat Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A list of Web Chat Site names.
     * 
     */
    @Export(name="siteNames", type=List.class, parameters={String.class})
    private Output<List<String>> siteNames;

    /**
     * @return A list of Web Chat Site names.
     * 
     */
    public Output<List<String>> siteNames() {
        return this.siteNames;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ChannelWebChat(String name) {
        this(name, ChannelWebChatArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ChannelWebChat(String name, ChannelWebChatArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ChannelWebChat(String name, ChannelWebChatArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/channelWebChat:ChannelWebChat", name, args == null ? ChannelWebChatArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ChannelWebChat(String name, Output<String> id, @Nullable ChannelWebChatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:bot/channelWebChat:ChannelWebChat", name, state, makeResourceOptions(options, id));
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
    public static ChannelWebChat get(String name, Output<String> id, @Nullable ChannelWebChatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ChannelWebChat(name, id, state, options);
    }
}
