// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2QuasiIdResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2StatisticalTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * δ-presence metric, used to estimate how likely it is for an attacker to figure out that one given individual appears in a de-identified dataset. Similarly to the k-map metric, we cannot compute δ-presence exactly without knowing the attack dataset, so we use a statistical model instead.
 * 
 */
public final class GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse Empty = new GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse();

    /**
     * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-identifiers field must appear in exactly one field of one auxiliary table.
     * 
     */
    @Import(name="auxiliaryTables", required=true)
      private final List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables;

    public List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables() {
        return this.auxiliaryTables;
    }

    /**
     * Fields considered to be quasi-identifiers. No two fields can have the same tag.
     * 
     */
    @Import(name="quasiIds", required=true)
      private final List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds;

    public List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds() {
        return this.quasiIds;
    }

    /**
     * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Set if no column is tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
     * 
     */
    @Import(name="regionCode", required=true)
      private final String regionCode;

    public String regionCode() {
        return this.regionCode;
    }

    public GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse(
        List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables,
        List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds,
        String regionCode) {
        this.auxiliaryTables = Objects.requireNonNull(auxiliaryTables, "expected parameter 'auxiliaryTables' to be non-null");
        this.quasiIds = Objects.requireNonNull(quasiIds, "expected parameter 'quasiIds' to be non-null");
        this.regionCode = Objects.requireNonNull(regionCode, "expected parameter 'regionCode' to be non-null");
    }

    private GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse() {
        this.auxiliaryTables = List.of();
        this.quasiIds = List.of();
        this.regionCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables;
        private List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds;
        private String regionCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryTables = defaults.auxiliaryTables;
    	      this.quasiIds = defaults.quasiIds;
    	      this.regionCode = defaults.regionCode;
        }

        public Builder auxiliaryTables(List<GooglePrivacyDlpV2StatisticalTableResponse> auxiliaryTables) {
            this.auxiliaryTables = Objects.requireNonNull(auxiliaryTables);
            return this;
        }
        public Builder auxiliaryTables(GooglePrivacyDlpV2StatisticalTableResponse... auxiliaryTables) {
            return auxiliaryTables(List.of(auxiliaryTables));
        }
        public Builder quasiIds(List<GooglePrivacyDlpV2QuasiIdResponse> quasiIds) {
            this.quasiIds = Objects.requireNonNull(quasiIds);
            return this;
        }
        public Builder quasiIds(GooglePrivacyDlpV2QuasiIdResponse... quasiIds) {
            return quasiIds(List.of(quasiIds));
        }
        public Builder regionCode(String regionCode) {
            this.regionCode = Objects.requireNonNull(regionCode);
            return this;
        }        public GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse build() {
            return new GooglePrivacyDlpV2DeltaPresenceEstimationConfigResponse(auxiliaryTables, quasiIds, regionCode);
        }
    }
}
