// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.apigatewayv2.ModelArgs;
import io.pulumi.aws.apigatewayv2.inputs.ModelState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 [model](https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-models).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_model` can be imported by using the API identifier and model identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/model:Model example aabbccddee/1122334
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/model:Model")
public class Model extends io.pulumi.resources.CustomResource {
    /**
     * The API identifier.
     * 
     */
    @OutputExport(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API identifier.
     * 
     */
    public Output<String> getApiId() {
        return this.apiId;
    }
    /**
     * The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
     * 
     */
    @OutputExport(name="contentType", type=String.class, parameters={})
    private Output<String> contentType;

    /**
     * @return The content-type for the model, for example, `application/json`. Must be between 1 and 256 characters in length.
     * 
     */
    public Output<String> getContentType() {
        return this.contentType;
    }
    /**
     * The description of the model. Must be between 1 and 128 characters in length.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the model. Must be between 1 and 128 characters in length.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the model. Must be alphanumeric. Must be between 1 and 128 characters in length.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
     * 
     */
    @OutputExport(name="schema", type=String.class, parameters={})
    private Output<String> schema;

    /**
     * @return The schema for the model. This should be a [JSON schema draft 4](https://tools.ietf.org/html/draft-zyp-json-schema-04) model. Must be less than or equal to 32768 characters in length.
     * 
     */
    public Output<String> getSchema() {
        return this.schema;
    }

    public interface BuilderApplicator {
        public void apply(ModelArgs.Builder a);
    }
    private static io.pulumi.aws.apigatewayv2.ModelArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.apigatewayv2.ModelArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Model(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Model(String name) {
        this(name, ModelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Model(String name, ModelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Model(String name, ModelArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/model:Model", name, args == null ? ModelArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Model(String name, Input<String> id, @Nullable ModelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/model:Model", name, state, makeResourceOptions(options, id));
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
    public static Model get(String name, Input<String> id, @Nullable ModelState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Model(name, id, state, options);
    }
}