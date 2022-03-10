// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNetblockIPRangesResult {
    /**
     * Retrieve list of all CIDR blocks.
     * 
     */
    private final List<String> cidrBlocks;
    /**
     * Retrieve list of the IPv4 CIDR blocks
     * 
     */
    private final List<String> cidrBlocksIpv4s;
    /**
     * Retrieve list of the IPv6 CIDR blocks, if available.
     * 
     */
    private final List<String> cidrBlocksIpv6s;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable String rangeType;

    @OutputCustomType.Constructor
    private GetNetblockIPRangesResult(
        @OutputCustomType.Parameter("cidrBlocks") List<String> cidrBlocks,
        @OutputCustomType.Parameter("cidrBlocksIpv4s") List<String> cidrBlocksIpv4s,
        @OutputCustomType.Parameter("cidrBlocksIpv6s") List<String> cidrBlocksIpv6s,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("rangeType") @Nullable String rangeType) {
        this.cidrBlocks = cidrBlocks;
        this.cidrBlocksIpv4s = cidrBlocksIpv4s;
        this.cidrBlocksIpv6s = cidrBlocksIpv6s;
        this.id = id;
        this.rangeType = rangeType;
    }

    /**
     * Retrieve list of all CIDR blocks.
     * 
    */
    public List<String> getCidrBlocks() {
        return this.cidrBlocks;
    }
    /**
     * Retrieve list of the IPv4 CIDR blocks
     * 
    */
    public List<String> getCidrBlocksIpv4s() {
        return this.cidrBlocksIpv4s;
    }
    /**
     * Retrieve list of the IPv6 CIDR blocks, if available.
     * 
    */
    public List<String> getCidrBlocksIpv6s() {
        return this.cidrBlocksIpv6s;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Optional<String> getRangeType() {
        return Optional.ofNullable(this.rangeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetblockIPRangesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> cidrBlocks;
        private List<String> cidrBlocksIpv4s;
        private List<String> cidrBlocksIpv6s;
        private String id;
        private @Nullable String rangeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetblockIPRangesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlocks = defaults.cidrBlocks;
    	      this.cidrBlocksIpv4s = defaults.cidrBlocksIpv4s;
    	      this.cidrBlocksIpv6s = defaults.cidrBlocksIpv6s;
    	      this.id = defaults.id;
    	      this.rangeType = defaults.rangeType;
        }

        public Builder setCidrBlocks(List<String> cidrBlocks) {
            this.cidrBlocks = Objects.requireNonNull(cidrBlocks);
            return this;
        }

        public Builder setCidrBlocksIpv4s(List<String> cidrBlocksIpv4s) {
            this.cidrBlocksIpv4s = Objects.requireNonNull(cidrBlocksIpv4s);
            return this;
        }

        public Builder setCidrBlocksIpv6s(List<String> cidrBlocksIpv6s) {
            this.cidrBlocksIpv6s = Objects.requireNonNull(cidrBlocksIpv6s);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setRangeType(@Nullable String rangeType) {
            this.rangeType = rangeType;
            return this;
        }
        public GetNetblockIPRangesResult build() {
            return new GetNetblockIPRangesResult(cidrBlocks, cidrBlocksIpv4s, cidrBlocksIpv6s, id, rangeType);
        }
    }
}
