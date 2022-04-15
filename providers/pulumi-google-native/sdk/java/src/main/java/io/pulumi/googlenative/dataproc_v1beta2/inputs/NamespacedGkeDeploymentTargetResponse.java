// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A full, namespace-isolated deployment target for an existing GKE cluster.
 * 
 */
public final class NamespacedGkeDeploymentTargetResponse extends io.pulumi.resources.InvokeArgs {

    public static final NamespacedGkeDeploymentTargetResponse Empty = new NamespacedGkeDeploymentTargetResponse();

    /**
     * Optional. A namespace within the GKE cluster to deploy into.
     * 
     */
    @Import(name="clusterNamespace", required=true)
      private final String clusterNamespace;

    public String clusterNamespace() {
        return this.clusterNamespace;
    }

    /**
     * Optional. The target GKE cluster to deploy to. Format: 'projects/{project}/locations/{location}/clusters/{cluster_id}'
     * 
     */
    @Import(name="targetGkeCluster", required=true)
      private final String targetGkeCluster;

    public String targetGkeCluster() {
        return this.targetGkeCluster;
    }

    public NamespacedGkeDeploymentTargetResponse(
        String clusterNamespace,
        String targetGkeCluster) {
        this.clusterNamespace = Objects.requireNonNull(clusterNamespace, "expected parameter 'clusterNamespace' to be non-null");
        this.targetGkeCluster = Objects.requireNonNull(targetGkeCluster, "expected parameter 'targetGkeCluster' to be non-null");
    }

    private NamespacedGkeDeploymentTargetResponse() {
        this.clusterNamespace = null;
        this.targetGkeCluster = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespacedGkeDeploymentTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterNamespace;
        private String targetGkeCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespacedGkeDeploymentTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterNamespace = defaults.clusterNamespace;
    	      this.targetGkeCluster = defaults.targetGkeCluster;
        }

        public Builder clusterNamespace(String clusterNamespace) {
            this.clusterNamespace = Objects.requireNonNull(clusterNamespace);
            return this;
        }
        public Builder targetGkeCluster(String targetGkeCluster) {
            this.targetGkeCluster = Objects.requireNonNull(targetGkeCluster);
            return this;
        }        public NamespacedGkeDeploymentTargetResponse build() {
            return new NamespacedGkeDeploymentTargetResponse(clusterNamespace, targetGkeCluster);
        }
    }
}
