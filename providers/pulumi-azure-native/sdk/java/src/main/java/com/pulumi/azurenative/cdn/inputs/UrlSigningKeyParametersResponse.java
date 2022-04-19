// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.ResourceReferenceResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Url signing key parameters
 * 
 */
public final class UrlSigningKeyParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final UrlSigningKeyParametersResponse Empty = new UrlSigningKeyParametersResponse();

    /**
     * Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    @Import(name="keyId", required=true)
      private final String keyId;

    public String keyId() {
        return this.keyId;
    }

    /**
     * Resource reference to the KV secret
     * 
     */
    @Import(name="secretSource", required=true)
      private final ResourceReferenceResponse secretSource;

    public ResourceReferenceResponse secretSource() {
        return this.secretSource;
    }

    /**
     * Version of the secret to be used
     * 
     */
    @Import(name="secretVersion")
      private final @Nullable String secretVersion;

    public Optional<String> secretVersion() {
        return this.secretVersion == null ? Optional.empty() : Optional.ofNullable(this.secretVersion);
    }

    /**
     * The type of the Secret to create.
     * Expected value is 'UrlSigningKey'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public UrlSigningKeyParametersResponse(
        String keyId,
        ResourceReferenceResponse secretSource,
        @Nullable String secretVersion,
        String type) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.secretSource = Objects.requireNonNull(secretSource, "expected parameter 'secretSource' to be non-null");
        this.secretVersion = secretVersion;
        this.type = Codegen.stringProp("type").arg(type).require();
    }

    private UrlSigningKeyParametersResponse() {
        this.keyId = null;
        this.secretSource = null;
        this.secretVersion = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningKeyParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyId;
        private ResourceReferenceResponse secretSource;
        private @Nullable String secretVersion;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningKeyParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.secretSource = defaults.secretSource;
    	      this.secretVersion = defaults.secretVersion;
    	      this.type = defaults.type;
        }

        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder secretSource(ResourceReferenceResponse secretSource) {
            this.secretSource = Objects.requireNonNull(secretSource);
            return this;
        }
        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public UrlSigningKeyParametersResponse build() {
            return new UrlSigningKeyParametersResponse(keyId, secretSource, secretVersion, type);
        }
    }
}
