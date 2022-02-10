// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2ActionResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2BigQueryTableResponse;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2PrivacyMetricResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2RiskAnalysisJobConfigResponse {
    private final List<GooglePrivacyDlpV2ActionResponse> actions;
    private final GooglePrivacyDlpV2PrivacyMetricResponse privacyMetric;
    private final GooglePrivacyDlpV2BigQueryTableResponse sourceTable;

    @OutputCustomType.Constructor({"actions","privacyMetric","sourceTable"})
    private GooglePrivacyDlpV2RiskAnalysisJobConfigResponse(
        List<GooglePrivacyDlpV2ActionResponse> actions,
        GooglePrivacyDlpV2PrivacyMetricResponse privacyMetric,
        GooglePrivacyDlpV2BigQueryTableResponse sourceTable) {
        this.actions = Objects.requireNonNull(actions);
        this.privacyMetric = Objects.requireNonNull(privacyMetric);
        this.sourceTable = Objects.requireNonNull(sourceTable);
    }

    public List<GooglePrivacyDlpV2ActionResponse> getActions() {
        return this.actions;
    }
    public GooglePrivacyDlpV2PrivacyMetricResponse getPrivacyMetric() {
        return this.privacyMetric;
    }
    public GooglePrivacyDlpV2BigQueryTableResponse getSourceTable() {
        return this.sourceTable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RiskAnalysisJobConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2ActionResponse> actions;
        private GooglePrivacyDlpV2PrivacyMetricResponse privacyMetric;
        private GooglePrivacyDlpV2BigQueryTableResponse sourceTable;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RiskAnalysisJobConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.privacyMetric = defaults.privacyMetric;
    	      this.sourceTable = defaults.sourceTable;
        }

        public Builder setActions(List<GooglePrivacyDlpV2ActionResponse> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }

        public Builder setPrivacyMetric(GooglePrivacyDlpV2PrivacyMetricResponse privacyMetric) {
            this.privacyMetric = Objects.requireNonNull(privacyMetric);
            return this;
        }

        public Builder setSourceTable(GooglePrivacyDlpV2BigQueryTableResponse sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }

        public GooglePrivacyDlpV2RiskAnalysisJobConfigResponse build() {
            return new GooglePrivacyDlpV2RiskAnalysisJobConfigResponse(actions, privacyMetric, sourceTable);
        }
    }
}