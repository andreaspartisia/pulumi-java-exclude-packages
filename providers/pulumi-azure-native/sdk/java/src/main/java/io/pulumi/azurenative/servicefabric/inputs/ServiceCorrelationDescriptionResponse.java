// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceCorrelationDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceCorrelationDescriptionResponse Empty = new ServiceCorrelationDescriptionResponse();

    @InputImport(name="scheme", required=true)
    private final String scheme;

    public String getScheme() {
        return this.scheme;
    }

    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public ServiceCorrelationDescriptionResponse(
        String scheme,
        String serviceName) {
        this.scheme = Objects.requireNonNull(scheme, "expected parameter 'scheme' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ServiceCorrelationDescriptionResponse() {
        this.scheme = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCorrelationDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scheme;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCorrelationDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheme = defaults.scheme;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setScheme(String scheme) {
            this.scheme = Objects.requireNonNull(scheme);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public ServiceCorrelationDescriptionResponse build() {
            return new ServiceCorrelationDescriptionResponse(scheme, serviceName);
        }
    }
}