// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicy;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCode;
import com.pulumi.akamai.outputs.GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorage;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization {
    private @Nullable Boolean allowedUserCookieAdvanced;
    private @Nullable Boolean allowedUserCookieAutomaticSalt;
    private @Nullable String allowedUserCookieDomain;
    private @Nullable String allowedUserCookieDomainType;
    private @Nullable Integer allowedUserCookieDuration;
    private @Nullable Boolean allowedUserCookieEnabled;
    private @Nullable Boolean allowedUserCookieHttpOnly;
    private @Nullable String allowedUserCookieLabel;
    private @Nullable String allowedUserCookieManagementTitle;
    private @Nullable Boolean allowedUserCookieRefresh;
    private @Nullable String allowedUserCookieSalt;
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicy cloudletPolicy;
    private @Nullable Boolean enabled;
    private @Nullable Boolean locked;
    private @Nullable String templateUuid;
    private @Nullable Boolean userIdentificationByCookie;
    private @Nullable Boolean userIdentificationByHeaders;
    private @Nullable Boolean userIdentificationByIp;
    private @Nullable Boolean userIdentificationByParams;
    private @Nullable String userIdentificationKeyCookie;
    private @Nullable List<String> userIdentificationKeyHeaders;
    private @Nullable List<String> userIdentificationKeyParams;
    private @Nullable String userIdentificationTitle;
    private @Nullable String uuid;
    private @Nullable Integer waitingRoomCacheTtl;
    private @Nullable Boolean waitingRoomCookieAdvanced;
    private @Nullable Boolean waitingRoomCookieAutomaticSalt;
    private @Nullable String waitingRoomCookieDomain;
    private @Nullable String waitingRoomCookieDomainType;
    private @Nullable Integer waitingRoomCookieDuration;
    private @Nullable Boolean waitingRoomCookieEnabled;
    private @Nullable Boolean waitingRoomCookieHttpOnly;
    private @Nullable String waitingRoomCookieLabel;
    private @Nullable String waitingRoomCookieManagementTitle;
    private @Nullable String waitingRoomCookieSalt;
    private @Nullable Boolean waitingRoomCookieShareLabel;
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCode waitingRoomCpCode;
    private @Nullable String waitingRoomDirectory;
    private @Nullable String waitingRoomManagementTitle;
    private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorage waitingRoomNetStorage;
    private @Nullable Integer waitingRoomStatusCode;
    private @Nullable Boolean waitingRoomUseCpCode;

    private GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization() {}
    public Optional<Boolean> allowedUserCookieAdvanced() {
        return Optional.ofNullable(this.allowedUserCookieAdvanced);
    }
    public Optional<Boolean> allowedUserCookieAutomaticSalt() {
        return Optional.ofNullable(this.allowedUserCookieAutomaticSalt);
    }
    public Optional<String> allowedUserCookieDomain() {
        return Optional.ofNullable(this.allowedUserCookieDomain);
    }
    public Optional<String> allowedUserCookieDomainType() {
        return Optional.ofNullable(this.allowedUserCookieDomainType);
    }
    public Optional<Integer> allowedUserCookieDuration() {
        return Optional.ofNullable(this.allowedUserCookieDuration);
    }
    public Optional<Boolean> allowedUserCookieEnabled() {
        return Optional.ofNullable(this.allowedUserCookieEnabled);
    }
    public Optional<Boolean> allowedUserCookieHttpOnly() {
        return Optional.ofNullable(this.allowedUserCookieHttpOnly);
    }
    public Optional<String> allowedUserCookieLabel() {
        return Optional.ofNullable(this.allowedUserCookieLabel);
    }
    public Optional<String> allowedUserCookieManagementTitle() {
        return Optional.ofNullable(this.allowedUserCookieManagementTitle);
    }
    public Optional<Boolean> allowedUserCookieRefresh() {
        return Optional.ofNullable(this.allowedUserCookieRefresh);
    }
    public Optional<String> allowedUserCookieSalt() {
        return Optional.ofNullable(this.allowedUserCookieSalt);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicy> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<Boolean> userIdentificationByCookie() {
        return Optional.ofNullable(this.userIdentificationByCookie);
    }
    public Optional<Boolean> userIdentificationByHeaders() {
        return Optional.ofNullable(this.userIdentificationByHeaders);
    }
    public Optional<Boolean> userIdentificationByIp() {
        return Optional.ofNullable(this.userIdentificationByIp);
    }
    public Optional<Boolean> userIdentificationByParams() {
        return Optional.ofNullable(this.userIdentificationByParams);
    }
    public Optional<String> userIdentificationKeyCookie() {
        return Optional.ofNullable(this.userIdentificationKeyCookie);
    }
    public List<String> userIdentificationKeyHeaders() {
        return this.userIdentificationKeyHeaders == null ? List.of() : this.userIdentificationKeyHeaders;
    }
    public List<String> userIdentificationKeyParams() {
        return this.userIdentificationKeyParams == null ? List.of() : this.userIdentificationKeyParams;
    }
    public Optional<String> userIdentificationTitle() {
        return Optional.ofNullable(this.userIdentificationTitle);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<Integer> waitingRoomCacheTtl() {
        return Optional.ofNullable(this.waitingRoomCacheTtl);
    }
    public Optional<Boolean> waitingRoomCookieAdvanced() {
        return Optional.ofNullable(this.waitingRoomCookieAdvanced);
    }
    public Optional<Boolean> waitingRoomCookieAutomaticSalt() {
        return Optional.ofNullable(this.waitingRoomCookieAutomaticSalt);
    }
    public Optional<String> waitingRoomCookieDomain() {
        return Optional.ofNullable(this.waitingRoomCookieDomain);
    }
    public Optional<String> waitingRoomCookieDomainType() {
        return Optional.ofNullable(this.waitingRoomCookieDomainType);
    }
    public Optional<Integer> waitingRoomCookieDuration() {
        return Optional.ofNullable(this.waitingRoomCookieDuration);
    }
    public Optional<Boolean> waitingRoomCookieEnabled() {
        return Optional.ofNullable(this.waitingRoomCookieEnabled);
    }
    public Optional<Boolean> waitingRoomCookieHttpOnly() {
        return Optional.ofNullable(this.waitingRoomCookieHttpOnly);
    }
    public Optional<String> waitingRoomCookieLabel() {
        return Optional.ofNullable(this.waitingRoomCookieLabel);
    }
    public Optional<String> waitingRoomCookieManagementTitle() {
        return Optional.ofNullable(this.waitingRoomCookieManagementTitle);
    }
    public Optional<String> waitingRoomCookieSalt() {
        return Optional.ofNullable(this.waitingRoomCookieSalt);
    }
    public Optional<Boolean> waitingRoomCookieShareLabel() {
        return Optional.ofNullable(this.waitingRoomCookieShareLabel);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCode> waitingRoomCpCode() {
        return Optional.ofNullable(this.waitingRoomCpCode);
    }
    public Optional<String> waitingRoomDirectory() {
        return Optional.ofNullable(this.waitingRoomDirectory);
    }
    public Optional<String> waitingRoomManagementTitle() {
        return Optional.ofNullable(this.waitingRoomManagementTitle);
    }
    public Optional<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorage> waitingRoomNetStorage() {
        return Optional.ofNullable(this.waitingRoomNetStorage);
    }
    public Optional<Integer> waitingRoomStatusCode() {
        return Optional.ofNullable(this.waitingRoomStatusCode);
    }
    public Optional<Boolean> waitingRoomUseCpCode() {
        return Optional.ofNullable(this.waitingRoomUseCpCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean allowedUserCookieAdvanced;
        private @Nullable Boolean allowedUserCookieAutomaticSalt;
        private @Nullable String allowedUserCookieDomain;
        private @Nullable String allowedUserCookieDomainType;
        private @Nullable Integer allowedUserCookieDuration;
        private @Nullable Boolean allowedUserCookieEnabled;
        private @Nullable Boolean allowedUserCookieHttpOnly;
        private @Nullable String allowedUserCookieLabel;
        private @Nullable String allowedUserCookieManagementTitle;
        private @Nullable Boolean allowedUserCookieRefresh;
        private @Nullable String allowedUserCookieSalt;
        private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicy cloudletPolicy;
        private @Nullable Boolean enabled;
        private @Nullable Boolean locked;
        private @Nullable String templateUuid;
        private @Nullable Boolean userIdentificationByCookie;
        private @Nullable Boolean userIdentificationByHeaders;
        private @Nullable Boolean userIdentificationByIp;
        private @Nullable Boolean userIdentificationByParams;
        private @Nullable String userIdentificationKeyCookie;
        private @Nullable List<String> userIdentificationKeyHeaders;
        private @Nullable List<String> userIdentificationKeyParams;
        private @Nullable String userIdentificationTitle;
        private @Nullable String uuid;
        private @Nullable Integer waitingRoomCacheTtl;
        private @Nullable Boolean waitingRoomCookieAdvanced;
        private @Nullable Boolean waitingRoomCookieAutomaticSalt;
        private @Nullable String waitingRoomCookieDomain;
        private @Nullable String waitingRoomCookieDomainType;
        private @Nullable Integer waitingRoomCookieDuration;
        private @Nullable Boolean waitingRoomCookieEnabled;
        private @Nullable Boolean waitingRoomCookieHttpOnly;
        private @Nullable String waitingRoomCookieLabel;
        private @Nullable String waitingRoomCookieManagementTitle;
        private @Nullable String waitingRoomCookieSalt;
        private @Nullable Boolean waitingRoomCookieShareLabel;
        private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCode waitingRoomCpCode;
        private @Nullable String waitingRoomDirectory;
        private @Nullable String waitingRoomManagementTitle;
        private @Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorage waitingRoomNetStorage;
        private @Nullable Integer waitingRoomStatusCode;
        private @Nullable Boolean waitingRoomUseCpCode;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedUserCookieAdvanced = defaults.allowedUserCookieAdvanced;
    	      this.allowedUserCookieAutomaticSalt = defaults.allowedUserCookieAutomaticSalt;
    	      this.allowedUserCookieDomain = defaults.allowedUserCookieDomain;
    	      this.allowedUserCookieDomainType = defaults.allowedUserCookieDomainType;
    	      this.allowedUserCookieDuration = defaults.allowedUserCookieDuration;
    	      this.allowedUserCookieEnabled = defaults.allowedUserCookieEnabled;
    	      this.allowedUserCookieHttpOnly = defaults.allowedUserCookieHttpOnly;
    	      this.allowedUserCookieLabel = defaults.allowedUserCookieLabel;
    	      this.allowedUserCookieManagementTitle = defaults.allowedUserCookieManagementTitle;
    	      this.allowedUserCookieRefresh = defaults.allowedUserCookieRefresh;
    	      this.allowedUserCookieSalt = defaults.allowedUserCookieSalt;
    	      this.cloudletPolicy = defaults.cloudletPolicy;
    	      this.enabled = defaults.enabled;
    	      this.locked = defaults.locked;
    	      this.templateUuid = defaults.templateUuid;
    	      this.userIdentificationByCookie = defaults.userIdentificationByCookie;
    	      this.userIdentificationByHeaders = defaults.userIdentificationByHeaders;
    	      this.userIdentificationByIp = defaults.userIdentificationByIp;
    	      this.userIdentificationByParams = defaults.userIdentificationByParams;
    	      this.userIdentificationKeyCookie = defaults.userIdentificationKeyCookie;
    	      this.userIdentificationKeyHeaders = defaults.userIdentificationKeyHeaders;
    	      this.userIdentificationKeyParams = defaults.userIdentificationKeyParams;
    	      this.userIdentificationTitle = defaults.userIdentificationTitle;
    	      this.uuid = defaults.uuid;
    	      this.waitingRoomCacheTtl = defaults.waitingRoomCacheTtl;
    	      this.waitingRoomCookieAdvanced = defaults.waitingRoomCookieAdvanced;
    	      this.waitingRoomCookieAutomaticSalt = defaults.waitingRoomCookieAutomaticSalt;
    	      this.waitingRoomCookieDomain = defaults.waitingRoomCookieDomain;
    	      this.waitingRoomCookieDomainType = defaults.waitingRoomCookieDomainType;
    	      this.waitingRoomCookieDuration = defaults.waitingRoomCookieDuration;
    	      this.waitingRoomCookieEnabled = defaults.waitingRoomCookieEnabled;
    	      this.waitingRoomCookieHttpOnly = defaults.waitingRoomCookieHttpOnly;
    	      this.waitingRoomCookieLabel = defaults.waitingRoomCookieLabel;
    	      this.waitingRoomCookieManagementTitle = defaults.waitingRoomCookieManagementTitle;
    	      this.waitingRoomCookieSalt = defaults.waitingRoomCookieSalt;
    	      this.waitingRoomCookieShareLabel = defaults.waitingRoomCookieShareLabel;
    	      this.waitingRoomCpCode = defaults.waitingRoomCpCode;
    	      this.waitingRoomDirectory = defaults.waitingRoomDirectory;
    	      this.waitingRoomManagementTitle = defaults.waitingRoomManagementTitle;
    	      this.waitingRoomNetStorage = defaults.waitingRoomNetStorage;
    	      this.waitingRoomStatusCode = defaults.waitingRoomStatusCode;
    	      this.waitingRoomUseCpCode = defaults.waitingRoomUseCpCode;
        }

        @CustomType.Setter
        public Builder allowedUserCookieAdvanced(@Nullable Boolean allowedUserCookieAdvanced) {

            this.allowedUserCookieAdvanced = allowedUserCookieAdvanced;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieAutomaticSalt(@Nullable Boolean allowedUserCookieAutomaticSalt) {

            this.allowedUserCookieAutomaticSalt = allowedUserCookieAutomaticSalt;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieDomain(@Nullable String allowedUserCookieDomain) {

            this.allowedUserCookieDomain = allowedUserCookieDomain;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieDomainType(@Nullable String allowedUserCookieDomainType) {

            this.allowedUserCookieDomainType = allowedUserCookieDomainType;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieDuration(@Nullable Integer allowedUserCookieDuration) {

            this.allowedUserCookieDuration = allowedUserCookieDuration;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieEnabled(@Nullable Boolean allowedUserCookieEnabled) {

            this.allowedUserCookieEnabled = allowedUserCookieEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieHttpOnly(@Nullable Boolean allowedUserCookieHttpOnly) {

            this.allowedUserCookieHttpOnly = allowedUserCookieHttpOnly;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieLabel(@Nullable String allowedUserCookieLabel) {

            this.allowedUserCookieLabel = allowedUserCookieLabel;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieManagementTitle(@Nullable String allowedUserCookieManagementTitle) {

            this.allowedUserCookieManagementTitle = allowedUserCookieManagementTitle;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieRefresh(@Nullable Boolean allowedUserCookieRefresh) {

            this.allowedUserCookieRefresh = allowedUserCookieRefresh;
            return this;
        }
        @CustomType.Setter
        public Builder allowedUserCookieSalt(@Nullable String allowedUserCookieSalt) {

            this.allowedUserCookieSalt = allowedUserCookieSalt;
            return this;
        }
        @CustomType.Setter
        public Builder cloudletPolicy(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicy cloudletPolicy) {

            this.cloudletPolicy = cloudletPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationByCookie(@Nullable Boolean userIdentificationByCookie) {

            this.userIdentificationByCookie = userIdentificationByCookie;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationByHeaders(@Nullable Boolean userIdentificationByHeaders) {

            this.userIdentificationByHeaders = userIdentificationByHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationByIp(@Nullable Boolean userIdentificationByIp) {

            this.userIdentificationByIp = userIdentificationByIp;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationByParams(@Nullable Boolean userIdentificationByParams) {

            this.userIdentificationByParams = userIdentificationByParams;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationKeyCookie(@Nullable String userIdentificationKeyCookie) {

            this.userIdentificationKeyCookie = userIdentificationKeyCookie;
            return this;
        }
        @CustomType.Setter
        public Builder userIdentificationKeyHeaders(@Nullable List<String> userIdentificationKeyHeaders) {

            this.userIdentificationKeyHeaders = userIdentificationKeyHeaders;
            return this;
        }
        public Builder userIdentificationKeyHeaders(String... userIdentificationKeyHeaders) {
            return userIdentificationKeyHeaders(List.of(userIdentificationKeyHeaders));
        }
        @CustomType.Setter
        public Builder userIdentificationKeyParams(@Nullable List<String> userIdentificationKeyParams) {

            this.userIdentificationKeyParams = userIdentificationKeyParams;
            return this;
        }
        public Builder userIdentificationKeyParams(String... userIdentificationKeyParams) {
            return userIdentificationKeyParams(List.of(userIdentificationKeyParams));
        }
        @CustomType.Setter
        public Builder userIdentificationTitle(@Nullable String userIdentificationTitle) {

            this.userIdentificationTitle = userIdentificationTitle;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCacheTtl(@Nullable Integer waitingRoomCacheTtl) {

            this.waitingRoomCacheTtl = waitingRoomCacheTtl;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieAdvanced(@Nullable Boolean waitingRoomCookieAdvanced) {

            this.waitingRoomCookieAdvanced = waitingRoomCookieAdvanced;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieAutomaticSalt(@Nullable Boolean waitingRoomCookieAutomaticSalt) {

            this.waitingRoomCookieAutomaticSalt = waitingRoomCookieAutomaticSalt;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieDomain(@Nullable String waitingRoomCookieDomain) {

            this.waitingRoomCookieDomain = waitingRoomCookieDomain;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieDomainType(@Nullable String waitingRoomCookieDomainType) {

            this.waitingRoomCookieDomainType = waitingRoomCookieDomainType;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieDuration(@Nullable Integer waitingRoomCookieDuration) {

            this.waitingRoomCookieDuration = waitingRoomCookieDuration;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieEnabled(@Nullable Boolean waitingRoomCookieEnabled) {

            this.waitingRoomCookieEnabled = waitingRoomCookieEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieHttpOnly(@Nullable Boolean waitingRoomCookieHttpOnly) {

            this.waitingRoomCookieHttpOnly = waitingRoomCookieHttpOnly;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieLabel(@Nullable String waitingRoomCookieLabel) {

            this.waitingRoomCookieLabel = waitingRoomCookieLabel;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieManagementTitle(@Nullable String waitingRoomCookieManagementTitle) {

            this.waitingRoomCookieManagementTitle = waitingRoomCookieManagementTitle;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieSalt(@Nullable String waitingRoomCookieSalt) {

            this.waitingRoomCookieSalt = waitingRoomCookieSalt;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCookieShareLabel(@Nullable Boolean waitingRoomCookieShareLabel) {

            this.waitingRoomCookieShareLabel = waitingRoomCookieShareLabel;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomCpCode(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCode waitingRoomCpCode) {

            this.waitingRoomCpCode = waitingRoomCpCode;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomDirectory(@Nullable String waitingRoomDirectory) {

            this.waitingRoomDirectory = waitingRoomDirectory;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomManagementTitle(@Nullable String waitingRoomManagementTitle) {

            this.waitingRoomManagementTitle = waitingRoomManagementTitle;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomNetStorage(@Nullable GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorage waitingRoomNetStorage) {

            this.waitingRoomNetStorage = waitingRoomNetStorage;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomStatusCode(@Nullable Integer waitingRoomStatusCode) {

            this.waitingRoomStatusCode = waitingRoomStatusCode;
            return this;
        }
        @CustomType.Setter
        public Builder waitingRoomUseCpCode(@Nullable Boolean waitingRoomUseCpCode) {

            this.waitingRoomUseCpCode = waitingRoomUseCpCode;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritization();
            _resultValue.allowedUserCookieAdvanced = allowedUserCookieAdvanced;
            _resultValue.allowedUserCookieAutomaticSalt = allowedUserCookieAutomaticSalt;
            _resultValue.allowedUserCookieDomain = allowedUserCookieDomain;
            _resultValue.allowedUserCookieDomainType = allowedUserCookieDomainType;
            _resultValue.allowedUserCookieDuration = allowedUserCookieDuration;
            _resultValue.allowedUserCookieEnabled = allowedUserCookieEnabled;
            _resultValue.allowedUserCookieHttpOnly = allowedUserCookieHttpOnly;
            _resultValue.allowedUserCookieLabel = allowedUserCookieLabel;
            _resultValue.allowedUserCookieManagementTitle = allowedUserCookieManagementTitle;
            _resultValue.allowedUserCookieRefresh = allowedUserCookieRefresh;
            _resultValue.allowedUserCookieSalt = allowedUserCookieSalt;
            _resultValue.cloudletPolicy = cloudletPolicy;
            _resultValue.enabled = enabled;
            _resultValue.locked = locked;
            _resultValue.templateUuid = templateUuid;
            _resultValue.userIdentificationByCookie = userIdentificationByCookie;
            _resultValue.userIdentificationByHeaders = userIdentificationByHeaders;
            _resultValue.userIdentificationByIp = userIdentificationByIp;
            _resultValue.userIdentificationByParams = userIdentificationByParams;
            _resultValue.userIdentificationKeyCookie = userIdentificationKeyCookie;
            _resultValue.userIdentificationKeyHeaders = userIdentificationKeyHeaders;
            _resultValue.userIdentificationKeyParams = userIdentificationKeyParams;
            _resultValue.userIdentificationTitle = userIdentificationTitle;
            _resultValue.uuid = uuid;
            _resultValue.waitingRoomCacheTtl = waitingRoomCacheTtl;
            _resultValue.waitingRoomCookieAdvanced = waitingRoomCookieAdvanced;
            _resultValue.waitingRoomCookieAutomaticSalt = waitingRoomCookieAutomaticSalt;
            _resultValue.waitingRoomCookieDomain = waitingRoomCookieDomain;
            _resultValue.waitingRoomCookieDomainType = waitingRoomCookieDomainType;
            _resultValue.waitingRoomCookieDuration = waitingRoomCookieDuration;
            _resultValue.waitingRoomCookieEnabled = waitingRoomCookieEnabled;
            _resultValue.waitingRoomCookieHttpOnly = waitingRoomCookieHttpOnly;
            _resultValue.waitingRoomCookieLabel = waitingRoomCookieLabel;
            _resultValue.waitingRoomCookieManagementTitle = waitingRoomCookieManagementTitle;
            _resultValue.waitingRoomCookieSalt = waitingRoomCookieSalt;
            _resultValue.waitingRoomCookieShareLabel = waitingRoomCookieShareLabel;
            _resultValue.waitingRoomCpCode = waitingRoomCpCode;
            _resultValue.waitingRoomDirectory = waitingRoomDirectory;
            _resultValue.waitingRoomManagementTitle = waitingRoomManagementTitle;
            _resultValue.waitingRoomNetStorage = waitingRoomNetStorage;
            _resultValue.waitingRoomStatusCode = waitingRoomStatusCode;
            _resultValue.waitingRoomUseCpCode = waitingRoomUseCpCode;
            return _resultValue;
        }
    }
}
