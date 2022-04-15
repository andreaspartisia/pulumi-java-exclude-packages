// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldTransformationResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RecordSuppressionResponse;
import java.util.List;
import java.util.Objects;


/**
 * A type of transformation that is applied over structured data such as a table.
 * 
 */
public final class GooglePrivacyDlpV2RecordTransformationsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2RecordTransformationsResponse Empty = new GooglePrivacyDlpV2RecordTransformationsResponse();

    /**
     * Transform the record by applying various field transformations.
     * 
     */
    @Import(name="fieldTransformations", required=true)
      private final List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations;

    public List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations() {
        return this.fieldTransformations;
    }

    /**
     * Configuration defining which records get suppressed entirely. Records that match any suppression rule are omitted from the output.
     * 
     */
    @Import(name="recordSuppressions", required=true)
      private final List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions;

    public List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions() {
        return this.recordSuppressions;
    }

    public GooglePrivacyDlpV2RecordTransformationsResponse(
        List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations,
        List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions) {
        this.fieldTransformations = Objects.requireNonNull(fieldTransformations, "expected parameter 'fieldTransformations' to be non-null");
        this.recordSuppressions = Objects.requireNonNull(recordSuppressions, "expected parameter 'recordSuppressions' to be non-null");
    }

    private GooglePrivacyDlpV2RecordTransformationsResponse() {
        this.fieldTransformations = List.of();
        this.recordSuppressions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RecordTransformationsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations;
        private List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RecordTransformationsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldTransformations = defaults.fieldTransformations;
    	      this.recordSuppressions = defaults.recordSuppressions;
        }

        public Builder fieldTransformations(List<GooglePrivacyDlpV2FieldTransformationResponse> fieldTransformations) {
            this.fieldTransformations = Objects.requireNonNull(fieldTransformations);
            return this;
        }
        public Builder fieldTransformations(GooglePrivacyDlpV2FieldTransformationResponse... fieldTransformations) {
            return fieldTransformations(List.of(fieldTransformations));
        }
        public Builder recordSuppressions(List<GooglePrivacyDlpV2RecordSuppressionResponse> recordSuppressions) {
            this.recordSuppressions = Objects.requireNonNull(recordSuppressions);
            return this;
        }
        public Builder recordSuppressions(GooglePrivacyDlpV2RecordSuppressionResponse... recordSuppressions) {
            return recordSuppressions(List.of(recordSuppressions));
        }        public GooglePrivacyDlpV2RecordTransformationsResponse build() {
            return new GooglePrivacyDlpV2RecordTransformationsResponse(fieldTransformations, recordSuppressions);
        }
    }
}
