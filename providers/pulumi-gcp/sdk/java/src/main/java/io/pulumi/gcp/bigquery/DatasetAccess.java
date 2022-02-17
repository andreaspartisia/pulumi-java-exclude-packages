// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.bigquery.DatasetAccessArgs;
import io.pulumi.gcp.bigquery.inputs.DatasetAccessState;
import io.pulumi.gcp.bigquery.outputs.DatasetAccessView;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:bigquery/datasetAccess:DatasetAccess")
public class DatasetAccess extends io.pulumi.resources.CustomResource {
    /**
     * If true, represents that that the iam_member in the config was translated to a different member type by the API, and is
     * stored in state as a different member type
     * 
     */
    @OutputExport(name="apiUpdatedMember", type=Boolean.class, parameters={})
    private Output<Boolean> apiUpdatedMember;

    /**
     * @return If true, represents that that the iam_member in the config was translated to a different member type by the API, and is
     * stored in state as a different member type
     * 
     */
    public Output<Boolean> getApiUpdatedMember() {
        return this.apiUpdatedMember;
    }
    /**
     * The ID of the dataset containing this table.
     * 
     */
    @OutputExport(name="datasetId", type=String.class, parameters={})
    private Output<String> datasetId;

    /**
     * @return The ID of the dataset containing this table.
     * 
     */
    public Output<String> getDatasetId() {
        return this.datasetId;
    }
    /**
     * A domain to grant access to. Any users signed in with the
     * domain specified will be granted the specified access
     * 
     */
    @OutputExport(name="domain", type=String.class, parameters={})
    private Output</* @Nullable */ String> domain;

    /**
     * @return A domain to grant access to. Any users signed in with the
     * domain specified will be granted the specified access
     * 
     */
    public Output</* @Nullable */ String> getDomain() {
        return this.domain;
    }
    /**
     * An email address of a Google Group to grant access to.
     * 
     */
    @OutputExport(name="groupByEmail", type=String.class, parameters={})
    private Output</* @Nullable */ String> groupByEmail;

    /**
     * @return An email address of a Google Group to grant access to.
     * 
     */
    public Output</* @Nullable */ String> getGroupByEmail() {
        return this.groupByEmail;
    }
    /**
     * Some other type of member that appears in the IAM Policy but isn't a user,
     * group, domain, or special group. For example: `allUsers`
     * 
     */
    @OutputExport(name="iamMember", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamMember;

    /**
     * @return Some other type of member that appears in the IAM Policy but isn't a user,
     * group, domain, or special group. For example: `allUsers`
     * 
     */
    public Output</* @Nullable */ String> getIamMember() {
        return this.iamMember;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * Describes the rights granted to the user specified by the other
     * member of the access object. Basic, predefined, and custom roles are
     * supported. Predefined roles that have equivalent basic roles are
     * swapped by the API to their basic counterparts, and will show a diff
     * post-create. See
     * [official docs](https://cloud.google.com/bigquery/docs/access-control).
     * 
     */
    @OutputExport(name="role", type=String.class, parameters={})
    private Output</* @Nullable */ String> role;

    /**
     * @return Describes the rights granted to the user specified by the other
     * member of the access object. Basic, predefined, and custom roles are
     * supported. Predefined roles that have equivalent basic roles are
     * swapped by the API to their basic counterparts, and will show a diff
     * post-create. See
     * [official docs](https://cloud.google.com/bigquery/docs/access-control).
     * 
     */
    public Output</* @Nullable */ String> getRole() {
        return this.role;
    }
    /**
     * A special group to grant access to. Possible values include:
     * 
     */
    @OutputExport(name="specialGroup", type=String.class, parameters={})
    private Output</* @Nullable */ String> specialGroup;

    /**
     * @return A special group to grant access to. Possible values include:
     * 
     */
    public Output</* @Nullable */ String> getSpecialGroup() {
        return this.specialGroup;
    }
    /**
     * An email address of a user to grant access to. For example:
     * fred@example.com
     * 
     */
    @OutputExport(name="userByEmail", type=String.class, parameters={})
    private Output</* @Nullable */ String> userByEmail;

    /**
     * @return An email address of a user to grant access to. For example:
     * fred@example.com
     * 
     */
    public Output</* @Nullable */ String> getUserByEmail() {
        return this.userByEmail;
    }
    /**
     * A view from a different dataset to grant access to. Queries
     * executed against that view will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that view is updated by any user, access to the view
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="view", type=DatasetAccessView.class, parameters={})
    private Output</* @Nullable */ DatasetAccessView> view;

    /**
     * @return A view from a different dataset to grant access to. Queries
     * executed against that view will have read access to tables in
     * this dataset. The role field is not required when this field is
     * set. If that view is updated by any user, access to the view
     * needs to be granted again via an update operation.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ DatasetAccessView> getView() {
        return this.view;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatasetAccess(String name, DatasetAccessArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/datasetAccess:DatasetAccess", name, args == null ? DatasetAccessArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DatasetAccess(String name, Input<String> id, @Nullable DatasetAccessState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/datasetAccess:DatasetAccess", name, state, makeResourceOptions(options, id));
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
    public static DatasetAccess get(String name, Input<String> id, @Nullable DatasetAccessState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DatasetAccess(name, id, state, options);
    }
}