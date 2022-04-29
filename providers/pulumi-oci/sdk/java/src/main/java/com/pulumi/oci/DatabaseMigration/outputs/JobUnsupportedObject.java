// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobUnsupportedObject {
    /**
     * @return Name of the object (regular expression is allowed)
     * 
     */
    private final @Nullable String object;
    /**
     * @return Owner of the object (regular expression is allowed)
     * 
     */
    private final @Nullable String owner;
    /**
     * @return Type of unsupported object
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private JobUnsupportedObject(
        @CustomType.Parameter("object") @Nullable String object,
        @CustomType.Parameter("owner") @Nullable String owner,
        @CustomType.Parameter("type") @Nullable String type) {
        this.object = object;
        this.owner = owner;
        this.type = type;
    }

    /**
     * @return Name of the object (regular expression is allowed)
     * 
     */
    public Optional<String> object() {
        return Optional.ofNullable(this.object);
    }
    /**
     * @return Owner of the object (regular expression is allowed)
     * 
     */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * @return Type of unsupported object
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobUnsupportedObject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String object;
        private @Nullable String owner;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JobUnsupportedObject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.object = defaults.object;
    	      this.owner = defaults.owner;
    	      this.type = defaults.type;
        }

        public Builder object(@Nullable String object) {
            this.object = object;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public JobUnsupportedObject build() {
            return new JobUnsupportedObject(object, owner, type);
        }
    }
}
