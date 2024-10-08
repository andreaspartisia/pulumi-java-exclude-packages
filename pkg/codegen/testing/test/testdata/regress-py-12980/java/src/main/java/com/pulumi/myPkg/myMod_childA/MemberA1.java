// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myPkg.myMod_childA;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.myPkg.Utilities;
import com.pulumi.myPkg.myMod_childA.MemberA1Args;
import javax.annotation.Nullable;

@ResourceType(type="myPkg:myMod/childA:MemberA1")
public class MemberA1 extends com.pulumi.resources.ComponentResource {
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MemberA1(java.lang.String name) {
        this(name, MemberA1Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MemberA1(java.lang.String name, @Nullable MemberA1Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MemberA1(java.lang.String name, @Nullable MemberA1Args args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        super("myPkg:myMod/childA:MemberA1", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), true);
    }

    private static MemberA1Args makeArgs(@Nullable MemberA1Args args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MemberA1Args.Empty : args;
    }

    private static com.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.ComponentResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
