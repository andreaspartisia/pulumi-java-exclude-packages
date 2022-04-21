// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.fluidrelay;

import com.pulumi.azurenative.fluidrelay.enums.ProvisioningState;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FluidRelayServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final FluidRelayServerArgs Empty = new FluidRelayServerArgs();

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Provision states for FluidRelay RP
     * 
     */
    @Import(name="provisioningState")
    private @Nullable Output<Either<String,ProvisioningState>> provisioningState;

    public Optional<Output<Either<String,ProvisioningState>>> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }

    /**
     * The resource group containing the resource.
     * 
     */
    @Import(name="resourceGroup", required=true)
    private Output<String> resourceGroup;

    public Output<String> resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private FluidRelayServerArgs() {}

    private FluidRelayServerArgs(FluidRelayServerArgs $) {
        this.location = $.location;
        this.name = $.name;
        this.provisioningState = $.provisioningState;
        this.resourceGroup = $.resourceGroup;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FluidRelayServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FluidRelayServerArgs $;

        public Builder() {
            $ = new FluidRelayServerArgs();
        }

        public Builder(FluidRelayServerArgs defaults) {
            $ = new FluidRelayServerArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder provisioningState(@Nullable Output<Either<String,ProvisioningState>> provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder provisioningState(Either<String,ProvisioningState> provisioningState) {
            return provisioningState(Output.of(provisioningState));
        }

        public Builder provisioningState(String provisioningState) {
            return provisioningState(Either.ofLeft(provisioningState));
        }

        public Builder provisioningState(ProvisioningState provisioningState) {
            return provisioningState(Either.ofRight(provisioningState));
        }

        public Builder resourceGroup(Output<String> resourceGroup) {
            $.resourceGroup = resourceGroup;
            return this;
        }

        public Builder resourceGroup(String resourceGroup) {
            return resourceGroup(Output.of(resourceGroup));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public FluidRelayServerArgs build() {
            $.resourceGroup = Objects.requireNonNull($.resourceGroup, "expected parameter 'resourceGroup' to be non-null");
            return $;
        }
    }

}
