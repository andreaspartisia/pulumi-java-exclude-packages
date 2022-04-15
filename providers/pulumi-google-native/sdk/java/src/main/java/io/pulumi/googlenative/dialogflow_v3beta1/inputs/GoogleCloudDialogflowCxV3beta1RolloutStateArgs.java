// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * State of the auto-rollout process.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1RolloutStateArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1RolloutStateArgs Empty = new GoogleCloudDialogflowCxV3beta1RolloutStateArgs();

    /**
     * Start time of the current step.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> startTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    /**
     * Display name of the current auto rollout step.
     * 
     */
    @Import(name="step")
      private final @Nullable Output<String> step;

    public Output<String> step() {
        return this.step == null ? Codegen.empty() : this.step;
    }

    /**
     * Index of the current step in the auto rollout steps list.
     * 
     */
    @Import(name="stepIndex")
      private final @Nullable Output<Integer> stepIndex;

    public Output<Integer> stepIndex() {
        return this.stepIndex == null ? Codegen.empty() : this.stepIndex;
    }

    public GoogleCloudDialogflowCxV3beta1RolloutStateArgs(
        @Nullable Output<String> startTime,
        @Nullable Output<String> step,
        @Nullable Output<Integer> stepIndex) {
        this.startTime = startTime;
        this.step = step;
        this.stepIndex = stepIndex;
    }

    private GoogleCloudDialogflowCxV3beta1RolloutStateArgs() {
        this.startTime = Codegen.empty();
        this.step = Codegen.empty();
        this.stepIndex = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1RolloutStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> startTime;
        private @Nullable Output<String> step;
        private @Nullable Output<Integer> stepIndex;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1RolloutStateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.startTime = defaults.startTime;
    	      this.step = defaults.step;
    	      this.stepIndex = defaults.stepIndex;
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }
        public Builder step(@Nullable Output<String> step) {
            this.step = step;
            return this;
        }
        public Builder step(@Nullable String step) {
            this.step = Codegen.ofNullable(step);
            return this;
        }
        public Builder stepIndex(@Nullable Output<Integer> stepIndex) {
            this.stepIndex = stepIndex;
            return this;
        }
        public Builder stepIndex(@Nullable Integer stepIndex) {
            this.stepIndex = Codegen.ofNullable(stepIndex);
            return this;
        }        public GoogleCloudDialogflowCxV3beta1RolloutStateArgs build() {
            return new GoogleCloudDialogflowCxV3beta1RolloutStateArgs(startTime, step, stepIndex);
        }
    }
}
