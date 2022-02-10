// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayIPConfigurationResponse {
    private final String etag;
    private final @Nullable String id;
    private final @Nullable String name;
    private final String provisioningState;
    private final @Nullable SubResourceResponse subnet;
    private final String type;

    @OutputCustomType.Constructor({"etag","id","name","provisioningState","subnet","type"})
    private ApplicationGatewayIPConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable SubResourceResponse subnet,
        String type) {
        this.etag = Objects.requireNonNull(etag);
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type);
    }

    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<SubResourceResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable SubResourceResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSubnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ApplicationGatewayIPConfigurationResponse build() {
            return new ApplicationGatewayIPConfigurationResponse(etag, id, name, provisioningState, subnet, type);
        }
    }
}