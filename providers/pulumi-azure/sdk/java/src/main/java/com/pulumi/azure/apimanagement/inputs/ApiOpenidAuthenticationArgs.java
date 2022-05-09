// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiOpenidAuthenticationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiOpenidAuthenticationArgs Empty = new ApiOpenidAuthenticationArgs();

    /**
     * How to send token to the server. A list of zero or more methods. Valid values are `authorizationHeader` and `query`.
     * 
     */
    @Import(name="bearerTokenSendingMethods")
    private @Nullable Output<List<String>> bearerTokenSendingMethods;

    /**
     * @return How to send token to the server. A list of zero or more methods. Valid values are `authorizationHeader` and `query`.
     * 
     */
    public Optional<Output<List<String>>> bearerTokenSendingMethods() {
        return Optional.ofNullable(this.bearerTokenSendingMethods);
    }

    /**
     * OpenID Connect provider identifier. The name of an OpenID Connect Provider.
     * 
     */
    @Import(name="openidProviderName", required=true)
    private Output<String> openidProviderName;

    /**
     * @return OpenID Connect provider identifier. The name of an OpenID Connect Provider.
     * 
     */
    public Output<String> openidProviderName() {
        return this.openidProviderName;
    }

    private ApiOpenidAuthenticationArgs() {}

    private ApiOpenidAuthenticationArgs(ApiOpenidAuthenticationArgs $) {
        this.bearerTokenSendingMethods = $.bearerTokenSendingMethods;
        this.openidProviderName = $.openidProviderName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiOpenidAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiOpenidAuthenticationArgs $;

        public Builder() {
            $ = new ApiOpenidAuthenticationArgs();
        }

        public Builder(ApiOpenidAuthenticationArgs defaults) {
            $ = new ApiOpenidAuthenticationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bearerTokenSendingMethods How to send token to the server. A list of zero or more methods. Valid values are `authorizationHeader` and `query`.
         * 
         * @return builder
         * 
         */
        public Builder bearerTokenSendingMethods(@Nullable Output<List<String>> bearerTokenSendingMethods) {
            $.bearerTokenSendingMethods = bearerTokenSendingMethods;
            return this;
        }

        /**
         * @param bearerTokenSendingMethods How to send token to the server. A list of zero or more methods. Valid values are `authorizationHeader` and `query`.
         * 
         * @return builder
         * 
         */
        public Builder bearerTokenSendingMethods(List<String> bearerTokenSendingMethods) {
            return bearerTokenSendingMethods(Output.of(bearerTokenSendingMethods));
        }

        /**
         * @param bearerTokenSendingMethods How to send token to the server. A list of zero or more methods. Valid values are `authorizationHeader` and `query`.
         * 
         * @return builder
         * 
         */
        public Builder bearerTokenSendingMethods(String... bearerTokenSendingMethods) {
            return bearerTokenSendingMethods(List.of(bearerTokenSendingMethods));
        }

        /**
         * @param openidProviderName OpenID Connect provider identifier. The name of an OpenID Connect Provider.
         * 
         * @return builder
         * 
         */
        public Builder openidProviderName(Output<String> openidProviderName) {
            $.openidProviderName = openidProviderName;
            return this;
        }

        /**
         * @param openidProviderName OpenID Connect provider identifier. The name of an OpenID Connect Provider.
         * 
         * @return builder
         * 
         */
        public Builder openidProviderName(String openidProviderName) {
            return openidProviderName(Output.of(openidProviderName));
        }

        public ApiOpenidAuthenticationArgs build() {
            $.openidProviderName = Objects.requireNonNull($.openidProviderName, "expected parameter 'openidProviderName' to be non-null");
            return $;
        }
    }

}
