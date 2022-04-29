// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Ons;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Ons.SubscriptionArgs;
import com.pulumi.oci.Ons.inputs.SubscriptionState;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Subscription resource in Oracle Cloud Infrastructure Notifications service.
 * 
 * Creates a subscription for the specified topic and sends a subscription confirmation URL to the endpoint. The subscription remains in &#34;Pending&#34; status until it has been confirmed.
 * For information about confirming subscriptions, see
 * [To confirm a subscription](https://docs.cloud.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#confirmSub).
 * 
 * Transactions Per Minute (TPM) per-tenancy limit for this operation: 60.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Subscriptions can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Ons/subscription:Subscription test_subscription &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Ons/subscription:Subscription")
public class Subscription extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for the subscription.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for the subscription.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * The time when this suscription was created.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The time when this suscription was created.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * The delivery policy of the subscription. Stored as a JSON string.
     * 
     */
    @Export(name="deliveryPolicy", type=String.class, parameters={})
    private Output<String> deliveryPolicy;

    /**
     * @return The delivery policy of the subscription. Stored as a JSON string.
     * 
     */
    public Output<String> deliveryPolicy() {
        return this.deliveryPolicy;
    }
    /**
     * A locator that corresponds to the subscription protocol. For example, an email address for a subscription that uses the `EMAIL` protocol, or a URL for a subscription that uses an HTTP-based protocol. HTTP-based protocols use URL endpoints that begin with &#34;http:&#34; or &#34;https:&#34;. A URL cannot exceed 512 characters. Avoid entering confidential information.
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return A locator that corresponds to the subscription protocol. For example, an email address for a subscription that uses the `EMAIL` protocol, or a URL for a subscription that uses an HTTP-based protocol. HTTP-based protocols use URL endpoints that begin with &#34;http:&#34; or &#34;https:&#34;. A URL cannot exceed 512 characters. Avoid entering confidential information.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * For optimistic concurrency control. See `if-match`.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return For optimistic concurrency control. See `if-match`.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * The protocol used for the subscription.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol used for the subscription.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * The lifecycle state of the subscription. The status of a new subscription is PENDING; when confirmed, the subscription status changes to ACTIVE.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The lifecycle state of the subscription. The status of a new subscription is PENDING; when confirmed, the subscription status changes to ACTIVE.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic for the subscription.
     * 
     */
    @Export(name="topicId", type=String.class, parameters={})
    private Output<String> topicId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic for the subscription.
     * 
     */
    public Output<String> topicId() {
        return this.topicId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subscription(String name) {
        this(name, SubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subscription(String name, SubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subscription(String name, SubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Ons/subscription:Subscription", name, args == null ? SubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subscription(String name, Output<String> id, @Nullable SubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Ons/subscription:Subscription", name, state, makeResourceOptions(options, id));
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
    public static Subscription get(String name, Output<String> id, @Nullable SubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subscription(name, id, state, options);
    }
}
