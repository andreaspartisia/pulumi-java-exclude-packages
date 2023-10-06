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
public final class GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingOrigin {
    private @Nullable String cookieName;
    private @Nullable String description;
    private @Nullable Boolean enableSessionPersistence;
    private @Nullable String hostname;
    private @Nullable String id;
    private @Nullable Boolean locked;
    private @Nullable String sessionPersistenceTitle;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingOrigin() {}
    public Optional<String> cookieName() {
        return Optional.ofNullable(this.cookieName);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Boolean> enableSessionPersistence() {
        return Optional.ofNullable(this.enableSessionPersistence);
    }
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> sessionPersistenceTitle() {
        return Optional.ofNullable(this.sessionPersistenceTitle);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingOrigin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cookieName;
        private @Nullable String description;
        private @Nullable Boolean enableSessionPersistence;
        private @Nullable String hostname;
        private @Nullable String id;
        private @Nullable Boolean locked;
        private @Nullable String sessionPersistenceTitle;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieName = defaults.cookieName;
    	      this.description = defaults.description;
    	      this.enableSessionPersistence = defaults.enableSessionPersistence;
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.locked = defaults.locked;
    	      this.sessionPersistenceTitle = defaults.sessionPersistenceTitle;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder cookieName(@Nullable String cookieName) {

            this.cookieName = cookieName;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enableSessionPersistence(@Nullable Boolean enableSessionPersistence) {

            this.enableSessionPersistence = enableSessionPersistence;
            return this;
        }
        @CustomType.Setter
        public Builder hostname(@Nullable String hostname) {

            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {

            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder sessionPersistenceTitle(@Nullable String sessionPersistenceTitle) {

            this.sessionPersistenceTitle = sessionPersistenceTitle;
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
        public GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingOrigin build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorEdgeLoadBalancingOrigin();
            _resultValue.cookieName = cookieName;
            _resultValue.description = description;
            _resultValue.enableSessionPersistence = enableSessionPersistence;
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.locked = locked;
            _resultValue.sessionPersistenceTitle = sessionPersistenceTitle;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
