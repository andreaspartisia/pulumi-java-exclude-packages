// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.inputs;

import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.myedgeorder.enums.SupportedFilterTypes;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Different types of filters supported and its values.
 * 
 */
public final class FilterableProperty extends com.pulumi.resources.InvokeArgs {

    public static final FilterableProperty Empty = new FilterableProperty();

    /**
     * Values to be filtered.
     * 
     */
    @Import(name="supportedValues", required=true)
    private List<String> supportedValues;

    public List<String> supportedValues() {
        return this.supportedValues;
    }

    /**
     * Type of product filter.
     * 
     */
    @Import(name="type", required=true)
    private Either<String,SupportedFilterTypes> type;

    public Either<String,SupportedFilterTypes> type() {
        return this.type;
    }

    private FilterableProperty() {}

    private FilterableProperty(FilterableProperty $) {
        this.supportedValues = $.supportedValues;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterableProperty defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterableProperty $;

        public Builder() {
            $ = new FilterableProperty();
        }

        public Builder(FilterableProperty defaults) {
            $ = new FilterableProperty(Objects.requireNonNull(defaults));
        }

        public Builder supportedValues(List<String> supportedValues) {
            $.supportedValues = supportedValues;
            return this;
        }

        public Builder supportedValues(String... supportedValues) {
            return supportedValues(List.of(supportedValues));
        }

        public Builder type(Either<String,SupportedFilterTypes> type) {
            $.type = type;
            return this;
        }

        public FilterableProperty build() {
            $.supportedValues = Objects.requireNonNull($.supportedValues, "expected parameter 'supportedValues' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
