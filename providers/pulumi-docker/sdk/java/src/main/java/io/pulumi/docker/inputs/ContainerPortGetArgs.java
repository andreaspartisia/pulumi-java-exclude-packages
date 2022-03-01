// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerPortGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPortGetArgs Empty = new ContainerPortGetArgs();

    @InputImport(name="external")
      private final @Nullable Input<Integer> external;

    public Input<Integer> getExternal() {
        return this.external == null ? Input.empty() : this.external;
    }

    @InputImport(name="internal", required=true)
      private final Input<Integer> internal;

    public Input<Integer> getInternal() {
        return this.internal;
    }

    @InputImport(name="ip")
      private final @Nullable Input<String> ip;

    public Input<String> getIp() {
        return this.ip == null ? Input.empty() : this.ip;
    }

    @InputImport(name="protocol")
      private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public ContainerPortGetArgs(
        @Nullable Input<Integer> external,
        Input<Integer> internal,
        @Nullable Input<String> ip,
        @Nullable Input<String> protocol) {
        this.external = external;
        this.internal = Objects.requireNonNull(internal, "expected parameter 'internal' to be non-null");
        this.ip = ip;
        this.protocol = protocol;
    }

    private ContainerPortGetArgs() {
        this.external = Input.empty();
        this.internal = Input.empty();
        this.ip = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPortGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> external;
        private Input<Integer> internal;
        private @Nullable Input<String> ip;
        private @Nullable Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPortGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.external = defaults.external;
    	      this.internal = defaults.internal;
    	      this.ip = defaults.ip;
    	      this.protocol = defaults.protocol;
        }

        public Builder setExternal(@Nullable Input<Integer> external) {
            this.external = external;
            return this;
        }

        public Builder setExternal(@Nullable Integer external) {
            this.external = Input.ofNullable(external);
            return this;
        }

        public Builder setInternal(Input<Integer> internal) {
            this.internal = Objects.requireNonNull(internal);
            return this;
        }

        public Builder setInternal(Integer internal) {
            this.internal = Input.of(Objects.requireNonNull(internal));
            return this;
        }

        public Builder setIp(@Nullable Input<String> ip) {
            this.ip = ip;
            return this;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = Input.ofNullable(ip);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }
        public ContainerPortGetArgs build() {
            return new ContainerPortGetArgs(external, internal, ip, protocol);
        }
    }
}
