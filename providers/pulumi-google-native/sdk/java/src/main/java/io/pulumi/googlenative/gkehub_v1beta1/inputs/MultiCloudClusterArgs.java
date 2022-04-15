// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * MultiCloudCluster contains information specific to GKE Multi-Cloud clusters.
 * 
 */
public final class MultiCloudClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiCloudClusterArgs Empty = new MultiCloudClusterArgs();

    /**
     * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
     * 
     */
    @Import(name="resourceLink")
      private final @Nullable Output<String> resourceLink;

    public Output<String> resourceLink() {
        return this.resourceLink == null ? Codegen.empty() : this.resourceLink;
    }

    public MultiCloudClusterArgs(@Nullable Output<String> resourceLink) {
        this.resourceLink = resourceLink;
    }

    private MultiCloudClusterArgs() {
        this.resourceLink = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiCloudClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiCloudClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder resourceLink(@Nullable Output<String> resourceLink) {
            this.resourceLink = resourceLink;
            return this;
        }
        public Builder resourceLink(@Nullable String resourceLink) {
            this.resourceLink = Codegen.ofNullable(resourceLink);
            return this;
        }        public MultiCloudClusterArgs build() {
            return new MultiCloudClusterArgs(resourceLink);
        }
    }
}
