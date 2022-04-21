// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.azurenative.devices.enums.IotHubSku;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the SKU of the IoT hub.
 * 
 */
public final class IotHubSkuInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final IotHubSkuInfoArgs Empty = new IotHubSkuInfoArgs();

    /**
     * The number of provisioned IoT Hub units. See: https://docs.microsoft.com/azure/azure-subscription-service-limits#iot-hub-limits.
     * 
     */
    @Import(name="capacity")
    private @Nullable Output<Double> capacity;

    public Optional<Output<Double>> capacity() {
        return Optional.ofNullable(this.capacity);
    }

    /**
     * The name of the SKU.
     * 
     */
    @Import(name="name", required=true)
    private Output<Either<String,IotHubSku>> name;

    public Output<Either<String,IotHubSku>> name() {
        return this.name;
    }

    private IotHubSkuInfoArgs() {}

    private IotHubSkuInfoArgs(IotHubSkuInfoArgs $) {
        this.capacity = $.capacity;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IotHubSkuInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IotHubSkuInfoArgs $;

        public Builder() {
            $ = new IotHubSkuInfoArgs();
        }

        public Builder(IotHubSkuInfoArgs defaults) {
            $ = new IotHubSkuInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder capacity(@Nullable Output<Double> capacity) {
            $.capacity = capacity;
            return this;
        }

        public Builder capacity(Double capacity) {
            return capacity(Output.of(capacity));
        }

        public Builder name(Output<Either<String,IotHubSku>> name) {
            $.name = name;
            return this;
        }

        public Builder name(Either<String,IotHubSku> name) {
            return name(Output.of(name));
        }

        public Builder name(String name) {
            return name(Either.ofLeft(name));
        }

        public Builder name(IotHubSku name) {
            return name(Either.ofRight(name));
        }

        public IotHubSkuInfoArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
