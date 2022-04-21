// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins.inputs;

import com.pulumi.azurenative.digitaltwins.enums.DigitalTwinsIdentityType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The managed identity for the DigitalTwinsInstance.
 * 
 */
public final class DigitalTwinsIdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final DigitalTwinsIdentityArgs Empty = new DigitalTwinsIdentityArgs();

    /**
     * The type of Managed Identity used by the DigitalTwinsInstance. Only SystemAssigned is supported.
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,DigitalTwinsIdentityType>> type;

    public Optional<Output<Either<String,DigitalTwinsIdentityType>>> type() {
        return Optional.ofNullable(this.type);
    }

    private DigitalTwinsIdentityArgs() {}

    private DigitalTwinsIdentityArgs(DigitalTwinsIdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DigitalTwinsIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DigitalTwinsIdentityArgs $;

        public Builder() {
            $ = new DigitalTwinsIdentityArgs();
        }

        public Builder(DigitalTwinsIdentityArgs defaults) {
            $ = new DigitalTwinsIdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<Either<String,DigitalTwinsIdentityType>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,DigitalTwinsIdentityType> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(DigitalTwinsIdentityType type) {
            return type(Either.ofRight(type));
        }

        public DigitalTwinsIdentityArgs build() {
            return $;
        }
    }

}
