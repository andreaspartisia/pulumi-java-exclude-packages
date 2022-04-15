// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The `Status` type defines a logical error model that is suitable for different programming environments, including REST APIs and RPC APIs. It is used by [gRPC](https://github.com/grpc). Each `Status` message contains three pieces of data: error code, error message, and error details. You can find out more about this error model and how to work with it in the [API Design Guide](https://cloud.google.com/apis/design/errors).
 * 
 */
public final class StatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final StatusArgs Empty = new StatusArgs();

    /**
     * The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    @Import(name="code")
      private final @Nullable Output<Integer> code;

    public Output<Integer> code() {
        return this.code == null ? Codegen.empty() : this.code;
    }

    /**
     * A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    @Import(name="details")
      private final @Nullable Output<List<Map<String,String>>> details;

    public Output<List<Map<String,String>>> details() {
        return this.details == null ? Codegen.empty() : this.details;
    }

    /**
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> message() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    public StatusArgs(
        @Nullable Output<Integer> code,
        @Nullable Output<List<Map<String,String>>> details,
        @Nullable Output<String> message) {
        this.code = code;
        this.details = details;
        this.message = message;
    }

    private StatusArgs() {
        this.code = Codegen.empty();
        this.details = Codegen.empty();
        this.message = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> code;
        private @Nullable Output<List<Map<String,String>>> details;
        private @Nullable Output<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder code(@Nullable Output<Integer> code) {
            this.code = code;
            return this;
        }
        public Builder code(@Nullable Integer code) {
            this.code = Codegen.ofNullable(code);
            return this;
        }
        public Builder details(@Nullable Output<List<Map<String,String>>> details) {
            this.details = details;
            return this;
        }
        public Builder details(@Nullable List<Map<String,String>> details) {
            this.details = Codegen.ofNullable(details);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }        public StatusArgs build() {
            return new StatusArgs(code, details, message);
        }
    }
}
