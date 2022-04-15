// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class PacketMirroringFilterResponse {
    /**
     * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    private final List<String> cidrRanges;
    /**
     * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
     * 
     */
    private final String direction;
    /**
     * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    private final List<String> ipProtocols;

    @CustomType.Constructor
    private PacketMirroringFilterResponse(
        @CustomType.Parameter("cidrRanges") List<String> cidrRanges,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("ipProtocols") List<String> ipProtocols) {
        this.cidrRanges = cidrRanges;
        this.direction = direction;
        this.ipProtocols = ipProtocols;
    }

    /**
     * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
    */
    public List<String> cidrRanges() {
        return this.cidrRanges;
    }
    /**
     * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
     * 
    */
    public String direction() {
        return this.direction;
    }
    /**
     * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
    */
    public List<String> ipProtocols() {
        return this.ipProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> cidrRanges;
        private String direction;
        private List<String> ipProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrRanges = defaults.cidrRanges;
    	      this.direction = defaults.direction;
    	      this.ipProtocols = defaults.ipProtocols;
        }

        public Builder cidrRanges(List<String> cidrRanges) {
            this.cidrRanges = Objects.requireNonNull(cidrRanges);
            return this;
        }
        public Builder cidrRanges(String... cidrRanges) {
            return cidrRanges(List.of(cidrRanges));
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder ipProtocols(List<String> ipProtocols) {
            this.ipProtocols = Objects.requireNonNull(ipProtocols);
            return this;
        }
        public Builder ipProtocols(String... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }        public PacketMirroringFilterResponse build() {
            return new PacketMirroringFilterResponse(cidrRanges, direction, ipProtocols);
        }
    }
}
