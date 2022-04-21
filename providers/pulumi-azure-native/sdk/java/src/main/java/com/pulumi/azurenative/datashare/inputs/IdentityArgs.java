// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.azurenative.datashare.enums.Type;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity of resource
 * 
 */
public final class IdentityArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * Identity Type
     * 
     */
    @Import(name="type")
    private @Nullable Output<Either<String,Type>> type;

    public Optional<Output<Either<String,Type>>> type() {
        return Optional.ofNullable(this.type);
    }

    private IdentityArgs() {}

    private IdentityArgs(IdentityArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityArgs $;

        public Builder() {
            $ = new IdentityArgs();
        }

        public Builder(IdentityArgs defaults) {
            $ = new IdentityArgs(Objects.requireNonNull(defaults));
        }

        public Builder type(@Nullable Output<Either<String,Type>> type) {
            $.type = type;
            return this;
        }

        public Builder type(Either<String,Type> type) {
            return type(Output.of(type));
        }

        public Builder type(String type) {
            return type(Either.ofLeft(type));
        }

        public Builder type(Type type) {
            return type(Either.ofRight(type));
        }

        public IdentityArgs build() {
            return $;
        }
    }

}
