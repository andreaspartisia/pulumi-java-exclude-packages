// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.elasticbeanstalk.ApplicationVersionArgs;
import io.pulumi.aws.elasticbeanstalk.inputs.ApplicationVersionState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Elastic Beanstalk Application Version Resource. Elastic Beanstalk allows
 * you to deploy and manage applications in the AWS cloud without worrying about
 * the infrastructure that runs those applications.
 * 
 * This resource creates a Beanstalk Application Version that can be deployed to a Beanstalk
 * Environment.
 * 
 * > **NOTE on Application Version Resource:**  When using the Application Version resource with multiple
 * Elastic Beanstalk Environments it is possible that an error may be returned
 * when attempting to delete an Application Version while it is still in use by a different environment.
 * To work around this you can either create each environment in a separate AWS account or create your `aws.elasticbeanstalk.ApplicationVersion` resources with a unique names in your Elastic Beanstalk Application. For example &lt;revision&gt;-&lt;environment&gt;.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:elasticbeanstalk/applicationVersion:ApplicationVersion")
public class ApplicationVersion extends io.pulumi.resources.CustomResource {
    /**
     * Name of the Beanstalk Application the version is associated with.
     * 
     */
    @OutputExport(name="application", type=String.class, parameters={})
    private Output<String> application;

    /**
     * @return Name of the Beanstalk Application the version is associated with.
     * 
     */
    public Output<String> getApplication() {
        return this.application;
    }
    /**
     * ARN assigned by AWS for this Elastic Beanstalk Application.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN assigned by AWS for this Elastic Beanstalk Application.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * S3 bucket that contains the Application Version source bundle.
     * 
     */
    @OutputExport(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return S3 bucket that contains the Application Version source bundle.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * Short description of the Application Version.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Short description of the Application Version.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
     * 
     */
    @OutputExport(name="forceDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDelete;

    /**
     * @return On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDelete() {
        return this.forceDelete;
    }
    /**
     * S3 object that is the Application Version source bundle.
     * 
     */
    @OutputExport(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return S3 object that is the Application Version source bundle.
     * 
     */
    public Output<String> getKey() {
        return this.key;
    }
    /**
     * Unique name for the this Application Version.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Unique name for the this Application Version.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(ApplicationVersionArgs.Builder a);
    }
    private static io.pulumi.aws.elasticbeanstalk.ApplicationVersionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.elasticbeanstalk.ApplicationVersionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ApplicationVersion(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApplicationVersion(String name) {
        this(name, ApplicationVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApplicationVersion(String name, ApplicationVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApplicationVersion(String name, ApplicationVersionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticbeanstalk/applicationVersion:ApplicationVersion", name, args == null ? ApplicationVersionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ApplicationVersion(String name, Input<String> id, @Nullable ApplicationVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:elasticbeanstalk/applicationVersion:ApplicationVersion", name, state, makeResourceOptions(options, id));
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
    public static ApplicationVersion get(String name, Input<String> id, @Nullable ApplicationVersionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ApplicationVersion(name, id, state, options);
    }
}