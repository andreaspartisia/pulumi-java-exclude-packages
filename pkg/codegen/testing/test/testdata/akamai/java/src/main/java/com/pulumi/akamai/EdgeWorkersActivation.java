// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.EdgeWorkersActivationArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.EdgeWorkersActivationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/edgeWorkersActivation:EdgeWorkersActivation")
public class EdgeWorkersActivation extends com.pulumi.resources.CustomResource {
    /**
     * A unique identifier of the activation
     * 
     */
    @Export(name="activationId", refs={Integer.class}, tree="[0]")
    private Output<Integer> activationId;

    /**
     * @return A unique identifier of the activation
     * 
     */
    public Output<Integer> activationId() {
        return this.activationId;
    }
    /**
     * Id of the EdgeWorker to activate
     * 
     */
    @Export(name="edgeworkerId", refs={Integer.class}, tree="[0]")
    private Output<Integer> edgeworkerId;

    /**
     * @return Id of the EdgeWorker to activate
     * 
     */
    public Output<Integer> edgeworkerId() {
        return this.edgeworkerId;
    }
    /**
     * The network on which the version will be activated
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return The network on which the version will be activated
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * The version of EdgeWorker to activate
     * 
     */
    @Export(name="version", refs={String.class}, tree="[0]")
    private Output<String> version;

    /**
     * @return The version of EdgeWorker to activate
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EdgeWorkersActivation(java.lang.String name) {
        this(name, EdgeWorkersActivationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EdgeWorkersActivation(String name, EdgeWorkersActivationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EdgeWorkersActivation(java.lang.String name, EdgeWorkersActivationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/edgeWorkersActivation:EdgeWorkersActivation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private EdgeWorkersActivation(java.lang.String name, Output<java.lang.String> id, @Nullable EdgeWorkersActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/edgeWorkersActivation:EdgeWorkersActivation", name, state, makeResourceOptions(options, id));
    }

    private static EdgeWorkersActivationArgs makeArgs(EdgeWorkersActivationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EdgeWorkersActivationArgs.Empty : args;
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
    public static EdgeWorkersActivation get(java.lang.String name, Output<java.lang.String> id, @Nullable EdgeWorkersActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EdgeWorkersActivation(name, id, state, options);
    }
}
