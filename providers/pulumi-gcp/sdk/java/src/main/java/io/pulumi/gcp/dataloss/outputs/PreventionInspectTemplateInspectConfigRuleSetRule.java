// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule;
import io.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRule;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionInspectTemplateInspectConfigRuleSetRule {
    /**
     * The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule exclusionRule;
    /**
     * Hotword-based detection rule.
     * Structure is documented below.
     * 
     */
    private final @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRule hotwordRule;

    @OutputCustomType.Constructor
    private PreventionInspectTemplateInspectConfigRuleSetRule(
        @OutputCustomType.Parameter("exclusionRule") @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule exclusionRule,
        @OutputCustomType.Parameter("hotwordRule") @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRule hotwordRule) {
        this.exclusionRule = exclusionRule;
        this.hotwordRule = hotwordRule;
    }

    /**
     * The rule that specifies conditions when findings of infoTypes specified in InspectionRuleSet are removed from results.
     * Structure is documented below.
     * 
    */
    public Optional<PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule> getExclusionRule() {
        return Optional.ofNullable(this.exclusionRule);
    }
    /**
     * Hotword-based detection rule.
     * Structure is documented below.
     * 
    */
    public Optional<PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRule> getHotwordRule() {
        return Optional.ofNullable(this.hotwordRule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule exclusionRule;
        private @Nullable PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRule hotwordRule;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusionRule = defaults.exclusionRule;
    	      this.hotwordRule = defaults.hotwordRule;
        }

        public Builder setExclusionRule(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRule exclusionRule) {
            this.exclusionRule = exclusionRule;
            return this;
        }

        public Builder setHotwordRule(@Nullable PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRule hotwordRule) {
            this.hotwordRule = hotwordRule;
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRule build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRule(exclusionRule, hotwordRule);
        }
    }
}
