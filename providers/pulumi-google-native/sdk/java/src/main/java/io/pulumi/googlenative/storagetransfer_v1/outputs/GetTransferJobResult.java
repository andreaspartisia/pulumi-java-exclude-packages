// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.storagetransfer_v1.outputs.LoggingConfigResponse;
import io.pulumi.googlenative.storagetransfer_v1.outputs.NotificationConfigResponse;
import io.pulumi.googlenative.storagetransfer_v1.outputs.ScheduleResponse;
import io.pulumi.googlenative.storagetransfer_v1.outputs.TransferSpecResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTransferJobResult {
    /**
     * The time that the transfer job was created.
     * 
     */
    private final String creationTime;
    /**
     * The time that the transfer job was deleted.
     * 
     */
    private final String deletionTime;
    /**
     * A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
     * 
     */
    private final String description;
    /**
     * The time that the transfer job was last modified.
     * 
     */
    private final String lastModificationTime;
    /**
     * The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
     * 
     */
    private final String latestOperationName;
    /**
     * Logging configuration.
     * 
     */
    private final LoggingConfigResponse loggingConfig;
    /**
     * A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `"transferJobs/"` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `"transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$"` PosixFilesystem example: `"transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$"` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
     * 
     */
    private final String name;
    /**
     * Notification configuration. This is not supported for transfers involving PosixFilesystem.
     * 
     */
    private final NotificationConfigResponse notificationConfig;
    /**
     * The ID of the Google Cloud project that owns the job.
     * 
     */
    private final String project;
    /**
     * Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
     * 
     */
    private final ScheduleResponse schedule;
    /**
     * Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
     * 
     */
    private final String status;
    /**
     * Transfer specification.
     * 
     */
    private final TransferSpecResponse transferSpec;

    @CustomType.Constructor
    private GetTransferJobResult(
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("deletionTime") String deletionTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("lastModificationTime") String lastModificationTime,
        @CustomType.Parameter("latestOperationName") String latestOperationName,
        @CustomType.Parameter("loggingConfig") LoggingConfigResponse loggingConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notificationConfig") NotificationConfigResponse notificationConfig,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("schedule") ScheduleResponse schedule,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("transferSpec") TransferSpecResponse transferSpec) {
        this.creationTime = creationTime;
        this.deletionTime = deletionTime;
        this.description = description;
        this.lastModificationTime = lastModificationTime;
        this.latestOperationName = latestOperationName;
        this.loggingConfig = loggingConfig;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.project = project;
        this.schedule = schedule;
        this.status = status;
        this.transferSpec = transferSpec;
    }

    /**
     * The time that the transfer job was created.
     * 
    */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * The time that the transfer job was deleted.
     * 
    */
    public String deletionTime() {
        return this.deletionTime;
    }
    /**
     * A description provided by the user for the job. Its max length is 1024 bytes when Unicode-encoded.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The time that the transfer job was last modified.
     * 
    */
    public String lastModificationTime() {
        return this.lastModificationTime;
    }
    /**
     * The name of the most recently started TransferOperation of this JobConfig. Present if a TransferOperation has been created for this JobConfig.
     * 
    */
    public String latestOperationName() {
        return this.latestOperationName;
    }
    /**
     * Logging configuration.
     * 
    */
    public LoggingConfigResponse loggingConfig() {
        return this.loggingConfig;
    }
    /**
     * A unique name (within the transfer project) assigned when the job is created. If this field is empty in a CreateTransferJobRequest, Storage Transfer Service assigns a unique name. Otherwise, the specified name is used as the unique name for this job. If the specified name is in use by a job, the creation request fails with an ALREADY_EXISTS error. This name must start with `"transferJobs/"` prefix and end with a letter or a number, and should be no more than 128 characters. For transfers involving PosixFilesystem, this name must start with `transferJobs/OPI` specifically. For all other transfer types, this name must not start with `transferJobs/OPI`. Non-PosixFilesystem example: `"transferJobs/^(?!OPI)[A-Za-z0-9-._~]*[A-Za-z0-9]$"` PosixFilesystem example: `"transferJobs/OPI^[A-Za-z0-9-._~]*[A-Za-z0-9]$"` Applications must not rely on the enforcement of naming requirements involving OPI. Invalid job names fail with an INVALID_ARGUMENT error.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Notification configuration. This is not supported for transfers involving PosixFilesystem.
     * 
    */
    public NotificationConfigResponse notificationConfig() {
        return this.notificationConfig;
    }
    /**
     * The ID of the Google Cloud project that owns the job.
     * 
    */
    public String project() {
        return this.project;
    }
    /**
     * Specifies schedule for the transfer job. This is an optional field. When the field is not set, the job never executes a transfer, unless you invoke RunTransferJob or update the job to have a non-empty schedule.
     * 
    */
    public ScheduleResponse schedule() {
        return this.schedule;
    }
    /**
     * Status of the job. This value MUST be specified for `CreateTransferJobRequests`. **Note:** The effect of the new job status takes place during a subsequent job run. For example, if you change the job status from ENABLED to DISABLED, and an operation spawned by the transfer is running, the status change would not affect the current operation.
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Transfer specification.
     * 
    */
    public TransferSpecResponse transferSpec() {
        return this.transferSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransferJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private String deletionTime;
        private String description;
        private String lastModificationTime;
        private String latestOperationName;
        private LoggingConfigResponse loggingConfig;
        private String name;
        private NotificationConfigResponse notificationConfig;
        private String project;
        private ScheduleResponse schedule;
        private String status;
        private TransferSpecResponse transferSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransferJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.deletionTime = defaults.deletionTime;
    	      this.description = defaults.description;
    	      this.lastModificationTime = defaults.lastModificationTime;
    	      this.latestOperationName = defaults.latestOperationName;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.project = defaults.project;
    	      this.schedule = defaults.schedule;
    	      this.status = defaults.status;
    	      this.transferSpec = defaults.transferSpec;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder deletionTime(String deletionTime) {
            this.deletionTime = Objects.requireNonNull(deletionTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder lastModificationTime(String lastModificationTime) {
            this.lastModificationTime = Objects.requireNonNull(lastModificationTime);
            return this;
        }
        public Builder latestOperationName(String latestOperationName) {
            this.latestOperationName = Objects.requireNonNull(latestOperationName);
            return this;
        }
        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notificationConfig(NotificationConfigResponse notificationConfig) {
            this.notificationConfig = Objects.requireNonNull(notificationConfig);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder schedule(ScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder transferSpec(TransferSpecResponse transferSpec) {
            this.transferSpec = Objects.requireNonNull(transferSpec);
            return this;
        }        public GetTransferJobResult build() {
            return new GetTransferJobResult(creationTime, deletionTime, description, lastModificationTime, latestOperationName, loggingConfig, name, notificationConfig, project, schedule, status, transferSpec);
        }
    }
}
