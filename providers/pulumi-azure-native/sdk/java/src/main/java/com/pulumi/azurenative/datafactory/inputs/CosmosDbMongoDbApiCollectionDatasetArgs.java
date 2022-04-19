// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.DatasetFolderArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The CosmosDB (MongoDB API) database dataset.
 * 
 */
public final class CosmosDbMongoDbApiCollectionDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CosmosDbMongoDbApiCollectionDatasetArgs Empty = new CosmosDbMongoDbApiCollectionDatasetArgs();

    /**
     * List of tags that can be used for describing the Dataset.
     * 
     */
    @Import(name="annotations")
      private final @Nullable Output<List<Object>> annotations;

    public Output<List<Object>> annotations() {
        return this.annotations == null ? Codegen.empty() : this.annotations;
    }

    /**
     * The collection name of the CosmosDB (MongoDB API) database. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="collection", required=true)
      private final Output<Object> collection;

    public Output<Object> collection() {
        return this.collection;
    }

    /**
     * Dataset description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The folder that this Dataset is in. If not specified, Dataset will appear at the root level.
     * 
     */
    @Import(name="folder")
      private final @Nullable Output<DatasetFolderArgs> folder;

    public Output<DatasetFolderArgs> folder() {
        return this.folder == null ? Codegen.empty() : this.folder;
    }

    /**
     * Linked service reference.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Parameters for dataset.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Output<Map<String,ParameterSpecificationArgs>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * Columns that define the physical type schema of the dataset. Type: array (or Expression with resultType array), itemType: DatasetSchemaDataElement.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<Object> schema;

    public Output<Object> schema() {
        return this.schema == null ? Codegen.empty() : this.schema;
    }

    /**
     * Columns that define the structure of the dataset. Type: array (or Expression with resultType array), itemType: DatasetDataElement.
     * 
     */
    @Import(name="structure")
      private final @Nullable Output<Object> structure;

    public Output<Object> structure() {
        return this.structure == null ? Codegen.empty() : this.structure;
    }

    /**
     * Type of dataset.
     * Expected value is 'CosmosDbMongoDbApiCollection'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public CosmosDbMongoDbApiCollectionDatasetArgs(
        @Nullable Output<List<Object>> annotations,
        Output<Object> collection,
        @Nullable Output<String> description,
        @Nullable Output<DatasetFolderArgs> folder,
        Output<LinkedServiceReferenceArgs> linkedServiceName,
        @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters,
        @Nullable Output<Object> schema,
        @Nullable Output<Object> structure,
        Output<String> type) {
        this.annotations = annotations;
        this.collection = Objects.requireNonNull(collection, "expected parameter 'collection' to be non-null");
        this.description = description;
        this.folder = folder;
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.parameters = parameters;
        this.schema = schema;
        this.structure = structure;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private CosmosDbMongoDbApiCollectionDatasetArgs() {
        this.annotations = Codegen.empty();
        this.collection = Codegen.empty();
        this.description = Codegen.empty();
        this.folder = Codegen.empty();
        this.linkedServiceName = Codegen.empty();
        this.parameters = Codegen.empty();
        this.schema = Codegen.empty();
        this.structure = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbMongoDbApiCollectionDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Object>> annotations;
        private Output<Object> collection;
        private @Nullable Output<String> description;
        private @Nullable Output<DatasetFolderArgs> folder;
        private Output<LinkedServiceReferenceArgs> linkedServiceName;
        private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;
        private @Nullable Output<Object> schema;
        private @Nullable Output<Object> structure;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbMongoDbApiCollectionDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.collection = defaults.collection;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.parameters = defaults.parameters;
    	      this.schema = defaults.schema;
    	      this.structure = defaults.structure;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = Codegen.ofNullable(annotations);
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder collection(Output<Object> collection) {
            this.collection = Objects.requireNonNull(collection);
            return this;
        }
        public Builder collection(Object collection) {
            this.collection = Output.of(Objects.requireNonNull(collection));
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
        public Builder folder(@Nullable Output<DatasetFolderArgs> folder) {
            this.folder = folder;
            return this;
        }
        public Builder folder(@Nullable DatasetFolderArgs folder) {
            this.folder = Codegen.ofNullable(folder);
            return this;
        }
        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            this.linkedServiceName = Output.of(Objects.requireNonNull(linkedServiceName));
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationArgs> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder schema(@Nullable Output<Object> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable Object schema) {
            this.schema = Codegen.ofNullable(schema);
            return this;
        }
        public Builder structure(@Nullable Output<Object> structure) {
            this.structure = structure;
            return this;
        }
        public Builder structure(@Nullable Object structure) {
            this.structure = Codegen.ofNullable(structure);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public CosmosDbMongoDbApiCollectionDatasetArgs build() {
            return new CosmosDbMongoDbApiCollectionDatasetArgs(annotations, collection, description, folder, linkedServiceName, parameters, schema, structure, type);
        }
    }
}
