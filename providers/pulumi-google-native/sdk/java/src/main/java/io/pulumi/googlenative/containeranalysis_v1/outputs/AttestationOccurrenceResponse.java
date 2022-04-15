// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.containeranalysis_v1.outputs.JwtResponse;
import io.pulumi.googlenative.containeranalysis_v1.outputs.SignatureResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AttestationOccurrenceResponse {
    /**
     * One or more JWTs encoding a self-contained attestation. Each JWT encodes the payload that it verifies within the JWT itself. Verifier implementation SHOULD ignore the `serialized_payload` field when verifying these JWTs. If only JWTs are present on this AttestationOccurrence, then the `serialized_payload` SHOULD be left empty. Each JWT SHOULD encode a claim specific to the `resource_uri` of this Occurrence, but this is not validated by Grafeas metadata API implementations. The JWT itself is opaque to Grafeas.
     * 
     */
    private final List<JwtResponse> jwts;
    /**
     * The serialized payload that is verified by one or more `signatures`.
     * 
     */
    private final String serializedPayload;
    /**
     * One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
     * 
     */
    private final List<SignatureResponse> signatures;

    @CustomType.Constructor
    private AttestationOccurrenceResponse(
        @CustomType.Parameter("jwts") List<JwtResponse> jwts,
        @CustomType.Parameter("serializedPayload") String serializedPayload,
        @CustomType.Parameter("signatures") List<SignatureResponse> signatures) {
        this.jwts = jwts;
        this.serializedPayload = serializedPayload;
        this.signatures = signatures;
    }

    /**
     * One or more JWTs encoding a self-contained attestation. Each JWT encodes the payload that it verifies within the JWT itself. Verifier implementation SHOULD ignore the `serialized_payload` field when verifying these JWTs. If only JWTs are present on this AttestationOccurrence, then the `serialized_payload` SHOULD be left empty. Each JWT SHOULD encode a claim specific to the `resource_uri` of this Occurrence, but this is not validated by Grafeas metadata API implementations. The JWT itself is opaque to Grafeas.
     * 
    */
    public List<JwtResponse> jwts() {
        return this.jwts;
    }
    /**
     * The serialized payload that is verified by one or more `signatures`.
     * 
    */
    public String serializedPayload() {
        return this.serializedPayload;
    }
    /**
     * One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
     * 
    */
    public List<SignatureResponse> signatures() {
        return this.signatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttestationOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<JwtResponse> jwts;
        private String serializedPayload;
        private List<SignatureResponse> signatures;

        public Builder() {
    	      // Empty
        }

        public Builder(AttestationOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jwts = defaults.jwts;
    	      this.serializedPayload = defaults.serializedPayload;
    	      this.signatures = defaults.signatures;
        }

        public Builder jwts(List<JwtResponse> jwts) {
            this.jwts = Objects.requireNonNull(jwts);
            return this;
        }
        public Builder jwts(JwtResponse... jwts) {
            return jwts(List.of(jwts));
        }
        public Builder serializedPayload(String serializedPayload) {
            this.serializedPayload = Objects.requireNonNull(serializedPayload);
            return this;
        }
        public Builder signatures(List<SignatureResponse> signatures) {
            this.signatures = Objects.requireNonNull(signatures);
            return this;
        }
        public Builder signatures(SignatureResponse... signatures) {
            return signatures(List.of(signatures));
        }        public AttestationOccurrenceResponse build() {
            return new AttestationOccurrenceResponse(jwts, serializedPayload, signatures);
        }
    }
}
