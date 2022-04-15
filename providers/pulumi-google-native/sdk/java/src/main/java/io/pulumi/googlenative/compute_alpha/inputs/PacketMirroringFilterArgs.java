// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.PacketMirroringFilterDirection;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringFilterArgs Empty = new PacketMirroringFilterArgs();

    /**
     * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    @Import(name="cidrRanges")
      private final @Nullable Output<List<String>> cidrRanges;

    public Output<List<String>> cidrRanges() {
        return this.cidrRanges == null ? Codegen.empty() : this.cidrRanges;
    }

    /**
     * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
     * 
     */
    @Import(name="direction")
      private final @Nullable Output<PacketMirroringFilterDirection> direction;

    public Output<PacketMirroringFilterDirection> direction() {
        return this.direction == null ? Codegen.empty() : this.direction;
    }

    /**
     * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
     * 
     */
    @Import(name="ipProtocols")
      private final @Nullable Output<List<String>> ipProtocols;

    public Output<List<String>> ipProtocols() {
        return this.ipProtocols == null ? Codegen.empty() : this.ipProtocols;
    }

    public PacketMirroringFilterArgs(
        @Nullable Output<List<String>> cidrRanges,
        @Nullable Output<PacketMirroringFilterDirection> direction,
        @Nullable Output<List<String>> ipProtocols) {
        this.cidrRanges = cidrRanges;
        this.direction = direction;
        this.ipProtocols = ipProtocols;
    }

    private PacketMirroringFilterArgs() {
        this.cidrRanges = Codegen.empty();
        this.direction = Codegen.empty();
        this.ipProtocols = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> cidrRanges;
        private @Nullable Output<PacketMirroringFilterDirection> direction;
        private @Nullable Output<List<String>> ipProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrRanges = defaults.cidrRanges;
    	      this.direction = defaults.direction;
    	      this.ipProtocols = defaults.ipProtocols;
        }

        public Builder cidrRanges(@Nullable Output<List<String>> cidrRanges) {
            this.cidrRanges = cidrRanges;
            return this;
        }
        public Builder cidrRanges(@Nullable List<String> cidrRanges) {
            this.cidrRanges = Codegen.ofNullable(cidrRanges);
            return this;
        }
        public Builder cidrRanges(String... cidrRanges) {
            return cidrRanges(List.of(cidrRanges));
        }
        public Builder direction(@Nullable Output<PacketMirroringFilterDirection> direction) {
            this.direction = direction;
            return this;
        }
        public Builder direction(@Nullable PacketMirroringFilterDirection direction) {
            this.direction = Codegen.ofNullable(direction);
            return this;
        }
        public Builder ipProtocols(@Nullable Output<List<String>> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }
        public Builder ipProtocols(@Nullable List<String> ipProtocols) {
            this.ipProtocols = Codegen.ofNullable(ipProtocols);
            return this;
        }
        public Builder ipProtocols(String... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }        public PacketMirroringFilterArgs build() {
            return new PacketMirroringFilterArgs(cidrRanges, direction, ipProtocols);
        }
    }
}
