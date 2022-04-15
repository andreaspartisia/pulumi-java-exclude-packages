// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.healthcare_v1.inputs.Hl7SchemaConfigResponse;
import io.pulumi.googlenative.healthcare_v1.inputs.Hl7TypesConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A schema package contains a set of schemas and type definitions.
 * 
 */
public final class SchemaPackageResponse extends io.pulumi.resources.InvokeArgs {

    public static final SchemaPackageResponse Empty = new SchemaPackageResponse();

    /**
     * Flag to ignore all min_occurs restrictions in the schema. This means that incoming messages can omit any group, segment, field, component, or subcomponent.
     * 
     */
    @Import(name="ignoreMinOccurs", required=true)
      private final Boolean ignoreMinOccurs;

    public Boolean ignoreMinOccurs() {
        return this.ignoreMinOccurs;
    }

    /**
     * Schema configs that are layered based on their VersionSources that match the incoming message. Schema configs present in higher indices override those in lower indices with the same message type and trigger event if their VersionSources all match an incoming message.
     * 
     */
    @Import(name="schemas", required=true)
      private final List<Hl7SchemaConfigResponse> schemas;

    public List<Hl7SchemaConfigResponse> schemas() {
        return this.schemas;
    }

    /**
     * Determines how messages that fail to parse are handled.
     * 
     */
    @Import(name="schematizedParsingType", required=true)
      private final String schematizedParsingType;

    public String schematizedParsingType() {
        return this.schematizedParsingType;
    }

    /**
     * Schema type definitions that are layered based on their VersionSources that match the incoming message. Type definitions present in higher indices override those in lower indices with the same type name if their VersionSources all match an incoming message.
     * 
     */
    @Import(name="types", required=true)
      private final List<Hl7TypesConfigResponse> types;

    public List<Hl7TypesConfigResponse> types() {
        return this.types;
    }

    /**
     * Determines how unexpected segments (segments not matched to the schema) are handled.
     * 
     */
    @Import(name="unexpectedSegmentHandling", required=true)
      private final String unexpectedSegmentHandling;

    public String unexpectedSegmentHandling() {
        return this.unexpectedSegmentHandling;
    }

    public SchemaPackageResponse(
        Boolean ignoreMinOccurs,
        List<Hl7SchemaConfigResponse> schemas,
        String schematizedParsingType,
        List<Hl7TypesConfigResponse> types,
        String unexpectedSegmentHandling) {
        this.ignoreMinOccurs = Objects.requireNonNull(ignoreMinOccurs, "expected parameter 'ignoreMinOccurs' to be non-null");
        this.schemas = Objects.requireNonNull(schemas, "expected parameter 'schemas' to be non-null");
        this.schematizedParsingType = Objects.requireNonNull(schematizedParsingType, "expected parameter 'schematizedParsingType' to be non-null");
        this.types = Objects.requireNonNull(types, "expected parameter 'types' to be non-null");
        this.unexpectedSegmentHandling = Objects.requireNonNull(unexpectedSegmentHandling, "expected parameter 'unexpectedSegmentHandling' to be non-null");
    }

    private SchemaPackageResponse() {
        this.ignoreMinOccurs = null;
        this.schemas = List.of();
        this.schematizedParsingType = null;
        this.types = List.of();
        this.unexpectedSegmentHandling = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaPackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean ignoreMinOccurs;
        private List<Hl7SchemaConfigResponse> schemas;
        private String schematizedParsingType;
        private List<Hl7TypesConfigResponse> types;
        private String unexpectedSegmentHandling;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaPackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMinOccurs = defaults.ignoreMinOccurs;
    	      this.schemas = defaults.schemas;
    	      this.schematizedParsingType = defaults.schematizedParsingType;
    	      this.types = defaults.types;
    	      this.unexpectedSegmentHandling = defaults.unexpectedSegmentHandling;
        }

        public Builder ignoreMinOccurs(Boolean ignoreMinOccurs) {
            this.ignoreMinOccurs = Objects.requireNonNull(ignoreMinOccurs);
            return this;
        }
        public Builder schemas(List<Hl7SchemaConfigResponse> schemas) {
            this.schemas = Objects.requireNonNull(schemas);
            return this;
        }
        public Builder schemas(Hl7SchemaConfigResponse... schemas) {
            return schemas(List.of(schemas));
        }
        public Builder schematizedParsingType(String schematizedParsingType) {
            this.schematizedParsingType = Objects.requireNonNull(schematizedParsingType);
            return this;
        }
        public Builder types(List<Hl7TypesConfigResponse> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public Builder types(Hl7TypesConfigResponse... types) {
            return types(List.of(types));
        }
        public Builder unexpectedSegmentHandling(String unexpectedSegmentHandling) {
            this.unexpectedSegmentHandling = Objects.requireNonNull(unexpectedSegmentHandling);
            return this;
        }        public SchemaPackageResponse build() {
            return new SchemaPackageResponse(ignoreMinOccurs, schemas, schematizedParsingType, types, unexpectedSegmentHandling);
        }
    }
}
