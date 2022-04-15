// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.docker.inputs.NetworkIpamConfigArgs;
import io.pulumi.docker.inputs.NetworkLabelArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkArgs Empty = new NetworkArgs();

    /**
     * Enable manual container attachment to the network.
     * 
     */
    @Import(name="attachable")
      private final @Nullable Output<Boolean> attachable;

    public Output<Boolean> attachable() {
        return this.attachable == null ? Codegen.empty() : this.attachable;
    }

    /**
     * Requests daemon to check for networks with same name.
     * 
     */
    @Import(name="checkDuplicate")
      private final @Nullable Output<Boolean> checkDuplicate;

    public Output<Boolean> checkDuplicate() {
        return this.checkDuplicate == null ? Codegen.empty() : this.checkDuplicate;
    }

    /**
     * The driver of the Docker network. Possible values are `bridge`, `host`, `overlay`, `macvlan`. See [network
     * docs](https://docs.docker.com/network/#network-drivers) for more details.
     * 
     */
    @Import(name="driver")
      private final @Nullable Output<String> driver;

    public Output<String> driver() {
        return this.driver == null ? Codegen.empty() : this.driver;
    }

    /**
     * Create swarm routing-mesh network. Defaults to `false`.
     * 
     */
    @Import(name="ingress")
      private final @Nullable Output<Boolean> ingress;

    public Output<Boolean> ingress() {
        return this.ingress == null ? Codegen.empty() : this.ingress;
    }

    /**
     * Whether the network is internal.
     * 
     */
    @Import(name="internal")
      private final @Nullable Output<Boolean> internal;

    public Output<Boolean> internal() {
        return this.internal == null ? Codegen.empty() : this.internal;
    }

    /**
     * The IPAM configuration options
     * 
     */
    @Import(name="ipamConfigs")
      private final @Nullable Output<List<NetworkIpamConfigArgs>> ipamConfigs;

    public Output<List<NetworkIpamConfigArgs>> ipamConfigs() {
        return this.ipamConfigs == null ? Codegen.empty() : this.ipamConfigs;
    }

    /**
     * Driver used by the custom IP scheme of the network. Defaults to `default`
     * 
     */
    @Import(name="ipamDriver")
      private final @Nullable Output<String> ipamDriver;

    public Output<String> ipamDriver() {
        return this.ipamDriver == null ? Codegen.empty() : this.ipamDriver;
    }

    /**
     * Enable IPv6 networking. Defaults to `false`.
     * 
     */
    @Import(name="ipv6")
      private final @Nullable Output<Boolean> ipv6;

    public Output<Boolean> ipv6() {
        return this.ipv6 == null ? Codegen.empty() : this.ipv6;
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<NetworkLabelArgs>> labels;

    public Output<List<NetworkLabelArgs>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The name of the Docker network.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Only available with bridge networks. See [bridge options
     * docs](https://docs.docker.com/engine/reference/commandline/network_create/#bridge-driver-options) for more details.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<Map<String,Object>> options;

    public Output<Map<String,Object>> options() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    public NetworkArgs(
        @Nullable Output<Boolean> attachable,
        @Nullable Output<Boolean> checkDuplicate,
        @Nullable Output<String> driver,
        @Nullable Output<Boolean> ingress,
        @Nullable Output<Boolean> internal,
        @Nullable Output<List<NetworkIpamConfigArgs>> ipamConfigs,
        @Nullable Output<String> ipamDriver,
        @Nullable Output<Boolean> ipv6,
        @Nullable Output<List<NetworkLabelArgs>> labels,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,Object>> options) {
        this.attachable = attachable;
        this.checkDuplicate = checkDuplicate;
        this.driver = driver;
        this.ingress = ingress;
        this.internal = internal;
        this.ipamConfigs = ipamConfigs;
        this.ipamDriver = ipamDriver;
        this.ipv6 = ipv6;
        this.labels = labels;
        this.name = name;
        this.options = options;
    }

    private NetworkArgs() {
        this.attachable = Codegen.empty();
        this.checkDuplicate = Codegen.empty();
        this.driver = Codegen.empty();
        this.ingress = Codegen.empty();
        this.internal = Codegen.empty();
        this.ipamConfigs = Codegen.empty();
        this.ipamDriver = Codegen.empty();
        this.ipv6 = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.options = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> attachable;
        private @Nullable Output<Boolean> checkDuplicate;
        private @Nullable Output<String> driver;
        private @Nullable Output<Boolean> ingress;
        private @Nullable Output<Boolean> internal;
        private @Nullable Output<List<NetworkIpamConfigArgs>> ipamConfigs;
        private @Nullable Output<String> ipamDriver;
        private @Nullable Output<Boolean> ipv6;
        private @Nullable Output<List<NetworkLabelArgs>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,Object>> options;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachable = defaults.attachable;
    	      this.checkDuplicate = defaults.checkDuplicate;
    	      this.driver = defaults.driver;
    	      this.ingress = defaults.ingress;
    	      this.internal = defaults.internal;
    	      this.ipamConfigs = defaults.ipamConfigs;
    	      this.ipamDriver = defaults.ipamDriver;
    	      this.ipv6 = defaults.ipv6;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
        }

        public Builder attachable(@Nullable Output<Boolean> attachable) {
            this.attachable = attachable;
            return this;
        }
        public Builder attachable(@Nullable Boolean attachable) {
            this.attachable = Codegen.ofNullable(attachable);
            return this;
        }
        public Builder checkDuplicate(@Nullable Output<Boolean> checkDuplicate) {
            this.checkDuplicate = checkDuplicate;
            return this;
        }
        public Builder checkDuplicate(@Nullable Boolean checkDuplicate) {
            this.checkDuplicate = Codegen.ofNullable(checkDuplicate);
            return this;
        }
        public Builder driver(@Nullable Output<String> driver) {
            this.driver = driver;
            return this;
        }
        public Builder driver(@Nullable String driver) {
            this.driver = Codegen.ofNullable(driver);
            return this;
        }
        public Builder ingress(@Nullable Output<Boolean> ingress) {
            this.ingress = ingress;
            return this;
        }
        public Builder ingress(@Nullable Boolean ingress) {
            this.ingress = Codegen.ofNullable(ingress);
            return this;
        }
        public Builder internal(@Nullable Output<Boolean> internal) {
            this.internal = internal;
            return this;
        }
        public Builder internal(@Nullable Boolean internal) {
            this.internal = Codegen.ofNullable(internal);
            return this;
        }
        public Builder ipamConfigs(@Nullable Output<List<NetworkIpamConfigArgs>> ipamConfigs) {
            this.ipamConfigs = ipamConfigs;
            return this;
        }
        public Builder ipamConfigs(@Nullable List<NetworkIpamConfigArgs> ipamConfigs) {
            this.ipamConfigs = Codegen.ofNullable(ipamConfigs);
            return this;
        }
        public Builder ipamConfigs(NetworkIpamConfigArgs... ipamConfigs) {
            return ipamConfigs(List.of(ipamConfigs));
        }
        public Builder ipamDriver(@Nullable Output<String> ipamDriver) {
            this.ipamDriver = ipamDriver;
            return this;
        }
        public Builder ipamDriver(@Nullable String ipamDriver) {
            this.ipamDriver = Codegen.ofNullable(ipamDriver);
            return this;
        }
        public Builder ipv6(@Nullable Output<Boolean> ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public Builder ipv6(@Nullable Boolean ipv6) {
            this.ipv6 = Codegen.ofNullable(ipv6);
            return this;
        }
        public Builder labels(@Nullable Output<List<NetworkLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<NetworkLabelArgs> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder labels(NetworkLabelArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder options(@Nullable Output<Map<String,Object>> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable Map<String,Object> options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }        public NetworkArgs build() {
            return new NetworkArgs(attachable, checkDuplicate, driver, ingress, internal, ipamConfigs, ipamDriver, ipv6, labels, name, options);
        }
    }
}
