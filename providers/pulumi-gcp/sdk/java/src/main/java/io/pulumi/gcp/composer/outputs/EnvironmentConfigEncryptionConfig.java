// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class EnvironmentConfigEncryptionConfig {
    private final String kmsKeyName;

    @OutputCustomType.Constructor
    private EnvironmentConfigEncryptionConfig(@OutputCustomType.Parameter("kmsKeyName") String kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public EnvironmentConfigEncryptionConfig build() {
            return new EnvironmentConfigEncryptionConfig(kmsKeyName);
        }
    }
}
