// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadBalancingRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancingRuleResponse Empty = new LoadBalancingRuleResponse();

    @InputImport(name="backendAddressPool")
    private final @Nullable SubResourceResponse backendAddressPool;

    public Optional<SubResourceResponse> getBackendAddressPool() {
        return this.backendAddressPool == null ? Optional.empty() : Optional.ofNullable(this.backendAddressPool);
    }

    @InputImport(name="backendPort")
    private final @Nullable Integer backendPort;

    public Optional<Integer> getBackendPort() {
        return this.backendPort == null ? Optional.empty() : Optional.ofNullable(this.backendPort);
    }

    @InputImport(name="disableOutboundSnat")
    private final @Nullable Boolean disableOutboundSnat;

    public Optional<Boolean> getDisableOutboundSnat() {
        return this.disableOutboundSnat == null ? Optional.empty() : Optional.ofNullable(this.disableOutboundSnat);
    }

    @InputImport(name="enableFloatingIP")
    private final @Nullable Boolean enableFloatingIP;

    public Optional<Boolean> getEnableFloatingIP() {
        return this.enableFloatingIP == null ? Optional.empty() : Optional.ofNullable(this.enableFloatingIP);
    }

    @InputImport(name="enableTcpReset")
    private final @Nullable Boolean enableTcpReset;

    public Optional<Boolean> getEnableTcpReset() {
        return this.enableTcpReset == null ? Optional.empty() : Optional.ofNullable(this.enableTcpReset);
    }

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="frontendIPConfiguration")
    private final @Nullable SubResourceResponse frontendIPConfiguration;

    public Optional<SubResourceResponse> getFrontendIPConfiguration() {
        return this.frontendIPConfiguration == null ? Optional.empty() : Optional.ofNullable(this.frontendIPConfiguration);
    }

    @InputImport(name="frontendPort", required=true)
    private final Integer frontendPort;

    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="idleTimeoutInMinutes")
    private final @Nullable Integer idleTimeoutInMinutes;

    public Optional<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Optional.empty() : Optional.ofNullable(this.idleTimeoutInMinutes);
    }

    @InputImport(name="loadDistribution")
    private final @Nullable String loadDistribution;

    public Optional<String> getLoadDistribution() {
        return this.loadDistribution == null ? Optional.empty() : Optional.ofNullable(this.loadDistribution);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="probe")
    private final @Nullable SubResourceResponse probe;

    public Optional<SubResourceResponse> getProbe() {
        return this.probe == null ? Optional.empty() : Optional.ofNullable(this.probe);
    }

    @InputImport(name="protocol", required=true)
    private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public LoadBalancingRuleResponse(
        @Nullable SubResourceResponse backendAddressPool,
        @Nullable Integer backendPort,
        @Nullable Boolean disableOutboundSnat,
        @Nullable Boolean enableFloatingIP,
        @Nullable Boolean enableTcpReset,
        String etag,
        @Nullable SubResourceResponse frontendIPConfiguration,
        Integer frontendPort,
        @Nullable String id,
        @Nullable Integer idleTimeoutInMinutes,
        @Nullable String loadDistribution,
        @Nullable String name,
        @Nullable SubResourceResponse probe,
        String protocol,
        String provisioningState,
        String type) {
        this.backendAddressPool = backendAddressPool;
        this.backendPort = backendPort;
        this.disableOutboundSnat = disableOutboundSnat;
        this.enableFloatingIP = enableFloatingIP;
        this.enableTcpReset = enableTcpReset;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.frontendIPConfiguration = frontendIPConfiguration;
        this.frontendPort = Objects.requireNonNull(frontendPort, "expected parameter 'frontendPort' to be non-null");
        this.id = id;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.loadDistribution = loadDistribution;
        this.name = name;
        this.probe = probe;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private LoadBalancingRuleResponse() {
        this.backendAddressPool = null;
        this.backendPort = null;
        this.disableOutboundSnat = null;
        this.enableFloatingIP = null;
        this.enableTcpReset = null;
        this.etag = null;
        this.frontendIPConfiguration = null;
        this.frontendPort = null;
        this.id = null;
        this.idleTimeoutInMinutes = null;
        this.loadDistribution = null;
        this.name = null;
        this.probe = null;
        this.protocol = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse backendAddressPool;
        private @Nullable Integer backendPort;
        private @Nullable Boolean disableOutboundSnat;
        private @Nullable Boolean enableFloatingIP;
        private @Nullable Boolean enableTcpReset;
        private String etag;
        private @Nullable SubResourceResponse frontendIPConfiguration;
        private Integer frontendPort;
        private @Nullable String id;
        private @Nullable Integer idleTimeoutInMinutes;
        private @Nullable String loadDistribution;
        private @Nullable String name;
        private @Nullable SubResourceResponse probe;
        private String protocol;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendPort = defaults.backendPort;
    	      this.disableOutboundSnat = defaults.disableOutboundSnat;
    	      this.enableFloatingIP = defaults.enableFloatingIP;
    	      this.enableTcpReset = defaults.enableTcpReset;
    	      this.etag = defaults.etag;
    	      this.frontendIPConfiguration = defaults.frontendIPConfiguration;
    	      this.frontendPort = defaults.frontendPort;
    	      this.id = defaults.id;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.loadDistribution = defaults.loadDistribution;
    	      this.name = defaults.name;
    	      this.probe = defaults.probe;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setBackendAddressPool(@Nullable SubResourceResponse backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder setBackendPort(@Nullable Integer backendPort) {
            this.backendPort = backendPort;
            return this;
        }

        public Builder setDisableOutboundSnat(@Nullable Boolean disableOutboundSnat) {
            this.disableOutboundSnat = disableOutboundSnat;
            return this;
        }

        public Builder setEnableFloatingIP(@Nullable Boolean enableFloatingIP) {
            this.enableFloatingIP = enableFloatingIP;
            return this;
        }

        public Builder setEnableTcpReset(@Nullable Boolean enableTcpReset) {
            this.enableTcpReset = enableTcpReset;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFrontendIPConfiguration(@Nullable SubResourceResponse frontendIPConfiguration) {
            this.frontendIPConfiguration = frontendIPConfiguration;
            return this;
        }

        public Builder setFrontendPort(Integer frontendPort) {
            this.frontendPort = Objects.requireNonNull(frontendPort);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setLoadDistribution(@Nullable String loadDistribution) {
            this.loadDistribution = loadDistribution;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProbe(@Nullable SubResourceResponse probe) {
            this.probe = probe;
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public LoadBalancingRuleResponse build() {
            return new LoadBalancingRuleResponse(backendAddressPool, backendPort, disableOutboundSnat, enableFloatingIP, enableTcpReset, etag, frontendIPConfiguration, frontendPort, id, idleTimeoutInMinutes, loadDistribution, name, probe, protocol, provisioningState, type);
        }
    }
}