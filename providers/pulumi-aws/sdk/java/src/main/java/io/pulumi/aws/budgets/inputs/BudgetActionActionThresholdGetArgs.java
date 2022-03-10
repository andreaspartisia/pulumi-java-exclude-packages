// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class BudgetActionActionThresholdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionActionThresholdGetArgs Empty = new BudgetActionActionThresholdGetArgs();

    /**
     * The type of threshold for a notification. Valid values are `PERCENTAGE` or `ABSOLUTE_VALUE`.
     * 
     */
    @InputImport(name="actionThresholdType", required=true)
      private final Input<String> actionThresholdType;

    public Input<String> getActionThresholdType() {
        return this.actionThresholdType;
    }

    /**
     * The threshold of a notification.
     * 
     */
    @InputImport(name="actionThresholdValue", required=true)
      private final Input<Double> actionThresholdValue;

    public Input<Double> getActionThresholdValue() {
        return this.actionThresholdValue;
    }

    public BudgetActionActionThresholdGetArgs(
        Input<String> actionThresholdType,
        Input<Double> actionThresholdValue) {
        this.actionThresholdType = Objects.requireNonNull(actionThresholdType, "expected parameter 'actionThresholdType' to be non-null");
        this.actionThresholdValue = Objects.requireNonNull(actionThresholdValue, "expected parameter 'actionThresholdValue' to be non-null");
    }

    private BudgetActionActionThresholdGetArgs() {
        this.actionThresholdType = Input.empty();
        this.actionThresholdValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionActionThresholdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> actionThresholdType;
        private Input<Double> actionThresholdValue;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionActionThresholdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionThresholdType = defaults.actionThresholdType;
    	      this.actionThresholdValue = defaults.actionThresholdValue;
        }

        public Builder setActionThresholdType(Input<String> actionThresholdType) {
            this.actionThresholdType = Objects.requireNonNull(actionThresholdType);
            return this;
        }

        public Builder setActionThresholdType(String actionThresholdType) {
            this.actionThresholdType = Input.of(Objects.requireNonNull(actionThresholdType));
            return this;
        }

        public Builder setActionThresholdValue(Input<Double> actionThresholdValue) {
            this.actionThresholdValue = Objects.requireNonNull(actionThresholdValue);
            return this;
        }

        public Builder setActionThresholdValue(Double actionThresholdValue) {
            this.actionThresholdValue = Input.of(Objects.requireNonNull(actionThresholdValue));
            return this;
        }
        public BudgetActionActionThresholdGetArgs build() {
            return new BudgetActionActionThresholdGetArgs(actionThresholdType, actionThresholdValue);
        }
    }
}