// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iap;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.iap.WebTypeComputeIamBindingArgs;
import io.pulumi.gcp.iap.inputs.WebTypeComputeIamBindingState;
import io.pulumi.gcp.iap.outputs.WebTypeComputeIamBindingCondition;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Identity-Aware Proxy WebTypeCompute. Each of these resources serves a different use case:
 * 
 * * `gcp.iap.WebTypeComputeIamPolicy`: Authoritative. Sets the IAM policy for the webtypecompute and replaces any existing policy already attached.
 * * `gcp.iap.WebTypeComputeIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the webtypecompute are preserved.
 * * `gcp.iap.WebTypeComputeIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the webtypecompute are preserved.
 * 
 * > **Note:** `gcp.iap.WebTypeComputeIamPolicy` **cannot** be used in conjunction with `gcp.iap.WebTypeComputeIamBinding` and `gcp.iap.WebTypeComputeIamMember` or they will fight over what your policy should be.
 * 
 * > **Note:** `gcp.iap.WebTypeComputeIamBinding` resources **can be** used in conjunction with `gcp.iap.WebTypeComputeIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_iap\_web\_type\_compute\_iam\_policy
 * 
 * With IAM Conditions:
 * ## google\_iap\_web\_type\_compute\_iam\_binding
 * 
 * With IAM Conditions:
 * ## google\_iap\_web\_type\_compute\_iam\_member
 * 
 * With IAM Conditions:
 * 
 * ## Import
 * 
 * For all import syntaxes, the "resource in question" can take any of the following forms* projects/{{project}}/iap_web/compute * {{project}} Any variables not passed in the import command will be taken from the provider configuration. Identity-Aware Proxy webtypecompute IAM resources can be imported using the resource identifiers, role, and member. IAM member imports use space-delimited identifiersthe resource in question, the role, and the member identity, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/webTypeComputeIamBinding:WebTypeComputeIamBinding editor "projects/{{project}}/iap_web/compute roles/iap.httpsResourceAccessor user:jane@example.com"
 * ```
 * 
 *  IAM binding imports use space-delimited identifiersthe resource in question and the role, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/webTypeComputeIamBinding:WebTypeComputeIamBinding editor "projects/{{project}}/iap_web/compute roles/iap.httpsResourceAccessor"
 * ```
 * 
 *  IAM policy imports use the identifier of the resource in question, e.g.
 * 
 * ```sh
 *  $ pulumi import gcp:iap/webTypeComputeIamBinding:WebTypeComputeIamBinding editor projects/{{project}}/iap_web/compute
 * ```
 * 
 *  -> **Custom Roles**If you're importing a IAM resource with a custom role, make sure to use the
 * 
 * full name of the custom role, e.g. `[projects/my-project|organizations/my-org]/roles/my-custom-role`.
 * 
 */
@ResourceType(type="gcp:iap/webTypeComputeIamBinding:WebTypeComputeIamBinding")
public class WebTypeComputeIamBinding extends io.pulumi.resources.CustomResource {
    /**
     * ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="condition", type=WebTypeComputeIamBindingCondition.class, parameters={})
    private Output</* @Nullable */ WebTypeComputeIamBindingCondition> condition;

    /**
     * @return ) An [IAM Condition](https://cloud.google.com/iam/docs/conditions-overview) for a given binding.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ WebTypeComputeIamBindingCondition> getCondition() {
        return this.condition;
    }
    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="members", type=List.class, parameters={String.class})
    private Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.iap.WebTypeComputeIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.iap.WebTypeComputeIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebTypeComputeIamBinding(String name, WebTypeComputeIamBindingArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/webTypeComputeIamBinding:WebTypeComputeIamBinding", name, args == null ? WebTypeComputeIamBindingArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private WebTypeComputeIamBinding(String name, Input<String> id, @Nullable WebTypeComputeIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/webTypeComputeIamBinding:WebTypeComputeIamBinding", name, state, makeResourceOptions(options, id));
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
    public static WebTypeComputeIamBinding get(String name, Input<String> id, @Nullable WebTypeComputeIamBindingState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new WebTypeComputeIamBinding(name, id, state, options);
    }
}