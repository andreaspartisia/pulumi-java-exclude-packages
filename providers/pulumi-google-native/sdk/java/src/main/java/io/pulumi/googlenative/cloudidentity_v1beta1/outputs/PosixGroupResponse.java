// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PosixGroupResponse {
    /**
     * GID of the POSIX group.
     * 
     */
    private final String gid;
    /**
     * Name of the POSIX group.
     * 
     */
    private final String name;
    /**
     * System identifier for which group name and gid apply to. If not specified it will default to empty value.
     * 
     */
    private final String systemId;

    @CustomType.Constructor
    private PosixGroupResponse(
        @CustomType.Parameter("gid") String gid,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("systemId") String systemId) {
        this.gid = gid;
        this.name = name;
        this.systemId = systemId;
    }

    /**
     * GID of the POSIX group.
     * 
    */
    public String gid() {
        return this.gid;
    }
    /**
     * Name of the POSIX group.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * System identifier for which group name and gid apply to. If not specified it will default to empty value.
     * 
    */
    public String systemId() {
        return this.systemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PosixGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gid;
        private String name;
        private String systemId;

        public Builder() {
    	      // Empty
        }

        public Builder(PosixGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gid = defaults.gid;
    	      this.name = defaults.name;
    	      this.systemId = defaults.systemId;
        }

        public Builder gid(String gid) {
            this.gid = Objects.requireNonNull(gid);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder systemId(String systemId) {
            this.systemId = Objects.requireNonNull(systemId);
            return this;
        }        public PosixGroupResponse build() {
            return new PosixGroupResponse(gid, name, systemId);
        }
    }
}
