// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1.inputs.ManagedZoneForwardingConfigNameServerTargetResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ManagedZoneForwardingConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZoneForwardingConfigResponse Empty = new ManagedZoneForwardingConfigResponse();

    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * List of target name servers to forward to. Cloud DNS selects the best available name server if more than one target is given.
     * 
     */
    @Import(name="targetNameServers", required=true)
      private final List<ManagedZoneForwardingConfigNameServerTargetResponse> targetNameServers;

    public List<ManagedZoneForwardingConfigNameServerTargetResponse> targetNameServers() {
        return this.targetNameServers;
    }

    public ManagedZoneForwardingConfigResponse(
        String kind,
        List<ManagedZoneForwardingConfigNameServerTargetResponse> targetNameServers) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.targetNameServers = Objects.requireNonNull(targetNameServers, "expected parameter 'targetNameServers' to be non-null");
    }

    private ManagedZoneForwardingConfigResponse() {
        this.kind = null;
        this.targetNameServers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private List<ManagedZoneForwardingConfigNameServerTargetResponse> targetNameServers;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.targetNameServers = defaults.targetNameServers;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder targetNameServers(List<ManagedZoneForwardingConfigNameServerTargetResponse> targetNameServers) {
            this.targetNameServers = Objects.requireNonNull(targetNameServers);
            return this;
        }
        public Builder targetNameServers(ManagedZoneForwardingConfigNameServerTargetResponse... targetNameServers) {
            return targetNameServers(List.of(targetNameServers));
        }        public ManagedZoneForwardingConfigResponse build() {
            return new ManagedZoneForwardingConfigResponse(kind, targetNameServers);
        }
    }
}
