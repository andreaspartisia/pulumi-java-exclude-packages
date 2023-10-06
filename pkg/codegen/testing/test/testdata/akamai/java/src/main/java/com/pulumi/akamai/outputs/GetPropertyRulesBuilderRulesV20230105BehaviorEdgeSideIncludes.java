// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludes {
    private @Nullable Boolean detectInjection;
    private @Nullable Boolean enableViaHttp;
    private @Nullable Boolean enabled;
    private @Nullable List<String> i18nCharsets;
    private @Nullable Boolean i18nStatus;
    private @Nullable Boolean locked;
    private @Nullable Boolean passClientIp;
    private @Nullable Boolean passSetCookie;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludes() {}
    public Optional<Boolean> detectInjection() {
        return Optional.ofNullable(this.detectInjection);
    }
    public Optional<Boolean> enableViaHttp() {
        return Optional.ofNullable(this.enableViaHttp);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public List<String> i18nCharsets() {
        return this.i18nCharsets == null ? List.of() : this.i18nCharsets;
    }
    public Optional<Boolean> i18nStatus() {
        return Optional.ofNullable(this.i18nStatus);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<Boolean> passClientIp() {
        return Optional.ofNullable(this.passClientIp);
    }
    public Optional<Boolean> passSetCookie() {
        return Optional.ofNullable(this.passSetCookie);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludes defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean detectInjection;
        private @Nullable Boolean enableViaHttp;
        private @Nullable Boolean enabled;
        private @Nullable List<String> i18nCharsets;
        private @Nullable Boolean i18nStatus;
        private @Nullable Boolean locked;
        private @Nullable Boolean passClientIp;
        private @Nullable Boolean passSetCookie;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detectInjection = defaults.detectInjection;
    	      this.enableViaHttp = defaults.enableViaHttp;
    	      this.enabled = defaults.enabled;
    	      this.i18nCharsets = defaults.i18nCharsets;
    	      this.i18nStatus = defaults.i18nStatus;
    	      this.locked = defaults.locked;
    	      this.passClientIp = defaults.passClientIp;
    	      this.passSetCookie = defaults.passSetCookie;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder detectInjection(@Nullable Boolean detectInjection) {

            this.detectInjection = detectInjection;
            return this;
        }
        @CustomType.Setter
        public Builder enableViaHttp(@Nullable Boolean enableViaHttp) {

            this.enableViaHttp = enableViaHttp;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder i18nCharsets(@Nullable List<String> i18nCharsets) {

            this.i18nCharsets = i18nCharsets;
            return this;
        }
        public Builder i18nCharsets(String... i18nCharsets) {
            return i18nCharsets(List.of(i18nCharsets));
        }
        @CustomType.Setter
        public Builder i18nStatus(@Nullable Boolean i18nStatus) {

            this.i18nStatus = i18nStatus;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder passClientIp(@Nullable Boolean passClientIp) {

            this.passClientIp = passClientIp;
            return this;
        }
        @CustomType.Setter
        public Builder passSetCookie(@Nullable Boolean passSetCookie) {

            this.passSetCookie = passSetCookie;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludes build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorEdgeSideIncludes();
            _resultValue.detectInjection = detectInjection;
            _resultValue.enableViaHttp = enableViaHttp;
            _resultValue.enabled = enabled;
            _resultValue.i18nCharsets = i18nCharsets;
            _resultValue.i18nStatus = i18nStatus;
            _resultValue.locked = locked;
            _resultValue.passClientIp = passClientIp;
            _resultValue.passSetCookie = passSetCookie;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
