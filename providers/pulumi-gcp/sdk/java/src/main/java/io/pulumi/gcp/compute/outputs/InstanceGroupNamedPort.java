// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InstanceGroupNamedPort {
    /**
     * The name which the port will be mapped to.
     * 
     */
    private final String name;
    /**
     * The port number to map the name to.
     * 
     */
    private final Integer port;

    @OutputCustomType.Constructor
    private InstanceGroupNamedPort(
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("port") Integer port) {
        this.name = name;
        this.port = port;
    }

    /**
     * The name which the port will be mapped to.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The port number to map the name to.
     * 
    */
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupNamedPort defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupNamedPort defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public InstanceGroupNamedPort build() {
            return new InstanceGroupNamedPort(name, port);
        }
    }
}
