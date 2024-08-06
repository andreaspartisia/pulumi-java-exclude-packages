// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.BotmanCustomBotCategoryActionArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.BotmanCustomBotCategoryActionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/botmanCustomBotCategoryAction:BotmanCustomBotCategoryAction")
public class BotmanCustomBotCategoryAction extends com.pulumi.resources.CustomResource {
    @Export(name="categoryId", refs={String.class}, tree="[0]")
    private Output<String> categoryId;

    public Output<String> categoryId() {
        return this.categoryId;
    }
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }
    @Export(name="customBotCategoryAction", refs={String.class}, tree="[0]")
    private Output<String> customBotCategoryAction;

    public Output<String> customBotCategoryAction() {
        return this.customBotCategoryAction;
    }
    @Export(name="securityPolicyId", refs={String.class}, tree="[0]")
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotmanCustomBotCategoryAction(java.lang.String name) {
        this(name, BotmanCustomBotCategoryActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotmanCustomBotCategoryAction(String name, BotmanCustomBotCategoryActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotmanCustomBotCategoryAction(java.lang.String name, BotmanCustomBotCategoryActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanCustomBotCategoryAction:BotmanCustomBotCategoryAction", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private BotmanCustomBotCategoryAction(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanCustomBotCategoryActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanCustomBotCategoryAction:BotmanCustomBotCategoryAction", name, state, makeResourceOptions(options, id));
    }

    private static BotmanCustomBotCategoryActionArgs makeArgs(BotmanCustomBotCategoryActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BotmanCustomBotCategoryActionArgs.Empty : args;
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
    public static BotmanCustomBotCategoryAction get(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanCustomBotCategoryActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotmanCustomBotCategoryAction(name, id, state, options);
    }
}
