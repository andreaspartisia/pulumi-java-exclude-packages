// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UptimeCheckConfigHttpCheckAuthInfo {
    /**
     * The password to authenticate.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private final String password;
    /**
     * The username to authenticate.
     * 
     */
    private final String username;

    @OutputCustomType.Constructor
    private UptimeCheckConfigHttpCheckAuthInfo(
        @OutputCustomType.Parameter("password") String password,
        @OutputCustomType.Parameter("username") String username) {
        this.password = password;
        this.username = username;
    }

    /**
     * The password to authenticate.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
    */
    public String getPassword() {
        return this.password;
    }
    /**
     * The username to authenticate.
     * 
    */
    public String getUsername() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigHttpCheckAuthInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(UptimeCheckConfigHttpCheckAuthInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder setPassword(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder setUsername(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public UptimeCheckConfigHttpCheckAuthInfo build() {
            return new UptimeCheckConfigHttpCheckAuthInfo(password, username);
        }
    }
}
