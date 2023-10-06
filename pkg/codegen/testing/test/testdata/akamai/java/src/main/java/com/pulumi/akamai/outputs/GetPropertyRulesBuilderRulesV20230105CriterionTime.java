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
public final class GetPropertyRulesBuilderRulesV20230105CriterionTime {
    private @Nullable Boolean applyDaylightSavingsTime;
    private @Nullable String beginDate;
    private @Nullable String endDate;
    private @Nullable String lastingDate;
    private @Nullable String lastingDuration;
    private @Nullable Boolean locked;
    private @Nullable String matchOperator;
    private @Nullable String repeatBeginDate;
    private @Nullable String repeatDuration;
    private @Nullable String repeatInterval;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105CriterionTime() {}
    public Optional<Boolean> applyDaylightSavingsTime() {
        return Optional.ofNullable(this.applyDaylightSavingsTime);
    }
    public Optional<String> beginDate() {
        return Optional.ofNullable(this.beginDate);
    }
    public Optional<String> endDate() {
        return Optional.ofNullable(this.endDate);
    }
    public Optional<String> lastingDate() {
        return Optional.ofNullable(this.lastingDate);
    }
    public Optional<String> lastingDuration() {
        return Optional.ofNullable(this.lastingDuration);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> matchOperator() {
        return Optional.ofNullable(this.matchOperator);
    }
    public Optional<String> repeatBeginDate() {
        return Optional.ofNullable(this.repeatBeginDate);
    }
    public Optional<String> repeatDuration() {
        return Optional.ofNullable(this.repeatDuration);
    }
    public Optional<String> repeatInterval() {
        return Optional.ofNullable(this.repeatInterval);
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

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105CriterionTime defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean applyDaylightSavingsTime;
        private @Nullable String beginDate;
        private @Nullable String endDate;
        private @Nullable String lastingDate;
        private @Nullable String lastingDuration;
        private @Nullable Boolean locked;
        private @Nullable String matchOperator;
        private @Nullable String repeatBeginDate;
        private @Nullable String repeatDuration;
        private @Nullable String repeatInterval;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105CriterionTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyDaylightSavingsTime = defaults.applyDaylightSavingsTime;
    	      this.beginDate = defaults.beginDate;
    	      this.endDate = defaults.endDate;
    	      this.lastingDate = defaults.lastingDate;
    	      this.lastingDuration = defaults.lastingDuration;
    	      this.locked = defaults.locked;
    	      this.matchOperator = defaults.matchOperator;
    	      this.repeatBeginDate = defaults.repeatBeginDate;
    	      this.repeatDuration = defaults.repeatDuration;
    	      this.repeatInterval = defaults.repeatInterval;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder applyDaylightSavingsTime(@Nullable Boolean applyDaylightSavingsTime) {

            this.applyDaylightSavingsTime = applyDaylightSavingsTime;
            return this;
        }
        @CustomType.Setter
        public Builder beginDate(@Nullable String beginDate) {

            this.beginDate = beginDate;
            return this;
        }
        @CustomType.Setter
        public Builder endDate(@Nullable String endDate) {

            this.endDate = endDate;
            return this;
        }
        @CustomType.Setter
        public Builder lastingDate(@Nullable String lastingDate) {

            this.lastingDate = lastingDate;
            return this;
        }
        @CustomType.Setter
        public Builder lastingDuration(@Nullable String lastingDuration) {

            this.lastingDuration = lastingDuration;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {

            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder matchOperator(@Nullable String matchOperator) {

            this.matchOperator = matchOperator;
            return this;
        }
        @CustomType.Setter
        public Builder repeatBeginDate(@Nullable String repeatBeginDate) {

            this.repeatBeginDate = repeatBeginDate;
            return this;
        }
        @CustomType.Setter
        public Builder repeatDuration(@Nullable String repeatDuration) {

            this.repeatDuration = repeatDuration;
            return this;
        }
        @CustomType.Setter
        public Builder repeatInterval(@Nullable String repeatInterval) {

            this.repeatInterval = repeatInterval;
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
        public GetPropertyRulesBuilderRulesV20230105CriterionTime build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105CriterionTime();
            _resultValue.applyDaylightSavingsTime = applyDaylightSavingsTime;
            _resultValue.beginDate = beginDate;
            _resultValue.endDate = endDate;
            _resultValue.lastingDate = lastingDate;
            _resultValue.lastingDuration = lastingDuration;
            _resultValue.locked = locked;
            _resultValue.matchOperator = matchOperator;
            _resultValue.repeatBeginDate = repeatBeginDate;
            _resultValue.repeatDuration = repeatDuration;
            _resultValue.repeatInterval = repeatInterval;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}
