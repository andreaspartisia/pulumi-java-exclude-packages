// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ObjectStorage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.ObjectStorage.outputs.GetBucketRetentionRule;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBucketResult {
    /**
     * @return The type of public access enabled on this bucket. A bucket is set to `NoPublicAccess` by default, which only allows an authenticated caller to access the bucket and its contents. When `ObjectRead` is enabled on the bucket, public access is allowed for the `GetObject`, `HeadObject`, and `ListObjects` operations. When `ObjectReadWithoutList` is enabled on the bucket, public access is allowed for the `GetObject` and `HeadObject` operations.
     * 
     */
    private final String accessType;
    /**
     * @return The approximate number of objects in the bucket. Count statistics are reported periodically. You will see a lag between what is displayed and the actual object count.
     * 
     */
    private final String approximateCount;
    /**
     * @return The approximate total size in bytes of all objects in the bucket. Size statistics are reported periodically. You will see a lag between what is displayed and the actual size of the bucket.
     * 
     */
    private final String approximateSize;
    /**
     * @return The auto tiering status on the bucket. A bucket is created with auto tiering `Disabled` by default. For auto tiering `InfrequentAccess`, objects are transitioned automatically between the &#39;Standard&#39; and &#39;InfrequentAccess&#39; tiers based on the access pattern of the objects.
     * 
     */
    private final String autoTiering;
    /**
     * @return The OCID of the bucket which is a Oracle assigned unique identifier for this resource type (bucket). `bucket_id` cannot be used for bucket lookup.
     * 
     */
    private final String bucketId;
    /**
     * @return The compartment ID in which the bucket is authorized.
     * 
     */
    private final String compartmentId;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the bucket.
     * 
     */
    private final String createdBy;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The entity tag (ETag) for the bucket.
     * 
     */
    private final String etag;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    private final String id;
    /**
     * @return Whether or not this bucket is read only. By default, `isReadOnly` is set to `false`. This will be set to &#39;true&#39; when this bucket is configured as a destination in a replication policy.
     * 
     */
    private final Boolean isReadOnly;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a master encryption key used to call the Key Management service to generate a data encryption key or to encrypt or decrypt a data encryption key.
     * 
     */
    private final String kmsKeyId;
    /**
     * @return Arbitrary string keys and values for user-defined metadata.
     * 
     */
    private final Map<String,Object> metadata;
    /**
     * @return The name of the bucket. Avoid entering confidential information. Example: my-new-bucket1
     * 
     */
    private final String name;
    /**
     * @return The Object Storage namespace in which the bucket resides.
     * 
     */
    private final String namespace;
    /**
     * @return Whether or not events are emitted for object state changes in this bucket. By default, `objectEventsEnabled` is set to `false`. Set `objectEventsEnabled` to `true` to emit events for object state changes. For more information about events, see [Overview of Events](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/eventsoverview.htm).
     * 
     */
    private final Boolean objectEventsEnabled;
    /**
     * @return The entity tag (ETag) for the live object lifecycle policy on the bucket.
     * 
     */
    private final String objectLifecyclePolicyEtag;
    /**
     * @return Whether or not this bucket is a replication source. By default, `replicationEnabled` is set to `false`. This will be set to &#39;true&#39; when you create a replication policy for the bucket.
     * 
     */
    private final Boolean replicationEnabled;
    /**
     * @return User specified list of retention rules for the bucket.
     * 
     */
    private final List<GetBucketRetentionRule> retentionRules;
    /**
     * @return The storage tier type assigned to the bucket. A bucket is set to `Standard` tier by default, which means objects uploaded or copied to the bucket will be in the standard storage tier. When the `Archive` tier type is set explicitly for a bucket, objects uploaded or copied to the bucket will be stored in archive storage. The `storageTier` property is immutable after bucket is created.
     * 
     */
    private final String storageTier;
    /**
     * @return The date and time the bucket was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     * 
     */
    private final String timeCreated;
    /**
     * @return The versioning status on the bucket. A bucket is created with versioning `Disabled` by default. For versioning `Enabled`, objects are protected from overwrites and deletes, by maintaining their version history. When versioning is `Suspended`, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     * 
     */
    private final String versioning;

    @CustomType.Constructor
    private GetBucketResult(
        @CustomType.Parameter("accessType") String accessType,
        @CustomType.Parameter("approximateCount") String approximateCount,
        @CustomType.Parameter("approximateSize") String approximateSize,
        @CustomType.Parameter("autoTiering") String autoTiering,
        @CustomType.Parameter("bucketId") String bucketId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("createdBy") String createdBy,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isReadOnly") Boolean isReadOnly,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("metadata") Map<String,Object> metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("objectEventsEnabled") Boolean objectEventsEnabled,
        @CustomType.Parameter("objectLifecyclePolicyEtag") String objectLifecyclePolicyEtag,
        @CustomType.Parameter("replicationEnabled") Boolean replicationEnabled,
        @CustomType.Parameter("retentionRules") List<GetBucketRetentionRule> retentionRules,
        @CustomType.Parameter("storageTier") String storageTier,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("versioning") String versioning) {
        this.accessType = accessType;
        this.approximateCount = approximateCount;
        this.approximateSize = approximateSize;
        this.autoTiering = autoTiering;
        this.bucketId = bucketId;
        this.compartmentId = compartmentId;
        this.createdBy = createdBy;
        this.definedTags = definedTags;
        this.etag = etag;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isReadOnly = isReadOnly;
        this.kmsKeyId = kmsKeyId;
        this.metadata = metadata;
        this.name = name;
        this.namespace = namespace;
        this.objectEventsEnabled = objectEventsEnabled;
        this.objectLifecyclePolicyEtag = objectLifecyclePolicyEtag;
        this.replicationEnabled = replicationEnabled;
        this.retentionRules = retentionRules;
        this.storageTier = storageTier;
        this.timeCreated = timeCreated;
        this.versioning = versioning;
    }

    /**
     * @return The type of public access enabled on this bucket. A bucket is set to `NoPublicAccess` by default, which only allows an authenticated caller to access the bucket and its contents. When `ObjectRead` is enabled on the bucket, public access is allowed for the `GetObject`, `HeadObject`, and `ListObjects` operations. When `ObjectReadWithoutList` is enabled on the bucket, public access is allowed for the `GetObject` and `HeadObject` operations.
     * 
     */
    public String accessType() {
        return this.accessType;
    }
    /**
     * @return The approximate number of objects in the bucket. Count statistics are reported periodically. You will see a lag between what is displayed and the actual object count.
     * 
     */
    public String approximateCount() {
        return this.approximateCount;
    }
    /**
     * @return The approximate total size in bytes of all objects in the bucket. Size statistics are reported periodically. You will see a lag between what is displayed and the actual size of the bucket.
     * 
     */
    public String approximateSize() {
        return this.approximateSize;
    }
    /**
     * @return The auto tiering status on the bucket. A bucket is created with auto tiering `Disabled` by default. For auto tiering `InfrequentAccess`, objects are transitioned automatically between the &#39;Standard&#39; and &#39;InfrequentAccess&#39; tiers based on the access pattern of the objects.
     * 
     */
    public String autoTiering() {
        return this.autoTiering;
    }
    /**
     * @return The OCID of the bucket which is a Oracle assigned unique identifier for this resource type (bucket). `bucket_id` cannot be used for bucket lookup.
     * 
     */
    public String bucketId() {
        return this.bucketId;
    }
    /**
     * @return The compartment ID in which the bucket is authorized.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the bucket.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The entity tag (ETag) for the bucket.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return Whether or not this bucket is read only. By default, `isReadOnly` is set to `false`. This will be set to &#39;true&#39; when this bucket is configured as a destination in a replication policy.
     * 
     */
    public Boolean isReadOnly() {
        return this.isReadOnly;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a master encryption key used to call the Key Management service to generate a data encryption key or to encrypt or decrypt a data encryption key.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * @return Arbitrary string keys and values for user-defined metadata.
     * 
     */
    public Map<String,Object> metadata() {
        return this.metadata;
    }
    /**
     * @return The name of the bucket. Avoid entering confidential information. Example: my-new-bucket1
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Object Storage namespace in which the bucket resides.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return Whether or not events are emitted for object state changes in this bucket. By default, `objectEventsEnabled` is set to `false`. Set `objectEventsEnabled` to `true` to emit events for object state changes. For more information about events, see [Overview of Events](https://docs.cloud.oracle.com/iaas/Content/Events/Concepts/eventsoverview.htm).
     * 
     */
    public Boolean objectEventsEnabled() {
        return this.objectEventsEnabled;
    }
    /**
     * @return The entity tag (ETag) for the live object lifecycle policy on the bucket.
     * 
     */
    public String objectLifecyclePolicyEtag() {
        return this.objectLifecyclePolicyEtag;
    }
    /**
     * @return Whether or not this bucket is a replication source. By default, `replicationEnabled` is set to `false`. This will be set to &#39;true&#39; when you create a replication policy for the bucket.
     * 
     */
    public Boolean replicationEnabled() {
        return this.replicationEnabled;
    }
    /**
     * @return User specified list of retention rules for the bucket.
     * 
     */
    public List<GetBucketRetentionRule> retentionRules() {
        return this.retentionRules;
    }
    /**
     * @return The storage tier type assigned to the bucket. A bucket is set to `Standard` tier by default, which means objects uploaded or copied to the bucket will be in the standard storage tier. When the `Archive` tier type is set explicitly for a bucket, objects uploaded or copied to the bucket will be stored in archive storage. The `storageTier` property is immutable after bucket is created.
     * 
     */
    public String storageTier() {
        return this.storageTier;
    }
    /**
     * @return The date and time the bucket was created, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The versioning status on the bucket. A bucket is created with versioning `Disabled` by default. For versioning `Enabled`, objects are protected from overwrites and deletes, by maintaining their version history. When versioning is `Suspended`, the previous versions will still remain but new versions will no longer be created when overwitten or deleted.
     * 
     */
    public String versioning() {
        return this.versioning;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessType;
        private String approximateCount;
        private String approximateSize;
        private String autoTiering;
        private String bucketId;
        private String compartmentId;
        private String createdBy;
        private Map<String,Object> definedTags;
        private String etag;
        private Map<String,Object> freeformTags;
        private String id;
        private Boolean isReadOnly;
        private String kmsKeyId;
        private Map<String,Object> metadata;
        private String name;
        private String namespace;
        private Boolean objectEventsEnabled;
        private String objectLifecyclePolicyEtag;
        private Boolean replicationEnabled;
        private List<GetBucketRetentionRule> retentionRules;
        private String storageTier;
        private String timeCreated;
        private String versioning;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.approximateCount = defaults.approximateCount;
    	      this.approximateSize = defaults.approximateSize;
    	      this.autoTiering = defaults.autoTiering;
    	      this.bucketId = defaults.bucketId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.createdBy = defaults.createdBy;
    	      this.definedTags = defaults.definedTags;
    	      this.etag = defaults.etag;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.isReadOnly = defaults.isReadOnly;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.objectEventsEnabled = defaults.objectEventsEnabled;
    	      this.objectLifecyclePolicyEtag = defaults.objectLifecyclePolicyEtag;
    	      this.replicationEnabled = defaults.replicationEnabled;
    	      this.retentionRules = defaults.retentionRules;
    	      this.storageTier = defaults.storageTier;
    	      this.timeCreated = defaults.timeCreated;
    	      this.versioning = defaults.versioning;
        }

        public Builder accessType(String accessType) {
            this.accessType = Objects.requireNonNull(accessType);
            return this;
        }
        public Builder approximateCount(String approximateCount) {
            this.approximateCount = Objects.requireNonNull(approximateCount);
            return this;
        }
        public Builder approximateSize(String approximateSize) {
            this.approximateSize = Objects.requireNonNull(approximateSize);
            return this;
        }
        public Builder autoTiering(String autoTiering) {
            this.autoTiering = Objects.requireNonNull(autoTiering);
            return this;
        }
        public Builder bucketId(String bucketId) {
            this.bucketId = Objects.requireNonNull(bucketId);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isReadOnly(Boolean isReadOnly) {
            this.isReadOnly = Objects.requireNonNull(isReadOnly);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder metadata(Map<String,Object> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder objectEventsEnabled(Boolean objectEventsEnabled) {
            this.objectEventsEnabled = Objects.requireNonNull(objectEventsEnabled);
            return this;
        }
        public Builder objectLifecyclePolicyEtag(String objectLifecyclePolicyEtag) {
            this.objectLifecyclePolicyEtag = Objects.requireNonNull(objectLifecyclePolicyEtag);
            return this;
        }
        public Builder replicationEnabled(Boolean replicationEnabled) {
            this.replicationEnabled = Objects.requireNonNull(replicationEnabled);
            return this;
        }
        public Builder retentionRules(List<GetBucketRetentionRule> retentionRules) {
            this.retentionRules = Objects.requireNonNull(retentionRules);
            return this;
        }
        public Builder retentionRules(GetBucketRetentionRule... retentionRules) {
            return retentionRules(List.of(retentionRules));
        }
        public Builder storageTier(String storageTier) {
            this.storageTier = Objects.requireNonNull(storageTier);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder versioning(String versioning) {
            this.versioning = Objects.requireNonNull(versioning);
            return this;
        }        public GetBucketResult build() {
            return new GetBucketResult(accessType, approximateCount, approximateSize, autoTiering, bucketId, compartmentId, createdBy, definedTags, etag, freeformTags, id, isReadOnly, kmsKeyId, metadata, name, namespace, objectEventsEnabled, objectLifecyclePolicyEtag, replicationEnabled, retentionRules, storageTier, timeCreated, versioning);
        }
    }
}
