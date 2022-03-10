// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceAttachmentConnectedEndpoint {
    private final @Nullable String endpoint;
    private final @Nullable String status;

    @OutputCustomType.Constructor
    private ServiceAttachmentConnectedEndpoint(
        @OutputCustomType.Parameter("endpoint") @Nullable String endpoint,
        @OutputCustomType.Parameter("status") @Nullable String status) {
        this.endpoint = endpoint;
        this.status = status;
    }

    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConnectedEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConnectedEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.status = defaults.status;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }
        public ServiceAttachmentConnectedEndpoint build() {
            return new ServiceAttachmentConnectedEndpoint(endpoint, status);
        }
    }
}
