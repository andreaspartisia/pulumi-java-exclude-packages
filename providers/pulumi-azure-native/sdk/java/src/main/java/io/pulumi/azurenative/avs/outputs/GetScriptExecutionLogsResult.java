// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.azurenative.avs.outputs.PSCredentialExecutionParameterResponse;
import io.pulumi.azurenative.avs.outputs.ScriptSecureStringExecutionParameterResponse;
import io.pulumi.azurenative.avs.outputs.ScriptStringExecutionParameterResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetScriptExecutionLogsResult {
    private final List<String> errors;
    private final @Nullable String failureReason;
    private final String finishedAt;
    private final @Nullable List<Object> hiddenParameters;
    private final String id;
    private final List<String> information;
    private final String name;
    private final @Nullable Map<String,Object> namedOutputs;
    private final @Nullable List<String> output;
    private final @Nullable List<Object> parameters;
    private final String provisioningState;
    private final @Nullable String retention;
    private final @Nullable String scriptCmdletId;
    private final String startedAt;
    private final String submittedAt;
    private final String timeout;
    private final String type;
    private final List<String> warnings;

    @OutputCustomType.Constructor({"errors","failureReason","finishedAt","hiddenParameters","id","information","name","namedOutputs","output","parameters","provisioningState","retention","scriptCmdletId","startedAt","submittedAt","timeout","type","warnings"})
    private GetScriptExecutionLogsResult(
        List<String> errors,
        @Nullable String failureReason,
        String finishedAt,
        @Nullable List<Object> hiddenParameters,
        String id,
        List<String> information,
        String name,
        @Nullable Map<String,Object> namedOutputs,
        @Nullable List<String> output,
        @Nullable List<Object> parameters,
        String provisioningState,
        @Nullable String retention,
        @Nullable String scriptCmdletId,
        String startedAt,
        String submittedAt,
        String timeout,
        String type,
        List<String> warnings) {
        this.errors = Objects.requireNonNull(errors);
        this.failureReason = failureReason;
        this.finishedAt = Objects.requireNonNull(finishedAt);
        this.hiddenParameters = hiddenParameters;
        this.id = Objects.requireNonNull(id);
        this.information = Objects.requireNonNull(information);
        this.name = Objects.requireNonNull(name);
        this.namedOutputs = namedOutputs;
        this.output = output;
        this.parameters = parameters;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.retention = retention;
        this.scriptCmdletId = scriptCmdletId;
        this.startedAt = Objects.requireNonNull(startedAt);
        this.submittedAt = Objects.requireNonNull(submittedAt);
        this.timeout = Objects.requireNonNull(timeout);
        this.type = Objects.requireNonNull(type);
        this.warnings = Objects.requireNonNull(warnings);
    }

    public List<String> getErrors() {
        return this.errors;
    }
    public Optional<String> getFailureReason() {
        return Optional.ofNullable(this.failureReason);
    }
    public String getFinishedAt() {
        return this.finishedAt;
    }
    public List<Object> getHiddenParameters() {
        return this.hiddenParameters == null ? List.of() : this.hiddenParameters;
    }
    public String getId() {
        return this.id;
    }
    public List<String> getInformation() {
        return this.information;
    }
    public String getName() {
        return this.name;
    }
    public Map<String,Object> getNamedOutputs() {
        return this.namedOutputs == null ? Map.of() : this.namedOutputs;
    }
    public List<String> getOutput() {
        return this.output == null ? List.of() : this.output;
    }
    public List<Object> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getRetention() {
        return Optional.ofNullable(this.retention);
    }
    public Optional<String> getScriptCmdletId() {
        return Optional.ofNullable(this.scriptCmdletId);
    }
    public String getStartedAt() {
        return this.startedAt;
    }
    public String getSubmittedAt() {
        return this.submittedAt;
    }
    public String getTimeout() {
        return this.timeout;
    }
    public String getType() {
        return this.type;
    }
    public List<String> getWarnings() {
        return this.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptExecutionLogsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> errors;
        private @Nullable String failureReason;
        private String finishedAt;
        private @Nullable List<Object> hiddenParameters;
        private String id;
        private List<String> information;
        private String name;
        private @Nullable Map<String,Object> namedOutputs;
        private @Nullable List<String> output;
        private @Nullable List<Object> parameters;
        private String provisioningState;
        private @Nullable String retention;
        private @Nullable String scriptCmdletId;
        private String startedAt;
        private String submittedAt;
        private String timeout;
        private String type;
        private List<String> warnings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptExecutionLogsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.failureReason = defaults.failureReason;
    	      this.finishedAt = defaults.finishedAt;
    	      this.hiddenParameters = defaults.hiddenParameters;
    	      this.id = defaults.id;
    	      this.information = defaults.information;
    	      this.name = defaults.name;
    	      this.namedOutputs = defaults.namedOutputs;
    	      this.output = defaults.output;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retention = defaults.retention;
    	      this.scriptCmdletId = defaults.scriptCmdletId;
    	      this.startedAt = defaults.startedAt;
    	      this.submittedAt = defaults.submittedAt;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.warnings = defaults.warnings;
        }

        public Builder setErrors(List<String> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setFailureReason(@Nullable String failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public Builder setFinishedAt(String finishedAt) {
            this.finishedAt = Objects.requireNonNull(finishedAt);
            return this;
        }

        public Builder setHiddenParameters(@Nullable List<Object> hiddenParameters) {
            this.hiddenParameters = hiddenParameters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInformation(List<String> information) {
            this.information = Objects.requireNonNull(information);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamedOutputs(@Nullable Map<String,Object> namedOutputs) {
            this.namedOutputs = namedOutputs;
            return this;
        }

        public Builder setOutput(@Nullable List<String> output) {
            this.output = output;
            return this;
        }

        public Builder setParameters(@Nullable List<Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRetention(@Nullable String retention) {
            this.retention = retention;
            return this;
        }

        public Builder setScriptCmdletId(@Nullable String scriptCmdletId) {
            this.scriptCmdletId = scriptCmdletId;
            return this;
        }

        public Builder setStartedAt(String startedAt) {
            this.startedAt = Objects.requireNonNull(startedAt);
            return this;
        }

        public Builder setSubmittedAt(String submittedAt) {
            this.submittedAt = Objects.requireNonNull(submittedAt);
            return this;
        }

        public Builder setTimeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWarnings(List<String> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }

        public GetScriptExecutionLogsResult build() {
            return new GetScriptExecutionLogsResult(errors, failureReason, finishedAt, hiddenParameters, id, information, name, namedOutputs, output, parameters, provisioningState, retention, scriptCmdletId, startedAt, submittedAt, timeout, type, warnings);
        }
    }
}