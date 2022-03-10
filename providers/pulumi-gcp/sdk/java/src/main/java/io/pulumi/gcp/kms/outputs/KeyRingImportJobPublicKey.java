// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.kms.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyRingImportJobPublicKey {
    private final @Nullable String pem;

    @OutputCustomType.Constructor
    private KeyRingImportJobPublicKey(@OutputCustomType.Parameter("pem") @Nullable String pem) {
        this.pem = pem;
    }

    public Optional<String> getPem() {
        return Optional.ofNullable(this.pem);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRingImportJobPublicKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String pem;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRingImportJobPublicKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pem = defaults.pem;
        }

        public Builder setPem(@Nullable String pem) {
            this.pem = pem;
            return this;
        }
        public KeyRingImportJobPublicKey build() {
            return new KeyRingImportJobPublicKey(pem);
        }
    }
}
