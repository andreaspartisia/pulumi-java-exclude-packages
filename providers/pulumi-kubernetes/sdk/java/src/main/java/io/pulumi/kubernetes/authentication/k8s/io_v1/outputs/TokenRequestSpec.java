// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.authentication.k8s.io_v1.outputs.BoundObjectReference;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TokenRequestSpec {
    /**
     * Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
     * 
     */
    private final List<String> audiences;
    /**
     * BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
     * 
     */
    private final @Nullable BoundObjectReference boundObjectRef;
    /**
     * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
     * 
     */
    private final @Nullable Integer expirationSeconds;

    @OutputCustomType.Constructor({"audiences","boundObjectRef","expirationSeconds"})
    private TokenRequestSpec(
        List<String> audiences,
        @Nullable BoundObjectReference boundObjectRef,
        @Nullable Integer expirationSeconds) {
        this.audiences = Objects.requireNonNull(audiences);
        this.boundObjectRef = boundObjectRef;
        this.expirationSeconds = expirationSeconds;
    }

    /**
     * Audiences are the intendend audiences of the token. A recipient of a token must identitfy themself with an identifier in the list of audiences of the token, and otherwise should reject the token. A token issued for multiple audiences may be used to authenticate against any of the audiences listed but implies a high degree of trust between the target audiences.
     * 
     */
    public List<String> getAudiences() {
        return this.audiences;
    }
    /**
     * BoundObjectRef is a reference to an object that the token will be bound to. The token will only be valid for as long as the bound object exists. NOTE: The API server's TokenReview endpoint will validate the BoundObjectRef, but other audiences may not. Keep ExpirationSeconds small if you want prompt revocation.
     * 
     */
    public Optional<BoundObjectReference> getBoundObjectRef() {
        return Optional.ofNullable(this.boundObjectRef);
    }
    /**
     * ExpirationSeconds is the requested duration of validity of the request. The token issuer may return a token with a different validity duration so a client needs to check the 'expiration' field in a response.
     * 
     */
    public Optional<Integer> getExpirationSeconds() {
        return Optional.ofNullable(this.expirationSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenRequestSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> audiences;
        private @Nullable BoundObjectReference boundObjectRef;
        private @Nullable Integer expirationSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenRequestSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.boundObjectRef = defaults.boundObjectRef;
    	      this.expirationSeconds = defaults.expirationSeconds;
        }

        public Builder setAudiences(List<String> audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }

        public Builder setBoundObjectRef(@Nullable BoundObjectReference boundObjectRef) {
            this.boundObjectRef = boundObjectRef;
            return this;
        }

        public Builder setExpirationSeconds(@Nullable Integer expirationSeconds) {
            this.expirationSeconds = expirationSeconds;
            return this;
        }

        public TokenRequestSpec build() {
            return new TokenRequestSpec(audiences, boundObjectRef, expirationSeconds);
        }
    }
}