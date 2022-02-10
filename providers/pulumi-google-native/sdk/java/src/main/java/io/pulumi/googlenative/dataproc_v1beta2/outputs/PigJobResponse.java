// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.LoggingConfigResponse;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.QueryListResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class PigJobResponse {
    private final Boolean continueOnFailure;
    private final List<String> jarFileUris;
    private final LoggingConfigResponse loggingConfig;
    private final Map<String,String> properties;
    private final String queryFileUri;
    private final QueryListResponse queryList;
    private final Map<String,String> scriptVariables;

    @OutputCustomType.Constructor({"continueOnFailure","jarFileUris","loggingConfig","properties","queryFileUri","queryList","scriptVariables"})
    private PigJobResponse(
        Boolean continueOnFailure,
        List<String> jarFileUris,
        LoggingConfigResponse loggingConfig,
        Map<String,String> properties,
        String queryFileUri,
        QueryListResponse queryList,
        Map<String,String> scriptVariables) {
        this.continueOnFailure = Objects.requireNonNull(continueOnFailure);
        this.jarFileUris = Objects.requireNonNull(jarFileUris);
        this.loggingConfig = Objects.requireNonNull(loggingConfig);
        this.properties = Objects.requireNonNull(properties);
        this.queryFileUri = Objects.requireNonNull(queryFileUri);
        this.queryList = Objects.requireNonNull(queryList);
        this.scriptVariables = Objects.requireNonNull(scriptVariables);
    }

    public Boolean getContinueOnFailure() {
        return this.continueOnFailure;
    }
    public List<String> getJarFileUris() {
        return this.jarFileUris;
    }
    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }
    public Map<String,String> getProperties() {
        return this.properties;
    }
    public String getQueryFileUri() {
        return this.queryFileUri;
    }
    public QueryListResponse getQueryList() {
        return this.queryList;
    }
    public Map<String,String> getScriptVariables() {
        return this.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PigJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean continueOnFailure;
        private List<String> jarFileUris;
        private LoggingConfigResponse loggingConfig;
        private Map<String,String> properties;
        private String queryFileUri;
        private QueryListResponse queryList;
        private Map<String,String> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(PigJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder setContinueOnFailure(Boolean continueOnFailure) {
            this.continueOnFailure = Objects.requireNonNull(continueOnFailure);
            return this;
        }

        public Builder setJarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }

        public Builder setLoggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder setProperties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setQueryFileUri(String queryFileUri) {
            this.queryFileUri = Objects.requireNonNull(queryFileUri);
            return this;
        }

        public Builder setQueryList(QueryListResponse queryList) {
            this.queryList = Objects.requireNonNull(queryList);
            return this;
        }

        public Builder setScriptVariables(Map<String,String> scriptVariables) {
            this.scriptVariables = Objects.requireNonNull(scriptVariables);
            return this;
        }

        public PigJobResponse build() {
            return new PigJobResponse(continueOnFailure, jarFileUris, loggingConfig, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}