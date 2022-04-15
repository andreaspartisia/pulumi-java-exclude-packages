// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.OptionResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FieldResponse {
    /**
     * The field cardinality.
     * 
     */
    private final String cardinality;
    /**
     * The string value of the default value of this field. Proto2 syntax only.
     * 
     */
    private final String defaultValue;
    /**
     * The field JSON name.
     * 
     */
    private final String jsonName;
    /**
     * The field type.
     * 
     */
    private final String kind;
    /**
     * The field name.
     * 
     */
    private final String name;
    /**
     * The field number.
     * 
     */
    private final Integer number;
    /**
     * The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
     * 
     */
    private final Integer oneofIndex;
    /**
     * The protocol buffer options.
     * 
     */
    private final List<OptionResponse> options;
    /**
     * Whether to use alternative packed wire representation.
     * 
     */
    private final Boolean packed;
    /**
     * The field type URL, without the scheme, for message or enumeration types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
     * 
     */
    private final String typeUrl;

    @CustomType.Constructor
    private FieldResponse(
        @CustomType.Parameter("cardinality") String cardinality,
        @CustomType.Parameter("defaultValue") String defaultValue,
        @CustomType.Parameter("jsonName") String jsonName,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("number") Integer number,
        @CustomType.Parameter("oneofIndex") Integer oneofIndex,
        @CustomType.Parameter("options") List<OptionResponse> options,
        @CustomType.Parameter("packed") Boolean packed,
        @CustomType.Parameter("typeUrl") String typeUrl) {
        this.cardinality = cardinality;
        this.defaultValue = defaultValue;
        this.jsonName = jsonName;
        this.kind = kind;
        this.name = name;
        this.number = number;
        this.oneofIndex = oneofIndex;
        this.options = options;
        this.packed = packed;
        this.typeUrl = typeUrl;
    }

    /**
     * The field cardinality.
     * 
    */
    public String cardinality() {
        return this.cardinality;
    }
    /**
     * The string value of the default value of this field. Proto2 syntax only.
     * 
    */
    public String defaultValue() {
        return this.defaultValue;
    }
    /**
     * The field JSON name.
     * 
    */
    public String jsonName() {
        return this.jsonName;
    }
    /**
     * The field type.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * The field name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The field number.
     * 
    */
    public Integer number() {
        return this.number;
    }
    /**
     * The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
     * 
    */
    public Integer oneofIndex() {
        return this.oneofIndex;
    }
    /**
     * The protocol buffer options.
     * 
    */
    public List<OptionResponse> options() {
        return this.options;
    }
    /**
     * Whether to use alternative packed wire representation.
     * 
    */
    public Boolean packed() {
        return this.packed;
    }
    /**
     * The field type URL, without the scheme, for message or enumeration types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
     * 
    */
    public String typeUrl() {
        return this.typeUrl;
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
