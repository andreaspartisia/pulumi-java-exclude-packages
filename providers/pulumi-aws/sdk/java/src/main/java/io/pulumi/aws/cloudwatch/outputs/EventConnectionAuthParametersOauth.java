// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.outputs;

import io.pulumi.aws.cloudwatch.outputs.EventConnectionAuthParametersOauthClientParameters;
import io.pulumi.aws.cloudwatch.outputs.EventConnectionAuthParametersOauthOauthHttpParameters;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventConnectionAuthParametersOauth {
    /**
     * The URL to the authorization endpoint.
     * 
     */
    private final String authorizationEndpoint;
    /**
     * Contains the client parameters for OAuth authorization. Contains the following two parameters.
     * 
     */
    private final @Nullable EventConnectionAuthParametersOauthClientParameters clientParameters;
    /**
     * A password for the authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    private final String httpMethod;
    /**
     * OAuth Http Parameters are additional credentials used to sign the request to the authorization endpoint to exchange the OAuth Client information for an access token. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * 
     */
    private final EventConnectionAuthParametersOauthOauthHttpParameters oauthHttpParameters;

    @OutputCustomType.Constructor
    private EventConnectionAuthParametersOauth(
        @OutputCustomType.Parameter("authorizationEndpoint") String authorizationEndpoint,
        @OutputCustomType.Parameter("clientParameters") @Nullable EventConnectionAuthParametersOauthClientParameters clientParameters,
        @OutputCustomType.Parameter("httpMethod") String httpMethod,
        @OutputCustomType.Parameter("oauthHttpParameters") EventConnectionAuthParametersOauthOauthHttpParameters oauthHttpParameters) {
        this.authorizationEndpoint = authorizationEndpoint;
        this.clientParameters = clientParameters;
        this.httpMethod = httpMethod;
        this.oauthHttpParameters = oauthHttpParameters;
    }

    /**
     * The URL to the authorization endpoint.
     * 
    */
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    /**
     * Contains the client parameters for OAuth authorization. Contains the following two parameters.
     * 
    */
    public Optional<EventConnectionAuthParametersOauthClientParameters> getClientParameters() {
        return Optional.ofNullable(this.clientParameters);
    }
    /**
     * A password for the authorization. Created and stored in AWS Secrets Manager.
     * 
    */
    public String getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * OAuth Http Parameters are additional credentials used to sign the request to the authorization endpoint to exchange the OAuth Client information for an access token. Secret values are stored and managed by AWS Secrets Manager. A maximum of 1 are allowed. Documented below.
     * 
    */
    public EventConnectionAuthParametersOauthOauthHttpParameters getOauthHttpParameters() {
        return this.oauthHttpParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventConnectionAuthParametersOauth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationEndpoint;
        private @Nullable EventConnectionAuthParametersOauthClientParameters clientParameters;
        private String httpMethod;
        private EventConnectionAuthParametersOauthOauthHttpParameters oauthHttpParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EventConnectionAuthParametersOauth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientParameters = defaults.clientParameters;
    	      this.httpMethod = defaults.httpMethod;
    	      this.oauthHttpParameters = defaults.oauthHttpParameters;
        }

        public Builder setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }

        public Builder setClientParameters(@Nullable EventConnectionAuthParametersOauthClientParameters clientParameters) {
            this.clientParameters = clientParameters;
            return this;
        }

        public Builder setHttpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }

        public Builder setOauthHttpParameters(EventConnectionAuthParametersOauthOauthHttpParameters oauthHttpParameters) {
            this.oauthHttpParameters = Objects.requireNonNull(oauthHttpParameters);
            return this;
        }
        public EventConnectionAuthParametersOauth build() {
            return new EventConnectionAuthParametersOauth(authorizationEndpoint, clientParameters, httpMethod, oauthHttpParameters);
        }
    }
}