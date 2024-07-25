// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.EdgeKvArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.EdgeKvState;
import com.pulumi.akamai.outputs.EdgeKvInitialData;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/edgeKv:EdgeKv")
public class EdgeKv extends com.pulumi.resources.CustomResource {
    /**
     * Storage location for data
     * 
     */
    @Export(name="geoLocation", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> geoLocation;

    /**
     * @return Storage location for data
     * 
     */
    public Output<Optional<String>> geoLocation() {
        return Codegen.optional(this.geoLocation);
    }
    /**
     * Namespace ACC group ID. It will be used in EdgeKV API v2. Not updatable.
     * 
     */
    @Export(name="groupId", refs={Integer.class}, tree="[0]")
    private Output<Integer> groupId;

    /**
     * @return Namespace ACC group ID. It will be used in EdgeKV API v2. Not updatable.
     * 
     */
    public Output<Integer> groupId() {
        return this.groupId;
    }
    /**
     * List of pairs to initialize the namespace. Just meaningful for creation, updates will be ignored.
     * 
     * @deprecated
     * The attribute &#39;initial_data&#39; has been deprecated. To manage edgeKV items use &#39;akamai_edgekv_group_items&#39; resource instead.
     * 
     */
    @Deprecated /* The attribute 'initial_data' has been deprecated. To manage edgeKV items use 'akamai_edgekv_group_items' resource instead. */
    @Export(name="initialDatas", refs={List.class,EdgeKvInitialData.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EdgeKvInitialData>> initialDatas;

    /**
     * @return List of pairs to initialize the namespace. Just meaningful for creation, updates will be ignored.
     * 
     */
    public Output<Optional<List<EdgeKvInitialData>>> initialDatas() {
        return Codegen.optional(this.initialDatas);
    }
    /**
     * Name for the EKV namespace
     * 
     */
    @Export(name="namespaceName", refs={String.class}, tree="[0]")
    private Output<String> namespaceName;

    /**
     * @return Name for the EKV namespace
     * 
     */
    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * The network on which the namespace will be activated
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return The network on which the namespace will be activated
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * Retention period for data in this namespace. An update of this value will just affect new EKV items.
     * 
     */
    @Export(name="retentionInSeconds", refs={Integer.class}, tree="[0]")
    private Output<Integer> retentionInSeconds;

    /**
     * @return Retention period for data in this namespace. An update of this value will just affect new EKV items.
     * 
     */
    public Output<Integer> retentionInSeconds() {
        return this.retentionInSeconds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EdgeKv(String name) {
        this(name, EdgeKvArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EdgeKv(String name, EdgeKvArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EdgeKv(String name, EdgeKvArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/edgeKv:EdgeKv", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private EdgeKv(String name, Output<String> id, @Nullable EdgeKvState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/edgeKv:EdgeKv", name, state, makeResourceOptions(options, id));
    }

    private static EdgeKvArgs makeArgs(EdgeKvArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EdgeKvArgs.Empty : args;
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
    public static EdgeKv get(String name, Output<String> id, @Nullable EdgeKvState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EdgeKv(name, id, state, options);
    }
}
