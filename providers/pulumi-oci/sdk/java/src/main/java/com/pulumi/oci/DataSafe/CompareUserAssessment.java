// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.DataSafe.CompareUserAssessmentArgs;
import com.pulumi.oci.DataSafe.inputs.CompareUserAssessmentState;
import com.pulumi.oci.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides the Compare User Assessment resource in Oracle Cloud Infrastructure Data Safe service.
 * 
 * Compares two user assessments. For this comparison, a user assessment can be a saved, a latest assessment, or a baseline.
 * As an example, it can be used to compare a user assessment saved or a latest assessment with a baseline.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CompareUserAssessment can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:DataSafe/compareUserAssessment:CompareUserAssessment test_compare_user_assessment &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:DataSafe/compareUserAssessment:CompareUserAssessment")
public class CompareUserAssessment extends com.pulumi.resources.CustomResource {
    /**
     * The OCID of the user assessment to be compared. You can compare with another user assessment, a latest assessment, or a baseline.
     * 
     */
    @Export(name="comparisonUserAssessmentId", type=String.class, parameters={})
    private Output<String> comparisonUserAssessmentId;

    /**
     * @return The OCID of the user assessment to be compared. You can compare with another user assessment, a latest assessment, or a baseline.
     * 
     */
    public Output<String> comparisonUserAssessmentId() {
        return this.comparisonUserAssessmentId;
    }
    /**
     * The OCID of the user assessment.
     * 
     */
    @Export(name="userAssessmentId", type=String.class, parameters={})
    private Output<String> userAssessmentId;

    /**
     * @return The OCID of the user assessment.
     * 
     */
    public Output<String> userAssessmentId() {
        return this.userAssessmentId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CompareUserAssessment(String name) {
        this(name, CompareUserAssessmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CompareUserAssessment(String name, CompareUserAssessmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CompareUserAssessment(String name, CompareUserAssessmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataSafe/compareUserAssessment:CompareUserAssessment", name, args == null ? CompareUserAssessmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CompareUserAssessment(String name, Output<String> id, @Nullable CompareUserAssessmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataSafe/compareUserAssessment:CompareUserAssessment", name, state, makeResourceOptions(options, id));
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
    public static CompareUserAssessment get(String name, Output<String> id, @Nullable CompareUserAssessmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CompareUserAssessment(name, id, state, options);
    }
}
