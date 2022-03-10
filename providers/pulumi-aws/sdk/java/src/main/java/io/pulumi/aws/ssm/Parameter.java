// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssm.ParameterArgs;
import io.pulumi.aws.ssm.inputs.ParameterState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an SSM Parameter resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * SSM Parameters can be imported using the `parameter store name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ssm/parameter:Parameter my_param /my_path/my_paramname
 * ```
 * 
 */
@ResourceType(type="aws:ssm/parameter:Parameter")
public class Parameter extends io.pulumi.resources.CustomResource {
    /**
     * A regular expression used to validate the parameter value.
     * 
     */
    @OutputExport(name="allowedPattern", type=String.class, parameters={})
    private Output</* @Nullable */ String> allowedPattern;

    /**
     * @return A regular expression used to validate the parameter value.
     * 
     */
    public Output</* @Nullable */ String> getAllowedPattern() {
        return this.allowedPattern;
    }
    /**
     * The ARN of the parameter.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the parameter.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The data_type of the parameter. Valid values: text and aws:ec2:image for AMI format, see the [Native parameter support for Amazon Machine Image IDs
     * ](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html)
     * 
     */
    @OutputExport(name="dataType", type=String.class, parameters={})
    private Output<String> dataType;

    /**
     * @return The data_type of the parameter. Valid values: text and aws:ec2:image for AMI format, see the [Native parameter support for Amazon Machine Image IDs
     * ](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-ec2-aliases.html)
     * 
     */
    public Output<String> getDataType() {
        return this.dataType;
    }
    /**
     * The description of the parameter.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the parameter.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The KMS key id or arn for encrypting a SecureString.
     * 
     */
    @OutputExport(name="keyId", type=String.class, parameters={})
    private Output<String> keyId;

    /**
     * @return The KMS key id or arn for encrypting a SecureString.
     * 
     */
    public Output<String> getKeyId() {
        return this.keyId;
    }
    /**
     * The name of the parameter. If the name contains a path (e.g., any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the parameter. If the name contains a path (e.g., any forward slashes (`/`)), it must be fully qualified with a leading forward slash (`/`). For additional requirements and constraints, see the [AWS SSM User Guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-parameter-name-constraints.html).
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
     * 
     */
    @OutputExport(name="overwrite", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> overwrite;

    /**
     * @return Overwrite an existing parameter. If not specified, will default to `false` if the resource has not been created by this provider to avoid overwrite of existing resource and will default to `true` otherwise (lifecycle rules should then be used to manage the update behavior).
     * 
     */
    public Output</* @Nullable */ Boolean> getOverwrite() {
        return this.overwrite;
    }
    /**
     * A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the object. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard`, `Advanced`, and `Intelligent-Tiering`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
     * 
     */
    @OutputExport(name="tier", type=String.class, parameters={})
    private Output</* @Nullable */ String> tier;

    /**
     * @return The tier of the parameter. If not specified, will default to `Standard`. Valid tiers are `Standard`, `Advanced`, and `Intelligent-Tiering`. For more information on parameter tiers, see the [AWS SSM Parameter tier comparison and guide](https://docs.aws.amazon.com/systems-manager/latest/userguide/parameter-store-advanced-parameters.html).
     * 
     */
    public Output</* @Nullable */ String> getTier() {
        return this.tier;
    }
    /**
     * The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the parameter. Valid types are `String`, `StringList` and `SecureString`.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The value of the parameter.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return The value of the parameter.
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }
    /**
     * The version of the parameter.
     * 
     */
    @OutputExport(name="version", type=Integer.class, parameters={})
    private Output<Integer> version;

    /**
     * @return The version of the parameter.
     * 
     */
    public Output<Integer> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(ParameterArgs.Builder a);
    }
    private static io.pulumi.aws.ssm.ParameterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.ssm.ParameterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Parameter(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Parameter(String name) {
        this(name, ParameterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Parameter(String name, ParameterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Parameter(String name, ParameterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/parameter:Parameter", name, args == null ? ParameterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Parameter(String name, Input<String> id, @Nullable ParameterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ssm/parameter:Parameter", name, state, makeResourceOptions(options, id));
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
    public static Parameter get(String name, Input<String> id, @Nullable ParameterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Parameter(name, id, state, options);
    }
}