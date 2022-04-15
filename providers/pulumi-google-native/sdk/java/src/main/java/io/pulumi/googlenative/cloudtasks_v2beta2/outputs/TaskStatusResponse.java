// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.AttemptStatusResponse;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class TaskStatusResponse {
    /**
     * The number of attempts dispatched. This count includes attempts which have been dispatched but haven't received a response.
     * 
     */
    private final Integer attemptDispatchCount;
    /**
     * The number of attempts which have received a response. This field is not calculated for pull tasks.
     * 
     */
    private final Integer attemptResponseCount;
    /**
     * The status of the task's first attempt. Only dispatch_time will be set. The other AttemptStatus information is not retained by Cloud Tasks. This field is not calculated for pull tasks.
     * 
     */
    private final AttemptStatusResponse firstAttemptStatus;
    /**
     * The status of the task's last attempt. This field is not calculated for pull tasks.
     * 
     */
    private final AttemptStatusResponse lastAttemptStatus;

    @CustomType.Constructor
    private TaskStatusResponse(
        @CustomType.Parameter("attemptDispatchCount") Integer attemptDispatchCount,
        @CustomType.Parameter("attemptResponseCount") Integer attemptResponseCount,
        @CustomType.Parameter("firstAttemptStatus") AttemptStatusResponse firstAttemptStatus,
        @CustomType.Parameter("lastAttemptStatus") AttemptStatusResponse lastAttemptStatus) {
        this.attemptDispatchCount = attemptDispatchCount;
        this.attemptResponseCount = attemptResponseCount;
        this.firstAttemptStatus = firstAttemptStatus;
        this.lastAttemptStatus = lastAttemptStatus;
    }

    /**
     * The number of attempts dispatched. This count includes attempts which have been dispatched but haven't received a response.
     * 
    */
    public Integer attemptDispatchCount() {
        return this.attemptDispatchCount;
    }
    /**
     * The number of attempts which have received a response. This field is not calculated for pull tasks.
     * 
    */
    public Integer attemptResponseCount() {
        return this.attemptResponseCount;
    }
    /**
     * The status of the task's first attempt. Only dispatch_time will be set. The other AttemptStatus information is not retained by Cloud Tasks. This field is not calculated for pull tasks.
     * 
    */
    public AttemptStatusResponse firstAttemptStatus() {
        return this.firstAttemptStatus;
    }
    /**
     * The status of the task's last attempt. This field is not calculated for pull tasks.
     * 
    */
    public AttemptStatusResponse lastAttemptStatus() {
        return this.lastAttemptStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer attemptDispatchCount;
        private Integer attemptResponseCount;
        private AttemptStatusResponse firstAttemptStatus;
        private AttemptStatusResponse lastAttemptStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attemptDispatchCount = defaults.attemptDispatchCount;
    	      this.attemptResponseCount = defaults.attemptResponseCount;
    	      this.firstAttemptStatus = defaults.firstAttemptStatus;
    	      this.lastAttemptStatus = defaults.lastAttemptStatus;
        }

        public Builder attemptDispatchCount(Integer attemptDispatchCount) {
            this.attemptDispatchCount = Objects.requireNonNull(attemptDispatchCount);
            return this;
        }
        public Builder attemptResponseCount(Integer attemptResponseCount) {
            this.attemptResponseCount = Objects.requireNonNull(attemptResponseCount);
            return this;
        }
        public Builder firstAttemptStatus(AttemptStatusResponse firstAttemptStatus) {
            this.firstAttemptStatus = Objects.requireNonNull(firstAttemptStatus);
            return this;
        }
        public Builder lastAttemptStatus(AttemptStatusResponse lastAttemptStatus) {
            this.lastAttemptStatus = Objects.requireNonNull(lastAttemptStatus);
            return this;
        }        public TaskStatusResponse build() {
            return new TaskStatusResponse(attemptDispatchCount, attemptResponseCount, firstAttemptStatus, lastAttemptStatus);
        }
    }
}
