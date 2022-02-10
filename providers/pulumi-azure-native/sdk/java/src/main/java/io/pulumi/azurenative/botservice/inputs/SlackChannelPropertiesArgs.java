// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SlackChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SlackChannelPropertiesArgs Empty = new SlackChannelPropertiesArgs();

    @InputImport(name="clientId")
    private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    @InputImport(name="clientSecret")
    private final @Nullable Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    @InputImport(name="isEnabled", required=true)
    private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    @InputImport(name="landingPageUrl")
    private final @Nullable Input<String> landingPageUrl;

    public Input<String> getLandingPageUrl() {
        return this.landingPageUrl == null ? Input.empty() : this.landingPageUrl;
    }

    @InputImport(name="signingSecret")
    private final @Nullable Input<String> signingSecret;

    public Input<String> getSigningSecret() {
        return this.signingSecret == null ? Input.empty() : this.signingSecret;
    }

    @InputImport(name="verificationToken")
    private final @Nullable Input<String> verificationToken;

    public Input<String> getVerificationToken() {
        return this.verificationToken == null ? Input.empty() : this.verificationToken;
    }

    public SlackChannelPropertiesArgs(
        @Nullable Input<String> clientId,
        @Nullable Input<String> clientSecret,
        Input<Boolean> isEnabled,
        @Nullable Input<String> landingPageUrl,
        @Nullable Input<String> signingSecret,
        @Nullable Input<String> verificationToken) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.landingPageUrl = landingPageUrl;
        this.signingSecret = signingSecret;
        this.verificationToken = verificationToken;
    }

    private SlackChannelPropertiesArgs() {
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.isEnabled = Input.empty();
        this.landingPageUrl = Input.empty();
        this.signingSecret = Input.empty();
        this.verificationToken = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlackChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> clientSecret;
        private Input<Boolean> isEnabled;
        private @Nullable Input<String> landingPageUrl;
        private @Nullable Input<String> signingSecret;
        private @Nullable Input<String> verificationToken;

        public Builder() {
    	      // Empty
        }

        public Builder(SlackChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.isEnabled = defaults.isEnabled;
    	      this.landingPageUrl = defaults.landingPageUrl;
    	      this.signingSecret = defaults.signingSecret;
    	      this.verificationToken = defaults.verificationToken;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setClientSecret(@Nullable Input<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
            return this;
        }

        public Builder setIsEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder setLandingPageUrl(@Nullable Input<String> landingPageUrl) {
            this.landingPageUrl = landingPageUrl;
            return this;
        }

        public Builder setLandingPageUrl(@Nullable String landingPageUrl) {
            this.landingPageUrl = Input.ofNullable(landingPageUrl);
            return this;
        }

        public Builder setSigningSecret(@Nullable Input<String> signingSecret) {
            this.signingSecret = signingSecret;
            return this;
        }

        public Builder setSigningSecret(@Nullable String signingSecret) {
            this.signingSecret = Input.ofNullable(signingSecret);
            return this;
        }

        public Builder setVerificationToken(@Nullable Input<String> verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }

        public Builder setVerificationToken(@Nullable String verificationToken) {
            this.verificationToken = Input.ofNullable(verificationToken);
            return this;
        }

        public SlackChannelPropertiesArgs build() {
            return new SlackChannelPropertiesArgs(clientId, clientSecret, isEnabled, landingPageUrl, signingSecret, verificationToken);
        }
    }
}