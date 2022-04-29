// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataScience.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.DataScience.outputs.GetModelDeploymentsModelDeploymentCategoryLogDetailAccess;
import com.pulumi.oci.DataScience.outputs.GetModelDeploymentsModelDeploymentCategoryLogDetailPredict;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetModelDeploymentsModelDeploymentCategoryLogDetail {
    /**
     * @return The log details.
     * 
     */
    private final List<GetModelDeploymentsModelDeploymentCategoryLogDetailAccess> accesses;
    /**
     * @return The log details.
     * 
     */
    private final List<GetModelDeploymentsModelDeploymentCategoryLogDetailPredict> predicts;

    @CustomType.Constructor
    private GetModelDeploymentsModelDeploymentCategoryLogDetail(
        @CustomType.Parameter("accesses") List<GetModelDeploymentsModelDeploymentCategoryLogDetailAccess> accesses,
        @CustomType.Parameter("predicts") List<GetModelDeploymentsModelDeploymentCategoryLogDetailPredict> predicts) {
        this.accesses = accesses;
        this.predicts = predicts;
    }

    /**
     * @return The log details.
     * 
     */
    public List<GetModelDeploymentsModelDeploymentCategoryLogDetailAccess> accesses() {
        return this.accesses;
    }
    /**
     * @return The log details.
     * 
     */
    public List<GetModelDeploymentsModelDeploymentCategoryLogDetailPredict> predicts() {
        return this.predicts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelDeploymentsModelDeploymentCategoryLogDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetModelDeploymentsModelDeploymentCategoryLogDetailAccess> accesses;
        private List<GetModelDeploymentsModelDeploymentCategoryLogDetailPredict> predicts;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelDeploymentsModelDeploymentCategoryLogDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.predicts = defaults.predicts;
        }

        public Builder accesses(List<GetModelDeploymentsModelDeploymentCategoryLogDetailAccess> accesses) {
            this.accesses = Objects.requireNonNull(accesses);
            return this;
        }
        public Builder accesses(GetModelDeploymentsModelDeploymentCategoryLogDetailAccess... accesses) {
            return accesses(List.of(accesses));
        }
        public Builder predicts(List<GetModelDeploymentsModelDeploymentCategoryLogDetailPredict> predicts) {
            this.predicts = Objects.requireNonNull(predicts);
            return this;
        }
        public Builder predicts(GetModelDeploymentsModelDeploymentCategoryLogDetailPredict... predicts) {
            return predicts(List.of(predicts));
        }        public GetModelDeploymentsModelDeploymentCategoryLogDetail build() {
            return new GetModelDeploymentsModelDeploymentCategoryLogDetail(accesses, predicts);
        }
    }
}
