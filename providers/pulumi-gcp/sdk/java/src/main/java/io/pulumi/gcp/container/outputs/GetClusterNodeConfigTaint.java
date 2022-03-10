// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterNodeConfigTaint {
    private final String effect;
    private final String key;
    private final String value;

    @OutputCustomType.Constructor
    private GetClusterNodeConfigTaint(
        @OutputCustomType.Parameter("effect") String effect,
        @OutputCustomType.Parameter("key") String key,
        @OutputCustomType.Parameter("value") String value) {
        this.effect = effect;
        this.key = key;
        this.value = value;
    }

    public String getEffect() {
        return this.effect;
    }
    public String getKey() {
        return this.key;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigTaint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String effect;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterNodeConfigTaint defaults) {
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
        public GetClusterNodeConfigTaint build() {
            return new GetClusterNodeConfigTaint(effect, key, value);
        }
    }
}
