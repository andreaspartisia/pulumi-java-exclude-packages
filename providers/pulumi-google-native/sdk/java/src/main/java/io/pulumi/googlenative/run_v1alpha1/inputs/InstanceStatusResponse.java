// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v1alpha1.inputs.InstanceAttemptResultResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Instance represents the status of an instance of a Job.
 * 
 */
public final class InstanceStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceStatusResponse Empty = new InstanceStatusResponse();

    /**
     * Optional. Represents time when the instance was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="completionTime", required=true)
      private final String completionTime;

    public String completionTime() {
        return this.completionTime;
    }

    /**
     * Optional. The number of times this instance exited with code > 0; +optional
     * 
     */
    @Import(name="failed", required=true)
      private final Integer failed;

    public Integer failed() {
        return this.failed;
    }

    /**
     * Index of the instance, unique per Job, and beginning at 0.
     * 
     */
    @Import(name="index", required=true)
      private final Integer index;

    public Integer index() {
        return this.index;
    }

    /**
     * Optional. Result of the last attempt of this instance. +optional
     * 
     */
    @Import(name="lastAttemptResult", required=true)
      private final InstanceAttemptResultResponse lastAttemptResult;

    public InstanceAttemptResultResponse lastAttemptResult() {
        return this.lastAttemptResult;
    }

    /**
     * Optional. Last exit code seen for this instance. +optional
     * 
     */
    @Import(name="lastExitCode", required=true)
      private final Integer lastExitCode;

    public Integer lastExitCode() {
        return this.lastExitCode;
    }

    /**
     * Optional. The number of times this instance was restarted. Instances are restarted according the restartPolicy configured in the Job template. +optional
     * 
     */
    @Import(name="restarted", required=true)
      private final Integer restarted;

    public Integer restarted() {
        return this.restarted;
    }

    /**
     * Optional. Represents time when the instance was created by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * Optional. The number of times this instance exited with code == 0. +optional
     * 
     */
    @Import(name="succeeded", required=true)
      private final Integer succeeded;

    public Integer succeeded() {
        return this.succeeded;
    }

    public InstanceStatusResponse(
        String completionTime,
        Integer failed,
        Integer index,
        InstanceAttemptResultResponse lastAttemptResult,
        Integer lastExitCode,
        Integer restarted,
        String startTime,
        Integer succeeded) {
        this.completionTime = Objects.requireNonNull(completionTime, "expected parameter 'completionTime' to be non-null");
        this.failed = Objects.requireNonNull(failed, "expected parameter 'failed' to be non-null");
        this.index = Objects.requireNonNull(index, "expected parameter 'index' to be non-null");
        this.lastAttemptResult = Objects.requireNonNull(lastAttemptResult, "expected parameter 'lastAttemptResult' to be non-null");
        this.lastExitCode = Objects.requireNonNull(lastExitCode, "expected parameter 'lastExitCode' to be non-null");
        this.restarted = Objects.requireNonNull(restarted, "expected parameter 'restarted' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.succeeded = Objects.requireNonNull(succeeded, "expected parameter 'succeeded' to be non-null");
    }

    private InstanceStatusResponse() {
        this.completionTime = null;
        this.failed = null;
        this.index = null;
        this.lastAttemptResult = null;
        this.lastExitCode = null;
        this.restarted = null;
        this.startTime = null;
        this.succeeded = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String completionTime;
        private Integer failed;
        private Integer index;
        private InstanceAttemptResultResponse lastAttemptResult;
        private Integer lastExitCode;
        private Integer restarted;
        private String startTime;
        private Integer succeeded;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionTime = defaults.completionTime;
    	      this.failed = defaults.failed;
    	      this.index = defaults.index;
    	      this.lastAttemptResult = defaults.lastAttemptResult;
    	      this.lastExitCode = defaults.lastExitCode;
    	      this.restarted = defaults.restarted;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
        }

        public Builder completionTime(String completionTime) {
            this.completionTime = Objects.requireNonNull(completionTime);
            return this;
        }
        public Builder failed(Integer failed) {
            this.failed = Objects.requireNonNull(failed);
            return this;
        }
        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        public Builder lastAttemptResult(InstanceAttemptResultResponse lastAttemptResult) {
            this.lastAttemptResult = Objects.requireNonNull(lastAttemptResult);
            return this;
        }
        public Builder lastExitCode(Integer lastExitCode) {
            this.lastExitCode = Objects.requireNonNull(lastExitCode);
            return this;
        }
        public Builder restarted(Integer restarted) {
            this.restarted = Objects.requireNonNull(restarted);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder succeeded(Integer succeeded) {
            this.succeeded = Objects.requireNonNull(succeeded);
            return this;
        }        public InstanceStatusResponse build() {
            return new InstanceStatusResponse(completionTime, failed, index, lastAttemptResult, lastExitCode, restarted, startTime, succeeded);
        }
    }
}
