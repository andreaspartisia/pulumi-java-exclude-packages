// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateAuthorityArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityArgs Empty = new GetCertificateAuthorityArgs();

    @Import(name="certificateAuthorityId", required=true)
      private final String certificateAuthorityId;

    public String certificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetCertificateAuthorityArgs(
        String certificateAuthorityId,
        String location,
        @Nullable String project) {
        this.certificateAuthorityId = Objects.requireNonNull(certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetCertificateAuthorityArgs() {
        this.certificateAuthorityId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateAuthorityId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityId = defaults.certificateAuthorityId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = Objects.requireNonNull(certificateAuthorityId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetCertificateAuthorityArgs build() {
            return new GetCertificateAuthorityArgs(certificateAuthorityId, location, project);
        }
    }
}
