// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A message representing a parameter to be tuned. Contains the name of the parameter and the suggested value to use for this trial.
 * 
 */
public final class GoogleCloudMlV1_Trial_ParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_Trial_ParameterArgs Empty = new GoogleCloudMlV1_Trial_ParameterArgs();

    /**
     * Must be set if ParameterType is DOUBLE or DISCRETE.
     * 
     */
    @Import(name="floatValue")
      private final @Nullable Output<Double> floatValue;

    public Output<Double> floatValue() {
        return this.floatValue == null ? Codegen.empty() : this.floatValue;
    }

    /**
     * Must be set if ParameterType is INTEGER
     * 
     */
    @Import(name="intValue")
      private final @Nullable Output<String> intValue;

    public Output<String> intValue() {
        return this.intValue == null ? Codegen.empty() : this.intValue;
    }

    /**
     * The name of the parameter.
     * 
     */
    @Import(name="parameter")
      private final @Nullable Output<String> parameter;

    public Output<String> parameter() {
        return this.parameter == null ? Codegen.empty() : this.parameter;
    }

    /**
     * Must be set if ParameterTypeis CATEGORICAL
     * 
     */
    @Import(name="stringValue")
      private final @Nullable Output<String> stringValue;

    public Output<String> stringValue() {
        return this.stringValue == null ? Codegen.empty() : this.stringValue;
    }

    public GoogleCloudMlV1_Trial_ParameterArgs(
        @Nullable Output<Double> floatValue,
        @Nullable Output<String> intValue,
        @Nullable Output<String> parameter,
        @Nullable Output<String> stringValue) {
        this.floatValue = floatValue;
        this.intValue = intValue;
        this.parameter = parameter;
        this.stringValue = stringValue;
    }

    private GoogleCloudMlV1_Trial_ParameterArgs() {
        this.floatValue = Codegen.empty();
        this.intValue = Codegen.empty();
        this.parameter = Codegen.empty();
        this.stringValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_Trial_ParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> floatValue;
        private @Nullable Output<String> intValue;
        private @Nullable Output<String> parameter;
        private @Nullable Output<String> stringValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_Trial_ParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.floatValue = defaults.floatValue;
    	      this.intValue = defaults.intValue;
    	      this.parameter = defaults.parameter;
    	      this.stringValue = defaults.stringValue;
        }

        public Builder floatValue(@Nullable Output<Double> floatValue) {
            this.floatValue = floatValue;
            return this;
        }
        public Builder floatValue(@Nullable Double floatValue) {
            this.floatValue = Codegen.ofNullable(floatValue);
            return this;
        }
        public Builder intValue(@Nullable Output<String> intValue) {
            this.intValue = intValue;
            return this;
        }
        public Builder intValue(@Nullable String intValue) {
            this.intValue = Codegen.ofNullable(intValue);
            return this;
        }
        public Builder parameter(@Nullable Output<String> parameter) {
            this.parameter = parameter;
            return this;
        }
        public Builder parameter(@Nullable String parameter) {
            this.parameter = Codegen.ofNullable(parameter);
            return this;
        }
        public Builder stringValue(@Nullable Output<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }
        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = Codegen.ofNullable(stringValue);
            return this;
        }        public GoogleCloudMlV1_Trial_ParameterArgs build() {
            return new GoogleCloudMlV1_Trial_ParameterArgs(floatValue, intValue, parameter, stringValue);
        }
    }
}
