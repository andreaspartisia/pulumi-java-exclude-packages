// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * ResourceManifest represents a single Kubernetes resource to be applied to the cluster.
 * 
 */
public final class ResourceManifestResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceManifestResponse Empty = new ResourceManifestResponse();

    /**
     * Whether the resource provided in the manifest is `cluster_scoped`. If unset, the manifest is assumed to be namespace scoped. This field is used for REST mapping when applying the resource in a cluster.
     * 
     */
    @Import(name="clusterScoped", required=true)
      private final Boolean clusterScoped;

    public Boolean clusterScoped() {
        return this.clusterScoped;
    }

    /**
     * YAML manifest of the resource.
     * 
     */
    @Import(name="manifest", required=true)
      private final String manifest;

    public String manifest() {
        return this.manifest;
    }

    public ResourceManifestResponse(
        Boolean clusterScoped,
        String manifest) {
        this.clusterScoped = Objects.requireNonNull(clusterScoped, "expected parameter 'clusterScoped' to be non-null");
        this.manifest = Objects.requireNonNull(manifest, "expected parameter 'manifest' to be non-null");
    }

    private ResourceManifestResponse() {
        this.clusterScoped = null;
        this.manifest = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceManifestResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean clusterScoped;
        private String manifest;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceManifestResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterScoped = defaults.clusterScoped;
    	      this.manifest = defaults.manifest;
        }

        public Builder clusterScoped(Boolean clusterScoped) {
            this.clusterScoped = Objects.requireNonNull(clusterScoped);
            return this;
        }
        public Builder manifest(String manifest) {
            this.manifest = Objects.requireNonNull(manifest);
            return this;
        }        public ResourceManifestResponse build() {
            return new ResourceManifestResponse(clusterScoped, manifest);
        }
    }
}
