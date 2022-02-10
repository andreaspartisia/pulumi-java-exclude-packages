// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LongTermSchedulePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LongTermSchedulePolicyArgs Empty = new LongTermSchedulePolicyArgs();

    @InputImport(name="schedulePolicyType", required=true)
    private final Input<String> schedulePolicyType;

    public Input<String> getSchedulePolicyType() {
        return this.schedulePolicyType;
    }

    public LongTermSchedulePolicyArgs(Input<String> schedulePolicyType) {
        this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType, "expected parameter 'schedulePolicyType' to be non-null");
    }

    private LongTermSchedulePolicyArgs() {
        this.schedulePolicyType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LongTermSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> schedulePolicyType;

        public Builder() {
    	      // Empty
        }

        public Builder(LongTermSchedulePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedulePolicyType = defaults.schedulePolicyType;
        }

        public Builder setSchedulePolicyType(Input<String> schedulePolicyType) {
            this.schedulePolicyType = Objects.requireNonNull(schedulePolicyType);
            return this;
        }

        public Builder setSchedulePolicyType(String schedulePolicyType) {
            this.schedulePolicyType = Input.of(Objects.requireNonNull(schedulePolicyType));
            return this;
        }

        public LongTermSchedulePolicyArgs build() {
            return new LongTermSchedulePolicyArgs(schedulePolicyType);
        }
    }
}