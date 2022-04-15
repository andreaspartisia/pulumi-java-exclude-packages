// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1alpha2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistrationIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistrationIamPolicyArgs Empty = new GetRegistrationIamPolicyArgs();

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

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

    @Import(name="registrationId", required=true)
      private final String registrationId;

    public String registrationId() {
        return this.registrationId;
    }

    public GetRegistrationIamPolicyArgs(
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String registrationId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.registrationId = Objects.requireNonNull(registrationId, "expected parameter 'registrationId' to be non-null");
    }

    private GetRegistrationIamPolicyArgs() {
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.registrationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistrationIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String registrationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistrationIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.registrationId = defaults.registrationId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder registrationId(String registrationId) {
            this.registrationId = Objects.requireNonNull(registrationId);
            return this;
        }        public GetRegistrationIamPolicyArgs build() {
            return new GetRegistrationIamPolicyArgs(location, optionsRequestedPolicyVersion, project, registrationId);
        }
    }
}
