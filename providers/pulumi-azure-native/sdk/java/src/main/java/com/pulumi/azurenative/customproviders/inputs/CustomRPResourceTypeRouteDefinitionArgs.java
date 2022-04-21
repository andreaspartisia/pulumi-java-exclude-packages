// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customproviders.inputs;

import com.pulumi.azurenative.customproviders.enums.ResourceTypeRouting;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The route definition for a resource implemented by the custom resource provider.
 * 
 */
public final class CustomRPResourceTypeRouteDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomRPResourceTypeRouteDefinitionArgs Empty = new CustomRPResourceTypeRouteDefinitionArgs();

    /**
     * The route definition endpoint URI that the custom resource provider will proxy requests to. This can be in the form of a flat URI (e.g. &#39;https://testendpoint/&#39;) or can specify to route via a path (e.g. &#39;https://testendpoint/{requestPath}&#39;)
     * 
     */
    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint;
    }

    /**
     * The name of the route definition. This becomes the name for the ARM extension (e.g. &#39;/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.CustomProviders/resourceProviders/{resourceProviderName}/{name}&#39;)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The routing types that are supported for resource requests.
     * 
     */
    @Import(name="routingType")
    private @Nullable Output<Either<String,ResourceTypeRouting>> routingType;

    public Optional<Output<Either<String,ResourceTypeRouting>>> routingType() {
        return Optional.ofNullable(this.routingType);
    }

    private CustomRPResourceTypeRouteDefinitionArgs() {}

    private CustomRPResourceTypeRouteDefinitionArgs(CustomRPResourceTypeRouteDefinitionArgs $) {
        this.endpoint = $.endpoint;
        this.name = $.name;
        this.routingType = $.routingType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomRPResourceTypeRouteDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomRPResourceTypeRouteDefinitionArgs $;

        public Builder() {
            $ = new CustomRPResourceTypeRouteDefinitionArgs();
        }

        public Builder(CustomRPResourceTypeRouteDefinitionArgs defaults) {
            $ = new CustomRPResourceTypeRouteDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder routingType(@Nullable Output<Either<String,ResourceTypeRouting>> routingType) {
            $.routingType = routingType;
            return this;
        }

        public Builder routingType(Either<String,ResourceTypeRouting> routingType) {
            return routingType(Output.of(routingType));
        }

        public Builder routingType(String routingType) {
            return routingType(Either.ofLeft(routingType));
        }

        public Builder routingType(ResourceTypeRouting routingType) {
            return routingType(Either.ofRight(routingType));
        }

        public CustomRPResourceTypeRouteDefinitionArgs build() {
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
