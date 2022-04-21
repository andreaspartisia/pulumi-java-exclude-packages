// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.HTTPConfigurationMethod;
import com.pulumi.azurenative.network.inputs.HTTPHeaderArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the HTTP configuration.
 * 
 */
public final class ConnectionMonitorHttpConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorHttpConfigurationArgs Empty = new ConnectionMonitorHttpConfigurationArgs();

    /**
     * The HTTP method to use.
     * 
     */
    @Import(name="method")
    private @Nullable Output<Either<String,HTTPConfigurationMethod>> method;

    public Optional<Output<Either<String,HTTPConfigurationMethod>>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The path component of the URI. For instance, &#34;/dir1/dir2&#34;.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The port to connect to.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
     * 
     */
    @Import(name="preferHTTPS")
    private @Nullable Output<Boolean> preferHTTPS;

    public Optional<Output<Boolean>> preferHTTPS() {
        return Optional.ofNullable(this.preferHTTPS);
    }

    /**
     * The HTTP headers to transmit with the request.
     * 
     */
    @Import(name="requestHeaders")
    private @Nullable Output<List<HTTPHeaderArgs>> requestHeaders;

    public Optional<Output<List<HTTPHeaderArgs>>> requestHeaders() {
        return Optional.ofNullable(this.requestHeaders);
    }

    /**
     * HTTP status codes to consider successful. For instance, &#34;2xx,301-304,418&#34;.
     * 
     */
    @Import(name="validStatusCodeRanges")
    private @Nullable Output<List<String>> validStatusCodeRanges;

    public Optional<Output<List<String>>> validStatusCodeRanges() {
        return Optional.ofNullable(this.validStatusCodeRanges);
    }

    private ConnectionMonitorHttpConfigurationArgs() {}

    private ConnectionMonitorHttpConfigurationArgs(ConnectionMonitorHttpConfigurationArgs $) {
        this.method = $.method;
        this.path = $.path;
        this.port = $.port;
        this.preferHTTPS = $.preferHTTPS;
        this.requestHeaders = $.requestHeaders;
        this.validStatusCodeRanges = $.validStatusCodeRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorHttpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorHttpConfigurationArgs $;

        public Builder() {
            $ = new ConnectionMonitorHttpConfigurationArgs();
        }

        public Builder(ConnectionMonitorHttpConfigurationArgs defaults) {
            $ = new ConnectionMonitorHttpConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder method(@Nullable Output<Either<String,HTTPConfigurationMethod>> method) {
            $.method = method;
            return this;
        }

        public Builder method(Either<String,HTTPConfigurationMethod> method) {
            return method(Output.of(method));
        }

        public Builder method(String method) {
            return method(Either.ofLeft(method));
        }

        public Builder method(HTTPConfigurationMethod method) {
            return method(Either.ofRight(method));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder preferHTTPS(@Nullable Output<Boolean> preferHTTPS) {
            $.preferHTTPS = preferHTTPS;
            return this;
        }

        public Builder preferHTTPS(Boolean preferHTTPS) {
            return preferHTTPS(Output.of(preferHTTPS));
        }

        public Builder requestHeaders(@Nullable Output<List<HTTPHeaderArgs>> requestHeaders) {
            $.requestHeaders = requestHeaders;
            return this;
        }

        public Builder requestHeaders(List<HTTPHeaderArgs> requestHeaders) {
            return requestHeaders(Output.of(requestHeaders));
        }

        public Builder requestHeaders(HTTPHeaderArgs... requestHeaders) {
            return requestHeaders(List.of(requestHeaders));
        }

        public Builder validStatusCodeRanges(@Nullable Output<List<String>> validStatusCodeRanges) {
            $.validStatusCodeRanges = validStatusCodeRanges;
            return this;
        }

        public Builder validStatusCodeRanges(List<String> validStatusCodeRanges) {
            return validStatusCodeRanges(Output.of(validStatusCodeRanges));
        }

        public Builder validStatusCodeRanges(String... validStatusCodeRanges) {
            return validStatusCodeRanges(List.of(validStatusCodeRanges));
        }

        public ConnectionMonitorHttpConfigurationArgs build() {
            return $;
        }
    }

}
