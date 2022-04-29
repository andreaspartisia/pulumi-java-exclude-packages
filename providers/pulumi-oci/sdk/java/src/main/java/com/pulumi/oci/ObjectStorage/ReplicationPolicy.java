// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.ObjectStorage.ReplicationPolicyArgs;
import com.pulumi.oci.ObjectStorage.inputs.ReplicationPolicyState;
import com.pulumi.oci.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Replication Policy resource in Oracle Cloud Infrastructure Object Storage service.
 * 
 * Creates a replication policy for the specified bucket.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * ReplicationPolicies can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:ObjectStorage/replicationPolicy:ReplicationPolicy test_replication_policy &#34;n/{namespaceName}/b/{bucketName}/replicationPolicies/{replicationId}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:ObjectStorage/replicationPolicy:ReplicationPolicy")
public class ReplicationPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket. Avoid entering confidential information. Example: `my-new-bucket1`
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * @deprecated
     * The &#39;delete_object_in_destination_bucket&#39; field has been deprecated. It is no longer supported.
     * 
     */
    @Deprecated /* The 'delete_object_in_destination_bucket' field has been deprecated. It is no longer supported. */
    @Export(name="deleteObjectInDestinationBucket", type=String.class, parameters={})
    private Output</* @Nullable */ String> deleteObjectInDestinationBucket;

    public Output<Optional<String>> deleteObjectInDestinationBucket() {
        return Codegen.optional(this.deleteObjectInDestinationBucket);
    }
    /**
     * The bucket to replicate to in the destination region. Replication policy creation does not automatically create a destination bucket. Create the destination bucket before creating the policy.
     * 
     */
    @Export(name="destinationBucketName", type=String.class, parameters={})
    private Output<String> destinationBucketName;

    /**
     * @return The bucket to replicate to in the destination region. Replication policy creation does not automatically create a destination bucket. Create the destination bucket before creating the policy.
     * 
     */
    public Output<String> destinationBucketName() {
        return this.destinationBucketName;
    }
    /**
     * The destination region to replicate to, for example &#34;us-ashburn-1&#34;.
     * 
     */
    @Export(name="destinationRegionName", type=String.class, parameters={})
    private Output<String> destinationRegionName;

    /**
     * @return The destination region to replicate to, for example &#34;us-ashburn-1&#34;.
     * 
     */
    public Output<String> destinationRegionName() {
        return this.destinationRegionName;
    }
    /**
     * The name of the policy. Avoid entering confidential information.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the policy. Avoid entering confidential information.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Object Storage namespace used for the request.
     * 
     */
    @Export(name="namespace", type=String.class, parameters={})
    private Output<String> namespace;

    /**
     * @return The Object Storage namespace used for the request.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }
    /**
     * The replication status of the policy. If the status is CLIENT_ERROR, once the user fixes the issue described in the status message, the status will become ACTIVE.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The replication status of the policy. If the status is CLIENT_ERROR, once the user fixes the issue described in the status message, the status will become ACTIVE.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * A human-readable description of the status.
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return A human-readable description of the status.
     * 
     */
    public Output<String> statusMessage() {
        return this.statusMessage;
    }
    /**
     * The date when the replication policy was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date when the replication policy was created as per [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * Changes made to the source bucket before this time has been replicated.
     * 
     */
    @Export(name="timeLastSync", type=String.class, parameters={})
    private Output<String> timeLastSync;

    /**
     * @return Changes made to the source bucket before this time has been replicated.
     * 
     */
    public Output<String> timeLastSync() {
        return this.timeLastSync;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationPolicy(String name) {
        this(name, ReplicationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationPolicy(String name, ReplicationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationPolicy(String name, ReplicationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:ObjectStorage/replicationPolicy:ReplicationPolicy", name, args == null ? ReplicationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationPolicy(String name, Output<String> id, @Nullable ReplicationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:ObjectStorage/replicationPolicy:ReplicationPolicy", name, state, makeResourceOptions(options, id));
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
    public static ReplicationPolicy get(String name, Output<String> id, @Nullable ReplicationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationPolicy(name, id, state, options);
    }
}
