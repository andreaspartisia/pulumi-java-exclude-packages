// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.run_v1.outputs.ConfigMapVolumeSourceResponse;
import io.pulumi.googlenative.run_v1.outputs.SecretVolumeSourceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VolumeResponse {
    private final ConfigMapVolumeSourceResponse configMap;
    /**
     * Volume's name. In Cloud Run Fully Managed, the name 'cloudsql' is reserved.
     * 
     */
    private final String name;
    private final SecretVolumeSourceResponse secret;

    @CustomType.Constructor
    private VolumeResponse(
        @CustomType.Parameter("configMap") ConfigMapVolumeSourceResponse configMap,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("secret") SecretVolumeSourceResponse secret) {
        this.configMap = configMap;
        this.name = name;
        this.secret = secret;
    }

    public ConfigMapVolumeSourceResponse configMap() {
        return this.configMap;
    }
    /**
     * Volume's name. In Cloud Run Fully Managed, the name 'cloudsql' is reserved.
     * 
    */
    public String name() {
        return this.name;
    }
    public SecretVolumeSourceResponse secret() {
        return this.secret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapVolumeSourceResponse configMap;
        private String name;
        private SecretVolumeSourceResponse secret;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configMap = defaults.configMap;
    	      this.name = defaults.name;
    	      this.secret = defaults.secret;
        }

        public Builder configMap(ConfigMapVolumeSourceResponse configMap) {
            this.configMap = Objects.requireNonNull(configMap);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder secret(SecretVolumeSourceResponse secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }        public VolumeResponse build() {
            return new VolumeResponse(configMap, name, secret);
        }
    }
}
