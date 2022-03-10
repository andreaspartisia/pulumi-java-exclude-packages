// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.cloudrun.outputs.ServiceStatusCondition;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceStatus {
    private final @Nullable List<ServiceStatusCondition> conditions;
    private final @Nullable String latestCreatedRevisionName;
    private final @Nullable String latestReadyRevisionName;
    private final @Nullable Integer observedGeneration;
    private final @Nullable String url;

    @OutputCustomType.Constructor
    private ServiceStatus(
        @OutputCustomType.Parameter("conditions") @Nullable List<ServiceStatusCondition> conditions,
        @OutputCustomType.Parameter("latestCreatedRevisionName") @Nullable String latestCreatedRevisionName,
        @OutputCustomType.Parameter("latestReadyRevisionName") @Nullable String latestReadyRevisionName,
        @OutputCustomType.Parameter("observedGeneration") @Nullable Integer observedGeneration,
        @OutputCustomType.Parameter("url") @Nullable String url) {
        this.conditions = conditions;
        this.latestCreatedRevisionName = latestCreatedRevisionName;
        this.latestReadyRevisionName = latestReadyRevisionName;
        this.observedGeneration = observedGeneration;
        this.url = url;
    }

    public List<ServiceStatusCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    public Optional<String> getLatestCreatedRevisionName() {
        return Optional.ofNullable(this.latestCreatedRevisionName);
    }
    public Optional<String> getLatestReadyRevisionName() {
        return Optional.ofNullable(this.latestReadyRevisionName);
    }
    public Optional<Integer> getObservedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServiceStatusCondition> conditions;
        private @Nullable String latestCreatedRevisionName;
        private @Nullable String latestReadyRevisionName;
        private @Nullable Integer observedGeneration;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.latestCreatedRevisionName = defaults.latestCreatedRevisionName;
    	      this.latestReadyRevisionName = defaults.latestReadyRevisionName;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.url = defaults.url;
        }

        public Builder setConditions(@Nullable List<ServiceStatusCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setLatestCreatedRevisionName(@Nullable String latestCreatedRevisionName) {
            this.latestCreatedRevisionName = latestCreatedRevisionName;
            return this;
        }

        public Builder setLatestReadyRevisionName(@Nullable String latestReadyRevisionName) {
            this.latestReadyRevisionName = latestReadyRevisionName;
            return this;
        }

        public Builder setObservedGeneration(@Nullable Integer observedGeneration) {
            this.observedGeneration = observedGeneration;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public ServiceStatus build() {
            return new ServiceStatus(conditions, latestCreatedRevisionName, latestReadyRevisionName, observedGeneration, url);
        }
    }
}
