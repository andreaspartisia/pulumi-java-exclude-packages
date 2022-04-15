// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A full, namespace-isolated deployment target for an existing GKE cluster.
 * 
 */
public final class NamespacedGkeDeploymentTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespacedGkeDeploymentTargetArgs Empty = new NamespacedGkeDeploymentTargetArgs();

    /**
     * Optional. A namespace within the GKE cluster to deploy into.
     * 
     */
    @Import(name="clusterNamespace")
      private final @Nullable Output<String> clusterNamespace;

    public Output<String> clusterNamespace() {
        return this.clusterNamespace == null ? Codegen.empty() : this.clusterNamespace;
    }

    /**
     * Optional. The target GKE cluster to deploy to. Format: 'projects/{project}/locations/{location}/clusters/{cluster_id}'
     * 
     */
    @Import(name="targetGkeCluster")
      private final @Nullable Output<String> targetGkeCluster;

    public Output<String> targetGkeCluster() {
        return this.targetGkeCluster == null ? Codegen.empty() : this.targetGkeCluster;
    }

    public NamespacedGkeDeploymentTargetArgs(
        @Nullable Output<String> clusterNamespace,
        @Nullable Output<String> targetGkeCluster) {
        this.clusterNamespace = clusterNamespace;
        this.targetGkeCluster = targetGkeCluster;
    }

    private NamespacedGkeDeploymentTargetArgs() {
        this.clusterNamespace = Codegen.empty();
        this.targetGkeCluster = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespacedGkeDeploymentTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterNamespace;
        private @Nullable Output<String> targetGkeCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespacedGkeDeploymentTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterNamespace = defaults.clusterNamespace;
    	      this.targetGkeCluster = defaults.targetGkeCluster;
        }

        public Builder clusterNamespace(@Nullable Output<String> clusterNamespace) {
            this.clusterNamespace = clusterNamespace;
            return this;
        }
        public Builder clusterNamespace(@Nullable String clusterNamespace) {
            this.clusterNamespace = Codegen.ofNullable(clusterNamespace);
            return this;
        }
        public Builder targetGkeCluster(@Nullable Output<String> targetGkeCluster) {
            this.targetGkeCluster = targetGkeCluster;
            return this;
        }
        public Builder targetGkeCluster(@Nullable String targetGkeCluster) {
            this.targetGkeCluster = Codegen.ofNullable(targetGkeCluster);
            return this;
        }        public NamespacedGkeDeploymentTargetArgs build() {
            return new NamespacedGkeDeploymentTargetArgs(clusterNamespace, targetGkeCluster);
        }
    }
}
