// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.AppSecReputationProfileActionArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.AppSecReputationProfileActionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/appSecReputationProfileAction:AppSecReputationProfileAction")
public class AppSecReputationProfileAction extends com.pulumi.resources.CustomResource {
    /**
     * Action to be taken when the reputation profile is triggered
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return Action to be taken when the reputation profile is triggered
     * 
     */
    public Output<String> action() {
        return this.action;
    }
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
     * Unique identifier of the reputation profile
     * 
     */
    @Export(name="reputationProfileId", refs={Integer.class}, tree="[0]")
    private Output<Integer> reputationProfileId;

    /**
     * @return Unique identifier of the reputation profile
     * 
     */
    public Output<Integer> reputationProfileId() {
        return this.reputationProfileId;
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppSecReputationProfileAction(String name) {
        this(name, AppSecReputationProfileActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppSecReputationProfileAction(String name, AppSecReputationProfileActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppSecReputationProfileAction(String name, AppSecReputationProfileActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecReputationProfileAction:AppSecReputationProfileAction", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private AppSecReputationProfileAction(String name, Output<String> id, @Nullable AppSecReputationProfileActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/appSecReputationProfileAction:AppSecReputationProfileAction", name, state, makeResourceOptions(options, id));
    }

    private static AppSecReputationProfileActionArgs makeArgs(AppSecReputationProfileActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? AppSecReputationProfileActionArgs.Empty : args;
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
    public static AppSecReputationProfileAction get(String name, Output<String> id, @Nullable AppSecReputationProfileActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppSecReputationProfileAction(name, id, state, options);
    }
}
