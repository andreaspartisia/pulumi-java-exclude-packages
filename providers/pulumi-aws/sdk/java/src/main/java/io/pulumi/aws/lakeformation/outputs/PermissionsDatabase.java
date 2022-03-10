// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PermissionsDatabase {
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final @Nullable String catalogId;
    /**
     * Name of the table resource.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor
    private PermissionsDatabase(
        @OutputCustomType.Parameter("catalogId") @Nullable String catalogId,
        @OutputCustomType.Parameter("name") String name) {
        this.catalogId = catalogId;
        this.name = name;
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
    */
    public Optional<String> getCatalogId() {
        return Optional.ofNullable(this.catalogId);
    }
    /**
     * Name of the table resource.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PermissionsDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalogId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PermissionsDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.name = defaults.name;
        }

        public Builder setCatalogId(@Nullable String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public PermissionsDatabase build() {
            return new PermissionsDatabase(catalogId, name);
        }
    }
}