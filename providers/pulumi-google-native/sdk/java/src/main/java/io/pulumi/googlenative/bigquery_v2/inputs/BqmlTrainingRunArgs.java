// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.bigquery_v2.inputs.BqmlIterationResultArgs;
import io.pulumi.googlenative.bigquery_v2.inputs.BqmlTrainingRunTrainingOptionsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BqmlTrainingRunArgs extends io.pulumi.resources.ResourceArgs {

    public static final BqmlTrainingRunArgs Empty = new BqmlTrainingRunArgs();

    /**
     * [Output-only, Beta] List of each iteration results.
     * 
     */
    @Import(name="iterationResults")
      private final @Nullable Output<List<BqmlIterationResultArgs>> iterationResults;

    public Output<List<BqmlIterationResultArgs>> iterationResults() {
        return this.iterationResults == null ? Codegen.empty() : this.iterationResults;
    }

    /**
     * [Output-only, Beta] Training run start time in milliseconds since the epoch.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    /**
     * [Output-only, Beta] Different state applicable for a training run. IN PROGRESS: Training run is in progress. FAILED: Training run ended due to a non-retryable failure. SUCCEEDED: Training run successfully completed. CANCELLED: Training run cancelled by the user.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
     * 
     */
    @Import(name="trainingOptions")
      private final @Nullable Output<BqmlTrainingRunTrainingOptionsArgs> trainingOptions;

    public Output<BqmlTrainingRunTrainingOptionsArgs> trainingOptions() {
        return this.trainingOptions == null ? Codegen.empty() : this.trainingOptions;
    }

    public BqmlTrainingRunArgs(
        @Nullable Output<List<BqmlIterationResultArgs>> iterationResults,
        @Nullable Output<String> startTime,
        @Nullable Output<String> state,
        @Nullable Output<BqmlTrainingRunTrainingOptionsArgs> trainingOptions) {
        this.iterationResults = iterationResults;
        this.startTime = startTime;
        this.state = state;
        this.trainingOptions = trainingOptions;
    }

    private BqmlTrainingRunArgs() {
        this.iterationResults = Codegen.empty();
        this.startTime = Codegen.empty();
        this.state = Codegen.empty();
        this.trainingOptions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BqmlTrainingRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BqmlIterationResultArgs>> iterationResults;
        private @Nullable Output<String> startTime;
        private @Nullable Output<String> state;
        private @Nullable Output<BqmlTrainingRunTrainingOptionsArgs> trainingOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(BqmlTrainingRunArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iterationResults = defaults.iterationResults;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.trainingOptions = defaults.trainingOptions;
        }

        public Builder iterationResults(@Nullable Output<List<BqmlIterationResultArgs>> iterationResults) {
            this.iterationResults = iterationResults;
            return this;
        }
        public Builder iterationResults(@Nullable List<BqmlIterationResultArgs> iterationResults) {
            this.iterationResults = Codegen.ofNullable(iterationResults);
            return this;
        }
        public Builder iterationResults(BqmlIterationResultArgs... iterationResults) {
            return iterationResults(List.of(iterationResults));
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder trainingOptions(@Nullable Output<BqmlTrainingRunTrainingOptionsArgs> trainingOptions) {
            this.trainingOptions = trainingOptions;
            return this;
        }
        public Builder trainingOptions(@Nullable BqmlTrainingRunTrainingOptionsArgs trainingOptions) {
            this.trainingOptions = Codegen.ofNullable(trainingOptions);
            return this;
        }        public BqmlTrainingRunArgs build() {
            return new BqmlTrainingRunArgs(iterationResults, startTime, state, trainingOptions);
        }
    }
}
