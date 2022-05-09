// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.appservice.WebAppHybridConnectionArgs;
import com.pulumi.azure.appservice.inputs.WebAppHybridConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Web App Hybrid Connection.
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
 *         var test = new ServicePlan(&#34;test&#34;, ServicePlanArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .osType(&#34;Windows&#34;)
 *             .skuName(&#34;S1&#34;)
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .skuName(&#34;Standard&#34;)
 *             .build());
 * 
 *         var exampleHybridConnection = new HybridConnection(&#34;exampleHybridConnection&#34;, HybridConnectionArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .relayNamespaceName(exampleNamespace.getName())
 *             .build());
 * 
 *         var exampleWindowsWebApp = new WindowsWebApp(&#34;exampleWindowsWebApp&#34;, WindowsWebAppArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .servicePlanId(azurerm_service_plan.getExample().getId())
 *             .siteConfig()
 *             .build());
 * 
 *         var exampleWebAppHybridConnection = new WebAppHybridConnection(&#34;exampleWebAppHybridConnection&#34;, WebAppHybridConnectionArgs.builder()        
 *             .webAppId(exampleWindowsWebApp.getId())
 *             .relayId(exampleHybridConnection.getId())
 *             .hostname(&#34;myhostname.example&#34;)
 *             .port(8081)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * a Web App Hybrid Connection can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:appservice/webAppHybridConnection:WebAppHybridConnection example &#34;/subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Web/sites/site1/hybridConnectionNamespaces/hybridConnectionNamespace1/relays/relay1&#34;
 * ```
 * 
 */
@ResourceType(type="azure:appservice/webAppHybridConnection:WebAppHybridConnection")
public class WebAppHybridConnection extends com.pulumi.resources.CustomResource {
    /**
     * The hostname of the endpoint.
     * 
     */
    @Export(name="hostname", type=String.class, parameters={})
    private Output<String> hostname;

    /**
     * @return The hostname of the endpoint.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * The name of the Relay Namespace.
     * 
     */
    @Export(name="namespaceName", type=String.class, parameters={})
    private Output<String> namespaceName;

    /**
     * @return The name of the Relay Namespace.
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * The port to use for the endpoint.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The port to use for the endpoint.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The ID of the Relay Hybrid Connection to use. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="relayId", type=String.class, parameters={})
    private Output<String> relayId;

    /**
     * @return The ID of the Relay Hybrid Connection to use. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> relayId() {
        return this.relayId;
    }
    /**
     * The name of the Relay in use.
     * 
     */
    @Export(name="relayName", type=String.class, parameters={})
    private Output<String> relayName;

    /**
     * @return The name of the Relay in use.
     * 
     */
    public Output<String> relayName() {
        return this.relayName;
    }
    /**
     * The name of the Relay key with `Send` permission to use. Defaults to `RootManageSharedAccessKey`
     * 
     */
    @Export(name="sendKeyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> sendKeyName;

    /**
     * @return The name of the Relay key with `Send` permission to use. Defaults to `RootManageSharedAccessKey`
     * 
     */
    public Output<Optional<String>> sendKeyName() {
        return Codegen.optional(this.sendKeyName);
    }
    /**
     * The Primary Access Key for the `send_key_name`
     * 
     */
    @Export(name="sendKeyValue", type=String.class, parameters={})
    private Output<String> sendKeyValue;

    /**
     * @return The Primary Access Key for the `send_key_name`
     * 
     */
    public Output<String> sendKeyValue() {
        return this.sendKeyValue;
    }
    /**
     * The Service Bus Namespace.
     * 
     */
    @Export(name="serviceBusNamespace", type=String.class, parameters={})
    private Output<String> serviceBusNamespace;

    /**
     * @return The Service Bus Namespace.
     * 
     */
    public Output<String> serviceBusNamespace() {
        return this.serviceBusNamespace;
    }
    /**
     * The suffix for the endpoint.
     * 
     */
    @Export(name="serviceBusSuffix", type=String.class, parameters={})
    private Output<String> serviceBusSuffix;

    /**
     * @return The suffix for the endpoint.
     * 
     */
    public Output<String> serviceBusSuffix() {
        return this.serviceBusSuffix;
    }
    /**
     * The ID of the Web App for this Hybrid Connection. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="webAppId", type=String.class, parameters={})
    private Output<String> webAppId;

    /**
     * @return The ID of the Web App for this Hybrid Connection. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> webAppId() {
        return this.webAppId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAppHybridConnection(String name) {
        this(name, WebAppHybridConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAppHybridConnection(String name, WebAppHybridConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAppHybridConnection(String name, WebAppHybridConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/webAppHybridConnection:WebAppHybridConnection", name, args == null ? WebAppHybridConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAppHybridConnection(String name, Output<String> id, @Nullable WebAppHybridConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:appservice/webAppHybridConnection:WebAppHybridConnection", name, state, makeResourceOptions(options, id));
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
    public static WebAppHybridConnection get(String name, Output<String> id, @Nullable WebAppHybridConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAppHybridConnection(name, id, state, options);
    }
}
