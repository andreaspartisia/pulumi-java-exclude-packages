// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatacenterConnectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatacenterConnectorArgs Empty = new DatacenterConnectorArgs();

    @Import(name="datacenterConnectorId", required=true)
      private final Output<String> datacenterConnectorId;

    public Output<String> datacenterConnectorId() {
        return this.datacenterConnectorId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Immutable. A unique key for this connector. This key is internal to the OVA connector and is supplied with its creation during the registration process and can not be modified.
     * 
     */
    @Import(name="registrationId")
      private final @Nullable Output<String> registrationId;

    public Output<String> registrationId() {
        return this.registrationId == null ? Codegen.empty() : this.registrationId;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The service account to use in the connector when communicating with the cloud.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    @Import(name="sourceId", required=true)
      private final Output<String> sourceId;

    public Output<String> sourceId() {
        return this.sourceId;
    }

    /**
     * The version running in the DatacenterConnector. This is supplied by the OVA connector during the registration process and can not be modified.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public DatacenterConnectorArgs(
        Output<String> datacenterConnectorId,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<String> registrationId,
        @Nullable Output<String> requestId,
        @Nullable Output<String> serviceAccount,
        Output<String> sourceId,
        @Nullable Output<String> version) {
        this.datacenterConnectorId = Objects.requireNonNull(datacenterConnectorId, "expected parameter 'datacenterConnectorId' to be non-null");
        this.location = location;
        this.project = project;
        this.registrationId = registrationId;
        this.requestId = requestId;
        this.serviceAccount = serviceAccount;
        this.sourceId = Objects.requireNonNull(sourceId, "expected parameter 'sourceId' to be non-null");
        this.version = version;
    }

    private DatacenterConnectorArgs() {
        this.datacenterConnectorId = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.registrationId = Codegen.empty();
        this.requestId = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.sourceId = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatacenterConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datacenterConnectorId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<String> registrationId;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> serviceAccount;
        private Output<String> sourceId;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(DatacenterConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenterConnectorId = defaults.datacenterConnectorId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.registrationId = defaults.registrationId;
    	      this.requestId = defaults.requestId;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sourceId = defaults.sourceId;
    	      this.version = defaults.version;
        }

        public Builder datacenterConnectorId(Output<String> datacenterConnectorId) {
            this.datacenterConnectorId = Objects.requireNonNull(datacenterConnectorId);
            return this;
        }
        public Builder datacenterConnectorId(String datacenterConnectorId) {
            this.datacenterConnectorId = Output.of(Objects.requireNonNull(datacenterConnectorId));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder registrationId(@Nullable Output<String> registrationId) {
            this.registrationId = registrationId;
            return this;
        }
        public Builder registrationId(@Nullable String registrationId) {
            this.registrationId = Codegen.ofNullable(registrationId);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder sourceId(Output<String> sourceId) {
            this.sourceId = Objects.requireNonNull(sourceId);
            return this;
        }
        public Builder sourceId(String sourceId) {
            this.sourceId = Output.of(Objects.requireNonNull(sourceId));
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public DatacenterConnectorArgs build() {
            return new DatacenterConnectorArgs(datacenterConnectorId, location, project, registrationId, requestId, serviceAccount, sourceId, version);
        }
    }
}
