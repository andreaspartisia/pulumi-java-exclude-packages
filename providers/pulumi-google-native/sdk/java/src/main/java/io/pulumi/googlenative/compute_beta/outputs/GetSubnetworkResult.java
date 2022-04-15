// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_beta.outputs.SubnetworkLogConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.SubnetworkSecondaryRangeResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubnetworkResult {
    /**
     * Whether this subnetwork's ranges can conflict with existing static routes. Setting this to true allows this subnetwork's primary and secondary ranges to overlap with (and contain) static routes that have already been configured on the corresponding network. For example if a static route has range 10.1.0.0/16, a subnet range 10.0.0.0/8 could only be created if allow_conflicting_routes=true. Overlapping is only allowed on subnetwork operations; routes whose ranges conflict with this subnetwork's ranges won't be allowed unless route.allow_conflicting_subnetworks is set to true. Typically packets destined to IPs within the subnetwork (which may contain private/sensitive data) are prevented from leaving the virtual network. Setting this field to true will disable this feature. The default value is false and applies to all existing subnetworks and automatically created subnetworks. This field cannot be set to true at resource creation time.
     * 
     */
    private final Boolean allowSubnetCidrRoutesOverlap;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     * 
     */
    private final String description;
    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    private final Boolean enableFlowLogs;
    /**
     * The range of external IPv6 addresses that are owned by this subnetwork.
     * 
     */
    private final String externalIpv6Prefix;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
     * 
     */
    private final String fingerprint;
    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
     */
    private final String gatewayAddress;
    /**
     * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     * 
     */
    private final String ipCidrRange;
    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
     */
    private final String ipv6AccessType;
    /**
     * The range of internal IPv6 addresses that are owned by this subnetwork. Note this will be for private google access only eventually.
     * 
     */
    private final String ipv6CidrRange;
    /**
     * Type of the resource. Always compute#subnetwork for Subnetwork resources.
     * 
     */
    private final String kind;
    /**
     * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     * 
     */
    private final SubnetworkLogConfigResponse logConfig;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     * 
     */
    private final String network;
    /**
     * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     * 
     */
    private final Boolean privateIpGoogleAccess;
    /**
     * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority. This field can be both set at resource creation time and updated using patch.
     * 
     */
    private final String privateIpv6GoogleAccess;
    /**
     * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    private final String purpose;
    /**
     * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     * 
     */
    private final String region;
    /**
     * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     * 
     */
    private final String role;
    /**
     * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     * 
     */
    private final List<SubnetworkSecondaryRangeResponse> secondaryIpRanges;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
     */
    private final String stackType;
    /**
     * The state of the subnetwork, which can be one of the following values: READY: Subnetwork is created and ready to use DRAINING: only applicable to subnetworks that have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load balancer are being drained. A subnetwork that is draining cannot be used or modified until it reaches a status of READY
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetSubnetworkResult(
        @CustomType.Parameter("allowSubnetCidrRoutesOverlap") Boolean allowSubnetCidrRoutesOverlap,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enableFlowLogs") Boolean enableFlowLogs,
        @CustomType.Parameter("externalIpv6Prefix") String externalIpv6Prefix,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("gatewayAddress") String gatewayAddress,
        @CustomType.Parameter("ipCidrRange") String ipCidrRange,
        @CustomType.Parameter("ipv6AccessType") String ipv6AccessType,
        @CustomType.Parameter("ipv6CidrRange") String ipv6CidrRange,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("logConfig") SubnetworkLogConfigResponse logConfig,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("privateIpGoogleAccess") Boolean privateIpGoogleAccess,
        @CustomType.Parameter("privateIpv6GoogleAccess") String privateIpv6GoogleAccess,
        @CustomType.Parameter("purpose") String purpose,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("role") String role,
        @CustomType.Parameter("secondaryIpRanges") List<SubnetworkSecondaryRangeResponse> secondaryIpRanges,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("stackType") String stackType,
        @CustomType.Parameter("state") String state) {
        this.allowSubnetCidrRoutesOverlap = allowSubnetCidrRoutesOverlap;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.enableFlowLogs = enableFlowLogs;
        this.externalIpv6Prefix = externalIpv6Prefix;
        this.fingerprint = fingerprint;
        this.gatewayAddress = gatewayAddress;
        this.ipCidrRange = ipCidrRange;
        this.ipv6AccessType = ipv6AccessType;
        this.ipv6CidrRange = ipv6CidrRange;
        this.kind = kind;
        this.logConfig = logConfig;
        this.name = name;
        this.network = network;
        this.privateIpGoogleAccess = privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.purpose = purpose;
        this.region = region;
        this.role = role;
        this.secondaryIpRanges = secondaryIpRanges;
        this.selfLink = selfLink;
        this.stackType = stackType;
        this.state = state;
    }

    /**
     * Whether this subnetwork's ranges can conflict with existing static routes. Setting this to true allows this subnetwork's primary and secondary ranges to overlap with (and contain) static routes that have already been configured on the corresponding network. For example if a static route has range 10.1.0.0/16, a subnet range 10.0.0.0/8 could only be created if allow_conflicting_routes=true. Overlapping is only allowed on subnetwork operations; routes whose ranges conflict with this subnetwork's ranges won't be allowed unless route.allow_conflicting_subnetworks is set to true. Typically packets destined to IPs within the subnetwork (which may contain private/sensitive data) are prevented from leaving the virtual network. Setting this field to true will disable this feature. The default value is false and applies to all existing subnetworks and automatically created subnetworks. This field cannot be set to true at resource creation time.
     * 
    */
    public Boolean allowSubnetCidrRoutesOverlap() {
        return this.allowSubnetCidrRoutesOverlap;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
    */
    public Boolean enableFlowLogs() {
        return this.enableFlowLogs;
    }
    /**
     * The range of external IPv6 addresses that are owned by this subnetwork.
     * 
    */
    public String externalIpv6Prefix() {
        return this.externalIpv6Prefix;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
     * 
    */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * The gateway address for default routes to reach destination addresses outside this subnetwork.
     * 
    */
    public String gatewayAddress() {
        return this.gatewayAddress;
    }
    /**
     * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     * 
    */
    public String ipCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
    */
    public String ipv6AccessType() {
        return this.ipv6AccessType;
    }
    /**
     * The range of internal IPv6 addresses that are owned by this subnetwork. Note this will be for private google access only eventually.
     * 
    */
    public String ipv6CidrRange() {
        return this.ipv6CidrRange;
    }
    /**
     * Type of the resource. Always compute#subnetwork for Subnetwork resources.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     * 
    */
    public SubnetworkLogConfigResponse logConfig() {
        return this.logConfig;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     * 
    */
    public String network() {
        return this.network;
    }
    /**
     * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     * 
    */
    public Boolean privateIpGoogleAccess() {
        return this.privateIpGoogleAccess;
    }
    /**
     * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority. This field can be both set at resource creation time and updated using patch.
     * 
    */
    public String privateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess;
    }
    /**
     * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
    */
    public String purpose() {
        return this.purpose;
    }
    /**
     * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     * 
    */
    public String region() {
        return this.region;
    }
    /**
     * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     * 
    */
    public String role() {
        return this.role;
    }
    /**
     * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     * 
    */
    public List<SubnetworkSecondaryRangeResponse> secondaryIpRanges() {
        return this.secondaryIpRanges;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
    */
    public String stackType() {
        return this.stackType;
    }
    /**
     * The state of the subnetwork, which can be one of the following values: READY: Subnetwork is created and ready to use DRAINING: only applicable to subnetworks that have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load balancer are being drained. A subnetwork that is draining cannot be used or modified until it reaches a status of READY
     * 
    */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowSubnetCidrRoutesOverlap;
        private String creationTimestamp;
        private String description;
        private Boolean enableFlowLogs;
        private String externalIpv6Prefix;
        private String fingerprint;
        private String gatewayAddress;
        private String ipCidrRange;
        private String ipv6AccessType;
        private String ipv6CidrRange;
        private String kind;
        private SubnetworkLogConfigResponse logConfig;
        private String name;
        private String network;
        private Boolean privateIpGoogleAccess;
        private String privateIpv6GoogleAccess;
        private String purpose;
        private String region;
        private String role;
        private List<SubnetworkSecondaryRangeResponse> secondaryIpRanges;
        private String selfLink;
        private String stackType;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSubnetCidrRoutesOverlap = defaults.allowSubnetCidrRoutesOverlap;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.enableFlowLogs = defaults.enableFlowLogs;
    	      this.externalIpv6Prefix = defaults.externalIpv6Prefix;
    	      this.fingerprint = defaults.fingerprint;
    	      this.gatewayAddress = defaults.gatewayAddress;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.ipv6CidrRange = defaults.ipv6CidrRange;
    	      this.kind = defaults.kind;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.privateIpGoogleAccess = defaults.privateIpGoogleAccess;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
    	      this.secondaryIpRanges = defaults.secondaryIpRanges;
    	      this.selfLink = defaults.selfLink;
    	      this.stackType = defaults.stackType;
    	      this.state = defaults.state;
        }

        public Builder allowSubnetCidrRoutesOverlap(Boolean allowSubnetCidrRoutesOverlap) {
            this.allowSubnetCidrRoutesOverlap = Objects.requireNonNull(allowSubnetCidrRoutesOverlap);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enableFlowLogs(Boolean enableFlowLogs) {
            this.enableFlowLogs = Objects.requireNonNull(enableFlowLogs);
            return this;
        }
        public Builder externalIpv6Prefix(String externalIpv6Prefix) {
            this.externalIpv6Prefix = Objects.requireNonNull(externalIpv6Prefix);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder gatewayAddress(String gatewayAddress) {
            this.gatewayAddress = Objects.requireNonNull(gatewayAddress);
            return this;
        }
        public Builder ipCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }
        public Builder ipv6AccessType(String ipv6AccessType) {
            this.ipv6AccessType = Objects.requireNonNull(ipv6AccessType);
            return this;
        }
        public Builder ipv6CidrRange(String ipv6CidrRange) {
            this.ipv6CidrRange = Objects.requireNonNull(ipv6CidrRange);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder logConfig(SubnetworkLogConfigResponse logConfig) {
            this.logConfig = Objects.requireNonNull(logConfig);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder privateIpGoogleAccess(Boolean privateIpGoogleAccess) {
            this.privateIpGoogleAccess = Objects.requireNonNull(privateIpGoogleAccess);
            return this;
        }
        public Builder privateIpv6GoogleAccess(String privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Objects.requireNonNull(privateIpv6GoogleAccess);
            return this;
        }
        public Builder purpose(String purpose) {
            this.purpose = Objects.requireNonNull(purpose);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder secondaryIpRanges(List<SubnetworkSecondaryRangeResponse> secondaryIpRanges) {
            this.secondaryIpRanges = Objects.requireNonNull(secondaryIpRanges);
            return this;
        }
        public Builder secondaryIpRanges(SubnetworkSecondaryRangeResponse... secondaryIpRanges) {
            return secondaryIpRanges(List.of(secondaryIpRanges));
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder stackType(String stackType) {
            this.stackType = Objects.requireNonNull(stackType);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetSubnetworkResult build() {
            return new GetSubnetworkResult(allowSubnetCidrRoutesOverlap, creationTimestamp, description, enableFlowLogs, externalIpv6Prefix, fingerprint, gatewayAddress, ipCidrRange, ipv6AccessType, ipv6CidrRange, kind, logConfig, name, network, privateIpGoogleAccess, privateIpv6GoogleAccess, purpose, region, role, secondaryIpRanges, selfLink, stackType, state);
        }
    }
}
