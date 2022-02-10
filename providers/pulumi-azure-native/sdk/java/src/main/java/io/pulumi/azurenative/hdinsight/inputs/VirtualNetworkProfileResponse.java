// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkProfileResponse Empty = new VirtualNetworkProfileResponse();

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="subnet")
    private final @Nullable String subnet;

    public Optional<String> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public VirtualNetworkProfileResponse(
        @Nullable String id,
        @Nullable String subnet) {
        this.id = id;
        this.subnet = subnet;
    }

    private VirtualNetworkProfileResponse() {
        this.id = null;
        this.subnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subnet = defaults.subnet;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setSubnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }

        public VirtualNetworkProfileResponse build() {
            return new VirtualNetworkProfileResponse(id, subnet);
        }
    }
}