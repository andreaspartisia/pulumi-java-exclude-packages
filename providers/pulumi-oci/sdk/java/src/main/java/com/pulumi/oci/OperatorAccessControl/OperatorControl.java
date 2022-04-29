// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OperatorAccessControl;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.OperatorAccessControl.OperatorControlArgs;
import com.pulumi.oci.OperatorAccessControl.inputs.OperatorControlState;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * This resource provides the Operator Control resource in Oracle Cloud Infrastructure Operator Access Control service.
 * 
 * Creates an Operator Control.
 * 
 * ## Import
 * 
 * OperatorControls can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:OperatorAccessControl/operatorControl:OperatorControl test_operator_control &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:OperatorAccessControl/operatorControl:OperatorControl")
public class OperatorControl extends com.pulumi.resources.CustomResource {
    /**
     * List of operator actions that need explicit approval. Any operator action not in the pre-approved list will require explicit approval. Access requests associated with a resource governed by this operator control will be require explicit approval if the access request contains any operator action in this list.
     * 
     */
    @Export(name="approvalRequiredOpActionLists", type=List.class, parameters={String.class})
    private Output<List<String>> approvalRequiredOpActionLists;

    /**
     * @return List of operator actions that need explicit approval. Any operator action not in the pre-approved list will require explicit approval. Access requests associated with a resource governed by this operator control will be require explicit approval if the access request contains any operator action in this list.
     * 
     */
    public Output<List<String>> approvalRequiredOpActionLists() {
        return this.approvalRequiredOpActionLists;
    }
    /**
     * (Updatable) List of user groups who can approve an access request associated with a resource governed by this operator control.
     * 
     */
    @Export(name="approverGroupsLists", type=List.class, parameters={String.class})
    private Output<List<String>> approverGroupsLists;

    /**
     * @return (Updatable) List of user groups who can approve an access request associated with a resource governed by this operator control.
     * 
     */
    public Output<List<String>> approverGroupsLists() {
        return this.approverGroupsLists;
    }
    /**
     * (Updatable) List of users who can approve an access request associated with a resource governed by this operator control.
     * 
     */
    @Export(name="approversLists", type=List.class, parameters={String.class})
    private Output<List<String>> approversLists;

    /**
     * @return (Updatable) List of users who can approve an access request associated with a resource governed by this operator control.
     * 
     */
    public Output<List<String>> approversLists() {
        return this.approversLists;
    }
    /**
     * (Updatable) The OCID of the compartment that contains this operator control.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment that contains this operator control.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * (Updatable) Description of the operator control.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return (Updatable) Description of the operator control.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * (Updatable) List of emailId.
     * 
     */
    @Export(name="emailIdLists", type=List.class, parameters={String.class})
    private Output<List<String>> emailIdLists;

    /**
     * @return (Updatable) List of emailId.
     * 
     */
    public Output<List<String>> emailIdLists() {
        return this.emailIdLists;
    }
    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * (Updatable) Whether all the operator actions have been pre-approved. If yes, all access requests associated with a resource governed by this operator control  will be auto-approved.
     * 
     */
    @Export(name="isFullyPreApproved", type=Boolean.class, parameters={})
    private Output<Boolean> isFullyPreApproved;

    /**
     * @return (Updatable) Whether all the operator actions have been pre-approved. If yes, all access requests associated with a resource governed by this operator control  will be auto-approved.
     * 
     */
    public Output<Boolean> isFullyPreApproved() {
        return this.isFullyPreApproved;
    }
    /**
     * Description associated with the latest modification of the operator control.
     * 
     */
    @Export(name="lastModifiedInfo", type=String.class, parameters={})
    private Output<String> lastModifiedInfo;

    /**
     * @return Description associated with the latest modification of the operator control.
     * 
     */
    public Output<String> lastModifiedInfo() {
        return this.lastModifiedInfo;
    }
    /**
     * (Updatable) Name of the operator control.
     * 
     */
    @Export(name="operatorControlName", type=String.class, parameters={})
    private Output<String> operatorControlName;

    /**
     * @return (Updatable) Name of the operator control.
     * 
     */
    public Output<String> operatorControlName() {
        return this.operatorControlName;
    }
    /**
     * (Updatable) List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be auto-approved if the access request only contain operator actions in the pre-approved list.
     * 
     */
    @Export(name="preApprovedOpActionLists", type=List.class, parameters={String.class})
    private Output<List<String>> preApprovedOpActionLists;

    /**
     * @return (Updatable) List of pre-approved operator actions. Access requests associated with a resource governed by this operator control will be auto-approved if the access request only contain operator actions in the pre-approved list.
     * 
     */
    public Output<List<String>> preApprovedOpActionLists() {
        return this.preApprovedOpActionLists;
    }
    /**
     * resourceType for which the OperatorControl is applicable
     * 
     */
    @Export(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    /**
     * @return resourceType for which the OperatorControl is applicable
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }
    /**
     * The current lifecycle state of the operator control.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current lifecycle state of the operator control.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * (Updatable) This is the message that will be displayed to the operator users while accessing the system.
     * 
     */
    @Export(name="systemMessage", type=String.class, parameters={})
    private Output<String> systemMessage;

    /**
     * @return (Updatable) This is the message that will be displayed to the operator users while accessing the system.
     * 
     */
    public Output<String> systemMessage() {
        return this.systemMessage;
    }
    /**
     * Time when the operator control was created expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    @Export(name="timeOfCreation", type=String.class, parameters={})
    private Output<String> timeOfCreation;

    /**
     * @return Time when the operator control was created expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    public Output<String> timeOfCreation() {
        return this.timeOfCreation;
    }
    /**
     * Time when deleted expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;. Note a deleted operator control still stays in the system, so that you can still audit operator actions associated with access requests raised on target resources governed by the deleted operator control.
     * 
     */
    @Export(name="timeOfDeletion", type=String.class, parameters={})
    private Output<String> timeOfDeletion;

    /**
     * @return Time when deleted expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;. Note a deleted operator control still stays in the system, so that you can still audit operator actions associated with access requests raised on target resources governed by the deleted operator control.
     * 
     */
    public Output<String> timeOfDeletion() {
        return this.timeOfDeletion;
    }
    /**
     * Time when the operator control was last modified expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    @Export(name="timeOfModification", type=String.class, parameters={})
    private Output<String> timeOfModification;

    /**
     * @return Time when the operator control was last modified expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: &#39;2020-05-22T21:10:29.600Z&#39;
     * 
     */
    public Output<String> timeOfModification() {
        return this.timeOfModification;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OperatorControl(String name) {
        this(name, OperatorControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OperatorControl(String name, OperatorControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OperatorControl(String name, OperatorControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:OperatorAccessControl/operatorControl:OperatorControl", name, args == null ? OperatorControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OperatorControl(String name, Output<String> id, @Nullable OperatorControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:OperatorAccessControl/operatorControl:OperatorControl", name, state, makeResourceOptions(options, id));
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
    public static OperatorControl get(String name, Output<String> id, @Nullable OperatorControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OperatorControl(name, id, state, options);
    }
}
