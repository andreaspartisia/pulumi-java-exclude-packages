// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2EnvVarSourceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * EnvVar represents an environment variable present in a Container.
 * 
 */
public final class GoogleCloudRunOpV2EnvVarResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2EnvVarResponse Empty = new GoogleCloudRunOpV2EnvVarResponse();

    /**
     * Name of the environment variable. Must be a C_IDENTIFIER, and mnay not exceed 32768 characters.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Variable references $(VAR_NAME) are expanded using the previous defined environment variables in the container and any route environment variables. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. Defaults to "", and the maximum length is 32768 bytes.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    /**
     * Source for the environment variable's value.
     * 
     */
    @Import(name="valueSource", required=true)
      private final GoogleCloudRunOpV2EnvVarSourceResponse valueSource;

    public GoogleCloudRunOpV2EnvVarSourceResponse valueSource() {
        return this.valueSource;
    }

    public GoogleCloudRunOpV2EnvVarResponse(
        String name,
        String value,
        GoogleCloudRunOpV2EnvVarSourceResponse valueSource) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
        this.valueSource = Objects.requireNonNull(valueSource, "expected parameter 'valueSource' to be non-null");
    }

    private GoogleCloudRunOpV2EnvVarResponse() {
        this.name = null;
        this.value = null;
        this.valueSource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2EnvVarResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String value;
        private GoogleCloudRunOpV2EnvVarSourceResponse valueSource;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2EnvVarResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueSource = defaults.valueSource;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder valueSource(GoogleCloudRunOpV2EnvVarSourceResponse valueSource) {
            this.valueSource = Objects.requireNonNull(valueSource);
            return this;
        }        public GoogleCloudRunOpV2EnvVarResponse build() {
            return new GoogleCloudRunOpV2EnvVarResponse(name, value, valueSource);
        }
    }
}
