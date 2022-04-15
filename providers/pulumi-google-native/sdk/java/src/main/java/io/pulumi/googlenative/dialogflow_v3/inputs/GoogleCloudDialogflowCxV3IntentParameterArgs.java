// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents an intent parameter.
 * 
 */
public final class GoogleCloudDialogflowCxV3IntentParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3IntentParameterArgs Empty = new GoogleCloudDialogflowCxV3IntentParameterArgs();

    /**
     * The entity type of the parameter. Format: `projects/-/locations/-/agents/-/entityTypes/` for system entity types (for example, `projects/-/locations/-/agents/-/entityTypes/sys.date`), or `projects//locations//agents//entityTypes/` for developer entity types.
     * 
     */
    @Import(name="entityType", required=true)
      private final Output<String> entityType;

    public Output<String> entityType() {
        return this.entityType;
    }

    /**
     * The unique identifier of the parameter. This field is used by training phrases to annotate their parts.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    /**
     * Indicates whether the parameter represents a list of values.
     * 
     */
    @Import(name="isList")
      private final @Nullable Output<Boolean> isList;

    public Output<Boolean> isList() {
        return this.isList == null ? Codegen.empty() : this.isList;
    }

    /**
     * Indicates whether the parameter content should be redacted in log. If redaction is enabled, the parameter content will be replaced by parameter name during logging. Note: the parameter content is subject to redaction if either parameter level redaction or entity type level redaction is enabled.
     * 
     */
    @Import(name="redact")
      private final @Nullable Output<Boolean> redact;

    public Output<Boolean> redact() {
        return this.redact == null ? Codegen.empty() : this.redact;
    }

    public GoogleCloudDialogflowCxV3IntentParameterArgs(
        Output<String> entityType,
        Output<String> id,
        @Nullable Output<Boolean> isList,
        @Nullable Output<Boolean> redact) {
        this.entityType = Objects.requireNonNull(entityType, "expected parameter 'entityType' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isList = isList;
        this.redact = redact;
    }

    private GoogleCloudDialogflowCxV3IntentParameterArgs() {
        this.entityType = Codegen.empty();
        this.id = Codegen.empty();
        this.isList = Codegen.empty();
        this.redact = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3IntentParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> entityType;
        private Output<String> id;
        private @Nullable Output<Boolean> isList;
        private @Nullable Output<Boolean> redact;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3IntentParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityType = defaults.entityType;
    	      this.id = defaults.id;
    	      this.isList = defaults.isList;
    	      this.redact = defaults.redact;
        }

        public Builder entityType(Output<String> entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }
        public Builder entityType(String entityType) {
            this.entityType = Output.of(Objects.requireNonNull(entityType));
            return this;
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder isList(@Nullable Output<Boolean> isList) {
            this.isList = isList;
            return this;
        }
        public Builder isList(@Nullable Boolean isList) {
            this.isList = Codegen.ofNullable(isList);
            return this;
        }
        public Builder redact(@Nullable Output<Boolean> redact) {
            this.redact = redact;
            return this;
        }
        public Builder redact(@Nullable Boolean redact) {
            this.redact = Codegen.ofNullable(redact);
            return this;
        }        public GoogleCloudDialogflowCxV3IntentParameterArgs build() {
            return new GoogleCloudDialogflowCxV3IntentParameterArgs(entityType, id, isList, redact);
        }
    }
}
