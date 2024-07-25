// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.foobar;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.foobar.ModuleResourceArgs;
import com.pulumi.foobar.Utilities;
import java.lang.Boolean;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="foobar::ModuleResource")
public class ModuleResource extends com.pulumi.resources.CustomResource {
    @Export(name="optionalBool", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> optionalBool;

    public Output<Optional<Boolean>> optionalBool() {
        return Codegen.optional(this.optionalBool);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ModuleResource(String name) {
        this(name, ModuleResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ModuleResource(String name, ModuleResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ModuleResource(String name, ModuleResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("foobar::ModuleResource", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private ModuleResource(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("foobar::ModuleResource", name, null, makeResourceOptions(options, id));
    }

    private static ModuleResourceArgs makeArgs(ModuleResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        var builder = args == null ? ModuleResourceArgs.builder() : ModuleResourceArgs.builder(args);
        return builder
            .optionalConst("val")
            .plainOptionalConst("val")
            .plainRequiredConst("val")
            .build();
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ModuleResource get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ModuleResource(name, id, options);
    }
}
