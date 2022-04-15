// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.metastore_v1beta.inputs.DatabaseDumpArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MetadataImportArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetadataImportArgs Empty = new MetadataImportArgs();

    /**
     * Immutable. A database dump from a pre-existing metastore's database.
     * 
     */
    @Import(name="databaseDump")
      private final @Nullable Output<DatabaseDumpArgs> databaseDump;

    public Output<DatabaseDumpArgs> databaseDump() {
        return this.databaseDump == null ? Codegen.empty() : this.databaseDump;
    }

    /**
     * The description of the metadata import.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="metadataImportId", required=true)
      private final Output<String> metadataImportId;

    public Output<String> metadataImportId() {
        return this.metadataImportId;
    }

    /**
     * Immutable. The relative resource name of the metadata import, of the form:projects/{project_number}/locations/{location_id}/services/{service_id}/metadataImports/{metadata_import_id}.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    @Import(name="serviceId", required=true)
      private final Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    public MetadataImportArgs(
        @Nullable Output<DatabaseDumpArgs> databaseDump,
        @Nullable Output<String> description,
        @Nullable Output<String> location,
        Output<String> metadataImportId,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        Output<String> serviceId) {
        this.databaseDump = databaseDump;
        this.description = description;
        this.location = location;
        this.metadataImportId = Objects.requireNonNull(metadataImportId, "expected parameter 'metadataImportId' to be non-null");
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private MetadataImportArgs() {
        this.databaseDump = Codegen.empty();
        this.description = Codegen.empty();
        this.location = Codegen.empty();
        this.metadataImportId = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.serviceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataImportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatabaseDumpArgs> databaseDump;
        private @Nullable Output<String> description;
        private @Nullable Output<String> location;
        private Output<String> metadataImportId;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private Output<String> serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataImportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseDump = defaults.databaseDump;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.metadataImportId = defaults.metadataImportId;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder databaseDump(@Nullable Output<DatabaseDumpArgs> databaseDump) {
            this.databaseDump = databaseDump;
            return this;
        }
        public Builder databaseDump(@Nullable DatabaseDumpArgs databaseDump) {
            this.databaseDump = Codegen.ofNullable(databaseDump);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder metadataImportId(Output<String> metadataImportId) {
            this.metadataImportId = Objects.requireNonNull(metadataImportId);
            return this;
        }
        public Builder metadataImportId(String metadataImportId) {
            this.metadataImportId = Output.of(Objects.requireNonNull(metadataImportId));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
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
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder serviceId(Output<String> serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Output.of(Objects.requireNonNull(serviceId));
            return this;
        }        public MetadataImportArgs build() {
            return new MetadataImportArgs(databaseDump, description, location, metadataImportId, name, project, requestId, serviceId);
        }
    }
}
