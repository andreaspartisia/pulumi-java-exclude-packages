// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.synapse.IntegrationRuntimeSelfHostedArgs;
import com.pulumi.azure.synapse.inputs.IntegrationRuntimeSelfHostedState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Synapse Self-hosted Integration Runtime.
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
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .accountTier(&#34;Standard&#34;)
 *             .accountReplicationType(&#34;LRS&#34;)
 *             .build());
 * 
 *         var exampleContainer = new Container(&#34;exampleContainer&#34;, ContainerArgs.builder()        
 *             .storageAccountName(exampleAccount.getName())
 *             .containerAccessType(&#34;private&#34;)
 *             .build());
 * 
 *         var exampleDataLakeGen2Filesystem = new DataLakeGen2Filesystem(&#34;exampleDataLakeGen2Filesystem&#34;, DataLakeGen2FilesystemArgs.builder()        
 *             .storageAccountId(exampleAccount.getId())
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
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
 *         var exampleIntegrationRuntimeSelfHosted = new IntegrationRuntimeSelfHosted(&#34;exampleIntegrationRuntimeSelfHosted&#34;, IntegrationRuntimeSelfHostedArgs.builder()        
 *             .synapseWorkspaceId(exampleWorkspace.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Synapse Self-hosted Integration Runtimes can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted example /subscriptions/12345678-1234-9876-4563-123456789012/resourceGroups/resGroup1/providers/Microsoft.Synapse/workspaces/workspace1/integrationruntimes/IntegrationRuntime1
 * ```
 * 
 */
@ResourceType(type="azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted")
public class IntegrationRuntimeSelfHosted extends com.pulumi.resources.CustomResource {
    /**
     * The primary integration runtime authentication key.
     * 
     */
    @Export(name="authorizationKeyPrimary", type=String.class, parameters={})
    private Output<String> authorizationKeyPrimary;

    /**
     * @return The primary integration runtime authentication key.
     * 
     */
    public Output<String> authorizationKeyPrimary() {
        return this.authorizationKeyPrimary;
    }
    /**
     * The secondary integration runtime authentication key.
     * 
     */
    @Export(name="authorizationKeySecondary", type=String.class, parameters={})
    private Output<String> authorizationKeySecondary;

    /**
     * @return The secondary integration runtime authentication key.
     * 
     */
    public Output<String> authorizationKeySecondary() {
        return this.authorizationKeySecondary;
    }
    /**
     * Integration runtime description.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Integration runtime description.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Synapse Self-hosted Integration Runtime. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     * 
     */
    @Export(name="synapseWorkspaceId", type=String.class, parameters={})
    private Output<String> synapseWorkspaceId;

    /**
     * @return The Synapse Workspace ID in which to associate the Integration Runtime with. Changing this forces a new Synapse Self-hosted Integration Runtime to be created.
     * 
     */
    public Output<String> synapseWorkspaceId() {
        return this.synapseWorkspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationRuntimeSelfHosted(String name) {
        this(name, IntegrationRuntimeSelfHostedArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationRuntimeSelfHosted(String name, IntegrationRuntimeSelfHostedArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationRuntimeSelfHosted(String name, IntegrationRuntimeSelfHostedArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted", name, args == null ? IntegrationRuntimeSelfHostedArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationRuntimeSelfHosted(String name, Output<String> id, @Nullable IntegrationRuntimeSelfHostedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:synapse/integrationRuntimeSelfHosted:IntegrationRuntimeSelfHosted", name, state, makeResourceOptions(options, id));
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
    public static IntegrationRuntimeSelfHosted get(String name, Output<String> id, @Nullable IntegrationRuntimeSelfHostedState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationRuntimeSelfHosted(name, id, state, options);
    }
}
