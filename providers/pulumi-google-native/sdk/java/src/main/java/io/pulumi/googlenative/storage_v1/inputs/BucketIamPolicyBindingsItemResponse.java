// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.storage_v1.inputs.ExprResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BucketIamPolicyBindingsItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final BucketIamPolicyBindingsItemResponse Empty = new BucketIamPolicyBindingsItemResponse();

    /**
     * The condition that is associated with this binding. NOTE: an unsatisfied condition will not allow user access via current binding. Different bindings, including their conditions, are examined independently.
     * 
     */
    @Import(name="condition", required=true)
      private final ExprResponse condition;

    public ExprResponse condition() {
        return this.condition;
    }

    /**
     * A collection of identifiers for members who may assume the provided role. Recognized identifiers are as follows:
     * - allUsers — A special identifier that represents anyone on the internet; with or without a Google account.
     * - allAuthenticatedUsers — A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * - user:emailid — An email address that represents a specific account. For example, user:alice@gmail.com or user:joe@example.com.
     * - serviceAccount:emailid — An email address that represents a service account. For example,  serviceAccount:my-other-app@appspot.gserviceaccount.com .
     * - group:emailid — An email address that represents a Google group. For example, group:admins@example.com.
     * - domain:domain — A Google Apps domain name that represents all the users of that domain. For example, domain:google.com or domain:example.com.
     * - projectOwner:projectid — Owners of the given project. For example, projectOwner:my-example-project
     * - projectEditor:projectid — Editors of the given project. For example, projectEditor:my-example-project
     * - projectViewer:projectid — Viewers of the given project. For example, projectViewer:my-example-project
     * 
     */
    @Import(name="members", required=true)
      private final List<String> members;

    public List<String> members() {
        return this.members;
    }

    /**
     * The role to which members belong. Two types of roles are supported: new IAM roles, which grant permissions that do not map directly to those provided by ACLs, and legacy IAM roles, which do map directly to ACL permissions. All roles are of the format roles/storage.specificRole.
     * The new IAM roles are:
     * - roles/storage.admin — Full control of Google Cloud Storage resources.
     * - roles/storage.objectViewer — Read-Only access to Google Cloud Storage objects.
     * - roles/storage.objectCreator — Access to create objects in Google Cloud Storage.
     * - roles/storage.objectAdmin — Full control of Google Cloud Storage objects.   The legacy IAM roles are:
     * - roles/storage.legacyObjectReader — Read-only access to objects without listing. Equivalent to an ACL entry on an object with the READER role.
     * - roles/storage.legacyObjectOwner — Read/write access to existing objects without listing. Equivalent to an ACL entry on an object with the OWNER role.
     * - roles/storage.legacyBucketReader — Read access to buckets with object listing. Equivalent to an ACL entry on a bucket with the READER role.
     * - roles/storage.legacyBucketWriter — Read access to buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the WRITER role.
     * - roles/storage.legacyBucketOwner — Read and write access to existing buckets with object listing/creation/deletion. Equivalent to an ACL entry on a bucket with the OWNER role.
     * 
     */
    @Import(name="role", required=true)
      private final String role;

    public String role() {
        return this.role;
    }

    public BucketIamPolicyBindingsItemResponse(
        ExprResponse condition,
        List<String> members,
        String role) {
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private BucketIamPolicyBindingsItemResponse() {
        this.condition = null;
        this.members = List.of();
        this.role = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketIamPolicyBindingsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExprResponse condition;
        private List<String> members;
        private String role;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketIamPolicyBindingsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder condition(ExprResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }        public BucketIamPolicyBindingsItemResponse build() {
            return new BucketIamPolicyBindingsItemResponse(condition, members, role);
        }
    }
}
