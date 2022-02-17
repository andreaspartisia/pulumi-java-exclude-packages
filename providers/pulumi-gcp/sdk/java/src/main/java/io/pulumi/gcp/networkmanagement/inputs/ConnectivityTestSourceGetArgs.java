// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectivityTestSourceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectivityTestSourceGetArgs Empty = new ConnectivityTestSourceGetArgs();

    /**
     * A Compute Engine instance URI.
     * 
     */
    @InputImport(name="instance")
    private final @Nullable Input<String> instance;

    public Input<String> getInstance() {
        return this.instance == null ? Input.empty() : this.instance;
    }

    /**
     * The IP address of the endpoint, which can be an external or
     * internal IP. An IPv6 address is only allowed when the test's
     * destination is a global load balancer VIP.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * A Compute Engine network URI.
     * 
     */
    @InputImport(name="network")
    private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * Type of the network where the endpoint is located.
     * Possible values are `GCP_NETWORK` and `NON_GCP_NETWORK`.
     * 
     */
    @InputImport(name="networkType")
    private final @Nullable Input<String> networkType;

    public Input<String> getNetworkType() {
        return this.networkType == null ? Input.empty() : this.networkType;
    }

    /**
     * The IP protocol port of the endpoint. Only applicable when
     * protocol is TCP or UDP.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    /**
     * Project ID where the endpoint is located. The Project ID can be
     * derived from the URI if you provide a VM instance or network URI.
     * The following are two cases where you must provide the project ID:
     * 1. Only the IP address is specified, and the IP address is within
     *    a GCP project. 2. When you are using Shared VPC and the IP address
     *    that you provide is from the service project. In this case, the
     *    network that the IP address resides in is defined in the host
     *    project.
     * 
     */
    @InputImport(name="projectId")
    private final @Nullable Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId == null ? Input.empty() : this.projectId;
    }

    public ConnectivityTestSourceGetArgs(
        @Nullable Input<String> instance,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> network,
        @Nullable Input<String> networkType,
        @Nullable Input<Integer> port,
        @Nullable Input<String> projectId) {
        this.instance = instance;
        this.ipAddress = ipAddress;
        this.network = network;
        this.networkType = networkType;
        this.port = port;
        this.projectId = projectId;
    }

    private ConnectivityTestSourceGetArgs() {
        this.instance = Input.empty();
        this.ipAddress = Input.empty();
        this.network = Input.empty();
        this.networkType = Input.empty();
        this.port = Input.empty();
        this.projectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityTestSourceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instance;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> network;
        private @Nullable Input<String> networkType;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityTestSourceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.ipAddress = defaults.ipAddress;
    	      this.network = defaults.network;
    	      this.networkType = defaults.networkType;
    	      this.port = defaults.port;
    	      this.projectId = defaults.projectId;
        }

        public Builder setInstance(@Nullable Input<String> instance) {
            this.instance = instance;
            return this;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = Input.ofNullable(instance);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
            return this;
        }

        public Builder setNetworkType(@Nullable Input<String> networkType) {
            this.networkType = networkType;
            return this;
        }

        public Builder setNetworkType(@Nullable String networkType) {
            this.networkType = Input.ofNullable(networkType);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProjectId(@Nullable Input<String> projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder setProjectId(@Nullable String projectId) {
            this.projectId = Input.ofNullable(projectId);
            return this;
        }

        public ConnectivityTestSourceGetArgs build() {
            return new ConnectivityTestSourceGetArgs(instance, ipAddress, network, networkType, port, projectId);
        }
    }
}