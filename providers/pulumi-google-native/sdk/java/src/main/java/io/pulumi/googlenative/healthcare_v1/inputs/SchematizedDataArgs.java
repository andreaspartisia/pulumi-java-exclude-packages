// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The content of an HL7v2 message in a structured format as specified by a schema.
 * 
 */
public final class SchematizedDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchematizedDataArgs Empty = new SchematizedDataArgs();

    /**
     * JSON output of the parser.
     * 
     */
    @Import(name="data")
      private final @Nullable Output<String> data;

    public Output<String> data() {
        return this.data == null ? Codegen.empty() : this.data;
    }

    /**
     * The error output of the parser.
     * 
     */
    @Import(name="error")
      private final @Nullable Output<String> error;

    public Output<String> error() {
        return this.error == null ? Codegen.empty() : this.error;
    }

    public SchematizedDataArgs(
        @Nullable Output<String> data,
        @Nullable Output<String> error) {
        this.data = data;
        this.error = error;
    }

    private SchematizedDataArgs() {
        this.data = Codegen.empty();
        this.error = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchematizedDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> data;
        private @Nullable Output<String> error;

        public Builder() {
    	      // Empty
        }

        public Builder(SchematizedDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.error = defaults.error;
        }

        public Builder data(@Nullable Output<String> data) {
            this.data = data;
            return this;
        }
        public Builder data(@Nullable String data) {
            this.data = Codegen.ofNullable(data);
            return this;
        }
        public Builder error(@Nullable Output<String> error) {
            this.error = error;
            return this;
        }
        public Builder error(@Nullable String error) {
            this.error = Codegen.ofNullable(error);
            return this;
        }        public SchematizedDataArgs build() {
            return new SchematizedDataArgs(data, error);
        }
    }
}
