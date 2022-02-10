// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.azurenative.botservice.outputs.FacebookPageResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FacebookChannelPropertiesResponse {
    private final String appId;
    private final @Nullable String appSecret;
    private final String callbackUrl;
    private final Boolean isEnabled;
    private final @Nullable List<FacebookPageResponse> pages;
    private final String verifyToken;

    @OutputCustomType.Constructor({"appId","appSecret","callbackUrl","isEnabled","pages","verifyToken"})
    private FacebookChannelPropertiesResponse(
        String appId,
        @Nullable String appSecret,
        String callbackUrl,
        Boolean isEnabled,
        @Nullable List<FacebookPageResponse> pages,
        String verifyToken) {
        this.appId = Objects.requireNonNull(appId);
        this.appSecret = appSecret;
        this.callbackUrl = Objects.requireNonNull(callbackUrl);
        this.isEnabled = Objects.requireNonNull(isEnabled);
        this.pages = pages;
        this.verifyToken = Objects.requireNonNull(verifyToken);
    }

    public String getAppId() {
        return this.appId;
    }
    public Optional<String> getAppSecret() {
        return Optional.ofNullable(this.appSecret);
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    public List<FacebookPageResponse> getPages() {
        return this.pages == null ? List.of() : this.pages;
    }
    public String getVerifyToken() {
        return this.verifyToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private @Nullable String appSecret;
        private String callbackUrl;
        private Boolean isEnabled;
        private @Nullable List<FacebookPageResponse> pages;
        private String verifyToken;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appSecret = defaults.appSecret;
    	      this.callbackUrl = defaults.callbackUrl;
    	      this.isEnabled = defaults.isEnabled;
    	      this.pages = defaults.pages;
    	      this.verifyToken = defaults.verifyToken;
        }

        public Builder setAppId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppSecret(@Nullable String appSecret) {
            this.appSecret = appSecret;
            return this;
        }

        public Builder setCallbackUrl(String callbackUrl) {
            this.callbackUrl = Objects.requireNonNull(callbackUrl);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setPages(@Nullable List<FacebookPageResponse> pages) {
            this.pages = pages;
            return this;
        }

        public Builder setVerifyToken(String verifyToken) {
            this.verifyToken = Objects.requireNonNull(verifyToken);
            return this;
        }

        public FacebookChannelPropertiesResponse build() {
            return new FacebookChannelPropertiesResponse(appId, appSecret, callbackUrl, isEnabled, pages, verifyToken);
        }
    }
}