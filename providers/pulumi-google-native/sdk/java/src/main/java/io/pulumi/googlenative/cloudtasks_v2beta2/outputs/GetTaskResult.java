// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.AppEngineHttpRequestResponse;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.PullMessageResponse;
import io.pulumi.googlenative.cloudtasks_v2beta2.outputs.TaskStatusResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTaskResult {
    /**
     * App Engine HTTP request that is sent to the task's target. Can be set only if app_engine_http_target is set on the queue. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
     */
    private final AppEngineHttpRequestResponse appEngineHttpRequest;
    /**
     * The time that the task was created. `create_time` will be truncated to the nearest second.
     * 
     */
    private final String createTime;
    /**
     * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
     */
    private final String name;
    /**
     * LeaseTasks to process the task. Can be set only if pull_target is set on the queue. A pull task is a task that has PullMessage set.
     * 
     */
    private final PullMessageResponse pullMessage;
    /**
     * The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. For pull queues, this is the time when the task is available to be leased; if a task is currently leased, this is the time when the current lease expires, that is, the time that the task was leased plus the lease_duration. `schedule_time` will be truncated to the nearest microsecond.
     * 
     */
    private final String scheduleTime;
    /**
     * The task status.
     * 
     */
    private final TaskStatusResponse status;
    /**
     * The view specifies which subset of the Task has been returned.
     * 
     */
    private final String view;

    @CustomType.Constructor
    private GetTaskResult(
        @CustomType.Parameter("appEngineHttpRequest") AppEngineHttpRequestResponse appEngineHttpRequest,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pullMessage") PullMessageResponse pullMessage,
        @CustomType.Parameter("scheduleTime") String scheduleTime,
        @CustomType.Parameter("status") TaskStatusResponse status,
        @CustomType.Parameter("view") String view) {
        this.appEngineHttpRequest = appEngineHttpRequest;
        this.createTime = createTime;
        this.name = name;
        this.pullMessage = pullMessage;
        this.scheduleTime = scheduleTime;
        this.status = status;
        this.view = view;
    }

    /**
     * App Engine HTTP request that is sent to the task's target. Can be set only if app_engine_http_target is set on the queue. An App Engine task is a task that has AppEngineHttpRequest set.
     * 
    */
    public AppEngineHttpRequestResponse appEngineHttpRequest() {
        return this.appEngineHttpRequest;
    }
    /**
     * The time that the task was created. `create_time` will be truncated to the nearest second.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Optionally caller-specified in CreateTask. The task name. The task name must have the following format: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID` * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]), hyphens (-), colons (:), or periods (.). For more information, see [Identifying projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the task's location. The list of available locations can be obtained by calling ListLocations. For more information, see https://cloud.google.com/about/locations/. * `QUEUE_ID` can contain letters ([A-Za-z]), numbers ([0-9]), or hyphens (-). The maximum length is 100 characters. * `TASK_ID` can contain only letters ([A-Za-z]), numbers ([0-9]), hyphens (-), or underscores (_). The maximum length is 500 characters.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * LeaseTasks to process the task. Can be set only if pull_target is set on the queue. A pull task is a task that has PullMessage set.
     * 
    */
    public PullMessageResponse pullMessage() {
        return this.pullMessage;
    }
    /**
     * The time when the task is scheduled to be attempted. For App Engine queues, this is when the task will be attempted or retried. For pull queues, this is the time when the task is available to be leased; if a task is currently leased, this is the time when the current lease expires, that is, the time that the task was leased plus the lease_duration. `schedule_time` will be truncated to the nearest microsecond.
     * 
    */
    public String scheduleTime() {
        return this.scheduleTime;
    }
    /**
     * The task status.
     * 
    */
    public TaskStatusResponse status() {
        return this.status;
    }
    /**
     * The view specifies which subset of the Task has been returned.
     * 
    */
    public String view() {
        return this.view;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineHttpRequestResponse appEngineHttpRequest;
        private String createTime;
        private String name;
        private PullMessageResponse pullMessage;
        private String scheduleTime;
        private TaskStatusResponse status;
        private String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineHttpRequest = defaults.appEngineHttpRequest;
    	      this.createTime = defaults.createTime;
    	      this.name = defaults.name;
    	      this.pullMessage = defaults.pullMessage;
    	      this.scheduleTime = defaults.scheduleTime;
    	      this.status = defaults.status;
    	      this.view = defaults.view;
        }

        public Builder appEngineHttpRequest(AppEngineHttpRequestResponse appEngineHttpRequest) {
            this.appEngineHttpRequest = Objects.requireNonNull(appEngineHttpRequest);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pullMessage(PullMessageResponse pullMessage) {
            this.pullMessage = Objects.requireNonNull(pullMessage);
            return this;
        }
        public Builder scheduleTime(String scheduleTime) {
            this.scheduleTime = Objects.requireNonNull(scheduleTime);
            return this;
        }
        public Builder status(TaskStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder view(String view) {
            this.view = Objects.requireNonNull(view);
            return this;
        }        public GetTaskResult build() {
            return new GetTaskResult(appEngineHttpRequest, createTime, name, pullMessage, scheduleTime, status, view);
        }
    }
}
