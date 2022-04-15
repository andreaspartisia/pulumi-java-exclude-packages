// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options for the build operations performed as a part of the version deployment. Only applicable for App Engine flexible environment when creating a version using source code directly.
 * 
 */
public final class CloudBuildOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudBuildOptionsArgs Empty = new CloudBuildOptionsArgs();

    /**
     * Path to the yaml file used in deployment, used to determine runtime configuration details.Required for flexible environment builds.See https://cloud.google.com/appengine/docs/standard/python/config/appref for more details.
     * 
     */
    @Import(name="appYamlPath")
      private final @Nullable Output<String> appYamlPath;

    public Output<String> appYamlPath() {
        return this.appYamlPath == null ? Codegen.empty() : this.appYamlPath;
    }

    /**
     * The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
     * 
     */
    @Import(name="cloudBuildTimeout")
      private final @Nullable Output<String> cloudBuildTimeout;

    public Output<String> cloudBuildTimeout() {
        return this.cloudBuildTimeout == null ? Codegen.empty() : this.cloudBuildTimeout;
    }

    public CloudBuildOptionsArgs(
        @Nullable Output<String> appYamlPath,
        @Nullable Output<String> cloudBuildTimeout) {
        this.appYamlPath = appYamlPath;
        this.cloudBuildTimeout = cloudBuildTimeout;
    }

    private CloudBuildOptionsArgs() {
        this.appYamlPath = Codegen.empty();
        this.cloudBuildTimeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudBuildOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appYamlPath;
        private @Nullable Output<String> cloudBuildTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudBuildOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appYamlPath = defaults.appYamlPath;
    	      this.cloudBuildTimeout = defaults.cloudBuildTimeout;
        }

        public Builder appYamlPath(@Nullable Output<String> appYamlPath) {
            this.appYamlPath = appYamlPath;
            return this;
        }
        public Builder appYamlPath(@Nullable String appYamlPath) {
            this.appYamlPath = Codegen.ofNullable(appYamlPath);
            return this;
        }
        public Builder cloudBuildTimeout(@Nullable Output<String> cloudBuildTimeout) {
            this.cloudBuildTimeout = cloudBuildTimeout;
            return this;
        }
        public Builder cloudBuildTimeout(@Nullable String cloudBuildTimeout) {
            this.cloudBuildTimeout = Codegen.ofNullable(cloudBuildTimeout);
            return this;
        }        public CloudBuildOptionsArgs build() {
            return new CloudBuildOptionsArgs(appYamlPath, cloudBuildTimeout);
        }
    }
}
