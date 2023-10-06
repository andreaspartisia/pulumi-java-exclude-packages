// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeKvInitialData {
    private @Nullable String group;
    private String key;
    private String value;

    private EdgeKvInitialData() {}
    public Optional<String> group() {
        return Optional.ofNullable(this.group);
    }
    public String key() {
        return this.key;
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeKvInitialData defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String group;
        private String key;
        private String value;
        public Builder() {}
        public Builder(EdgeKvInitialData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder group(@Nullable String group) {

            this.group = group;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            if (key == null) {
              throw new MissingRequiredPropertyException("EdgeKvInitialData", "key");
            }
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("EdgeKvInitialData", "value");
            }
            this.value = value;
            return this;
        }
        public EdgeKvInitialData build() {
            final var _resultValue = new EdgeKvInitialData();
            _resultValue.group = group;
            _resultValue.key = key;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
