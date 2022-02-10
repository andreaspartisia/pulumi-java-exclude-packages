// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CustomAccountResponse {
    private final String loginUrl;
    private final String password;
    private final String username;

    @OutputCustomType.Constructor({"loginUrl","password","username"})
    private CustomAccountResponse(
        String loginUrl,
        String password,
        String username) {
        this.loginUrl = Objects.requireNonNull(loginUrl);
        this.password = Objects.requireNonNull(password);
        this.username = Objects.requireNonNull(username);
    }

    public String getLoginUrl() {
        return this.loginUrl;
    }
    public String getPassword() {
        return this.password;
    }
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String loginUrl;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomAccountResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginUrl = defaults.loginUrl;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setLoginUrl(String loginUrl) {
            this.loginUrl = Objects.requireNonNull(loginUrl);
            return this;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }

        public CustomAccountResponse build() {
            return new CustomAccountResponse(loginUrl, password, username);
        }
    }
}