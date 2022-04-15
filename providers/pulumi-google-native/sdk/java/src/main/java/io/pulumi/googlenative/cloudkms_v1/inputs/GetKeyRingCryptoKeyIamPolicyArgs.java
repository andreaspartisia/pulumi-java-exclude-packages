// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyRingCryptoKeyIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetKeyRingCryptoKeyIamPolicyArgs Empty = new GetKeyRingCryptoKeyIamPolicyArgs();

    @Import(name="cryptoKeyId", required=true)
      private final String cryptoKeyId;

    public String cryptoKeyId() {
        return this.cryptoKeyId;
    }

    @Import(name="keyRingId", required=true)
      private final String keyRingId;

    public String keyRingId() {
        return this.keyRingId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetKeyRingCryptoKeyIamPolicyArgs(
        String cryptoKeyId,
        String keyRingId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId, "expected parameter 'cryptoKeyId' to be non-null");
        this.keyRingId = Objects.requireNonNull(keyRingId, "expected parameter 'keyRingId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetKeyRingCryptoKeyIamPolicyArgs() {
        this.cryptoKeyId = null;
        this.keyRingId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyRingCryptoKeyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cryptoKeyId;
        private String keyRingId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyRingCryptoKeyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cryptoKeyId = defaults.cryptoKeyId;
    	      this.keyRingId = defaults.keyRingId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder cryptoKeyId(String cryptoKeyId) {
            this.cryptoKeyId = Objects.requireNonNull(cryptoKeyId);
            return this;
        }
        public Builder keyRingId(String keyRingId) {
            this.keyRingId = Objects.requireNonNull(keyRingId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetKeyRingCryptoKeyIamPolicyArgs build() {
            return new GetKeyRingCryptoKeyIamPolicyArgs(cryptoKeyId, keyRingId, location, optionsRequestedPolicyVersion, project);
        }
    }
}
