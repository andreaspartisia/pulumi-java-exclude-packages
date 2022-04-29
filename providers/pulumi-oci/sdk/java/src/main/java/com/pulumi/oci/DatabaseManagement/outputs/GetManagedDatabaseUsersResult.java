// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DatabaseManagement.outputs.GetManagedDatabaseUsersFilter;
import com.pulumi.oci.DatabaseManagement.outputs.GetManagedDatabaseUsersUserCollection;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManagedDatabaseUsersResult {
    private final @Nullable List<GetManagedDatabaseUsersFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String managedDatabaseId;
    /**
     * @return The name of the User.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The list of user_collection.
     * 
     */
    private final List<GetManagedDatabaseUsersUserCollection> userCollections;

    @CustomType.Constructor
    private GetManagedDatabaseUsersResult(
        @CustomType.Parameter("filters") @Nullable List<GetManagedDatabaseUsersFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("managedDatabaseId") String managedDatabaseId,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("userCollections") List<GetManagedDatabaseUsersUserCollection> userCollections) {
        this.filters = filters;
        this.id = id;
        this.managedDatabaseId = managedDatabaseId;
        this.name = name;
        this.userCollections = userCollections;
    }

    public List<GetManagedDatabaseUsersFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String managedDatabaseId() {
        return this.managedDatabaseId;
    }
    /**
     * @return The name of the User.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The list of user_collection.
     * 
     */
    public List<GetManagedDatabaseUsersUserCollection> userCollections() {
        return this.userCollections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseUsersResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetManagedDatabaseUsersFilter> filters;
        private String id;
        private String managedDatabaseId;
        private @Nullable String name;
        private List<GetManagedDatabaseUsersUserCollection> userCollections;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.managedDatabaseId = defaults.managedDatabaseId;
    	      this.name = defaults.name;
    	      this.userCollections = defaults.userCollections;
        }

        public Builder filters(@Nullable List<GetManagedDatabaseUsersFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetManagedDatabaseUsersFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = Objects.requireNonNull(managedDatabaseId);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder userCollections(List<GetManagedDatabaseUsersUserCollection> userCollections) {
            this.userCollections = Objects.requireNonNull(userCollections);
            return this;
        }
        public Builder userCollections(GetManagedDatabaseUsersUserCollection... userCollections) {
            return userCollections(List.of(userCollections));
        }        public GetManagedDatabaseUsersResult build() {
            return new GetManagedDatabaseUsersResult(filters, id, managedDatabaseId, name, userCollections);
        }
    }
}
