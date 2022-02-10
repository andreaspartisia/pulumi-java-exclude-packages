// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.ContentPathMapResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RepositoryResponse {
    private final @Nullable String branch;
    private final @Nullable String deploymentLogsUrl;
    private final @Nullable String displayUrl;
    private final @Nullable List<ContentPathMapResponse> pathMapping;
    private final @Nullable String url;

    @OutputCustomType.Constructor({"branch","deploymentLogsUrl","displayUrl","pathMapping","url"})
    private RepositoryResponse(
        @Nullable String branch,
        @Nullable String deploymentLogsUrl,
        @Nullable String displayUrl,
        @Nullable List<ContentPathMapResponse> pathMapping,
        @Nullable String url) {
        this.branch = branch;
        this.deploymentLogsUrl = deploymentLogsUrl;
        this.displayUrl = displayUrl;
        this.pathMapping = pathMapping;
        this.url = url;
    }

    public Optional<String> getBranch() {
        return Optional.ofNullable(this.branch);
    }
    public Optional<String> getDeploymentLogsUrl() {
        return Optional.ofNullable(this.deploymentLogsUrl);
    }
    public Optional<String> getDisplayUrl() {
        return Optional.ofNullable(this.displayUrl);
    }
    public List<ContentPathMapResponse> getPathMapping() {
        return this.pathMapping == null ? List.of() : this.pathMapping;
    }
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String branch;
        private @Nullable String deploymentLogsUrl;
        private @Nullable String displayUrl;
        private @Nullable List<ContentPathMapResponse> pathMapping;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.branch = defaults.branch;
    	      this.deploymentLogsUrl = defaults.deploymentLogsUrl;
    	      this.displayUrl = defaults.displayUrl;
    	      this.pathMapping = defaults.pathMapping;
    	      this.url = defaults.url;
        }

        public Builder setBranch(@Nullable String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setDeploymentLogsUrl(@Nullable String deploymentLogsUrl) {
            this.deploymentLogsUrl = deploymentLogsUrl;
            return this;
        }

        public Builder setDisplayUrl(@Nullable String displayUrl) {
            this.displayUrl = displayUrl;
            return this;
        }

        public Builder setPathMapping(@Nullable List<ContentPathMapResponse> pathMapping) {
            this.pathMapping = pathMapping;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public RepositoryResponse build() {
            return new RepositoryResponse(branch, deploymentLogsUrl, displayUrl, pathMapping, url);
        }
    }
}