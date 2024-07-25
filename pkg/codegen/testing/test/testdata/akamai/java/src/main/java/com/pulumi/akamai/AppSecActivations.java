// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecActivationsArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecActivationsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecActivations:AppSecActivations")
public class AppSecActivations extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the security configuration to be activated
     * 
     */
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    /**
     * @return Unique identifier of the security configuration to be activated
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }
    /**
     * Network on which to activate the configuration version (STAGING or PRODUCTION)
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> network;

    /**
     * @return Network on which to activate the configuration version (STAGING or PRODUCTION)
     * 
     */
    public Output<Optional<String>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * Note describing the activation. Will use timestamp if omitted.
     * 
     */
    @Export(name="note", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> note;

    /**
     * @return Note describing the activation. Will use timestamp if omitted.
     * 
     */
    public Output<Optional<String>> note() {
        return Codegen.optional(this.note);
    }
    /**
     * List of email addresses to be notified with the results of the activation
     * 
     */
    @Export(name="notificationEmails", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notificationEmails;

    /**
     * @return List of email addresses to be notified with the results of the activation
     * 
     */
    public Output<List<String>> notificationEmails() {
        return this.notificationEmails;
    }
    /**
     * The results of the activation
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The results of the activation
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Version of the security configuration to be activated
     * 
     */
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    /**
     * @return Version of the security configuration to be activated
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecActivations(String name) {
        this(name, AppSecActivationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecActivations(String name, AppSecActivationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecActivations(String name, AppSecActivationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecActivations:AppSecActivations", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecActivations(String name, Output<String> id, @Nullable AppSecActivationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecActivations:AppSecActivations", name, state, makeResourceOptions(options, id));
    }

    private static AppSecActivationsArgs makeArgs(AppSecActivationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecActivationsArgs.Empty : args;
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
    public static AppSecActivations get(String name, Output<String> id, @Nullable AppSecActivationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecActivations(name, id, state, options);
    }
}
