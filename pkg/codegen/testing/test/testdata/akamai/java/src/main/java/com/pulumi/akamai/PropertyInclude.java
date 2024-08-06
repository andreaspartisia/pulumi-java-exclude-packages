// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.akamai.PropertyIncludeArgs;
import com.pulumi.akamai.Utilities;
import com.pulumi.akamai.inputs.PropertyIncludeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="akamai:index/propertyInclude:PropertyInclude")
public class PropertyInclude extends com.pulumi.resources.CustomResource {
    /**
     * Identifies the contract to which the include is assigned
     * 
     */
    @Export(name="contractId", refs={String.class}, tree="[0]")
    private Output<String> contractId;

    /**
     * @return Identifies the contract to which the include is assigned
     * 
     */
    public Output<String> contractId() {
        return this.contractId;
    }
    /**
     * Identifies the group to which the include is assigned
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return Identifies the group to which the include is assigned
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * Specifies the most recent version of the include
     * 
     */
    @Export(name="latestVersion", refs={Integer.class}, tree="[0]")
    private Output<Integer> latestVersion;

    /**
     * @return Specifies the most recent version of the include
     * 
     */
    public Output<Integer> latestVersion() {
        return this.latestVersion;
    }
    /**
     * A descriptive name for the include
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A descriptive name for the include
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The product assigned to the include
     * 
     */
    @Export(name="productId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> productId;

    /**
     * @return The product assigned to the include
     * 
     */
    public Output<Optional<String>> productId() {
        return Codegen.optional(this.productId);
    }
    /**
     * The most recent version to be activated to the production network
     * 
     */
    @Export(name="productionVersion", refs={String.class}, tree="[0]")
    private Output<String> productionVersion;

    /**
     * @return The most recent version to be activated to the production network
     * 
     */
    public Output<String> productionVersion() {
        return this.productionVersion;
    }
    /**
     * Rule validation errors
     * 
     */
    @Export(name="ruleErrors", refs={String.class}, tree="[0]")
    private Output<String> ruleErrors;

    /**
     * @return Rule validation errors
     * 
     */
    public Output<String> ruleErrors() {
        return this.ruleErrors;
    }
    /**
     * Indicates the versioned set of features and criteria
     * 
     */
    @Export(name="ruleFormat", refs={String.class}, tree="[0]")
    private Output<String> ruleFormat;

    /**
     * @return Indicates the versioned set of features and criteria
     * 
     */
    public Output<String> ruleFormat() {
        return this.ruleFormat;
    }
    /**
     * Rule validation warnings
     * 
     */
    @Export(name="ruleWarnings", refs={String.class}, tree="[0]")
    private Output<String> ruleWarnings;

    /**
     * @return Rule validation warnings
     * 
     */
    public Output<String> ruleWarnings() {
        return this.ruleWarnings;
    }
    /**
     * Property Rules as JSON
     * 
     */
    @Export(name="rules", refs={String.class}, tree="[0]")
    private Output<String> rules;

    /**
     * @return Property Rules as JSON
     * 
     */
    public Output<String> rules() {
        return this.rules;
    }
    /**
     * The most recent version to be activated to the staging network
     * 
     */
    @Export(name="stagingVersion", refs={String.class}, tree="[0]")
    private Output<String> stagingVersion;

    /**
     * @return The most recent version to be activated to the staging network
     * 
     */
    public Output<String> stagingVersion() {
        return this.stagingVersion;
    }
    /**
     * Specifies the type of the include, either &#39;MICROSERVICES&#39; or &#39;COMMON_SETTINGS&#39;
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Specifies the type of the include, either &#39;MICROSERVICES&#39; or &#39;COMMON_SETTINGS&#39;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PropertyInclude(java.lang.String name) {
        this(name, PropertyIncludeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PropertyInclude(String name, PropertyIncludeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PropertyInclude(java.lang.String name, PropertyIncludeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/propertyInclude:PropertyInclude", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private PropertyInclude(java.lang.String name, Output<java.lang.String> id, @Nullable PropertyIncludeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("akamai:index/propertyInclude:PropertyInclude", name, state, makeResourceOptions(options, id));
    }

    private static PropertyIncludeArgs makeArgs(PropertyIncludeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? PropertyIncludeArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static PropertyInclude get(java.lang.String name, Output<java.lang.String> id, @Nullable PropertyIncludeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PropertyInclude(name, id, state, options);
    }
}
