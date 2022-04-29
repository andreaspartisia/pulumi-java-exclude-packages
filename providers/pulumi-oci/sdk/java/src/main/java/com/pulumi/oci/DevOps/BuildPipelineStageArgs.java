// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DevOps;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DevOps.inputs.BuildPipelineStageBuildPipelineStagePredecessorCollectionArgs;
import com.pulumi.oci.DevOps.inputs.BuildPipelineStageBuildSourceCollectionArgs;
import com.pulumi.oci.DevOps.inputs.BuildPipelineStageDeliverArtifactCollectionArgs;
import com.pulumi.oci.DevOps.inputs.BuildPipelineStageWaitCriteriaArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BuildPipelineStageArgs extends com.pulumi.resources.ResourceArgs {

    public static final BuildPipelineStageArgs Empty = new BuildPipelineStageArgs();

    /**
     * The OCID of the build pipeline.
     * 
     */
    @Import(name="buildPipelineId", required=true)
    private Output<String> buildPipelineId;

    /**
     * @return The OCID of the build pipeline.
     * 
     */
    public Output<String> buildPipelineId() {
        return this.buildPipelineId;
    }

    /**
     * (Updatable) The collection containing the predecessors of a stage.
     * 
     */
    @Import(name="buildPipelineStagePredecessorCollection", required=true)
    private Output<BuildPipelineStageBuildPipelineStagePredecessorCollectionArgs> buildPipelineStagePredecessorCollection;

    /**
     * @return (Updatable) The collection containing the predecessors of a stage.
     * 
     */
    public Output<BuildPipelineStageBuildPipelineStagePredecessorCollectionArgs> buildPipelineStagePredecessorCollection() {
        return this.buildPipelineStagePredecessorCollection;
    }

    /**
     * (Updatable) Defines the stage type, which is one of the following: BUILD, DELIVER_ARTIFACT, WAIT, and TRIGGER_DEPLOYMENT_PIPELINE.
     * 
     */
    @Import(name="buildPipelineStageType", required=true)
    private Output<String> buildPipelineStageType;

    /**
     * @return (Updatable) Defines the stage type, which is one of the following: BUILD, DELIVER_ARTIFACT, WAIT, and TRIGGER_DEPLOYMENT_PIPELINE.
     * 
     */
    public Output<String> buildPipelineStageType() {
        return this.buildPipelineStageType;
    }

    /**
     * (Updatable) Collection of build sources.
     * 
     */
    @Import(name="buildSourceCollection")
    private @Nullable Output<BuildPipelineStageBuildSourceCollectionArgs> buildSourceCollection;

    /**
     * @return (Updatable) Collection of build sources.
     * 
     */
    public Optional<Output<BuildPipelineStageBuildSourceCollectionArgs>> buildSourceCollection() {
        return Optional.ofNullable(this.buildSourceCollection);
    }

    /**
     * (Updatable) The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
     * 
     */
    @Import(name="buildSpecFile")
    private @Nullable Output<String> buildSpecFile;

    /**
     * @return (Updatable) The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
     * 
     */
    public Optional<Output<String>> buildSpecFile() {
        return Optional.ofNullable(this.buildSpecFile);
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) Specifies an array of artifacts that need to be pushed to the artifactory stores.
     * 
     */
    @Import(name="deliverArtifactCollection")
    private @Nullable Output<BuildPipelineStageDeliverArtifactCollectionArgs> deliverArtifactCollection;

    /**
     * @return (Updatable) Specifies an array of artifacts that need to be pushed to the artifactory stores.
     * 
     */
    public Optional<Output<BuildPipelineStageDeliverArtifactCollectionArgs>> deliverArtifactCollection() {
        return Optional.ofNullable(this.deliverArtifactCollection);
    }

    /**
     * (Updatable) A target deployment pipeline OCID that will run in this stage.
     * 
     */
    @Import(name="deployPipelineId")
    private @Nullable Output<String> deployPipelineId;

    /**
     * @return (Updatable) A target deployment pipeline OCID that will run in this stage.
     * 
     */
    public Optional<Output<String>> deployPipelineId() {
        return Optional.ofNullable(this.deployPipelineId);
    }

    /**
     * (Updatable) Optional description about the stage.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) Optional description about the stage.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) Stage display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) Stage display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * (Updatable) Image name for the build environment
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return (Updatable) Image name for the build environment
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * (Updatable) A boolean flag that specifies whether all the parameters must be passed when the deployment is triggered.
     * 
     */
    @Import(name="isPassAllParametersEnabled")
    private @Nullable Output<Boolean> isPassAllParametersEnabled;

    /**
     * @return (Updatable) A boolean flag that specifies whether all the parameters must be passed when the deployment is triggered.
     * 
     */
    public Optional<Output<Boolean>> isPassAllParametersEnabled() {
        return Optional.ofNullable(this.isPassAllParametersEnabled);
    }

    /**
     * (Updatable) Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
     * 
     */
    @Import(name="primaryBuildSource")
    private @Nullable Output<String> primaryBuildSource;

    /**
     * @return (Updatable) Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
     * 
     */
    public Optional<Output<String>> primaryBuildSource() {
        return Optional.ofNullable(this.primaryBuildSource);
    }

    /**
     * (Updatable) Timeout for the build stage execution. Specify value in seconds.
     * 
     */
    @Import(name="stageExecutionTimeoutInSeconds")
    private @Nullable Output<Integer> stageExecutionTimeoutInSeconds;

    /**
     * @return (Updatable) Timeout for the build stage execution. Specify value in seconds.
     * 
     */
    public Optional<Output<Integer>> stageExecutionTimeoutInSeconds() {
        return Optional.ofNullable(this.stageExecutionTimeoutInSeconds);
    }

    /**
     * (Updatable) Specifies wait criteria for the Wait stage.
     * 
     */
    @Import(name="waitCriteria")
    private @Nullable Output<BuildPipelineStageWaitCriteriaArgs> waitCriteria;

    /**
     * @return (Updatable) Specifies wait criteria for the Wait stage.
     * 
     */
    public Optional<Output<BuildPipelineStageWaitCriteriaArgs>> waitCriteria() {
        return Optional.ofNullable(this.waitCriteria);
    }

    private BuildPipelineStageArgs() {}

    private BuildPipelineStageArgs(BuildPipelineStageArgs $) {
        this.buildPipelineId = $.buildPipelineId;
        this.buildPipelineStagePredecessorCollection = $.buildPipelineStagePredecessorCollection;
        this.buildPipelineStageType = $.buildPipelineStageType;
        this.buildSourceCollection = $.buildSourceCollection;
        this.buildSpecFile = $.buildSpecFile;
        this.definedTags = $.definedTags;
        this.deliverArtifactCollection = $.deliverArtifactCollection;
        this.deployPipelineId = $.deployPipelineId;
        this.description = $.description;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.image = $.image;
        this.isPassAllParametersEnabled = $.isPassAllParametersEnabled;
        this.primaryBuildSource = $.primaryBuildSource;
        this.stageExecutionTimeoutInSeconds = $.stageExecutionTimeoutInSeconds;
        this.waitCriteria = $.waitCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BuildPipelineStageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BuildPipelineStageArgs $;

        public Builder() {
            $ = new BuildPipelineStageArgs();
        }

        public Builder(BuildPipelineStageArgs defaults) {
            $ = new BuildPipelineStageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildPipelineId The OCID of the build pipeline.
         * 
         * @return builder
         * 
         */
        public Builder buildPipelineId(Output<String> buildPipelineId) {
            $.buildPipelineId = buildPipelineId;
            return this;
        }

        /**
         * @param buildPipelineId The OCID of the build pipeline.
         * 
         * @return builder
         * 
         */
        public Builder buildPipelineId(String buildPipelineId) {
            return buildPipelineId(Output.of(buildPipelineId));
        }

        /**
         * @param buildPipelineStagePredecessorCollection (Updatable) The collection containing the predecessors of a stage.
         * 
         * @return builder
         * 
         */
        public Builder buildPipelineStagePredecessorCollection(Output<BuildPipelineStageBuildPipelineStagePredecessorCollectionArgs> buildPipelineStagePredecessorCollection) {
            $.buildPipelineStagePredecessorCollection = buildPipelineStagePredecessorCollection;
            return this;
        }

        /**
         * @param buildPipelineStagePredecessorCollection (Updatable) The collection containing the predecessors of a stage.
         * 
         * @return builder
         * 
         */
        public Builder buildPipelineStagePredecessorCollection(BuildPipelineStageBuildPipelineStagePredecessorCollectionArgs buildPipelineStagePredecessorCollection) {
            return buildPipelineStagePredecessorCollection(Output.of(buildPipelineStagePredecessorCollection));
        }

        /**
         * @param buildPipelineStageType (Updatable) Defines the stage type, which is one of the following: BUILD, DELIVER_ARTIFACT, WAIT, and TRIGGER_DEPLOYMENT_PIPELINE.
         * 
         * @return builder
         * 
         */
        public Builder buildPipelineStageType(Output<String> buildPipelineStageType) {
            $.buildPipelineStageType = buildPipelineStageType;
            return this;
        }

        /**
         * @param buildPipelineStageType (Updatable) Defines the stage type, which is one of the following: BUILD, DELIVER_ARTIFACT, WAIT, and TRIGGER_DEPLOYMENT_PIPELINE.
         * 
         * @return builder
         * 
         */
        public Builder buildPipelineStageType(String buildPipelineStageType) {
            return buildPipelineStageType(Output.of(buildPipelineStageType));
        }

        /**
         * @param buildSourceCollection (Updatable) Collection of build sources.
         * 
         * @return builder
         * 
         */
        public Builder buildSourceCollection(@Nullable Output<BuildPipelineStageBuildSourceCollectionArgs> buildSourceCollection) {
            $.buildSourceCollection = buildSourceCollection;
            return this;
        }

        /**
         * @param buildSourceCollection (Updatable) Collection of build sources.
         * 
         * @return builder
         * 
         */
        public Builder buildSourceCollection(BuildPipelineStageBuildSourceCollectionArgs buildSourceCollection) {
            return buildSourceCollection(Output.of(buildSourceCollection));
        }

        /**
         * @param buildSpecFile (Updatable) The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
         * 
         * @return builder
         * 
         */
        public Builder buildSpecFile(@Nullable Output<String> buildSpecFile) {
            $.buildSpecFile = buildSpecFile;
            return this;
        }

        /**
         * @param buildSpecFile (Updatable) The path to the build specification file for this environment. The default location of the file if not specified is build_spec.yaml.
         * 
         * @return builder
         * 
         */
        public Builder buildSpecFile(String buildSpecFile) {
            return buildSpecFile(Output.of(buildSpecFile));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param deliverArtifactCollection (Updatable) Specifies an array of artifacts that need to be pushed to the artifactory stores.
         * 
         * @return builder
         * 
         */
        public Builder deliverArtifactCollection(@Nullable Output<BuildPipelineStageDeliverArtifactCollectionArgs> deliverArtifactCollection) {
            $.deliverArtifactCollection = deliverArtifactCollection;
            return this;
        }

        /**
         * @param deliverArtifactCollection (Updatable) Specifies an array of artifacts that need to be pushed to the artifactory stores.
         * 
         * @return builder
         * 
         */
        public Builder deliverArtifactCollection(BuildPipelineStageDeliverArtifactCollectionArgs deliverArtifactCollection) {
            return deliverArtifactCollection(Output.of(deliverArtifactCollection));
        }

        /**
         * @param deployPipelineId (Updatable) A target deployment pipeline OCID that will run in this stage.
         * 
         * @return builder
         * 
         */
        public Builder deployPipelineId(@Nullable Output<String> deployPipelineId) {
            $.deployPipelineId = deployPipelineId;
            return this;
        }

        /**
         * @param deployPipelineId (Updatable) A target deployment pipeline OCID that will run in this stage.
         * 
         * @return builder
         * 
         */
        public Builder deployPipelineId(String deployPipelineId) {
            return deployPipelineId(Output.of(deployPipelineId));
        }

        /**
         * @param description (Updatable) Optional description about the stage.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) Optional description about the stage.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName (Updatable) Stage display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) Stage display name, which can be renamed and is not necessarily unique. Avoid entering confidential information.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.  See [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param image (Updatable) Image name for the build environment
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image (Updatable) Image name for the build environment
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param isPassAllParametersEnabled (Updatable) A boolean flag that specifies whether all the parameters must be passed when the deployment is triggered.
         * 
         * @return builder
         * 
         */
        public Builder isPassAllParametersEnabled(@Nullable Output<Boolean> isPassAllParametersEnabled) {
            $.isPassAllParametersEnabled = isPassAllParametersEnabled;
            return this;
        }

        /**
         * @param isPassAllParametersEnabled (Updatable) A boolean flag that specifies whether all the parameters must be passed when the deployment is triggered.
         * 
         * @return builder
         * 
         */
        public Builder isPassAllParametersEnabled(Boolean isPassAllParametersEnabled) {
            return isPassAllParametersEnabled(Output.of(isPassAllParametersEnabled));
        }

        /**
         * @param primaryBuildSource (Updatable) Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
         * 
         * @return builder
         * 
         */
        public Builder primaryBuildSource(@Nullable Output<String> primaryBuildSource) {
            $.primaryBuildSource = primaryBuildSource;
            return this;
        }

        /**
         * @param primaryBuildSource (Updatable) Name of the build source where the build_spec.yml file is located. If not specified, the first entry in the build source collection is chosen as primary build source.
         * 
         * @return builder
         * 
         */
        public Builder primaryBuildSource(String primaryBuildSource) {
            return primaryBuildSource(Output.of(primaryBuildSource));
        }

        /**
         * @param stageExecutionTimeoutInSeconds (Updatable) Timeout for the build stage execution. Specify value in seconds.
         * 
         * @return builder
         * 
         */
        public Builder stageExecutionTimeoutInSeconds(@Nullable Output<Integer> stageExecutionTimeoutInSeconds) {
            $.stageExecutionTimeoutInSeconds = stageExecutionTimeoutInSeconds;
            return this;
        }

        /**
         * @param stageExecutionTimeoutInSeconds (Updatable) Timeout for the build stage execution. Specify value in seconds.
         * 
         * @return builder
         * 
         */
        public Builder stageExecutionTimeoutInSeconds(Integer stageExecutionTimeoutInSeconds) {
            return stageExecutionTimeoutInSeconds(Output.of(stageExecutionTimeoutInSeconds));
        }

        /**
         * @param waitCriteria (Updatable) Specifies wait criteria for the Wait stage.
         * 
         * @return builder
         * 
         */
        public Builder waitCriteria(@Nullable Output<BuildPipelineStageWaitCriteriaArgs> waitCriteria) {
            $.waitCriteria = waitCriteria;
            return this;
        }

        /**
         * @param waitCriteria (Updatable) Specifies wait criteria for the Wait stage.
         * 
         * @return builder
         * 
         */
        public Builder waitCriteria(BuildPipelineStageWaitCriteriaArgs waitCriteria) {
            return waitCriteria(Output.of(waitCriteria));
        }

        public BuildPipelineStageArgs build() {
            $.buildPipelineId = Objects.requireNonNull($.buildPipelineId, "expected parameter 'buildPipelineId' to be non-null");
            $.buildPipelineStagePredecessorCollection = Objects.requireNonNull($.buildPipelineStagePredecessorCollection, "expected parameter 'buildPipelineStagePredecessorCollection' to be non-null");
            $.buildPipelineStageType = Objects.requireNonNull($.buildPipelineStageType, "expected parameter 'buildPipelineStageType' to be non-null");
            return $;
        }
    }

}
