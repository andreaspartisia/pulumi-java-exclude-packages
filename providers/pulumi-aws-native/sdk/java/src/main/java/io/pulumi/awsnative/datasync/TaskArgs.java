// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.inputs.TaskFilterRuleArgs;
import io.pulumi.awsnative.datasync.inputs.TaskOptionsArgs;
import io.pulumi.awsnative.datasync.inputs.TaskScheduleArgs;
import io.pulumi.awsnative.datasync.inputs.TaskTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskArgs Empty = new TaskArgs();

    /**
     * The ARN of the Amazon CloudWatch log group that is used to monitor and log events in the task.
     * 
     */
    @InputImport(name="cloudWatchLogGroupArn")
    private final @Nullable Input<String> cloudWatchLogGroupArn;

    public Input<String> getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn == null ? Input.empty() : this.cloudWatchLogGroupArn;
    }

    /**
     * The ARN of an AWS storage resource's location.
     * 
     */
    @InputImport(name="destinationLocationArn", required=true)
    private final Input<String> destinationLocationArn;

    public Input<String> getDestinationLocationArn() {
        return this.destinationLocationArn;
    }

    @InputImport(name="excludes")
    private final @Nullable Input<List<TaskFilterRuleArgs>> excludes;

    public Input<List<TaskFilterRuleArgs>> getExcludes() {
        return this.excludes == null ? Input.empty() : this.excludes;
    }

    @InputImport(name="includes")
    private final @Nullable Input<List<TaskFilterRuleArgs>> includes;

    public Input<List<TaskFilterRuleArgs>> getIncludes() {
        return this.includes == null ? Input.empty() : this.includes;
    }

    /**
     * The name of a task. This value is a text reference that is used to identify the task in the console.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="options")
    private final @Nullable Input<TaskOptionsArgs> options;

    public Input<TaskOptionsArgs> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    @InputImport(name="schedule")
    private final @Nullable Input<TaskScheduleArgs> schedule;

    public Input<TaskScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    /**
     * The ARN of the source location for the task.
     * 
     */
    @InputImport(name="sourceLocationArn", required=true)
    private final Input<String> sourceLocationArn;

    public Input<String> getSourceLocationArn() {
        return this.sourceLocationArn;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<TaskTagArgs>> tags;

    public Input<List<TaskTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public TaskArgs(
        @Nullable Input<String> cloudWatchLogGroupArn,
        Input<String> destinationLocationArn,
        @Nullable Input<List<TaskFilterRuleArgs>> excludes,
        @Nullable Input<List<TaskFilterRuleArgs>> includes,
        @Nullable Input<String> name,
        @Nullable Input<TaskOptionsArgs> options,
        @Nullable Input<TaskScheduleArgs> schedule,
        Input<String> sourceLocationArn,
        @Nullable Input<List<TaskTagArgs>> tags) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
        this.destinationLocationArn = Objects.requireNonNull(destinationLocationArn, "expected parameter 'destinationLocationArn' to be non-null");
        this.excludes = excludes;
        this.includes = includes;
        this.name = name;
        this.options = options;
        this.schedule = schedule;
        this.sourceLocationArn = Objects.requireNonNull(sourceLocationArn, "expected parameter 'sourceLocationArn' to be non-null");
        this.tags = tags;
    }

    private TaskArgs() {
        this.cloudWatchLogGroupArn = Input.empty();
        this.destinationLocationArn = Input.empty();
        this.excludes = Input.empty();
        this.includes = Input.empty();
        this.name = Input.empty();
        this.options = Input.empty();
        this.schedule = Input.empty();
        this.sourceLocationArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cloudWatchLogGroupArn;
        private Input<String> destinationLocationArn;
        private @Nullable Input<List<TaskFilterRuleArgs>> excludes;
        private @Nullable Input<List<TaskFilterRuleArgs>> includes;
        private @Nullable Input<String> name;
        private @Nullable Input<TaskOptionsArgs> options;
        private @Nullable Input<TaskScheduleArgs> schedule;
        private Input<String> sourceLocationArn;
        private @Nullable Input<List<TaskTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.destinationLocationArn = defaults.destinationLocationArn;
    	      this.excludes = defaults.excludes;
    	      this.includes = defaults.includes;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.schedule = defaults.schedule;
    	      this.sourceLocationArn = defaults.sourceLocationArn;
    	      this.tags = defaults.tags;
        }

        public Builder setCloudWatchLogGroupArn(@Nullable Input<String> cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }

        public Builder setCloudWatchLogGroupArn(@Nullable String cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = Input.ofNullable(cloudWatchLogGroupArn);
            return this;
        }

        public Builder setDestinationLocationArn(Input<String> destinationLocationArn) {
            this.destinationLocationArn = Objects.requireNonNull(destinationLocationArn);
            return this;
        }

        public Builder setDestinationLocationArn(String destinationLocationArn) {
            this.destinationLocationArn = Input.of(Objects.requireNonNull(destinationLocationArn));
            return this;
        }

        public Builder setExcludes(@Nullable Input<List<TaskFilterRuleArgs>> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder setExcludes(@Nullable List<TaskFilterRuleArgs> excludes) {
            this.excludes = Input.ofNullable(excludes);
            return this;
        }

        public Builder setIncludes(@Nullable Input<List<TaskFilterRuleArgs>> includes) {
            this.includes = includes;
            return this;
        }

        public Builder setIncludes(@Nullable List<TaskFilterRuleArgs> includes) {
            this.includes = Input.ofNullable(includes);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOptions(@Nullable Input<TaskOptionsArgs> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable TaskOptionsArgs options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setSchedule(@Nullable Input<TaskScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable TaskScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setSourceLocationArn(Input<String> sourceLocationArn) {
            this.sourceLocationArn = Objects.requireNonNull(sourceLocationArn);
            return this;
        }

        public Builder setSourceLocationArn(String sourceLocationArn) {
            this.sourceLocationArn = Input.of(Objects.requireNonNull(sourceLocationArn));
            return this;
        }

        public Builder setTags(@Nullable Input<List<TaskTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<TaskTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public TaskArgs build() {
            return new TaskArgs(cloudWatchLogGroupArn, destinationLocationArn, excludes, includes, name, options, schedule, sourceLocationArn, tags);
        }
    }
}