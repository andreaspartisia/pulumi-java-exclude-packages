// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LifecyclePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecyclePolicyArgs Empty = new LifecyclePolicyArgs();

    /**
     * The policy document. This is a JSON formatted string. See more details about [Policy Parameters](http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html#lifecycle_policy_parameters) in the official AWS docs.
     * 
     */
    @InputImport(name="policy", required=true)
      private final Input<String> policy;

    public Input<String> getPolicy() {
        return this.policy;
    }

    /**
     * Name of the repository to apply the policy.
     * 
     */
    @InputImport(name="repository", required=true)
      private final Input<String> repository;

    public Input<String> getRepository() {
        return this.repository;
    }

    public LifecyclePolicyArgs(
        Input<String> policy,
        Input<String> repository) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
    }

    private LifecyclePolicyArgs() {
        this.policy = Input.empty();
        this.repository = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecyclePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> policy;
        private Input<String> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecyclePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.repository = defaults.repository;
        }

        public Builder setPolicy(Input<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }

        public Builder setRepository(Input<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }

        public Builder setRepository(String repository) {
            this.repository = Input.of(Objects.requireNonNull(repository));
            return this;
        }
        public LifecyclePolicyArgs build() {
            return new LifecyclePolicyArgs(policy, repository);
        }
    }
}