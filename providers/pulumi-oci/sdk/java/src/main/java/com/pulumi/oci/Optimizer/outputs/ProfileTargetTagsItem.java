// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ProfileTargetTagsItem {
    /**
     * @return (Updatable) The name you use to refer to the tag, also known as the tag key.
     * 
     */
    private final String tagDefinitionName;
    /**
     * @return (Updatable) The name of the tag namespace.
     * 
     */
    private final String tagNamespaceName;
    /**
     * @return (Updatable) Specifies which tag value types in the `tagValues` field result in overrides of the recommendation criteria.
     * 
     */
    private final String tagValueType;
    /**
     * @return (Updatable) The list of tag values. The tag value is the value that the user applying the tag adds to the tag key.
     * 
     */
    private final @Nullable List<String> tagValues;

    @CustomType.Constructor
    private ProfileTargetTagsItem(
        @CustomType.Parameter("tagDefinitionName") String tagDefinitionName,
        @CustomType.Parameter("tagNamespaceName") String tagNamespaceName,
        @CustomType.Parameter("tagValueType") String tagValueType,
        @CustomType.Parameter("tagValues") @Nullable List<String> tagValues) {
        this.tagDefinitionName = tagDefinitionName;
        this.tagNamespaceName = tagNamespaceName;
        this.tagValueType = tagValueType;
        this.tagValues = tagValues;
    }

    /**
     * @return (Updatable) The name you use to refer to the tag, also known as the tag key.
     * 
     */
    public String tagDefinitionName() {
        return this.tagDefinitionName;
    }
    /**
     * @return (Updatable) The name of the tag namespace.
     * 
     */
    public String tagNamespaceName() {
        return this.tagNamespaceName;
    }
    /**
     * @return (Updatable) Specifies which tag value types in the `tagValues` field result in overrides of the recommendation criteria.
     * 
     */
    public String tagValueType() {
        return this.tagValueType;
    }
    /**
     * @return (Updatable) The list of tag values. The tag value is the value that the user applying the tag adds to the tag key.
     * 
     */
    public List<String> tagValues() {
        return this.tagValues == null ? List.of() : this.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfileTargetTagsItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tagDefinitionName;
        private String tagNamespaceName;
        private String tagValueType;
        private @Nullable List<String> tagValues;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfileTargetTagsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagDefinitionName = defaults.tagDefinitionName;
    	      this.tagNamespaceName = defaults.tagNamespaceName;
    	      this.tagValueType = defaults.tagValueType;
    	      this.tagValues = defaults.tagValues;
        }

        public Builder tagDefinitionName(String tagDefinitionName) {
            this.tagDefinitionName = Objects.requireNonNull(tagDefinitionName);
            return this;
        }
        public Builder tagNamespaceName(String tagNamespaceName) {
            this.tagNamespaceName = Objects.requireNonNull(tagNamespaceName);
            return this;
        }
        public Builder tagValueType(String tagValueType) {
            this.tagValueType = Objects.requireNonNull(tagValueType);
            return this;
        }
        public Builder tagValues(@Nullable List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public Builder tagValues(String... tagValues) {
            return tagValues(List.of(tagValues));
        }        public ProfileTargetTagsItem build() {
            return new ProfileTargetTagsItem(tagDefinitionName, tagNamespaceName, tagValueType, tagValues);
        }
    }
}
