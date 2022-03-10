// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterClusterConfigEndpointConfig {
    /**
     * The flag to enable http access to specific ports
     * on the cluster from external sources (aka Component Gateway). Defaults to false.
     * 
     */
    private final Boolean enableHttpPortAccess;
    private final @Nullable Map<String,Object> httpPorts;

    @OutputCustomType.Constructor
    private ClusterClusterConfigEndpointConfig(
        @OutputCustomType.Parameter("enableHttpPortAccess") Boolean enableHttpPortAccess,
        @OutputCustomType.Parameter("httpPorts") @Nullable Map<String,Object> httpPorts) {
        this.enableHttpPortAccess = enableHttpPortAccess;
        this.httpPorts = httpPorts;
    }

    /**
     * The flag to enable http access to specific ports
     * on the cluster from external sources (aka Component Gateway). Defaults to false.
     * 
    */
    public Boolean getEnableHttpPortAccess() {
        return this.enableHttpPortAccess;
    }
    public Map<String,Object> getHttpPorts() {
        return this.httpPorts == null ? Map.of() : this.httpPorts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigEndpointConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableHttpPortAccess;
        private @Nullable Map<String,Object> httpPorts;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigEndpointConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHttpPortAccess = defaults.enableHttpPortAccess;
    	      this.httpPorts = defaults.httpPorts;
        }

        public Builder setEnableHttpPortAccess(Boolean enableHttpPortAccess) {
            this.enableHttpPortAccess = Objects.requireNonNull(enableHttpPortAccess);
            return this;
        }

        public Builder setHttpPorts(@Nullable Map<String,Object> httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public ClusterClusterConfigEndpointConfig build() {
            return new ClusterClusterConfigEndpointConfig(enableHttpPortAccess, httpPorts);
        }
    }
}
