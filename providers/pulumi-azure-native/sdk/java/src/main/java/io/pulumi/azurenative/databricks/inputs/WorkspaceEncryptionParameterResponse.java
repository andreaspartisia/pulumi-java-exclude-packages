// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.azurenative.databricks.inputs.EncryptionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceEncryptionParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkspaceEncryptionParameterResponse Empty = new WorkspaceEncryptionParameterResponse();

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="value")
    private final @Nullable EncryptionResponse value;

    public Optional<EncryptionResponse> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public WorkspaceEncryptionParameterResponse(
        String type,
        @Nullable EncryptionResponse value) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = value;
    }

    private WorkspaceEncryptionParameterResponse() {
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkspaceEncryptionParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private @Nullable EncryptionResponse value;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkspaceEncryptionParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setValue(@Nullable EncryptionResponse value) {
            this.value = value;
            return this;
        }

        public WorkspaceEncryptionParameterResponse build() {
            return new WorkspaceEncryptionParameterResponse(type, value);
        }
    }
}