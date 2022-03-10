// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ResolverFirewallRuleGroupArgs;
import io.pulumi.aws.route53.inputs.ResolverFirewallRuleGroupState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver DNS Firewall rule group resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 *  Route 53 Resolver DNS Firewall rule groups can be imported using the Route 53 Resolver DNS Firewall rule group ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverFirewallRuleGroup:ResolverFirewallRuleGroup example rslvr-frg-0123456789abcdef
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverFirewallRuleGroup:ResolverFirewallRuleGroup")
public class ResolverFirewallRuleGroup extends io.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) of the rule group.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN (Amazon Resource Name) of the rule group.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A name that lets you identify the rule group, to manage and use it.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name that lets you identify the rule group, to manage and use it.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The AWS account ID for the account that created the rule group. When a rule group is shared with your account, this is the account that has shared the rule group with you.
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The AWS account ID for the account that created the rule group. When a rule group is shared with your account, this is the account that has shared the rule group with you.
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * Whether the rule group is shared with other AWS accounts, or was shared with the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM). Valid values: `NOT_SHARED`, `SHARED_BY_ME`, `SHARED_WITH_ME`
     * 
     */
    @OutputExport(name="shareStatus", type=String.class, parameters={})
    private Output<String> shareStatus;

    /**
     * @return Whether the rule group is shared with other AWS accounts, or was shared with the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM). Valid values: `NOT_SHARED`, `SHARED_BY_ME`, `SHARED_WITH_ME`
     * 
     */
    public Output<String> getShareStatus() {
        return this.shareStatus;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ResolverFirewallRuleGroupArgs.Builder a);
    }
    private static io.pulumi.aws.route53.ResolverFirewallRuleGroupArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.route53.ResolverFirewallRuleGroupArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ResolverFirewallRuleGroup(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverFirewallRuleGroup(String name) {
        this(name, ResolverFirewallRuleGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverFirewallRuleGroup(String name, @Nullable ResolverFirewallRuleGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverFirewallRuleGroup(String name, @Nullable ResolverFirewallRuleGroupArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallRuleGroup:ResolverFirewallRuleGroup", name, args == null ? ResolverFirewallRuleGroupArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ResolverFirewallRuleGroup(String name, Input<String> id, @Nullable ResolverFirewallRuleGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallRuleGroup:ResolverFirewallRuleGroup", name, state, makeResourceOptions(options, id));
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
    public static ResolverFirewallRuleGroup get(String name, Input<String> id, @Nullable ResolverFirewallRuleGroupState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverFirewallRuleGroup(name, id, state, options);
    }
}