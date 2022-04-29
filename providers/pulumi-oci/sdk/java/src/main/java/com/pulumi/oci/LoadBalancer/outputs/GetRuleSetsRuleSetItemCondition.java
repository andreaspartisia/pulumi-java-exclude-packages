// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LoadBalancer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRuleSetsRuleSetItemCondition {
    /**
     * @return (Required) (Updatable) The attribute_name can be one of these values: `PATH`, `SOURCE_IP_ADDRESS`, `SOURCE_VCN_ID`, `SOURCE_VCN_IP_ADDRESS`
     * 
     */
    private final String attributeName;
    /**
     * @return (Required) (Updatable) Depends on `attribute_name`:
     * - when `attribute_name` = `SOURCE_IP_ADDRESS` | IPv4 or IPv6 address range to which the source IP address of incoming packet would be matched against
     * - when `attribute_name` = `SOURCE_VCN_IP_ADDRESS` | IPv4 address range to which the original client IP address (in customer VCN) of incoming packet would be matched against
     * - when `attribute_name` = `SOURCE_VCN_ID` | OCID of the customer VCN to which the service gateway embedded VCN ID of incoming packet would be matched against
     * 
     */
    private final String attributeValue;
    /**
     * @return A string that specifies how to compare the PathMatchCondition object&#39;s `attributeValue` string to the incoming URI.
     * *  **EXACT_MATCH** - The incoming URI path must exactly and completely match the `attributeValue` string.
     * *  **FORCE_LONGEST_PREFIX_MATCH** - The system looks for the `attributeValue` string with the best, longest match of the beginning portion of the incoming URI path.
     * *  **PREFIX_MATCH** - The beginning portion of the incoming URI path must exactly match the `attributeValue` string.
     * *  **SUFFIX_MATCH** - The ending portion of the incoming URI path must exactly match the `attributeValue` string.
     * 
     */
    private final String operator;

    @CustomType.Constructor
    private GetRuleSetsRuleSetItemCondition(
        @CustomType.Parameter("attributeName") String attributeName,
        @CustomType.Parameter("attributeValue") String attributeValue,
        @CustomType.Parameter("operator") String operator) {
        this.attributeName = attributeName;
        this.attributeValue = attributeValue;
        this.operator = operator;
    }

    /**
     * @return (Required) (Updatable) The attribute_name can be one of these values: `PATH`, `SOURCE_IP_ADDRESS`, `SOURCE_VCN_ID`, `SOURCE_VCN_IP_ADDRESS`
     * 
     */
    public String attributeName() {
        return this.attributeName;
    }
    /**
     * @return (Required) (Updatable) Depends on `attribute_name`:
     * - when `attribute_name` = `SOURCE_IP_ADDRESS` | IPv4 or IPv6 address range to which the source IP address of incoming packet would be matched against
     * - when `attribute_name` = `SOURCE_VCN_IP_ADDRESS` | IPv4 address range to which the original client IP address (in customer VCN) of incoming packet would be matched against
     * - when `attribute_name` = `SOURCE_VCN_ID` | OCID of the customer VCN to which the service gateway embedded VCN ID of incoming packet would be matched against
     * 
     */
    public String attributeValue() {
        return this.attributeValue;
    }
    /**
     * @return A string that specifies how to compare the PathMatchCondition object&#39;s `attributeValue` string to the incoming URI.
     * *  **EXACT_MATCH** - The incoming URI path must exactly and completely match the `attributeValue` string.
     * *  **FORCE_LONGEST_PREFIX_MATCH** - The system looks for the `attributeValue` string with the best, longest match of the beginning portion of the incoming URI path.
     * *  **PREFIX_MATCH** - The beginning portion of the incoming URI path must exactly match the `attributeValue` string.
     * *  **SUFFIX_MATCH** - The ending portion of the incoming URI path must exactly match the `attributeValue` string.
     * 
     */
    public String operator() {
        return this.operator;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleSetsRuleSetItemCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeName;
        private String attributeValue;
        private String operator;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleSetsRuleSetItemCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.attributeValue = defaults.attributeValue;
    	      this.operator = defaults.operator;
        }

        public Builder attributeName(String attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }
        public Builder attributeValue(String attributeValue) {
            this.attributeValue = Objects.requireNonNull(attributeValue);
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }        public GetRuleSetsRuleSetItemCondition build() {
            return new GetRuleSetsRuleSetItemCondition(attributeName, attributeValue, operator);
        }
    }
}
