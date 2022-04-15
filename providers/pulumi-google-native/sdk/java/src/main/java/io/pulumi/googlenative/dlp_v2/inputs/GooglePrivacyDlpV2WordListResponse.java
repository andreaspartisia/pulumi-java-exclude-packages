// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Message defining a list of words or phrases to search for in the data.
 * 
 */
public final class GooglePrivacyDlpV2WordListResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2WordListResponse Empty = new GooglePrivacyDlpV2WordListResponse();

    /**
     * Words or phrases defining the dictionary. The dictionary must contain at least one phrase and every phrase must contain at least 2 characters that are letters or digits. [required]
     * 
     */
    @Import(name="words", required=true)
      private final List<String> words;

    public List<String> words() {
        return this.words;
    }

    public GooglePrivacyDlpV2WordListResponse(List<String> words) {
        this.words = Objects.requireNonNull(words, "expected parameter 'words' to be non-null");
    }

    private GooglePrivacyDlpV2WordListResponse() {
        this.words = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2WordListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> words;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2WordListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.words = defaults.words;
        }

        public Builder words(List<String> words) {
            this.words = Objects.requireNonNull(words);
            return this;
        }
        public Builder words(String... words) {
            return words(List.of(words));
        }        public GooglePrivacyDlpV2WordListResponse build() {
            return new GooglePrivacyDlpV2WordListResponse(words);
        }
    }
}
