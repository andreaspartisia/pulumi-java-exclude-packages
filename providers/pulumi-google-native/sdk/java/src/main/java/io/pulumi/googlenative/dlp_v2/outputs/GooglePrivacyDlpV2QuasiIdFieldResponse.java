// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dlp_v2.outputs.GooglePrivacyDlpV2FieldIdResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GooglePrivacyDlpV2QuasiIdFieldResponse {
    private final String customTag;
    private final GooglePrivacyDlpV2FieldIdResponse field;

    @OutputCustomType.Constructor({"customTag","field"})
    private GooglePrivacyDlpV2QuasiIdFieldResponse(
        String customTag,
        GooglePrivacyDlpV2FieldIdResponse field) {
        this.customTag = Objects.requireNonNull(customTag);
        this.field = Objects.requireNonNull(field);
    }

    public String getCustomTag() {
        return this.customTag;
    }
    public GooglePrivacyDlpV2FieldIdResponse getField() {
        return this.field;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2QuasiIdFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customTag;
        private GooglePrivacyDlpV2FieldIdResponse field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2QuasiIdFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTag = defaults.customTag;
    	      this.field = defaults.field;
        }

        public Builder setCustomTag(String customTag) {
            this.customTag = Objects.requireNonNull(customTag);
            return this;
        }

        public Builder setField(GooglePrivacyDlpV2FieldIdResponse field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public GooglePrivacyDlpV2QuasiIdFieldResponse build() {
            return new GooglePrivacyDlpV2QuasiIdFieldResponse(customTag, field);
        }
    }
}