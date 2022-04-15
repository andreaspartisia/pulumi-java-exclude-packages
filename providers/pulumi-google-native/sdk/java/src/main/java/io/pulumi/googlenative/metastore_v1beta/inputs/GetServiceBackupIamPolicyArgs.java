// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceBackupIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceBackupIamPolicyArgs Empty = new GetServiceBackupIamPolicyArgs();

    @Import(name="backupId", required=true)
      private final String backupId;

    public String backupId() {
        return this.backupId;
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

    @Import(name="serviceId", required=true)
      private final String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    public GetServiceBackupIamPolicyArgs(
        String backupId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String serviceId) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private GetServiceBackupIamPolicyArgs() {
        this.backupId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.serviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceBackupIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceBackupIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder backupId(String backupId) {
            this.backupId = Objects.requireNonNull(backupId);
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
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }        public GetServiceBackupIamPolicyArgs build() {
            return new GetServiceBackupIamPolicyArgs(backupId, location, optionsRequestedPolicyVersion, project, serviceId);
        }
    }
}
