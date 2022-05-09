// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomProviderResourceTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomProviderResourceTypeArgs Empty = new CustomProviderResourceTypeArgs();

    /**
     * Specifies the endpoint of the route definition.
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    /**
     * @return Specifies the endpoint of the route definition.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * Specifies the name of the route definition.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Specifies the name of the route definition.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The routing type that is supported for the resource request. Valid values are `ResourceTypeRoutingProxy` or `ResourceTypeRoutingProxyCache`. This value defaults to `ResourceTypeRoutingProxy`.
     * 
     */
    @Import(name="routingType")
    private @Nullable Output<String> routingType;

    /**
     * @return The routing type that is supported for the resource request. Valid values are `ResourceTypeRoutingProxy` or `ResourceTypeRoutingProxyCache`. This value defaults to `ResourceTypeRoutingProxy`.
     * 
     */
    public Optional<Output<String>> routingType() {
        return Optional.ofNullable(this.routingType);
    }

    private CustomProviderResourceTypeArgs() {}

    private CustomProviderResourceTypeArgs(CustomProviderResourceTypeArgs $) {
        this.endpoint = $.endpoint;
        this.name = $.name;
        this.routingType = $.routingType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomProviderResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomProviderResourceTypeArgs $;

        public Builder() {
            $ = new CustomProviderResourceTypeArgs();
        }

        public Builder(CustomProviderResourceTypeArgs defaults) {
            $ = new CustomProviderResourceTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint Specifies the endpoint of the route definition.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint Specifies the endpoint of the route definition.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param name Specifies the name of the route definition.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the route definition.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param routingType The routing type that is supported for the resource request. Valid values are `ResourceTypeRoutingProxy` or `ResourceTypeRoutingProxyCache`. This value defaults to `ResourceTypeRoutingProxy`.
         * 
         * @return builder
         * 
         */
        public Builder routingType(@Nullable Output<String> routingType) {
            $.routingType = routingType;
            return this;
        }

        /**
         * @param routingType The routing type that is supported for the resource request. Valid values are `ResourceTypeRoutingProxy` or `ResourceTypeRoutingProxyCache`. This value defaults to `ResourceTypeRoutingProxy`.
         * 
         * @return builder
         * 
         */
        public Builder routingType(String routingType) {
            return routingType(Output.of(routingType));
        }

        public CustomProviderResourceTypeArgs build() {
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
