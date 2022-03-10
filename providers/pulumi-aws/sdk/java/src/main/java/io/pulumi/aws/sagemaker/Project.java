// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.ProjectArgs;
import io.pulumi.aws.sagemaker.inputs.ProjectState;
import io.pulumi.aws.sagemaker.outputs.ProjectServiceCatalogProvisioningDetails;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Sagemaker Project resource.
 * 
 *  > Note: If you are trying to use Sagemaker projects with Sagemaker studio you will need to add a tag with the key `sagemaker:studio-visibility` with value `true`. For more on requirements to use projects and permission needed see [AWS Docs](https://docs.aws.amazon.com/sagemaker/latest/dg/sagemaker-projects-templates-custom.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Sagemaker Projects can be imported using the `project_name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/project:Project example example
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/project:Project")
public class Project extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Project.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this Project.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A description for the project.
     * 
     */
    @OutputExport(name="projectDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectDescription;

    /**
     * @return A description for the project.
     * 
     */
    public Output</* @Nullable */ String> getProjectDescription() {
        return this.projectDescription;
    }
    /**
     * The ID of the project.
     * 
     */
    @OutputExport(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return The ID of the project.
     * 
     */
    public Output<String> getProjectId() {
        return this.projectId;
    }
    /**
     * The name of the Project.
     * 
     */
    @OutputExport(name="projectName", type=String.class, parameters={})
    private Output<String> projectName;

    /**
     * @return The name of the Project.
     * 
     */
    public Output<String> getProjectName() {
        return this.projectName;
    }
    /**
     * The product ID and provisioning artifact ID to provision a service catalog. See Service Catalog Provisioning Details below.
     * 
     */
    @OutputExport(name="serviceCatalogProvisioningDetails", type=ProjectServiceCatalogProvisioningDetails.class, parameters={})
    private Output<ProjectServiceCatalogProvisioningDetails> serviceCatalogProvisioningDetails;

    /**
     * @return The product ID and provisioning artifact ID to provision a service catalog. See Service Catalog Provisioning Details below.
     * 
     */
    public Output<ProjectServiceCatalogProvisioningDetails> getServiceCatalogProvisioningDetails() {
        return this.serviceCatalogProvisioningDetails;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(ProjectArgs.Builder a);
    }
    private static io.pulumi.aws.sagemaker.ProjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.sagemaker.ProjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Project(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/project:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Project(String name, Input<String> id, @Nullable ProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/project:Project", name, state, makeResourceOptions(options, id));
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
    public static Project get(String name, Input<String> id, @Nullable ProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}