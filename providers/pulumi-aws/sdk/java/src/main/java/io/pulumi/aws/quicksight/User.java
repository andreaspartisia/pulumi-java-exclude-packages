// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.quicksight.UserArgs;
import io.pulumi.aws.quicksight.inputs.UserState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing QuickSight User
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Importing is currently not supported on this resource.
 * 
 */
@ResourceType(type="aws:quicksight/user:User")
public class User extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the user
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the user
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @OutputExport(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    /**
     * @return The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    public Output<String> getAwsAccountId() {
        return this.awsAccountId;
    }
    /**
     * The email address of the user that you want to register.
     * 
     */
    @OutputExport(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address of the user that you want to register.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * The ARN of the IAM user or role that you are registering with Amazon QuickSight.
     * 
     */
    @OutputExport(name="iamArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> iamArn;

    /**
     * @return The ARN of the IAM user or role that you are registering with Amazon QuickSight.
     * 
     */
    public Output</* @Nullable */ String> getIamArn() {
        return this.iamArn;
    }
    /**
     * Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`. If `IAM` is specified, the `iam_arn` must also be specified.
     * 
     */
    @OutputExport(name="identityType", type=String.class, parameters={})
    private Output<String> identityType;

    /**
     * @return Amazon QuickSight supports several ways of managing the identity of users. This parameter accepts either  `IAM` or `QUICKSIGHT`. If `IAM` is specified, the `iam_arn` must also be specified.
     * 
     */
    public Output<String> getIdentityType() {
        return this.identityType;
    }
    /**
     * The namespace. Currently, you should set this to `default`.
     * 
     */
    @OutputExport(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    /**
     * @return The namespace. Currently, you should set this to `default`.
     * 
     */
    public Output</* @Nullable */ String> getNamespace() {
        return this.namespace;
    }
    /**
     * The name of the IAM session to use when assuming roles that can embed QuickSight dashboards. Only valid for registering users using an assumed IAM role. Additionally, if registering multiple users using the same IAM role, each user needs to have a unique session name.
     * 
     */
    @OutputExport(name="sessionName", type=String.class, parameters={})
    private Output</* @Nullable */ String> sessionName;

    /**
     * @return The name of the IAM session to use when assuming roles that can embed QuickSight dashboards. Only valid for registering users using an assumed IAM role. Additionally, if registering multiple users using the same IAM role, each user needs to have a unique session name.
     * 
     */
    public Output</* @Nullable */ String> getSessionName() {
        return this.sessionName;
    }
    /**
     * The Amazon QuickSight user name that you want to create for the user you are registering. Only valid for registering a user with `identity_type` set to `QUICKSIGHT`.
     * 
     */
    @OutputExport(name="userName", type=String.class, parameters={})
    private Output</* @Nullable */ String> userName;

    /**
     * @return The Amazon QuickSight user name that you want to create for the user you are registering. Only valid for registering a user with `identity_type` set to `QUICKSIGHT`.
     * 
     */
    public Output</* @Nullable */ String> getUserName() {
        return this.userName;
    }
    /**
     * The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
     * 
     */
    @OutputExport(name="userRole", type=String.class, parameters={})
    private Output<String> userRole;

    /**
     * @return The Amazon QuickSight role of the user. The user role can be one of the following: `READER`, `AUTHOR`, or `ADMIN`
     * 
     */
    public Output<String> getUserRole() {
        return this.userRole;
    }

    public interface BuilderApplicator {
        public void apply(UserArgs.Builder a);
    }
    private static io.pulumi.aws.quicksight.UserArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.quicksight.UserArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public User(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/user:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private User(String name, Input<String> id, @Nullable UserState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/user:User", name, state, makeResourceOptions(options, id));
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
    public static User get(String name, Input<String> id, @Nullable UserState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, state, options);
    }
}