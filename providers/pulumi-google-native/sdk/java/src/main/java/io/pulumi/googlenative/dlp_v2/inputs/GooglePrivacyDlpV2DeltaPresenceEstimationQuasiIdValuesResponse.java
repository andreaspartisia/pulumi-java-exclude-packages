// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ValueResponse;
import java.lang.Double;
import java.util.List;
import java.util.Objects;


/**
 * A tuple of values for the quasi-identifier columns.
 * 
 */
public final class GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse Empty = new GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse();

    /**
     * The estimated probability that a given individual sharing these quasi-identifier values is in the dataset. This value, typically called δ, is the ratio between the number of records in the dataset with these quasi-identifier values, and the total number of individuals (inside *and* outside the dataset) with these quasi-identifier values. For example, if there are 15 individuals in the dataset who share the same quasi-identifier values, and an estimated 100 people in the entire population with these values, then δ is 0.15.
     * 
     */
    @Import(name="estimatedProbability", required=true)
      private final Double estimatedProbability;

    public Double estimatedProbability() {
        return this.estimatedProbability;
    }

    /**
     * The quasi-identifier values.
     * 
     */
    @Import(name="quasiIdsValues", required=true)
      private final List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues;

    public List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues() {
        return this.quasiIdsValues;
    }

    public GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse(
        Double estimatedProbability,
        List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues) {
        this.estimatedProbability = Objects.requireNonNull(estimatedProbability, "expected parameter 'estimatedProbability' to be non-null");
        this.quasiIdsValues = Objects.requireNonNull(quasiIdsValues, "expected parameter 'quasiIdsValues' to be non-null");
    }

    private GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse() {
        this.estimatedProbability = null;
        this.quasiIdsValues = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double estimatedProbability;
        private List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.estimatedProbability = defaults.estimatedProbability;
    	      this.quasiIdsValues = defaults.quasiIdsValues;
        }

        public Builder estimatedProbability(Double estimatedProbability) {
            this.estimatedProbability = Objects.requireNonNull(estimatedProbability);
            return this;
        }
        public Builder quasiIdsValues(List<GooglePrivacyDlpV2ValueResponse> quasiIdsValues) {
            this.quasiIdsValues = Objects.requireNonNull(quasiIdsValues);
            return this;
        }
        public Builder quasiIdsValues(GooglePrivacyDlpV2ValueResponse... quasiIdsValues) {
            return quasiIdsValues(List.of(quasiIdsValues));
        }        public GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse build() {
            return new GooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesResponse(estimatedProbability, quasiIdsValues);
        }
    }
}
