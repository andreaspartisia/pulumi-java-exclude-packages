// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Optimizer.ProfileArgs;
import com.pulumi.oci.Optimizer.inputs.ProfileState;
import com.pulumi.oci.Optimizer.outputs.ProfileLevelsConfiguration;
import com.pulumi.oci.Optimizer.outputs.ProfileTargetCompartments;
import com.pulumi.oci.Optimizer.outputs.ProfileTargetTags;
import com.pulumi.oci.Utilities;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Profile resource in Oracle Cloud Infrastructure Optimizer service.
 * 
 * Creates a new profile.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Profiles can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Optimizer/profile:Profile test_profile &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Optimizer/profile:Profile")
public class Profile extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) The time period over which to collect data for the recommendations, measured in number of days.
     * 
     */
    @Export(name="aggregationIntervalInDays", type=Integer.class, parameters={})
    private Output<Integer> aggregationIntervalInDays;

    /**
     * @return (Updatable) The time period over which to collect data for the recommendations, measured in number of days.
     * 
     */
    public Output<Integer> aggregationIntervalInDays() {
        return this.aggregationIntervalInDays;
    }
    /**
     * The OCID of the tenancy. The tenancy is the root compartment.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return The OCID of the tenancy. The tenancy is the root compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) Text describing the profile. Avoid entering confidential information.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) Text describing the profile. Avoid entering confidential information.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) Simple key-value pair applied without any predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.  Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair applied without any predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Exists for cross-compatibility only.  Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * (Updatable) A list of configuration levels for each recommendation.
     * 
     */
    @Export(name="levelsConfiguration", type=ProfileLevelsConfiguration.class, parameters={})
    private Output<ProfileLevelsConfiguration> levelsConfiguration;

    /**
     * @return (Updatable) A list of configuration levels for each recommendation.
     * 
     */
    public Output<ProfileLevelsConfiguration> levelsConfiguration() {
        return this.levelsConfiguration;
    }
    /**
     * (Updatable) The name assigned to the profile. Avoid entering confidential information.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return (Updatable) The name assigned to the profile. Avoid entering confidential information.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The profile&#39;s current state.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The profile&#39;s current state.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * (Updatable) Optional. The compartments specified in the profile override for a recommendation.
     * 
     */
    @Export(name="targetCompartments", type=ProfileTargetCompartments.class, parameters={})
    private Output<ProfileTargetCompartments> targetCompartments;

    /**
     * @return (Updatable) Optional. The compartments specified in the profile override for a recommendation.
     * 
     */
    public Output<ProfileTargetCompartments> targetCompartments() {
        return this.targetCompartments;
    }
    /**
     * (Updatable) Optional. The tags specified in the profile override for a recommendation.
     * 
     */
    @Export(name="targetTags", type=ProfileTargetTags.class, parameters={})
    private Output<ProfileTargetTags> targetTags;

    /**
     * @return (Updatable) Optional. The tags specified in the profile override for a recommendation.
     * 
     */
    public Output<ProfileTargetTags> targetTags() {
        return this.targetTags;
    }
    /**
     * The date and time the profile was created, in the format defined by RFC3339.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time the profile was created, in the format defined by RFC3339.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The date and time the profile was last updated, in the format defined by RFC3339.
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The date and time the profile was last updated, in the format defined by RFC3339.
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Profile(String name) {
        this(name, ProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Profile(String name, ProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Profile(String name, ProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Optimizer/profile:Profile", name, args == null ? ProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Profile(String name, Output<String> id, @Nullable ProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Optimizer/profile:Profile", name, state, makeResourceOptions(options, id));
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
    public static Profile get(String name, Output<String> id, @Nullable ProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Profile(name, id, state, options);
    }
}
