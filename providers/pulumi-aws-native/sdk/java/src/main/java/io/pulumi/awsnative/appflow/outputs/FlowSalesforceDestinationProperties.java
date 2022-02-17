// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.enums.FlowWriteOperationType;
import io.pulumi.awsnative.appflow.outputs.FlowErrorHandlingConfig;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowSalesforceDestinationProperties {
    private final @Nullable FlowErrorHandlingConfig errorHandlingConfig;
    /**
     * List of fields used as ID when performing a write operation.
     * 
     */
    private final @Nullable List<String> idFieldNames;
    private final String object;
    private final @Nullable FlowWriteOperationType writeOperationType;

    @OutputCustomType.Constructor({"errorHandlingConfig","idFieldNames","object","writeOperationType"})
    private FlowSalesforceDestinationProperties(
        @Nullable FlowErrorHandlingConfig errorHandlingConfig,
        @Nullable List<String> idFieldNames,
        String object,
        @Nullable FlowWriteOperationType writeOperationType) {
        this.errorHandlingConfig = errorHandlingConfig;
        this.idFieldNames = idFieldNames;
        this.object = Objects.requireNonNull(object);
        this.writeOperationType = writeOperationType;
    }

    public Optional<FlowErrorHandlingConfig> getErrorHandlingConfig() {
        return Optional.ofNullable(this.errorHandlingConfig);
    }
    /**
     * List of fields used as ID when performing a write operation.
     * 
     */
    public List<String> getIdFieldNames() {
        return this.idFieldNames == null ? List.of() : this.idFieldNames;
    }
    public String getObject() {
        return this.object;
    }
    public Optional<FlowWriteOperationType> getWriteOperationType() {
        return Optional.ofNullable(this.writeOperationType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSalesforceDestinationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowErrorHandlingConfig errorHandlingConfig;
        private @Nullable List<String> idFieldNames;
        private String object;
        private @Nullable FlowWriteOperationType writeOperationType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSalesforceDestinationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorHandlingConfig = defaults.errorHandlingConfig;
    	      this.idFieldNames = defaults.idFieldNames;
    	      this.object = defaults.object;
    	      this.writeOperationType = defaults.writeOperationType;
        }

        public Builder setErrorHandlingConfig(@Nullable FlowErrorHandlingConfig errorHandlingConfig) {
            this.errorHandlingConfig = errorHandlingConfig;
            return this;
        }

        public Builder setIdFieldNames(@Nullable List<String> idFieldNames) {
            this.idFieldNames = idFieldNames;
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setWriteOperationType(@Nullable FlowWriteOperationType writeOperationType) {
            this.writeOperationType = writeOperationType;
            return this;
        }

        public FlowSalesforceDestinationProperties build() {
            return new FlowSalesforceDestinationProperties(errorHandlingConfig, idFieldNames, object, writeOperationType);
        }
    }
}