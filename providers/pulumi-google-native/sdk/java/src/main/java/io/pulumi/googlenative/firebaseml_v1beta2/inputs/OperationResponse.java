// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseml_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.firebaseml_v1beta2.inputs.StatusResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * This resource represents a long-running operation that is the result of a network API call.
 * 
 */
public final class OperationResponse extends io.pulumi.resources.InvokeArgs {

    public static final OperationResponse Empty = new OperationResponse();

    /**
     * If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available.
     * 
     */
    @Import(name="done", required=true)
      private final Boolean done;

    public Boolean done() {
        return this.done;
    }

    /**
     * The error result of the operation in case of failure or cancellation.
     * 
     */
    @Import(name="error", required=true)
      private final StatusResponse error;

    public StatusResponse error() {
        return this.error;
    }

    /**
     * Service-specific metadata associated with the operation. It typically contains progress information and common metadata such as create time. Some services might not provide such metadata. Any method that returns a long-running operation should document the metadata type, if any.
     * 
     */
    @Import(name="metadata", required=true)
      private final Map<String,String> metadata;

    public Map<String,String> metadata() {
        return this.metadata;
    }

    /**
     * The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the `name` should be a resource name ending with `operations/{unique_id}`.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * The normal response of the operation in case of success. If the original method returns no data on success, such as `Delete`, the response is `google.protobuf.Empty`. If the original method is standard `Get`/`Create`/`Update`, the response should be the resource. For other methods, the response should have the type `XxxResponse`, where `Xxx` is the original method name. For example, if the original method name is `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
     * 
     */
    @Import(name="response", required=true)
      private final Map<String,String> response;

    public Map<String,String> response() {
        return this.response;
    }

    public OperationResponse(
        Boolean done,
        StatusResponse error,
        Map<String,String> metadata,
        String name,
        Map<String,String> response) {
        this.done = Objects.requireNonNull(done, "expected parameter 'done' to be non-null");
        this.error = Objects.requireNonNull(error, "expected parameter 'error' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.response = Objects.requireNonNull(response, "expected parameter 'response' to be non-null");
    }

    private OperationResponse() {
        this.done = null;
        this.error = null;
        this.metadata = Map.of();
        this.name = null;
        this.response = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean done;
        private StatusResponse error;
        private Map<String,String> metadata;
        private String name;
        private Map<String,String> response;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.done = defaults.done;
    	      this.error = defaults.error;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.response = defaults.response;
        }

        public Builder done(Boolean done) {
            this.done = Objects.requireNonNull(done);
            return this;
        }
        public Builder error(StatusResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder response(Map<String,String> response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }        public OperationResponse build() {
            return new OperationResponse(done, error, metadata, name, response);
        }
    }
}
