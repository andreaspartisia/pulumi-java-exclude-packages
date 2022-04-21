// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.IntegrationServiceEnvironmentAccessEndpointType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The integration service environment access endpoint.
 * 
 */
public final class IntegrationServiceEnvironmentAccessEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationServiceEnvironmentAccessEndpointArgs Empty = new IntegrationServiceEnvironmentAccessEndpointArgs();

    /**
     * The access endpoint type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,IntegrationServiceEnvironmentAccessEndpointType>> type;

    public Optional<Output<Either<String,IntegrationServiceEnvironmentAccessEndpointType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private IntegrationServiceEnvironmentAccessEndpointArgs() {}

    private IntegrationServiceEnvironmentAccessEndpointArgs(IntegrationServiceEnvironmentAccessEndpointArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationServiceEnvironmentAccessEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationServiceEnvironmentAccessEndpointArgs $;

        public Builder() {
            $ = new IntegrationServiceEnvironmentAccessEndpointArgs();
        }

        public Builder(IntegrationServiceEnvironmentAccessEndpointArgs defaults) {
            $ = new IntegrationServiceEnvironmentAccessEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<Either<String,IntegrationServiceEnvironmentAccessEndpointType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,IntegrationServiceEnvironmentAccessEndpointType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(IntegrationServiceEnvironmentAccessEndpointType type) {
            return type(Either.ofRight(type));
        }

        public IntegrationServiceEnvironmentAccessEndpointArgs build() {
            return $;
        }
    }

}
