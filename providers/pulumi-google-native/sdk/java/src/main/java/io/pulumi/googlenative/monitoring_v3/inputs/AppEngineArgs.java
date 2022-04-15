// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * App Engine service. Learn more at https://cloud.google.com/appengine.
 * 
 */
public final class AppEngineArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppEngineArgs Empty = new AppEngineArgs();

    /**
     * The ID of the App Engine module underlying this service. Corresponds to the module_id resource label in the gae_app monitored resource: https://cloud.google.com/monitoring/api/resources#tag_gae_app
     * 
     */
    @Import(name="moduleId")
      private final @Nullable Output<String> moduleId;

    public Output<String> moduleId() {
        return this.moduleId == null ? Codegen.empty() : this.moduleId;
    }

    public AppEngineArgs(@Nullable Output<String> moduleId) {
        this.moduleId = moduleId;
    }

    private AppEngineArgs() {
        this.moduleId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> moduleId;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.moduleId = defaults.moduleId;
        }

        public Builder moduleId(@Nullable Output<String> moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public Builder moduleId(@Nullable String moduleId) {
            this.moduleId = Codegen.ofNullable(moduleId);
            return this;
        }        public AppEngineArgs build() {
            return new AppEngineArgs(moduleId);
        }
    }
}
