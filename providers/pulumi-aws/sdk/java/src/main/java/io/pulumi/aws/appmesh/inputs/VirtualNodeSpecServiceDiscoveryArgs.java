// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryDnsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecServiceDiscoveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecServiceDiscoveryArgs Empty = new VirtualNodeSpecServiceDiscoveryArgs();

    /**
     * Specifies any AWS Cloud Map information for the virtual node.
     * 
     */
    @InputImport(name="awsCloudMap")
      private final @Nullable Input<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> awsCloudMap;

    public Input<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> getAwsCloudMap() {
        return this.awsCloudMap == null ? Input.empty() : this.awsCloudMap;
    }

    /**
     * Specifies the DNS service name for the virtual node.
     * 
     */
    @InputImport(name="dns")
      private final @Nullable Input<VirtualNodeSpecServiceDiscoveryDnsArgs> dns;

    public Input<VirtualNodeSpecServiceDiscoveryDnsArgs> getDns() {
        return this.dns == null ? Input.empty() : this.dns;
    }

    public VirtualNodeSpecServiceDiscoveryArgs(
        @Nullable Input<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> awsCloudMap,
        @Nullable Input<VirtualNodeSpecServiceDiscoveryDnsArgs> dns) {
        this.awsCloudMap = awsCloudMap;
        this.dns = dns;
    }

    private VirtualNodeSpecServiceDiscoveryArgs() {
        this.awsCloudMap = Input.empty();
        this.dns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecServiceDiscoveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> awsCloudMap;
        private @Nullable Input<VirtualNodeSpecServiceDiscoveryDnsArgs> dns;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecServiceDiscoveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsCloudMap = defaults.awsCloudMap;
    	      this.dns = defaults.dns;
        }

        public Builder setAwsCloudMap(@Nullable Input<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> awsCloudMap) {
            this.awsCloudMap = awsCloudMap;
            return this;
        }

        public Builder setAwsCloudMap(@Nullable VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs awsCloudMap) {
            this.awsCloudMap = Input.ofNullable(awsCloudMap);
            return this;
        }

        public Builder setDns(@Nullable Input<VirtualNodeSpecServiceDiscoveryDnsArgs> dns) {
            this.dns = dns;
            return this;
        }

        public Builder setDns(@Nullable VirtualNodeSpecServiceDiscoveryDnsArgs dns) {
            this.dns = Input.ofNullable(dns);
            return this;
        }
        public VirtualNodeSpecServiceDiscoveryArgs build() {
            return new VirtualNodeSpecServiceDiscoveryArgs(awsCloudMap, dns);
        }
    }
}