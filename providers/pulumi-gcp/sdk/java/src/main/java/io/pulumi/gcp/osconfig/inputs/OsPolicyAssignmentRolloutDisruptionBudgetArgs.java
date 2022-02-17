// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentRolloutDisruptionBudgetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentRolloutDisruptionBudgetArgs Empty = new OsPolicyAssignmentRolloutDisruptionBudgetArgs();

    /**
     * Specifies a fixed value.
     * 
     */
    @InputImport(name="fixed")
    private final @Nullable Input<Integer> fixed;

    public Input<Integer> getFixed() {
        return this.fixed == null ? Input.empty() : this.fixed;
    }

    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    @InputImport(name="percent")
    private final @Nullable Input<Integer> percent;

    public Input<Integer> getPercent() {
        return this.percent == null ? Input.empty() : this.percent;
    }

    public OsPolicyAssignmentRolloutDisruptionBudgetArgs(
        @Nullable Input<Integer> fixed,
        @Nullable Input<Integer> percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    private OsPolicyAssignmentRolloutDisruptionBudgetArgs() {
        this.fixed = Input.empty();
        this.percent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentRolloutDisruptionBudgetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> fixed;
        private @Nullable Input<Integer> percent;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentRolloutDisruptionBudgetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder setFixed(@Nullable Input<Integer> fixed) {
            this.fixed = fixed;
            return this;
        }

        public Builder setFixed(@Nullable Integer fixed) {
            this.fixed = Input.ofNullable(fixed);
            return this;
        }

        public Builder setPercent(@Nullable Input<Integer> percent) {
            this.percent = percent;
            return this;
        }

        public Builder setPercent(@Nullable Integer percent) {
            this.percent = Input.ofNullable(percent);
            return this;
        }

        public OsPolicyAssignmentRolloutDisruptionBudgetArgs build() {
            return new OsPolicyAssignmentRolloutDisruptionBudgetArgs(fixed, percent);
        }
    }
}