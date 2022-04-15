// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A reference to a GKE cluster.
 * 
 */
public final class GkeClusterReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GkeClusterReferenceArgs Empty = new GkeClusterReferenceArgs();

    /**
     * The full or partial name of a GKE cluster, using one of the following forms: * `projects/{project}/locations/{location}/clusters/{cluster}` * `locations/{location}/clusters/{cluster}` * `{cluster}` If project and location are not specified, the project and location of the GameServerCluster resource are used to generate the full name of the GKE cluster.
     * 
     */
    @Import(name="cluster")
      private final @Nullable Output<String> cluster;

    public Output<String> cluster() {
        return this.cluster == null ? Codegen.empty() : this.cluster;
    }

    public GkeClusterReferenceArgs(@Nullable Output<String> cluster) {
        this.cluster = cluster;
    }

    private GkeClusterReferenceArgs() {
        this.cluster = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cluster;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
        }

        public Builder cluster(@Nullable Output<String> cluster) {
            this.cluster = cluster;
            return this;
        }
        public Builder cluster(@Nullable String cluster) {
            this.cluster = Codegen.ofNullable(cluster);
            return this;
        }        public GkeClusterReferenceArgs build() {
            return new GkeClusterReferenceArgs(cluster);
        }
    }
}
