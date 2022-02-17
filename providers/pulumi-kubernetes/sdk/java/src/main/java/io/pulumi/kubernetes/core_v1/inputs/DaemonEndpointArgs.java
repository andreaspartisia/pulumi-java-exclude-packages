// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * DaemonEndpoint contains information about a single Daemon endpoint.
 * 
 */
public final class DaemonEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaemonEndpointArgs Empty = new DaemonEndpointArgs();

    /**
     * Port number of the given endpoint.
     * 
     */
    @InputImport(name="Port", required=true)
    private final Input<Integer> Port;

    public Input<Integer> getPort() {
        return this.Port;
    }

    public DaemonEndpointArgs(Input<Integer> Port) {
        this.Port = Objects.requireNonNull(Port, "expected parameter 'Port' to be non-null");
    }

    private DaemonEndpointArgs() {
        this.Port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> Port;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.Port = defaults.Port;
        }

        public Builder setPort(Input<Integer> Port) {
            this.Port = Objects.requireNonNull(Port);
            return this;
        }

        public Builder setPort(Integer Port) {
            this.Port = Input.of(Objects.requireNonNull(Port));
            return this;
        }

        public DaemonEndpointArgs build() {
            return new DaemonEndpointArgs(Port);
        }
    }
}