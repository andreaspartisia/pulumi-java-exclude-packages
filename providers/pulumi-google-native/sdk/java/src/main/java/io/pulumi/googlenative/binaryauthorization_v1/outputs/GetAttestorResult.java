// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.binaryauthorization_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.binaryauthorization_v1.outputs.UserOwnedGrafeasNoteResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAttestorResult {
    /**
     * Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
     */
    private final String description;
    /**
     * The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
     */
    private final String name;
    /**
     * Time when the attestor was last updated.
     * 
     */
    private final String updateTime;
    /**
     * This specifies how an attestation will be read, and how it will be used during policy enforcement.
     * 
     */
    private final UserOwnedGrafeasNoteResponse userOwnedGrafeasNote;

    @CustomType.Constructor
    private GetAttestorResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("updateTime") String updateTime,
        @CustomType.Parameter("userOwnedGrafeasNote") UserOwnedGrafeasNoteResponse userOwnedGrafeasNote) {
        this.description = description;
        this.name = name;
        this.updateTime = updateTime;
        this.userOwnedGrafeasNote = userOwnedGrafeasNote;
    }

    /**
     * Optional. A descriptive comment. This field may be updated. The field may be displayed in chooser dialogs.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The resource name, in the format: `projects/*{@literal /}attestors/*`. This field may not be updated.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Time when the attestor was last updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }
    /**
     * This specifies how an attestation will be read, and how it will be used during policy enforcement.
     * 
    */
    public UserOwnedGrafeasNoteResponse userOwnedGrafeasNote() {
        return this.userOwnedGrafeasNote;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttestorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String name;
        private String updateTime;
        private UserOwnedGrafeasNoteResponse userOwnedGrafeasNote;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttestorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.updateTime = defaults.updateTime;
    	      this.userOwnedGrafeasNote = defaults.userOwnedGrafeasNote;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public Builder userOwnedGrafeasNote(UserOwnedGrafeasNoteResponse userOwnedGrafeasNote) {
            this.userOwnedGrafeasNote = Objects.requireNonNull(userOwnedGrafeasNote);
            return this;
        }        public GetAttestorResult build() {
            return new GetAttestorResult(description, name, updateTime, userOwnedGrafeasNote);
        }
    }
}
