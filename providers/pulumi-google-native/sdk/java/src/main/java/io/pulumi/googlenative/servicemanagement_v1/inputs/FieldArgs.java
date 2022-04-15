// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.servicemanagement_v1.enums.FieldCardinality;
import io.pulumi.googlenative.servicemanagement_v1.enums.FieldKind;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single field of a message type.
 * 
 */
public final class FieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldArgs Empty = new FieldArgs();

    /**
     * The field cardinality.
     * 
     */
    @Import(name="cardinality")
      private final @Nullable Output<FieldCardinality> cardinality;

    public Output<FieldCardinality> cardinality() {
        return this.cardinality == null ? Codegen.empty() : this.cardinality;
    }

    /**
     * The string value of the default value of this field. Proto2 syntax only.
     * 
     */
    @Import(name="defaultValue")
      private final @Nullable Output<String> defaultValue;

    public Output<String> defaultValue() {
        return this.defaultValue == null ? Codegen.empty() : this.defaultValue;
    }

    /**
     * The field JSON name.
     * 
     */
    @Import(name="jsonName")
      private final @Nullable Output<String> jsonName;

    public Output<String> jsonName() {
        return this.jsonName == null ? Codegen.empty() : this.jsonName;
    }

    /**
     * The field type.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<FieldKind> kind;

    public Output<FieldKind> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * The field name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The field number.
     * 
     */
    @Import(name="number")
      private final @Nullable Output<Integer> number;

    public Output<Integer> number() {
        return this.number == null ? Codegen.empty() : this.number;
    }

    /**
     * The index of the field type in `Type.oneofs`, for message or enumeration types. The first type has index 1; zero means the type is not in the list.
     * 
     */
    @Import(name="oneofIndex")
      private final @Nullable Output<Integer> oneofIndex;

    public Output<Integer> oneofIndex() {
        return this.oneofIndex == null ? Codegen.empty() : this.oneofIndex;
    }

    /**
     * The protocol buffer options.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<List<OptionArgs>> options;

    public Output<List<OptionArgs>> options() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    /**
     * Whether to use alternative packed wire representation.
     * 
     */
    @Import(name="packed")
      private final @Nullable Output<Boolean> packed;

    public Output<Boolean> packed() {
        return this.packed == null ? Codegen.empty() : this.packed;
    }

    /**
     * The field type URL, without the scheme, for message or enumeration types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
     * 
     */
    @Import(name="typeUrl")
      private final @Nullable Output<String> typeUrl;

    public Output<String> typeUrl() {
        return this.typeUrl == null ? Codegen.empty() : this.typeUrl;
    }

    public FieldArgs(
        @Nullable Output<FieldCardinality> cardinality,
        @Nullable Output<String> defaultValue,
        @Nullable Output<String> jsonName,
        @Nullable Output<FieldKind> kind,
        @Nullable Output<String> name,
        @Nullable Output<Integer> number,
        @Nullable Output<Integer> oneofIndex,
        @Nullable Output<List<OptionArgs>> options,
        @Nullable Output<Boolean> packed,
        @Nullable Output<String> typeUrl) {
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

    private FieldArgs() {
        this.cardinality = Codegen.empty();
        this.defaultValue = Codegen.empty();
        this.jsonName = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.number = Codegen.empty();
        this.oneofIndex = Codegen.empty();
        this.options = Codegen.empty();
        this.packed = Codegen.empty();
        this.typeUrl = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FieldCardinality> cardinality;
        private @Nullable Output<String> defaultValue;
        private @Nullable Output<String> jsonName;
        private @Nullable Output<FieldKind> kind;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> number;
        private @Nullable Output<Integer> oneofIndex;
        private @Nullable Output<List<OptionArgs>> options;
        private @Nullable Output<Boolean> packed;
        private @Nullable Output<String> typeUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldArgs defaults) {
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

        public Builder cardinality(@Nullable Output<FieldCardinality> cardinality) {
            this.cardinality = cardinality;
            return this;
        }
        public Builder cardinality(@Nullable FieldCardinality cardinality) {
            this.cardinality = Codegen.ofNullable(cardinality);
            return this;
        }
        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = Codegen.ofNullable(defaultValue);
            return this;
        }
        public Builder jsonName(@Nullable Output<String> jsonName) {
            this.jsonName = jsonName;
            return this;
        }
        public Builder jsonName(@Nullable String jsonName) {
            this.jsonName = Codegen.ofNullable(jsonName);
            return this;
        }
        public Builder kind(@Nullable Output<FieldKind> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable FieldKind kind) {
            this.kind = Codegen.ofNullable(kind);
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
        public Builder number(@Nullable Output<Integer> number) {
            this.number = number;
            return this;
        }
        public Builder number(@Nullable Integer number) {
            this.number = Codegen.ofNullable(number);
            return this;
        }
        public Builder oneofIndex(@Nullable Output<Integer> oneofIndex) {
            this.oneofIndex = oneofIndex;
            return this;
        }
        public Builder oneofIndex(@Nullable Integer oneofIndex) {
            this.oneofIndex = Codegen.ofNullable(oneofIndex);
            return this;
        }
        public Builder options(@Nullable Output<List<OptionArgs>> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable List<OptionArgs> options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }
        public Builder options(OptionArgs... options) {
            return options(List.of(options));
        }
        public Builder packed(@Nullable Output<Boolean> packed) {
            this.packed = packed;
            return this;
        }
        public Builder packed(@Nullable Boolean packed) {
            this.packed = Codegen.ofNullable(packed);
            return this;
        }
        public Builder typeUrl(@Nullable Output<String> typeUrl) {
            this.typeUrl = typeUrl;
            return this;
        }
        public Builder typeUrl(@Nullable String typeUrl) {
            this.typeUrl = Codegen.ofNullable(typeUrl);
            return this;
        }        public FieldArgs build() {
            return new FieldArgs(cardinality, defaultValue, jsonName, kind, name, number, oneofIndex, options, packed, typeUrl);
        }
    }
}
