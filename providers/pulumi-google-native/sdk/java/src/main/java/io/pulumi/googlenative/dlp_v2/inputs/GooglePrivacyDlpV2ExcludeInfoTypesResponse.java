// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import java.util.List;
import java.util.Objects;


/**
 * List of exclude infoTypes.
 * 
 */
public final class GooglePrivacyDlpV2ExcludeInfoTypesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ExcludeInfoTypesResponse Empty = new GooglePrivacyDlpV2ExcludeInfoTypesResponse();

    /**
     * InfoType list in ExclusionRule rule drops a finding when it overlaps or contained within with a finding of an infoType from this list. For example, for `InspectionRuleSet.info_types` containing "PHONE_NUMBER"`and`exclusion_rule`containing`exclude_info_types.info_types` with "EMAIL_ADDRESS" the phone number findings are dropped if they overlap with EMAIL_ADDRESS finding. That leads to "555-222-2222@example.org" to generate only a single finding, namely email address.
     * 
     */
    @Import(name="infoTypes", required=true)
      private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

    public List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes() {
        return this.infoTypes;
    }

    public GooglePrivacyDlpV2ExcludeInfoTypesResponse(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
        this.infoTypes = Objects.requireNonNull(infoTypes, "expected parameter 'infoTypes' to be non-null");
    }

    private GooglePrivacyDlpV2ExcludeInfoTypesResponse() {
        this.infoTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ExcludeInfoTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ExcludeInfoTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
        }

        public Builder infoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }
        public Builder infoTypes(GooglePrivacyDlpV2InfoTypeResponse... infoTypes) {
            return infoTypes(List.of(infoTypes));
        }        public GooglePrivacyDlpV2ExcludeInfoTypesResponse build() {
            return new GooglePrivacyDlpV2ExcludeInfoTypesResponse(infoTypes);
        }
    }
}
