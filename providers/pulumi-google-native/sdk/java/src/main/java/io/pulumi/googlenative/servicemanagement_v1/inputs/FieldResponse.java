// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A single field of a message type.
 * 
 */
public final class FieldResponse extends io.pulumi.resources.InvokeArgs {

    public static final FieldResponse Empty = new FieldResponse();

    /**
     * The field cardinality.
     * 
     */
    @Import(name="cardinality", required=true)
      private final String cardinality;

    public String cardinality() {
        return this.cardinality;
    }

    /**
     * The string value of the default value of this field. Proto2 syntax only.
     * 
     */
    @Import(name="defaultValue", required=true)
      private final String defaultValue;

    public String defaultValue() {
        return this.defaultValue;
    }

    /**
     * The field JSON name.
     * 
     */
    @Import(name="jsonName", required=true)
      private final String jsonName;

    public String jsonName() {
        return this.jsonName;
    }

    /**
     * The field type.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The field name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The field number.
     * 
     */
    @Import(name="number", required=true)
      private final Integer number;

    public Integer number() {
        return this.number;
    }

    /**
     * The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
     * 
     */
    @Import(name="oneofIndex", required=true)
      private final Integer oneofIndex;

    public Integer oneofIndex() {
        return this.oneofIndex;
    }

    /**
     * The protocol buffer options.
     * 
     */
    @Import(name="options", required=true)
      private final List<OptionResponse> options;

    public List<OptionResponse> options() {
        return this.options;
    }

    /**
     * Whether to use alternative packed wire representation.
     * 
     */
    @Import(name="packed", required=true)
      private final Boolean packed;

    public Boolean packed() {
        return this.packed;
    }

    /**
     * The field type URL, without the scheme, for message or enumeration types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
     * 
     */
    @Import(name="typeUrl", required=true)
      private final String typeUrl;

    public String typeUrl() {
        return this.typeUrl;
    }

    public FieldResponse(
        String cardinality,
        String defaultValue,
        String jsonName,
        String kind,
        String name,
        Integer number,
        Integer oneofIndex,
        List<OptionResponse> options,
        Boolean packed,
        String typeUrl) {
        this.cardinality = Objects.requireNonNull(cardinality, "expected parameter 'cardinality' to be non-null");
        this.defaultValue = Objects.requireNonNull(defaultValue, "expected parameter 'defaultValue' to be non-null");
        this.jsonName = Objects.requireNonNull(jsonName, "expected parameter 'jsonName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.number = Objects.requireNonNull(number, "expected parameter 'number' to be non-null");
        this.oneofIndex = Objects.requireNonNull(oneofIndex, "expected parameter 'oneofIndex' to be non-null");
        this.options = Objects.requireNonNull(options, "expected parameter 'options' to be non-null");
        this.packed = Objects.requireNonNull(packed, "expected parameter 'packed' to be non-null");
        this.typeUrl = Objects.requireNonNull(typeUrl, "expected parameter 'typeUrl' to be non-null");
    }

    private FieldResponse() {
        this.cardinality = null;
        this.defaultValue = null;
        this.jsonName = null;
        this.kind = null;
        this.name = null;
        this.number = null;
        this.oneofIndex = null;
        this.options = List.of();
        this.packed = null;
        this.typeUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cardinality;
        private String defaultValue;
        private String jsonName;
        private String kind;
        private String name;
        private Integer number;
        private Integer oneofIndex;
        private List<OptionResponse> options;
        private Boolean packed;
        private String typeUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardinality = defaults.cardinality;
    	      this.defaultValue = defaults.defaultValue;
    	      this.jsonName = defaults.jsonName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.oneofIndex = defaults.oneofIndex;
    	      this.options = defaults.options;
    	      this.packed = defaults.packed;
    	      this.typeUrl = defaults.typeUrl;
        }

        public Builder cardinality(String cardinality) {
            this.cardinality = Objects.requireNonNull(cardinality);
            return this;
        }
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }
        public Builder jsonName(String jsonName) {
            this.jsonName = Objects.requireNonNull(jsonName);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        public Builder oneofIndex(Integer oneofIndex) {
            this.oneofIndex = Objects.requireNonNull(oneofIndex);
            return this;
        }
        public Builder options(List<OptionResponse> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder options(OptionResponse... options) {
            return options(List.of(options));
        }
        public Builder packed(Boolean packed) {
            this.packed = Objects.requireNonNull(packed);
            return this;
        }
        public Builder typeUrl(String typeUrl) {
            this.typeUrl = Objects.requireNonNull(typeUrl);
            return this;
        }        public FieldResponse build() {
            return new FieldResponse(cardinality, defaultValue, jsonName, kind, name, number, oneofIndex, options, packed, typeUrl);
        }
    }
}
