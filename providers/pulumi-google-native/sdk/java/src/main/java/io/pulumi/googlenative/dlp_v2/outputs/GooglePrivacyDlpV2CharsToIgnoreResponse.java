// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GooglePrivacyDlpV2CharsToIgnoreResponse {
    /**
     * Characters to not transform when masking.
     * 
     */
    private final String charactersToSkip;
    /**
     * Common characters to not transform when masking. Useful to avoid removing punctuation.
     * 
     */
    private final String commonCharactersToIgnore;

    @CustomType.Constructor
    private GooglePrivacyDlpV2CharsToIgnoreResponse(
        @CustomType.Parameter("charactersToSkip") String charactersToSkip,
        @CustomType.Parameter("commonCharactersToIgnore") String commonCharactersToIgnore) {
        this.charactersToSkip = charactersToSkip;
        this.commonCharactersToIgnore = commonCharactersToIgnore;
    }

    /**
     * Characters to not transform when masking.
     * 
    */
    public String charactersToSkip() {
        return this.charactersToSkip;
    }
    /**
     * Common characters to not transform when masking. Useful to avoid removing punctuation.
     * 
    */
    public String commonCharactersToIgnore() {
        return this.commonCharactersToIgnore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CharsToIgnoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String charactersToSkip;
        private String commonCharactersToIgnore;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CharsToIgnoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToSkip = defaults.charactersToSkip;
    	      this.commonCharactersToIgnore = defaults.commonCharactersToIgnore;
        }

        public Builder charactersToSkip(String charactersToSkip) {
            this.charactersToSkip = Objects.requireNonNull(charactersToSkip);
            return this;
        }
        public Builder commonCharactersToIgnore(String commonCharactersToIgnore) {
            this.commonCharactersToIgnore = Objects.requireNonNull(commonCharactersToIgnore);
            return this;
        }        public GooglePrivacyDlpV2CharsToIgnoreResponse build() {
            return new GooglePrivacyDlpV2CharsToIgnoreResponse(charactersToSkip, commonCharactersToIgnore);
        }
    }
}
