// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The list of messages or conditional cases to activate for this case.
 * 
 */
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentArgs Empty = new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentArgs();

    /**
     * Additional cases to be evaluated.
     * 
     */
    @Import(name="additionalCases")
      private final @Nullable Output<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs> additionalCases;

    public Output<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs> additionalCases() {
        return this.additionalCases == null ? Codegen.empty() : this.additionalCases;
    }

    /**
     * Returned message.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<GoogleCloudDialogflowCxV3ResponseMessageArgs> message;

    public Output<GoogleCloudDialogflowCxV3ResponseMessageArgs> message() {
        return this.message == null ? Codegen.empty() : this.message;
    }

    public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentArgs(
        @Nullable Output<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs> additionalCases,
        @Nullable Output<GoogleCloudDialogflowCxV3ResponseMessageArgs> message) {
        this.additionalCases = additionalCases;
        this.message = message;
    }

    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentArgs() {
        this.additionalCases = Codegen.empty();
        this.message = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs> additionalCases;
        private @Nullable Output<GoogleCloudDialogflowCxV3ResponseMessageArgs> message;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCases = defaults.additionalCases;
    	      this.message = defaults.message;
        }

        public Builder additionalCases(@Nullable Output<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs> additionalCases) {
            this.additionalCases = additionalCases;
            return this;
        }
        public Builder additionalCases(@Nullable GoogleCloudDialogflowCxV3FulfillmentConditionalCasesArgs additionalCases) {
            this.additionalCases = Codegen.ofNullable(additionalCases);
            return this;
        }
        public Builder message(@Nullable Output<GoogleCloudDialogflowCxV3ResponseMessageArgs> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable GoogleCloudDialogflowCxV3ResponseMessageArgs message) {
            this.message = Codegen.ofNullable(message);
            return this;
        }        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentArgs build() {
            return new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseCaseContentArgs(additionalCases, message);
        }
    }
}
