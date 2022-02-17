// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.awsnative.apigateway.outputs.StageAccessLogSetting;
import io.pulumi.awsnative.apigateway.outputs.StageCanarySetting;
import io.pulumi.awsnative.apigateway.outputs.StageMethodSetting;
import io.pulumi.awsnative.apigateway.outputs.StageTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStageResult {
    /**
     * Specifies settings for logging access in this stage.
     * 
     */
    private final @Nullable StageAccessLogSetting accessLogSetting;
    /**
     * Indicates whether cache clustering is enabled for the stage.
     * 
     */
    private final @Nullable Boolean cacheClusterEnabled;
    /**
     * The stage's cache cluster size.
     * 
     */
    private final @Nullable String cacheClusterSize;
    /**
     * Specifies settings for the canary deployment in this stage.
     * 
     */
    private final @Nullable StageCanarySetting canarySetting;
    /**
     * The ID of the client certificate that API Gateway uses to call your integration endpoints in the stage.
     * 
     */
    private final @Nullable String clientCertificateId;
    /**
     * The ID of the deployment that the stage is associated with. This parameter is required to create a stage.
     * 
     */
    private final @Nullable String deploymentId;
    /**
     * A description of the stage.
     * 
     */
    private final @Nullable String description;
    /**
     * The version ID of the API documentation snapshot.
     * 
     */
    private final @Nullable String documentationVersion;
    /**
     * Settings for all methods in the stage.
     * 
     */
    private final @Nullable List<StageMethodSetting> methodSettings;
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the stage.
     * 
     */
    private final @Nullable List<StageTag> tags;
    /**
     * Specifies whether active X-Ray tracing is enabled for this stage.
     * 
     */
    private final @Nullable Boolean tracingEnabled;
    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the key and the variable value is the value.
     * 
     */
    private final @Nullable Object variables;

    @OutputCustomType.Constructor({"accessLogSetting","cacheClusterEnabled","cacheClusterSize","canarySetting","clientCertificateId","deploymentId","description","documentationVersion","methodSettings","tags","tracingEnabled","variables"})
    private GetStageResult(
        @Nullable StageAccessLogSetting accessLogSetting,
        @Nullable Boolean cacheClusterEnabled,
        @Nullable String cacheClusterSize,
        @Nullable StageCanarySetting canarySetting,
        @Nullable String clientCertificateId,
        @Nullable String deploymentId,
        @Nullable String description,
        @Nullable String documentationVersion,
        @Nullable List<StageMethodSetting> methodSettings,
        @Nullable List<StageTag> tags,
        @Nullable Boolean tracingEnabled,
        @Nullable Object variables) {
        this.accessLogSetting = accessLogSetting;
        this.cacheClusterEnabled = cacheClusterEnabled;
        this.cacheClusterSize = cacheClusterSize;
        this.canarySetting = canarySetting;
        this.clientCertificateId = clientCertificateId;
        this.deploymentId = deploymentId;
        this.description = description;
        this.documentationVersion = documentationVersion;
        this.methodSettings = methodSettings;
        this.tags = tags;
        this.tracingEnabled = tracingEnabled;
        this.variables = variables;
    }

    /**
     * Specifies settings for logging access in this stage.
     * 
     */
    public Optional<StageAccessLogSetting> getAccessLogSetting() {
        return Optional.ofNullable(this.accessLogSetting);
    }
    /**
     * Indicates whether cache clustering is enabled for the stage.
     * 
     */
    public Optional<Boolean> getCacheClusterEnabled() {
        return Optional.ofNullable(this.cacheClusterEnabled);
    }
    /**
     * The stage's cache cluster size.
     * 
     */
    public Optional<String> getCacheClusterSize() {
        return Optional.ofNullable(this.cacheClusterSize);
    }
    /**
     * Specifies settings for the canary deployment in this stage.
     * 
     */
    public Optional<StageCanarySetting> getCanarySetting() {
        return Optional.ofNullable(this.canarySetting);
    }
    /**
     * The ID of the client certificate that API Gateway uses to call your integration endpoints in the stage.
     * 
     */
    public Optional<String> getClientCertificateId() {
        return Optional.ofNullable(this.clientCertificateId);
    }
    /**
     * The ID of the deployment that the stage is associated with. This parameter is required to create a stage.
     * 
     */
    public Optional<String> getDeploymentId() {
        return Optional.ofNullable(this.deploymentId);
    }
    /**
     * A description of the stage.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The version ID of the API documentation snapshot.
     * 
     */
    public Optional<String> getDocumentationVersion() {
        return Optional.ofNullable(this.documentationVersion);
    }
    /**
     * Settings for all methods in the stage.
     * 
     */
    public List<StageMethodSetting> getMethodSettings() {
        return this.methodSettings == null ? List.of() : this.methodSettings;
    }
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the stage.
     * 
     */
    public List<StageTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * Specifies whether active X-Ray tracing is enabled for this stage.
     * 
     */
    public Optional<Boolean> getTracingEnabled() {
        return Optional.ofNullable(this.tracingEnabled);
    }
    /**
     * A map (string-to-string map) that defines the stage variables, where the variable name is the key and the variable value is the value.
     * 
     */
    public Optional<Object> getVariables() {
        return Optional.ofNullable(this.variables);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StageAccessLogSetting accessLogSetting;
        private @Nullable Boolean cacheClusterEnabled;
        private @Nullable String cacheClusterSize;
        private @Nullable StageCanarySetting canarySetting;
        private @Nullable String clientCertificateId;
        private @Nullable String deploymentId;
        private @Nullable String description;
        private @Nullable String documentationVersion;
        private @Nullable List<StageMethodSetting> methodSettings;
        private @Nullable List<StageTag> tags;
        private @Nullable Boolean tracingEnabled;
        private @Nullable Object variables;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogSetting = defaults.accessLogSetting;
    	      this.cacheClusterEnabled = defaults.cacheClusterEnabled;
    	      this.cacheClusterSize = defaults.cacheClusterSize;
    	      this.canarySetting = defaults.canarySetting;
    	      this.clientCertificateId = defaults.clientCertificateId;
    	      this.deploymentId = defaults.deploymentId;
    	      this.description = defaults.description;
    	      this.documentationVersion = defaults.documentationVersion;
    	      this.methodSettings = defaults.methodSettings;
    	      this.tags = defaults.tags;
    	      this.tracingEnabled = defaults.tracingEnabled;
    	      this.variables = defaults.variables;
        }

        public Builder setAccessLogSetting(@Nullable StageAccessLogSetting accessLogSetting) {
            this.accessLogSetting = accessLogSetting;
            return this;
        }

        public Builder setCacheClusterEnabled(@Nullable Boolean cacheClusterEnabled) {
            this.cacheClusterEnabled = cacheClusterEnabled;
            return this;
        }

        public Builder setCacheClusterSize(@Nullable String cacheClusterSize) {
            this.cacheClusterSize = cacheClusterSize;
            return this;
        }

        public Builder setCanarySetting(@Nullable StageCanarySetting canarySetting) {
            this.canarySetting = canarySetting;
            return this;
        }

        public Builder setClientCertificateId(@Nullable String clientCertificateId) {
            this.clientCertificateId = clientCertificateId;
            return this;
        }

        public Builder setDeploymentId(@Nullable String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDocumentationVersion(@Nullable String documentationVersion) {
            this.documentationVersion = documentationVersion;
            return this;
        }

        public Builder setMethodSettings(@Nullable List<StageMethodSetting> methodSettings) {
            this.methodSettings = methodSettings;
            return this;
        }

        public Builder setTags(@Nullable List<StageTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTracingEnabled(@Nullable Boolean tracingEnabled) {
            this.tracingEnabled = tracingEnabled;
            return this;
        }

        public Builder setVariables(@Nullable Object variables) {
            this.variables = variables;
            return this;
        }

        public GetStageResult build() {
            return new GetStageResult(accessLogSetting, cacheClusterEnabled, cacheClusterSize, canarySetting, clientCertificateId, deploymentId, description, documentationVersion, methodSettings, tags, tracingEnabled, variables);
        }
    }
}