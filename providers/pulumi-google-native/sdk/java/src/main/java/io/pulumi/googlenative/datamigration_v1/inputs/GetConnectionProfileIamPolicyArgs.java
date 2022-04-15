// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionProfileIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectionProfileIamPolicyArgs Empty = new GetConnectionProfileIamPolicyArgs();

    @Import(name="connectionProfileId", required=true)
      private final String connectionProfileId;

    public String connectionProfileId() {
        return this.connectionProfileId;
    }

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

    public GetConnectionProfileIamPolicyArgs(
        String connectionProfileId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.connectionProfileId = Objects.requireNonNull(connectionProfileId, "expected parameter 'connectionProfileId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetConnectionProfileIamPolicyArgs() {
        this.connectionProfileId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionProfileIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionProfileId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionProfileIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionProfileId = defaults.connectionProfileId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder connectionProfileId(String connectionProfileId) {
            this.connectionProfileId = Objects.requireNonNull(connectionProfileId);
            return this;
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
        }        public GetConnectionProfileIamPolicyArgs build() {
            return new GetConnectionProfileIamPolicyArgs(connectionProfileId, location, optionsRequestedPolicyVersion, project);
        }
    }
}
