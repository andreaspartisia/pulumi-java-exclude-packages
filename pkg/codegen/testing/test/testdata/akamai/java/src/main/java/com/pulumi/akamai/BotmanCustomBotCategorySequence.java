// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.BotmanCustomBotCategorySequenceArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.BotmanCustomBotCategorySequenceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/botmanCustomBotCategorySequence:BotmanCustomBotCategorySequence")
public class BotmanCustomBotCategorySequence extends com.pulumi.resources.CustomResource {
    @Export(name="categoryIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> categoryIds;

    public Output<List<String>> categoryIds() {
        return this.categoryIds;
    }
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BotmanCustomBotCategorySequence(String name) {
        this(name, BotmanCustomBotCategorySequenceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotmanCustomBotCategorySequence(String name, BotmanCustomBotCategorySequenceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotmanCustomBotCategorySequence(String name, BotmanCustomBotCategorySequenceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanCustomBotCategorySequence:BotmanCustomBotCategorySequence", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private BotmanCustomBotCategorySequence(String name, Output<String> id, @Nullable BotmanCustomBotCategorySequenceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanCustomBotCategorySequence:BotmanCustomBotCategorySequence", name, state, makeResourceOptions(options, id));
    }

    private static BotmanCustomBotCategorySequenceArgs makeArgs(BotmanCustomBotCategorySequenceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BotmanCustomBotCategorySequenceArgs.Empty : args;
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
    public static BotmanCustomBotCategorySequence get(String name, Output<String> id, @Nullable BotmanCustomBotCategorySequenceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotmanCustomBotCategorySequence(name, id, state, options);
    }
}
