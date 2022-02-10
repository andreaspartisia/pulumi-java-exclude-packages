// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.EnvironmentSettingArgs;
import io.pulumi.azurenative.batch.inputs.ResourceFileArgs;
import io.pulumi.azurenative.batch.inputs.TaskContainerSettingsArgs;
import io.pulumi.azurenative.batch.inputs.UserIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StartTaskArgs extends io.pulumi.resources.ResourceArgs {

    public static final StartTaskArgs Empty = new StartTaskArgs();

    @InputImport(name="commandLine")
    private final @Nullable Input<String> commandLine;

    public Input<String> getCommandLine() {
        return this.commandLine == null ? Input.empty() : this.commandLine;
    }

    @InputImport(name="containerSettings")
    private final @Nullable Input<TaskContainerSettingsArgs> containerSettings;

    public Input<TaskContainerSettingsArgs> getContainerSettings() {
        return this.containerSettings == null ? Input.empty() : this.containerSettings;
    }

    @InputImport(name="environmentSettings")
    private final @Nullable Input<List<EnvironmentSettingArgs>> environmentSettings;

    public Input<List<EnvironmentSettingArgs>> getEnvironmentSettings() {
        return this.environmentSettings == null ? Input.empty() : this.environmentSettings;
    }

    @InputImport(name="maxTaskRetryCount")
    private final @Nullable Input<Integer> maxTaskRetryCount;

    public Input<Integer> getMaxTaskRetryCount() {
        return this.maxTaskRetryCount == null ? Input.empty() : this.maxTaskRetryCount;
    }

    @InputImport(name="resourceFiles")
    private final @Nullable Input<List<ResourceFileArgs>> resourceFiles;

    public Input<List<ResourceFileArgs>> getResourceFiles() {
        return this.resourceFiles == null ? Input.empty() : this.resourceFiles;
    }

    @InputImport(name="userIdentity")
    private final @Nullable Input<UserIdentityArgs> userIdentity;

    public Input<UserIdentityArgs> getUserIdentity() {
        return this.userIdentity == null ? Input.empty() : this.userIdentity;
    }

    @InputImport(name="waitForSuccess")
    private final @Nullable Input<Boolean> waitForSuccess;

    public Input<Boolean> getWaitForSuccess() {
        return this.waitForSuccess == null ? Input.empty() : this.waitForSuccess;
    }

    public StartTaskArgs(
        @Nullable Input<String> commandLine,
        @Nullable Input<TaskContainerSettingsArgs> containerSettings,
        @Nullable Input<List<EnvironmentSettingArgs>> environmentSettings,
        @Nullable Input<Integer> maxTaskRetryCount,
        @Nullable Input<List<ResourceFileArgs>> resourceFiles,
        @Nullable Input<UserIdentityArgs> userIdentity,
        @Nullable Input<Boolean> waitForSuccess) {
        this.commandLine = commandLine;
        this.containerSettings = containerSettings;
        this.environmentSettings = environmentSettings;
        this.maxTaskRetryCount = maxTaskRetryCount;
        this.resourceFiles = resourceFiles;
        this.userIdentity = userIdentity;
        this.waitForSuccess = waitForSuccess;
    }

    private StartTaskArgs() {
        this.commandLine = Input.empty();
        this.containerSettings = Input.empty();
        this.environmentSettings = Input.empty();
        this.maxTaskRetryCount = Input.empty();
        this.resourceFiles = Input.empty();
        this.userIdentity = Input.empty();
        this.waitForSuccess = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StartTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> commandLine;
        private @Nullable Input<TaskContainerSettingsArgs> containerSettings;
        private @Nullable Input<List<EnvironmentSettingArgs>> environmentSettings;
        private @Nullable Input<Integer> maxTaskRetryCount;
        private @Nullable Input<List<ResourceFileArgs>> resourceFiles;
        private @Nullable Input<UserIdentityArgs> userIdentity;
        private @Nullable Input<Boolean> waitForSuccess;

        public Builder() {
    	      // Empty
        }

        public Builder(StartTaskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandLine = defaults.commandLine;
    	      this.containerSettings = defaults.containerSettings;
    	      this.environmentSettings = defaults.environmentSettings;
    	      this.maxTaskRetryCount = defaults.maxTaskRetryCount;
    	      this.resourceFiles = defaults.resourceFiles;
    	      this.userIdentity = defaults.userIdentity;
    	      this.waitForSuccess = defaults.waitForSuccess;
        }

        public Builder setCommandLine(@Nullable Input<String> commandLine) {
            this.commandLine = commandLine;
            return this;
        }

        public Builder setCommandLine(@Nullable String commandLine) {
            this.commandLine = Input.ofNullable(commandLine);
            return this;
        }

        public Builder setContainerSettings(@Nullable Input<TaskContainerSettingsArgs> containerSettings) {
            this.containerSettings = containerSettings;
            return this;
        }

        public Builder setContainerSettings(@Nullable TaskContainerSettingsArgs containerSettings) {
            this.containerSettings = Input.ofNullable(containerSettings);
            return this;
        }

        public Builder setEnvironmentSettings(@Nullable Input<List<EnvironmentSettingArgs>> environmentSettings) {
            this.environmentSettings = environmentSettings;
            return this;
        }

        public Builder setEnvironmentSettings(@Nullable List<EnvironmentSettingArgs> environmentSettings) {
            this.environmentSettings = Input.ofNullable(environmentSettings);
            return this;
        }

        public Builder setMaxTaskRetryCount(@Nullable Input<Integer> maxTaskRetryCount) {
            this.maxTaskRetryCount = maxTaskRetryCount;
            return this;
        }

        public Builder setMaxTaskRetryCount(@Nullable Integer maxTaskRetryCount) {
            this.maxTaskRetryCount = Input.ofNullable(maxTaskRetryCount);
            return this;
        }

        public Builder setResourceFiles(@Nullable Input<List<ResourceFileArgs>> resourceFiles) {
            this.resourceFiles = resourceFiles;
            return this;
        }

        public Builder setResourceFiles(@Nullable List<ResourceFileArgs> resourceFiles) {
            this.resourceFiles = Input.ofNullable(resourceFiles);
            return this;
        }

        public Builder setUserIdentity(@Nullable Input<UserIdentityArgs> userIdentity) {
            this.userIdentity = userIdentity;
            return this;
        }

        public Builder setUserIdentity(@Nullable UserIdentityArgs userIdentity) {
            this.userIdentity = Input.ofNullable(userIdentity);
            return this;
        }

        public Builder setWaitForSuccess(@Nullable Input<Boolean> waitForSuccess) {
            this.waitForSuccess = waitForSuccess;
            return this;
        }

        public Builder setWaitForSuccess(@Nullable Boolean waitForSuccess) {
            this.waitForSuccess = Input.ofNullable(waitForSuccess);
            return this;
        }

        public StartTaskArgs build() {
            return new StartTaskArgs(commandLine, containerSettings, environmentSettings, maxTaskRetryCount, resourceFiles, userIdentity, waitForSuccess);
        }
    }
}