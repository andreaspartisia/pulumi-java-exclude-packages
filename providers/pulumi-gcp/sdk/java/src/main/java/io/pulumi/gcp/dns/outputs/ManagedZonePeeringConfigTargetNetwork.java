// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dns.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagedZonePeeringConfigTargetNetwork {
    /**
     * The id or fully qualified URL of the VPC network to forward queries to.
     * This should be formatted like `projects/{project}/global/networks/{network}` or
     * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
     * 
     */
    private final String networkUrl;

    @OutputCustomType.Constructor({"networkUrl"})
    private ManagedZonePeeringConfigTargetNetwork(String networkUrl) {
        this.networkUrl = Objects.requireNonNull(networkUrl);
    }

    /**
     * The id or fully qualified URL of the VPC network to forward queries to.
     * This should be formatted like `projects/{project}/global/networks/{network}` or
     * `https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}`
     * 
     */
    public String getNetworkUrl() {
        return this.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigTargetNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigTargetNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder setNetworkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }

        public ManagedZonePeeringConfigTargetNetwork build() {
            return new ManagedZonePeeringConfigTargetNetwork(networkUrl);
        }
    }
}