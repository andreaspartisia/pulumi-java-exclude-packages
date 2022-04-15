// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v2.enums.ParticipantRole;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ParticipantArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParticipantArgs Empty = new ParticipantArgs();

    @Import(name="conversationId", required=true)
      private final Output<String> conversationId;

    public Output<String> conversationId() {
        return this.conversationId;
    }

    /**
     * Optional. Key-value filters on the metadata of documents returned by article suggestion. If specified, article suggestion only returns suggested documents that match all filters in their Document.metadata. Multiple values for a metadata key should be concatenated by comma. For example, filters to match all documents that have 'US' or 'CA' in their market metadata values and 'agent' in their user metadata values will be ```documents_metadata_filters { key: "market" value: "US,CA" } documents_metadata_filters { key: "user" value: "agent" }```
     * 
     */
    @Import(name="documentsMetadataFilters")
      private final @Nullable Output<Map<String,String>> documentsMetadataFilters;

    public Output<Map<String,String>> documentsMetadataFilters() {
        return this.documentsMetadataFilters == null ? Codegen.empty() : this.documentsMetadataFilters;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Optional. The unique identifier of this participant. Format: `projects//locations//conversations//participants/`.
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

    /**
     * Immutable. The role this participant plays in the conversation. This field must be set during participant creation and is then immutable.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<ParticipantRole> role;

    public Output<ParticipantRole> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * Optional. Label applied to streams representing this participant in SIPREC XML metadata and SDP. This is used to assign transcriptions from that media stream to this participant. This field can be updated.
     * 
     */
    @Import(name="sipRecordingMediaLabel")
      private final @Nullable Output<String> sipRecordingMediaLabel;

    public Output<String> sipRecordingMediaLabel() {
        return this.sipRecordingMediaLabel == null ? Codegen.empty() : this.sipRecordingMediaLabel;
    }

    public ParticipantArgs(
        Output<String> conversationId,
        @Nullable Output<Map<String,String>> documentsMetadataFilters,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<ParticipantRole> role,
        @Nullable Output<String> sipRecordingMediaLabel) {
        this.conversationId = Objects.requireNonNull(conversationId, "expected parameter 'conversationId' to be non-null");
        this.documentsMetadataFilters = documentsMetadataFilters;
        this.location = location;
        this.name = name;
        this.project = project;
        this.role = role;
        this.sipRecordingMediaLabel = sipRecordingMediaLabel;
    }

    private ParticipantArgs() {
        this.conversationId = Codegen.empty();
        this.documentsMetadataFilters = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
        this.sipRecordingMediaLabel = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParticipantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> conversationId;
        private @Nullable Output<Map<String,String>> documentsMetadataFilters;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<ParticipantRole> role;
        private @Nullable Output<String> sipRecordingMediaLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(ParticipantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationId = defaults.conversationId;
    	      this.documentsMetadataFilters = defaults.documentsMetadataFilters;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.sipRecordingMediaLabel = defaults.sipRecordingMediaLabel;
        }

        public Builder conversationId(Output<String> conversationId) {
            this.conversationId = Objects.requireNonNull(conversationId);
            return this;
        }
        public Builder conversationId(String conversationId) {
            this.conversationId = Output.of(Objects.requireNonNull(conversationId));
            return this;
        }
        public Builder documentsMetadataFilters(@Nullable Output<Map<String,String>> documentsMetadataFilters) {
            this.documentsMetadataFilters = documentsMetadataFilters;
            return this;
        }
        public Builder documentsMetadataFilters(@Nullable Map<String,String> documentsMetadataFilters) {
            this.documentsMetadataFilters = Codegen.ofNullable(documentsMetadataFilters);
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
        public Builder role(@Nullable Output<ParticipantRole> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable ParticipantRole role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder sipRecordingMediaLabel(@Nullable Output<String> sipRecordingMediaLabel) {
            this.sipRecordingMediaLabel = sipRecordingMediaLabel;
            return this;
        }
        public Builder sipRecordingMediaLabel(@Nullable String sipRecordingMediaLabel) {
            this.sipRecordingMediaLabel = Codegen.ofNullable(sipRecordingMediaLabel);
            return this;
        }        public ParticipantArgs build() {
            return new ParticipantArgs(conversationId, documentsMetadataFilters, location, name, project, role, sipRecordingMediaLabel);
        }
    }
}
