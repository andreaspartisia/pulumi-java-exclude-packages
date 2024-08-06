// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.urnid;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.urnid.ResArgs;
import com.pulumi.urnid.Utilities;
import com.pulumi.urnid.outputs.InnerType;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * It&#39;s fine to use urn and id as input properties
 * 
 */
@ResourceType(type="urnid:index:Res")
public class Res extends com.pulumi.resources.CustomResource {
    @Export(name="output", refs={InnerType.class}, tree="[0]")
    private Output</* @Nullable */ InnerType> output;

    public Output<Optional<InnerType>> output() {
        return Codegen.optional(this.output);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Res(java.lang.String name) {
        this(name, ResArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Res(String name, @Nullable ResArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Res(java.lang.String name, @Nullable ResArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("urnid:index:Res", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private Res(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("urnid:index:Res", name, null, makeResourceOptions(options, id));
    }

    private static ResArgs makeArgs(@Nullable ResArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ResArgs.Empty : args;
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Res get(java.lang.String name, Output<java.lang.String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Res(name, id, options);
    }
}
