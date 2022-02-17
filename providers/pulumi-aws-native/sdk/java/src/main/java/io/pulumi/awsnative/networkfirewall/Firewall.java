// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkfirewall.FirewallArgs;
import io.pulumi.awsnative.networkfirewall.outputs.FirewallSubnetMapping;
import io.pulumi.awsnative.networkfirewall.outputs.FirewallTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource type definition for AWS::NetworkFirewall::Firewall
 * 
 */
@ResourceType(type="aws-native:networkfirewall:Firewall")
public class Firewall extends io.pulumi.resources.CustomResource {
    @OutputExport(name="deleteProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deleteProtection;

    public Output</* @Nullable */ Boolean> getDeleteProtection() {
        return this.deleteProtection;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="endpointIds", type=List.class, parameters={String.class})
    private Output<List<String>> endpointIds;

    public Output<List<String>> getEndpointIds() {
        return this.endpointIds;
    }
    @OutputExport(name="firewallArn", type=String.class, parameters={})
    private Output<String> firewallArn;

    public Output<String> getFirewallArn() {
        return this.firewallArn;
    }
    @OutputExport(name="firewallId", type=String.class, parameters={})
    private Output<String> firewallId;

    public Output<String> getFirewallId() {
        return this.firewallId;
    }
    @OutputExport(name="firewallName", type=String.class, parameters={})
    private Output<String> firewallName;

    public Output<String> getFirewallName() {
        return this.firewallName;
    }
    @OutputExport(name="firewallPolicyArn", type=String.class, parameters={})
    private Output<String> firewallPolicyArn;

    public Output<String> getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }
    @OutputExport(name="firewallPolicyChangeProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> firewallPolicyChangeProtection;

    public Output</* @Nullable */ Boolean> getFirewallPolicyChangeProtection() {
        return this.firewallPolicyChangeProtection;
    }
    @OutputExport(name="subnetChangeProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> subnetChangeProtection;

    public Output</* @Nullable */ Boolean> getSubnetChangeProtection() {
        return this.subnetChangeProtection;
    }
    @OutputExport(name="subnetMappings", type=List.class, parameters={FirewallSubnetMapping.class})
    private Output<List<FirewallSubnetMapping>> subnetMappings;

    public Output<List<FirewallSubnetMapping>> getSubnetMappings() {
        return this.subnetMappings;
    }
    @OutputExport(name="tags", type=List.class, parameters={FirewallTag.class})
    private Output</* @Nullable */ List<FirewallTag>> tags;

    public Output</* @Nullable */ List<FirewallTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Firewall(String name, FirewallArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:Firewall", name, args == null ? FirewallArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Firewall(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:Firewall", name, null, makeResourceOptions(options, id));
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
    public static Firewall get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Firewall(name, id, options);
    }
}