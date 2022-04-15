// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceResult {
    /**
     * ID of the project that produces and owns this service.
     * 
     */
    private final String producerProjectId;
    /**
     * The name of the service. See the [overview](/service-management/overview) for naming requirements.
     * 
     */
    private final String serviceName;

    @CustomType.Constructor
    private GetServiceResult(
        @CustomType.Parameter("producerProjectId") String producerProjectId,
        @CustomType.Parameter("serviceName") String serviceName) {
        this.producerProjectId = producerProjectId;
        this.serviceName = serviceName;
    }

    /**
     * ID of the project that produces and owns this service.
     * 
    */
    public String producerProjectId() {
        return this.producerProjectId;
    }
    /**
     * The name of the service. See the [overview](/service-management/overview) for naming requirements.
     * 
    */
    public String serviceName() {
        return this.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String producerProjectId;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.producerProjectId = defaults.producerProjectId;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder producerProjectId(String producerProjectId) {
            this.producerProjectId = Objects.requireNonNull(producerProjectId);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }        public GetServiceResult build() {
            return new GetServiceResult(producerProjectId, serviceName);
        }
    }
}
