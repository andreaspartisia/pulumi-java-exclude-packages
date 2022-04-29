// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DatabaseMigration.outputs.GetConnectionsConnectionCollection;
import com.pulumi.oci.DatabaseMigration.outputs.GetConnectionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetConnectionsResult {
    /**
     * @return OCID of the compartment where the secret containing the credentials will be created.
     * 
     */
    private final String compartmentId;
    /**
     * @return The list of connection_collection.
     * 
     */
    private final List<GetConnectionsConnectionCollection> connectionCollections;
    /**
     * @return Database Connection display name identifier.
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable List<GetConnectionsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The current state of the Connection resource.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetConnectionsResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("connectionCollections") List<GetConnectionsConnectionCollection> connectionCollections,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("filters") @Nullable List<GetConnectionsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("state") @Nullable String state) {
        this.compartmentId = compartmentId;
        this.connectionCollections = connectionCollections;
        this.displayName = displayName;
        this.filters = filters;
        this.id = id;
        this.state = state;
    }

    /**
     * @return OCID of the compartment where the secret containing the credentials will be created.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The list of connection_collection.
     * 
     */
    public List<GetConnectionsConnectionCollection> connectionCollections() {
        return this.connectionCollections;
    }
    /**
     * @return Database Connection display name identifier.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public List<GetConnectionsFilter> filters() {
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
     * @return The current state of the Connection resource.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private List<GetConnectionsConnectionCollection> connectionCollections;
        private @Nullable String displayName;
        private @Nullable List<GetConnectionsFilter> filters;
        private String id;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.connectionCollections = defaults.connectionCollections;
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder connectionCollections(List<GetConnectionsConnectionCollection> connectionCollections) {
            this.connectionCollections = Objects.requireNonNull(connectionCollections);
            return this;
        }
        public Builder connectionCollections(GetConnectionsConnectionCollection... connectionCollections) {
            return connectionCollections(List.of(connectionCollections));
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder filters(@Nullable List<GetConnectionsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetConnectionsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetConnectionsResult build() {
            return new GetConnectionsResult(compartmentId, connectionCollections, displayName, filters, id, state);
        }
    }
}
