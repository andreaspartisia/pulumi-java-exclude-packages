// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.plant.tree_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.plant.Utilities;
import io.pulumi.plant.outputs.Container;
import io.pulumi.plant.tree_v1.RubberTreeArgs;
import io.pulumi.plant.tree_v1.enums.Diameter;
import io.pulumi.plant.tree_v1.enums.RubberTreeVariety;
import io.pulumi.plant.tree_v1.enums.TreeSize;
import io.pulumi.plant.tree_v1.inputs.RubberTreeState;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="plant:tree/v1:RubberTree")
public class RubberTree extends io.pulumi.resources.CustomResource {
    @Export(name="container", type=Container.class, parameters={})
    private Output</* @Nullable */ Container> container;

    public Output</* @Nullable */ Container> container() {
        return this.container;
    }
    @Export(name="diameter", type=Diameter.class, parameters={})
    private Output<Diameter> diameter;

    public Output<Diameter> diameter() {
        return this.diameter;
    }
    @Export(name="farm", type=String.class, parameters={})
    private Output</* @Nullable */ String> farm;

    public Output</* @Nullable */ String> farm() {
        return this.farm;
    }
    @Export(name="size", type=TreeSize.class, parameters={})
    private Output</* @Nullable */ TreeSize> size;

    public Output</* @Nullable */ TreeSize> size() {
        return this.size;
    }
    @Export(name="type", type=RubberTreeVariety.class, parameters={})
    private Output<RubberTreeVariety> type;

    public Output<RubberTreeVariety> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RubberTree(String name) {
        this(name, RubberTreeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RubberTree(String name, RubberTreeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RubberTree(String name, RubberTreeArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("plant:tree/v1:RubberTree", name, args == null ? RubberTreeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RubberTree(String name, Output<String> id, @Nullable RubberTreeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("plant:tree/v1:RubberTree", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static RubberTree get(String name, Output<String> id, @Nullable RubberTreeState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RubberTree(name, id, state, options);
    }
}
