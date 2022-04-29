// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetManagedDatabaseUserProxiedForUsersProxiedForUserCollectionItem {
    /**
     * @return Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
     * 
     */
    private final String authentication;
    /**
     * @return The flags associated with the proxy/client pair.
     * 
     */
    private final String flags;
    /**
     * @return A filter to return only resources that match the entire name.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetManagedDatabaseUserProxiedForUsersProxiedForUserCollectionItem(
        @CustomType.Parameter("authentication") String authentication,
        @CustomType.Parameter("flags") String flags,
        @CustomType.Parameter("name") String name) {
        this.authentication = authentication;
        this.flags = flags;
        this.name = name;
    }

    /**
     * @return Indicates whether the proxy is required to supply the client credentials (YES) or not (NO).
     * 
     */
    public String authentication() {
        return this.authentication;
    }
    /**
     * @return The flags associated with the proxy/client pair.
     * 
     */
    public String flags() {
        return this.flags;
    }
    /**
     * @return A filter to return only resources that match the entire name.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedDatabaseUserProxiedForUsersProxiedForUserCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authentication;
        private String flags;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedDatabaseUserProxiedForUsersProxiedForUserCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.flags = defaults.flags;
    	      this.name = defaults.name;
        }

        public Builder authentication(String authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }
        public Builder flags(String flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetManagedDatabaseUserProxiedForUsersProxiedForUserCollectionItem build() {
            return new GetManagedDatabaseUserProxiedForUsersProxiedForUserCollectionItem(authentication, flags, name);
        }
    }
}
