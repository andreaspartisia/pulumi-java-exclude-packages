// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateConfigPublicKeyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateConfigPublicKeyGetArgs Empty = new CertificateConfigPublicKeyGetArgs();

    /**
     * The format of the public key. Currently, only PEM format is supported.
     * Possible values are `KEY_TYPE_UNSPECIFIED` and `PEM`.
     * 
     */
    @InputImport(name="format", required=true)
    private final Input<String> format;

    public Input<String> getFormat() {
        return this.format;
    }

    /**
     * Required. A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective 'KeyType' value. When this is generated by the service, it will always be an RFC 5280 SubjectPublicKeyInfo structure containing an algorithm identifier and a key. A base64-encoded string.
     * 
     */
    @InputImport(name="key")
    private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    public CertificateConfigPublicKeyGetArgs(
        Input<String> format,
        @Nullable Input<String> key) {
        this.format = Objects.requireNonNull(format, "expected parameter 'format' to be non-null");
        this.key = key;
    }

    private CertificateConfigPublicKeyGetArgs() {
        this.format = Input.empty();
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateConfigPublicKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> format;
        private @Nullable Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateConfigPublicKeyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.format = defaults.format;
    	      this.key = defaults.key;
        }

        public Builder setFormat(Input<String> format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Input.of(Objects.requireNonNull(format));
            return this;
        }

        public Builder setKey(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder setKey(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }

        public CertificateConfigPublicKeyGetArgs build() {
            return new CertificateConfigPublicKeyGetArgs(format, key);
        }
    }
}