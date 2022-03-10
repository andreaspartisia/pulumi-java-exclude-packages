// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LoadBalancerBackendServerPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerBackendServerPolicyArgs Empty = new LoadBalancerBackendServerPolicyArgs();

    /**
     * The instance port to apply the policy to.
     * 
     */
    @InputImport(name="instancePort", required=true)
      private final Input<Integer> instancePort;

    public Input<Integer> getInstancePort() {
        return this.instancePort;
    }

    /**
     * The load balancer to attach the policy to.
     * 
     */
    @InputImport(name="loadBalancerName", required=true)
      private final Input<String> loadBalancerName;

    public Input<String> getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * List of Policy Names to apply to the backend server.
     * 
     */
    @InputImport(name="policyNames")
      private final @Nullable Input<List<String>> policyNames;

    public Input<List<String>> getPolicyNames() {
        return this.policyNames == null ? Input.empty() : this.policyNames;
    }

    public LoadBalancerBackendServerPolicyArgs(
        Input<Integer> instancePort,
        Input<String> loadBalancerName,
        @Nullable Input<List<String>> policyNames) {
        this.instancePort = Objects.requireNonNull(instancePort, "expected parameter 'instancePort' to be non-null");
        this.loadBalancerName = Objects.requireNonNull(loadBalancerName, "expected parameter 'loadBalancerName' to be non-null");
        this.policyNames = policyNames;
    }

    private LoadBalancerBackendServerPolicyArgs() {
        this.instancePort = Input.empty();
        this.loadBalancerName = Input.empty();
        this.policyNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerBackendServerPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> instancePort;
        private Input<String> loadBalancerName;
        private @Nullable Input<List<String>> policyNames;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerBackendServerPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePort = defaults.instancePort;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.policyNames = defaults.policyNames;
        }

        public Builder setInstancePort(Input<Integer> instancePort) {
            this.instancePort = Objects.requireNonNull(instancePort);
            return this;
        }

        public Builder setInstancePort(Integer instancePort) {
            this.instancePort = Input.of(Objects.requireNonNull(instancePort));
            return this;
        }

        public Builder setLoadBalancerName(Input<String> loadBalancerName) {
            this.loadBalancerName = Objects.requireNonNull(loadBalancerName);
            return this;
        }

        public Builder setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = Input.of(Objects.requireNonNull(loadBalancerName));
            return this;
        }

        public Builder setPolicyNames(@Nullable Input<List<String>> policyNames) {
            this.policyNames = policyNames;
            return this;
        }

        public Builder setPolicyNames(@Nullable List<String> policyNames) {
            this.policyNames = Input.ofNullable(policyNames);
            return this;
        }
        public LoadBalancerBackendServerPolicyArgs build() {
            return new LoadBalancerBackendServerPolicyArgs(instancePort, loadBalancerName, policyNames);
        }
    }
}