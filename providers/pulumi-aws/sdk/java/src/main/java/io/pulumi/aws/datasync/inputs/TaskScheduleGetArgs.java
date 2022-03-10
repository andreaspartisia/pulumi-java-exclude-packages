// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TaskScheduleGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskScheduleGetArgs Empty = new TaskScheduleGetArgs();

    /**
     * Specifies the schedule you want your task to use for repeated executions. For more information, see [Schedule Expressions for Rules](https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/ScheduledEvents.html).
     * 
     */
    @InputImport(name="scheduleExpression", required=true)
      private final Input<String> scheduleExpression;

    public Input<String> getScheduleExpression() {
        return this.scheduleExpression;
    }

    public TaskScheduleGetArgs(Input<String> scheduleExpression) {
        this.scheduleExpression = Objects.requireNonNull(scheduleExpression, "expected parameter 'scheduleExpression' to be non-null");
    }

    private TaskScheduleGetArgs() {
        this.scheduleExpression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskScheduleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> scheduleExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskScheduleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduleExpression = defaults.scheduleExpression;
        }

        public Builder setScheduleExpression(Input<String> scheduleExpression) {
            this.scheduleExpression = Objects.requireNonNull(scheduleExpression);
            return this;
        }

        public Builder setScheduleExpression(String scheduleExpression) {
            this.scheduleExpression = Input.of(Objects.requireNonNull(scheduleExpression));
            return this;
        }
        public TaskScheduleGetArgs build() {
            return new TaskScheduleGetArgs(scheduleExpression);
        }
    }
}