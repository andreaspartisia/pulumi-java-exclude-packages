// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustment {
    /**
     * Set the likelihood of a finding to a fixed value. Either this or relative_likelihood can be set.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
     */
    private final @Nullable String fixedLikelihood;
    /**
     * Increase or decrease the likelihood by the specified number of levels. For example,
     * if a finding would be POSSIBLE without the detection rule and relativeLikelihood is 1,
     * then it is upgraded to LIKELY, while a value of -1 would downgrade it to UNLIKELY.
     * Likelihood may never drop below VERY_UNLIKELY or exceed VERY_LIKELY, so applying an
     * adjustment of 1 followed by an adjustment of -1 when base likelihood is VERY_LIKELY
     * will result in a final likelihood of LIKELY. Either this or fixed_likelihood can be set.
     * 
     */
    private final @Nullable Integer relativeLikelihood;

    @OutputCustomType.Constructor({"fixedLikelihood","relativeLikelihood"})
    private PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustment(
        @Nullable String fixedLikelihood,
        @Nullable Integer relativeLikelihood) {
        this.fixedLikelihood = fixedLikelihood;
        this.relativeLikelihood = relativeLikelihood;
    }

    /**
     * Set the likelihood of a finding to a fixed value. Either this or relative_likelihood can be set.
     * Possible values are `VERY_UNLIKELY`, `UNLIKELY`, `POSSIBLE`, `LIKELY`, and `VERY_LIKELY`.
     * 
     */
    public Optional<String> getFixedLikelihood() {
        return Optional.ofNullable(this.fixedLikelihood);
    }
    /**
     * Increase or decrease the likelihood by the specified number of levels. For example,
     * if a finding would be POSSIBLE without the detection rule and relativeLikelihood is 1,
     * then it is upgraded to LIKELY, while a value of -1 would downgrade it to UNLIKELY.
     * Likelihood may never drop below VERY_UNLIKELY or exceed VERY_LIKELY, so applying an
     * adjustment of 1 followed by an adjustment of -1 when base likelihood is VERY_LIKELY
     * will result in a final likelihood of LIKELY. Either this or fixed_likelihood can be set.
     * 
     */
    public Optional<Integer> getRelativeLikelihood() {
        return Optional.ofNullable(this.relativeLikelihood);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fixedLikelihood;
        private @Nullable Integer relativeLikelihood;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedLikelihood = defaults.fixedLikelihood;
    	      this.relativeLikelihood = defaults.relativeLikelihood;
        }

        public Builder setFixedLikelihood(@Nullable String fixedLikelihood) {
            this.fixedLikelihood = fixedLikelihood;
            return this;
        }

        public Builder setRelativeLikelihood(@Nullable Integer relativeLikelihood) {
            this.relativeLikelihood = relativeLikelihood;
            return this;
        }

        public PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustment build() {
            return new PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustment(fixedLikelihood, relativeLikelihood);
        }
    }
}