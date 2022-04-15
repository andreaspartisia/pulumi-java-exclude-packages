// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudidentity_v1beta1.inputs.CertificateAttributesResponse;
import java.util.List;
import java.util.Objects;


/**
 * Resource representing the Endpoint Verification-specific attributes of a Device. https://cloud.google.com/endpoint-verification/docs/overview
 * 
 */
public final class EndpointVerificationSpecificAttributesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointVerificationSpecificAttributesResponse Empty = new EndpointVerificationSpecificAttributesResponse();

    /**
     * Details of certificates.
     * 
     */
    @Import(name="certificateAttributes", required=true)
      private final List<CertificateAttributesResponse> certificateAttributes;

    public List<CertificateAttributesResponse> certificateAttributes() {
        return this.certificateAttributes;
    }

    public EndpointVerificationSpecificAttributesResponse(List<CertificateAttributesResponse> certificateAttributes) {
        this.certificateAttributes = Objects.requireNonNull(certificateAttributes, "expected parameter 'certificateAttributes' to be non-null");
    }

    private EndpointVerificationSpecificAttributesResponse() {
        this.certificateAttributes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointVerificationSpecificAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<CertificateAttributesResponse> certificateAttributes;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointVerificationSpecificAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAttributes = defaults.certificateAttributes;
        }

        public Builder certificateAttributes(List<CertificateAttributesResponse> certificateAttributes) {
            this.certificateAttributes = Objects.requireNonNull(certificateAttributes);
            return this;
        }
        public Builder certificateAttributes(CertificateAttributesResponse... certificateAttributes) {
            return certificateAttributes(List.of(certificateAttributes));
        }        public EndpointVerificationSpecificAttributesResponse build() {
            return new EndpointVerificationSpecificAttributesResponse(certificateAttributes);
        }
    }
}
