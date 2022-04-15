// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Validation based on a list of allowed values.
 * 
 */
public final class ValueValidationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValueValidationArgs Empty = new ValueValidationArgs();

    /**
     * List of allowed values for the parameter.
     * 
     */
    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    public ValueValidationArgs(Output<List<String>> values) {
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private ValueValidationArgs() {
        this.values = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValueValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ValueValidationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.values = defaults.values;
        }

        public Builder values(Output<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public ValueValidationArgs build() {
            return new ValueValidationArgs(values);
        }
    }
}
