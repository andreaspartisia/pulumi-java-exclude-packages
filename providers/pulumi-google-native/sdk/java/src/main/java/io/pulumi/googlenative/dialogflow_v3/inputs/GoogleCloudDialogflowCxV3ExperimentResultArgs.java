// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The inference result which includes an objective metric to optimize and the confidence interval.
 * 
 */
public final class GoogleCloudDialogflowCxV3ExperimentResultArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ExperimentResultArgs Empty = new GoogleCloudDialogflowCxV3ExperimentResultArgs();

    /**
     * The last time the experiment's stats data was updated. Will have default value if stats have never been computed for this experiment.
     * 
     */
    @Import(name="lastUpdateTime")
      private final @Nullable Output<String> lastUpdateTime;

    public Output<String> lastUpdateTime() {
        return this.lastUpdateTime == null ? Codegen.empty() : this.lastUpdateTime;
    }

    /**
     * Version variants and metrics.
     * 
     */
    @Import(name="versionMetrics")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs>> versionMetrics;

    public Output<List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs>> versionMetrics() {
        return this.versionMetrics == null ? Codegen.empty() : this.versionMetrics;
    }

    public GoogleCloudDialogflowCxV3ExperimentResultArgs(
        @Nullable Output<String> lastUpdateTime,
        @Nullable Output<List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs>> versionMetrics) {
        this.lastUpdateTime = lastUpdateTime;
        this.versionMetrics = versionMetrics;
    }

    private GoogleCloudDialogflowCxV3ExperimentResultArgs() {
        this.lastUpdateTime = Codegen.empty();
        this.versionMetrics = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> lastUpdateTime;
        private @Nullable Output<List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs>> versionMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ExperimentResultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.versionMetrics = defaults.versionMetrics;
        }

        public Builder lastUpdateTime(@Nullable Output<String> lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public Builder lastUpdateTime(@Nullable String lastUpdateTime) {
            this.lastUpdateTime = Codegen.ofNullable(lastUpdateTime);
            return this;
        }
        public Builder versionMetrics(@Nullable Output<List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs>> versionMetrics) {
            this.versionMetrics = versionMetrics;
            return this;
        }
        public Builder versionMetrics(@Nullable List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs> versionMetrics) {
            this.versionMetrics = Codegen.ofNullable(versionMetrics);
            return this;
        }
        public Builder versionMetrics(GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsArgs... versionMetrics) {
            return versionMetrics(List.of(versionMetrics));
        }        public GoogleCloudDialogflowCxV3ExperimentResultArgs build() {
            return new GoogleCloudDialogflowCxV3ExperimentResultArgs(lastUpdateTime, versionMetrics);
        }
    }
}
