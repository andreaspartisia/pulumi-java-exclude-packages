// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse {
    /**
     * A list of cascading if-else conditions.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse(@CustomType.Parameter("cases") List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases) {
        this.cases = cases;
    }

    /**
     * A list of cascading if-else conditions.
     * 
    */
    public List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases() {
        return this.cases;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cases = defaults.cases;
        }

        public Builder cases(List<GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse> cases) {
            this.cases = Objects.requireNonNull(cases);
            return this;
        }
        public Builder cases(GoogleCloudDialogflowCxV3FulfillmentConditionalCasesCaseResponse... cases) {
            return cases(List.of(cases));
        }        public GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse build() {
            return new GoogleCloudDialogflowCxV3FulfillmentConditionalCasesResponse(cases);
        }
    }
}
