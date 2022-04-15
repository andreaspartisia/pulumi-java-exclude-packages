// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of cascading if-else conditions. Cases are mutually exclusive. The first one with a matching condition is selected, all the rest ignored.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs Empty = new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs();

    /**
     * A list of cascading if-else conditions.
     * 
     */
    @Import(name="cases")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseArgs>> cases;

    public Output<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseArgs>> cases() {
        return this.cases == null ? Codegen.empty() : this.cases;
    }

    public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseArgs>> cases) {
        this.cases = cases;
    }

    private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs() {
        this.cases = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseArgs>> cases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cases = defaults.cases;
        }

        public Builder cases(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseArgs>> cases) {
            this.cases = cases;
            return this;
        }
        public Builder cases(@Nullable List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseArgs> cases) {
            this.cases = Codegen.ofNullable(cases);
            return this;
        }
        public Builder cases(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseArgs... cases) {
            return cases(List.of(cases));
        }        public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesArgs(cases);
        }
    }
}
