// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230530BehaviorResponseCookie {
    private @Nullable String cookieName;
    private @Nullable Boolean defaultDomain;
    private @Nullable Boolean defaultPath;
    private @Nullable String domain;
    private @Nullable String duration;
    private @Nullable Boolean enabled;
    private @Nullable String expirationDate;
    private @Nullable String expires;
    private @Nullable String format;
    private @Nullable Boolean httpOnly;
    private @Nullable Boolean locked;
    private @Nullable String path;
    private @Nullable String sameSite;
    private @Nullable Boolean secure;
    private @Nullable String templateUuid;
    private @Nullable String type;
    private @Nullable String uuid;
    private @Nullable String value;

    private GetPropertyRulesBuilderRulesV20230530BehaviorResponseCookie() {}
    public Optional<String> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }
    public Optional<Boolean> defaultDomain() {
        return Optional.ofNullable(this.defaultDomain);
    }
    public Optional<Boolean> defaultPath() {
        return Optional.ofNullable(this.defaultPath);
    }
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> expirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    public Optional<String> expires() {
        return Optional.ofNullable(this.expires);
    }
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    public Optional<Boolean> httpOnly() {
        return Optional.ofNullable(this.httpOnly);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    public Optional<String> sameSite() {
        return Optional.ofNullable(this.sameSite);
    }
    public Optional<Boolean> secure() {
        return Optional.ofNullable(this.secure);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorResponseCookie defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cookieName;
        private @Nullable Boolean defaultDomain;
        private @Nullable Boolean defaultPath;
        private @Nullable String domain;
        private @Nullable String duration;
        private @Nullable Boolean enabled;
        private @Nullable String expirationDate;
        private @Nullable String expires;
        private @Nullable String format;
        private @Nullable Boolean httpOnly;
        private @Nullable Boolean locked;
        private @Nullable String path;
        private @Nullable String sameSite;
        private @Nullable Boolean secure;
        private @Nullable String templateUuid;
        private @Nullable String type;
        private @Nullable String uuid;
        private @Nullable String value;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorResponseCookie defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieName = defaults.cookieName;
    	      this.defaultDomain = defaults.defaultDomain;
    	      this.defaultPath = defaults.defaultPath;
    	      this.domain = defaults.domain;
    	      this.duration = defaults.duration;
    	      this.enabled = defaults.enabled;
    	      this.expirationDate = defaults.expirationDate;
    	      this.expires = defaults.expires;
    	      this.format = defaults.format;
    	      this.httpOnly = defaults.httpOnly;
    	      this.locked = defaults.locked;
    	      this.path = defaults.path;
    	      this.sameSite = defaults.sameSite;
    	      this.secure = defaults.secure;
    	      this.templateUuid = defaults.templateUuid;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder cookieName(@Nullable String cookieName) {

            this.cookieName = cookieName;
            return this;
        }
        @CustomType.Setter
        public Builder defaultDomain(@Nullable Boolean defaultDomain) {

            this.defaultDomain = defaultDomain;
            return this;
        }
        @CustomType.Setter
        public Builder defaultPath(@Nullable Boolean defaultPath) {

            this.defaultPath = defaultPath;
            return this;
        }
        @CustomType.Setter
        public Builder domain(@Nullable String domain) {

            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder duration(@Nullable String duration) {

            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder expirationDate(@Nullable String expirationDate) {

            this.expirationDate = expirationDate;
            return this;
        }
        @CustomType.Setter
        public Builder expires(@Nullable String expires) {

            this.expires = expires;
            return this;
        }
        @CustomType.Setter
        public Builder format(@Nullable String format) {

            this.format = format;
            return this;
        }
        @CustomType.Setter
        public Builder httpOnly(@Nullable Boolean httpOnly) {

            this.httpOnly = httpOnly;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {

            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder sameSite(@Nullable String sameSite) {

            this.sameSite = sameSite;
            return this;
        }
        @CustomType.Setter
        public Builder secure(@Nullable Boolean secure) {

            this.secure = secure;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {

            this.value = value;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorResponseCookie build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorResponseCookie();
            _resultValue.cookieName = cookieName;
            _resultValue.defaultDomain = defaultDomain;
            _resultValue.defaultPath = defaultPath;
            _resultValue.domain = domain;
            _resultValue.duration = duration;
            _resultValue.enabled = enabled;
            _resultValue.expirationDate = expirationDate;
            _resultValue.expires = expires;
            _resultValue.format = format;
            _resultValue.httpOnly = httpOnly;
            _resultValue.locked = locked;
            _resultValue.path = path;
            _resultValue.sameSite = sameSite;
            _resultValue.secure = secure;
            _resultValue.templateUuid = templateUuid;
            _resultValue.type = type;
            _resultValue.uuid = uuid;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
