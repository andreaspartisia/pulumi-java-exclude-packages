// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayPathRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayPathRuleResponse Empty = new ApplicationGatewayPathRuleResponse();

    @InputImport(name="backendAddressPool")
    private final @Nullable SubResourceResponse backendAddressPool;

    public Optional<SubResourceResponse> getBackendAddressPool() {
        return this.backendAddressPool == null ? Optional.empty() : Optional.ofNullable(this.backendAddressPool);
    }

    @InputImport(name="backendHttpSettings")
    private final @Nullable SubResourceResponse backendHttpSettings;

    public Optional<SubResourceResponse> getBackendHttpSettings() {
        return this.backendHttpSettings == null ? Optional.empty() : Optional.ofNullable(this.backendHttpSettings);
    }

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="firewallPolicy")
    private final @Nullable SubResourceResponse firewallPolicy;

    public Optional<SubResourceResponse> getFirewallPolicy() {
        return this.firewallPolicy == null ? Optional.empty() : Optional.ofNullable(this.firewallPolicy);
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="paths")
    private final @Nullable List<String> paths;

    public List<String> getPaths() {
        return this.paths == null ? List.of() : this.paths;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="redirectConfiguration")
    private final @Nullable SubResourceResponse redirectConfiguration;

    public Optional<SubResourceResponse> getRedirectConfiguration() {
        return this.redirectConfiguration == null ? Optional.empty() : Optional.ofNullable(this.redirectConfiguration);
    }

    @InputImport(name="rewriteRuleSet")
    private final @Nullable SubResourceResponse rewriteRuleSet;

    public Optional<SubResourceResponse> getRewriteRuleSet() {
        return this.rewriteRuleSet == null ? Optional.empty() : Optional.ofNullable(this.rewriteRuleSet);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ApplicationGatewayPathRuleResponse(
        @Nullable SubResourceResponse backendAddressPool,
        @Nullable SubResourceResponse backendHttpSettings,
        String etag,
        @Nullable SubResourceResponse firewallPolicy,
        @Nullable String id,
        @Nullable String name,
        @Nullable List<String> paths,
        String provisioningState,
        @Nullable SubResourceResponse redirectConfiguration,
        @Nullable SubResourceResponse rewriteRuleSet,
        String type) {
        this.backendAddressPool = backendAddressPool;
        this.backendHttpSettings = backendHttpSettings;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.firewallPolicy = firewallPolicy;
        this.id = id;
        this.name = name;
        this.paths = paths;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.redirectConfiguration = redirectConfiguration;
        this.rewriteRuleSet = rewriteRuleSet;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewayPathRuleResponse() {
        this.backendAddressPool = null;
        this.backendHttpSettings = null;
        this.etag = null;
        this.firewallPolicy = null;
        this.id = null;
        this.name = null;
        this.paths = List.of();
        this.provisioningState = null;
        this.redirectConfiguration = null;
        this.rewriteRuleSet = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayPathRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SubResourceResponse backendAddressPool;
        private @Nullable SubResourceResponse backendHttpSettings;
        private String etag;
        private @Nullable SubResourceResponse firewallPolicy;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable List<String> paths;
        private String provisioningState;
        private @Nullable SubResourceResponse redirectConfiguration;
        private @Nullable SubResourceResponse rewriteRuleSet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayPathRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddressPool = defaults.backendAddressPool;
    	      this.backendHttpSettings = defaults.backendHttpSettings;
    	      this.etag = defaults.etag;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.paths = defaults.paths;
    	      this.provisioningState = defaults.provisioningState;
    	      this.redirectConfiguration = defaults.redirectConfiguration;
    	      this.rewriteRuleSet = defaults.rewriteRuleSet;
    	      this.type = defaults.type;
        }

        public Builder setBackendAddressPool(@Nullable SubResourceResponse backendAddressPool) {
            this.backendAddressPool = backendAddressPool;
            return this;
        }

        public Builder setBackendHttpSettings(@Nullable SubResourceResponse backendHttpSettings) {
            this.backendHttpSettings = backendHttpSettings;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFirewallPolicy(@Nullable SubResourceResponse firewallPolicy) {
            this.firewallPolicy = firewallPolicy;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPaths(@Nullable List<String> paths) {
            this.paths = paths;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRedirectConfiguration(@Nullable SubResourceResponse redirectConfiguration) {
            this.redirectConfiguration = redirectConfiguration;
            return this;
        }

        public Builder setRewriteRuleSet(@Nullable SubResourceResponse rewriteRuleSet) {
            this.rewriteRuleSet = rewriteRuleSet;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ApplicationGatewayPathRuleResponse build() {
            return new ApplicationGatewayPathRuleResponse(backendAddressPool, backendHttpSettings, etag, firewallPolicy, id, name, paths, provisioningState, redirectConfiguration, rewriteRuleSet, type);
        }
    }
}