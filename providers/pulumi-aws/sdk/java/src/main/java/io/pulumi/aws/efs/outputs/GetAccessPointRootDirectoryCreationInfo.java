// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.efs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetAccessPointRootDirectoryCreationInfo {
    /**
     * POSIX owner group ID
     * 
     */
    private final Integer ownerGid;
    /**
     * POSIX owner user ID
     * 
     */
    private final Integer ownerUid;
    /**
     * POSIX permissions mode
     * 
     */
    private final String permissions;

    @OutputCustomType.Constructor
    private GetAccessPointRootDirectoryCreationInfo(
        @OutputCustomType.Parameter("ownerGid") Integer ownerGid,
        @OutputCustomType.Parameter("ownerUid") Integer ownerUid,
        @OutputCustomType.Parameter("permissions") String permissions) {
        this.ownerGid = ownerGid;
        this.ownerUid = ownerUid;
        this.permissions = permissions;
    }

    /**
     * POSIX owner group ID
     * 
    */
    public Integer getOwnerGid() {
        return this.ownerGid;
    }
    /**
     * POSIX owner user ID
     * 
    */
    public Integer getOwnerUid() {
        return this.ownerUid;
    }
    /**
     * POSIX permissions mode
     * 
    */
    public String getPermissions() {
        return this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccessPointRootDirectoryCreationInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer ownerGid;
        private Integer ownerUid;
        private String permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPointRootDirectoryCreationInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ownerGid = defaults.ownerGid;
    	      this.ownerUid = defaults.ownerUid;
    	      this.permissions = defaults.permissions;
        }

        public Builder setOwnerGid(Integer ownerGid) {
            this.ownerGid = Objects.requireNonNull(ownerGid);
            return this;
        }

        public Builder setOwnerUid(Integer ownerUid) {
            this.ownerUid = Objects.requireNonNull(ownerUid);
            return this;
        }

        public Builder setPermissions(String permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public GetAccessPointRootDirectoryCreationInfo build() {
            return new GetAccessPointRootDirectoryCreationInfo(ownerGid, ownerUid, permissions);
        }
    }
}