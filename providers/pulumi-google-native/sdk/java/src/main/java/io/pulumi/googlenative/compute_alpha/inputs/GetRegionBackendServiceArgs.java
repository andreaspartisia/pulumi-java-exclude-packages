// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionBackendServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionBackendServiceArgs Empty = new GetRegionBackendServiceArgs();

    @Import(name="backendService", required=true)
      private final String backendService;

    public String backendService() {
        return this.backendService;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    public GetRegionBackendServiceArgs(
        String backendService,
        @Nullable String project,
        String region) {
        this.backendService = Objects.requireNonNull(backendService, "expected parameter 'backendService' to be non-null");
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private GetRegionBackendServiceArgs() {
        this.backendService = null;
        this.project = null;
        this.region = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionBackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;
        private @Nullable String project;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionBackendServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder backendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }        public GetRegionBackendServiceArgs build() {
            return new GetRegionBackendServiceArgs(backendService, project, region);
        }
    }
}
