// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Identity.UserGroupMembershipArgs;
import com.pulumi.oci.Identity.inputs.UserGroupMembershipState;
import com.pulumi.oci.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides the User Group Membership resource in Oracle Cloud Infrastructure Identity service.
 * 
 * Adds the specified user to the specified group and returns a `UserGroupMembership` object with its own OCID.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * UserGroupMemberships can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Identity/userGroupMembership:UserGroupMembership test_user_group_membership &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Identity/userGroupMembership:UserGroupMembership")
public class UserGroupMembership extends com.pulumi.resources.CustomResource {
    /**
     * The OCID of the tenancy containing the user, group, and membership object.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return The OCID of the tenancy containing the user, group, and membership object.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * The OCID of the group.
     * 
     */
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    /**
     * @return The OCID of the group.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * The detailed status of INACTIVE lifecycleState.
     * 
     */
    @Export(name="inactiveState", type=String.class, parameters={})
    private Output<String> inactiveState;

    /**
     * @return The detailed status of INACTIVE lifecycleState.
     * 
     */
    public Output<String> inactiveState() {
        return this.inactiveState;
    }
    /**
     * The membership&#39;s current state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The membership&#39;s current state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Date and time the membership was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return Date and time the membership was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The OCID of the user.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return The OCID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserGroupMembership(String name) {
        this(name, UserGroupMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserGroupMembership(String name, UserGroupMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserGroupMembership(String name, UserGroupMembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Identity/userGroupMembership:UserGroupMembership", name, args == null ? UserGroupMembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGroupMembership(String name, Output<String> id, @Nullable UserGroupMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Identity/userGroupMembership:UserGroupMembership", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static UserGroupMembership get(String name, Output<String> id, @Nullable UserGroupMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserGroupMembership(name, id, state, options);
    }
}
