// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.ResolverRuleAssociationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Route53Resolver::ResolverRuleAssociation
 * 
 */
@ResourceType(type="aws-native:route53resolver:ResolverRuleAssociation")
public class ResolverRuleAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The name of an association between a Resolver rule and a VPC.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of an association between a Resolver rule and a VPC.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Primary Identifier for Resolver Rule Association
     * 
     */
    @OutputExport(name="resolverRuleAssociationId", type=String.class, parameters={})
    private Output<String> resolverRuleAssociationId;

    /**
     * @return Primary Identifier for Resolver Rule Association
     * 
     */
    public Output<String> getResolverRuleAssociationId() {
        return this.resolverRuleAssociationId;
    }
    /**
     * The ID of the Resolver rule that you associated with the VPC that is specified by VPCId.
     * 
     */
    @OutputExport(name="resolverRuleId", type=String.class, parameters={})
    private Output<String> resolverRuleId;

    /**
     * @return The ID of the Resolver rule that you associated with the VPC that is specified by VPCId.
     * 
     */
    public Output<String> getResolverRuleId() {
        return this.resolverRuleId;
    }
    /**
     * The ID of the VPC that you associated the Resolver rule with.
     * 
     */
    @OutputExport(name="vPCId", type=String.class, parameters={})
    private Output<String> vPCId;

    /**
     * @return The ID of the VPC that you associated the Resolver rule with.
     * 
     */
    public Output<String> getVPCId() {
        return this.vPCId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverRuleAssociation(String name, ResolverRuleAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverRuleAssociation", name, args == null ? ResolverRuleAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResolverRuleAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverRuleAssociation", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResolverRuleAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverRuleAssociation(name, id, options);
    }
}