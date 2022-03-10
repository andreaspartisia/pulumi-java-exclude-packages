// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecListenerTlsValidationTrustArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecListenerTlsValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecListenerTlsValidationArgs Empty = new VirtualGatewaySpecListenerTlsValidationArgs();

    /**
     * The SANs for a virtual gateway's listener's Transport Layer Security (TLS) validation context.
     * 
     */
    @InputImport(name="subjectAlternativeNames")
      private final @Nullable Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;

    public Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Input.empty() : this.subjectAlternativeNames;
    }

    /**
     * The TLS validation context trust.
     * 
     */
    @InputImport(name="trust", required=true)
      private final Input<VirtualGatewaySpecListenerTlsValidationTrustArgs> trust;

    public Input<VirtualGatewaySpecListenerTlsValidationTrustArgs> getTrust() {
        return this.trust;
    }

    public VirtualGatewaySpecListenerTlsValidationArgs(
        @Nullable Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames,
        Input<VirtualGatewaySpecListenerTlsValidationTrustArgs> trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = Objects.requireNonNull(trust, "expected parameter 'trust' to be non-null");
    }

    private VirtualGatewaySpecListenerTlsValidationArgs() {
        this.subjectAlternativeNames = Input.empty();
        this.trust = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerTlsValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames;
        private Input<VirtualGatewaySpecListenerTlsValidationTrustArgs> trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerTlsValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder setSubjectAlternativeNames(@Nullable Input<VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder setSubjectAlternativeNames(@Nullable VirtualGatewaySpecListenerTlsValidationSubjectAlternativeNamesArgs subjectAlternativeNames) {
            this.subjectAlternativeNames = Input.ofNullable(subjectAlternativeNames);
            return this;
        }

        public Builder setTrust(Input<VirtualGatewaySpecListenerTlsValidationTrustArgs> trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }

        public Builder setTrust(VirtualGatewaySpecListenerTlsValidationTrustArgs trust) {
            this.trust = Input.of(Objects.requireNonNull(trust));
            return this;
        }
        public VirtualGatewaySpecListenerTlsValidationArgs build() {
            return new VirtualGatewaySpecListenerTlsValidationArgs(subjectAlternativeNames, trust);
        }
    }
}