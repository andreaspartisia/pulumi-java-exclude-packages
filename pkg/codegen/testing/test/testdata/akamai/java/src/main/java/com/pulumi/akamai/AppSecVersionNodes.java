// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecVersionNodesArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecVersionNodesState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecVersionNodes:AppSecVersionNodes")
public class AppSecVersionNodes extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the security configuration
     * 
     */
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * Text representation
     * 
     */
    @Export(name="outputText", refs={String.class}, tree="[0]")
    private Output<String> outputText;

    /**
     * @return Text representation
     * 
     */
    public Output<String> outputText() {
        return this.outputText;
    }
    /**
     * Brief description of the security configuration version
     * 
     */
    @Export(name="versionNotes", refs={String.class}, tree="[0]")
    private Output<String> versionNotes;

    /**
     * @return Brief description of the security configuration version
     * 
     */
    public Output<String> versionNotes() {
        return this.versionNotes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecVersionNodes(java.lang.String name) {
        this(name, AppSecVersionNodesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecVersionNodes(String name, AppSecVersionNodesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecVersionNodes(java.lang.String name, AppSecVersionNodesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecVersionNodes:AppSecVersionNodes", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecVersionNodes(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecVersionNodesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecVersionNodes:AppSecVersionNodes", name, state, makeResourceOptions(options, id));
    }

    private static AppSecVersionNodesArgs makeArgs(AppSecVersionNodesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecVersionNodesArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static AppSecVersionNodes get(java.lang.String name, Output<java.lang.String> id, @Nullable AppSecVersionNodesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecVersionNodes(name, id, state, options);
    }
}
