// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.apigee_v1.ArchiveDeploymentArgs;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new ArchiveDeployment.
 * 
 */
@ResourceType(type="google-native:apigee/v1:ArchiveDeployment")
public class ArchiveDeployment extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the Archive Deployment was created in milliseconds since the epoch.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time at which the Archive Deployment was created in milliseconds since the epoch.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Input only. The Google Cloud Storage signed URL returned from GenerateUploadUrl and used to upload the Archive zip file.
     * 
     */
    @Export(name="gcsUri", type=String.class, parameters={})
    private Output<String> gcsUri;

    /**
     * @return Input only. The Google Cloud Storage signed URL returned from GenerateUploadUrl and used to upload the Archive zip file.
     * 
     */
    public Output<String> gcsUri() {
        return this.gcsUri;
    }
    /**
     * User-supplied key-value pairs used to organize ArchiveDeployments. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return User-supplied key-value pairs used to organize ArchiveDeployments. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * Name of the Archive Deployment in the following format: `organizations/{org}/environments/{env}/archiveDeployments/{id}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Archive Deployment in the following format: `organizations/{org}/environments/{env}/archiveDeployments/{id}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A reference to the LRO that created this Archive Deployment in the following format: `organizations/{org}/operations/{id}`
     * 
     */
    @Export(name="operation", type=String.class, parameters={})
    private Output<String> operation;

    /**
     * @return A reference to the LRO that created this Archive Deployment in the following format: `organizations/{org}/operations/{id}`
     * 
     */
    public Output<String> operation() {
        return this.operation;
    }
    /**
     * The time at which the Archive Deployment was updated in milliseconds since the epoch.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The time at which the Archive Deployment was updated in milliseconds since the epoch.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ArchiveDeployment(String name) {
        this(name, ArchiveDeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ArchiveDeployment(String name, ArchiveDeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ArchiveDeployment(String name, ArchiveDeploymentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:ArchiveDeployment", name, args == null ? ArchiveDeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ArchiveDeployment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:ArchiveDeployment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ArchiveDeployment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ArchiveDeployment(name, id, options);
    }
}
