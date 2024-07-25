// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.example.TypeUsesArgs;
import com.pulumi.example.Utilities;
import com.pulumi.example.enums.OutputOnlyEnumType;
import com.pulumi.example.enums.RubberTreeVariety;
import com.pulumi.example.outputs.Object;
import com.pulumi.example.outputs.ObjectWithNodeOptionalInputs;
import com.pulumi.example.outputs.OutputOnlyObjectType;
import com.pulumi.example.outputs.SomeOtherObject;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="example::TypeUses")
public class TypeUses extends com.pulumi.resources.CustomResource {
    @Export(name="alpha", refs={OutputOnlyEnumType.class}, tree="[0]")
    private Output</* @Nullable */ OutputOnlyEnumType> alpha;

    public Output<Optional<OutputOnlyEnumType>> alpha() {
        return Codegen.optional(this.alpha);
    }
    @Export(name="bar", refs={SomeOtherObject.class}, tree="[0]")
    private Output</* @Nullable */ SomeOtherObject> bar;

    public Output<Optional<SomeOtherObject>> bar() {
        return Codegen.optional(this.bar);
    }
    @Export(name="baz", refs={ObjectWithNodeOptionalInputs.class}, tree="[0]")
    private Output</* @Nullable */ ObjectWithNodeOptionalInputs> baz;

    public Output<Optional<ObjectWithNodeOptionalInputs>> baz() {
        return Codegen.optional(this.baz);
    }
    @Export(name="beta", refs={List.class,OutputOnlyObjectType.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OutputOnlyObjectType>> beta;

    public Output<Optional<List<OutputOnlyObjectType>>> beta() {
        return Codegen.optional(this.beta);
    }
    @Export(name="foo", refs={Object.class}, tree="[0]")
    private Output</* @Nullable */ Object> foo;

    public Output<Optional<Object>> foo() {
        return Codegen.optional(this.foo);
    }
    @Export(name="gamma", refs={Map.class,String.class,OutputOnlyEnumType.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,OutputOnlyEnumType>> gamma;

    public Output<Optional<Map<String,OutputOnlyEnumType>>> gamma() {
        return Codegen.optional(this.gamma);
    }
    @Export(name="qux", refs={RubberTreeVariety.class}, tree="[0]")
    private Output</* @Nullable */ RubberTreeVariety> qux;

    public Output<Optional<RubberTreeVariety>> qux() {
        return Codegen.optional(this.qux);
    }
    @Export(name="zed", refs={OutputOnlyObjectType.class}, tree="[0]")
    private Output</* @Nullable */ OutputOnlyObjectType> zed;

    public Output<Optional<OutputOnlyObjectType>> zed() {
        return Codegen.optional(this.zed);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TypeUses(String name) {
        this(name, TypeUsesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TypeUses(String name, @Nullable TypeUsesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TypeUses(String name, @Nullable TypeUsesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("example::TypeUses", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private TypeUses(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("example::TypeUses", name, null, makeResourceOptions(options, id));
    }

    private static TypeUsesArgs makeArgs(@Nullable TypeUsesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TypeUsesArgs.Empty : args;
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
    public static TypeUses get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TypeUses(name, id, options);
    }
}
