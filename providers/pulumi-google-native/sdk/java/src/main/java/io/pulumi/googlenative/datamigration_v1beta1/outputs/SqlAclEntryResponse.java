// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlAclEntryResponse {
    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String expireTime;
    /**
     * A label to identify this entry.
     * 
     */
    private final String label;
    /**
     * Input only. The time-to-leave of this access control entry.
     * 
     */
    private final String ttl;
    /**
     * The allowlisted value for the access control list.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private SqlAclEntryResponse(
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("label") String label,
        @CustomType.Parameter("ttl") String ttl,
        @CustomType.Parameter("value") String value) {
        this.expireTime = expireTime;
        this.label = label;
        this.ttl = ttl;
        this.value = value;
    }

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`.
     * 
    */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * A label to identify this entry.
     * 
    */
    public String label() {
        return this.label;
    }
    /**
     * Input only. The time-to-leave of this access control entry.
     * 
    */
    public String ttl() {
        return this.ttl;
    }
    /**
     * The allowlisted value for the access control list.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlAclEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expireTime;
        private String label;
        private String ttl;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlAclEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireTime = defaults.expireTime;
    	      this.label = defaults.label;
    	      this.ttl = defaults.ttl;
    	      this.value = defaults.value;
        }

        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder label(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }
        public Builder ttl(String ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public SqlAclEntryResponse build() {
            return new SqlAclEntryResponse(expireTime, label, ttl, value);
        }
    }
}
