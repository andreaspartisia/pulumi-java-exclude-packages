// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GooglePrivacyDlpV2InfoTypeResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2InfoTypeResponse Empty = new GooglePrivacyDlpV2InfoTypeResponse();

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="version", required=true)
    private final String version;

    public String getVersion() {
        return this.version;
    }

    public GooglePrivacyDlpV2InfoTypeResponse(
        String name,
        String version) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private GooglePrivacyDlpV2InfoTypeResponse() {
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2InfoTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2InfoTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public GooglePrivacyDlpV2InfoTypeResponse build() {
            return new GooglePrivacyDlpV2InfoTypeResponse(name, version);
        }
    }
}