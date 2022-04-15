// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.FirewallPolicyRuleMatcherLayer4ConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class FirewallPolicyRuleMatcherResponse extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyRuleMatcherResponse Empty = new FirewallPolicyRuleMatcherResponse();

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="destIpRanges", required=true)
      private final List<String> destIpRanges;

    public List<String> destIpRanges() {
        return this.destIpRanges;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
     */
    @Import(name="layer4Configs", required=true)
      private final List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;

    public List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs() {
        return this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="srcIpRanges", required=true)
      private final List<String> srcIpRanges;

    public List<String> srcIpRanges() {
        return this.srcIpRanges;
    }

    public FirewallPolicyRuleMatcherResponse(
        List<String> destIpRanges,
        List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs,
        List<String> srcIpRanges) {
        this.destIpRanges = Objects.requireNonNull(destIpRanges, "expected parameter 'destIpRanges' to be non-null");
        this.layer4Configs = Objects.requireNonNull(layer4Configs, "expected parameter 'layer4Configs' to be non-null");
        this.srcIpRanges = Objects.requireNonNull(srcIpRanges, "expected parameter 'srcIpRanges' to be non-null");
    }

    private FirewallPolicyRuleMatcherResponse() {
        this.destIpRanges = List.of();
        this.layer4Configs = List.of();
        this.srcIpRanges = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destIpRanges;
        private List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;
        private List<String> srcIpRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        public Builder destIpRanges(List<String> destIpRanges) {
            this.destIpRanges = Objects.requireNonNull(destIpRanges);
            return this;
        }
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }
        public Builder layer4Configs(List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }
        public Builder layer4Configs(FirewallPolicyRuleMatcherLayer4ConfigResponse... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }
        public Builder srcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }        public FirewallPolicyRuleMatcherResponse build() {
            return new FirewallPolicyRuleMatcherResponse(destIpRanges, layer4Configs, srcIpRanges);
        }
    }
}
