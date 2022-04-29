// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfigPreemptionAction;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfig {
    /**
     * @return The action to run when the preemptible instance is interrupted for eviction.
     * 
     */
    private final List<GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfigPreemptionAction> preemptionActions;

    @CustomType.Constructor
    private GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfig(@CustomType.Parameter("preemptionActions") List<GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfigPreemptionAction> preemptionActions) {
        this.preemptionActions = preemptionActions;
    }

    /**
     * @return The action to run when the preemptible instance is interrupted for eviction.
     * 
     */
    public List<GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfigPreemptionAction> preemptionActions() {
        return this.preemptionActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfigPreemptionAction> preemptionActions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preemptionActions = defaults.preemptionActions;
        }

        public Builder preemptionActions(List<GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfigPreemptionAction> preemptionActions) {
            this.preemptionActions = Objects.requireNonNull(preemptionActions);
            return this;
        }
        public Builder preemptionActions(GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfigPreemptionAction... preemptionActions) {
            return preemptionActions(List.of(preemptionActions));
        }        public GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfig build() {
            return new GetInstanceConfigurationInstanceDetailLaunchDetailPreemptibleInstanceConfig(preemptionActions);
        }
    }
}
