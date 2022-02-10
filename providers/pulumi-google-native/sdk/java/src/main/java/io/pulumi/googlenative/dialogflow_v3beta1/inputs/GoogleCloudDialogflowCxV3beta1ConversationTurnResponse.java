// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse;
import java.util.Objects;


public final class GoogleCloudDialogflowCxV3beta1ConversationTurnResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1ConversationTurnResponse Empty = new GoogleCloudDialogflowCxV3beta1ConversationTurnResponse();

    @InputImport(name="userInput", required=true)
    private final GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput;

    public GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse getUserInput() {
        return this.userInput;
    }

    @InputImport(name="virtualAgentOutput", required=true)
    private final GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;

    public GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse getVirtualAgentOutput() {
        return this.virtualAgentOutput;
    }

    public GoogleCloudDialogflowCxV3beta1ConversationTurnResponse(
        GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput,
        GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput) {
        this.userInput = Objects.requireNonNull(userInput, "expected parameter 'userInput' to be non-null");
        this.virtualAgentOutput = Objects.requireNonNull(virtualAgentOutput, "expected parameter 'virtualAgentOutput' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1ConversationTurnResponse() {
        this.userInput = null;
        this.virtualAgentOutput = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ConversationTurnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput;
        private GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ConversationTurnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userInput = defaults.userInput;
    	      this.virtualAgentOutput = defaults.virtualAgentOutput;
        }

        public Builder setUserInput(GoogleCloudDialogflowCxV3beta1ConversationTurnUserInputResponse userInput) {
            this.userInput = Objects.requireNonNull(userInput);
            return this;
        }

        public Builder setVirtualAgentOutput(GoogleCloudDialogflowCxV3beta1ConversationTurnVirtualAgentOutputResponse virtualAgentOutput) {
            this.virtualAgentOutput = Objects.requireNonNull(virtualAgentOutput);
            return this;
        }

        public GoogleCloudDialogflowCxV3beta1ConversationTurnResponse build() {
            return new GoogleCloudDialogflowCxV3beta1ConversationTurnResponse(userInput, virtualAgentOutput);
        }
    }
}