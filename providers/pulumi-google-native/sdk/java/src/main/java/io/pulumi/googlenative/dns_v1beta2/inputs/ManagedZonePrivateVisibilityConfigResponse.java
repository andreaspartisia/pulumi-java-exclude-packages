// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1beta2.inputs.ManagedZonePrivateVisibilityConfigGKEClusterResponse;
import io.pulumi.googlenative.dns_v1beta2.inputs.ManagedZonePrivateVisibilityConfigNetworkResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ManagedZonePrivateVisibilityConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZonePrivateVisibilityConfigResponse Empty = new ManagedZonePrivateVisibilityConfigResponse();

    /**
     * The list of Google Kubernetes Engine clusters that can see this zone.
     * 
     */
    @Import(name="gkeClusters", required=true)
      private final List<ManagedZonePrivateVisibilityConfigGKEClusterResponse> gkeClusters;

    public List<ManagedZonePrivateVisibilityConfigGKEClusterResponse> gkeClusters() {
        return this.gkeClusters;
    }

    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The list of VPC networks that can see this zone.
     * 
     */
    @Import(name="networks", required=true)
      private final List<ManagedZonePrivateVisibilityConfigNetworkResponse> networks;

    public List<ManagedZonePrivateVisibilityConfigNetworkResponse> networks() {
        return this.networks;
    }

    public ManagedZonePrivateVisibilityConfigResponse(
        List<ManagedZonePrivateVisibilityConfigGKEClusterResponse> gkeClusters,
        String kind,
        List<ManagedZonePrivateVisibilityConfigNetworkResponse> networks) {
        this.gkeClusters = Objects.requireNonNull(gkeClusters, "expected parameter 'gkeClusters' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.networks = Objects.requireNonNull(networks, "expected parameter 'networks' to be non-null");
    }

    private ManagedZonePrivateVisibilityConfigResponse() {
        this.gkeClusters = List.of();
        this.kind = null;
        this.networks = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ManagedZonePrivateVisibilityConfigGKEClusterResponse> gkeClusters;
        private String kind;
        private List<ManagedZonePrivateVisibilityConfigNetworkResponse> networks;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusters = defaults.gkeClusters;
    	      this.kind = defaults.kind;
    	      this.networks = defaults.networks;
        }

        public Builder gkeClusters(List<ManagedZonePrivateVisibilityConfigGKEClusterResponse> gkeClusters) {
            this.gkeClusters = Objects.requireNonNull(gkeClusters);
            return this;
        }
        public Builder gkeClusters(ManagedZonePrivateVisibilityConfigGKEClusterResponse... gkeClusters) {
            return gkeClusters(List.of(gkeClusters));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder networks(List<ManagedZonePrivateVisibilityConfigNetworkResponse> networks) {
            this.networks = Objects.requireNonNull(networks);
            return this;
        }
        public Builder networks(ManagedZonePrivateVisibilityConfigNetworkResponse... networks) {
            return networks(List.of(networks));
        }        public ManagedZonePrivateVisibilityConfigResponse build() {
            return new ManagedZonePrivateVisibilityConfigResponse(gkeClusters, kind, networks);
        }
    }
}
