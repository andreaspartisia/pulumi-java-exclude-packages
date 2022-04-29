// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMaskingReportMaskedColumnsMaskedColumnCollectionItem {
    /**
     * @return A filter to return only a specific column based on column name.
     * 
     */
    private final String columnName;
    /**
     * @return The unique key that identifies the masked column. It&#39;s numeric and unique within a masking policy.
     * 
     */
    private final String key;
    /**
     * @return A filter to return only the resources that match the specified masking column group.
     * 
     */
    private final String maskingColumnGroup;
    /**
     * @return The masking format used for masking the column.
     * 
     */
    private final String maskingFormatUsed;
    /**
     * @return A filter to return only items related to a specific object name.
     * 
     */
    private final String object;
    /**
     * @return A filter to return only items related to a specific object type.
     * 
     */
    private final String objectType;
    /**
     * @return The unique key that identifies the parent column of the masked column.
     * 
     */
    private final String parentColumnKey;
    /**
     * @return A filter to return only items related to specific schema name.
     * 
     */
    private final String schemaName;
    /**
     * @return A filter to return only items related to a specific sensitive type OCID.
     * 
     */
    private final String sensitiveTypeId;
    /**
     * @return The total number of values masked in the column.
     * 
     */
    private final String totalMaskedValues;

    @CustomType.Constructor
    private GetMaskingReportMaskedColumnsMaskedColumnCollectionItem(
        @CustomType.Parameter("columnName") String columnName,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("maskingColumnGroup") String maskingColumnGroup,
        @CustomType.Parameter("maskingFormatUsed") String maskingFormatUsed,
        @CustomType.Parameter("object") String object,
        @CustomType.Parameter("objectType") String objectType,
        @CustomType.Parameter("parentColumnKey") String parentColumnKey,
        @CustomType.Parameter("schemaName") String schemaName,
        @CustomType.Parameter("sensitiveTypeId") String sensitiveTypeId,
        @CustomType.Parameter("totalMaskedValues") String totalMaskedValues) {
        this.columnName = columnName;
        this.key = key;
        this.maskingColumnGroup = maskingColumnGroup;
        this.maskingFormatUsed = maskingFormatUsed;
        this.object = object;
        this.objectType = objectType;
        this.parentColumnKey = parentColumnKey;
        this.schemaName = schemaName;
        this.sensitiveTypeId = sensitiveTypeId;
        this.totalMaskedValues = totalMaskedValues;
    }

    /**
     * @return A filter to return only a specific column based on column name.
     * 
     */
    public String columnName() {
        return this.columnName;
    }
    /**
     * @return The unique key that identifies the masked column. It&#39;s numeric and unique within a masking policy.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return A filter to return only the resources that match the specified masking column group.
     * 
     */
    public String maskingColumnGroup() {
        return this.maskingColumnGroup;
    }
    /**
     * @return The masking format used for masking the column.
     * 
     */
    public String maskingFormatUsed() {
        return this.maskingFormatUsed;
    }
    /**
     * @return A filter to return only items related to a specific object name.
     * 
     */
    public String object() {
        return this.object;
    }
    /**
     * @return A filter to return only items related to a specific object type.
     * 
     */
    public String objectType() {
        return this.objectType;
    }
    /**
     * @return The unique key that identifies the parent column of the masked column.
     * 
     */
    public String parentColumnKey() {
        return this.parentColumnKey;
    }
    /**
     * @return A filter to return only items related to specific schema name.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }
    /**
     * @return A filter to return only items related to a specific sensitive type OCID.
     * 
     */
    public String sensitiveTypeId() {
        return this.sensitiveTypeId;
    }
    /**
     * @return The total number of values masked in the column.
     * 
     */
    public String totalMaskedValues() {
        return this.totalMaskedValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaskingReportMaskedColumnsMaskedColumnCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String columnName;
        private String key;
        private String maskingColumnGroup;
        private String maskingFormatUsed;
        private String object;
        private String objectType;
        private String parentColumnKey;
        private String schemaName;
        private String sensitiveTypeId;
        private String totalMaskedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaskingReportMaskedColumnsMaskedColumnCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnName = defaults.columnName;
    	      this.key = defaults.key;
    	      this.maskingColumnGroup = defaults.maskingColumnGroup;
    	      this.maskingFormatUsed = defaults.maskingFormatUsed;
    	      this.object = defaults.object;
    	      this.objectType = defaults.objectType;
    	      this.parentColumnKey = defaults.parentColumnKey;
    	      this.schemaName = defaults.schemaName;
    	      this.sensitiveTypeId = defaults.sensitiveTypeId;
    	      this.totalMaskedValues = defaults.totalMaskedValues;
        }

        public Builder columnName(String columnName) {
            this.columnName = Objects.requireNonNull(columnName);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder maskingColumnGroup(String maskingColumnGroup) {
            this.maskingColumnGroup = Objects.requireNonNull(maskingColumnGroup);
            return this;
        }
        public Builder maskingFormatUsed(String maskingFormatUsed) {
            this.maskingFormatUsed = Objects.requireNonNull(maskingFormatUsed);
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder parentColumnKey(String parentColumnKey) {
            this.parentColumnKey = Objects.requireNonNull(parentColumnKey);
            return this;
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }
        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = Objects.requireNonNull(sensitiveTypeId);
            return this;
        }
        public Builder totalMaskedValues(String totalMaskedValues) {
            this.totalMaskedValues = Objects.requireNonNull(totalMaskedValues);
            return this;
        }        public GetMaskingReportMaskedColumnsMaskedColumnCollectionItem build() {
            return new GetMaskingReportMaskedColumnsMaskedColumnCollectionItem(columnName, key, maskingColumnGroup, maskingFormatUsed, object, objectType, parentColumnKey, schemaName, sensitiveTypeId, totalMaskedValues);
        }
    }
}
