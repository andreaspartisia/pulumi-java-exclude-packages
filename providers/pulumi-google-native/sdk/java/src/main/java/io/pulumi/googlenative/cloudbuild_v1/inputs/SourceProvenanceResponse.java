// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.cloudbuild_v1.inputs.RepoSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.inputs.StorageSourceManifestResponse;
import io.pulumi.googlenative.cloudbuild_v1.inputs.StorageSourceResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class SourceProvenanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceProvenanceResponse Empty = new SourceProvenanceResponse();

    @InputImport(name="fileHashes", required=true)
    private final Map<String,String> fileHashes;

    public Map<String,String> getFileHashes() {
        return this.fileHashes;
    }

    @InputImport(name="resolvedRepoSource", required=true)
    private final RepoSourceResponse resolvedRepoSource;

    public RepoSourceResponse getResolvedRepoSource() {
        return this.resolvedRepoSource;
    }

    @InputImport(name="resolvedStorageSource", required=true)
    private final StorageSourceResponse resolvedStorageSource;

    public StorageSourceResponse getResolvedStorageSource() {
        return this.resolvedStorageSource;
    }

    @InputImport(name="resolvedStorageSourceManifest", required=true)
    private final StorageSourceManifestResponse resolvedStorageSourceManifest;

    public StorageSourceManifestResponse getResolvedStorageSourceManifest() {
        return this.resolvedStorageSourceManifest;
    }

    public SourceProvenanceResponse(
        Map<String,String> fileHashes,
        RepoSourceResponse resolvedRepoSource,
        StorageSourceResponse resolvedStorageSource,
        StorageSourceManifestResponse resolvedStorageSourceManifest) {
        this.fileHashes = Objects.requireNonNull(fileHashes, "expected parameter 'fileHashes' to be non-null");
        this.resolvedRepoSource = Objects.requireNonNull(resolvedRepoSource, "expected parameter 'resolvedRepoSource' to be non-null");
        this.resolvedStorageSource = Objects.requireNonNull(resolvedStorageSource, "expected parameter 'resolvedStorageSource' to be non-null");
        this.resolvedStorageSourceManifest = Objects.requireNonNull(resolvedStorageSourceManifest, "expected parameter 'resolvedStorageSourceManifest' to be non-null");
    }

    private SourceProvenanceResponse() {
        this.fileHashes = Map.of();
        this.resolvedRepoSource = null;
        this.resolvedStorageSource = null;
        this.resolvedStorageSourceManifest = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> fileHashes;
        private RepoSourceResponse resolvedRepoSource;
        private StorageSourceResponse resolvedStorageSource;
        private StorageSourceManifestResponse resolvedStorageSourceManifest;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileHashes = defaults.fileHashes;
    	      this.resolvedRepoSource = defaults.resolvedRepoSource;
    	      this.resolvedStorageSource = defaults.resolvedStorageSource;
    	      this.resolvedStorageSourceManifest = defaults.resolvedStorageSourceManifest;
        }

        public Builder setFileHashes(Map<String,String> fileHashes) {
            this.fileHashes = Objects.requireNonNull(fileHashes);
            return this;
        }

        public Builder setResolvedRepoSource(RepoSourceResponse resolvedRepoSource) {
            this.resolvedRepoSource = Objects.requireNonNull(resolvedRepoSource);
            return this;
        }

        public Builder setResolvedStorageSource(StorageSourceResponse resolvedStorageSource) {
            this.resolvedStorageSource = Objects.requireNonNull(resolvedStorageSource);
            return this;
        }

        public Builder setResolvedStorageSourceManifest(StorageSourceManifestResponse resolvedStorageSourceManifest) {
            this.resolvedStorageSourceManifest = Objects.requireNonNull(resolvedStorageSourceManifest);
            return this;
        }

        public SourceProvenanceResponse build() {
            return new SourceProvenanceResponse(fileHashes, resolvedRepoSource, resolvedStorageSource, resolvedStorageSourceManifest);
        }
    }
}