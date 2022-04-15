// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceDatabaseTableIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceDatabaseTableIamPolicyArgs Empty = new GetServiceDatabaseTableIamPolicyArgs();

    @Import(name="databaseId", required=true)
      private final String databaseId;

    public String databaseId() {
        return this.databaseId;
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

    @Import(name="tableId", required=true)
      private final String tableId;

    public String tableId() {
        return this.tableId;
    }

    public GetServiceDatabaseTableIamPolicyArgs(
        String databaseId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String serviceId,
        String tableId) {
        this.databaseId = Objects.requireNonNull(databaseId, "expected parameter 'databaseId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private GetServiceDatabaseTableIamPolicyArgs() {
        this.databaseId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.serviceId = null;
        this.tableId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceDatabaseTableIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String serviceId;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceDatabaseTableIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseId = defaults.databaseId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.serviceId = defaults.serviceId;
    	      this.tableId = defaults.tableId;
        }

        public Builder databaseId(String databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
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
        }
        public Builder tableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }        public GetServiceDatabaseTableIamPolicyArgs build() {
            return new GetServiceDatabaseTableIamPolicyArgs(databaseId, location, optionsRequestedPolicyVersion, project, serviceId, tableId);
        }
    }
}
