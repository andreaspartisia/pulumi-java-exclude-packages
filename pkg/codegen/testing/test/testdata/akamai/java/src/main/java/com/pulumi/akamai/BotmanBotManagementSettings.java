// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.BotmanBotManagementSettingsArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.BotmanBotManagementSettingsState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/botmanBotManagementSettings:BotmanBotManagementSettings")
public class BotmanBotManagementSettings extends com.pulumi.resources.CustomResource {
    @Export(name="botManagementSettings", refs={String.class}, tree="[0]")
    private Output<String> botManagementSettings;

    public Output<String> botManagementSettings() {
        return this.botManagementSettings;
    }
    @Export(name="configId", refs={Integer.class}, tree="[0]")
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
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
    public BotmanBotManagementSettings(java.lang.String name) {
        this(name, BotmanBotManagementSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BotmanBotManagementSettings(String name, BotmanBotManagementSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BotmanBotManagementSettings(java.lang.String name, BotmanBotManagementSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanBotManagementSettings:BotmanBotManagementSettings", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private BotmanBotManagementSettings(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanBotManagementSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/botmanBotManagementSettings:BotmanBotManagementSettings", name, state, makeResourceOptions(options, id));
    }

    private static BotmanBotManagementSettingsArgs makeArgs(BotmanBotManagementSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BotmanBotManagementSettingsArgs.Empty : args;
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
    public static BotmanBotManagementSettings get(java.lang.String name, Output<java.lang.String> id, @Nullable BotmanBotManagementSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BotmanBotManagementSettings(name, id, state, options);
    }
}
