// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataSafe.outputs.GetSensitiveTypesFilter;
import com.pulumi.oci.DataSafe.outputs.GetSensitiveTypesSensitiveTypeCollection;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSensitiveTypesResult {
    private final @Nullable String accessLevel;
    /**
     * @return The OCID of the compartment that contains the sensitive type.
     * 
     */
    private final String compartmentId;
    private final @Nullable Boolean compartmentIdInSubtree;
    /**
     * @return The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
     * 
     */
    private final @Nullable String defaultMaskingFormatId;
    /**
     * @return The display name of the sensitive type.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return The entity type. It can be either a sensitive type with regular expressions or a sensitive category used for grouping similar sensitive types.
     * 
     */
    private final @Nullable String entityType;
    private final @Nullable List<GetSensitiveTypesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The OCID of the parent sensitive category.
     * 
     */
    private final @Nullable String parentCategoryId;
    /**
     * @return The list of sensitive_type_collection.
     * 
     */
    private final List<GetSensitiveTypesSensitiveTypeCollection> sensitiveTypeCollections;
    private final @Nullable String sensitiveTypeId;
    private final @Nullable String sensitiveTypeSource;
    /**
     * @return The current state of the sensitive type.
     * 
     */
    private final @Nullable String state;
    private final @Nullable String timeCreatedGreaterThanOrEqualTo;
    private final @Nullable String timeCreatedLessThan;

    @CustomType.Constructor
    private GetSensitiveTypesResult(
        @CustomType.Parameter("accessLevel") @Nullable String accessLevel,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("compartmentIdInSubtree") @Nullable Boolean compartmentIdInSubtree,
        @CustomType.Parameter("defaultMaskingFormatId") @Nullable String defaultMaskingFormatId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("entityType") @Nullable String entityType,
        @CustomType.Parameter("filters") @Nullable List<GetSensitiveTypesFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("parentCategoryId") @Nullable String parentCategoryId,
        @CustomType.Parameter("sensitiveTypeCollections") List<GetSensitiveTypesSensitiveTypeCollection> sensitiveTypeCollections,
        @CustomType.Parameter("sensitiveTypeId") @Nullable String sensitiveTypeId,
        @CustomType.Parameter("sensitiveTypeSource") @Nullable String sensitiveTypeSource,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("timeCreatedGreaterThanOrEqualTo") @Nullable String timeCreatedGreaterThanOrEqualTo,
        @CustomType.Parameter("timeCreatedLessThan") @Nullable String timeCreatedLessThan) {
        this.accessLevel = accessLevel;
        this.compartmentId = compartmentId;
        this.compartmentIdInSubtree = compartmentIdInSubtree;
        this.defaultMaskingFormatId = defaultMaskingFormatId;
        this.displayName = displayName;
        this.entityType = entityType;
        this.filters = filters;
        this.id = id;
        this.parentCategoryId = parentCategoryId;
        this.sensitiveTypeCollections = sensitiveTypeCollections;
        this.sensitiveTypeId = sensitiveTypeId;
        this.sensitiveTypeSource = sensitiveTypeSource;
        this.state = state;
        this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
        this.timeCreatedLessThan = timeCreatedLessThan;
    }

    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }
    /**
     * @return The OCID of the compartment that contains the sensitive type.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public Optional<Boolean> compartmentIdInSubtree() {
        return Optional.ofNullable(this.compartmentIdInSubtree);
    }
    /**
     * @return The OCID of the library masking format that should be used to mask the sensitive columns associated with the sensitive type.
     * 
     */
    public Optional<String> defaultMaskingFormatId() {
        return Optional.ofNullable(this.defaultMaskingFormatId);
    }
    /**
     * @return The display name of the sensitive type.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The entity type. It can be either a sensitive type with regular expressions or a sensitive category used for grouping similar sensitive types.
     * 
     */
    public Optional<String> entityType() {
        return Optional.ofNullable(this.entityType);
    }
    public List<GetSensitiveTypesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The OCID of the parent sensitive category.
     * 
     */
    public Optional<String> parentCategoryId() {
        return Optional.ofNullable(this.parentCategoryId);
    }
    /**
     * @return The list of sensitive_type_collection.
     * 
     */
    public List<GetSensitiveTypesSensitiveTypeCollection> sensitiveTypeCollections() {
        return this.sensitiveTypeCollections;
    }
    public Optional<String> sensitiveTypeId() {
        return Optional.ofNullable(this.sensitiveTypeId);
    }
    public Optional<String> sensitiveTypeSource() {
        return Optional.ofNullable(this.sensitiveTypeSource);
    }
    /**
     * @return The current state of the sensitive type.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    public Optional<String> timeCreatedGreaterThanOrEqualTo() {
        return Optional.ofNullable(this.timeCreatedGreaterThanOrEqualTo);
    }
    public Optional<String> timeCreatedLessThan() {
        return Optional.ofNullable(this.timeCreatedLessThan);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSensitiveTypesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessLevel;
        private String compartmentId;
        private @Nullable Boolean compartmentIdInSubtree;
        private @Nullable String defaultMaskingFormatId;
        private @Nullable String displayName;
        private @Nullable String entityType;
        private @Nullable List<GetSensitiveTypesFilter> filters;
        private String id;
        private @Nullable String parentCategoryId;
        private List<GetSensitiveTypesSensitiveTypeCollection> sensitiveTypeCollections;
        private @Nullable String sensitiveTypeId;
        private @Nullable String sensitiveTypeSource;
        private @Nullable String state;
        private @Nullable String timeCreatedGreaterThanOrEqualTo;
        private @Nullable String timeCreatedLessThan;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSensitiveTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.compartmentId = defaults.compartmentId;
    	      this.compartmentIdInSubtree = defaults.compartmentIdInSubtree;
    	      this.defaultMaskingFormatId = defaults.defaultMaskingFormatId;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.parentCategoryId = defaults.parentCategoryId;
    	      this.sensitiveTypeCollections = defaults.sensitiveTypeCollections;
    	      this.sensitiveTypeId = defaults.sensitiveTypeId;
    	      this.sensitiveTypeSource = defaults.sensitiveTypeSource;
    	      this.state = defaults.state;
    	      this.timeCreatedGreaterThanOrEqualTo = defaults.timeCreatedGreaterThanOrEqualTo;
    	      this.timeCreatedLessThan = defaults.timeCreatedLessThan;
        }

        public Builder accessLevel(@Nullable String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder compartmentIdInSubtree(@Nullable Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }
        public Builder defaultMaskingFormatId(@Nullable String defaultMaskingFormatId) {
            this.defaultMaskingFormatId = defaultMaskingFormatId;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder entityType(@Nullable String entityType) {
            this.entityType = entityType;
            return this;
        }
        public Builder filters(@Nullable List<GetSensitiveTypesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSensitiveTypesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder parentCategoryId(@Nullable String parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Builder sensitiveTypeCollections(List<GetSensitiveTypesSensitiveTypeCollection> sensitiveTypeCollections) {
            this.sensitiveTypeCollections = Objects.requireNonNull(sensitiveTypeCollections);
            return this;
        }
        public Builder sensitiveTypeCollections(GetSensitiveTypesSensitiveTypeCollection... sensitiveTypeCollections) {
            return sensitiveTypeCollections(List.of(sensitiveTypeCollections));
        }
        public Builder sensitiveTypeId(@Nullable String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            return this;
        }
        public Builder sensitiveTypeSource(@Nullable String sensitiveTypeSource) {
            this.sensitiveTypeSource = sensitiveTypeSource;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder timeCreatedGreaterThanOrEqualTo(@Nullable String timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }
        public Builder timeCreatedLessThan(@Nullable String timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }        public GetSensitiveTypesResult build() {
            return new GetSensitiveTypesResult(accessLevel, compartmentId, compartmentIdInSubtree, defaultMaskingFormatId, displayName, entityType, filters, id, parentCategoryId, sensitiveTypeCollections, sensitiveTypeId, sensitiveTypeSource, state, timeCreatedGreaterThanOrEqualTo, timeCreatedLessThan);
        }
    }
}
