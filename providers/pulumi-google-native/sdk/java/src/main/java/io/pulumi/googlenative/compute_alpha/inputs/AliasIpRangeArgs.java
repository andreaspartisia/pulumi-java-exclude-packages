// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An alias IP range attached to an instance's network interface.
 * 
 */
public final class AliasIpRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasIpRangeArgs Empty = new AliasIpRangeArgs();

    /**
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     * 
     */
    @Import(name="ipCidrRange")
      private final @Nullable Output<String> ipCidrRange;

    public Output<String> ipCidrRange() {
        return this.ipCidrRange == null ? Codegen.empty() : this.ipCidrRange;
    }

    /**
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
     * 
     */
    @Import(name="subnetworkRangeName")
      private final @Nullable Output<String> subnetworkRangeName;

    public Output<String> subnetworkRangeName() {
        return this.subnetworkRangeName == null ? Codegen.empty() : this.subnetworkRangeName;
    }

    public AliasIpRangeArgs(
        @Nullable Output<String> ipCidrRange,
        @Nullable Output<String> subnetworkRangeName) {
        this.ipCidrRange = ipCidrRange;
        this.subnetworkRangeName = subnetworkRangeName;
    }

    private AliasIpRangeArgs() {
        this.ipCidrRange = Codegen.empty();
        this.subnetworkRangeName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipCidrRange;
        private @Nullable Output<String> subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasIpRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }
        public Builder ipCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Codegen.ofNullable(ipCidrRange);
            return this;
        }
        public Builder subnetworkRangeName(@Nullable Output<String> subnetworkRangeName) {
            this.subnetworkRangeName = subnetworkRangeName;
            return this;
        }
        public Builder subnetworkRangeName(@Nullable String subnetworkRangeName) {
            this.subnetworkRangeName = Codegen.ofNullable(subnetworkRangeName);
            return this;
        }        public AliasIpRangeArgs build() {
            return new AliasIpRangeArgs(ipCidrRange, subnetworkRangeName);
        }
    }
}
