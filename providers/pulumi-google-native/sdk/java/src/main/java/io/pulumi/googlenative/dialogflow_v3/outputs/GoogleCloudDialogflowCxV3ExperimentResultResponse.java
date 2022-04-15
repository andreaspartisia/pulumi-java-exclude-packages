// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ExperimentResultResponse {
    /**
     * The last time the experiment's stats data was updated. Will have default value if stats have never been computed for this experiment.
     * 
     */
    private final String lastUpdateTime;
    /**
     * Version variants and metrics.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse> versionMetrics;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3ExperimentResultResponse(
        @CustomType.Parameter("lastUpdateTime") String lastUpdateTime,
        @CustomType.Parameter("versionMetrics") List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse> versionMetrics) {
        this.lastUpdateTime = lastUpdateTime;
        this.versionMetrics = versionMetrics;
    }

    /**
     * The last time the experiment's stats data was updated. Will have default value if stats have never been computed for this experiment.
     * 
    */
    public String lastUpdateTime() {
        return this.lastUpdateTime;
    }
    /**
     * Version variants and metrics.
     * 
    */
    public List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse> versionMetrics() {
        return this.versionMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastUpdateTime;
        private List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse> versionMetrics;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ExperimentResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdateTime = defaults.lastUpdateTime;
    	      this.versionMetrics = defaults.versionMetrics;
        }

        public Builder lastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = Objects.requireNonNull(lastUpdateTime);
            return this;
        }
        public Builder versionMetrics(List<GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse> versionMetrics) {
            this.versionMetrics = Objects.requireNonNull(versionMetrics);
            return this;
        }
        public Builder versionMetrics(GoogleCloudDialogflowCxV3ExperimentResultVersionMetricsResponse... versionMetrics) {
            return versionMetrics(List.of(versionMetrics));
        }        public GoogleCloudDialogflowCxV3ExperimentResultResponse build() {
            return new GoogleCloudDialogflowCxV3ExperimentResultResponse(lastUpdateTime, versionMetrics);
        }
    }
}
