// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.aws.glue.inputs.CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorSchemaReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorSchemaReferenceArgs Empty = new CatalogTableStorageDescriptorSchemaReferenceArgs();

    /**
     * Configuration block that contains schema identity fields. Either this or the `schema_version_id` has to be provided. See `schema_id` below.
     * 
     */
    @InputImport(name="schemaId")
      private final @Nullable Input<CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs> schemaId;

    public Input<CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs> getSchemaId() {
        return this.schemaId == null ? Input.empty() : this.schemaId;
    }

    /**
     * Unique ID assigned to a version of the schema. Either this or the `schema_id` has to be provided.
     * 
     */
    @InputImport(name="schemaVersionId")
      private final @Nullable Input<String> schemaVersionId;

    public Input<String> getSchemaVersionId() {
        return this.schemaVersionId == null ? Input.empty() : this.schemaVersionId;
    }

    /**
     * Version number of the schema.
     * 
     */
    @InputImport(name="schemaVersionNumber", required=true)
      private final Input<Integer> schemaVersionNumber;

    public Input<Integer> getSchemaVersionNumber() {
        return this.schemaVersionNumber;
    }

    public CatalogTableStorageDescriptorSchemaReferenceArgs(
        @Nullable Input<CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs> schemaId,
        @Nullable Input<String> schemaVersionId,
        Input<Integer> schemaVersionNumber) {
        this.schemaId = schemaId;
        this.schemaVersionId = schemaVersionId;
        this.schemaVersionNumber = Objects.requireNonNull(schemaVersionNumber, "expected parameter 'schemaVersionNumber' to be non-null");
    }

    private CatalogTableStorageDescriptorSchemaReferenceArgs() {
        this.schemaId = Input.empty();
        this.schemaVersionId = Input.empty();
        this.schemaVersionNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSchemaReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs> schemaId;
        private @Nullable Input<String> schemaVersionId;
        private Input<Integer> schemaVersionNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSchemaReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schemaId = defaults.schemaId;
    	      this.schemaVersionId = defaults.schemaVersionId;
    	      this.schemaVersionNumber = defaults.schemaVersionNumber;
        }

        public Builder setSchemaId(@Nullable Input<CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs> schemaId) {
            this.schemaId = schemaId;
            return this;
        }

        public Builder setSchemaId(@Nullable CatalogTableStorageDescriptorSchemaReferenceSchemaIdArgs schemaId) {
            this.schemaId = Input.ofNullable(schemaId);
            return this;
        }

        public Builder setSchemaVersionId(@Nullable Input<String> schemaVersionId) {
            this.schemaVersionId = schemaVersionId;
            return this;
        }

        public Builder setSchemaVersionId(@Nullable String schemaVersionId) {
            this.schemaVersionId = Input.ofNullable(schemaVersionId);
            return this;
        }

        public Builder setSchemaVersionNumber(Input<Integer> schemaVersionNumber) {
            this.schemaVersionNumber = Objects.requireNonNull(schemaVersionNumber);
            return this;
        }

        public Builder setSchemaVersionNumber(Integer schemaVersionNumber) {
            this.schemaVersionNumber = Input.of(Objects.requireNonNull(schemaVersionNumber));
            return this;
        }
        public CatalogTableStorageDescriptorSchemaReferenceArgs build() {
            return new CatalogTableStorageDescriptorSchemaReferenceArgs(schemaId, schemaVersionId, schemaVersionNumber);
        }
    }
}