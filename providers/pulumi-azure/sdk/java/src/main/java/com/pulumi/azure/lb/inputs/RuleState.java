// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleState extends com.pulumi.resources.ResourceArgs {

    public static final RuleState Empty = new RuleState();

    /**
     * A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
     * 
     */
    @Import(name="backendAddressPoolIds")
    private @Nullable Output<List<String>> backendAddressPoolIds;

    /**
     * @return A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
     * 
     */
    public Optional<Output<List<String>>> backendAddressPoolIds() {
        return Optional.ofNullable(this.backendAddressPoolIds);
    }

    /**
     * The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive.
     * 
     */
    @Import(name="backendPort")
    private @Nullable Output<Integer> backendPort;

    /**
     * @return The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive.
     * 
     */
    public Optional<Output<Integer>> backendPort() {
        return Optional.ofNullable(this.backendPort);
    }

    /**
     * Is snat enabled for this Load Balancer Rule? Default `false`.
     * 
     */
    @Import(name="disableOutboundSnat")
    private @Nullable Output<Boolean> disableOutboundSnat;

    /**
     * @return Is snat enabled for this Load Balancer Rule? Default `false`.
     * 
     */
    public Optional<Output<Boolean>> disableOutboundSnat() {
        return Optional.ofNullable(this.disableOutboundSnat);
    }

    /**
     * Are the Floating IPs enabled for this Load Balncer Rule? A &#34;floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
     * 
     */
    @Import(name="enableFloatingIp")
    private @Nullable Output<Boolean> enableFloatingIp;

    /**
     * @return Are the Floating IPs enabled for this Load Balncer Rule? A &#34;floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableFloatingIp() {
        return Optional.ofNullable(this.enableFloatingIp);
    }

    /**
     * Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
     * 
     */
    @Import(name="enableTcpReset")
    private @Nullable Output<Boolean> enableTcpReset;

    /**
     * @return Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> enableTcpReset() {
        return Optional.ofNullable(this.enableTcpReset);
    }

    @Import(name="frontendIpConfigurationId")
    private @Nullable Output<String> frontendIpConfigurationId;

    public Optional<Output<String>> frontendIpConfigurationId() {
        return Optional.ofNullable(this.frontendIpConfigurationId);
    }

    /**
     * The name of the frontend IP configuration to which the rule is associated.
     * 
     */
    @Import(name="frontendIpConfigurationName")
    private @Nullable Output<String> frontendIpConfigurationName;

    /**
     * @return The name of the frontend IP configuration to which the rule is associated.
     * 
     */
    public Optional<Output<String>> frontendIpConfigurationName() {
        return Optional.ofNullable(this.frontendIpConfigurationName);
    }

    /**
     * The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive.
     * 
     */
    @Import(name="frontendPort")
    private @Nullable Output<Integer> frontendPort;

    /**
     * @return The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive.
     * 
     */
    public Optional<Output<Integer>> frontendPort() {
        return Optional.ofNullable(this.frontendPort);
    }

    /**
     * Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30` minutes. Defaults to `4` minutes.
     * 
     */
    @Import(name="idleTimeoutInMinutes")
    private @Nullable Output<Integer> idleTimeoutInMinutes;

    /**
     * @return Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30` minutes. Defaults to `4` minutes.
     * 
     */
    public Optional<Output<Integer>> idleTimeoutInMinutes() {
        return Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    /**
     * Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where  the options are called `None`, `Client IP` and `Client IP and Protocol` respectively.
     * 
     */
    @Import(name="loadDistribution")
    private @Nullable Output<String> loadDistribution;

    /**
     * @return Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where  the options are called `None`, `Client IP` and `Client IP and Protocol` respectively.
     * 
     */
    public Optional<Output<String>> loadDistribution() {
        return Optional.ofNullable(this.loadDistribution);
    }

    /**
     * The ID of the Load Balancer in which to create the Rule.
     * 
     */
    @Import(name="loadbalancerId")
    private @Nullable Output<String> loadbalancerId;

    /**
     * @return The ID of the Load Balancer in which to create the Rule.
     * 
     */
    public Optional<Output<String>> loadbalancerId() {
        return Optional.ofNullable(this.loadbalancerId);
    }

    /**
     * Specifies the name of the LB Rule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the LB Rule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A reference to a Probe used by this Load Balancing Rule.
     * 
     */
    @Import(name="probeId")
    private @Nullable Output<String> probeId;

    /**
     * @return A reference to a Probe used by this Load Balancing Rule.
     * 
     */
    public Optional<Output<String>> probeId() {
        return Optional.ofNullable(this.probeId);
    }

    /**
     * The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    private RuleState() {}

    private RuleState(RuleState $) {
        this.backendAddressPoolIds = $.backendAddressPoolIds;
        this.backendPort = $.backendPort;
        this.disableOutboundSnat = $.disableOutboundSnat;
        this.enableFloatingIp = $.enableFloatingIp;
        this.enableTcpReset = $.enableTcpReset;
        this.frontendIpConfigurationId = $.frontendIpConfigurationId;
        this.frontendIpConfigurationName = $.frontendIpConfigurationName;
        this.frontendPort = $.frontendPort;
        this.idleTimeoutInMinutes = $.idleTimeoutInMinutes;
        this.loadDistribution = $.loadDistribution;
        this.loadbalancerId = $.loadbalancerId;
        this.name = $.name;
        this.probeId = $.probeId;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleState $;

        public Builder() {
            $ = new RuleState();
        }

        public Builder(RuleState defaults) {
            $ = new RuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendAddressPoolIds A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPoolIds(@Nullable Output<List<String>> backendAddressPoolIds) {
            $.backendAddressPoolIds = backendAddressPoolIds;
            return this;
        }

        /**
         * @param backendAddressPoolIds A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPoolIds(List<String> backendAddressPoolIds) {
            return backendAddressPoolIds(Output.of(backendAddressPoolIds));
        }

        /**
         * @param backendAddressPoolIds A list of reference to a Backend Address Pool over which this Load Balancing Rule operates.
         * 
         * @return builder
         * 
         */
        public Builder backendAddressPoolIds(String... backendAddressPoolIds) {
            return backendAddressPoolIds(List.of(backendAddressPoolIds));
        }

        /**
         * @param backendPort The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(@Nullable Output<Integer> backendPort) {
            $.backendPort = backendPort;
            return this;
        }

        /**
         * @param backendPort The port used for internal connections on the endpoint. Possible values range between 0 and 65535, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder backendPort(Integer backendPort) {
            return backendPort(Output.of(backendPort));
        }

        /**
         * @param disableOutboundSnat Is snat enabled for this Load Balancer Rule? Default `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableOutboundSnat(@Nullable Output<Boolean> disableOutboundSnat) {
            $.disableOutboundSnat = disableOutboundSnat;
            return this;
        }

        /**
         * @param disableOutboundSnat Is snat enabled for this Load Balancer Rule? Default `false`.
         * 
         * @return builder
         * 
         */
        public Builder disableOutboundSnat(Boolean disableOutboundSnat) {
            return disableOutboundSnat(Output.of(disableOutboundSnat));
        }

        /**
         * @param enableFloatingIp Are the Floating IPs enabled for this Load Balncer Rule? A &#34;floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableFloatingIp(@Nullable Output<Boolean> enableFloatingIp) {
            $.enableFloatingIp = enableFloatingIp;
            return this;
        }

        /**
         * @param enableFloatingIp Are the Floating IPs enabled for this Load Balncer Rule? A &#34;floating” IP is reassigned to a secondary server in case the primary server fails. Required to configure a SQL AlwaysOn Availability Group. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableFloatingIp(Boolean enableFloatingIp) {
            return enableFloatingIp(Output.of(enableFloatingIp));
        }

        /**
         * @param enableTcpReset Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableTcpReset(@Nullable Output<Boolean> enableTcpReset) {
            $.enableTcpReset = enableTcpReset;
            return this;
        }

        /**
         * @param enableTcpReset Is TCP Reset enabled for this Load Balancer Rule? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder enableTcpReset(Boolean enableTcpReset) {
            return enableTcpReset(Output.of(enableTcpReset));
        }

        public Builder frontendIpConfigurationId(@Nullable Output<String> frontendIpConfigurationId) {
            $.frontendIpConfigurationId = frontendIpConfigurationId;
            return this;
        }

        public Builder frontendIpConfigurationId(String frontendIpConfigurationId) {
            return frontendIpConfigurationId(Output.of(frontendIpConfigurationId));
        }

        /**
         * @param frontendIpConfigurationName The name of the frontend IP configuration to which the rule is associated.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurationName(@Nullable Output<String> frontendIpConfigurationName) {
            $.frontendIpConfigurationName = frontendIpConfigurationName;
            return this;
        }

        /**
         * @param frontendIpConfigurationName The name of the frontend IP configuration to which the rule is associated.
         * 
         * @return builder
         * 
         */
        public Builder frontendIpConfigurationName(String frontendIpConfigurationName) {
            return frontendIpConfigurationName(Output.of(frontendIpConfigurationName));
        }

        /**
         * @param frontendPort The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(@Nullable Output<Integer> frontendPort) {
            $.frontendPort = frontendPort;
            return this;
        }

        /**
         * @param frontendPort The port for the external endpoint. Port numbers for each Rule must be unique within the Load Balancer. Possible values range between 0 and 65534, inclusive.
         * 
         * @return builder
         * 
         */
        public Builder frontendPort(Integer frontendPort) {
            return frontendPort(Output.of(frontendPort));
        }

        /**
         * @param idleTimeoutInMinutes Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30` minutes. Defaults to `4` minutes.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(@Nullable Output<Integer> idleTimeoutInMinutes) {
            $.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        /**
         * @param idleTimeoutInMinutes Specifies the idle timeout in minutes for TCP connections. Valid values are between `4` and `30` minutes. Defaults to `4` minutes.
         * 
         * @return builder
         * 
         */
        public Builder idleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
            return idleTimeoutInMinutes(Output.of(idleTimeoutInMinutes));
        }

        /**
         * @param loadDistribution Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where  the options are called `None`, `Client IP` and `Client IP and Protocol` respectively.
         * 
         * @return builder
         * 
         */
        public Builder loadDistribution(@Nullable Output<String> loadDistribution) {
            $.loadDistribution = loadDistribution;
            return this;
        }

        /**
         * @param loadDistribution Specifies the load balancing distribution type to be used by the Load Balancer. Possible values are: `Default` – The load balancer is configured to use a 5 tuple hash to map traffic to available servers. `SourceIP` – The load balancer is configured to use a 2 tuple hash to map traffic to available servers. `SourceIPProtocol` – The load balancer is configured to use a 3 tuple hash to map traffic to available servers. Also known as Session Persistence, where  the options are called `None`, `Client IP` and `Client IP and Protocol` respectively.
         * 
         * @return builder
         * 
         */
        public Builder loadDistribution(String loadDistribution) {
            return loadDistribution(Output.of(loadDistribution));
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which to create the Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(@Nullable Output<String> loadbalancerId) {
            $.loadbalancerId = loadbalancerId;
            return this;
        }

        /**
         * @param loadbalancerId The ID of the Load Balancer in which to create the Rule.
         * 
         * @return builder
         * 
         */
        public Builder loadbalancerId(String loadbalancerId) {
            return loadbalancerId(Output.of(loadbalancerId));
        }

        /**
         * @param name Specifies the name of the LB Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the LB Rule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param probeId A reference to a Probe used by this Load Balancing Rule.
         * 
         * @return builder
         * 
         */
        public Builder probeId(@Nullable Output<String> probeId) {
            $.probeId = probeId;
            return this;
        }

        /**
         * @param probeId A reference to a Probe used by this Load Balancing Rule.
         * 
         * @return builder
         * 
         */
        public Builder probeId(String probeId) {
            return probeId(Output.of(probeId));
        }

        /**
         * @param protocol The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The transport protocol for the external endpoint. Possible values are `Tcp`, `Udp` or `All`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public RuleState build() {
            return $;
        }
    }

}
