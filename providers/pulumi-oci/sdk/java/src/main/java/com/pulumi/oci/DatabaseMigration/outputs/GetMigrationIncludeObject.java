// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMigrationIncludeObject {
    /**
     * @return Name of the object (regular expression is allowed)
     * 
     */
    private final String object;
    /**
     * @return Owner of the object (regular expression is allowed)
     * 
     */
    private final String owner;
    /**
     * @return Migration type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetMigrationIncludeObject(
        @CustomType.Parameter("object") String object,
        @CustomType.Parameter("owner") String owner,
        @CustomType.Parameter("type") String type) {
        this.object = object;
        this.owner = owner;
        this.type = type;
    }

    /**
     * @return Name of the object (regular expression is allowed)
     * 
     */
    public String object() {
        return this.object;
    }
    /**
     * @return Owner of the object (regular expression is allowed)
     * 
     */
    public String owner() {
        return this.owner;
    }
    /**
     * @return Migration type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrationIncludeObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String object;
        private String owner;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrationIncludeObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
    	      this.owner = defaults.owner;
    	      this.type = defaults.type;
        }

        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetMigrationIncludeObject build() {
            return new GetMigrationIncludeObject(object, owner, type);
        }
    }
}
