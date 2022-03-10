// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ClusterNodeConfigTaint {
    /**
     * Effect for taint. Accepted values are `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, and `NO_EXECUTE`.
     * 
     */
    private final String effect;
    /**
     * Key for taint.
     * 
     */
    private final String key;
    /**
     * Value for taint.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor
    private ClusterNodeConfigTaint(
        @OutputCustomType.Parameter("effect") String effect,
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("value") String value) {
        this.effect = effect;
        this.key = key;
        this.value = value;
    }

    /**
     * Effect for taint. Accepted values are `NO_SCHEDULE`, `PREFER_NO_SCHEDULE`, and `NO_EXECUTE`.
     * 
    */
    public String getEffect() {
        return this.effect;
    }
    /**
     * Key for taint.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * Value for taint.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigTaint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigTaint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effect = defaults.effect;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setEffect(String effect) {
            this.effect = Objects.requireNonNull(effect);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ClusterNodeConfigTaint build() {
            return new ClusterNodeConfigTaint(effect, key, value);
        }
    }
}
