// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetBackendServiceIap {
    private final String oauth2ClientId;
    private final String oauth2ClientSecret;
    private final String oauth2ClientSecretSha256;

    @OutputCustomType.Constructor
    private GetBackendServiceIap(
        @OutputCustomType.Parameter("oauth2ClientId") String oauth2ClientId,
        @OutputCustomType.Parameter("oauth2ClientSecret") String oauth2ClientSecret,
        @OutputCustomType.Parameter("oauth2ClientSecretSha256") String oauth2ClientSecretSha256) {
        this.oauth2ClientId = oauth2ClientId;
        this.oauth2ClientSecret = oauth2ClientSecret;
        this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
    }

    public String getOauth2ClientId() {
        return this.oauth2ClientId;
    }
    public String getOauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }
    public String getOauth2ClientSecretSha256() {
        return this.oauth2ClientSecretSha256;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceIap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String oauth2ClientId;
        private String oauth2ClientSecret;
        private String oauth2ClientSecretSha256;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceIap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
    	      this.oauth2ClientSecretSha256 = defaults.oauth2ClientSecretSha256;
        }

        public Builder setOauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }

        public Builder setOauth2ClientSecret(String oauth2ClientSecret) {
            this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
            return this;
        }

        public Builder setOauth2ClientSecretSha256(String oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = Objects.requireNonNull(oauth2ClientSecretSha256);
            return this;
        }
        public GetBackendServiceIap build() {
            return new GetBackendServiceIap(oauth2ClientId, oauth2ClientSecret, oauth2ClientSecretSha256);
        }
    }
}
