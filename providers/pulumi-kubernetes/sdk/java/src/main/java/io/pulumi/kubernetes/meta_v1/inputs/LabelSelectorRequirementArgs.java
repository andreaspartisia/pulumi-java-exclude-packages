// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.meta_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A label selector requirement is a selector that contains values, a key, and an operator that relates the key and values.
 * 
 */
public final class LabelSelectorRequirementArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelSelectorRequirementArgs Empty = new LabelSelectorRequirementArgs();

    /**
     * key is the label key that the selector applies to.
     * 
     */
    @InputImport(name="key", required=true)
    private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * operator represents a key's relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist.
     * 
     */
    @InputImport(name="operator", required=true)
    private final Input<String> operator;

    public Input<String> getOperator() {
        return this.operator;
    }

    /**
     * values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
     * 
     */
    @InputImport(name="values")
    private final @Nullable Input<List<String>> values;

    public Input<List<String>> getValues() {
        return this.values == null ? Input.empty() : this.values;
    }

    public LabelSelectorRequirementArgs(
        Input<String> key,
        Input<String> operator,
        @Nullable Input<List<String>> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.values = values;
    }

    private LabelSelectorRequirementArgs() {
        this.key = Input.empty();
        this.operator = Input.empty();
        this.values = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelSelectorRequirementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<String> operator;
        private @Nullable Input<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelSelectorRequirementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.operator = defaults.operator;
    	      this.values = defaults.values;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setOperator(Input<String> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Input.of(Objects.requireNonNull(operator));
            return this;
        }

        public Builder setValues(@Nullable Input<List<String>> values) {
            this.values = values;
            return this;
        }

        public Builder setValues(@Nullable List<String> values) {
            this.values = Input.ofNullable(values);
            return this;
        }

        public LabelSelectorRequirementArgs build() {
            return new LabelSelectorRequirementArgs(key, operator, values);
        }
    }
}