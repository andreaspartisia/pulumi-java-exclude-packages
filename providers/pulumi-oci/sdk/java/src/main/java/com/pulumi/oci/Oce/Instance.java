// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Oce;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.Oce.InstanceArgs;
import com.pulumi.oci.Oce.inputs.InstanceState;
import com.pulumi.oci.Utilities;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Oce Instance resource in Oracle Cloud Infrastructure Content and Experience service.
 * 
 * Creates a new OceInstance.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * OceInstances can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:Oce/instance:Instance test_oce_instance &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:Oce/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * (Updatable) a list of add-on features for the ocm instance
     * 
     */
    @Export(name="addOnFeatures", type=List.class, parameters={String.class})
    private Output<List<String>> addOnFeatures;

    /**
     * @return (Updatable) a list of add-on features for the ocm instance
     * 
     */
    public Output<List<String>> addOnFeatures() {
        return this.addOnFeatures;
    }
    /**
     * Admin Email for Notification
     * 
     */
    @Export(name="adminEmail", type=String.class, parameters={})
    private Output<String> adminEmail;

    /**
     * @return Admin Email for Notification
     * 
     */
    public Output<String> adminEmail() {
        return this.adminEmail;
    }
    /**
     * (Updatable) Compartment Identifier
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) Compartment Identifier
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) OceInstance description
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) OceInstance description
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * Unique GUID identifier that is immutable on creation
     * 
     */
    @Export(name="guid", type=String.class, parameters={})
    private Output<String> guid;

    /**
     * @return Unique GUID identifier that is immutable on creation
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * Identity Cloud Service access token identifying a stripe and service administrator user
     * 
     */
    @Export(name="idcsAccessToken", type=String.class, parameters={})
    private Output<String> idcsAccessToken;

    /**
     * @return Identity Cloud Service access token identifying a stripe and service administrator user
     * 
     */
    public Output<String> idcsAccessToken() {
        return this.idcsAccessToken;
    }
    /**
     * IDCS Tenancy Identifier
     * 
     */
    @Export(name="idcsTenancy", type=String.class, parameters={})
    private Output<String> idcsTenancy;

    /**
     * @return IDCS Tenancy Identifier
     * 
     */
    public Output<String> idcsTenancy() {
        return this.idcsTenancy;
    }
    /**
     * Flag indicating whether the instance access is private or public
     * 
     */
    @Export(name="instanceAccessType", type=String.class, parameters={})
    private Output<String> instanceAccessType;

    /**
     * @return Flag indicating whether the instance access is private or public
     * 
     */
    public Output<String> instanceAccessType() {
        return this.instanceAccessType;
    }
    /**
     * (Updatable) Flag indicating whether the instance license is new cloud or bring your own license
     * 
     */
    @Export(name="instanceLicenseType", type=String.class, parameters={})
    private Output<String> instanceLicenseType;

    /**
     * @return (Updatable) Flag indicating whether the instance license is new cloud or bring your own license
     * 
     */
    public Output<String> instanceLicenseType() {
        return this.instanceLicenseType;
    }
    /**
     * (Updatable) Instance type based on its usage
     * 
     */
    @Export(name="instanceUsageType", type=String.class, parameters={})
    private Output<String> instanceUsageType;

    /**
     * @return (Updatable) Instance type based on its usage
     * 
     */
    public Output<String> instanceUsageType() {
        return this.instanceUsageType;
    }
    /**
     * Details of the current state of the instance lifecycle
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return Details of the current state of the instance lifecycle
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * OceInstance Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return OceInstance Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Object Storage Namespace of Tenancy
     * 
     */
    @Export(name="objectStorageNamespace", type=String.class, parameters={})
    private Output<String> objectStorageNamespace;

    /**
     * @return Object Storage Namespace of Tenancy
     * 
     */
    public Output<String> objectStorageNamespace() {
        return this.objectStorageNamespace;
    }
    /**
     * SERVICE data. Example: `{&#34;service&#34;: {&#34;IDCS&#34;: &#34;value&#34;}}`
     * 
     */
    @Export(name="service", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> service;

    /**
     * @return SERVICE data. Example: `{&#34;service&#34;: {&#34;IDCS&#34;: &#34;value&#34;}}`
     * 
     */
    public Output<Map<String,Object>> service() {
        return this.service;
    }
    /**
     * The current state of the instance lifecycle.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of the instance lifecycle.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    @Export(name="stateMessage", type=String.class, parameters={})
    private Output<String> stateMessage;

    /**
     * @return An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public Output<String> stateMessage() {
        return this.stateMessage;
    }
    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    @Export(name="systemTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> systemTags;

    /**
     * @return Usage of system tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Output<Map<String,Object>> systemTags() {
        return this.systemTags;
    }
    /**
     * Tenancy Identifier
     * 
     */
    @Export(name="tenancyId", type=String.class, parameters={})
    private Output<String> tenancyId;

    /**
     * @return Tenancy Identifier
     * 
     */
    public Output<String> tenancyId() {
        return this.tenancyId;
    }
    /**
     * Tenancy Name
     * 
     */
    @Export(name="tenancyName", type=String.class, parameters={})
    private Output<String> tenancyName;

    /**
     * @return Tenancy Name
     * 
     */
    public Output<String> tenancyName() {
        return this.tenancyName;
    }
    /**
     * The time the the OceInstance was created. An RFC3339 formatted datetime string
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time the the OceInstance was created. An RFC3339 formatted datetime string
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The time the OceInstance was updated. An RFC3339 formatted datetime string
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The time the OceInstance was updated. An RFC3339 formatted datetime string
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * Upgrade schedule type representing service to be upgraded immediately whenever latest version is released or delay upgrade of the service to previous released version
     * 
     */
    @Export(name="upgradeSchedule", type=String.class, parameters={})
    private Output<String> upgradeSchedule;

    /**
     * @return Upgrade schedule type representing service to be upgraded immediately whenever latest version is released or delay upgrade of the service to previous released version
     * 
     */
    public Output<String> upgradeSchedule() {
        return this.upgradeSchedule;
    }
    /**
     * (Updatable) Web Application Firewall(WAF) primary domain
     * 
     */
    @Export(name="wafPrimaryDomain", type=String.class, parameters={})
    private Output<String> wafPrimaryDomain;

    /**
     * @return (Updatable) Web Application Firewall(WAF) primary domain
     * 
     */
    public Output<String> wafPrimaryDomain() {
        return this.wafPrimaryDomain;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Oce/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:Oce/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
