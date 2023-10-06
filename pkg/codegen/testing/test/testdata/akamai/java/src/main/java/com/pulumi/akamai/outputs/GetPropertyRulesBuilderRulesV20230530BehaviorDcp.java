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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorDcp {
    private @Nullable Boolean anonymous;
    private @Nullable Boolean enabled;
    private @Nullable Boolean gwenabled;
    private @Nullable Boolean locked;
    private @Nullable String namespaceId;
    private @Nullable String templateUuid;
    private @Nullable Boolean tlsenabled;
    private @Nullable String uuid;
    private @Nullable Boolean wsenabled;

    private GetPropertyRulesBuilderRulesV20230530BehaviorDcp() {}
    public Optional<Boolean> anonymous() {
        return Optional.ofNullable(this.anonymous);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Boolean> gwenabled() {
        return Optional.ofNullable(this.gwenabled);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<Boolean> tlsenabled() {
        return Optional.ofNullable(this.tlsenabled);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }
    public Optional<Boolean> wsenabled() {
        return Optional.ofNullable(this.wsenabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorDcp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean anonymous;
        private @Nullable Boolean enabled;
        private @Nullable Boolean gwenabled;
        private @Nullable Boolean locked;
        private @Nullable String namespaceId;
        private @Nullable String templateUuid;
        private @Nullable Boolean tlsenabled;
        private @Nullable String uuid;
        private @Nullable Boolean wsenabled;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorDcp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anonymous = defaults.anonymous;
    	      this.enabled = defaults.enabled;
    	      this.gwenabled = defaults.gwenabled;
    	      this.locked = defaults.locked;
    	      this.namespaceId = defaults.namespaceId;
    	      this.templateUuid = defaults.templateUuid;
    	      this.tlsenabled = defaults.tlsenabled;
    	      this.uuid = defaults.uuid;
    	      this.wsenabled = defaults.wsenabled;
        }

        @CustomType.Setter
        public Builder anonymous(@Nullable Boolean anonymous) {

            this.anonymous = anonymous;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder gwenabled(@Nullable Boolean gwenabled) {

            this.gwenabled = gwenabled;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceId(@Nullable String namespaceId) {

            this.namespaceId = namespaceId;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder tlsenabled(@Nullable Boolean tlsenabled) {

            this.tlsenabled = tlsenabled;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        @CustomType.Setter
        public Builder wsenabled(@Nullable Boolean wsenabled) {

            this.wsenabled = wsenabled;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorDcp build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorDcp();
            _resultValue.anonymous = anonymous;
            _resultValue.enabled = enabled;
            _resultValue.gwenabled = gwenabled;
            _resultValue.locked = locked;
            _resultValue.namespaceId = namespaceId;
            _resultValue.templateUuid = templateUuid;
            _resultValue.tlsenabled = tlsenabled;
            _resultValue.uuid = uuid;
            _resultValue.wsenabled = wsenabled;
            return _resultValue;
        }
    }
}
