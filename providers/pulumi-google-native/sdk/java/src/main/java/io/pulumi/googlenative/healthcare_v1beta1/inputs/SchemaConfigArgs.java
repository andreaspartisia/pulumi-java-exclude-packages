// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.healthcare_v1beta1.enums.SchemaConfigSchemaType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for the FHIR BigQuery schema. Determines how the server generates the schema.
 * 
 */
public final class SchemaConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaConfigArgs Empty = new SchemaConfigArgs();

    /**
     * The depth for all recursive structures in the output analytics schema. For example, `concept` in the CodeSystem resource is a recursive structure; when the depth is 2, the CodeSystem table will have a column called `concept.concept` but not `concept.concept.concept`. If not specified or set to 0, the server will use the default value 2. The maximum depth allowed is 5.
     * 
     */
    @Import(name="recursiveStructureDepth")
      private final @Nullable Output<String> recursiveStructureDepth;

    public Output<String> recursiveStructureDepth() {
        return this.recursiveStructureDepth == null ? Codegen.empty() : this.recursiveStructureDepth;
    }

    /**
     * Specifies the output schema type. Schema type is required.
     * 
     */
    @Import(name="schemaType")
      private final @Nullable Output<SchemaConfigSchemaType> schemaType;

    public Output<SchemaConfigSchemaType> schemaType() {
        return this.schemaType == null ? Codegen.empty() : this.schemaType;
    }

    public SchemaConfigArgs(
        @Nullable Output<String> recursiveStructureDepth,
        @Nullable Output<SchemaConfigSchemaType> schemaType) {
        this.recursiveStructureDepth = recursiveStructureDepth;
        this.schemaType = schemaType;
    }

    private SchemaConfigArgs() {
        this.recursiveStructureDepth = Codegen.empty();
        this.schemaType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> recursiveStructureDepth;
        private @Nullable Output<SchemaConfigSchemaType> schemaType;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recursiveStructureDepth = defaults.recursiveStructureDepth;
    	      this.schemaType = defaults.schemaType;
        }

        public Builder recursiveStructureDepth(@Nullable Output<String> recursiveStructureDepth) {
            this.recursiveStructureDepth = recursiveStructureDepth;
            return this;
        }
        public Builder recursiveStructureDepth(@Nullable String recursiveStructureDepth) {
            this.recursiveStructureDepth = Codegen.ofNullable(recursiveStructureDepth);
            return this;
        }
        public Builder schemaType(@Nullable Output<SchemaConfigSchemaType> schemaType) {
            this.schemaType = schemaType;
            return this;
        }
        public Builder schemaType(@Nullable SchemaConfigSchemaType schemaType) {
            this.schemaType = Codegen.ofNullable(schemaType);
            return this;
        }        public SchemaConfigArgs build() {
            return new SchemaConfigArgs(recursiveStructureDepth, schemaType);
        }
    }
}
