// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.RolePolicyAttachmentArgs;
import io.pulumi.aws.iam.inputs.RolePolicyAttachmentState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Attaches a Managed IAM Policy to an IAM role
 * 
 * > **NOTE:** The usage of this resource conflicts with the `aws.iam.PolicyAttachment` resource and will permanently show a difference if both are defined.
 * 
 * > **NOTE:** For a given role, this resource is incompatible with using the `aws.iam.Role` resource `managed_policy_arns` argument. When using that argument and this resource, both will attempt to manage the role's managed policy attachments and the provider will show a permanent difference.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM role policy attachments can be imported using the role name and policy arn separated by `/`.
 * 
 * ```sh
 *  $ pulumi import aws:iam/rolePolicyAttachment:RolePolicyAttachment test-attach test-role/arn:aws:iam::xxxxxxxxxxxx:policy/test-policy
 * ```
 * 
 */
@ResourceType(type="aws:iam/rolePolicyAttachment:RolePolicyAttachment")
public class RolePolicyAttachment extends io.pulumi.resources.CustomResource {
    /**
     * The ARN of the policy you want to apply
     * 
     */
    @OutputExport(name="policyArn", type=String.class, parameters={})
    private Output<String> policyArn;

    /**
     * @return The ARN of the policy you want to apply
     * 
     */
    public Output<String> getPolicyArn() {
        return this.policyArn;
    }
    /**
     * The name of the IAM role to which the policy should be applied
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The name of the IAM role to which the policy should be applied
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    public interface BuilderApplicator {
        public void apply(RolePolicyAttachmentArgs.Builder a);
    }
    private static io.pulumi.aws.iam.RolePolicyAttachmentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.iam.RolePolicyAttachmentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RolePolicyAttachment(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RolePolicyAttachment(String name) {
        this(name, RolePolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RolePolicyAttachment(String name, RolePolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RolePolicyAttachment(String name, RolePolicyAttachmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/rolePolicyAttachment:RolePolicyAttachment", name, args == null ? RolePolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private RolePolicyAttachment(String name, Input<String> id, @Nullable RolePolicyAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/rolePolicyAttachment:RolePolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static RolePolicyAttachment get(String name, Input<String> id, @Nullable RolePolicyAttachmentState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RolePolicyAttachment(name, id, state, options);
    }
}