// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexibleAppVersionApiConfig {
    /**
     * Action to take when users access resources that require authentication.
     * Default value is `AUTH_FAIL_ACTION_REDIRECT`.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
     */
    private final @Nullable String authFailAction;
    /**
     * Level of login required to access this resource.
     * Default value is `LOGIN_OPTIONAL`.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
     */
    private final @Nullable String login;
    /**
     * Path to the script from the application root directory.
     * 
     */
    private final String script;
    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
     */
    private final @Nullable String securityLevel;
    /**
     * URL to serve the endpoint at.
     * 
     */
    private final @Nullable String url;

    @OutputCustomType.Constructor
    private FlexibleAppVersionApiConfig(
        @OutputCustomType.Parameter("authFailAction") @Nullable String authFailAction,
        @OutputCustomType.Parameter("login") @Nullable String login,
        @OutputCustomType.Parameter("script") String script,
        @OutputCustomType.Parameter("securityLevel") @Nullable String securityLevel,
        @OutputCustomType.Parameter("url") @Nullable String url) {
        this.authFailAction = authFailAction;
        this.login = login;
        this.script = script;
        this.securityLevel = securityLevel;
        this.url = url;
    }

    /**
     * Action to take when users access resources that require authentication.
     * Default value is `AUTH_FAIL_ACTION_REDIRECT`.
     * Possible values are `AUTH_FAIL_ACTION_REDIRECT` and `AUTH_FAIL_ACTION_UNAUTHORIZED`.
     * 
    */
    public Optional<String> getAuthFailAction() {
        return Optional.ofNullable(this.authFailAction);
    }
    /**
     * Level of login required to access this resource.
     * Default value is `LOGIN_OPTIONAL`.
     * Possible values are `LOGIN_OPTIONAL`, `LOGIN_ADMIN`, and `LOGIN_REQUIRED`.
     * 
    */
    public Optional<String> getLogin() {
        return Optional.ofNullable(this.login);
    }
    /**
     * Path to the script from the application root directory.
     * 
    */
    public String getScript() {
        return this.script;
    }
    /**
     * Security (HTTPS) enforcement for this URL.
     * Possible values are `SECURE_DEFAULT`, `SECURE_NEVER`, `SECURE_OPTIONAL`, and `SECURE_ALWAYS`.
     * 
    */
    public Optional<String> getSecurityLevel() {
        return Optional.ofNullable(this.securityLevel);
    }
    /**
     * URL to serve the endpoint at.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionApiConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authFailAction;
        private @Nullable String login;
        private String script;
        private @Nullable String securityLevel;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionApiConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.url = defaults.url;
        }

        public Builder setAuthFailAction(@Nullable String authFailAction) {
            this.authFailAction = authFailAction;
            return this;
        }

        public Builder setLogin(@Nullable String login) {
            this.login = login;
            return this;
        }

        public Builder setScript(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }

        public Builder setSecurityLevel(@Nullable String securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public FlexibleAppVersionApiConfig build() {
            return new FlexibleAppVersionApiConfig(authFailAction, login, script, securityLevel, url);
        }
    }
}
