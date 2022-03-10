// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeringConnectionOptionsRequesterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeringConnectionOptionsRequesterArgs Empty = new PeeringConnectionOptionsRequesterArgs();

    /**
     * Allow a local linked EC2-Classic instance to communicate
     * with instances in a peer VPC. This enables an outbound communication from the local ClassicLink connection
     * to the remote VPC. This option is not supported for inter-region VPC peering.
     * 
     */
    @InputImport(name="allowClassicLinkToRemoteVpc")
      private final @Nullable Input<Boolean> allowClassicLinkToRemoteVpc;

    public Input<Boolean> getAllowClassicLinkToRemoteVpc() {
        return this.allowClassicLinkToRemoteVpc == null ? Input.empty() : this.allowClassicLinkToRemoteVpc;
    }

    /**
     * Allow a local VPC to resolve public DNS hostnames to
     * private IP addresses when queried from instances in the peer VPC.
     * 
     */
    @InputImport(name="allowRemoteVpcDnsResolution")
      private final @Nullable Input<Boolean> allowRemoteVpcDnsResolution;

    public Input<Boolean> getAllowRemoteVpcDnsResolution() {
        return this.allowRemoteVpcDnsResolution == null ? Input.empty() : this.allowRemoteVpcDnsResolution;
    }

    /**
     * Allow a local VPC to communicate with a linked EC2-Classic
     * instance in a peer VPC. This enables an outbound communication from the local VPC to the remote ClassicLink
     * connection. This option is not supported for inter-region VPC peering.
     * 
     */
    @InputImport(name="allowVpcToRemoteClassicLink")
      private final @Nullable Input<Boolean> allowVpcToRemoteClassicLink;

    public Input<Boolean> getAllowVpcToRemoteClassicLink() {
        return this.allowVpcToRemoteClassicLink == null ? Input.empty() : this.allowVpcToRemoteClassicLink;
    }

    public PeeringConnectionOptionsRequesterArgs(
        @Nullable Input<Boolean> allowClassicLinkToRemoteVpc,
        @Nullable Input<Boolean> allowRemoteVpcDnsResolution,
        @Nullable Input<Boolean> allowVpcToRemoteClassicLink) {
        this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
        this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
        this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
    }

    private PeeringConnectionOptionsRequesterArgs() {
        this.allowClassicLinkToRemoteVpc = Input.empty();
        this.allowRemoteVpcDnsResolution = Input.empty();
        this.allowVpcToRemoteClassicLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringConnectionOptionsRequesterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowClassicLinkToRemoteVpc;
        private @Nullable Input<Boolean> allowRemoteVpcDnsResolution;
        private @Nullable Input<Boolean> allowVpcToRemoteClassicLink;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringConnectionOptionsRequesterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowClassicLinkToRemoteVpc = defaults.allowClassicLinkToRemoteVpc;
    	      this.allowRemoteVpcDnsResolution = defaults.allowRemoteVpcDnsResolution;
    	      this.allowVpcToRemoteClassicLink = defaults.allowVpcToRemoteClassicLink;
        }

        public Builder setAllowClassicLinkToRemoteVpc(@Nullable Input<Boolean> allowClassicLinkToRemoteVpc) {
            this.allowClassicLinkToRemoteVpc = allowClassicLinkToRemoteVpc;
            return this;
        }

        public Builder setAllowClassicLinkToRemoteVpc(@Nullable Boolean allowClassicLinkToRemoteVpc) {
            this.allowClassicLinkToRemoteVpc = Input.ofNullable(allowClassicLinkToRemoteVpc);
            return this;
        }

        public Builder setAllowRemoteVpcDnsResolution(@Nullable Input<Boolean> allowRemoteVpcDnsResolution) {
            this.allowRemoteVpcDnsResolution = allowRemoteVpcDnsResolution;
            return this;
        }

        public Builder setAllowRemoteVpcDnsResolution(@Nullable Boolean allowRemoteVpcDnsResolution) {
            this.allowRemoteVpcDnsResolution = Input.ofNullable(allowRemoteVpcDnsResolution);
            return this;
        }

        public Builder setAllowVpcToRemoteClassicLink(@Nullable Input<Boolean> allowVpcToRemoteClassicLink) {
            this.allowVpcToRemoteClassicLink = allowVpcToRemoteClassicLink;
            return this;
        }

        public Builder setAllowVpcToRemoteClassicLink(@Nullable Boolean allowVpcToRemoteClassicLink) {
            this.allowVpcToRemoteClassicLink = Input.ofNullable(allowVpcToRemoteClassicLink);
            return this;
        }
        public PeeringConnectionOptionsRequesterArgs build() {
            return new PeeringConnectionOptionsRequesterArgs(allowClassicLinkToRemoteVpc, allowRemoteVpcDnsResolution, allowVpcToRemoteClassicLink);
        }
    }
}