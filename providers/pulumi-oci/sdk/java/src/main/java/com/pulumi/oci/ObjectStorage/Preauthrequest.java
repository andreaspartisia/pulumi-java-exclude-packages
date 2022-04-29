// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.ObjectStorage.PreauthrequestArgs;
import com.pulumi.oci.ObjectStorage.inputs.PreauthrequestState;
import com.pulumi.oci.Utilities;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * This resource provides the Preauthenticated Request resource in Oracle Cloud Infrastructure Object Storage service.
 * 
 * Creates a pre-authenticated request specific to the bucket.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * PreauthenticatedRequests can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:ObjectStorage/preauthrequest:Preauthrequest test_preauthenticated_request &#34;n/{namespaceName}/b/{bucketName}/p/{parId}&#34;
 * ```
 * 
 */
@ResourceType(type="oci:ObjectStorage/preauthrequest:Preauthrequest")
public class Preauthrequest extends com.pulumi.resources.CustomResource {
    /**
     * The operation that can be performed on this resource. Allowed Values: `ObjectRead`, `ObjectWrite`, `ObjectReadWrite`, `AnyObjectReadWrite` or `AnyObjectRead`
     * 
     */
    @Export(name="accessType", type=String.class, parameters={})
    private Output<String> accessType;

    /**
     * @return The operation that can be performed on this resource. Allowed Values: `ObjectRead`, `ObjectWrite`, `ObjectReadWrite`, `AnyObjectReadWrite` or `AnyObjectRead`
     * 
     */
    public Output<String> accessType() {
        return this.accessType;
    }
    /**
     * The URI to embed in the URL `https://objectstorage.${var.region}.oraclecloud.com{var.access_uri}` when using the pre-authenticated request.
     * 
     */
    @Export(name="accessUri", type=String.class, parameters={})
    private Output<String> accessUri;

    /**
     * @return The URI to embed in the URL `https://objectstorage.${var.region}.oraclecloud.com{var.access_uri}` when using the pre-authenticated request.
     * 
     */
    public Output<String> accessUri() {
        return this.accessUri;
    }
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
     * Specifies whether a list operation is allowed on a PAR with accessType &#34;AnyObjectRead&#34; or &#34;AnyObjectReadWrite&#34;. Deny: Prevents the user from performing a list operation. ListObjects: Authorizes the user to perform a list operation.
     * 
     */
    @Export(name="bucketListingAction", type=String.class, parameters={})
    private Output<String> bucketListingAction;

    /**
     * @return Specifies whether a list operation is allowed on a PAR with accessType &#34;AnyObjectRead&#34; or &#34;AnyObjectReadWrite&#34;. Deny: Prevents the user from performing a list operation. ListObjects: Authorizes the user to perform a list operation.
     * 
     */
    public Output<String> bucketListingAction() {
        return this.bucketListingAction;
    }
    /**
     * A user-specified name for the pre-authenticated request. Names can be helpful in managing pre-authenticated requests. Avoid entering confidential information.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A user-specified name for the pre-authenticated request. Names can be helpful in managing pre-authenticated requests. Avoid entering confidential information.
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
     * Deprecated. Instead use `object_name`. Requests that include both `object` and `object_name` will be rejected. (Optional) The name of the object that is being granted access to by the pre-authenticated request. Avoid entering confidential information. The object name can be null and if so, the pre-authenticated request grants access to the entire bucket if the access type allows that. The object name can be a prefix as well, in that case pre-authenticated request grants access to all the objects within the bucket starting with that prefix provided that we have the correct access type.
     * 
     * @deprecated
     * The &#39;object&#39; field has been deprecated. Please use &#39;object_name&#39; instead.
     * 
     */
    @Deprecated /* The 'object' field has been deprecated. Please use 'object_name' instead. */
    @Export(name="object", type=String.class, parameters={})
    private Output<String> object;

    /**
     * @return Deprecated. Instead use `object_name`. Requests that include both `object` and `object_name` will be rejected. (Optional) The name of the object that is being granted access to by the pre-authenticated request. Avoid entering confidential information. The object name can be null and if so, the pre-authenticated request grants access to the entire bucket if the access type allows that. The object name can be a prefix as well, in that case pre-authenticated request grants access to all the objects within the bucket starting with that prefix provided that we have the correct access type.
     * 
     */
    public Output<String> object() {
        return this.object;
    }
    /**
     * The name of the object that is being granted access to by the pre-authenticated request. Avoid entering confidential information. The object name can be null and if so, the pre-authenticated request grants access to the entire bucket if the access type allows that. The object name can be a prefix as well, in that case pre-authenticated request grants access to all the objects within the bucket starting with that prefix provided that we have the correct access type.
     * 
     */
    @Export(name="objectName", type=String.class, parameters={})
    private Output<String> objectName;

    /**
     * @return The name of the object that is being granted access to by the pre-authenticated request. Avoid entering confidential information. The object name can be null and if so, the pre-authenticated request grants access to the entire bucket if the access type allows that. The object name can be a prefix as well, in that case pre-authenticated request grants access to all the objects within the bucket starting with that prefix provided that we have the correct access type.
     * 
     */
    public Output<String> objectName() {
        return this.objectName;
    }
    /**
     * The unique identifier for the pre-authenticated request. This can be used to manage operations against the pre-authenticated request, such as GET or DELETE.
     * 
     */
    @Export(name="parId", type=String.class, parameters={})
    private Output<String> parId;

    /**
     * @return The unique identifier for the pre-authenticated request. This can be used to manage operations against the pre-authenticated request, such as GET or DELETE.
     * 
     */
    public Output<String> parId() {
        return this.parId;
    }
    /**
     * The date when the pre-authenticated request was created as per specification [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date when the pre-authenticated request was created as per specification [RFC 3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The expiration date for the pre-authenticated request as per [RFC 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request will no longer be valid.
     * 
     */
    @Export(name="timeExpires", type=String.class, parameters={})
    private Output<String> timeExpires;

    /**
     * @return The expiration date for the pre-authenticated request as per [RFC 3339](https://tools.ietf.org/html/rfc3339). After this date the pre-authenticated request will no longer be valid.
     * 
     */
    public Output<String> timeExpires() {
        return this.timeExpires;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Preauthrequest(String name) {
        this(name, PreauthrequestArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Preauthrequest(String name, PreauthrequestArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Preauthrequest(String name, PreauthrequestArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:ObjectStorage/preauthrequest:Preauthrequest", name, args == null ? PreauthrequestArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Preauthrequest(String name, Output<String> id, @Nullable PreauthrequestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:ObjectStorage/preauthrequest:Preauthrequest", name, state, makeResourceOptions(options, id));
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
    public static Preauthrequest get(String name, Output<String> id, @Nullable PreauthrequestState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Preauthrequest(name, id, state, options);
    }
}
