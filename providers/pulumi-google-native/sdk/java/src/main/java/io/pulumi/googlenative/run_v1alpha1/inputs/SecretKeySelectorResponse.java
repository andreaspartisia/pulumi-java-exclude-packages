// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1alpha1.inputs.LocalObjectReferenceResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * SecretKeySelector selects a key of a Secret.
 * 
 */
public final class SecretKeySelectorResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretKeySelectorResponse Empty = new SecretKeySelectorResponse();

    /**
     * A Cloud Secret Manager secret version. Must be 'latest' for the latest version or an integer for a specific version. The key of the secret to select from. Must be a valid secret key.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String key() {
        return this.key;
    }

    /**
     * This field should not be used directly as it is meant to be inlined directly into the message. Use the "name" field instead.
     * 
     */
    @Import(name="localObjectReference", required=true)
      private final LocalObjectReferenceResponse localObjectReference;

    public LocalObjectReferenceResponse localObjectReference() {
        return this.localObjectReference;
    }

    /**
     * The name of the secret in Cloud Secret Manager. By default, the secret is assumed to be in the same project. If the secret is in another project, you must define an alias. An alias definition has the form: :projects//secrets/. If multiple alias definitions are needed, they must be separated by commas. The alias definitions must be set on the run.googleapis.com/secrets annotation. The name of the secret in the pod's namespace to select from.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * (Optional) Specify whether the Secret or its key must be defined
     * 
     */
    @Import(name="optional", required=true)
      private final Boolean optional;

    public Boolean optional() {
        return this.optional;
    }

    public SecretKeySelectorResponse(
        String key,
        LocalObjectReferenceResponse localObjectReference,
        String name,
        Boolean optional) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.localObjectReference = Objects.requireNonNull(localObjectReference, "expected parameter 'localObjectReference' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.optional = Objects.requireNonNull(optional, "expected parameter 'optional' to be non-null");
    }

    private SecretKeySelectorResponse() {
        this.key = null;
        this.localObjectReference = null;
        this.name = null;
        this.optional = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretKeySelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private LocalObjectReferenceResponse localObjectReference;
        private String name;
        private Boolean optional;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretKeySelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.localObjectReference = defaults.localObjectReference;
    	      this.name = defaults.name;
    	      this.optional = defaults.optional;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder localObjectReference(LocalObjectReferenceResponse localObjectReference) {
            this.localObjectReference = Objects.requireNonNull(localObjectReference);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder optional(Boolean optional) {
            this.optional = Objects.requireNonNull(optional);
            return this;
        }        public SecretKeySelectorResponse build() {
            return new SecretKeySelectorResponse(key, localObjectReference, name, optional);
        }
    }
}
