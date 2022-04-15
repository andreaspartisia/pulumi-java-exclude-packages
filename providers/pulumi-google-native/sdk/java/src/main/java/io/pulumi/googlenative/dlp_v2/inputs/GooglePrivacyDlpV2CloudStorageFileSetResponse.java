// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Message representing a set of files in Cloud Storage.
 * 
 */
public final class GooglePrivacyDlpV2CloudStorageFileSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2CloudStorageFileSetResponse Empty = new GooglePrivacyDlpV2CloudStorageFileSetResponse();

    /**
     * The url, in the format `gs:///`. Trailing wildcard in the path is allowed.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    public GooglePrivacyDlpV2CloudStorageFileSetResponse(String url) {
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private GooglePrivacyDlpV2CloudStorageFileSetResponse() {
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2CloudStorageFileSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2CloudStorageFileSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GooglePrivacyDlpV2CloudStorageFileSetResponse build() {
            return new GooglePrivacyDlpV2CloudStorageFileSetResponse(url);
        }
    }
}
