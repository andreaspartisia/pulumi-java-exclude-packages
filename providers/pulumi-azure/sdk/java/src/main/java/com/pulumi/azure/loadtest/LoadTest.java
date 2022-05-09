// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loadtest;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.loadtest.LoadTestArgs;
import com.pulumi.azure.loadtest.inputs.LoadTestState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Load Test.
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
 *         var exampleLoadTest = new LoadTest(&#34;exampleLoadTest&#34;, LoadTestArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Load tests can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:loadtest/loadTest:LoadTest example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/group1/providers/Microsoft.LoadTestService/loadtests/example
 * ```
 * 
 */
@ResourceType(type="azure:loadtest/loadTest:LoadTest")
public class LoadTest extends com.pulumi.resources.CustomResource {
    /**
     * Public URI of the Data Plane.
     * 
     */
    @Export(name="dataplaneUri", type=String.class, parameters={})
    private Output<String> dataplaneUri;

    /**
     * @return Public URI of the Data Plane.
     * 
     */
    public Output<String> dataplaneUri() {
        return this.dataplaneUri;
    }
    /**
     * The Azure Region where the Load Test should exist. Changing this forces a new Load Test to be created.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The Azure Region where the Load Test should exist. Changing this forces a new Load Test to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name which should be used for this Load Test. Changing this forces a new Load Test to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this Load Test. Changing this forces a new Load Test to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Resource Group where the Load Test should exist. Changing this forces a new Load Test to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Load Test should exist. Changing this forces a new Load Test to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * A mapping of tags which should be assigned to the Load Test.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags which should be assigned to the Load Test.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LoadTest(String name) {
        this(name, LoadTestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LoadTest(String name, LoadTestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LoadTest(String name, LoadTestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loadtest/loadTest:LoadTest", name, args == null ? LoadTestArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LoadTest(String name, Output<String> id, @Nullable LoadTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:loadtest/loadTest:LoadTest", name, state, makeResourceOptions(options, id));
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
    public static LoadTest get(String name, Output<String> id, @Nullable LoadTestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LoadTest(name, id, state, options);
    }
}
