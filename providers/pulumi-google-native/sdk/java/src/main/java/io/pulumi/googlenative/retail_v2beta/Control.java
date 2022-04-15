// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.retail_v2beta.ControlArgs;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaRuleResponse;
import io.pulumi.googlenative.retail_v2beta.outputs.GoogleCloudRetailV2betaSearchRequestFacetSpecResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a Control. If the Control to create already exists, an ALREADY_EXISTS error is returned.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:retail/v2beta:Control")
public class Control extends io.pulumi.resources.CustomResource {
    /**
     * List of serving configuration ids that that are associated with this control. Note the association is managed via the ServingConfig, this is an output only denormalizeed view. Assumed to be in the same catalog.
     * 
     */
    @Export(name="associatedServingConfigIds", type=List.class, parameters={String.class})
    private Output<List<String>> associatedServingConfigIds;

    /**
     * @return List of serving configuration ids that that are associated with this control. Note the association is managed via the ServingConfig, this is an output only denormalizeed view. Assumed to be in the same catalog.
     * 
     */
    public Output<List<String>> associatedServingConfigIds() {
        return this.associatedServingConfigIds;
    }
    /**
     * The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human readable control display name. Used in Retail UI. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is thrown.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A facet specification to perform faceted search.
     * 
     */
    @Export(name="facetSpec", type=GoogleCloudRetailV2betaSearchRequestFacetSpecResponse.class, parameters={})
    private Output<GoogleCloudRetailV2betaSearchRequestFacetSpecResponse> facetSpec;

    /**
     * @return A facet specification to perform faceted search.
     * 
     */
    public Output<GoogleCloudRetailV2betaSearchRequestFacetSpecResponse> facetSpec() {
        return this.facetSpec;
    }
    /**
     * Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}controls/*
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. Fully qualified name projects/*{@literal /}locations/global/catalogs/*{@literal /}controls/*
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost "gShoe" when query full matches "Running Shoes".
     * 
     */
    @Export(name="rule", type=GoogleCloudRetailV2betaRuleResponse.class, parameters={})
    private Output<GoogleCloudRetailV2betaRuleResponse> rule;

    /**
     * @return A rule control - a condition-action pair. Enacts a set action when the condition is triggered. For example: Boost "gShoe" when query full matches "Running Shoes".
     * 
     */
    public Output<GoogleCloudRetailV2betaRuleResponse> rule() {
        return this.rule;
    }
    /**
     * Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
     * 
     */
    @Export(name="solutionTypes", type=List.class, parameters={String.class})
    private Output<List<String>> solutionTypes;

    /**
     * @return Immutable. The solution types that the serving config is used for. Currently we support setting only one type of solution at creation time. Only `SOLUTION_TYPE_SEARCH` value is supported at the moment.
     * 
     */
    public Output<List<String>> solutionTypes() {
        return this.solutionTypes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Control(String name) {
        this(name, ControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Control(String name, ControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Control(String name, ControlArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:retail/v2beta:Control", name, args == null ? ControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Control(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:retail/v2beta:Control", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Control get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Control(name, id, options);
    }
}
