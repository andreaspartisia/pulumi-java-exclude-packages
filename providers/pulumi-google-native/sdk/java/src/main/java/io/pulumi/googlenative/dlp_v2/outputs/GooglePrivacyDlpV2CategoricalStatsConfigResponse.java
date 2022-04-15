// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2CategoricalStatsConfigResponse {
    /**
     * Field to compute categorical stats on. All column types are supported except for arrays and structs. However, it may be more informative to use NumericalStats when the field type is supported, depending on the data.
     * 
     */
    private final GooglePrivacyDlpV2FieldIdResponse field;

    @CustomType.Constructor
    private GooglePrivacyDlpV2CategoricalStatsConfigResponse(@CustomType.Parameter("field") GooglePrivacyDlpV2FieldIdResponse field) {
        this.field = field;
    }

    /**
     * Field to compute categorical stats on. All column types are supported except for arrays and structs. However, it may be more informative to use NumericalStats when the field type is supported, depending on the data.
     * 
    */
    public GooglePrivacyDlpV2FieldIdResponse field() {
        return this.field;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CategoricalStatsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2FieldIdResponse field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CategoricalStatsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
        }

        public Builder field(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }        public GooglePrivacyDlpV2CategoricalStatsConfigResponse build() {
            return new GooglePrivacyDlpV2CategoricalStatsConfigResponse(field);
        }
    }
}
