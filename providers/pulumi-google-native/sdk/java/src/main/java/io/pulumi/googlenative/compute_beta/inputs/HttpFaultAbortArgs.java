// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification for how requests are aborted as part of fault injection.
 * 
 */
public final class HttpFaultAbortArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpFaultAbortArgs Empty = new HttpFaultAbortArgs();

    /**
     * The HTTP status code used to abort the request. The value must be from 200 to 599 inclusive. For gRPC protocol, the gRPC status code is mapped to HTTP status code according to this mapping table. HTTP status 200 is mapped to gRPC status UNKNOWN. Injecting an OK status is currently not supported by Traffic Director.
     * 
     */
    @Import(name="httpStatus")
      private final @Nullable Output<Integer> httpStatus;

    public Output<Integer> httpStatus() {
        return this.httpStatus == null ? Codegen.empty() : this.httpStatus;
    }

    /**
     * The percentage of traffic for connections, operations, or requests that is aborted as part of fault injection. The value must be from 0.0 to 100.0 inclusive.
     * 
     */
    @Import(name="percentage")
      private final @Nullable Output<Double> percentage;

    public Output<Double> percentage() {
        return this.percentage == null ? Codegen.empty() : this.percentage;
    }

    public HttpFaultAbortArgs(
        @Nullable Output<Integer> httpStatus,
        @Nullable Output<Double> percentage) {
        this.httpStatus = httpStatus;
        this.percentage = percentage;
    }

    private HttpFaultAbortArgs() {
        this.httpStatus = Codegen.empty();
        this.percentage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpFaultAbortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> httpStatus;
        private @Nullable Output<Double> percentage;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpFaultAbortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpStatus = defaults.httpStatus;
    	      this.percentage = defaults.percentage;
        }

        public Builder httpStatus(@Nullable Output<Integer> httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }
        public Builder httpStatus(@Nullable Integer httpStatus) {
            this.httpStatus = Codegen.ofNullable(httpStatus);
            return this;
        }
        public Builder percentage(@Nullable Output<Double> percentage) {
            this.percentage = percentage;
            return this;
        }
        public Builder percentage(@Nullable Double percentage) {
            this.percentage = Codegen.ofNullable(percentage);
            return this;
        }        public HttpFaultAbortArgs build() {
            return new HttpFaultAbortArgs(httpStatus, percentage);
        }
    }
}
