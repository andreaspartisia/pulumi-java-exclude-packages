// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.synapse.LinkedServiceArgs;
import com.pulumi.azure.synapse.inputs.LinkedServiceState;
import com.pulumi.azure.synapse.outputs.LinkedServiceIntegrationRuntime;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Synapse Linked Service.
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
 *         var exampleAccount = new Account(&#34;exampleAccount&#34;, AccountArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .accountKind(&#34;BlobStorage&#34;)
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleDataLakeGen2Filesystem = new DataLakeGen2Filesystem(&#34;exampleDataLakeGen2Filesystem&#34;, DataLakeGen2FilesystemArgs.builder()        
 *             .storageAccountId(exampleAccount.getId())
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .storageDataLakeGen2FilesystemId(exampleDataLakeGen2Filesystem.getId())
 *             .sqlAdministratorLogin(&#34;sqladminuser&#34;)
 *             .sqlAdministratorLoginPassword(&#34;H@Sh1CoR3!&#34;)
 *             .managedVirtualNetworkEnabled(true)
 *             .build());
 * 
 *         var exampleFirewallRule = new FirewallRule(&#34;exampleFirewallRule&#34;, FirewallRuleArgs.builder()        
 *             .synapseWorkspaceId(exampleWorkspace.getId())
 *             .startIpAddress(&#34;0.0.0.0&#34;)
 *             .endIpAddress(&#34;255.255.255.255&#34;)
 *             .build());
 * 
 *         var exampleLinkedService = new LinkedService(&#34;exampleLinkedService&#34;, LinkedServiceArgs.builder()        
 *             .synapseWorkspaceId(exampleWorkspace.getId())
 *             .type(&#34;AzureBlobStorage&#34;)
 *             .typePropertiesJson(&#34;&#34;&#34;
 * {
 *   &#34;connectionString&#34;: &#34;%s&#34;
 * }
 * &#34;, azurerm_storage_account.getTest().getPrimary_connection_string()))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Synapse Linked Services can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:synapse/linkedService:LinkedService example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Synapse/workspaces/workspace1/linkedservices/linkedservice1
 * ```
 * 
 */
@ResourceType(type="azure:synapse/linkedService:LinkedService")
public class LinkedService extends com.pulumi.resources.CustomResource {
    /**
     * A map of additional properties to associate with the Synapse Linked Service.
     * 
     */
    @Export(name="additionalProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> additionalProperties;

    /**
     * @return A map of additional properties to associate with the Synapse Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> additionalProperties() {
        return Codegen.optional(this.additionalProperties);
    }
    /**
     * List of tags that can be used for describing the Synapse Linked Service.
     * 
     */
    @Export(name="annotations", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> annotations;

    /**
     * @return List of tags that can be used for describing the Synapse Linked Service.
     * 
     */
    public Output<Optional<List<String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * The description for the Synapse Linked Service.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description for the Synapse Linked Service.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A `integration_runtime` block as defined below.
     * 
     */
    @Export(name="integrationRuntime", type=LinkedServiceIntegrationRuntime.class, parameters={})
    private Output</* @Nullable */ LinkedServiceIntegrationRuntime> integrationRuntime;

    /**
     * @return A `integration_runtime` block as defined below.
     * 
     */
    public Output<Optional<LinkedServiceIntegrationRuntime>> integrationRuntime() {
        return Codegen.optional(this.integrationRuntime);
    }
    /**
     * The name which should be used for this Synapse Linked Service. Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Synapse Linked Service. Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of parameters to associate with the Synapse Linked Service.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> parameters;

    /**
     * @return A map of parameters to associate with the Synapse Linked Service.
     * 
     */
    public Output<Optional<Map<String,String>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * The Synapse Workspace ID in which to associate the Linked Service with. Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    @Export(name="synapseWorkspaceId", type=String.class, parameters={})
    private Output<String> synapseWorkspaceId;

    /**
     * @return The Synapse Workspace ID in which to associate the Linked Service with. Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    public Output<String> synapseWorkspaceId() {
        return this.synapseWorkspaceId;
    }
    /**
     * The type of data stores that will be connected to Synapse. For full list of supported data stores, please refer to [Azure Synapse connector](https://docs.microsoft.com/en-us/azure/data-factory/connector-overview). Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of data stores that will be connected to Synapse. For full list of supported data stores, please refer to [Azure Synapse connector](https://docs.microsoft.com/en-us/azure/data-factory/connector-overview). Changing this forces a new Synapse Linked Service to be created.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A JSON object that contains the properties of the Synapse Linked Service.
     * 
     */
    @Export(name="typePropertiesJson", type=String.class, parameters={})
    private Output<String> typePropertiesJson;

    /**
     * @return A JSON object that contains the properties of the Synapse Linked Service.
     * 
     */
    public Output<String> typePropertiesJson() {
        return this.typePropertiesJson;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkedService(String name) {
        this(name, LinkedServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkedService(String name, LinkedServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkedService(String name, LinkedServiceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/linkedService:LinkedService", name, args == null ? LinkedServiceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkedService(String name, Output<String> id, @Nullable LinkedServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/linkedService:LinkedService", name, state, makeResourceOptions(options, id));
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
    public static LinkedService get(String name, Output<String> id, @Nullable LinkedServiceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkedService(name, id, state, options);
    }
}
