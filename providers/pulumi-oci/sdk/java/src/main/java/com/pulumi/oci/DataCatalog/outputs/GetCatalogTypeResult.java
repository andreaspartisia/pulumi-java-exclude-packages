// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCatalogTypeResult {
    /**
     * @return The data catalog&#39;s OCID.
     * 
     */
    private final String catalogId;
    /**
     * @return Detailed description of the type.
     * 
     */
    private final String description;
    /**
     * @return Mapping type equivalence in the external system.
     * 
     */
    private final String externalTypeName;
    private final @Nullable List<String> fields;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Indicates whether the type is approved for use as a classifying object.
     * 
     */
    private final Boolean isApproved;
    /**
     * @return Indicates whether the type is internal, making it unavailable for use by metadata elements.
     * 
     */
    private final Boolean isInternal;
    /**
     * @return Indicates whether the type can be used for tagging metadata elements.
     * 
     */
    private final Boolean isTag;
    /**
     * @return Unique type key that is immutable.
     * 
     */
    private final String key;
    /**
     * @return The immutable name of the type.
     * 
     */
    private final String name;
    /**
     * @return A map of arrays which defines the type specific properties, both required and optional. The map keys are category names and the values are arrays contiaing all property details. Every property is contained inside of a category. Most types have required properties within the &#34;default&#34; category. Example: `{ &#34;properties&#34;: { &#34;default&#34;: { &#34;attributes:&#34;: [ { &#34;name&#34;: &#34;host&#34;, &#34;type&#34;: &#34;string&#34;, &#34;isRequired&#34;: true, &#34;isUpdatable&#34;: false }, ... ] } } }`
     * 
     */
    private final Map<String,Object> properties;
    /**
     * @return The current state of the type.
     * 
     */
    private final String state;
    /**
     * @return Indicates the category this type belongs to. For instance, data assets, connections.
     * 
     */
    private final String typeCategory;
    private final String typeKey;
    /**
     * @return URI to the type instance in the API.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private GetCatalogTypeResult(
        @CustomType.Parameter("catalogId") String catalogId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("externalTypeName") String externalTypeName,
        @CustomType.Parameter("fields") @Nullable List<String> fields,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isApproved") Boolean isApproved,
        @CustomType.Parameter("isInternal") Boolean isInternal,
        @CustomType.Parameter("isTag") Boolean isTag,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") Map<String,Object> properties,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("typeCategory") String typeCategory,
        @CustomType.Parameter("typeKey") String typeKey,
        @CustomType.Parameter("uri") String uri) {
        this.catalogId = catalogId;
        this.description = description;
        this.externalTypeName = externalTypeName;
        this.fields = fields;
        this.id = id;
        this.isApproved = isApproved;
        this.isInternal = isInternal;
        this.isTag = isTag;
        this.key = key;
        this.name = name;
        this.properties = properties;
        this.state = state;
        this.typeCategory = typeCategory;
        this.typeKey = typeKey;
        this.uri = uri;
    }

    /**
     * @return The data catalog&#39;s OCID.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }
    /**
     * @return Detailed description of the type.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Mapping type equivalence in the external system.
     * 
     */
    public String externalTypeName() {
        return this.externalTypeName;
    }
    public List<String> fields() {
        return this.fields == null ? List.of() : this.fields;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether the type is approved for use as a classifying object.
     * 
     */
    public Boolean isApproved() {
        return this.isApproved;
    }
    /**
     * @return Indicates whether the type is internal, making it unavailable for use by metadata elements.
     * 
     */
    public Boolean isInternal() {
        return this.isInternal;
    }
    /**
     * @return Indicates whether the type can be used for tagging metadata elements.
     * 
     */
    public Boolean isTag() {
        return this.isTag;
    }
    /**
     * @return Unique type key that is immutable.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The immutable name of the type.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A map of arrays which defines the type specific properties, both required and optional. The map keys are category names and the values are arrays contiaing all property details. Every property is contained inside of a category. Most types have required properties within the &#34;default&#34; category. Example: `{ &#34;properties&#34;: { &#34;default&#34;: { &#34;attributes:&#34;: [ { &#34;name&#34;: &#34;host&#34;, &#34;type&#34;: &#34;string&#34;, &#34;isRequired&#34;: true, &#34;isUpdatable&#34;: false }, ... ] } } }`
     * 
     */
    public Map<String,Object> properties() {
        return this.properties;
    }
    /**
     * @return The current state of the type.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Indicates the category this type belongs to. For instance, data assets, connections.
     * 
     */
    public String typeCategory() {
        return this.typeCategory;
    }
    public String typeKey() {
        return this.typeKey;
    }
    /**
     * @return URI to the type instance in the API.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCatalogTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private String description;
        private String externalTypeName;
        private @Nullable List<String> fields;
        private String id;
        private Boolean isApproved;
        private Boolean isInternal;
        private Boolean isTag;
        private String key;
        private String name;
        private Map<String,Object> properties;
        private String state;
        private String typeCategory;
        private String typeKey;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCatalogTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.description = defaults.description;
    	      this.externalTypeName = defaults.externalTypeName;
    	      this.fields = defaults.fields;
    	      this.id = defaults.id;
    	      this.isApproved = defaults.isApproved;
    	      this.isInternal = defaults.isInternal;
    	      this.isTag = defaults.isTag;
    	      this.key = defaults.key;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.state = defaults.state;
    	      this.typeCategory = defaults.typeCategory;
    	      this.typeKey = defaults.typeKey;
    	      this.uri = defaults.uri;
        }

        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder externalTypeName(String externalTypeName) {
            this.externalTypeName = Objects.requireNonNull(externalTypeName);
            return this;
        }
        public Builder fields(@Nullable List<String> fields) {
            this.fields = fields;
            return this;
        }
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isApproved(Boolean isApproved) {
            this.isApproved = Objects.requireNonNull(isApproved);
            return this;
        }
        public Builder isInternal(Boolean isInternal) {
            this.isInternal = Objects.requireNonNull(isInternal);
            return this;
        }
        public Builder isTag(Boolean isTag) {
            this.isTag = Objects.requireNonNull(isTag);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(Map<String,Object> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder typeCategory(String typeCategory) {
            this.typeCategory = Objects.requireNonNull(typeCategory);
            return this;
        }
        public Builder typeKey(String typeKey) {
            this.typeKey = Objects.requireNonNull(typeKey);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public GetCatalogTypeResult build() {
            return new GetCatalogTypeResult(catalogId, description, externalTypeName, fields, id, isApproved, isInternal, isTag, key, name, properties, state, typeCategory, typeKey, uri);
        }
    }
}
