// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.billing;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.billing.SubAccountArgs;
import io.pulumi.gcp.billing.inputs.SubAccountState;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Allows creation and management of a Google Cloud Billing Subaccount.
 * 
 * !> **WARNING:** Deleting this resource will not delete or close the billing subaccount.
 * 
 * ## Import
 * 
 * Billing Subaccounts can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:billing/subAccount:SubAccount default billingAccounts/{billing_account_id}
 * ```
 * 
 */
@ResourceType(type="gcp:billing/subAccount:SubAccount")
public class SubAccount extends io.pulumi.resources.CustomResource {
    /**
     * The billing account id.
     * 
     */
    @OutputExport(name="billingAccountId", type=String.class, parameters={})
    private Output<String> billingAccountId;

    /**
     * @return The billing account id.
     * 
     */
    public Output<String> getBillingAccountId() {
        return this.billingAccountId;
    }
    /**
     * If set to "RENAME_ON_DESTROY" the billing account display_name
     * will be changed to "Destroyed" along with a timestamp.  If set to "" this will not occur.
     * Default is "".
     * 
     */
    @OutputExport(name="deletionPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> deletionPolicy;

    /**
     * @return If set to "RENAME_ON_DESTROY" the billing account display_name
     * will be changed to "Destroyed" along with a timestamp.  If set to "" this will not occur.
     * Default is "".
     * 
     */
    public Output</* @Nullable */ String> getDeletionPolicy() {
        return this.deletionPolicy;
    }
    /**
     * The display name of the billing account.
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the billing account.
     * 
     */
    public Output<String> getDisplayName() {
        return this.displayName;
    }
    /**
     * The name of the master billing account that the subaccount
     * will be created under in the form `{billing_account_id}` or `billingAccounts/{billing_account_id}`.
     * 
     */
    @OutputExport(name="masterBillingAccount", type=String.class, parameters={})
    private Output<String> masterBillingAccount;

    /**
     * @return The name of the master billing account that the subaccount
     * will be created under in the form `{billing_account_id}` or `billingAccounts/{billing_account_id}`.
     * 
     */
    public Output<String> getMasterBillingAccount() {
        return this.masterBillingAccount;
    }
    /**
     * The resource name of the billing account in the form `billingAccounts/{billing_account_id}`.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the billing account in the form `billingAccounts/{billing_account_id}`.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * `true` if the billing account is open, `false` if the billing account is closed.
     * 
     */
    @OutputExport(name="open", type=Boolean.class, parameters={})
    private Output<Boolean> open;

    /**
     * @return `true` if the billing account is open, `false` if the billing account is closed.
     * 
     */
    public Output<Boolean> getOpen() {
        return this.open;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubAccount(String name, SubAccountArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/subAccount:SubAccount", name, args == null ? SubAccountArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SubAccount(String name, Input<String> id, @Nullable SubAccountState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:billing/subAccount:SubAccount", name, state, makeResourceOptions(options, id));
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
    public static SubAccount get(String name, Input<String> id, @Nullable SubAccountState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SubAccount(name, id, state, options);
    }
}