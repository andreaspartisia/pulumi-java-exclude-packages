// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.TokenType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The authorization properties for accessing the source code repository.
 * 
 */
public final class AuthInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthInfoArgs Empty = new AuthInfoArgs();

    /**
     * Time in seconds that the token remains valid
     * 
     */
    @Import(name="expiresIn")
    private @Nullable Output<Integer> expiresIn;

    public Optional<Output<Integer>> expiresIn() {
        return Optional.ofNullable(this.expiresIn);
    }

    /**
     * The refresh token used to refresh the access token.
     * 
     */
    @Import(name="refreshToken")
    private @Nullable Output<String> refreshToken;

    public Optional<Output<String>> refreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    /**
     * The scope of the access token.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<String> scope;

    public Optional<Output<String>> scope() {
        return Optional.ofNullable(this.scope);
    }

    /**
     * The access token used to access the source control provider.
     * 
     */
    @Import(name="token", required=true)
    private Output<String> token;

    public Output<String> token() {
        return this.token;
    }

    /**
     * The type of Auth token.
     * 
     */
    @Import(name="tokenType", required=true)
    private Output<Either<String,TokenType>> tokenType;

    public Output<Either<String,TokenType>> tokenType() {
        return this.tokenType;
    }

    private AuthInfoArgs() {}

    private AuthInfoArgs(AuthInfoArgs $) {
        this.expiresIn = $.expiresIn;
        this.refreshToken = $.refreshToken;
        this.scope = $.scope;
        this.token = $.token;
        this.tokenType = $.tokenType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthInfoArgs $;

        public Builder() {
            $ = new AuthInfoArgs();
        }

        public Builder(AuthInfoArgs defaults) {
            $ = new AuthInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder expiresIn(@Nullable Output<Integer> expiresIn) {
            $.expiresIn = expiresIn;
            return this;
        }

        public Builder expiresIn(Integer expiresIn) {
            return expiresIn(Output.of(expiresIn));
        }

        public Builder refreshToken(@Nullable Output<String> refreshToken) {
            $.refreshToken = refreshToken;
            return this;
        }

        public Builder refreshToken(String refreshToken) {
            return refreshToken(Output.of(refreshToken));
        }

        public Builder scope(@Nullable Output<String> scope) {
            $.scope = scope;
            return this;
        }

        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public Builder token(Output<String> token) {
            $.token = token;
            return this;
        }

        public Builder token(String token) {
            return token(Output.of(token));
        }

        public Builder tokenType(Output<Either<String,TokenType>> tokenType) {
            $.tokenType = tokenType;
            return this;
        }

        public Builder tokenType(Either<String,TokenType> tokenType) {
            return tokenType(Output.of(tokenType));
        }

        public Builder tokenType(String tokenType) {
            return tokenType(Either.ofLeft(tokenType));
        }

        public Builder tokenType(TokenType tokenType) {
            return tokenType(Either.ofRight(tokenType));
        }

        public AuthInfoArgs build() {
            $.token = Objects.requireNonNull($.token, "expected parameter 'token' to be non-null");
            $.tokenType = Objects.requireNonNull($.tokenType, "expected parameter 'tokenType' to be non-null");
            return $;
        }
    }

}
