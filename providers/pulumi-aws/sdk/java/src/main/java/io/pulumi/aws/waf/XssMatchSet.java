// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.waf.XssMatchSetArgs;
import io.pulumi.aws.waf.inputs.XssMatchSetState;
import io.pulumi.aws.waf.outputs.XssMatchSetXssMatchTuple;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a WAF XSS Match Set Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAF XSS Match Set can be imported using their ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/xssMatchSet:XssMatchSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/xssMatchSet:XssMatchSet")
public class XssMatchSet extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The name or description of the SizeConstraintSet.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the SizeConstraintSet.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The parts of web requests that you want to inspect for cross-site scripting attacks.
     * 
     */
    @OutputExport(name="xssMatchTuples", type=List.class, parameters={XssMatchSetXssMatchTuple.class})
    private Output</* @Nullable */ List<XssMatchSetXssMatchTuple>> xssMatchTuples;

    /**
     * @return The parts of web requests that you want to inspect for cross-site scripting attacks.
     * 
     */
    public Output</* @Nullable */ List<XssMatchSetXssMatchTuple>> getXssMatchTuples() {
        return this.xssMatchTuples;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable XssMatchSetArgs.Builder a);
    }
    private static io.pulumi.aws.waf.XssMatchSetArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.waf.XssMatchSetArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public XssMatchSet(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public XssMatchSet(String name) {
        this(name, XssMatchSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public XssMatchSet(String name, @Nullable XssMatchSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public XssMatchSet(String name, @Nullable XssMatchSetArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/xssMatchSet:XssMatchSet", name, args == null ? XssMatchSetArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private XssMatchSet(String name, Input<String> id, @Nullable XssMatchSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/xssMatchSet:XssMatchSet", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static XssMatchSet get(String name, Input<String> id, @Nullable XssMatchSetState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new XssMatchSet(name, id, state, options);
    }
}