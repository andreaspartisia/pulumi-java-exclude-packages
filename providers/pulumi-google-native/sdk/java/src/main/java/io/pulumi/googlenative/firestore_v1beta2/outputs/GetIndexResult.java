// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.firestore_v1beta2.outputs.GoogleFirestoreAdminV1beta2IndexFieldResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIndexResult {
    /**
     * The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
     * 
     */
    private final List<GoogleFirestoreAdminV1beta2IndexFieldResponse> fields;
    /**
     * A server defined name for this index. The form of this name for composite indexes will be: `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{composite_index_id}` For single field indexes, this field will be empty.
     * 
     */
    private final String name;
    /**
     * Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
     * 
     */
    private final String queryScope;
    /**
     * The serving state of the index.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetIndexResult(
        @CustomType.Parameter("fields") List<GoogleFirestoreAdminV1beta2IndexFieldResponse> fields,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("queryScope") String queryScope,
        @CustomType.Parameter("state") String state) {
        this.fields = fields;
        this.name = name;
        this.queryScope = queryScope;
        this.state = state;
    }

    /**
     * The fields supported by this index. For composite indexes, this is always 2 or more fields. The last field entry is always for the field path `__name__`. If, on creation, `__name__` was not specified as the last field, it will be added automatically with the same direction as that of the last field defined. If the final field in a composite index is not directional, the `__name__` will be ordered ASCENDING (unless explicitly specified). For single field indexes, this will always be exactly one entry with a field path equal to the field path of the associated field.
     * 
    */
    public List<GoogleFirestoreAdminV1beta2IndexFieldResponse> fields() {
        return this.fields;
    }
    /**
     * A server defined name for this index. The form of this name for composite indexes will be: `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{composite_index_id}` For single field indexes, this field will be empty.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Indexes with a collection query scope specified allow queries against a collection that is the child of a specific document, specified at query time, and that has the same collection id. Indexes with a collection group query scope specified allow queries against all collections descended from a specific document, specified at query time, and that have the same collection id as this index.
     * 
    */
    public String queryScope() {
        return this.queryScope;
    }
    /**
     * The serving state of the index.
     * 
    */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIndexResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleFirestoreAdminV1beta2IndexFieldResponse> fields;
        private String name;
        private String queryScope;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndexResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.queryScope = defaults.queryScope;
    	      this.state = defaults.state;
        }

        public Builder fields(List<GoogleFirestoreAdminV1beta2IndexFieldResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder fields(GoogleFirestoreAdminV1beta2IndexFieldResponse... fields) {
            return fields(List.of(fields));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder queryScope(String queryScope) {
            this.queryScope = Objects.requireNonNull(queryScope);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetIndexResult build() {
            return new GetIndexResult(fields, name, queryScope, state);
        }
    }
}
