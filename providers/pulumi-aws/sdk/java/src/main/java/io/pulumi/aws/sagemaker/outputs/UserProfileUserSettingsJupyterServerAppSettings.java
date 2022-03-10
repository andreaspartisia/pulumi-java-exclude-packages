// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.aws.sagemaker.outputs.UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserProfileUserSettingsJupyterServerAppSettings {
    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    private final UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec defaultResourceSpec;
    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
     */
    private final @Nullable List<String> lifecycleConfigArns;

    @OutputCustomType.Constructor
    private UserProfileUserSettingsJupyterServerAppSettings(
        @OutputCustomType.Parameter("defaultResourceSpec") UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec defaultResourceSpec,
        @OutputCustomType.Parameter("lifecycleConfigArns") @Nullable List<String> lifecycleConfigArns) {
        this.defaultResourceSpec = defaultResourceSpec;
        this.lifecycleConfigArns = lifecycleConfigArns;
    }

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
    */
    public UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }
    /**
     * The Amazon Resource Name (ARN) of the Lifecycle Configurations.
     * 
    */
    public List<String> getLifecycleConfigArns() {
        return this.lifecycleConfigArns == null ? List.of() : this.lifecycleConfigArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsJupyterServerAppSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec defaultResourceSpec;
        private @Nullable List<String> lifecycleConfigArns;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsJupyterServerAppSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
    	      this.lifecycleConfigArns = defaults.lifecycleConfigArns;
        }

        public Builder setDefaultResourceSpec(UserProfileUserSettingsJupyterServerAppSettingsDefaultResourceSpec defaultResourceSpec) {
            this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec);
            return this;
        }

        public Builder setLifecycleConfigArns(@Nullable List<String> lifecycleConfigArns) {
            this.lifecycleConfigArns = lifecycleConfigArns;
            return this;
        }
        public UserProfileUserSettingsJupyterServerAppSettings build() {
            return new UserProfileUserSettingsJupyterServerAppSettings(defaultResourceSpec, lifecycleConfigArns);
        }
    }
}