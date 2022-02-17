// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementClusterSelectorGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementGetArgs Empty = new WorkflowTemplatePlacementGetArgs();

    /**
     * Optional. A selector that chooses target cluster for jobs based on metadata. The selector is evaluated at the time each job is submitted.
     * 
     */
    @InputImport(name="clusterSelector")
    private final @Nullable Input<WorkflowTemplatePlacementClusterSelectorGetArgs> clusterSelector;

    public Input<WorkflowTemplatePlacementClusterSelectorGetArgs> getClusterSelector() {
        return this.clusterSelector == null ? Input.empty() : this.clusterSelector;
    }

    /**
     * A cluster that is managed by the workflow.
     * 
     */
    @InputImport(name="managedCluster")
    private final @Nullable Input<WorkflowTemplatePlacementManagedClusterGetArgs> managedCluster;

    public Input<WorkflowTemplatePlacementManagedClusterGetArgs> getManagedCluster() {
        return this.managedCluster == null ? Input.empty() : this.managedCluster;
    }

    public WorkflowTemplatePlacementGetArgs(
        @Nullable Input<WorkflowTemplatePlacementClusterSelectorGetArgs> clusterSelector,
        @Nullable Input<WorkflowTemplatePlacementManagedClusterGetArgs> managedCluster) {
        this.clusterSelector = clusterSelector;
        this.managedCluster = managedCluster;
    }

    private WorkflowTemplatePlacementGetArgs() {
        this.clusterSelector = Input.empty();
        this.managedCluster = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WorkflowTemplatePlacementClusterSelectorGetArgs> clusterSelector;
        private @Nullable Input<WorkflowTemplatePlacementManagedClusterGetArgs> managedCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSelector = defaults.clusterSelector;
    	      this.managedCluster = defaults.managedCluster;
        }

        public Builder setClusterSelector(@Nullable Input<WorkflowTemplatePlacementClusterSelectorGetArgs> clusterSelector) {
            this.clusterSelector = clusterSelector;
            return this;
        }

        public Builder setClusterSelector(@Nullable WorkflowTemplatePlacementClusterSelectorGetArgs clusterSelector) {
            this.clusterSelector = Input.ofNullable(clusterSelector);
            return this;
        }

        public Builder setManagedCluster(@Nullable Input<WorkflowTemplatePlacementManagedClusterGetArgs> managedCluster) {
            this.managedCluster = managedCluster;
            return this;
        }

        public Builder setManagedCluster(@Nullable WorkflowTemplatePlacementManagedClusterGetArgs managedCluster) {
            this.managedCluster = Input.ofNullable(managedCluster);
            return this;
        }

        public WorkflowTemplatePlacementGetArgs build() {
            return new WorkflowTemplatePlacementGetArgs(clusterSelector, managedCluster);
        }
    }
}