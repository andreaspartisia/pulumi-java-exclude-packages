// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CertificatesManagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateAuthorityVersionSubjectAlternativeName {
    private final String type;
    private final String value;

    @CustomType.Constructor
    private GetCertificateAuthorityVersionSubjectAlternativeName(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.type = type;
        this.value = value;
    }

    public String type() {
        return this.type;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityVersionSubjectAlternativeName defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityVersionSubjectAlternativeName defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetCertificateAuthorityVersionSubjectAlternativeName build() {
            return new GetCertificateAuthorityVersionSubjectAlternativeName(type, value);
        }
    }
}
