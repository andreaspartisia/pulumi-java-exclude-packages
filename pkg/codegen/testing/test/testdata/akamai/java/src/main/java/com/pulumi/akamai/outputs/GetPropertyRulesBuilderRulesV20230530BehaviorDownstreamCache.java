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
public final class GetPropertyRulesBuilderRulesV20230530BehaviorDownstreamCache {
    private @Nullable String allowBehavior;
    private @Nullable String behavior;
    private @Nullable Boolean locked;
    private @Nullable String sendHeaders;
    private @Nullable Boolean sendPrivate;
    private @Nullable String templateUuid;
    private @Nullable String ttl;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230530BehaviorDownstreamCache() {}
    public Optional<String> allowBehavior() {
        return Optional.ofNullable(this.allowBehavior);
    }
    public Optional<String> behavior() {
        return Optional.ofNullable(this.behavior);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> sendHeaders() {
        return Optional.ofNullable(this.sendHeaders);
    }
    public Optional<Boolean> sendPrivate() {
        return Optional.ofNullable(this.sendPrivate);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> ttl() {
        return Optional.ofNullable(this.ttl);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorDownstreamCache defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String allowBehavior;
        private @Nullable String behavior;
        private @Nullable Boolean locked;
        private @Nullable String sendHeaders;
        private @Nullable Boolean sendPrivate;
        private @Nullable String templateUuid;
        private @Nullable String ttl;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorDownstreamCache defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowBehavior = defaults.allowBehavior;
    	      this.behavior = defaults.behavior;
    	      this.locked = defaults.locked;
    	      this.sendHeaders = defaults.sendHeaders;
    	      this.sendPrivate = defaults.sendPrivate;
    	      this.templateUuid = defaults.templateUuid;
    	      this.ttl = defaults.ttl;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder allowBehavior(@Nullable String allowBehavior) {

            this.allowBehavior = allowBehavior;
            return this;
        }
        @CustomType.Setter
        public Builder behavior(@Nullable String behavior) {

            this.behavior = behavior;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder sendHeaders(@Nullable String sendHeaders) {

            this.sendHeaders = sendHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder sendPrivate(@Nullable Boolean sendPrivate) {

            this.sendPrivate = sendPrivate;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {

            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder ttl(@Nullable String ttl) {

            this.ttl = ttl;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {

            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230530BehaviorDownstreamCache build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230530BehaviorDownstreamCache();
            _resultValue.allowBehavior = allowBehavior;
            _resultValue.behavior = behavior;
            _resultValue.locked = locked;
            _resultValue.sendHeaders = sendHeaders;
            _resultValue.sendPrivate = sendPrivate;
            _resultValue.templateUuid = templateUuid;
            _resultValue.ttl = ttl;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
