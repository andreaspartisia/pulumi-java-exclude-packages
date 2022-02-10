// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.enums.RosettaNetPipActivityType;
import io.pulumi.azurenative.logic.inputs.RosettaNetPipAcknowledgmentOfReceiptSettingsArgs;
import io.pulumi.azurenative.logic.inputs.RosettaNetPipActivityBehaviorArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class RosettaNetPipActivitySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RosettaNetPipActivitySettingsArgs Empty = new RosettaNetPipActivitySettingsArgs();

    @InputImport(name="acknowledgmentOfReceiptSettings", required=true)
    private final Input<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings;

    public Input<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> getAcknowledgmentOfReceiptSettings() {
        return this.acknowledgmentOfReceiptSettings;
    }

    @InputImport(name="activityBehavior", required=true)
    private final Input<RosettaNetPipActivityBehaviorArgs> activityBehavior;

    public Input<RosettaNetPipActivityBehaviorArgs> getActivityBehavior() {
        return this.activityBehavior;
    }

    @InputImport(name="activityType", required=true)
    private final Input<RosettaNetPipActivityType> activityType;

    public Input<RosettaNetPipActivityType> getActivityType() {
        return this.activityType;
    }

    public RosettaNetPipActivitySettingsArgs(
        Input<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings,
        Input<RosettaNetPipActivityBehaviorArgs> activityBehavior,
        Input<RosettaNetPipActivityType> activityType) {
        this.acknowledgmentOfReceiptSettings = Objects.requireNonNull(acknowledgmentOfReceiptSettings, "expected parameter 'acknowledgmentOfReceiptSettings' to be non-null");
        this.activityBehavior = Objects.requireNonNull(activityBehavior, "expected parameter 'activityBehavior' to be non-null");
        this.activityType = Objects.requireNonNull(activityType, "expected parameter 'activityType' to be non-null");
    }

    private RosettaNetPipActivitySettingsArgs() {
        this.acknowledgmentOfReceiptSettings = Input.empty();
        this.activityBehavior = Input.empty();
        this.activityType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipActivitySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings;
        private Input<RosettaNetPipActivityBehaviorArgs> activityBehavior;
        private Input<RosettaNetPipActivityType> activityType;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipActivitySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgmentOfReceiptSettings = defaults.acknowledgmentOfReceiptSettings;
    	      this.activityBehavior = defaults.activityBehavior;
    	      this.activityType = defaults.activityType;
        }

        public Builder setAcknowledgmentOfReceiptSettings(Input<RosettaNetPipAcknowledgmentOfReceiptSettingsArgs> acknowledgmentOfReceiptSettings) {
            this.acknowledgmentOfReceiptSettings = Objects.requireNonNull(acknowledgmentOfReceiptSettings);
            return this;
        }

        public Builder setAcknowledgmentOfReceiptSettings(RosettaNetPipAcknowledgmentOfReceiptSettingsArgs acknowledgmentOfReceiptSettings) {
            this.acknowledgmentOfReceiptSettings = Input.of(Objects.requireNonNull(acknowledgmentOfReceiptSettings));
            return this;
        }

        public Builder setActivityBehavior(Input<RosettaNetPipActivityBehaviorArgs> activityBehavior) {
            this.activityBehavior = Objects.requireNonNull(activityBehavior);
            return this;
        }

        public Builder setActivityBehavior(RosettaNetPipActivityBehaviorArgs activityBehavior) {
            this.activityBehavior = Input.of(Objects.requireNonNull(activityBehavior));
            return this;
        }

        public Builder setActivityType(Input<RosettaNetPipActivityType> activityType) {
            this.activityType = Objects.requireNonNull(activityType);
            return this;
        }

        public Builder setActivityType(RosettaNetPipActivityType activityType) {
            this.activityType = Input.of(Objects.requireNonNull(activityType));
            return this;
        }

        public RosettaNetPipActivitySettingsArgs build() {
            return new RosettaNetPipActivitySettingsArgs(acknowledgmentOfReceiptSettings, activityBehavior, activityType);
        }
    }
}