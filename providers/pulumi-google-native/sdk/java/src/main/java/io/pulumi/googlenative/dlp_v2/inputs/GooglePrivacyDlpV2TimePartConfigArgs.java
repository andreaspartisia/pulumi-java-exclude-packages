// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2TimePartConfigPartToExtract;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GooglePrivacyDlpV2TimePartConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2TimePartConfigArgs Empty = new GooglePrivacyDlpV2TimePartConfigArgs();

    @InputImport(name="partToExtract")
    private final @Nullable Input<GooglePrivacyDlpV2TimePartConfigPartToExtract> partToExtract;

    public Input<GooglePrivacyDlpV2TimePartConfigPartToExtract> getPartToExtract() {
        return this.partToExtract == null ? Input.empty() : this.partToExtract;
    }

    public GooglePrivacyDlpV2TimePartConfigArgs(@Nullable Input<GooglePrivacyDlpV2TimePartConfigPartToExtract> partToExtract) {
        this.partToExtract = partToExtract;
    }

    private GooglePrivacyDlpV2TimePartConfigArgs() {
        this.partToExtract = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TimePartConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2TimePartConfigPartToExtract> partToExtract;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TimePartConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partToExtract = defaults.partToExtract;
        }

        public Builder setPartToExtract(@Nullable Input<GooglePrivacyDlpV2TimePartConfigPartToExtract> partToExtract) {
            this.partToExtract = partToExtract;
            return this;
        }

        public Builder setPartToExtract(@Nullable GooglePrivacyDlpV2TimePartConfigPartToExtract partToExtract) {
            this.partToExtract = Input.ofNullable(partToExtract);
            return this;
        }

        public GooglePrivacyDlpV2TimePartConfigArgs build() {
            return new GooglePrivacyDlpV2TimePartConfigArgs(partToExtract);
        }
    }
}