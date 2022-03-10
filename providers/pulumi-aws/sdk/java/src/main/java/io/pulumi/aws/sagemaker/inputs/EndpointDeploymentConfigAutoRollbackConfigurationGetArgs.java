// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointDeploymentConfigAutoRollbackConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointDeploymentConfigAutoRollbackConfigurationGetArgs Empty = new EndpointDeploymentConfigAutoRollbackConfigurationGetArgs();

    /**
     * List of CloudWatch alarms in your account that are configured to monitor metrics on an endpoint. If any alarms are tripped during a deployment, SageMaker rolls back the deployment. See Alarms.
     * 
     */
    @InputImport(name="alarms")
      private final @Nullable Input<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs>> alarms;

    public Input<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs>> getAlarms() {
        return this.alarms == null ? Input.empty() : this.alarms;
    }

    public EndpointDeploymentConfigAutoRollbackConfigurationGetArgs(@Nullable Input<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs>> alarms) {
        this.alarms = alarms;
    }

    private EndpointDeploymentConfigAutoRollbackConfigurationGetArgs() {
        this.alarms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointDeploymentConfigAutoRollbackConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs>> alarms;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointDeploymentConfigAutoRollbackConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarms = defaults.alarms;
        }

        public Builder setAlarms(@Nullable Input<List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs>> alarms) {
            this.alarms = alarms;
            return this;
        }

        public Builder setAlarms(@Nullable List<EndpointDeploymentConfigAutoRollbackConfigurationAlarmGetArgs> alarms) {
            this.alarms = Input.ofNullable(alarms);
            return this;
        }
        public EndpointDeploymentConfigAutoRollbackConfigurationGetArgs build() {
            return new EndpointDeploymentConfigAutoRollbackConfigurationGetArgs(alarms);
        }
    }
}