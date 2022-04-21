// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.SourceRegistryLoginMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the credential parameters for accessing the source registry.
 * 
 */
public final class SourceRegistryCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceRegistryCredentialsArgs Empty = new SourceRegistryCredentialsArgs();

    /**
     * The authentication mode which determines the source registry login scope. The credentials for the source registry
     * will be generated using the given scope. These credentials will be used to login to
     * the source registry during the run.
     * 
     */
    @Import(name="loginMode")
    private @Nullable Output<Either<String,SourceRegistryLoginMode>> loginMode;

    public Optional<Output<Either<String,SourceRegistryLoginMode>>> loginMode() {
        return Optional.ofNullable(this.loginMode);
    }

    private SourceRegistryCredentialsArgs() {}

    private SourceRegistryCredentialsArgs(SourceRegistryCredentialsArgs $) {
        this.loginMode = $.loginMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceRegistryCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceRegistryCredentialsArgs $;

        public Builder() {
            $ = new SourceRegistryCredentialsArgs();
        }

        public Builder(SourceRegistryCredentialsArgs defaults) {
            $ = new SourceRegistryCredentialsArgs(Objects.requireNonNull(defaults));
        }

        public Builder loginMode(@Nullable Output<Either<String,SourceRegistryLoginMode>> loginMode) {
            $.loginMode = loginMode;
            return this;
        }

        public Builder loginMode(Either<String,SourceRegistryLoginMode> loginMode) {
            return loginMode(Output.of(loginMode));
        }

        public Builder loginMode(String loginMode) {
            return loginMode(Either.ofLeft(loginMode));
        }

        public Builder loginMode(SourceRegistryLoginMode loginMode) {
            return loginMode(Either.ofRight(loginMode));
        }

        public SourceRegistryCredentialsArgs build() {
            return $;
        }
    }

}
