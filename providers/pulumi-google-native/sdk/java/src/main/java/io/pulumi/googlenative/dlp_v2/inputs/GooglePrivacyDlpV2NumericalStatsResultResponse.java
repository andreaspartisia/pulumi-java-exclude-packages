// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ValueResponse;
import java.util.List;
import java.util.Objects;


public final class GooglePrivacyDlpV2NumericalStatsResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2NumericalStatsResultResponse Empty = new GooglePrivacyDlpV2NumericalStatsResultResponse();

    @InputImport(name="maxValue", required=true)
    private final GooglePrivacyDlpV2ValueResponse maxValue;

    public GooglePrivacyDlpV2ValueResponse getMaxValue() {
        return this.maxValue;
    }

    @InputImport(name="minValue", required=true)
    private final GooglePrivacyDlpV2ValueResponse minValue;

    public GooglePrivacyDlpV2ValueResponse getMinValue() {
        return this.minValue;
    }

    @InputImport(name="quantileValues", required=true)
    private final List<GooglePrivacyDlpV2ValueResponse> quantileValues;

    public List<GooglePrivacyDlpV2ValueResponse> getQuantileValues() {
        return this.quantileValues;
    }

    public GooglePrivacyDlpV2NumericalStatsResultResponse(
        GooglePrivacyDlpV2ValueResponse maxValue,
        GooglePrivacyDlpV2ValueResponse minValue,
        List<GooglePrivacyDlpV2ValueResponse> quantileValues) {
        this.maxValue = Objects.requireNonNull(maxValue, "expected parameter 'maxValue' to be non-null");
        this.minValue = Objects.requireNonNull(minValue, "expected parameter 'minValue' to be non-null");
        this.quantileValues = Objects.requireNonNull(quantileValues, "expected parameter 'quantileValues' to be non-null");
    }

    private GooglePrivacyDlpV2NumericalStatsResultResponse() {
        this.maxValue = null;
        this.minValue = null;
        this.quantileValues = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2NumericalStatsResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ValueResponse maxValue;
        private GooglePrivacyDlpV2ValueResponse minValue;
        private List<GooglePrivacyDlpV2ValueResponse> quantileValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2NumericalStatsResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
    	      this.quantileValues = defaults.quantileValues;
        }

        public Builder setMaxValue(GooglePrivacyDlpV2ValueResponse maxValue) {
            this.maxValue = Objects.requireNonNull(maxValue);
            return this;
        }

        public Builder setMinValue(GooglePrivacyDlpV2ValueResponse minValue) {
            this.minValue = Objects.requireNonNull(minValue);
            return this;
        }

        public Builder setQuantileValues(List<GooglePrivacyDlpV2ValueResponse> quantileValues) {
            this.quantileValues = Objects.requireNonNull(quantileValues);
            return this;
        }

        public GooglePrivacyDlpV2NumericalStatsResultResponse build() {
            return new GooglePrivacyDlpV2NumericalStatsResultResponse(maxValue, minValue, quantileValues);
        }
    }
}