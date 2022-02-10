// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RecordConditionArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GooglePrivacyDlpV2RecordSuppressionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2RecordSuppressionArgs Empty = new GooglePrivacyDlpV2RecordSuppressionArgs();

    @InputImport(name="condition")
    private final @Nullable Input<GooglePrivacyDlpV2RecordConditionArgs> condition;

    public Input<GooglePrivacyDlpV2RecordConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    public GooglePrivacyDlpV2RecordSuppressionArgs(@Nullable Input<GooglePrivacyDlpV2RecordConditionArgs> condition) {
        this.condition = condition;
    }

    private GooglePrivacyDlpV2RecordSuppressionArgs() {
        this.condition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2RecordSuppressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2RecordConditionArgs> condition;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2RecordSuppressionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
        }

        public Builder setCondition(@Nullable Input<GooglePrivacyDlpV2RecordConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable GooglePrivacyDlpV2RecordConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public GooglePrivacyDlpV2RecordSuppressionArgs build() {
            return new GooglePrivacyDlpV2RecordSuppressionArgs(condition);
        }
    }
}