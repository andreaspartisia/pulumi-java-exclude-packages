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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorSubCustomer {
    private @Nullable Boolean accessControl;
    private @Nullable Boolean cacheKey;
    private @Nullable Boolean caching;
    private @Nullable Boolean contentCompressor;
    private @Nullable Boolean dynamicWebContent;
    private @Nullable Boolean enabled;
    private @Nullable Boolean geoLocation;
    private @Nullable Boolean ip;
    private @Nullable Boolean largeFileDelivery;
    private @Nullable Boolean liveVideoDelivery;
    private @Nullable Boolean locked;
    private @Nullable Boolean modifyPath;
    private @Nullable Boolean onDemandVideoDelivery;
    private @Nullable Boolean origin;
    private @Nullable String partnerDomainSuffix;
    private @Nullable Boolean referrer;
    private @Nullable Boolean refreshContent;
    private @Nullable Boolean siteFailover;
    private @Nullable String templateUuid;
    private @Nullable Boolean tokenAuthorization;
    private @Nullable String uuid;
    private @Nullable Boolean webApplicationFirewall;

    private GetPropertyRulesBuilderRulesV20230105BehaviorSubCustomer() {}
    public Optional<Boolean> accessControl() {
        return Optional.ofNullable(this.accessControl);
    }
    public Optional<Boolean> cacheKey() {
        return Optional.ofNullable(this.cacheKey);
    }
    public Optional<Boolean> caching() {
        return Optional.ofNullable(this.caching);
    }
    public Optional<Boolean> contentCompressor() {
        return Optional.ofNullable(this.contentCompressor);
    }
    public Optional<Boolean> dynamicWebContent() {
        return Optional.ofNullable(this.dynamicWebContent);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> geoLocation() {
        return Optional.ofNullable(this.geoLocation);
    }
    public Optional<Boolean> ip() {
        return Optional.ofNullable(this.ip);
    }
    public Optional<Boolean> largeFileDelivery() {
        return Optional.ofNullable(this.largeFileDelivery);
    }
    public Optional<Boolean> liveVideoDelivery() {
        return Optional.ofNullable(this.liveVideoDelivery);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> modifyPath() {
        return Optional.ofNullable(this.modifyPath);
    }
    public Optional<Boolean> onDemandVideoDelivery() {
        return Optional.ofNullable(this.onDemandVideoDelivery);
    }
    public Optional<Boolean> origin() {
        return Optional.ofNullable(this.origin);
    }
    public Optional<String> partnerDomainSuffix() {
        return Optional.ofNullable(this.partnerDomainSuffix);
    }
    public Optional<Boolean> referrer() {
        return Optional.ofNullable(this.referrer);
    }
    public Optional<Boolean> refreshContent() {
        return Optional.ofNullable(this.refreshContent);
    }
    public Optional<Boolean> siteFailover() {
        return Optional.ofNullable(this.siteFailover);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<Boolean> tokenAuthorization() {
        return Optional.ofNullable(this.tokenAuthorization);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<Boolean> webApplicationFirewall() {
        return Optional.ofNullable(this.webApplicationFirewall);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorSubCustomer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean accessControl;
        private @Nullable Boolean cacheKey;
        private @Nullable Boolean caching;
        private @Nullable Boolean contentCompressor;
        private @Nullable Boolean dynamicWebContent;
        private @Nullable Boolean enabled;
        private @Nullable Boolean geoLocation;
        private @Nullable Boolean ip;
        private @Nullable Boolean largeFileDelivery;
        private @Nullable Boolean liveVideoDelivery;
        private @Nullable Boolean locked;
        private @Nullable Boolean modifyPath;
        private @Nullable Boolean onDemandVideoDelivery;
        private @Nullable Boolean origin;
        private @Nullable String partnerDomainSuffix;
        private @Nullable Boolean referrer;
        private @Nullable Boolean refreshContent;
        private @Nullable Boolean siteFailover;
        private @Nullable String templateUuid;
        private @Nullable Boolean tokenAuthorization;
        private @Nullable String uuid;
        private @Nullable Boolean webApplicationFirewall;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorSubCustomer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControl = defaults.accessControl;
    	      this.cacheKey = defaults.cacheKey;
    	      this.caching = defaults.caching;
    	      this.contentCompressor = defaults.contentCompressor;
    	      this.dynamicWebContent = defaults.dynamicWebContent;
    	      this.enabled = defaults.enabled;
    	      this.geoLocation = defaults.geoLocation;
    	      this.ip = defaults.ip;
    	      this.largeFileDelivery = defaults.largeFileDelivery;
    	      this.liveVideoDelivery = defaults.liveVideoDelivery;
    	      this.locked = defaults.locked;
    	      this.modifyPath = defaults.modifyPath;
    	      this.onDemandVideoDelivery = defaults.onDemandVideoDelivery;
    	      this.origin = defaults.origin;
    	      this.partnerDomainSuffix = defaults.partnerDomainSuffix;
    	      this.referrer = defaults.referrer;
    	      this.refreshContent = defaults.refreshContent;
    	      this.siteFailover = defaults.siteFailover;
    	      this.templateUuid = defaults.templateUuid;
    	      this.tokenAuthorization = defaults.tokenAuthorization;
    	      this.uuid = defaults.uuid;
    	      this.webApplicationFirewall = defaults.webApplicationFirewall;
        }

        @CustomType.Setter
        public Builder accessControl(@Nullable Boolean accessControl) {

            this.accessControl = accessControl;
            return this;
        }
        @CustomType.Setter
        public Builder cacheKey(@Nullable Boolean cacheKey) {

            this.cacheKey = cacheKey;
            return this;
        }
        @CustomType.Setter
        public Builder caching(@Nullable Boolean caching) {

            this.caching = caching;
            return this;
        }
        @CustomType.Setter
        public Builder contentCompressor(@Nullable Boolean contentCompressor) {

            this.contentCompressor = contentCompressor;
            return this;
        }
        @CustomType.Setter
        public Builder dynamicWebContent(@Nullable Boolean dynamicWebContent) {

            this.dynamicWebContent = dynamicWebContent;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder geoLocation(@Nullable Boolean geoLocation) {

            this.geoLocation = geoLocation;
            return this;
        }
        @CustomType.Setter
        public Builder ip(@Nullable Boolean ip) {

            this.ip = ip;
            return this;
        }
        @CustomType.Setter
        public Builder largeFileDelivery(@Nullable Boolean largeFileDelivery) {

            this.largeFileDelivery = largeFileDelivery;
            return this;
        }
        @CustomType.Setter
        public Builder liveVideoDelivery(@Nullable Boolean liveVideoDelivery) {

            this.liveVideoDelivery = liveVideoDelivery;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder modifyPath(@Nullable Boolean modifyPath) {

            this.modifyPath = modifyPath;
            return this;
        }
        @CustomType.Setter
        public Builder onDemandVideoDelivery(@Nullable Boolean onDemandVideoDelivery) {

            this.onDemandVideoDelivery = onDemandVideoDelivery;
            return this;
        }
        @CustomType.Setter
        public Builder origin(@Nullable Boolean origin) {

            this.origin = origin;
            return this;
        }
        @CustomType.Setter
        public Builder partnerDomainSuffix(@Nullable String partnerDomainSuffix) {

            this.partnerDomainSuffix = partnerDomainSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder referrer(@Nullable Boolean referrer) {

            this.referrer = referrer;
            return this;
        }
        @CustomType.Setter
        public Builder refreshContent(@Nullable Boolean refreshContent) {

            this.refreshContent = refreshContent;
            return this;
        }
        @CustomType.Setter
        public Builder siteFailover(@Nullable Boolean siteFailover) {

            this.siteFailover = siteFailover;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder tokenAuthorization(@Nullable Boolean tokenAuthorization) {

            this.tokenAuthorization = tokenAuthorization;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder webApplicationFirewall(@Nullable Boolean webApplicationFirewall) {

            this.webApplicationFirewall = webApplicationFirewall;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorSubCustomer build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorSubCustomer();
            _resultValue.accessControl = accessControl;
            _resultValue.cacheKey = cacheKey;
            _resultValue.caching = caching;
            _resultValue.contentCompressor = contentCompressor;
            _resultValue.dynamicWebContent = dynamicWebContent;
            _resultValue.enabled = enabled;
            _resultValue.geoLocation = geoLocation;
            _resultValue.ip = ip;
            _resultValue.largeFileDelivery = largeFileDelivery;
            _resultValue.liveVideoDelivery = liveVideoDelivery;
            _resultValue.locked = locked;
            _resultValue.modifyPath = modifyPath;
            _resultValue.onDemandVideoDelivery = onDemandVideoDelivery;
            _resultValue.origin = origin;
            _resultValue.partnerDomainSuffix = partnerDomainSuffix;
            _resultValue.referrer = referrer;
            _resultValue.refreshContent = refreshContent;
            _resultValue.siteFailover = siteFailover;
            _resultValue.templateUuid = templateUuid;
            _resultValue.tokenAuthorization = tokenAuthorization;
            _resultValue.uuid = uuid;
            _resultValue.webApplicationFirewall = webApplicationFirewall;
            return _resultValue;
        }
    }
}
