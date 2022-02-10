// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SecretResponse {
    private final String kmsKeyName;
    private final Map<String,String> secretEnv;

    @OutputCustomType.Constructor({"kmsKeyName","secretEnv"})
    private SecretResponse(
        String kmsKeyName,
        Map<String,String> secretEnv) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.secretEnv = Objects.requireNonNull(secretEnv);
    }

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    public Map<String,String> getSecretEnv() {
        return this.secretEnv;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private Map<String,String> secretEnv;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.secretEnv = defaults.secretEnv;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setSecretEnv(Map<String,String> secretEnv) {
            this.secretEnv = Objects.requireNonNull(secretEnv);
            return this;
        }

        public SecretResponse build() {
            return new SecretResponse(kmsKeyName, secretEnv);
        }
    }
}