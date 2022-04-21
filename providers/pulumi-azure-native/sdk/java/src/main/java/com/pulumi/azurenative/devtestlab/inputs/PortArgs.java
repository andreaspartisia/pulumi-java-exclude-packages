// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devtestlab.inputs;

import com.pulumi.azurenative.devtestlab.enums.TransportProtocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of a network port.
 * 
 */
public final class PortArgs extends com.pulumi.resources.ResourceArgs {

    public static final PortArgs Empty = new PortArgs();

    /**
     * Backend port of the target virtual machine.
     * 
     */
    @Import(name="backendPort")
    private @Nullable Output<Integer> backendPort;

    public Optional<Output<Integer>> backendPort() {
        return Optional.ofNullable(this.backendPort);
    }

    /**
     * Protocol type of the port.
     * 
     */
    @Import(name="transportProtocol")
    private @Nullable Output<Either<String,TransportProtocol>> transportProtocol;

    public Optional<Output<Either<String,TransportProtocol>>> transportProtocol() {
        return Optional.ofNullable(this.transportProtocol);
    }

    private PortArgs() {}

    private PortArgs(PortArgs $) {
        this.backendPort = $.backendPort;
        this.transportProtocol = $.transportProtocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PortArgs $;

        public Builder() {
            $ = new PortArgs();
        }

        public Builder(PortArgs defaults) {
            $ = new PortArgs(Objects.requireNonNull(defaults));
        }

        public Builder backendPort(@Nullable Output<Integer> backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        public Builder backendPort(Integer backendPort) {
            return backendPort(Output.of(backendPort));
        }

        public Builder transportProtocol(@Nullable Output<Either<String,TransportProtocol>> transportProtocol) {
            $.transportProtocol = transportProtocol;
            return this;
        }

        public Builder transportProtocol(Either<String,TransportProtocol> transportProtocol) {
            return transportProtocol(Output.of(transportProtocol));
        }

        public Builder transportProtocol(String transportProtocol) {
            return transportProtocol(Either.ofLeft(transportProtocol));
        }

        public Builder transportProtocol(TransportProtocol transportProtocol) {
            return transportProtocol(Either.ofRight(transportProtocol));
        }

        public PortArgs build() {
            return $;
        }
    }

}
