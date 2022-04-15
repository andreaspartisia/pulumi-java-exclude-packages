// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BigQueryModelTrainingResponse extends io.pulumi.resources.InvokeArgs {

    public static final BigQueryModelTrainingResponse Empty = new BigQueryModelTrainingResponse();

    /**
     * [Output-only, Beta] Index of current ML training iteration. Updated during create model query job to show job progress.
     * 
     */
    @Import(name="currentIteration", required=true)
      private final Integer currentIteration;

    public Integer currentIteration() {
        return this.currentIteration;
    }

    /**
     * [Output-only, Beta] Expected number of iterations for the create model query job specified as num_iterations in the input query. The actual total number of iterations may be less than this number due to early stop.
     * 
     */
    @Import(name="expectedTotalIterations", required=true)
      private final String expectedTotalIterations;

    public String expectedTotalIterations() {
        return this.expectedTotalIterations;
    }

    public BigQueryModelTrainingResponse(
        Integer currentIteration,
        String expectedTotalIterations) {
        this.currentIteration = Objects.requireNonNull(currentIteration, "expected parameter 'currentIteration' to be non-null");
        this.expectedTotalIterations = Objects.requireNonNull(expectedTotalIterations, "expected parameter 'expectedTotalIterations' to be non-null");
    }

    private BigQueryModelTrainingResponse() {
        this.currentIteration = null;
        this.expectedTotalIterations = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryModelTrainingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer currentIteration;
        private String expectedTotalIterations;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryModelTrainingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentIteration = defaults.currentIteration;
    	      this.expectedTotalIterations = defaults.expectedTotalIterations;
        }

        public Builder currentIteration(Integer currentIteration) {
            this.currentIteration = Objects.requireNonNull(currentIteration);
            return this;
        }
        public Builder expectedTotalIterations(String expectedTotalIterations) {
            this.expectedTotalIterations = Objects.requireNonNull(expectedTotalIterations);
            return this;
        }        public BigQueryModelTrainingResponse build() {
            return new BigQueryModelTrainingResponse(currentIteration, expectedTotalIterations);
        }
    }
}
