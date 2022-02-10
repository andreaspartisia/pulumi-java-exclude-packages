// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class EndpointsApiServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointsApiServiceResponse Empty = new EndpointsApiServiceResponse();

    @InputImport(name="configId", required=true)
    private final String configId;

    public String getConfigId() {
        return this.configId;
    }

    @InputImport(name="disableTraceSampling", required=true)
    private final Boolean disableTraceSampling;

    public Boolean getDisableTraceSampling() {
        return this.disableTraceSampling;
    }

    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    @InputImport(name="rolloutStrategy", required=true)
    private final String rolloutStrategy;

    public String getRolloutStrategy() {
        return this.rolloutStrategy;
    }

    public EndpointsApiServiceResponse(
        String configId,
        Boolean disableTraceSampling,
        String name,
        String rolloutStrategy) {
        this.configId = Objects.requireNonNull(configId, "expected parameter 'configId' to be non-null");
        this.disableTraceSampling = Objects.requireNonNull(disableTraceSampling, "expected parameter 'disableTraceSampling' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.rolloutStrategy = Objects.requireNonNull(rolloutStrategy, "expected parameter 'rolloutStrategy' to be non-null");
    }

    private EndpointsApiServiceResponse() {
        this.configId = null;
        this.disableTraceSampling = null;
        this.name = null;
        this.rolloutStrategy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsApiServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configId;
        private Boolean disableTraceSampling;
        private String name;
        private String rolloutStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsApiServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.disableTraceSampling = defaults.disableTraceSampling;
    	      this.name = defaults.name;
    	      this.rolloutStrategy = defaults.rolloutStrategy;
        }

        public Builder setConfigId(String configId) {
            this.configId = Objects.requireNonNull(configId);
            return this;
        }

        public Builder setDisableTraceSampling(Boolean disableTraceSampling) {
            this.disableTraceSampling = Objects.requireNonNull(disableTraceSampling);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRolloutStrategy(String rolloutStrategy) {
            this.rolloutStrategy = Objects.requireNonNull(rolloutStrategy);
            return this;
        }

        public EndpointsApiServiceResponse build() {
            return new EndpointsApiServiceResponse(configId, disableTraceSampling, name, rolloutStrategy);
        }
    }
}