// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.SubsettingPolicy;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubsettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubsettingArgs Empty = new SubsettingArgs();

    @InputImport(name="policy")
    private final @Nullable Input<SubsettingPolicy> policy;

    public Input<SubsettingPolicy> getPolicy() {
        return this.policy == null ? Input.empty() : this.policy;
    }

    public SubsettingArgs(@Nullable Input<SubsettingPolicy> policy) {
        this.policy = policy;
    }

    private SubsettingArgs() {
        this.policy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubsettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubsettingPolicy> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(SubsettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
        }

        public Builder setPolicy(@Nullable Input<SubsettingPolicy> policy) {
            this.policy = policy;
            return this;
        }

        public Builder setPolicy(@Nullable SubsettingPolicy policy) {
            this.policy = Input.ofNullable(policy);
            return this;
        }

        public SubsettingArgs build() {
            return new SubsettingArgs(policy);
        }
    }
}