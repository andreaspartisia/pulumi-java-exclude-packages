// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceAttachmentIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceAttachmentIamPolicyArgs Empty = new GetServiceAttachmentIamPolicyArgs();

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
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

    @Import(name="resource", required=true)
      private final String resource;

    public String resource() {
        return this.resource;
    }

    public GetServiceAttachmentIamPolicyArgs(
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String region,
        String resource) {
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
    }

    private GetServiceAttachmentIamPolicyArgs() {
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.region = null;
        this.resource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceAttachmentIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String region;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceAttachmentIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.resource = defaults.resource;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }        public GetServiceAttachmentIamPolicyArgs build() {
            return new GetServiceAttachmentIamPolicyArgs(optionsRequestedPolicyVersion, project, region, resource);
        }
    }
}
