// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobAppEngineHttpTargetAppEngineRouting {
    /**
     * App instance.
     * By default, the job is sent to an instance which is available when the job is attempted.
     * 
     */
    private final @Nullable String instance;
    /**
     * App service.
     * By default, the job is sent to the service which is the default service when the job is attempted.
     * 
     */
    private final @Nullable String service;
    /**
     * App version.
     * By default, the job is sent to the version which is the default version when the job is attempted.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor
    private JobAppEngineHttpTargetAppEngineRouting(
        @OutputCustomType.Parameter("instance") @Nullable String instance,
        @OutputCustomType.Parameter("service") @Nullable String service,
        @OutputCustomType.Parameter("version") @Nullable String version) {
        this.instance = instance;
        this.service = service;
        this.version = version;
    }

    /**
     * App instance.
     * By default, the job is sent to an instance which is available when the job is attempted.
     * 
    */
    public Optional<String> getInstance() {
        return Optional.ofNullable(this.instance);
    }
    /**
     * App service.
     * By default, the job is sent to the service which is the default service when the job is attempted.
     * 
    */
    public Optional<String> getService() {
        return Optional.ofNullable(this.service);
    }
    /**
     * App version.
     * By default, the job is sent to the version which is the default version when the job is attempted.
     * 
    */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobAppEngineHttpTargetAppEngineRouting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instance;
        private @Nullable String service;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(JobAppEngineHttpTargetAppEngineRouting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.service = defaults.service;
    	      this.version = defaults.version;
        }

        public Builder setInstance(@Nullable String instance) {
            this.instance = instance;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = service;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public JobAppEngineHttpTargetAppEngineRouting build() {
            return new JobAppEngineHttpTargetAppEngineRouting(instance, service, version);
        }
    }
}
