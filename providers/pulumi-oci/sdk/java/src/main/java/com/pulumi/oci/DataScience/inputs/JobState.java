// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataScience.inputs.JobJobConfigurationDetailsArgs;
import com.pulumi.oci.DataScience.inputs.JobJobInfrastructureConfigurationDetailsArgs;
import com.pulumi.oci.DataScience.inputs.JobJobLogConfigurationDetailsArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobState extends com.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * This header allows you to specify a filename during upload. This file name is used to dispose of the file contents while downloading the file. Example: `attachment; filename=job-artifact.py`
     * 
     */
    @Import(name="artifactContentDisposition")
    private @Nullable Output<String> artifactContentDisposition;

    /**
     * @return This header allows you to specify a filename during upload. This file name is used to dispose of the file contents while downloading the file. Example: `attachment; filename=job-artifact.py`
     * 
     */
    public Optional<Output<String>> artifactContentDisposition() {
        return Optional.ofNullable(this.artifactContentDisposition);
    }

    /**
     * The content length of the body.
     * 
     */
    @Import(name="artifactContentLength")
    private @Nullable Output<String> artifactContentLength;

    /**
     * @return The content length of the body.
     * 
     */
    public Optional<Output<String>> artifactContentLength() {
        return Optional.ofNullable(this.artifactContentLength);
    }

    @Import(name="artifactContentMd5")
    private @Nullable Output<String> artifactContentMd5;

    public Optional<Output<String>> artifactContentMd5() {
        return Optional.ofNullable(this.artifactContentMd5);
    }

    @Import(name="artifactLastModified")
    private @Nullable Output<String> artifactLastModified;

    public Optional<Output<String>> artifactLastModified() {
        return Optional.ofNullable(this.artifactLastModified);
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the project.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the project.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) Delete all related JobRuns upon deletion of the Job.
     * 
     */
    @Import(name="deleteRelatedJobRuns")
    private @Nullable Output<Boolean> deleteRelatedJobRuns;

    /**
     * @return (Updatable) Delete all related JobRuns upon deletion of the Job.
     * 
     */
    public Optional<Output<Boolean>> deleteRelatedJobRuns() {
        return Optional.ofNullable(this.deleteRelatedJobRuns);
    }

    /**
     * (Updatable) A short description of the job.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) A short description of the job.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) A user-friendly display name for the resource.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) A user-friendly display name for the resource.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="emptyArtifact")
    private @Nullable Output<Boolean> emptyArtifact;

    public Optional<Output<Boolean>> emptyArtifact() {
        return Optional.ofNullable(this.emptyArtifact);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * The job artifact to upload. This can be done in a separate step or from cli/sdk. The Job will remain in &#34;Creating&#34; state until its artifact is uploaded.
     * 
     */
    @Import(name="jobArtifact")
    private @Nullable Output<String> jobArtifact;

    /**
     * @return The job artifact to upload. This can be done in a separate step or from cli/sdk. The Job will remain in &#34;Creating&#34; state until its artifact is uploaded.
     * 
     */
    public Optional<Output<String>> jobArtifact() {
        return Optional.ofNullable(this.jobArtifact);
    }

    /**
     * The job configuration details
     * 
     */
    @Import(name="jobConfigurationDetails")
    private @Nullable Output<JobJobConfigurationDetailsArgs> jobConfigurationDetails;

    /**
     * @return The job configuration details
     * 
     */
    public Optional<Output<JobJobConfigurationDetailsArgs>> jobConfigurationDetails() {
        return Optional.ofNullable(this.jobConfigurationDetails);
    }

    /**
     * (Updatable) The job infrastructure configuration details (shape, block storage, etc.)
     * 
     */
    @Import(name="jobInfrastructureConfigurationDetails")
    private @Nullable Output<JobJobInfrastructureConfigurationDetailsArgs> jobInfrastructureConfigurationDetails;

    /**
     * @return (Updatable) The job infrastructure configuration details (shape, block storage, etc.)
     * 
     */
    public Optional<Output<JobJobInfrastructureConfigurationDetailsArgs>> jobInfrastructureConfigurationDetails() {
        return Optional.ofNullable(this.jobInfrastructureConfigurationDetails);
    }

    /**
     * Logging configuration for resource.
     * 
     */
    @Import(name="jobLogConfigurationDetails")
    private @Nullable Output<JobJobLogConfigurationDetailsArgs> jobLogConfigurationDetails;

    /**
     * @return Logging configuration for resource.
     * 
     */
    public Optional<Output<JobJobLogConfigurationDetailsArgs>> jobLogConfigurationDetails() {
        return Optional.ofNullable(this.jobLogConfigurationDetails);
    }

    /**
     * The state of the job.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return The state of the job.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The state of the job.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the job.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2020-08-06T21:10:29.41Z
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2020-08-06T21:10:29.41Z
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    private JobState() {}

    private JobState(JobState $) {
        this.artifactContentDisposition = $.artifactContentDisposition;
        this.artifactContentLength = $.artifactContentLength;
        this.artifactContentMd5 = $.artifactContentMd5;
        this.artifactLastModified = $.artifactLastModified;
        this.compartmentId = $.compartmentId;
        this.createdBy = $.createdBy;
        this.definedTags = $.definedTags;
        this.deleteRelatedJobRuns = $.deleteRelatedJobRuns;
        this.description = $.description;
        this.displayName = $.displayName;
        this.emptyArtifact = $.emptyArtifact;
        this.freeformTags = $.freeformTags;
        this.jobArtifact = $.jobArtifact;
        this.jobConfigurationDetails = $.jobConfigurationDetails;
        this.jobInfrastructureConfigurationDetails = $.jobInfrastructureConfigurationDetails;
        this.jobLogConfigurationDetails = $.jobLogConfigurationDetails;
        this.lifecycleDetails = $.lifecycleDetails;
        this.projectId = $.projectId;
        this.state = $.state;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobState $;

        public Builder() {
            $ = new JobState();
        }

        public Builder(JobState defaults) {
            $ = new JobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactContentDisposition This header allows you to specify a filename during upload. This file name is used to dispose of the file contents while downloading the file. Example: `attachment; filename=job-artifact.py`
         * 
         * @return builder
         * 
         */
        public Builder artifactContentDisposition(@Nullable Output<String> artifactContentDisposition) {
            $.artifactContentDisposition = artifactContentDisposition;
            return this;
        }

        /**
         * @param artifactContentDisposition This header allows you to specify a filename during upload. This file name is used to dispose of the file contents while downloading the file. Example: `attachment; filename=job-artifact.py`
         * 
         * @return builder
         * 
         */
        public Builder artifactContentDisposition(String artifactContentDisposition) {
            return artifactContentDisposition(Output.of(artifactContentDisposition));
        }

        /**
         * @param artifactContentLength The content length of the body.
         * 
         * @return builder
         * 
         */
        public Builder artifactContentLength(@Nullable Output<String> artifactContentLength) {
            $.artifactContentLength = artifactContentLength;
            return this;
        }

        /**
         * @param artifactContentLength The content length of the body.
         * 
         * @return builder
         * 
         */
        public Builder artifactContentLength(String artifactContentLength) {
            return artifactContentLength(Output.of(artifactContentLength));
        }

        public Builder artifactContentMd5(@Nullable Output<String> artifactContentMd5) {
            $.artifactContentMd5 = artifactContentMd5;
            return this;
        }

        public Builder artifactContentMd5(String artifactContentMd5) {
            return artifactContentMd5(Output.of(artifactContentMd5));
        }

        public Builder artifactLastModified(@Nullable Output<String> artifactLastModified) {
            $.artifactLastModified = artifactLastModified;
            return this;
        }

        public Builder artifactLastModified(String artifactLastModified) {
            return artifactLastModified(Output.of(artifactLastModified));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param createdBy The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the project.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the project.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param deleteRelatedJobRuns (Updatable) Delete all related JobRuns upon deletion of the Job.
         * 
         * @return builder
         * 
         */
        public Builder deleteRelatedJobRuns(@Nullable Output<Boolean> deleteRelatedJobRuns) {
            $.deleteRelatedJobRuns = deleteRelatedJobRuns;
            return this;
        }

        /**
         * @param deleteRelatedJobRuns (Updatable) Delete all related JobRuns upon deletion of the Job.
         * 
         * @return builder
         * 
         */
        public Builder deleteRelatedJobRuns(Boolean deleteRelatedJobRuns) {
            return deleteRelatedJobRuns(Output.of(deleteRelatedJobRuns));
        }

        /**
         * @param description (Updatable) A short description of the job.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) A short description of the job.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName (Updatable) A user-friendly display name for the resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) A user-friendly display name for the resource.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder emptyArtifact(@Nullable Output<Boolean> emptyArtifact) {
            $.emptyArtifact = emptyArtifact;
            return this;
        }

        public Builder emptyArtifact(Boolean emptyArtifact) {
            return emptyArtifact(Output.of(emptyArtifact));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param jobArtifact The job artifact to upload. This can be done in a separate step or from cli/sdk. The Job will remain in &#34;Creating&#34; state until its artifact is uploaded.
         * 
         * @return builder
         * 
         */
        public Builder jobArtifact(@Nullable Output<String> jobArtifact) {
            $.jobArtifact = jobArtifact;
            return this;
        }

        /**
         * @param jobArtifact The job artifact to upload. This can be done in a separate step or from cli/sdk. The Job will remain in &#34;Creating&#34; state until its artifact is uploaded.
         * 
         * @return builder
         * 
         */
        public Builder jobArtifact(String jobArtifact) {
            return jobArtifact(Output.of(jobArtifact));
        }

        /**
         * @param jobConfigurationDetails The job configuration details
         * 
         * @return builder
         * 
         */
        public Builder jobConfigurationDetails(@Nullable Output<JobJobConfigurationDetailsArgs> jobConfigurationDetails) {
            $.jobConfigurationDetails = jobConfigurationDetails;
            return this;
        }

        /**
         * @param jobConfigurationDetails The job configuration details
         * 
         * @return builder
         * 
         */
        public Builder jobConfigurationDetails(JobJobConfigurationDetailsArgs jobConfigurationDetails) {
            return jobConfigurationDetails(Output.of(jobConfigurationDetails));
        }

        /**
         * @param jobInfrastructureConfigurationDetails (Updatable) The job infrastructure configuration details (shape, block storage, etc.)
         * 
         * @return builder
         * 
         */
        public Builder jobInfrastructureConfigurationDetails(@Nullable Output<JobJobInfrastructureConfigurationDetailsArgs> jobInfrastructureConfigurationDetails) {
            $.jobInfrastructureConfigurationDetails = jobInfrastructureConfigurationDetails;
            return this;
        }

        /**
         * @param jobInfrastructureConfigurationDetails (Updatable) The job infrastructure configuration details (shape, block storage, etc.)
         * 
         * @return builder
         * 
         */
        public Builder jobInfrastructureConfigurationDetails(JobJobInfrastructureConfigurationDetailsArgs jobInfrastructureConfigurationDetails) {
            return jobInfrastructureConfigurationDetails(Output.of(jobInfrastructureConfigurationDetails));
        }

        /**
         * @param jobLogConfigurationDetails Logging configuration for resource.
         * 
         * @return builder
         * 
         */
        public Builder jobLogConfigurationDetails(@Nullable Output<JobJobLogConfigurationDetailsArgs> jobLogConfigurationDetails) {
            $.jobLogConfigurationDetails = jobLogConfigurationDetails;
            return this;
        }

        /**
         * @param jobLogConfigurationDetails Logging configuration for resource.
         * 
         * @return builder
         * 
         */
        public Builder jobLogConfigurationDetails(JobJobLogConfigurationDetailsArgs jobLogConfigurationDetails) {
            return jobLogConfigurationDetails(Output.of(jobLogConfigurationDetails));
        }

        /**
         * @param lifecycleDetails The state of the job.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails The state of the job.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param projectId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param state The state of the job.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the job.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param timeCreated The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2020-08-06T21:10:29.41Z
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the resource was created in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: 2020-08-06T21:10:29.41Z
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        public JobState build() {
            return $;
        }
    }

}
