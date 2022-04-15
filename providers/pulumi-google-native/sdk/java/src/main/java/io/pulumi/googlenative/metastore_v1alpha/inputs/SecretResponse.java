// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A securely stored value.
 * 
 */
public final class SecretResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretResponse Empty = new SecretResponse();

    /**
     * The relative resource name of a Secret Manager secret version, in the following form:projects/{project_number}/secrets/{secret_id}/versions/{version_id}.
     * 
     */
    @Import(name="cloudSecret", required=true)
      private final String cloudSecret;

    public String cloudSecret() {
        return this.cloudSecret;
    }

    public SecretResponse(String cloudSecret) {
        this.cloudSecret = Objects.requireNonNull(cloudSecret, "expected parameter 'cloudSecret' to be non-null");
    }

    private SecretResponse() {
        this.cloudSecret = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSecret = defaults.cloudSecret;
        }

        public Builder cloudSecret(String cloudSecret) {
            this.cloudSecret = Objects.requireNonNull(cloudSecret);
            return this;
        }        public SecretResponse build() {
            return new SecretResponse(cloudSecret);
        }
    }
}
