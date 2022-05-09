// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MongoCollectionSystemIndex {
    /**
     * @return Specifies the list of user settable keys for each Cosmos DB Mongo Collection.
     * 
     */
    private final @Nullable List<String> keys;
    /**
     * @return Is the index unique or not? Defaults to `false`.
     * 
     */
    private final @Nullable Boolean unique;

    @CustomType.Constructor
    private MongoCollectionSystemIndex(
        @CustomType.Parameter("keys") @Nullable List<String> keys,
        @CustomType.Parameter("unique") @Nullable Boolean unique) {
        this.keys = keys;
        this.unique = unique;
    }

    /**
     * @return Specifies the list of user settable keys for each Cosmos DB Mongo Collection.
     * 
     */
    public List<String> keys() {
        return this.keys == null ? List.of() : this.keys;
    }
    /**
     * @return Is the index unique or not? Defaults to `false`.
     * 
     */
    public Optional<Boolean> unique() {
        return Optional.ofNullable(this.unique);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoCollectionSystemIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> keys;
        private @Nullable Boolean unique;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoCollectionSystemIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
    	      this.unique = defaults.unique;
        }

        public Builder keys(@Nullable List<String> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        public Builder unique(@Nullable Boolean unique) {
            this.unique = unique;
            return this;
        }        public MongoCollectionSystemIndex build() {
            return new MongoCollectionSystemIndex(keys, unique);
        }
    }
}
