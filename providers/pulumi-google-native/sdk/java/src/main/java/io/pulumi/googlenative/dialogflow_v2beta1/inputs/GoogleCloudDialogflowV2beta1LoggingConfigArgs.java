// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines logging behavior for conversation lifecycle events.
 * 
 */
public final class GoogleCloudDialogflowV2beta1LoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1LoggingConfigArgs Empty = new GoogleCloudDialogflowV2beta1LoggingConfigArgs();

    /**
     * Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
     * 
     */
    @Import(name="enableStackdriverLogging")
      private final @Nullable Output<Boolean> enableStackdriverLogging;

    public Output<Boolean> enableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Codegen.empty() : this.enableStackdriverLogging;
    }

    public GoogleCloudDialogflowV2beta1LoggingConfigArgs(@Nullable Output<Boolean> enableStackdriverLogging) {
        this.enableStackdriverLogging = enableStackdriverLogging;
    }

    private GoogleCloudDialogflowV2beta1LoggingConfigArgs() {
        this.enableStackdriverLogging = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1LoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableStackdriverLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1LoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
        }

        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }
        public Builder enableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Codegen.ofNullable(enableStackdriverLogging);
            return this;
        }        public GoogleCloudDialogflowV2beta1LoggingConfigArgs build() {
            return new GoogleCloudDialogflowV2beta1LoggingConfigArgs(enableStackdriverLogging);
        }
    }
}
