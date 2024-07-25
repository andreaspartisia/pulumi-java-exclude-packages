// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam_instanceProfile;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam_instanceProfile.InstanceProfileArgs;
import com.pulumi.aws.iam_instanceProfile.inputs.InstanceProfileState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="aws:iam/instanceProfile:InstanceProfile")
public class InstanceProfile extends com.pulumi.resources.CustomResource {
    /**
     * Name of the role to add to the profile.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> role;

    /**
     * @return Name of the role to add to the profile.
     * 
     */
    public Output<Optional<String>> role() {
        return Codegen.optional(this.role);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceProfile(String name) {
        this(name, InstanceProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceProfile(String name, @Nullable InstanceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/instanceProfile:InstanceProfile", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceProfile(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/instanceProfile:InstanceProfile", name, state, makeResourceOptions(options, id));
    }

    private static InstanceProfileArgs makeArgs(@Nullable InstanceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? InstanceProfileArgs.Empty : args;
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
    public static InstanceProfile get(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceProfile(name, id, state, options);
    }
}
