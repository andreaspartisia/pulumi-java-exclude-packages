// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.secretmanager_v1.SecretArgs;
import io.pulumi.googlenative.secretmanager_v1.outputs.ReplicationResponse;
import io.pulumi.googlenative.secretmanager_v1.outputs.RotationResponse;
import io.pulumi.googlenative.secretmanager_v1.outputs.TopicResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new Secret containing no SecretVersions.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:secretmanager/v1:Secret")
public class Secret extends io.pulumi.resources.CustomResource {
    /**
     * The time at which the Secret was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time at which the Secret was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. Etag of the currently stored Secret.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return Optional. Etag of the currently stored Secret.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Optional. Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * 
     */
    @Export(name="expireTime", type=String.class, parameters={})
    private Output<String> expireTime;

    /**
     * @return Optional. Timestamp in UTC when the Secret is scheduled to expire. This is always provided on output, regardless of what was sent on input.
     * 
     */
    public Output<String> expireTime() {
        return this.expireTime;
    }
    /**
     * The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> labels;

    /**
     * @return The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
     * 
     */
    public Output<Map<String,String>> labels() {
        return this.labels;
    }
    /**
     * The resource name of the Secret in the format `projects/*{@literal /}secrets/*`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the Secret in the format `projects/*{@literal /}secrets/*`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
     */
    @Export(name="replication", type=ReplicationResponse.class, parameters={})
    private Output<ReplicationResponse> replication;

    /**
     * @return Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created.
     * 
     */
    public Output<ReplicationResponse> replication() {
        return this.replication;
    }
    /**
     * Optional. Rotation policy attached to the Secret. May be excluded if there is no rotation policy.
     * 
     */
    @Export(name="rotation", type=RotationResponse.class, parameters={})
    private Output<RotationResponse> rotation;

    /**
     * @return Optional. Rotation policy attached to the Secret. May be excluded if there is no rotation policy.
     * 
     */
    public Output<RotationResponse> rotation() {
        return this.rotation;
    }
    /**
     * Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * 
     */
    @Export(name="topics", type=List.class, parameters={TopicResponse.class})
    private Output<List<TopicResponse>> topics;

    /**
     * @return Optional. A list of up to 10 Pub/Sub topics to which messages are published when control plane operations are called on the secret or its versions.
     * 
     */
    public Output<List<TopicResponse>> topics() {
        return this.topics;
    }
    /**
     * Input only. The TTL for the Secret.
     * 
     */
    @Export(name="ttl", type=String.class, parameters={})
    private Output<String> ttl;

    /**
     * @return Input only. The TTL for the Secret.
     * 
     */
    public Output<String> ttl() {
        return this.ttl;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Secret(String name) {
        this(name, SecretArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Secret(String name, SecretArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Secret(String name, SecretArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:secretmanager/v1:Secret", name, args == null ? SecretArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Secret(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:secretmanager/v1:Secret", name, null, makeResourceOptions(options, id));
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
    public static Secret get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Secret(name, id, options);
    }
}
