// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTaskArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTaskArgs Empty = new GetTaskArgs();

    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    @InputImport(name="groupName", required=true)
    private final String groupName;

    public String getGroupName() {
        return this.groupName;
    }

    @InputImport(name="projectName", required=true)
    private final String projectName;

    public String getProjectName() {
        return this.projectName;
    }

    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    @InputImport(name="taskName", required=true)
    private final String taskName;

    public String getTaskName() {
        return this.taskName;
    }

    public GetTaskArgs(
        @Nullable String expand,
        String groupName,
        String projectName,
        String serviceName,
        String taskName) {
        this.expand = expand;
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.taskName = Objects.requireNonNull(taskName, "expected parameter 'taskName' to be non-null");
    }

    private GetTaskArgs() {
        this.expand = null;
        this.groupName = null;
        this.projectName = null;
        this.serviceName = null;
        this.taskName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String groupName;
        private String projectName;
        private String serviceName;
        private String taskName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.groupName = defaults.groupName;
    	      this.projectName = defaults.projectName;
    	      this.serviceName = defaults.serviceName;
    	      this.taskName = defaults.taskName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setGroupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder setProjectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setTaskName(String taskName) {
            this.taskName = Objects.requireNonNull(taskName);
            return this;
        }

        public GetTaskArgs build() {
            return new GetTaskArgs(expand, groupName, projectName, serviceName, taskName);
        }
    }
}