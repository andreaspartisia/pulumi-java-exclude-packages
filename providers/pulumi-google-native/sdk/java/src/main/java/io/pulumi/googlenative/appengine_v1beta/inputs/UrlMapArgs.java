// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.appengine_v1beta.enums.UrlMapAuthFailAction;
import io.pulumi.googlenative.appengine_v1beta.enums.UrlMapLogin;
import io.pulumi.googlenative.appengine_v1beta.enums.UrlMapRedirectHttpResponseCode;
import io.pulumi.googlenative.appengine_v1beta.enums.UrlMapSecurityLevel;
import io.pulumi.googlenative.appengine_v1beta.inputs.ApiEndpointHandlerArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.ScriptHandlerArgs;
import io.pulumi.googlenative.appengine_v1beta.inputs.StaticFilesHandlerArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * URL pattern and description of how the URL should be handled. App Engine can handle URLs by executing application code or by serving static files uploaded with the version, such as images, CSS, or JavaScript.
 * 
 */
public final class UrlMapArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlMapArgs Empty = new UrlMapArgs();

    /**
     * Uses API Endpoints to handle requests.
     * 
     */
    @Import(name="apiEndpoint")
      private final @Nullable Output<ApiEndpointHandlerArgs> apiEndpoint;

    public Output<ApiEndpointHandlerArgs> apiEndpoint() {
        return this.apiEndpoint == null ? Codegen.empty() : this.apiEndpoint;
    }

    /**
     * Action to take when users access resources that require authentication. Defaults to redirect.
     * 
     */
    @Import(name="authFailAction")
      private final @Nullable Output<UrlMapAuthFailAction> authFailAction;

    public Output<UrlMapAuthFailAction> authFailAction() {
        return this.authFailAction == null ? Codegen.empty() : this.authFailAction;
    }

    /**
     * Level of login required to access this resource. Not supported for Node.js in the App Engine standard environment.
     * 
     */
    @Import(name="login")
      private final @Nullable Output<UrlMapLogin> login;

    public Output<UrlMapLogin> login() {
        return this.login == null ? Codegen.empty() : this.login;
    }

    /**
     * 30x code to use when performing redirects for the secure field. Defaults to 302.
     * 
     */
    @Import(name="redirectHttpResponseCode")
      private final @Nullable Output<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode;

    public Output<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode() {
        return this.redirectHttpResponseCode == null ? Codegen.empty() : this.redirectHttpResponseCode;
    }

    /**
     * Executes a script to handle the requests that match this URL pattern. Only the auto value is supported for Node.js in the App Engine standard environment, for example "script": "auto".
     * 
     */
    @Import(name="script")
      private final @Nullable Output<ScriptHandlerArgs> script;

    public Output<ScriptHandlerArgs> script() {
        return this.script == null ? Codegen.empty() : this.script;
    }

    /**
     * Security (HTTPS) enforcement for this URL.
     * 
     */
    @Import(name="securityLevel")
      private final @Nullable Output<UrlMapSecurityLevel> securityLevel;

    public Output<UrlMapSecurityLevel> securityLevel() {
        return this.securityLevel == null ? Codegen.empty() : this.securityLevel;
    }

    /**
     * Returns the contents of a file, such as an image, as the response.
     * 
     */
    @Import(name="staticFiles")
      private final @Nullable Output<StaticFilesHandlerArgs> staticFiles;

    public Output<StaticFilesHandlerArgs> staticFiles() {
        return this.staticFiles == null ? Codegen.empty() : this.staticFiles;
    }

    /**
     * URL prefix. Uses regular expression syntax, which means regexp special characters must be escaped, but should not contain groupings. All URLs that begin with this prefix are handled by this handler, using the portion of the URL after the prefix as part of the file path.
     * 
     */
    @Import(name="urlRegex")
      private final @Nullable Output<String> urlRegex;

    public Output<String> urlRegex() {
        return this.urlRegex == null ? Codegen.empty() : this.urlRegex;
    }

    public UrlMapArgs(
        @Nullable Output<ApiEndpointHandlerArgs> apiEndpoint,
        @Nullable Output<UrlMapAuthFailAction> authFailAction,
        @Nullable Output<UrlMapLogin> login,
        @Nullable Output<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode,
        @Nullable Output<ScriptHandlerArgs> script,
        @Nullable Output<UrlMapSecurityLevel> securityLevel,
        @Nullable Output<StaticFilesHandlerArgs> staticFiles,
        @Nullable Output<String> urlRegex) {
        this.apiEndpoint = apiEndpoint;
        this.authFailAction = authFailAction;
        this.login = login;
        this.redirectHttpResponseCode = redirectHttpResponseCode;
        this.script = script;
        this.securityLevel = securityLevel;
        this.staticFiles = staticFiles;
        this.urlRegex = urlRegex;
    }

    private UrlMapArgs() {
        this.apiEndpoint = Codegen.empty();
        this.authFailAction = Codegen.empty();
        this.login = Codegen.empty();
        this.redirectHttpResponseCode = Codegen.empty();
        this.script = Codegen.empty();
        this.securityLevel = Codegen.empty();
        this.staticFiles = Codegen.empty();
        this.urlRegex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApiEndpointHandlerArgs> apiEndpoint;
        private @Nullable Output<UrlMapAuthFailAction> authFailAction;
        private @Nullable Output<UrlMapLogin> login;
        private @Nullable Output<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode;
        private @Nullable Output<ScriptHandlerArgs> script;
        private @Nullable Output<UrlMapSecurityLevel> securityLevel;
        private @Nullable Output<StaticFilesHandlerArgs> staticFiles;
        private @Nullable Output<String> urlRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlMapArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiEndpoint = defaults.apiEndpoint;
    	      this.authFailAction = defaults.authFailAction;
    	      this.login = defaults.login;
    	      this.redirectHttpResponseCode = defaults.redirectHttpResponseCode;
    	      this.script = defaults.script;
    	      this.securityLevel = defaults.securityLevel;
    	      this.staticFiles = defaults.staticFiles;
    	      this.urlRegex = defaults.urlRegex;
        }

        public Builder apiEndpoint(@Nullable Output<ApiEndpointHandlerArgs> apiEndpoint) {
            this.apiEndpoint = apiEndpoint;
            return this;
        }
        public Builder apiEndpoint(@Nullable ApiEndpointHandlerArgs apiEndpoint) {
            this.apiEndpoint = Codegen.ofNullable(apiEndpoint);
            return this;
        }
        public Builder authFailAction(@Nullable Output<UrlMapAuthFailAction> authFailAction) {
            this.authFailAction = authFailAction;
            return this;
        }
        public Builder authFailAction(@Nullable UrlMapAuthFailAction authFailAction) {
            this.authFailAction = Codegen.ofNullable(authFailAction);
            return this;
        }
        public Builder login(@Nullable Output<UrlMapLogin> login) {
            this.login = login;
            return this;
        }
        public Builder login(@Nullable UrlMapLogin login) {
            this.login = Codegen.ofNullable(login);
            return this;
        }
        public Builder redirectHttpResponseCode(@Nullable Output<UrlMapRedirectHttpResponseCode> redirectHttpResponseCode) {
            this.redirectHttpResponseCode = redirectHttpResponseCode;
            return this;
        }
        public Builder redirectHttpResponseCode(@Nullable UrlMapRedirectHttpResponseCode redirectHttpResponseCode) {
            this.redirectHttpResponseCode = Codegen.ofNullable(redirectHttpResponseCode);
            return this;
        }
        public Builder script(@Nullable Output<ScriptHandlerArgs> script) {
            this.script = script;
            return this;
        }
        public Builder script(@Nullable ScriptHandlerArgs script) {
            this.script = Codegen.ofNullable(script);
            return this;
        }
        public Builder securityLevel(@Nullable Output<UrlMapSecurityLevel> securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }
        public Builder securityLevel(@Nullable UrlMapSecurityLevel securityLevel) {
            this.securityLevel = Codegen.ofNullable(securityLevel);
            return this;
        }
        public Builder staticFiles(@Nullable Output<StaticFilesHandlerArgs> staticFiles) {
            this.staticFiles = staticFiles;
            return this;
        }
        public Builder staticFiles(@Nullable StaticFilesHandlerArgs staticFiles) {
            this.staticFiles = Codegen.ofNullable(staticFiles);
            return this;
        }
        public Builder urlRegex(@Nullable Output<String> urlRegex) {
            this.urlRegex = urlRegex;
            return this;
        }
        public Builder urlRegex(@Nullable String urlRegex) {
            this.urlRegex = Codegen.ofNullable(urlRegex);
            return this;
        }        public UrlMapArgs build() {
            return new UrlMapArgs(apiEndpoint, authFailAction, login, redirectHttpResponseCode, script, securityLevel, staticFiles, urlRegex);
        }
    }
}
