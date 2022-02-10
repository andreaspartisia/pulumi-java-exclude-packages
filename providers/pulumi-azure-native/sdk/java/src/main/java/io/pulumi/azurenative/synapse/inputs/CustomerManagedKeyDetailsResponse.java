// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.WorkspaceKeyDetailsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerManagedKeyDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomerManagedKeyDetailsResponse Empty = new CustomerManagedKeyDetailsResponse();

    @InputImport(name="key")
    private final @Nullable WorkspaceKeyDetailsResponse key;

    public Optional<WorkspaceKeyDetailsResponse> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    @InputImport(name="status", required=true)
    private final String status;

    public String getStatus() {
        return this.status;
    }

    public CustomerManagedKeyDetailsResponse(
        @Nullable WorkspaceKeyDetailsResponse key,
        String status) {
        this.key = key;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
    }

    private CustomerManagedKeyDetailsResponse() {
        this.key = null;
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerManagedKeyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkspaceKeyDetailsResponse key;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerManagedKeyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.status = defaults.status;
        }

        public Builder setKey(@Nullable WorkspaceKeyDetailsResponse key) {
            this.key = key;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public CustomerManagedKeyDetailsResponse build() {
            return new CustomerManagedKeyDetailsResponse(key, status);
        }
    }
}