// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.PropertyActivationArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.PropertyActivationState;
import com.pulumi.akamai.outputs.PropertyActivationComplianceRecord;
import com.pulumi.akamai.outputs.PropertyActivationRuleError;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/propertyActivation:PropertyActivation")
public class PropertyActivation extends com.pulumi.resources.CustomResource {
    @Export(name="activationId", refs={String.class}, tree="[0]")
    private Output<String> activationId;

    public Output<String> activationId() {
        return this.activationId;
    }
    /**
     * Automatically acknowledge all rule warnings for activation to continue. Default is false
     * 
     */
    @Export(name="autoAcknowledgeRuleWarnings", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> autoAcknowledgeRuleWarnings;

    /**
     * @return Automatically acknowledge all rule warnings for activation to continue. Default is false
     * 
     */
    public Output<Optional<Boolean>> autoAcknowledgeRuleWarnings() {
        return Codegen.optional(this.autoAcknowledgeRuleWarnings);
    }
    /**
     * Provides an audit record when activating on a production network
     * 
     */
    @Export(name="complianceRecord", refs={PropertyActivationComplianceRecord.class}, tree="[0]")
    private Output</* @Nullable */ PropertyActivationComplianceRecord> complianceRecord;

    /**
     * @return Provides an audit record when activating on a production network
     * 
     */
    public Output<Optional<PropertyActivationComplianceRecord>> complianceRecord() {
        return Codegen.optional(this.complianceRecord);
    }
    @Export(name="contacts", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> contacts;

    public Output<List<String>> contacts() {
        return this.contacts;
    }
    @Export(name="errors", refs={String.class}, tree="[0]")
    private Output<String> errors;

    public Output<String> errors() {
        return this.errors;
    }
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> network;

    public Output<Optional<String>> network() {
        return Codegen.optional(this.network);
    }
    /**
     * assigns a log message to the activation request
     * 
     */
    @Export(name="note", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> note;

    /**
     * @return assigns a log message to the activation request
     * 
     */
    public Output<Optional<String>> note() {
        return Codegen.optional(this.note);
    }
    @Export(name="propertyId", refs={String.class}, tree="[0]")
    private Output<String> propertyId;

    public Output<String> propertyId() {
        return this.propertyId;
    }
    @Export(name="ruleErrors", refs={List.class,PropertyActivationRuleError.class}, tree="[0,1]")
    private Output<List<PropertyActivationRuleError>> ruleErrors;

    public Output<List<PropertyActivationRuleError>> ruleErrors() {
        return this.ruleErrors;
    }
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }
    @Export(name="version", refs={Integer.class}, tree="[0]")
    private Output<Integer> version;

    public Output<Integer> version() {
        return this.version;
    }
    @Export(name="warnings", refs={String.class}, tree="[0]")
    private Output<String> warnings;

    public Output<String> warnings() {
        return this.warnings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PropertyActivation(java.lang.String name) {
        this(name, PropertyActivationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PropertyActivation(String name, PropertyActivationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PropertyActivation(java.lang.String name, PropertyActivationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/propertyActivation:PropertyActivation", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private PropertyActivation(java.lang.String name, Output<java.lang.String> id, @Nullable PropertyActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/propertyActivation:PropertyActivation", name, state, makeResourceOptions(options, id));
    }

    private static PropertyActivationArgs makeArgs(PropertyActivationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PropertyActivationArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("akamai:properties/propertyActivation:PropertyActivation").build())
            ))
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
    public static PropertyActivation get(java.lang.String name, Output<java.lang.String> id, @Nullable PropertyActivationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PropertyActivation(name, id, state, options);
    }
}
