// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetRouterBgpAdvertisedIpRange;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRouterBgp {
    private final String advertiseMode;
    private final List<String> advertisedGroups;
    private final List<GetRouterBgpAdvertisedIpRange> advertisedIpRanges;
    private final Integer asn;

    @OutputCustomType.Constructor
    private GetRouterBgp(
        @OutputCustomType.Parameter("advertiseMode") String advertiseMode,
        @OutputCustomType.Parameter("advertisedGroups") List<String> advertisedGroups,
        @OutputCustomType.Parameter("advertisedIpRanges") List<GetRouterBgpAdvertisedIpRange> advertisedIpRanges,
        @OutputCustomType.Parameter("asn") Integer asn) {
        this.advertiseMode = advertiseMode;
        this.advertisedGroups = advertisedGroups;
        this.advertisedIpRanges = advertisedIpRanges;
        this.asn = asn;
    }

    public String getAdvertiseMode() {
        return this.advertiseMode;
    }
    public List<String> getAdvertisedGroups() {
        return this.advertisedGroups;
    }
    public List<GetRouterBgpAdvertisedIpRange> getAdvertisedIpRanges() {
        return this.advertisedIpRanges;
    }
    public Integer getAsn() {
        return this.asn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterBgp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advertiseMode;
        private List<String> advertisedGroups;
        private List<GetRouterBgpAdvertisedIpRange> advertisedIpRanges;
        private Integer asn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterBgp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.asn = defaults.asn;
        }

        public Builder setAdvertiseMode(String advertiseMode) {
            this.advertiseMode = Objects.requireNonNull(advertiseMode);
            return this;
        }

        public Builder setAdvertisedGroups(List<String> advertisedGroups) {
            this.advertisedGroups = Objects.requireNonNull(advertisedGroups);
            return this;
        }

        public Builder setAdvertisedIpRanges(List<GetRouterBgpAdvertisedIpRange> advertisedIpRanges) {
            this.advertisedIpRanges = Objects.requireNonNull(advertisedIpRanges);
            return this;
        }

        public Builder setAsn(Integer asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }
        public GetRouterBgp build() {
            return new GetRouterBgp(advertiseMode, advertisedGroups, advertisedIpRanges, asn);
        }
    }
}
