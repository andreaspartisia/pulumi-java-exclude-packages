// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InsightFiltersResourceDetailsOther {
    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    private final String comparison;
    /**
     * The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
     * 
     */
    private final String key;
    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private InsightFiltersResourceDetailsOther(
        @OutputCustomType.Parameter("comparison") String comparison,
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("value") String value) {
        this.comparison = comparison;
        this.key = key;
        this.value = value;
    }

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
    */
    public String getComparison() {
        return this.comparison;
    }
    /**
     * The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * A date range value for the date filter, provided as an Integer.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersResourceDetailsOther defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparison;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersResourceDetailsOther defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setComparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public InsightFiltersResourceDetailsOther build() {
            return new InsightFiltersResourceDetailsOther(comparison, key, value);
        }
    }
}