// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.networkfirewall.FirewallPolicyArgs;
import io.pulumi.awsnative.networkfirewall.outputs.FirewallPolicyTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource type definition for AWS::NetworkFirewall::FirewallPolicy
 * 
 */
@ResourceType(type="aws-native:networkfirewall:FirewallPolicy")
public class FirewallPolicy extends io.pulumi.resources.CustomResource {
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="firewallPolicy", type=io.pulumi.awsnative.networkfirewall.outputs.FirewallPolicy.class, parameters={})
    private Output<io.pulumi.awsnative.networkfirewall.outputs.FirewallPolicy> firewallPolicy;

    public Output<io.pulumi.awsnative.networkfirewall.outputs.FirewallPolicy> getFirewallPolicy() {
        return this.firewallPolicy;
    }
    @OutputExport(name="firewallPolicyArn", type=String.class, parameters={})
    private Output<String> firewallPolicyArn;

    public Output<String> getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }
    @OutputExport(name="firewallPolicyId", type=String.class, parameters={})
    private Output<String> firewallPolicyId;

    public Output<String> getFirewallPolicyId() {
        return this.firewallPolicyId;
    }
    @OutputExport(name="firewallPolicyName", type=String.class, parameters={})
    private Output<String> firewallPolicyName;

    public Output<String> getFirewallPolicyName() {
        return this.firewallPolicyName;
    }
    @OutputExport(name="tags", type=List.class, parameters={FirewallPolicyTag.class})
    private Output</* @Nullable */ List<FirewallPolicyTag>> tags;

    public Output</* @Nullable */ List<FirewallPolicyTag>> getTags() {
        return this.tags;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallPolicy(String name, FirewallPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:FirewallPolicy", name, args == null ? FirewallPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private FirewallPolicy(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkfirewall:FirewallPolicy", name, null, makeResourceOptions(options, id));
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
    public static FirewallPolicy get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new FirewallPolicy(name, id, options);
    }
}