// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Message for specifying a window around a finding to apply a detection rule.
 * 
 */
public final class GooglePrivacyDlpV2ProximityArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2ProximityArgs Empty = new GooglePrivacyDlpV2ProximityArgs();

    /**
     * Number of characters after the finding to consider.
     * 
     */
    @Import(name="windowAfter")
      private final @Nullable Output<Integer> windowAfter;

    public Output<Integer> windowAfter() {
        return this.windowAfter == null ? Codegen.empty() : this.windowAfter;
    }

    /**
     * Number of characters before the finding to consider.
     * 
     */
    @Import(name="windowBefore")
      private final @Nullable Output<Integer> windowBefore;

    public Output<Integer> windowBefore() {
        return this.windowBefore == null ? Codegen.empty() : this.windowBefore;
    }

    public GooglePrivacyDlpV2ProximityArgs(
        @Nullable Output<Integer> windowAfter,
        @Nullable Output<Integer> windowBefore) {
        this.windowAfter = windowAfter;
        this.windowBefore = windowBefore;
    }

    private GooglePrivacyDlpV2ProximityArgs() {
        this.windowAfter = Codegen.empty();
        this.windowBefore = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ProximityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> windowAfter;
        private @Nullable Output<Integer> windowBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ProximityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.windowAfter = defaults.windowAfter;
    	      this.windowBefore = defaults.windowBefore;
        }

        public Builder windowAfter(@Nullable Output<Integer> windowAfter) {
            this.windowAfter = windowAfter;
            return this;
        }
        public Builder windowAfter(@Nullable Integer windowAfter) {
            this.windowAfter = Codegen.ofNullable(windowAfter);
            return this;
        }
        public Builder windowBefore(@Nullable Output<Integer> windowBefore) {
            this.windowBefore = windowBefore;
            return this;
        }
        public Builder windowBefore(@Nullable Integer windowBefore) {
            this.windowBefore = Codegen.ofNullable(windowBefore);
            return this;
        }        public GooglePrivacyDlpV2ProximityArgs build() {
            return new GooglePrivacyDlpV2ProximityArgs(windowAfter, windowBefore);
        }
    }
}
