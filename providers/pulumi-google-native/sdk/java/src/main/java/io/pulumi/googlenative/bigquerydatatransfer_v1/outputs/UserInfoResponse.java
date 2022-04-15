// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquerydatatransfer_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UserInfoResponse {
    /**
     * E-mail address of the user.
     * 
     */
    private final String email;

    @CustomType.Constructor
    private UserInfoResponse(@CustomType.Parameter("email") String email) {
        this.email = email;
    }

    /**
     * E-mail address of the user.
     * 
    */
    public String email() {
        return this.email;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String email;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
        }

        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }        public UserInfoResponse build() {
            return new UserInfoResponse(email);
        }
    }
}
