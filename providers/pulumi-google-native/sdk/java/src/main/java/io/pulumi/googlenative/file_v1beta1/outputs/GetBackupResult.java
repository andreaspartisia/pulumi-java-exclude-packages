// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetBackupResult {
    /**
     * Capacity of the source file share when the backup was created.
     * 
     */
    private final String capacityGb;
    /**
     * The time when the backup was created.
     * 
     */
    private final String createTime;
    /**
     * A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
     */
    private final String description;
    /**
     * Amount of bytes that will be downloaded if the backup is restored
     * 
     */
    private final String downloadBytes;
    /**
     * Resource labels to represent user provided metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The resource name of the backup, in the format `projects/{project_id}/locations/{location_id}/backups/{backup_id}`.
     * 
     */
    private final String name;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
     */
    private final String sourceFileShare;
    /**
     * The resource name of the source Cloud Filestore instance, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}`, used to create this backup.
     * 
     */
    private final String sourceInstance;
    /**
     * The service tier of the source Cloud Filestore instance that this backup is created from.
     * 
     */
    private final String sourceInstanceTier;
    /**
     * The backup state.
     * 
     */
    private final String state;
    /**
     * The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
     * 
     */
    private final String storageBytes;

    @CustomType.Constructor
    private GetBackupResult(
        @CustomType.Parameter("capacityGb") String capacityGb,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("downloadBytes") String downloadBytes,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("satisfiesPzs") Boolean satisfiesPzs,
        @CustomType.Parameter("sourceFileShare") String sourceFileShare,
        @CustomType.Parameter("sourceInstance") String sourceInstance,
        @CustomType.Parameter("sourceInstanceTier") String sourceInstanceTier,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("storageBytes") String storageBytes) {
        this.capacityGb = capacityGb;
        this.createTime = createTime;
        this.description = description;
        this.downloadBytes = downloadBytes;
        this.labels = labels;
        this.name = name;
        this.satisfiesPzs = satisfiesPzs;
        this.sourceFileShare = sourceFileShare;
        this.sourceInstance = sourceInstance;
        this.sourceInstanceTier = sourceInstanceTier;
        this.state = state;
        this.storageBytes = storageBytes;
    }

    /**
     * Capacity of the source file share when the backup was created.
     * 
    */
    public String capacityGb() {
        return this.capacityGb;
    }
    /**
     * The time when the backup was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * A description of the backup with 2048 characters or less. Requests with longer descriptions will be rejected.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Amount of bytes that will be downloaded if the backup is restored
     * 
    */
    public String downloadBytes() {
        return this.downloadBytes;
    }
    /**
     * Resource labels to represent user provided metadata.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * The resource name of the backup, in the format `projects/{project_id}/locations/{location_id}/backups/{backup_id}`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Reserved for future use.
     * 
    */
    public Boolean satisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Name of the file share in the source Cloud Filestore instance that the backup is created from.
     * 
    */
    public String sourceFileShare() {
        return this.sourceFileShare;
    }
    /**
     * The resource name of the source Cloud Filestore instance, in the format `projects/{project_id}/locations/{location_id}/instances/{instance_id}`, used to create this backup.
     * 
    */
    public String sourceInstance() {
        return this.sourceInstance;
    }
    /**
     * The service tier of the source Cloud Filestore instance that this backup is created from.
     * 
    */
    public String sourceInstanceTier() {
        return this.sourceInstanceTier;
    }
    /**
     * The backup state.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * The size of the storage used by the backup. As backups share storage, this number is expected to change with backup creation/deletion.
     * 
    */
    public String storageBytes() {
        return this.storageBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String capacityGb;
        private String createTime;
        private String description;
        private String downloadBytes;
        private Map<String,String> labels;
        private String name;
        private Boolean satisfiesPzs;
        private String sourceFileShare;
        private String sourceInstance;
        private String sourceInstanceTier;
        private String state;
        private String storageBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacityGb = defaults.capacityGb;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.downloadBytes = defaults.downloadBytes;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.sourceFileShare = defaults.sourceFileShare;
    	      this.sourceInstance = defaults.sourceInstance;
    	      this.sourceInstanceTier = defaults.sourceInstanceTier;
    	      this.state = defaults.state;
    	      this.storageBytes = defaults.storageBytes;
        }

        public Builder capacityGb(String capacityGb) {
            this.capacityGb = Objects.requireNonNull(capacityGb);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder downloadBytes(String downloadBytes) {
            this.downloadBytes = Objects.requireNonNull(downloadBytes);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }
        public Builder sourceFileShare(String sourceFileShare) {
            this.sourceFileShare = Objects.requireNonNull(sourceFileShare);
            return this;
        }
        public Builder sourceInstance(String sourceInstance) {
            this.sourceInstance = Objects.requireNonNull(sourceInstance);
            return this;
        }
        public Builder sourceInstanceTier(String sourceInstanceTier) {
            this.sourceInstanceTier = Objects.requireNonNull(sourceInstanceTier);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder storageBytes(String storageBytes) {
            this.storageBytes = Objects.requireNonNull(storageBytes);
            return this;
        }        public GetBackupResult build() {
            return new GetBackupResult(capacityGb, createTime, description, downloadBytes, labels, name, satisfiesPzs, sourceFileShare, sourceInstance, sourceInstanceTier, state, storageBytes);
        }
    }
}
