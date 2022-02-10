// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.servicemanagement_v1.outputs.JwtLocationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AuthProviderResponse {
    private final String audiences;
    private final String authorizationUrl;
    private final String issuer;
    private final String jwksUri;
    private final List<JwtLocationResponse> jwtLocations;

    @OutputCustomType.Constructor({"audiences","authorizationUrl","issuer","jwksUri","jwtLocations"})
    private AuthProviderResponse(
        String audiences,
        String authorizationUrl,
        String issuer,
        String jwksUri,
        List<JwtLocationResponse> jwtLocations) {
        this.audiences = Objects.requireNonNull(audiences);
        this.authorizationUrl = Objects.requireNonNull(authorizationUrl);
        this.issuer = Objects.requireNonNull(issuer);
        this.jwksUri = Objects.requireNonNull(jwksUri);
        this.jwtLocations = Objects.requireNonNull(jwtLocations);
    }

    public String getAudiences() {
        return this.audiences;
    }
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }
    public String getIssuer() {
        return this.issuer;
    }
    public String getJwksUri() {
        return this.jwksUri;
    }
    public List<JwtLocationResponse> getJwtLocations() {
        return this.jwtLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String audiences;
        private String authorizationUrl;
        private String issuer;
        private String jwksUri;
        private List<JwtLocationResponse> jwtLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authorizationUrl = defaults.authorizationUrl;
    	      this.issuer = defaults.issuer;
    	      this.jwksUri = defaults.jwksUri;
    	      this.jwtLocations = defaults.jwtLocations;
        }

        public Builder setAudiences(String audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }

        public Builder setAuthorizationUrl(String authorizationUrl) {
            this.authorizationUrl = Objects.requireNonNull(authorizationUrl);
            return this;
        }

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setJwksUri(String jwksUri) {
            this.jwksUri = Objects.requireNonNull(jwksUri);
            return this;
        }

        public Builder setJwtLocations(List<JwtLocationResponse> jwtLocations) {
            this.jwtLocations = Objects.requireNonNull(jwtLocations);
            return this;
        }

        public AuthProviderResponse build() {
            return new AuthProviderResponse(audiences, authorizationUrl, issuer, jwksUri, jwtLocations);
        }
    }
}