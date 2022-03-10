// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.sagemaker.inputs.DeviceFleetOutputConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceFleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceFleetArgs Empty = new DeviceFleetArgs();

    /**
     * A description of the fleet.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the Device Fleet (must be unique).
     * 
     */
    @InputImport(name="deviceFleetName", required=true)
      private final Input<String> deviceFleetName;

    public Input<String> getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * Whether to create an AWS IoT Role Alias during device fleet creation. The name of the role alias generated will match this pattern: "SageMakerEdge-{DeviceFleetName}".
     * 
     */
    @InputImport(name="enableIotRoleAlias")
      private final @Nullable Input<Boolean> enableIotRoleAlias;

    public Input<Boolean> getEnableIotRoleAlias() {
        return this.enableIotRoleAlias == null ? Input.empty() : this.enableIotRoleAlias;
    }

    /**
     * Specifies details about the repository. see Output Config details below.
     * 
     */
    @InputImport(name="outputConfig", required=true)
      private final Input<DeviceFleetOutputConfigArgs> outputConfig;

    public Input<DeviceFleetOutputConfigArgs> getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
     * 
     */
    @InputImport(name="roleArn", required=true)
      private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DeviceFleetArgs(
        @Nullable Input<String> description,
        Input<String> deviceFleetName,
        @Nullable Input<Boolean> enableIotRoleAlias,
        Input<DeviceFleetOutputConfigArgs> outputConfig,
        Input<String> roleArn,
        @Nullable Input<Map<String,String>> tags) {
        this.description = description;
        this.deviceFleetName = Objects.requireNonNull(deviceFleetName, "expected parameter 'deviceFleetName' to be non-null");
        this.enableIotRoleAlias = enableIotRoleAlias;
        this.outputConfig = Objects.requireNonNull(outputConfig, "expected parameter 'outputConfig' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private DeviceFleetArgs() {
        this.description = Input.empty();
        this.deviceFleetName = Input.empty();
        this.enableIotRoleAlias = Input.empty();
        this.outputConfig = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> deviceFleetName;
        private @Nullable Input<Boolean> enableIotRoleAlias;
        private Input<DeviceFleetOutputConfigArgs> outputConfig;
        private Input<String> roleArn;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceFleetName = defaults.deviceFleetName;
    	      this.enableIotRoleAlias = defaults.enableIotRoleAlias;
    	      this.outputConfig = defaults.outputConfig;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDeviceFleetName(Input<String> deviceFleetName) {
            this.deviceFleetName = Objects.requireNonNull(deviceFleetName);
            return this;
        }

        public Builder setDeviceFleetName(String deviceFleetName) {
            this.deviceFleetName = Input.of(Objects.requireNonNull(deviceFleetName));
            return this;
        }

        public Builder setEnableIotRoleAlias(@Nullable Input<Boolean> enableIotRoleAlias) {
            this.enableIotRoleAlias = enableIotRoleAlias;
            return this;
        }

        public Builder setEnableIotRoleAlias(@Nullable Boolean enableIotRoleAlias) {
            this.enableIotRoleAlias = Input.ofNullable(enableIotRoleAlias);
            return this;
        }

        public Builder setOutputConfig(Input<DeviceFleetOutputConfigArgs> outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }

        public Builder setOutputConfig(DeviceFleetOutputConfigArgs outputConfig) {
            this.outputConfig = Input.of(Objects.requireNonNull(outputConfig));
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DeviceFleetArgs build() {
            return new DeviceFleetArgs(description, deviceFleetName, enableIotRoleAlias, outputConfig, roleArn, tags);
        }
    }
}