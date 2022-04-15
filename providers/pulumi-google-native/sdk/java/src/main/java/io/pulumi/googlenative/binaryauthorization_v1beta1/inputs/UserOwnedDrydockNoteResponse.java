// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.binaryauthorization_v1beta1.inputs.AttestorPublicKeyResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An user owned drydock note references a Drydock ATTESTATION_AUTHORITY Note created by the user.
 * 
 */
public final class UserOwnedDrydockNoteResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserOwnedDrydockNoteResponse Empty = new UserOwnedDrydockNoteResponse();

    /**
     * This field will contain the service account email address that this Attestor will use as the principal when querying Container Analysis. Attestor administrators must grant this service account the IAM role needed to read attestations from the note_reference in Container Analysis (`containeranalysis.notes.occurrences.viewer`). This email address is fixed for the lifetime of the Attestor, but callers should not make any other assumptions about the service account email; future versions may use an email based on a different naming pattern.
     * 
     */
    @Import(name="delegationServiceAccountEmail", required=true)
      private final String delegationServiceAccountEmail;

    public String delegationServiceAccountEmail() {
        return this.delegationServiceAccountEmail;
    }

    /**
     * The Drydock resource name of a ATTESTATION_AUTHORITY Note, created by the user, in the format: `projects/*{@literal /}notes/*` (or the legacy `providers/*{@literal /}notes/*`). This field may not be updated. An attestation by this attestor is stored as a Drydock ATTESTATION_AUTHORITY Occurrence that names a container image and that links to this Note. Drydock is an external dependency.
     * 
     */
    @Import(name="noteReference", required=true)
      private final String noteReference;

    public String noteReference() {
        return this.noteReference;
    }

    /**
     * Optional. Public keys that verify attestations signed by this attestor. This field may be updated. If this field is non-empty, one of the specified public keys must verify that an attestation was signed by this attestor for the image specified in the admission request. If this field is empty, this attestor always returns that no valid attestations exist.
     * 
     */
    @Import(name="publicKeys", required=true)
      private final List<AttestorPublicKeyResponse> publicKeys;

    public List<AttestorPublicKeyResponse> publicKeys() {
        return this.publicKeys;
    }

    public UserOwnedDrydockNoteResponse(
        String delegationServiceAccountEmail,
        String noteReference,
        List<AttestorPublicKeyResponse> publicKeys) {
        this.delegationServiceAccountEmail = Objects.requireNonNull(delegationServiceAccountEmail, "expected parameter 'delegationServiceAccountEmail' to be non-null");
        this.noteReference = Objects.requireNonNull(noteReference, "expected parameter 'noteReference' to be non-null");
        this.publicKeys = Objects.requireNonNull(publicKeys, "expected parameter 'publicKeys' to be non-null");
    }

    private UserOwnedDrydockNoteResponse() {
        this.delegationServiceAccountEmail = null;
        this.noteReference = null;
        this.publicKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserOwnedDrydockNoteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String delegationServiceAccountEmail;
        private String noteReference;
        private List<AttestorPublicKeyResponse> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(UserOwnedDrydockNoteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegationServiceAccountEmail = defaults.delegationServiceAccountEmail;
    	      this.noteReference = defaults.noteReference;
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder delegationServiceAccountEmail(String delegationServiceAccountEmail) {
            this.delegationServiceAccountEmail = Objects.requireNonNull(delegationServiceAccountEmail);
            return this;
        }
        public Builder noteReference(String noteReference) {
            this.noteReference = Objects.requireNonNull(noteReference);
            return this;
        }
        public Builder publicKeys(List<AttestorPublicKeyResponse> publicKeys) {
            this.publicKeys = Objects.requireNonNull(publicKeys);
            return this;
        }
        public Builder publicKeys(AttestorPublicKeyResponse... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }        public UserOwnedDrydockNoteResponse build() {
            return new UserOwnedDrydockNoteResponse(delegationServiceAccountEmail, noteReference, publicKeys);
        }
    }
}
