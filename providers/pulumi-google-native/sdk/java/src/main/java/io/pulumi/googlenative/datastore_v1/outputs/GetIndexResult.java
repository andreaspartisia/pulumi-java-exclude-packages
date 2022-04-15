// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastore_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datastore_v1.outputs.GoogleDatastoreAdminV1IndexedPropertyResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIndexResult {
    /**
     * The index's ancestor mode. Must not be ANCESTOR_MODE_UNSPECIFIED.
     * 
     */
    private final String ancestor;
    /**
     * The resource ID of the index.
     * 
     */
    private final String indexId;
    /**
     * The entity kind to which this index applies.
     * 
     */
    private final String kind;
    /**
     * Project ID.
     * 
     */
    private final String project;
    /**
     * An ordered sequence of property names and their index attributes.
     * 
     */
    private final List<GoogleDatastoreAdminV1IndexedPropertyResponse> properties;
    /**
     * The state of the index.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetIndexResult(
        @CustomType.Parameter("ancestor") String ancestor,
        @CustomType.Parameter("indexId") String indexId,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("properties") List<GoogleDatastoreAdminV1IndexedPropertyResponse> properties,
        @CustomType.Parameter("state") String state) {
        this.ancestor = ancestor;
        this.indexId = indexId;
        this.kind = kind;
        this.project = project;
        this.properties = properties;
        this.state = state;
    }

    /**
     * The index's ancestor mode. Must not be ANCESTOR_MODE_UNSPECIFIED.
     * 
    */
    public String ancestor() {
        return this.ancestor;
    }
    /**
     * The resource ID of the index.
     * 
    */
    public String indexId() {
        return this.indexId;
    }
    /**
     * The entity kind to which this index applies.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Project ID.
     * 
    */
    public String project() {
        return this.project;
    }
    /**
     * An ordered sequence of property names and their index attributes.
     * 
    */
    public List<GoogleDatastoreAdminV1IndexedPropertyResponse> properties() {
        return this.properties;
    }
    /**
     * The state of the index.
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
        private String ancestor;
        private String indexId;
        private String kind;
        private String project;
        private List<GoogleDatastoreAdminV1IndexedPropertyResponse> properties;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIndexResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ancestor = defaults.ancestor;
    	      this.indexId = defaults.indexId;
    	      this.kind = defaults.kind;
    	      this.project = defaults.project;
    	      this.properties = defaults.properties;
    	      this.state = defaults.state;
        }

        public Builder ancestor(String ancestor) {
            this.ancestor = Objects.requireNonNull(ancestor);
            return this;
        }
        public Builder indexId(String indexId) {
            this.indexId = Objects.requireNonNull(indexId);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder properties(List<GoogleDatastoreAdminV1IndexedPropertyResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(GoogleDatastoreAdminV1IndexedPropertyResponse... properties) {
            return properties(List.of(properties));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetIndexResult build() {
            return new GetIndexResult(ancestor, indexId, kind, project, properties, state);
        }
    }
}
