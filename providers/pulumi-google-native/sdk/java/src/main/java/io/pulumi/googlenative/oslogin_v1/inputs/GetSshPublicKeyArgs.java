// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.oslogin_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSshPublicKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSshPublicKeyArgs Empty = new GetSshPublicKeyArgs();

    @Import(name="sshPublicKeyId", required=true)
      private final String sshPublicKeyId;

    public String sshPublicKeyId() {
        return this.sshPublicKeyId;
    }

    @Import(name="userId", required=true)
      private final String userId;

    public String userId() {
        return this.userId;
    }

    public GetSshPublicKeyArgs(
        String sshPublicKeyId,
        String userId) {
        this.sshPublicKeyId = Objects.requireNonNull(sshPublicKeyId, "expected parameter 'sshPublicKeyId' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private GetSshPublicKeyArgs() {
        this.sshPublicKeyId = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String sshPublicKeyId;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSshPublicKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sshPublicKeyId = defaults.sshPublicKeyId;
    	      this.userId = defaults.userId;
        }

        public Builder sshPublicKeyId(String sshPublicKeyId) {
            this.sshPublicKeyId = Objects.requireNonNull(sshPublicKeyId);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GetSshPublicKeyArgs build() {
            return new GetSshPublicKeyArgs(sshPublicKeyId, userId);
        }
    }
}
