// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.inputs.LogConfigCounterOptionsCustomFieldArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This is deprecated and has no effect. Do not use.
 * 
 */
public final class LogConfigCounterOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogConfigCounterOptionsArgs Empty = new LogConfigCounterOptionsArgs();

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="customFields")
      private final @Nullable Output<List<LogConfigCounterOptionsCustomFieldArgs>> customFields;

    public Output<List<LogConfigCounterOptionsCustomFieldArgs>> customFields() {
        return this.customFields == null ? Codegen.empty() : this.customFields;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="field")
      private final @Nullable Output<String> field;

    public Output<String> field() {
        return this.field == null ? Codegen.empty() : this.field;
    }

    /**
     * This is deprecated and has no effect. Do not use.
     * 
     */
    @Import(name="metric")
      private final @Nullable Output<String> metric;

    public Output<String> metric() {
        return this.metric == null ? Codegen.empty() : this.metric;
    }

    public LogConfigCounterOptionsArgs(
        @Nullable Output<List<LogConfigCounterOptionsCustomFieldArgs>> customFields,
        @Nullable Output<String> field,
        @Nullable Output<String> metric) {
        this.customFields = customFields;
        this.field = field;
        this.metric = metric;
    }

    private LogConfigCounterOptionsArgs() {
        this.customFields = Codegen.empty();
        this.field = Codegen.empty();
        this.metric = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigCounterOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<LogConfigCounterOptionsCustomFieldArgs>> customFields;
        private @Nullable Output<String> field;
        private @Nullable Output<String> metric;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigCounterOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFields = defaults.customFields;
    	      this.field = defaults.field;
    	      this.metric = defaults.metric;
        }

        public Builder customFields(@Nullable Output<List<LogConfigCounterOptionsCustomFieldArgs>> customFields) {
            this.customFields = customFields;
            return this;
        }
        public Builder customFields(@Nullable List<LogConfigCounterOptionsCustomFieldArgs> customFields) {
            this.customFields = Codegen.ofNullable(customFields);
            return this;
        }
        public Builder customFields(LogConfigCounterOptionsCustomFieldArgs... customFields) {
            return customFields(List.of(customFields));
        }
        public Builder field(@Nullable Output<String> field) {
            this.field = field;
            return this;
        }
        public Builder field(@Nullable String field) {
            this.field = Codegen.ofNullable(field);
            return this;
        }
        public Builder metric(@Nullable Output<String> metric) {
            this.metric = metric;
            return this;
        }
        public Builder metric(@Nullable String metric) {
            this.metric = Codegen.ofNullable(metric);
            return this;
        }        public LogConfigCounterOptionsArgs build() {
            return new LogConfigCounterOptionsArgs(customFields, field, metric);
        }
    }
}
