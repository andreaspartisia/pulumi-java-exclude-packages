// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancing.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ListenerPolicyState Empty = new ListenerPolicyState();

    /**
     * The load balancer to attach the policy to.
     * 
     */
    @InputImport(name="loadBalancerName")
      private final @Nullable Input<String> loadBalancerName;

    public Input<String> getLoadBalancerName() {
        return this.loadBalancerName == null ? Input.empty() : this.loadBalancerName;
    }

    /**
     * The load balancer listener port to apply the policy to.
     * 
     */
    @InputImport(name="loadBalancerPort")
      private final @Nullable Input<Integer> loadBalancerPort;

    public Input<Integer> getLoadBalancerPort() {
        return this.loadBalancerPort == null ? Input.empty() : this.loadBalancerPort;
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

    public ListenerPolicyState(
        @Nullable Input<String> loadBalancerName,
        @Nullable Input<Integer> loadBalancerPort,
        @Nullable Input<List<String>> policyNames) {
        this.loadBalancerName = loadBalancerName;
        this.loadBalancerPort = loadBalancerPort;
        this.policyNames = policyNames;
    }

    private ListenerPolicyState() {
        this.loadBalancerName = Input.empty();
        this.loadBalancerPort = Input.empty();
        this.policyNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> loadBalancerName;
        private @Nullable Input<Integer> loadBalancerPort;
        private @Nullable Input<List<String>> policyNames;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.loadBalancerPort = defaults.loadBalancerPort;
    	      this.policyNames = defaults.policyNames;
        }

        public Builder setLoadBalancerName(@Nullable Input<String> loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }

        public Builder setLoadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = Input.ofNullable(loadBalancerName);
            return this;
        }

        public Builder setLoadBalancerPort(@Nullable Input<Integer> loadBalancerPort) {
            this.loadBalancerPort = loadBalancerPort;
            return this;
        }

        public Builder setLoadBalancerPort(@Nullable Integer loadBalancerPort) {
            this.loadBalancerPort = Input.ofNullable(loadBalancerPort);
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
        public ListenerPolicyState build() {
            return new ListenerPolicyState(loadBalancerName, loadBalancerPort, policyNames);
        }
    }
}