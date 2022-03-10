// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ResolverRuleAssociationArgs;
import io.pulumi.aws.route53.inputs.ResolverRuleAssociationState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Route53 Resolver rule association.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 Resolver rule associations can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverRuleAssociation:ResolverRuleAssociation example rslvr-rrassoc-97242eaf88example
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverRuleAssociation:ResolverRuleAssociation")
public class ResolverRuleAssociation extends io.pulumi.resources.CustomResource {
    /**
     * A name for the association that you're creating between a resolver rule and a VPC.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for the association that you're creating between a resolver rule and a VPC.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The ID of the resolver rule that you want to associate with the VPC.
     * 
     */
    @OutputExport(name="resolverRuleId", type=String.class, parameters={})
    private Output<String> resolverRuleId;

    /**
     * @return The ID of the resolver rule that you want to associate with the VPC.
     * 
     */
    public Output<String> getResolverRuleId() {
        return this.resolverRuleId;
    }
    /**
     * The ID of the VPC that you want to associate the resolver rule with.
     * 
     */
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC that you want to associate the resolver rule with.
     * 
     */
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(ResolverRuleAssociationArgs.Builder a);
    }
    private static io.pulumi.aws.route53.ResolverRuleAssociationArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.ResolverRuleAssociationArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResolverRuleAssociation(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverRuleAssociation(String name) {
        this(name, ResolverRuleAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverRuleAssociation(String name, ResolverRuleAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverRuleAssociation(String name, ResolverRuleAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverRuleAssociation:ResolverRuleAssociation", name, args == null ? ResolverRuleAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResolverRuleAssociation(String name, Input<String> id, @Nullable ResolverRuleAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverRuleAssociation:ResolverRuleAssociation", name, state, makeResourceOptions(options, id));
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
    public static ResolverRuleAssociation get(String name, Input<String> id, @Nullable ResolverRuleAssociationState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverRuleAssociation(name, id, state, options);
    }
}