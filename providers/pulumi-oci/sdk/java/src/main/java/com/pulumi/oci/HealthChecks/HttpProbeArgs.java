// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.HealthChecks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HttpProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpProbeArgs Empty = new HttpProbeArgs();

    /**
     * The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The OCID of the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * A dictionary of HTTP request headers.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<Map<String,Object>> headers;

    /**
     * @return A dictionary of HTTP request headers.
     * 
     */
    public Optional<Output<Map<String,Object>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The supported HTTP methods available for probes.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return The supported HTTP methods available for probes.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * The optional URL path to probe, including query parameters.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    /**
     * @return The optional URL path to probe, including query parameters.
     * 
     */
    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The supported protocols available for HTTP probes.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The supported protocols available for HTTP probes.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    /**
     * A list of targets (hostnames or IP addresses) of the probe.
     * 
     */
    @Import(name="targets", required=true)
    private Output<List<String>> targets;

    /**
     * @return A list of targets (hostnames or IP addresses) of the probe.
     * 
     */
    public Output<List<String>> targets() {
        return this.targets;
    }

    /**
     * The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
     * 
     */
    @Import(name="timeoutInSeconds")
    private @Nullable Output<Integer> timeoutInSeconds;

    /**
     * @return The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
     * 
     */
    public Optional<Output<Integer>> timeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }

    /**
     * A list of names of vantage points from which to execute the probe.
     * 
     */
    @Import(name="vantagePointNames")
    private @Nullable Output<List<String>> vantagePointNames;

    /**
     * @return A list of names of vantage points from which to execute the probe.
     * 
     */
    public Optional<Output<List<String>>> vantagePointNames() {
        return Optional.ofNullable(this.vantagePointNames);
    }

    private HttpProbeArgs() {}

    private HttpProbeArgs(HttpProbeArgs $) {
        this.compartmentId = $.compartmentId;
        this.headers = $.headers;
        this.method = $.method;
        this.path = $.path;
        this.port = $.port;
        this.protocol = $.protocol;
        this.targets = $.targets;
        this.timeoutInSeconds = $.timeoutInSeconds;
        this.vantagePointNames = $.vantagePointNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpProbeArgs $;

        public Builder() {
            $ = new HttpProbeArgs();
        }

        public Builder(HttpProbeArgs defaults) {
            $ = new HttpProbeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param headers A dictionary of HTTP request headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(@Nullable Output<Map<String,Object>> headers) {
            $.headers = headers;
            return this;
        }

        /**
         * @param headers A dictionary of HTTP request headers.
         * 
         * @return builder
         * 
         */
        public Builder headers(Map<String,Object> headers) {
            return headers(Output.of(headers));
        }

        /**
         * @param method The supported HTTP methods available for probes.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method The supported HTTP methods available for probes.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param path The optional URL path to probe, including query parameters.
         * 
         * @return builder
         * 
         */
        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path The optional URL path to probe, including query parameters.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        /**
         * @param port The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port on which to probe endpoints. If unspecified, probes will use the default port of their protocol.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param protocol The supported protocols available for HTTP probes.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The supported protocols available for HTTP probes.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param targets A list of targets (hostnames or IP addresses) of the probe.
         * 
         * @return builder
         * 
         */
        public Builder targets(Output<List<String>> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets A list of targets (hostnames or IP addresses) of the probe.
         * 
         * @return builder
         * 
         */
        public Builder targets(List<String> targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param targets A list of targets (hostnames or IP addresses) of the probe.
         * 
         * @return builder
         * 
         */
        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }

        /**
         * @param timeoutInSeconds The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
         * 
         * @return builder
         * 
         */
        public Builder timeoutInSeconds(@Nullable Output<Integer> timeoutInSeconds) {
            $.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        /**
         * @param timeoutInSeconds The probe timeout in seconds. Valid values: 10, 20, 30, and 60. The probe timeout must be less than or equal to `intervalInSeconds` for monitors.
         * 
         * @return builder
         * 
         */
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            return timeoutInSeconds(Output.of(timeoutInSeconds));
        }

        /**
         * @param vantagePointNames A list of names of vantage points from which to execute the probe.
         * 
         * @return builder
         * 
         */
        public Builder vantagePointNames(@Nullable Output<List<String>> vantagePointNames) {
            $.vantagePointNames = vantagePointNames;
            return this;
        }

        /**
         * @param vantagePointNames A list of names of vantage points from which to execute the probe.
         * 
         * @return builder
         * 
         */
        public Builder vantagePointNames(List<String> vantagePointNames) {
            return vantagePointNames(Output.of(vantagePointNames));
        }

        /**
         * @param vantagePointNames A list of names of vantage points from which to execute the probe.
         * 
         * @return builder
         * 
         */
        public Builder vantagePointNames(String... vantagePointNames) {
            return vantagePointNames(List.of(vantagePointNames));
        }

        public HttpProbeArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            $.targets = Objects.requireNonNull($.targets, "expected parameter 'targets' to be non-null");
            return $;
        }
    }

}
