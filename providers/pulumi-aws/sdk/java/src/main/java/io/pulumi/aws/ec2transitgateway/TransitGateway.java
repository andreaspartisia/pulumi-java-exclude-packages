// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2transitgateway.TransitGatewayArgs;
import io.pulumi.aws.ec2transitgateway.inputs.TransitGatewayState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages an EC2 Transit Gateway.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_ec2_transit_gateway` can be imported by using the EC2 Transit Gateway identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2transitgateway/transitGateway:TransitGateway example tgw-12345678
 * ```
 * 
 */
@ResourceType(type="aws:ec2transitgateway/transitGateway:TransitGateway")
public class TransitGateway extends io.pulumi.resources.CustomResource {
    /**
     * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
     * 
     */
    @OutputExport(name="amazonSideAsn", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> amazonSideAsn;

    /**
     * @return Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
     * 
     */
    public Output</* @Nullable */ Integer> getAmazonSideAsn() {
        return this.amazonSideAsn;
    }
    /**
     * EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return EC2 Transit Gateway Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Identifier of the default association route table
     * 
     */
    @OutputExport(name="associationDefaultRouteTableId", type=String.class, parameters={})
    private Output<String> associationDefaultRouteTableId;

    /**
     * @return Identifier of the default association route table
     * 
     */
    public Output<String> getAssociationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId;
    }
    /**
     * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    @OutputExport(name="autoAcceptSharedAttachments", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoAcceptSharedAttachments;

    /**
     * @return Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
     * 
     */
    public Output</* @Nullable */ String> getAutoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }
    /**
     * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @OutputExport(name="defaultRouteTableAssociation", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultRouteTableAssociation;

    /**
     * @return Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output</* @Nullable */ String> getDefaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }
    /**
     * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @OutputExport(name="defaultRouteTablePropagation", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultRouteTablePropagation;

    /**
     * @return Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output</* @Nullable */ String> getDefaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }
    /**
     * Description of the EC2 Transit Gateway.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the EC2 Transit Gateway.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @OutputExport(name="dnsSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> dnsSupport;

    /**
     * @return Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output</* @Nullable */ String> getDnsSupport() {
        return this.dnsSupport;
    }
    /**
     * Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    @OutputExport(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    public Output<String> getOwnerId() {
        return this.ownerId;
    }
    /**
     * Identifier of the default propagation route table
     * 
     */
    @OutputExport(name="propagationDefaultRouteTableId", type=String.class, parameters={})
    private Output<String> propagationDefaultRouteTableId;

    /**
     * @return Identifier of the default propagation route table
     * 
     */
    public Output<String> getPropagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId;
    }
    /**
     * Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value tags for the EC2 Transit Gateway. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    @OutputExport(name="vpnEcmpSupport", type=String.class, parameters={})
    private Output</* @Nullable */ String> vpnEcmpSupport;

    /**
     * @return Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
     * 
     */
    public Output</* @Nullable */ String> getVpnEcmpSupport() {
        return this.vpnEcmpSupport;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable TransitGatewayArgs.Builder a);
    }
    private static io.pulumi.aws.ec2transitgateway.TransitGatewayArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ec2transitgateway.TransitGatewayArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TransitGateway(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGateway(String name) {
        this(name, TransitGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGateway(String name, @Nullable TransitGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGateway(String name, @Nullable TransitGatewayArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/transitGateway:TransitGateway", name, args == null ? TransitGatewayArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private TransitGateway(String name, Input<String> id, @Nullable TransitGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2transitgateway/transitGateway:TransitGateway", name, state, makeResourceOptions(options, id));
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
    public static TransitGateway get(String name, Input<String> id, @Nullable TransitGatewayState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TransitGateway(name, id, state, options);
    }
}