// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.CompressionSettingsResponse;
import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.azurenative.cdn.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRouteResult {
    private final @Nullable CompressionSettingsResponse compressionSettings;
    private final @Nullable List<ResourceReferenceResponse> customDomains;
    private final String deploymentStatus;
    private final @Nullable String enabledState;
    private final @Nullable String forwardingProtocol;
    private final @Nullable String httpsRedirect;
    private final String id;
    private final @Nullable String linkToDefaultDomain;
    private final String name;
    private final ResourceReferenceResponse originGroup;
    private final @Nullable String originPath;
    private final @Nullable List<String> patternsToMatch;
    private final String provisioningState;
    private final @Nullable String queryStringCachingBehavior;
    private final @Nullable List<ResourceReferenceResponse> ruleSets;
    private final @Nullable List<String> supportedProtocols;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"compressionSettings","customDomains","deploymentStatus","enabledState","forwardingProtocol","httpsRedirect","id","linkToDefaultDomain","name","originGroup","originPath","patternsToMatch","provisioningState","queryStringCachingBehavior","ruleSets","supportedProtocols","systemData","type"})
    private GetRouteResult(
        @Nullable CompressionSettingsResponse compressionSettings,
        @Nullable List<ResourceReferenceResponse> customDomains,
        String deploymentStatus,
        @Nullable String enabledState,
        @Nullable String forwardingProtocol,
        @Nullable String httpsRedirect,
        String id,
        @Nullable String linkToDefaultDomain,
        String name,
        ResourceReferenceResponse originGroup,
        @Nullable String originPath,
        @Nullable List<String> patternsToMatch,
        String provisioningState,
        @Nullable String queryStringCachingBehavior,
        @Nullable List<ResourceReferenceResponse> ruleSets,
        @Nullable List<String> supportedProtocols,
        SystemDataResponse systemData,
        String type) {
        this.compressionSettings = compressionSettings;
        this.customDomains = customDomains;
        this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
        this.enabledState = enabledState;
        this.forwardingProtocol = forwardingProtocol;
        this.httpsRedirect = httpsRedirect;
        this.id = Objects.requireNonNull(id);
        this.linkToDefaultDomain = linkToDefaultDomain;
        this.name = Objects.requireNonNull(name);
        this.originGroup = Objects.requireNonNull(originGroup);
        this.originPath = originPath;
        this.patternsToMatch = patternsToMatch;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.queryStringCachingBehavior = queryStringCachingBehavior;
        this.ruleSets = ruleSets;
        this.supportedProtocols = supportedProtocols;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<CompressionSettingsResponse> getCompressionSettings() {
        return Optional.ofNullable(this.compressionSettings);
    }
    public List<ResourceReferenceResponse> getCustomDomains() {
        return this.customDomains == null ? List.of() : this.customDomains;
    }
    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    public Optional<String> getForwardingProtocol() {
        return Optional.ofNullable(this.forwardingProtocol);
    }
    public Optional<String> getHttpsRedirect() {
        return Optional.ofNullable(this.httpsRedirect);
    }
    public String getId() {
        return this.id;
    }
    public Optional<String> getLinkToDefaultDomain() {
        return Optional.ofNullable(this.linkToDefaultDomain);
    }
    public String getName() {
        return this.name;
    }
    public ResourceReferenceResponse getOriginGroup() {
        return this.originGroup;
    }
    public Optional<String> getOriginPath() {
        return Optional.ofNullable(this.originPath);
    }
    public List<String> getPatternsToMatch() {
        return this.patternsToMatch == null ? List.of() : this.patternsToMatch;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getQueryStringCachingBehavior() {
        return Optional.ofNullable(this.queryStringCachingBehavior);
    }
    public List<ResourceReferenceResponse> getRuleSets() {
        return this.ruleSets == null ? List.of() : this.ruleSets;
    }
    public List<String> getSupportedProtocols() {
        return this.supportedProtocols == null ? List.of() : this.supportedProtocols;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CompressionSettingsResponse compressionSettings;
        private @Nullable List<ResourceReferenceResponse> customDomains;
        private String deploymentStatus;
        private @Nullable String enabledState;
        private @Nullable String forwardingProtocol;
        private @Nullable String httpsRedirect;
        private String id;
        private @Nullable String linkToDefaultDomain;
        private String name;
        private ResourceReferenceResponse originGroup;
        private @Nullable String originPath;
        private @Nullable List<String> patternsToMatch;
        private String provisioningState;
        private @Nullable String queryStringCachingBehavior;
        private @Nullable List<ResourceReferenceResponse> ruleSets;
        private @Nullable List<String> supportedProtocols;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionSettings = defaults.compressionSettings;
    	      this.customDomains = defaults.customDomains;
    	      this.deploymentStatus = defaults.deploymentStatus;
    	      this.enabledState = defaults.enabledState;
    	      this.forwardingProtocol = defaults.forwardingProtocol;
    	      this.httpsRedirect = defaults.httpsRedirect;
    	      this.id = defaults.id;
    	      this.linkToDefaultDomain = defaults.linkToDefaultDomain;
    	      this.name = defaults.name;
    	      this.originGroup = defaults.originGroup;
    	      this.originPath = defaults.originPath;
    	      this.patternsToMatch = defaults.patternsToMatch;
    	      this.provisioningState = defaults.provisioningState;
    	      this.queryStringCachingBehavior = defaults.queryStringCachingBehavior;
    	      this.ruleSets = defaults.ruleSets;
    	      this.supportedProtocols = defaults.supportedProtocols;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setCompressionSettings(@Nullable CompressionSettingsResponse compressionSettings) {
            this.compressionSettings = compressionSettings;
            return this;
        }

        public Builder setCustomDomains(@Nullable List<ResourceReferenceResponse> customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        public Builder setDeploymentStatus(String deploymentStatus) {
            this.deploymentStatus = Objects.requireNonNull(deploymentStatus);
            return this;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setForwardingProtocol(@Nullable String forwardingProtocol) {
            this.forwardingProtocol = forwardingProtocol;
            return this;
        }

        public Builder setHttpsRedirect(@Nullable String httpsRedirect) {
            this.httpsRedirect = httpsRedirect;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLinkToDefaultDomain(@Nullable String linkToDefaultDomain) {
            this.linkToDefaultDomain = linkToDefaultDomain;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOriginGroup(ResourceReferenceResponse originGroup) {
            this.originGroup = Objects.requireNonNull(originGroup);
            return this;
        }

        public Builder setOriginPath(@Nullable String originPath) {
            this.originPath = originPath;
            return this;
        }

        public Builder setPatternsToMatch(@Nullable List<String> patternsToMatch) {
            this.patternsToMatch = patternsToMatch;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setQueryStringCachingBehavior(@Nullable String queryStringCachingBehavior) {
            this.queryStringCachingBehavior = queryStringCachingBehavior;
            return this;
        }

        public Builder setRuleSets(@Nullable List<ResourceReferenceResponse> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }

        public Builder setSupportedProtocols(@Nullable List<String> supportedProtocols) {
            this.supportedProtocols = supportedProtocols;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetRouteResult build() {
            return new GetRouteResult(compressionSettings, customDomains, deploymentStatus, enabledState, forwardingProtocol, httpsRedirect, id, linkToDefaultDomain, name, originGroup, originPath, patternsToMatch, provisioningState, queryStringCachingBehavior, ruleSets, supportedProtocols, systemData, type);
        }
    }
}