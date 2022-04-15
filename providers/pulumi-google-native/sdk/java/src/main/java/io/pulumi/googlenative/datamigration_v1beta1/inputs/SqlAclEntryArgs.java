// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An entry for an Access Control list.
 * 
 */
public final class SqlAclEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlAclEntryArgs Empty = new SqlAclEntryArgs();

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Import(name="expireTime")
      private final @Nullable Output<String> expireTime;

    public Output<String> expireTime() {
        return this.expireTime == null ? Codegen.empty() : this.expireTime;
    }

    /**
     * A label to identify this entry.
     * 
     */
    @Import(name="label")
      private final @Nullable Output<String> label;

    public Output<String> label() {
        return this.label == null ? Codegen.empty() : this.label;
    }

    /**
     * Input only. The time-to-leave of this access control entry.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<String> ttl;

    public Output<String> ttl() {
        return this.ttl == null ? Codegen.empty() : this.ttl;
    }

    /**
     * The allowlisted value for the access control list.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public SqlAclEntryArgs(
        @Nullable Output<String> expireTime,
        @Nullable Output<String> label,
        @Nullable Output<String> ttl,
        @Nullable Output<String> value) {
        this.expireTime = expireTime;
        this.label = label;
        this.ttl = ttl;
        this.value = value;
    }

    private SqlAclEntryArgs() {
        this.expireTime = Codegen.empty();
        this.label = Codegen.empty();
        this.ttl = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlAclEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> expireTime;
        private @Nullable Output<String> label;
        private @Nullable Output<String> ttl;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlAclEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireTime = defaults.expireTime;
    	      this.label = defaults.label;
    	      this.ttl = defaults.ttl;
    	      this.value = defaults.value;
        }

        public Builder expireTime(@Nullable Output<String> expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Builder expireTime(@Nullable String expireTime) {
            this.expireTime = Codegen.ofNullable(expireTime);
            return this;
        }
        public Builder label(@Nullable Output<String> label) {
            this.label = label;
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = Codegen.ofNullable(label);
            return this;
        }
        public Builder ttl(@Nullable Output<String> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable String ttl) {
            this.ttl = Codegen.ofNullable(ttl);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public SqlAclEntryArgs build() {
            return new SqlAclEntryArgs(expireTime, label, ttl, value);
        }
    }
}
