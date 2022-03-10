// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames;
import io.pulumi.aws.appmesh.outputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation {
    /**
     * The SANs for a virtual gateway's listener's Transport Layer Security (TLS) validation context.
     * 
     */
    private final @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
    /**
     * The TLS validation context trust.
     * 
     */
    private final VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust trust;

    @OutputCustomType.Constructor
    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation(
        @OutputCustomType.Parameter("subjectAlternativeNames") @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames,
        @OutputCustomType.Parameter("trust") VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = trust;
    }

    /**
     * The SANs for a virtual gateway's listener's Transport Layer Security (TLS) validation context.
     * 
    */
    public Optional<VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames> getSubjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * The TLS validation context trust.
     * 
    */
    public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust getTrust() {
        return this.trust;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
        private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder setSubjectAlternativeNames(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder setTrust(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrust trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidation(subjectAlternativeNames, trust);
        }
    }
}