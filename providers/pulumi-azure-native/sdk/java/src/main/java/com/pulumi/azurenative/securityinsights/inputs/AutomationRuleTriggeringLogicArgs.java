// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.azurenative.securityinsights.enums.TriggersOn;
import com.pulumi.azurenative.securityinsights.enums.TriggersWhen;
import com.pulumi.azurenative.securityinsights.inputs.AutomationRulePropertyValuesConditionArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes automation rule triggering logic
 * 
 */
public final class AutomationRuleTriggeringLogicArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomationRuleTriggeringLogicArgs Empty = new AutomationRuleTriggeringLogicArgs();

    /**
     * The conditions to evaluate to determine if the automation rule should be triggered on a given object
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<AutomationRulePropertyValuesConditionArgs>> conditions;

    public Optional<Output<List<AutomationRulePropertyValuesConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Determines when the automation rule should automatically expire and be disabled.
     * 
     */
    @Import(name="expirationTimeUtc")
    private @Nullable Output<String> expirationTimeUtc;

    public Optional<Output<String>> expirationTimeUtc() {
        return Optional.ofNullable(this.expirationTimeUtc);
    }

    /**
     * Determines whether the automation rule is enabled or disabled.
     * 
     */
    @Import(name="isEnabled", required=true)
    private Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled;
    }

    /**
     * The type of object the automation rule triggers on
     * 
     */
    @Import(name="triggersOn", required=true)
    private Output<Either<String,TriggersOn>> triggersOn;

    public Output<Either<String,TriggersOn>> triggersOn() {
        return this.triggersOn;
    }

    /**
     * The type of event the automation rule triggers on
     * 
     */
    @Import(name="triggersWhen", required=true)
    private Output<Either<String,TriggersWhen>> triggersWhen;

    public Output<Either<String,TriggersWhen>> triggersWhen() {
        return this.triggersWhen;
    }

    private AutomationRuleTriggeringLogicArgs() {}

    private AutomationRuleTriggeringLogicArgs(AutomationRuleTriggeringLogicArgs $) {
        this.conditions = $.conditions;
        this.expirationTimeUtc = $.expirationTimeUtc;
        this.isEnabled = $.isEnabled;
        this.triggersOn = $.triggersOn;
        this.triggersWhen = $.triggersWhen;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomationRuleTriggeringLogicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomationRuleTriggeringLogicArgs $;

        public Builder() {
            $ = new AutomationRuleTriggeringLogicArgs();
        }

        public Builder(AutomationRuleTriggeringLogicArgs defaults) {
            $ = new AutomationRuleTriggeringLogicArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable Output<List<AutomationRulePropertyValuesConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<AutomationRulePropertyValuesConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(AutomationRulePropertyValuesConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder expirationTimeUtc(@Nullable Output<String> expirationTimeUtc) {
            $.expirationTimeUtc = expirationTimeUtc;
            return this;
        }

        public Builder expirationTimeUtc(String expirationTimeUtc) {
            return expirationTimeUtc(Output.of(expirationTimeUtc));
        }

        public Builder isEnabled(Output<Boolean> isEnabled) {
            $.isEnabled = isEnabled;
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            return isEnabled(Output.of(isEnabled));
        }

        public Builder triggersOn(Output<Either<String,TriggersOn>> triggersOn) {
            $.triggersOn = triggersOn;
            return this;
        }

        public Builder triggersOn(Either<String,TriggersOn> triggersOn) {
            return triggersOn(Output.of(triggersOn));
        }

        public Builder triggersOn(String triggersOn) {
            return triggersOn(Either.ofLeft(triggersOn));
        }

        public Builder triggersOn(TriggersOn triggersOn) {
            return triggersOn(Either.ofRight(triggersOn));
        }

        public Builder triggersWhen(Output<Either<String,TriggersWhen>> triggersWhen) {
            $.triggersWhen = triggersWhen;
            return this;
        }

        public Builder triggersWhen(Either<String,TriggersWhen> triggersWhen) {
            return triggersWhen(Output.of(triggersWhen));
        }

        public Builder triggersWhen(String triggersWhen) {
            return triggersWhen(Either.ofLeft(triggersWhen));
        }

        public Builder triggersWhen(TriggersWhen triggersWhen) {
            return triggersWhen(Either.ofRight(triggersWhen));
        }

        public AutomationRuleTriggeringLogicArgs build() {
            $.isEnabled = Objects.requireNonNull($.isEnabled, "expected parameter 'isEnabled' to be non-null");
            $.triggersOn = Objects.requireNonNull($.triggersOn, "expected parameter 'triggersOn' to be non-null");
            $.triggersWhen = Objects.requireNonNull($.triggersWhen, "expected parameter 'triggersWhen' to be non-null");
            return $;
        }
    }

}
