// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.healthcare_v1.enums.FhirStoreVersion;
import io.pulumi.googlenative.healthcare_v1.inputs.NotificationConfigArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.StreamConfigArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.ValidationConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreArgs Empty = new FhirStoreArgs();

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * If true, overrides the default search behavior for this FHIR store to `handling=strict` which returns an error for unrecognized search parameters. If false, uses the FHIR specification default `handling=lenient` which ignores unrecognized search parameters. The handling can always be changed from the default on an individual API call by setting the HTTP header `Prefer: handling=strict` or `Prefer: handling=lenient`.
     * 
     */
    @Import(name="defaultSearchHandlingStrict")
      private final @Nullable Output<Boolean> defaultSearchHandlingStrict;

    public Output<Boolean> defaultSearchHandlingStrict() {
        return this.defaultSearchHandlingStrict == null ? Codegen.empty() : this.defaultSearchHandlingStrict;
    }

    /**
     * Immutable. Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store creation. The default value is false, meaning that the API enforces referential integrity and fails the requests that result in inconsistent state in the FHIR store. When this field is set to true, the API skips referential integrity checks. Consequently, operations that rely on references, such as GetPatientEverything, do not return all the results if broken references exist.
     * 
     */
    @Import(name="disableReferentialIntegrity")
      private final @Nullable Output<Boolean> disableReferentialIntegrity;

    public Output<Boolean> disableReferentialIntegrity() {
        return this.disableReferentialIntegrity == null ? Codegen.empty() : this.disableReferentialIntegrity;
    }

    /**
     * Immutable. Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation of FHIR store. If set to false, which is the default behavior, all write operations cause historical versions to be recorded automatically. The historical versions can be fetched through the history APIs, but cannot be updated. If set to true, no historical versions are kept. The server sends errors for attempts to read the historical versions.
     * 
     */
    @Import(name="disableResourceVersioning")
      private final @Nullable Output<Boolean> disableResourceVersioning;

    public Output<Boolean> disableResourceVersioning() {
        return this.disableResourceVersioning == null ? Codegen.empty() : this.disableResourceVersioning;
    }

    /**
     * Whether this FHIR store has the [updateCreate capability](https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate). This determines if the client can use an Update operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through the Create operation and attempts to update a non-existent resource return errors. It is strongly advised not to include or encode any sensitive data such as patient identifiers in client-specified resource IDs. Those IDs are part of the FHIR resource path recorded in Cloud audit logs and Pub/Sub notifications. Those IDs can also be contained in reference fields within other resources.
     * 
     */
    @Import(name="enableUpdateCreate")
      private final @Nullable Output<Boolean> enableUpdateCreate;

    public Output<Boolean> enableUpdateCreate() {
        return this.enableUpdateCreate == null ? Codegen.empty() : this.enableUpdateCreate;
    }

    @Import(name="fhirStoreId")
      private final @Nullable Output<String> fhirStoreId;

    public Output<String> fhirStoreId() {
        return this.fhirStoreId == null ? Codegen.empty() : this.fhirStoreId;
    }

    /**
     * User-supplied key-value pairs used to organize FHIR stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * If non-empty, publish all resource modifications of this FHIR store to this destination. The Pub/Sub message attributes contain a map with a string describing the action that has triggered the notification. For example, "action":"CreateResource".
     * 
     */
    @Import(name="notificationConfig")
      private final @Nullable Output<NotificationConfigArgs> notificationConfig;

    public Output<NotificationConfigArgs> notificationConfig() {
        return this.notificationConfig == null ? Codegen.empty() : this.notificationConfig;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * A list of streaming configs that configure the destinations of streaming export for every resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming configs. After a new config is added, the next resource mutation is streamed to the new location in addition to the existing ones. When a location is removed from the list, the server stops streaming to that location. Before adding a new config, you must add the required [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order of dozens of seconds) is expected before the results show up in the streaming destination.
     * 
     */
    @Import(name="streamConfigs")
      private final @Nullable Output<List<StreamConfigArgs>> streamConfigs;

    public Output<List<StreamConfigArgs>> streamConfigs() {
        return this.streamConfigs == null ? Codegen.empty() : this.streamConfigs;
    }

    /**
     * Configuration for how to validate incoming FHIR resources against configured profiles.
     * 
     */
    @Import(name="validationConfig")
      private final @Nullable Output<ValidationConfigArgs> validationConfig;

    public Output<ValidationConfigArgs> validationConfig() {
        return this.validationConfig == null ? Codegen.empty() : this.validationConfig;
    }

    /**
     * Immutable. The FHIR specification version that this FHIR store supports natively. This field is immutable after store creation. Requests are rejected if they contain FHIR resources of a different version. Version is required for every FHIR store.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<FhirStoreVersion> version;

    public Output<FhirStoreVersion> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public FhirStoreArgs(
        Output<String> datasetId,
        @Nullable Output<Boolean> defaultSearchHandlingStrict,
        @Nullable Output<Boolean> disableReferentialIntegrity,
        @Nullable Output<Boolean> disableResourceVersioning,
        @Nullable Output<Boolean> enableUpdateCreate,
        @Nullable Output<String> fhirStoreId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<NotificationConfigArgs> notificationConfig,
        @Nullable Output<String> project,
        @Nullable Output<List<StreamConfigArgs>> streamConfigs,
        @Nullable Output<ValidationConfigArgs> validationConfig,
        @Nullable Output<FhirStoreVersion> version) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.defaultSearchHandlingStrict = defaultSearchHandlingStrict;
        this.disableReferentialIntegrity = disableReferentialIntegrity;
        this.disableResourceVersioning = disableResourceVersioning;
        this.enableUpdateCreate = enableUpdateCreate;
        this.fhirStoreId = fhirStoreId;
        this.labels = labels;
        this.location = location;
        this.notificationConfig = notificationConfig;
        this.project = project;
        this.streamConfigs = streamConfigs;
        this.validationConfig = validationConfig;
        this.version = version;
    }

    private FhirStoreArgs() {
        this.datasetId = Codegen.empty();
        this.defaultSearchHandlingStrict = Codegen.empty();
        this.disableReferentialIntegrity = Codegen.empty();
        this.disableResourceVersioning = Codegen.empty();
        this.enableUpdateCreate = Codegen.empty();
        this.fhirStoreId = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.notificationConfig = Codegen.empty();
        this.project = Codegen.empty();
        this.streamConfigs = Codegen.empty();
        this.validationConfig = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datasetId;
        private @Nullable Output<Boolean> defaultSearchHandlingStrict;
        private @Nullable Output<Boolean> disableReferentialIntegrity;
        private @Nullable Output<Boolean> disableResourceVersioning;
        private @Nullable Output<Boolean> enableUpdateCreate;
        private @Nullable Output<String> fhirStoreId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<NotificationConfigArgs> notificationConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<List<StreamConfigArgs>> streamConfigs;
        private @Nullable Output<ValidationConfigArgs> validationConfig;
        private @Nullable Output<FhirStoreVersion> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.defaultSearchHandlingStrict = defaults.defaultSearchHandlingStrict;
    	      this.disableReferentialIntegrity = defaults.disableReferentialIntegrity;
    	      this.disableResourceVersioning = defaults.disableResourceVersioning;
    	      this.enableUpdateCreate = defaults.enableUpdateCreate;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.project = defaults.project;
    	      this.streamConfigs = defaults.streamConfigs;
    	      this.validationConfig = defaults.validationConfig;
    	      this.version = defaults.version;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder defaultSearchHandlingStrict(@Nullable Output<Boolean> defaultSearchHandlingStrict) {
            this.defaultSearchHandlingStrict = defaultSearchHandlingStrict;
            return this;
        }
        public Builder defaultSearchHandlingStrict(@Nullable Boolean defaultSearchHandlingStrict) {
            this.defaultSearchHandlingStrict = Codegen.ofNullable(defaultSearchHandlingStrict);
            return this;
        }
        public Builder disableReferentialIntegrity(@Nullable Output<Boolean> disableReferentialIntegrity) {
            this.disableReferentialIntegrity = disableReferentialIntegrity;
            return this;
        }
        public Builder disableReferentialIntegrity(@Nullable Boolean disableReferentialIntegrity) {
            this.disableReferentialIntegrity = Codegen.ofNullable(disableReferentialIntegrity);
            return this;
        }
        public Builder disableResourceVersioning(@Nullable Output<Boolean> disableResourceVersioning) {
            this.disableResourceVersioning = disableResourceVersioning;
            return this;
        }
        public Builder disableResourceVersioning(@Nullable Boolean disableResourceVersioning) {
            this.disableResourceVersioning = Codegen.ofNullable(disableResourceVersioning);
            return this;
        }
        public Builder enableUpdateCreate(@Nullable Output<Boolean> enableUpdateCreate) {
            this.enableUpdateCreate = enableUpdateCreate;
            return this;
        }
        public Builder enableUpdateCreate(@Nullable Boolean enableUpdateCreate) {
            this.enableUpdateCreate = Codegen.ofNullable(enableUpdateCreate);
            return this;
        }
        public Builder fhirStoreId(@Nullable Output<String> fhirStoreId) {
            this.fhirStoreId = fhirStoreId;
            return this;
        }
        public Builder fhirStoreId(@Nullable String fhirStoreId) {
            this.fhirStoreId = Codegen.ofNullable(fhirStoreId);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
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
        public Builder notificationConfig(@Nullable Output<NotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder notificationConfig(@Nullable NotificationConfigArgs notificationConfig) {
            this.notificationConfig = Codegen.ofNullable(notificationConfig);
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
        public Builder streamConfigs(@Nullable Output<List<StreamConfigArgs>> streamConfigs) {
            this.streamConfigs = streamConfigs;
            return this;
        }
        public Builder streamConfigs(@Nullable List<StreamConfigArgs> streamConfigs) {
            this.streamConfigs = Codegen.ofNullable(streamConfigs);
            return this;
        }
        public Builder streamConfigs(StreamConfigArgs... streamConfigs) {
            return streamConfigs(List.of(streamConfigs));
        }
        public Builder validationConfig(@Nullable Output<ValidationConfigArgs> validationConfig) {
            this.validationConfig = validationConfig;
            return this;
        }
        public Builder validationConfig(@Nullable ValidationConfigArgs validationConfig) {
            this.validationConfig = Codegen.ofNullable(validationConfig);
            return this;
        }
        public Builder version(@Nullable Output<FhirStoreVersion> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable FhirStoreVersion version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public FhirStoreArgs build() {
            return new FhirStoreArgs(datasetId, defaultSearchHandlingStrict, disableReferentialIntegrity, disableResourceVersioning, enableUpdateCreate, fhirStoreId, labels, location, notificationConfig, project, streamConfigs, validationConfig, version);
        }
    }
}
