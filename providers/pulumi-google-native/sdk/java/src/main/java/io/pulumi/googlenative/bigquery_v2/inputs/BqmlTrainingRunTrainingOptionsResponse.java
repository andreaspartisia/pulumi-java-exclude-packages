// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
 * 
 */
public final class BqmlTrainingRunTrainingOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final BqmlTrainingRunTrainingOptionsResponse Empty = new BqmlTrainingRunTrainingOptionsResponse();

    @Import(name="earlyStop", required=true)
      private final Boolean earlyStop;

    public Boolean earlyStop() {
        return this.earlyStop;
    }

    @Import(name="l1Reg", required=true)
      private final Double l1Reg;

    public Double l1Reg() {
        return this.l1Reg;
    }

    @Import(name="l2Reg", required=true)
      private final Double l2Reg;

    public Double l2Reg() {
        return this.l2Reg;
    }

    @Import(name="learnRate", required=true)
      private final Double learnRate;

    public Double learnRate() {
        return this.learnRate;
    }

    @Import(name="learnRateStrategy", required=true)
      private final String learnRateStrategy;

    public String learnRateStrategy() {
        return this.learnRateStrategy;
    }

    @Import(name="lineSearchInitLearnRate", required=true)
      private final Double lineSearchInitLearnRate;

    public Double lineSearchInitLearnRate() {
        return this.lineSearchInitLearnRate;
    }

    @Import(name="maxIteration", required=true)
      private final String maxIteration;

    public String maxIteration() {
        return this.maxIteration;
    }

    @Import(name="minRelProgress", required=true)
      private final Double minRelProgress;

    public Double minRelProgress() {
        return this.minRelProgress;
    }

    @Import(name="warmStart", required=true)
      private final Boolean warmStart;

    public Boolean warmStart() {
        return this.warmStart;
    }

    public BqmlTrainingRunTrainingOptionsResponse(
        Boolean earlyStop,
        Double l1Reg,
        Double l2Reg,
        Double learnRate,
        String learnRateStrategy,
        Double lineSearchInitLearnRate,
        String maxIteration,
        Double minRelProgress,
        Boolean warmStart) {
        this.earlyStop = Objects.requireNonNull(earlyStop, "expected parameter 'earlyStop' to be non-null");
        this.l1Reg = Objects.requireNonNull(l1Reg, "expected parameter 'l1Reg' to be non-null");
        this.l2Reg = Objects.requireNonNull(l2Reg, "expected parameter 'l2Reg' to be non-null");
        this.learnRate = Objects.requireNonNull(learnRate, "expected parameter 'learnRate' to be non-null");
        this.learnRateStrategy = Objects.requireNonNull(learnRateStrategy, "expected parameter 'learnRateStrategy' to be non-null");
        this.lineSearchInitLearnRate = Objects.requireNonNull(lineSearchInitLearnRate, "expected parameter 'lineSearchInitLearnRate' to be non-null");
        this.maxIteration = Objects.requireNonNull(maxIteration, "expected parameter 'maxIteration' to be non-null");
        this.minRelProgress = Objects.requireNonNull(minRelProgress, "expected parameter 'minRelProgress' to be non-null");
        this.warmStart = Objects.requireNonNull(warmStart, "expected parameter 'warmStart' to be non-null");
    }

    private BqmlTrainingRunTrainingOptionsResponse() {
        this.earlyStop = null;
        this.l1Reg = null;
        this.l2Reg = null;
        this.learnRate = null;
        this.learnRateStrategy = null;
        this.lineSearchInitLearnRate = null;
        this.maxIteration = null;
        this.minRelProgress = null;
        this.warmStart = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BqmlTrainingRunTrainingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean earlyStop;
        private Double l1Reg;
        private Double l2Reg;
        private Double learnRate;
        private String learnRateStrategy;
        private Double lineSearchInitLearnRate;
        private String maxIteration;
        private Double minRelProgress;
        private Boolean warmStart;

        public Builder() {
    	      // Empty
        }

        public Builder(BqmlTrainingRunTrainingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.earlyStop = defaults.earlyStop;
    	      this.l1Reg = defaults.l1Reg;
    	      this.l2Reg = defaults.l2Reg;
    	      this.learnRate = defaults.learnRate;
    	      this.learnRateStrategy = defaults.learnRateStrategy;
    	      this.lineSearchInitLearnRate = defaults.lineSearchInitLearnRate;
    	      this.maxIteration = defaults.maxIteration;
    	      this.minRelProgress = defaults.minRelProgress;
    	      this.warmStart = defaults.warmStart;
        }

        public Builder earlyStop(Boolean earlyStop) {
            this.earlyStop = Objects.requireNonNull(earlyStop);
            return this;
        }
        public Builder l1Reg(Double l1Reg) {
            this.l1Reg = Objects.requireNonNull(l1Reg);
            return this;
        }
        public Builder l2Reg(Double l2Reg) {
            this.l2Reg = Objects.requireNonNull(l2Reg);
            return this;
        }
        public Builder learnRate(Double learnRate) {
            this.learnRate = Objects.requireNonNull(learnRate);
            return this;
        }
        public Builder learnRateStrategy(String learnRateStrategy) {
            this.learnRateStrategy = Objects.requireNonNull(learnRateStrategy);
            return this;
        }
        public Builder lineSearchInitLearnRate(Double lineSearchInitLearnRate) {
            this.lineSearchInitLearnRate = Objects.requireNonNull(lineSearchInitLearnRate);
            return this;
        }
        public Builder maxIteration(String maxIteration) {
            this.maxIteration = Objects.requireNonNull(maxIteration);
            return this;
        }
        public Builder minRelProgress(Double minRelProgress) {
            this.minRelProgress = Objects.requireNonNull(minRelProgress);
            return this;
        }
        public Builder warmStart(Boolean warmStart) {
            this.warmStart = Objects.requireNonNull(warmStart);
            return this;
        }        public BqmlTrainingRunTrainingOptionsResponse build() {
            return new BqmlTrainingRunTrainingOptionsResponse(earlyStop, l1Reg, l2Reg, learnRate, learnRateStrategy, lineSearchInitLearnRate, maxIteration, minRelProgress, warmStart);
        }
    }
}
