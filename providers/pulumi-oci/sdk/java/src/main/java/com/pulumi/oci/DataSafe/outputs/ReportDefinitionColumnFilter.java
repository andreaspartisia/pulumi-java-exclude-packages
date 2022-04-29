// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ReportDefinitionColumnFilter {
    /**
     * @return (Updatable) An array of expressions based on the operator type. A filter may have one or more expressions.
     * 
     */
    private final List<String> expressions;
    /**
     * @return (Updatable) Name of the column that must be sorted.
     * 
     */
    private final String fieldName;
    /**
     * @return (Updatable) Indicates if the filter is enabled. Values can either be &#39;true&#39; or &#39;false&#39;.
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return (Updatable) Indicates if the summary is hidden. Values can either be &#39;true&#39; or &#39;false&#39;.
     * 
     */
    private final Boolean isHidden;
    /**
     * @return (Updatable) Specifies the type of operator that must be applied for example in, eq etc.
     * 
     */
    private final String operator;

    @CustomType.Constructor
    private ReportDefinitionColumnFilter(
        @CustomType.Parameter("expressions") List<String> expressions,
        @CustomType.Parameter("fieldName") String fieldName,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("isHidden") Boolean isHidden,
        @CustomType.Parameter("operator") String operator) {
        this.expressions = expressions;
        this.fieldName = fieldName;
        this.isEnabled = isEnabled;
        this.isHidden = isHidden;
        this.operator = operator;
    }

    /**
     * @return (Updatable) An array of expressions based on the operator type. A filter may have one or more expressions.
     * 
     */
    public List<String> expressions() {
        return this.expressions;
    }
    /**
     * @return (Updatable) Name of the column that must be sorted.
     * 
     */
    public String fieldName() {
        return this.fieldName;
    }
    /**
     * @return (Updatable) Indicates if the filter is enabled. Values can either be &#39;true&#39; or &#39;false&#39;.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return (Updatable) Indicates if the summary is hidden. Values can either be &#39;true&#39; or &#39;false&#39;.
     * 
     */
    public Boolean isHidden() {
        return this.isHidden;
    }
    /**
     * @return (Updatable) Specifies the type of operator that must be applied for example in, eq etc.
     * 
     */
    public String operator() {
        return this.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDefinitionColumnFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> expressions;
        private String fieldName;
        private Boolean isEnabled;
        private Boolean isHidden;
        private String operator;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDefinitionColumnFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expressions = defaults.expressions;
    	      this.fieldName = defaults.fieldName;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isHidden = defaults.isHidden;
    	      this.operator = defaults.operator;
        }

        public Builder expressions(List<String> expressions) {
            this.expressions = Objects.requireNonNull(expressions);
            return this;
        }
        public Builder expressions(String... expressions) {
            return expressions(List.of(expressions));
        }
        public Builder fieldName(String fieldName) {
            this.fieldName = Objects.requireNonNull(fieldName);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = Objects.requireNonNull(isHidden);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }        public ReportDefinitionColumnFilter build() {
            return new ReportDefinitionColumnFilter(expressions, fieldName, isEnabled, isHidden, operator);
        }
    }
}
