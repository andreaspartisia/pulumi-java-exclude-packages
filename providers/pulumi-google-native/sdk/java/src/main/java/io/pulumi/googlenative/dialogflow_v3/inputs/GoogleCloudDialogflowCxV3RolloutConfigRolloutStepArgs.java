// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single rollout step with specified traffic allocation.
 * 
 */
public final class GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs Empty = new GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs();

    /**
     * The name of the rollout step;
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour.
     * 
     */
    @Import(name="minDuration")
      private final @Nullable Output<String> minDuration;

    public Output<String> minDuration() {
        return this.minDuration == null ? Codegen.empty() : this.minDuration;
    }

    /**
     * The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%].
     * 
     */
    @Import(name="trafficPercent")
      private final @Nullable Output<Integer> trafficPercent;

    public Output<Integer> trafficPercent() {
        return this.trafficPercent == null ? Codegen.empty() : this.trafficPercent;
    }

    public GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> minDuration,
        @Nullable Output<Integer> trafficPercent) {
        this.displayName = displayName;
        this.minDuration = minDuration;
        this.trafficPercent = trafficPercent;
    }

    private GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs() {
        this.displayName = Codegen.empty();
        this.minDuration = Codegen.empty();
        this.trafficPercent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> minDuration;
        private @Nullable Output<Integer> trafficPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.minDuration = defaults.minDuration;
    	      this.trafficPercent = defaults.trafficPercent;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder minDuration(@Nullable Output<String> minDuration) {
            this.minDuration = minDuration;
            return this;
        }
        public Builder minDuration(@Nullable String minDuration) {
            this.minDuration = Codegen.ofNullable(minDuration);
            return this;
        }
        public Builder trafficPercent(@Nullable Output<Integer> trafficPercent) {
            this.trafficPercent = trafficPercent;
            return this;
        }
        public Builder trafficPercent(@Nullable Integer trafficPercent) {
            this.trafficPercent = Codegen.ofNullable(trafficPercent);
            return this;
        }        public GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs build() {
            return new GoogleCloudDialogflowCxV3RolloutConfigRolloutStepArgs(displayName, minDuration, trafficPercent);
        }
    }
}
