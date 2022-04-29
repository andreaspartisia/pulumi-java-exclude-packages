// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Budget;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Budget.RuleArgs;
import com.pulumi.oci.Budget.inputs.RuleState;
import com.pulumi.oci.Utilities;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Alert Rule resource in Oracle Cloud Infrastructure Budget service.
 * 
 * Creates a new Alert Rule.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AlertRules can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Budget/rule:Rule test_alert_rule &#34;budgets/{budgetId}/alertRules/{alertRuleId}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Budget/rule:Rule")
public class Rule extends com.pulumi.resources.CustomResource {
    /**
     * The unique Budget OCID
     * 
     */
    @Export(name="budgetId", type=String.class, parameters={})
    private Output<String> budgetId;

    /**
     * @return The unique Budget OCID
     * 
     */
    public Output<String> budgetId() {
        return this.budgetId;
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
     * (Updatable) The description of the alert rule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) The description of the alert rule.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) The name of the alert rule.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return (Updatable) The name of the alert rule.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
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
     * (Updatable) The message to be sent to the recipients when alert rule is triggered.
     * 
     */
    @Export(name="message", type=String.class, parameters={})
    private Output<String> message;

    /**
     * @return (Updatable) The message to be sent to the recipients when alert rule is triggered.
     * 
     */
    public Output<String> message() {
        return this.message;
    }
    /**
     * (Updatable) The audience that will receive the alert when it triggers. An empty string is interpreted as null.
     * 
     */
    @Export(name="recipients", type=String.class, parameters={})
    private Output</* @Nullable */ String> recipients;

    /**
     * @return (Updatable) The audience that will receive the alert when it triggers. An empty string is interpreted as null.
     * 
     */
    public Output<Optional<String>> recipients() {
        return Codegen.optional(this.recipients);
    }
    /**
     * The current state of the alert rule.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the alert rule.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * (Updatable) The threshold for triggering the alert expressed as a whole number or decimal value. If thresholdType is ABSOLUTE, threshold can have at most 12 digits before the decimal point and up to 2 digits after the decimal point. If thresholdType is PERCENTAGE, the maximum value is 10000 and can have up to 2 digits after the decimal point.
     * 
     */
    @Export(name="threshold", type=Double.class, parameters={})
    private Output<Double> threshold;

    /**
     * @return (Updatable) The threshold for triggering the alert expressed as a whole number or decimal value. If thresholdType is ABSOLUTE, threshold can have at most 12 digits before the decimal point and up to 2 digits after the decimal point. If thresholdType is PERCENTAGE, the maximum value is 10000 and can have up to 2 digits after the decimal point.
     * 
     */
    public Output<Double> threshold() {
        return this.threshold;
    }
    /**
     * (Updatable) The type of threshold.
     * 
     */
    @Export(name="thresholdType", type=String.class, parameters={})
    private Output<String> thresholdType;

    /**
     * @return (Updatable) The type of threshold.
     * 
     */
    public Output<String> thresholdType() {
        return this.thresholdType;
    }
    /**
     * Time when budget was created
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return Time when budget was created
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * Time when budget was updated
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return Time when budget was updated
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * (Updatable) Type of alert. Valid values are ACTUAL (the alert will trigger based on actual usage) or FORECAST (the alert will trigger based on predicted usage).
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return (Updatable) Type of alert. Valid values are ACTUAL (the alert will trigger based on actual usage) or FORECAST (the alert will trigger based on predicted usage).
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Version of the alert rule. Starts from 1 and increments by 1.
     * 
     */
    @Export(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return Version of the alert rule. Starts from 1 and increments by 1.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Rule(String name) {
        this(name, RuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Rule(String name, RuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Rule(String name, RuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Budget/rule:Rule", name, args == null ? RuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Rule(String name, Output<String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Budget/rule:Rule", name, state, makeResourceOptions(options, id));
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
    public static Rule get(String name, Output<String> id, @Nullable RuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Rule(name, id, state, options);
    }
}
