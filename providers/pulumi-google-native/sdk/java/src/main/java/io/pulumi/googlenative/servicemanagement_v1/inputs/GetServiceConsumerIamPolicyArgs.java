// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetServiceConsumerIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceConsumerIamPolicyArgs Empty = new GetServiceConsumerIamPolicyArgs();

    @InputImport(name="consumerId", required=true)
    private final String consumerId;

    public String getConsumerId() {
        return this.consumerId;
    }

    @InputImport(name="serviceId", required=true)
    private final String serviceId;

    public String getServiceId() {
        return this.serviceId;
    }

    public GetServiceConsumerIamPolicyArgs(
        String consumerId,
        String serviceId) {
        this.consumerId = Objects.requireNonNull(consumerId, "expected parameter 'consumerId' to be non-null");
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
    }

    private GetServiceConsumerIamPolicyArgs() {
        this.consumerId = null;
        this.serviceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceConsumerIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumerId;
        private String serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceConsumerIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerId = defaults.consumerId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder setConsumerId(String consumerId) {
            this.consumerId = Objects.requireNonNull(consumerId);
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public GetServiceConsumerIamPolicyArgs build() {
            return new GetServiceConsumerIamPolicyArgs(consumerId, serviceId);
        }
    }
}