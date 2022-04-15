// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ParameterSpecResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a set of hyperparameters to optimize.
 * 
 */
public final class GoogleCloudMlV1__HyperparameterSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__HyperparameterSpecResponse Empty = new GoogleCloudMlV1__HyperparameterSpecResponse();

    /**
     * Optional. The search algorithm specified for the hyperparameter tuning job. Uses the default AI Platform hyperparameter tuning algorithm if unspecified.
     * 
     */
    @Import(name="algorithm", required=true)
      private final String algorithm;

    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Optional. Indicates if the hyperparameter tuning job enables auto trial early stopping.
     * 
     */
    @Import(name="enableTrialEarlyStopping", required=true)
      private final Boolean enableTrialEarlyStopping;

    public Boolean enableTrialEarlyStopping() {
        return this.enableTrialEarlyStopping;
    }

    /**
     * The type of goal to use for tuning. Available types are `MAXIMIZE` and `MINIMIZE`. Defaults to `MAXIMIZE`.
     * 
     */
    @Import(name="goal", required=true)
      private final String goal;

    public String goal() {
        return this.goal;
    }

    /**
     * Optional. The TensorFlow summary tag name to use for optimizing trials. For current versions of TensorFlow, this tag name should exactly match what is shown in TensorBoard, including all scopes. For versions of TensorFlow prior to 0.12, this should be only the tag passed to tf.Summary. By default, "training/hptuning/metric" will be used.
     * 
     */
    @Import(name="hyperparameterMetricTag", required=true)
      private final String hyperparameterMetricTag;

    public String hyperparameterMetricTag() {
        return this.hyperparameterMetricTag;
    }

    /**
     * Optional. The number of failed trials that need to be seen before failing the hyperparameter tuning job. You can specify this field to override the default failing criteria for AI Platform hyperparameter tuning jobs. Defaults to zero, which means the service decides when a hyperparameter job should fail.
     * 
     */
    @Import(name="maxFailedTrials", required=true)
      private final Integer maxFailedTrials;

    public Integer maxFailedTrials() {
        return this.maxFailedTrials;
    }

    /**
     * Optional. The number of training trials to run concurrently. You can reduce the time it takes to perform hyperparameter tuning by adding trials in parallel. However, each trail only benefits from the information gained in completed trials. That means that a trial does not get access to the results of trials running at the same time, which could reduce the quality of the overall optimization. Each trial will use the same scale tier and machine types. Defaults to one.
     * 
     */
    @Import(name="maxParallelTrials", required=true)
      private final Integer maxParallelTrials;

    public Integer maxParallelTrials() {
        return this.maxParallelTrials;
    }

    /**
     * Optional. How many training trials should be attempted to optimize the specified hyperparameters. Defaults to one.
     * 
     */
    @Import(name="maxTrials", required=true)
      private final Integer maxTrials;

    public Integer maxTrials() {
        return this.maxTrials;
    }

    /**
     * The set of parameters to tune.
     * 
     */
    @Import(name="params", required=true)
      private final List<GoogleCloudMlV1__ParameterSpecResponse> params;

    public List<GoogleCloudMlV1__ParameterSpecResponse> params() {
        return this.params;
    }

    /**
     * Optional. The prior hyperparameter tuning job id that users hope to continue with. The job id will be used to find the corresponding vizier study guid and resume the study.
     * 
     */
    @Import(name="resumePreviousJobId", required=true)
      private final String resumePreviousJobId;

    public String resumePreviousJobId() {
        return this.resumePreviousJobId;
    }

    public GoogleCloudMlV1__HyperparameterSpecResponse(
        String algorithm,
        Boolean enableTrialEarlyStopping,
        String goal,
        String hyperparameterMetricTag,
        Integer maxFailedTrials,
        Integer maxParallelTrials,
        Integer maxTrials,
        List<GoogleCloudMlV1__ParameterSpecResponse> params,
        String resumePreviousJobId) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.enableTrialEarlyStopping = Objects.requireNonNull(enableTrialEarlyStopping, "expected parameter 'enableTrialEarlyStopping' to be non-null");
        this.goal = Objects.requireNonNull(goal, "expected parameter 'goal' to be non-null");
        this.hyperparameterMetricTag = Objects.requireNonNull(hyperparameterMetricTag, "expected parameter 'hyperparameterMetricTag' to be non-null");
        this.maxFailedTrials = Objects.requireNonNull(maxFailedTrials, "expected parameter 'maxFailedTrials' to be non-null");
        this.maxParallelTrials = Objects.requireNonNull(maxParallelTrials, "expected parameter 'maxParallelTrials' to be non-null");
        this.maxTrials = Objects.requireNonNull(maxTrials, "expected parameter 'maxTrials' to be non-null");
        this.params = Objects.requireNonNull(params, "expected parameter 'params' to be non-null");
        this.resumePreviousJobId = Objects.requireNonNull(resumePreviousJobId, "expected parameter 'resumePreviousJobId' to be non-null");
    }

    private GoogleCloudMlV1__HyperparameterSpecResponse() {
        this.algorithm = null;
        this.enableTrialEarlyStopping = null;
        this.goal = null;
        this.hyperparameterMetricTag = null;
        this.maxFailedTrials = null;
        this.maxParallelTrials = null;
        this.maxTrials = null;
        this.params = List.of();
        this.resumePreviousJobId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__HyperparameterSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private Boolean enableTrialEarlyStopping;
        private String goal;
        private String hyperparameterMetricTag;
        private Integer maxFailedTrials;
        private Integer maxParallelTrials;
        private Integer maxTrials;
        private List<GoogleCloudMlV1__ParameterSpecResponse> params;
        private String resumePreviousJobId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__HyperparameterSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.enableTrialEarlyStopping = defaults.enableTrialEarlyStopping;
    	      this.goal = defaults.goal;
    	      this.hyperparameterMetricTag = defaults.hyperparameterMetricTag;
    	      this.maxFailedTrials = defaults.maxFailedTrials;
    	      this.maxParallelTrials = defaults.maxParallelTrials;
    	      this.maxTrials = defaults.maxTrials;
    	      this.params = defaults.params;
    	      this.resumePreviousJobId = defaults.resumePreviousJobId;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder enableTrialEarlyStopping(Boolean enableTrialEarlyStopping) {
            this.enableTrialEarlyStopping = Objects.requireNonNull(enableTrialEarlyStopping);
            return this;
        }
        public Builder goal(String goal) {
            this.goal = Objects.requireNonNull(goal);
            return this;
        }
        public Builder hyperparameterMetricTag(String hyperparameterMetricTag) {
            this.hyperparameterMetricTag = Objects.requireNonNull(hyperparameterMetricTag);
            return this;
        }
        public Builder maxFailedTrials(Integer maxFailedTrials) {
            this.maxFailedTrials = Objects.requireNonNull(maxFailedTrials);
            return this;
        }
        public Builder maxParallelTrials(Integer maxParallelTrials) {
            this.maxParallelTrials = Objects.requireNonNull(maxParallelTrials);
            return this;
        }
        public Builder maxTrials(Integer maxTrials) {
            this.maxTrials = Objects.requireNonNull(maxTrials);
            return this;
        }
        public Builder params(List<GoogleCloudMlV1__ParameterSpecResponse> params) {
            this.params = Objects.requireNonNull(params);
            return this;
        }
        public Builder params(GoogleCloudMlV1__ParameterSpecResponse... params) {
            return params(List.of(params));
        }
        public Builder resumePreviousJobId(String resumePreviousJobId) {
            this.resumePreviousJobId = Objects.requireNonNull(resumePreviousJobId);
            return this;
        }        public GoogleCloudMlV1__HyperparameterSpecResponse build() {
            return new GoogleCloudMlV1__HyperparameterSpecResponse(algorithm, enableTrialEarlyStopping, goal, hyperparameterMetricTag, maxFailedTrials, maxParallelTrials, maxTrials, params, resumePreviousJobId);
        }
    }
}
