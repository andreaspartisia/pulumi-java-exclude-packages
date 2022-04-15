// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.run_v1.outputs.ConfigMapEnvSourceResponse;
import io.pulumi.googlenative.run_v1.outputs.SecretEnvSourceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EnvFromSourceResponse {
    /**
     * (Optional) The ConfigMap to select from
     * 
     */
    private final ConfigMapEnvSourceResponse configMapRef;
    /**
     * (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
     */
    private final String prefix;
    /**
     * (Optional) The Secret to select from
     * 
     */
    private final SecretEnvSourceResponse secretRef;

    @CustomType.Constructor
    private EnvFromSourceResponse(
        @CustomType.Parameter("configMapRef") ConfigMapEnvSourceResponse configMapRef,
        @CustomType.Parameter("prefix") String prefix,
        @CustomType.Parameter("secretRef") SecretEnvSourceResponse secretRef) {
        this.configMapRef = configMapRef;
        this.prefix = prefix;
        this.secretRef = secretRef;
    }

    /**
     * (Optional) The ConfigMap to select from
     * 
    */
    public ConfigMapEnvSourceResponse configMapRef() {
        return this.configMapRef;
    }
    /**
     * (Optional) An optional identifier to prepend to each key in the ConfigMap. Must be a C_IDENTIFIER.
     * 
    */
    public String prefix() {
        return this.prefix;
    }
    /**
     * (Optional) The Secret to select from
     * 
    */
    public SecretEnvSourceResponse secretRef() {
        return this.secretRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvFromSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapEnvSourceResponse configMapRef;
        private String prefix;
        private SecretEnvSourceResponse secretRef;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvFromSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMapRef = defaults.configMapRef;
    	      this.prefix = defaults.prefix;
    	      this.secretRef = defaults.secretRef;
        }

        public Builder configMapRef(ConfigMapEnvSourceResponse configMapRef) {
            this.configMapRef = Objects.requireNonNull(configMapRef);
            return this;
        }
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        public Builder secretRef(SecretEnvSourceResponse secretRef) {
            this.secretRef = Objects.requireNonNull(secretRef);
            return this;
        }        public EnvFromSourceResponse build() {
            return new EnvFromSourceResponse(configMapRef, prefix, secretRef);
        }
    }
}
