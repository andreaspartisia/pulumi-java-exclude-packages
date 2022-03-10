// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.globalaccelerator.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class EndpointGroupPortOverride {
    /**
     * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
     * 
     */
    private final Integer endpointPort;
    /**
     * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
     * 
     */
    private final Integer listenerPort;

    @OutputCustomType.Constructor
    private EndpointGroupPortOverride(
        @OutputCustomType.Parameter("endpointPort") Integer endpointPort,
        @OutputCustomType.Parameter("listenerPort") Integer listenerPort) {
        this.endpointPort = endpointPort;
        this.listenerPort = listenerPort;
    }

    /**
     * The endpoint port that you want a listener port to be mapped to. This is the port on the endpoint, such as the Application Load Balancer or Amazon EC2 instance.
     * 
    */
    public Integer getEndpointPort() {
        return this.endpointPort;
    }
    /**
     * The listener port that you want to map to a specific endpoint port. This is the port that user traffic arrives to the Global Accelerator on.
     * 
    */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupPortOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer endpointPort;
        private Integer listenerPort;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupPortOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointPort = defaults.endpointPort;
    	      this.listenerPort = defaults.listenerPort;
        }

        public Builder setEndpointPort(Integer endpointPort) {
            this.endpointPort = Objects.requireNonNull(endpointPort);
            return this;
        }

        public Builder setListenerPort(Integer listenerPort) {
            this.listenerPort = Objects.requireNonNull(listenerPort);
            return this;
        }
        public EndpointGroupPortOverride build() {
            return new EndpointGroupPortOverride(endpointPort, listenerPort);
        }
    }
}