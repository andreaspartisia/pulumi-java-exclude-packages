// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.connectors_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.connectors_v1.outputs.JwtClaimsResponse;
import io.pulumi.googlenative.connectors_v1.outputs.SecretResponse;
import java.util.Objects;

@CustomType
public final class Oauth2JwtBearerResponse {
    /**
     * Secret version reference containing a PKCS#8 PEM-encoded private key associated with the Client Certificate. This private key will be used to sign JWTs used for the jwt-bearer authorization grant. Specified in the form as: `projects/*{@literal /}secrets/*{@literal /}versions/*`.
     * 
     */
    private final SecretResponse clientKey;
    /**
     * JwtClaims providers fields to generate the token.
     * 
     */
    private final JwtClaimsResponse jwtClaims;

    @CustomType.Constructor
    private Oauth2JwtBearerResponse(
        @CustomType.Parameter("clientKey") SecretResponse clientKey,
        @CustomType.Parameter("jwtClaims") JwtClaimsResponse jwtClaims) {
        this.clientKey = clientKey;
        this.jwtClaims = jwtClaims;
    }

    /**
     * Secret version reference containing a PKCS#8 PEM-encoded private key associated with the Client Certificate. This private key will be used to sign JWTs used for the jwt-bearer authorization grant. Specified in the form as: `projects/*{@literal /}secrets/*{@literal /}versions/*`.
     * 
    */
    public SecretResponse clientKey() {
        return this.clientKey;
    }
    /**
     * JwtClaims providers fields to generate the token.
     * 
    */
    public JwtClaimsResponse jwtClaims() {
        return this.jwtClaims;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Oauth2JwtBearerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecretResponse clientKey;
        private JwtClaimsResponse jwtClaims;

        public Builder() {
    	      // Empty
        }

        public Builder(Oauth2JwtBearerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientKey = defaults.clientKey;
    	      this.jwtClaims = defaults.jwtClaims;
        }

        public Builder clientKey(SecretResponse clientKey) {
            this.clientKey = Objects.requireNonNull(clientKey);
            return this;
        }
        public Builder jwtClaims(JwtClaimsResponse jwtClaims) {
            this.jwtClaims = Objects.requireNonNull(jwtClaims);
            return this;
        }        public Oauth2JwtBearerResponse build() {
            return new Oauth2JwtBearerResponse(clientKey, jwtClaims);
        }
    }
}
