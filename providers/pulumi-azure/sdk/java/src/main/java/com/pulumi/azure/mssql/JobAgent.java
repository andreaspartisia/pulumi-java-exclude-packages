// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.mssql.JobAgentArgs;
import com.pulumi.azure.mssql.inputs.JobAgentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Elastic Job Agent.
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
 *             .location(&#34;northeurope&#34;)
 *             .build());
 * 
 *         var exampleServer = new Server(&#34;exampleServer&#34;, ServerArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .version(&#34;12.0&#34;)
 *             .administratorLogin(&#34;4dm1n157r470r&#34;)
 *             .administratorLoginPassword(&#34;4-v3ry-53cr37-p455w0rd&#34;)
 *             .build());
 * 
 *         var exampleDatabase = new Database(&#34;exampleDatabase&#34;, DatabaseArgs.builder()        
 *             .serverId(exampleServer.getId())
 *             .collation(&#34;SQL_Latin1_General_CP1_CI_AS&#34;)
 *             .skuName(&#34;S1&#34;)
 *             .build());
 * 
 *         var exampleJobAgent = new JobAgent(&#34;exampleJobAgent&#34;, JobAgentArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .databaseId(exampleDatabase.getId())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Elastic Job Agents can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:mssql/jobAgent:JobAgent example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Sql/servers/myserver1/jobAgents/myjobagent1
 * ```
 * 
 */
@ResourceType(type="azure:mssql/jobAgent:JobAgent")
public class JobAgent extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the database to store metadata for the Elastic Job Agent. Changing this forces a new Elastic Job Agent to be created.
     * 
     */
    @Export(name="databaseId", type=String.class, parameters={})
    private Output<String> databaseId;

    /**
     * @return The ID of the database to store metadata for the Elastic Job Agent. Changing this forces a new Elastic Job Agent to be created.
     * 
     */
    public Output<String> databaseId() {
        return this.databaseId;
    }
    /**
     * The Azure Region where the Elastic Job Agent should exist. Changing this forces a new Elastic Job Agent to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Elastic Job Agent should exist. Changing this forces a new Elastic Job Agent to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Elastic Job Agent. Changing this forces a new Elastic Job Agent to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Elastic Job Agent. Changing this forces a new Elastic Job Agent to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A mapping of tags which should be assigned to the Database.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Database.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public JobAgent(String name) {
        this(name, JobAgentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public JobAgent(String name, JobAgentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public JobAgent(String name, JobAgentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/jobAgent:JobAgent", name, args == null ? JobAgentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private JobAgent(String name, Output<String> id, @Nullable JobAgentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:mssql/jobAgent:JobAgent", name, state, makeResourceOptions(options, id));
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
    public static JobAgent get(String name, Output<String> id, @Nullable JobAgentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new JobAgent(name, id, state, options);
    }
}
