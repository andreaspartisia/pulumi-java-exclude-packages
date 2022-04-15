// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.accesscontextmanager_v1beta.outputs.DevicePolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ConditionResponse {
    /**
     * Device specific restrictions, all restrictions must hold for the Condition to be true. If not specified, all devices are allowed.
     * 
     */
    private final DevicePolicyResponse devicePolicy;
    /**
     * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host bits must be zero) or the input is considered malformed. For example, "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly, for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32" is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
     * 
     */
    private final List<String> ipSubnetworks;
    /**
     * The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid}` `serviceAccount:{emailid}` If not specified, a request may come from any user.
     * 
     */
    private final List<String> members;
    /**
     * Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
     * 
     */
    private final Boolean negate;
    /**
     * The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes.
     * 
     */
    private final List<String> regions;
    /**
     * A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be granted for the Condition to be true. Example: "`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME"`
     * 
     */
    private final List<String> requiredAccessLevels;

    @CustomType.Constructor
    private ConditionResponse(
        @CustomType.Parameter("devicePolicy") DevicePolicyResponse devicePolicy,
        @CustomType.Parameter("ipSubnetworks") List<String> ipSubnetworks,
        @CustomType.Parameter("members") List<String> members,
        @CustomType.Parameter("negate") Boolean negate,
        @CustomType.Parameter("regions") List<String> regions,
        @CustomType.Parameter("requiredAccessLevels") List<String> requiredAccessLevels) {
        this.devicePolicy = devicePolicy;
        this.ipSubnetworks = ipSubnetworks;
        this.members = members;
        this.negate = negate;
        this.regions = regions;
        this.requiredAccessLevels = requiredAccessLevels;
    }

    /**
     * Device specific restrictions, all restrictions must hold for the Condition to be true. If not specified, all devices are allowed.
     * 
    */
    public DevicePolicyResponse devicePolicy() {
        return this.devicePolicy;
    }
    /**
     * CIDR block IP subnetwork specification. May be IPv4 or IPv6. Note that for a CIDR IP address block, the specified IP address portion must be properly truncated (i.e. all the host bits must be zero) or the input is considered malformed. For example, "192.0.2.0/24" is accepted but "192.0.2.1/24" is not. Similarly, for IPv6, "2001:db8::/32" is accepted whereas "2001:db8::1/32" is not. The originating IP of a request must be in one of the listed subnets in order for this Condition to be true. If empty, all IP addresses are allowed.
     * 
    */
    public List<String> ipSubnetworks() {
        return this.ipSubnetworks;
    }
    /**
     * The request must be made by one of the provided user or service accounts. Groups are not supported. Syntax: `user:{emailid}` `serviceAccount:{emailid}` If not specified, a request may come from any user.
     * 
    */
    public List<String> members() {
        return this.members;
    }
    /**
     * Whether to negate the Condition. If true, the Condition becomes a NAND over its non-empty fields, each field must be false for the Condition overall to be satisfied. Defaults to false.
     * 
    */
    public Boolean negate() {
        return this.negate;
    }
    /**
     * The request must originate from one of the provided countries/regions. Must be valid ISO 3166-1 alpha-2 codes.
     * 
    */
    public List<String> regions() {
        return this.regions;
    }
    /**
     * A list of other access levels defined in the same `Policy`, referenced by resource name. Referencing an `AccessLevel` which does not exist is an error. All access levels listed must be granted for the Condition to be true. Example: "`accessPolicies/MY_POLICY/accessLevels/LEVEL_NAME"`
     * 
    */
    public List<String> requiredAccessLevels() {
        return this.requiredAccessLevels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DevicePolicyResponse devicePolicy;
        private List<String> ipSubnetworks;
        private List<String> members;
        private Boolean negate;
        private List<String> regions;
        private List<String> requiredAccessLevels;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePolicy = defaults.devicePolicy;
    	      this.ipSubnetworks = defaults.ipSubnetworks;
    	      this.members = defaults.members;
    	      this.negate = defaults.negate;
    	      this.regions = defaults.regions;
    	      this.requiredAccessLevels = defaults.requiredAccessLevels;
        }

        public Builder devicePolicy(DevicePolicyResponse devicePolicy) {
            this.devicePolicy = Objects.requireNonNull(devicePolicy);
            return this;
        }
        public Builder ipSubnetworks(List<String> ipSubnetworks) {
            this.ipSubnetworks = Objects.requireNonNull(ipSubnetworks);
            return this;
        }
        public Builder ipSubnetworks(String... ipSubnetworks) {
            return ipSubnetworks(List.of(ipSubnetworks));
        }
        public Builder members(List<String> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder negate(Boolean negate) {
            this.negate = Objects.requireNonNull(negate);
            return this;
        }
        public Builder regions(List<String> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }
        public Builder requiredAccessLevels(List<String> requiredAccessLevels) {
            this.requiredAccessLevels = Objects.requireNonNull(requiredAccessLevels);
            return this;
        }
        public Builder requiredAccessLevels(String... requiredAccessLevels) {
            return requiredAccessLevels(List.of(requiredAccessLevels));
        }        public ConditionResponse build() {
            return new ConditionResponse(devicePolicy, ipSubnetworks, members, negate, regions, requiredAccessLevels);
        }
    }
}
