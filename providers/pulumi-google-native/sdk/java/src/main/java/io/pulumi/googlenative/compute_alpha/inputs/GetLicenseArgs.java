// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLicenseArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLicenseArgs Empty = new GetLicenseArgs();

    @Import(name="license", required=true)
      private final String license;

    public String license() {
        return this.license;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetLicenseArgs(
        String license,
        @Nullable String project) {
        this.license = Objects.requireNonNull(license, "expected parameter 'license' to be non-null");
        this.project = project;
    }

    private GetLicenseArgs() {
        this.license = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String license;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLicenseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.license = defaults.license;
    	      this.project = defaults.project;
        }

        public Builder license(String license) {
            this.license = Objects.requireNonNull(license);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetLicenseArgs build() {
            return new GetLicenseArgs(license, project);
        }
    }
}
