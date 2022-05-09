// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupContainerLivenessProbeHttpGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupContainerLivenessProbeHttpGetArgs Empty = new GroupContainerLivenessProbeHttpGetArgs();

    /**
     * Path to access on the HTTP server. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return Path to access on the HTTP server. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The port number the container will expose. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number the container will expose. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Scheme to use for connecting to the host. Possible values are `Http` and `Https`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="scheme")
    private @Nullable Output<String> scheme;

    /**
     * @return Scheme to use for connecting to the host. Possible values are `Http` and `Https`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> scheme() {
        return Optional.ofNullable(this.scheme);
    }

    private GroupContainerLivenessProbeHttpGetArgs() {}

    private GroupContainerLivenessProbeHttpGetArgs(GroupContainerLivenessProbeHttpGetArgs $) {
        this.path = $.path;
        this.port = $.port;
        this.scheme = $.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupContainerLivenessProbeHttpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupContainerLivenessProbeHttpGetArgs $;

        public Builder() {
            $ = new GroupContainerLivenessProbeHttpGetArgs();
        }

        public Builder(GroupContainerLivenessProbeHttpGetArgs defaults) {
            $ = new GroupContainerLivenessProbeHttpGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path Path to access on the HTTP server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path to access on the HTTP server. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port The port number the container will expose. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number the container will expose. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param scheme Scheme to use for connecting to the host. Possible values are `Http` and `Https`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scheme(@Nullable Output<String> scheme) {
            $.scheme = scheme;
            return this;
        }

        /**
         * @param scheme Scheme to use for connecting to the host. Possible values are `Http` and `Https`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder scheme(String scheme) {
            return scheme(Output.of(scheme));
        }

        public GroupContainerLivenessProbeHttpGetArgs build() {
            return $;
        }
    }

}
