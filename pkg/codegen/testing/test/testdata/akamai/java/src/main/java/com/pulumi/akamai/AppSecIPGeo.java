// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecIPGeoArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecIPGeoState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecIPGeo:AppSecIPGeo")
public class AppSecIPGeo extends com.pulumi.resources.CustomResource {
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
     * List of IDs of network list that are always allowed
     * 
     */
    @Export(name="exceptionIpNetworkLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> exceptionIpNetworkLists;

    /**
     * @return List of IDs of network list that are always allowed
     * 
     */
    public Output<Optional<List<String>>> exceptionIpNetworkLists() {
        return Codegen.optional(this.exceptionIpNetworkLists);
    }
    /**
     * List of IDs of geographic network list to be blocked
     * 
     */
    @Export(name="geoNetworkLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> geoNetworkLists;

    /**
     * @return List of IDs of geographic network list to be blocked
     * 
     */
    public Output<Optional<List<String>>> geoNetworkLists() {
        return Codegen.optional(this.geoNetworkLists);
    }
    /**
     * List of IDs of IP network list to be blocked
     * 
     */
    @Export(name="ipNetworkLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ipNetworkLists;

    /**
     * @return List of IDs of IP network list to be blocked
     * 
     */
    public Output<Optional<List<String>>> ipNetworkLists() {
        return Codegen.optional(this.ipNetworkLists);
    }
    /**
     * Protection mode (block or allow)
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output<String> mode;

    /**
     * @return Protection mode (block or allow)
     * 
     */
    public Output<String> mode() {
        return this.mode;
    }
    /**
     * Unique identifier of the security policy
     * 
     */
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyId;

    /**
     * @return Unique identifier of the security policy
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }
    /**
     * Action set for Ukraine geo control
     * 
     */
    @Export(name="ukraineGeoControlAction", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ukraineGeoControlAction;

    /**
     * @return Action set for Ukraine geo control
     * 
     */
    public Output<Optional<String>> ukraineGeoControlAction() {
        return Codegen.optional(this.ukraineGeoControlAction);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecIPGeo(String name) {
        this(name, AppSecIPGeoArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecIPGeo(String name, AppSecIPGeoArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecIPGeo(String name, AppSecIPGeoArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecIPGeo:AppSecIPGeo", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecIPGeo(String name, Output<String> id, @Nullable AppSecIPGeoState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecIPGeo:AppSecIPGeo", name, state, makeResourceOptions(options, id));
    }

    private static AppSecIPGeoArgs makeArgs(AppSecIPGeoArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecIPGeoArgs.Empty : args;
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
    public static AppSecIPGeo get(String name, Output<String> id, @Nullable AppSecIPGeoState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecIPGeo(name, id, state, options);
    }
}
