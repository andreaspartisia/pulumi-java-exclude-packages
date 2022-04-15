// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Dialogflow contexts are similar to natural language context. If a person says to you "they are orange", you need context in order to understand what "they" is referring to. Similarly, for Dialogflow to handle an end-user expression like that, it needs to be provided with context in order to correctly match an intent. Using contexts, you can control the flow of a conversation. You can configure contexts for an intent by setting input and output contexts, which are identified by string names. When an intent is matched, any configured output contexts for that intent become active. While any contexts are active, Dialogflow is more likely to match intents that are configured with input contexts that correspond to the currently active contexts. For more information about context, see the [Contexts guide](https://cloud.google.com/dialogflow/docs/contexts-overview).
 * 
 */
public final class GoogleCloudDialogflowV2beta1ContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1ContextArgs Empty = new GoogleCloudDialogflowV2beta1ContextArgs();

    /**
     * Optional. The number of conversational query requests after which the context expires. The default is `0`. If set to `0`, the context expires immediately. Contexts expire automatically after 20 minutes if there are no matching queries.
     * 
     */
    @Import(name="lifespanCount")
      private final @Nullable Output<Integer> lifespanCount;

    public Output<Integer> lifespanCount() {
        return this.lifespanCount == null ? Codegen.empty() : this.lifespanCount;
    }

    /**
     * The unique identifier of the context. Supported formats: - `projects//agent/sessions//contexts/`, - `projects//locations//agent/sessions//contexts/`, - `projects//agent/environments//users//sessions//contexts/`, - `projects//locations//agent/environments//users//sessions//contexts/`, The `Context ID` is always converted to lowercase, may only contain characters in a-zA-Z0-9_-% and may be at most 250 bytes long. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. The following context names are reserved for internal use by Dialogflow. You should not use these contexts or create contexts with these names: * `__system_counters__` * `*_id_dialog_context` * `*_dialog_params_size`
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Optional. The collection of parameters associated with this context. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON object composed of a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter's entity type is a composite entity: map - Else: depending on parameter value type, could be one of string, number, boolean, null, list or map - MapValue value: - If parameter's entity type is a composite entity: map from composite entity property names to property values - Else: parameter value
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,String>> parameters;

    public Output<Map<String,String>> parameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    public GoogleCloudDialogflowV2beta1ContextArgs(
        @Nullable Output<Integer> lifespanCount,
        Output<String> name,
        @Nullable Output<Map<String,String>> parameters) {
        this.lifespanCount = lifespanCount;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = parameters;
    }

    private GoogleCloudDialogflowV2beta1ContextArgs() {
        this.lifespanCount = Codegen.empty();
        this.name = Codegen.empty();
        this.parameters = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1ContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> lifespanCount;
        private Output<String> name;
        private @Nullable Output<Map<String,String>> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1ContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lifespanCount = defaults.lifespanCount;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder lifespanCount(@Nullable Output<Integer> lifespanCount) {
            this.lifespanCount = lifespanCount;
            return this;
        }
        public Builder lifespanCount(@Nullable Integer lifespanCount) {
            this.lifespanCount = Codegen.ofNullable(lifespanCount);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,String>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }        public GoogleCloudDialogflowV2beta1ContextArgs build() {
            return new GoogleCloudDialogflowV2beta1ContextArgs(lifespanCount, name, parameters);
        }
    }
}
