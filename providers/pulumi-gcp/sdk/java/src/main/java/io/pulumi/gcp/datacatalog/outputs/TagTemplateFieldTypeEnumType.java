// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.datacatalog.outputs.TagTemplateFieldTypeEnumTypeAllowedValue;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TagTemplateFieldTypeEnumType {
    /**
     * The set of allowed values for this enum. The display names of the
     * values must be case-insensitively unique within this set. Currently,
     * enum values can only be added to the list of allowed values. Deletion
     * and renaming of enum values are not supported.
     * Can have up to 500 allowed values.
     * Structure is documented below.
     * 
     */
    private final List<TagTemplateFieldTypeEnumTypeAllowedValue> allowedValues;

    @OutputCustomType.Constructor
    private TagTemplateFieldTypeEnumType(@OutputCustomType.Parameter("allowedValues") List<TagTemplateFieldTypeEnumTypeAllowedValue> allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * The set of allowed values for this enum. The display names of the
     * values must be case-insensitively unique within this set. Currently,
     * enum values can only be added to the list of allowed values. Deletion
     * and renaming of enum values are not supported.
     * Can have up to 500 allowed values.
     * Structure is documented below.
     * 
    */
    public List<TagTemplateFieldTypeEnumTypeAllowedValue> getAllowedValues() {
        return this.allowedValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagTemplateFieldTypeEnumType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<TagTemplateFieldTypeEnumTypeAllowedValue> allowedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(TagTemplateFieldTypeEnumType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
        }

        public Builder setAllowedValues(List<TagTemplateFieldTypeEnumTypeAllowedValue> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }
        public TagTemplateFieldTypeEnumType build() {
            return new TagTemplateFieldTypeEnumType(allowedValues);
        }
    }
}
