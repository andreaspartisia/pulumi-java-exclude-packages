// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.enums.SubnetworkIpv6AccessType;
import io.pulumi.googlenative.compute_beta.enums.SubnetworkPrivateIpv6GoogleAccess;
import io.pulumi.googlenative.compute_beta.enums.SubnetworkPurpose;
import io.pulumi.googlenative.compute_beta.enums.SubnetworkRole;
import io.pulumi.googlenative.compute_beta.enums.SubnetworkStackType;
import io.pulumi.googlenative.compute_beta.inputs.SubnetworkLogConfigArgs;
import io.pulumi.googlenative.compute_beta.inputs.SubnetworkSecondaryRangeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetworkArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetworkArgs Empty = new SubnetworkArgs();

    /**
     * Whether this subnetwork's ranges can conflict with existing static routes. Setting this to true allows this subnetwork's primary and secondary ranges to overlap with (and contain) static routes that have already been configured on the corresponding network. For example if a static route has range 10.1.0.0/16, a subnet range 10.0.0.0/8 could only be created if allow_conflicting_routes=true. Overlapping is only allowed on subnetwork operations; routes whose ranges conflict with this subnetwork's ranges won't be allowed unless route.allow_conflicting_subnetworks is set to true. Typically packets destined to IPs within the subnetwork (which may contain private/sensitive data) are prevented from leaving the virtual network. Setting this field to true will disable this feature. The default value is false and applies to all existing subnetworks and automatically created subnetworks. This field cannot be set to true at resource creation time.
     * 
     */
    @Import(name="allowSubnetCidrRoutesOverlap")
      private final @Nullable Output<Boolean> allowSubnetCidrRoutesOverlap;

    public Output<Boolean> allowSubnetCidrRoutesOverlap() {
        return this.allowSubnetCidrRoutesOverlap == null ? Codegen.empty() : this.allowSubnetCidrRoutesOverlap;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource. This field can be set only at resource creation time.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it will not appear in get listings. If not set the default behavior is determined by the org policy, if there is no org policy specified, then it will default to disabled. This field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    @Import(name="enableFlowLogs")
      private final @Nullable Output<Boolean> enableFlowLogs;

    public Output<Boolean> enableFlowLogs() {
        return this.enableFlowLogs == null ? Codegen.empty() : this.enableFlowLogs;
    }

    /**
     * The range of internal addresses that are owned by this subnetwork. Provide this property when you create the subnetwork. For example, 10.0.0.0/8 or 100.64.0.0/10. Ranges must be unique and non-overlapping within a network. Only IPv4 is supported. This field is set at resource creation time. The range can be any range listed in the Valid ranges list. The range can be expanded after creation using expandIpCidrRange.
     * 
     */
    @Import(name="ipCidrRange")
      private final @Nullable Output<String> ipCidrRange;

    public Output<String> ipCidrRange() {
        return this.ipCidrRange == null ? Codegen.empty() : this.ipCidrRange;
    }

    /**
     * The access type of IPv6 address this subnet holds. It's immutable and can only be specified during creation or the first time the subnet is updated into IPV4_IPV6 dual stack. If the ipv6_type is EXTERNAL then this subnet cannot enable direct path.
     * 
     */
    @Import(name="ipv6AccessType")
      private final @Nullable Output<SubnetworkIpv6AccessType> ipv6AccessType;

    public Output<SubnetworkIpv6AccessType> ipv6AccessType() {
        return this.ipv6AccessType == null ? Codegen.empty() : this.ipv6AccessType;
    }

    /**
     * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled, logs are exported to Cloud Logging.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<SubnetworkLogConfigArgs> logConfig;

    public Output<SubnetworkLogConfigArgs> logConfig() {
        return this.logConfig == null ? Codegen.empty() : this.logConfig;
    }

    /**
     * The name of the resource, provided by the client when initially creating the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL of the network to which this subnetwork belongs, provided by the client when initially creating the subnetwork. This field can be set only at resource creation time.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * Whether the VMs in this subnet can access Google services without assigned external IP addresses. This field can be both set at resource creation time and updated using setPrivateIpGoogleAccess.
     * 
     */
    @Import(name="privateIpGoogleAccess")
      private final @Nullable Output<Boolean> privateIpGoogleAccess;

    public Output<Boolean> privateIpGoogleAccess() {
        return this.privateIpGoogleAccess == null ? Codegen.empty() : this.privateIpGoogleAccess;
    }

    /**
     * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @Import(name="privateIpv6GoogleAccess")
      private final @Nullable Output<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Output<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess() {
        return this.privateIpv6GoogleAccess == null ? Codegen.empty() : this.privateIpv6GoogleAccess;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified, the purpose defaults to PRIVATE_RFC_1918. The enableFlowLogs field isn't supported with the purpose field set to INTERNAL_HTTPS_LOAD_BALANCER.
     * 
     */
    @Import(name="purpose")
      private final @Nullable Output<SubnetworkPurpose> purpose;

    public Output<SubnetworkPurpose> purpose() {
        return this.purpose == null ? Codegen.empty() : this.purpose;
    }

    /**
     * URL of the region where the Subnetwork resides. This field can be set only at resource creation time.
     * 
     */
    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The role of subnetwork. Currently, this field is only used when purpose = INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated with a patch request.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<SubnetworkRole> role;

    public Output<SubnetworkRole> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * An array of configurations for secondary IP ranges for VM instances contained in this subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork. The alias IPs may belong to either primary or secondary ranges. This field can be updated with a patch request.
     * 
     */
    @Import(name="secondaryIpRanges")
      private final @Nullable Output<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges;

    public Output<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges() {
        return this.secondaryIpRanges == null ? Codegen.empty() : this.secondaryIpRanges;
    }

    /**
     * The stack type for this subnet to identify whether the IPv6 feature is enabled or not. If not specified IPV4_ONLY will be used. This field can be both set at resource creation time and updated using patch.
     * 
     */
    @Import(name="stackType")
      private final @Nullable Output<SubnetworkStackType> stackType;

    public Output<SubnetworkStackType> stackType() {
        return this.stackType == null ? Codegen.empty() : this.stackType;
    }

    public SubnetworkArgs(
        @Nullable Output<Boolean> allowSubnetCidrRoutesOverlap,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableFlowLogs,
        @Nullable Output<String> ipCidrRange,
        @Nullable Output<SubnetworkIpv6AccessType> ipv6AccessType,
        @Nullable Output<SubnetworkLogConfigArgs> logConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<Boolean> privateIpGoogleAccess,
        @Nullable Output<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess,
        @Nullable Output<String> project,
        @Nullable Output<SubnetworkPurpose> purpose,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<SubnetworkRole> role,
        @Nullable Output<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges,
        @Nullable Output<SubnetworkStackType> stackType) {
        this.allowSubnetCidrRoutesOverlap = allowSubnetCidrRoutesOverlap;
        this.description = description;
        this.enableFlowLogs = enableFlowLogs;
        this.ipCidrRange = ipCidrRange;
        this.ipv6AccessType = ipv6AccessType;
        this.logConfig = logConfig;
        this.name = name;
        this.network = network;
        this.privateIpGoogleAccess = privateIpGoogleAccess;
        this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
        this.project = project;
        this.purpose = purpose;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.role = role;
        this.secondaryIpRanges = secondaryIpRanges;
        this.stackType = stackType;
    }

    private SubnetworkArgs() {
        this.allowSubnetCidrRoutesOverlap = Codegen.empty();
        this.description = Codegen.empty();
        this.enableFlowLogs = Codegen.empty();
        this.ipCidrRange = Codegen.empty();
        this.ipv6AccessType = Codegen.empty();
        this.logConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.privateIpGoogleAccess = Codegen.empty();
        this.privateIpv6GoogleAccess = Codegen.empty();
        this.project = Codegen.empty();
        this.purpose = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.role = Codegen.empty();
        this.secondaryIpRanges = Codegen.empty();
        this.stackType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> allowSubnetCidrRoutesOverlap;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableFlowLogs;
        private @Nullable Output<String> ipCidrRange;
        private @Nullable Output<SubnetworkIpv6AccessType> ipv6AccessType;
        private @Nullable Output<SubnetworkLogConfigArgs> logConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<Boolean> privateIpGoogleAccess;
        private @Nullable Output<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;
        private @Nullable Output<String> project;
        private @Nullable Output<SubnetworkPurpose> purpose;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<SubnetworkRole> role;
        private @Nullable Output<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges;
        private @Nullable Output<SubnetworkStackType> stackType;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSubnetCidrRoutesOverlap = defaults.allowSubnetCidrRoutesOverlap;
    	      this.description = defaults.description;
    	      this.enableFlowLogs = defaults.enableFlowLogs;
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.privateIpGoogleAccess = defaults.privateIpGoogleAccess;
    	      this.privateIpv6GoogleAccess = defaults.privateIpv6GoogleAccess;
    	      this.project = defaults.project;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.role = defaults.role;
    	      this.secondaryIpRanges = defaults.secondaryIpRanges;
    	      this.stackType = defaults.stackType;
        }

        public Builder allowSubnetCidrRoutesOverlap(@Nullable Output<Boolean> allowSubnetCidrRoutesOverlap) {
            this.allowSubnetCidrRoutesOverlap = allowSubnetCidrRoutesOverlap;
            return this;
        }
        public Builder allowSubnetCidrRoutesOverlap(@Nullable Boolean allowSubnetCidrRoutesOverlap) {
            this.allowSubnetCidrRoutesOverlap = Codegen.ofNullable(allowSubnetCidrRoutesOverlap);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enableFlowLogs(@Nullable Output<Boolean> enableFlowLogs) {
            this.enableFlowLogs = enableFlowLogs;
            return this;
        }
        public Builder enableFlowLogs(@Nullable Boolean enableFlowLogs) {
            this.enableFlowLogs = Codegen.ofNullable(enableFlowLogs);
            return this;
        }
        public Builder ipCidrRange(@Nullable Output<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }
        public Builder ipCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Codegen.ofNullable(ipCidrRange);
            return this;
        }
        public Builder ipv6AccessType(@Nullable Output<SubnetworkIpv6AccessType> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }
        public Builder ipv6AccessType(@Nullable SubnetworkIpv6AccessType ipv6AccessType) {
            this.ipv6AccessType = Codegen.ofNullable(ipv6AccessType);
            return this;
        }
        public Builder logConfig(@Nullable Output<SubnetworkLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable SubnetworkLogConfigArgs logConfig) {
            this.logConfig = Codegen.ofNullable(logConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder privateIpGoogleAccess(@Nullable Output<Boolean> privateIpGoogleAccess) {
            this.privateIpGoogleAccess = privateIpGoogleAccess;
            return this;
        }
        public Builder privateIpGoogleAccess(@Nullable Boolean privateIpGoogleAccess) {
            this.privateIpGoogleAccess = Codegen.ofNullable(privateIpGoogleAccess);
            return this;
        }
        public Builder privateIpv6GoogleAccess(@Nullable Output<SubnetworkPrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }
        public Builder privateIpv6GoogleAccess(@Nullable SubnetworkPrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            this.privateIpv6GoogleAccess = Codegen.ofNullable(privateIpv6GoogleAccess);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder purpose(@Nullable Output<SubnetworkPurpose> purpose) {
            this.purpose = purpose;
            return this;
        }
        public Builder purpose(@Nullable SubnetworkPurpose purpose) {
            this.purpose = Codegen.ofNullable(purpose);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder role(@Nullable Output<SubnetworkRole> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable SubnetworkRole role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder secondaryIpRanges(@Nullable Output<List<SubnetworkSecondaryRangeArgs>> secondaryIpRanges) {
            this.secondaryIpRanges = secondaryIpRanges;
            return this;
        }
        public Builder secondaryIpRanges(@Nullable List<SubnetworkSecondaryRangeArgs> secondaryIpRanges) {
            this.secondaryIpRanges = Codegen.ofNullable(secondaryIpRanges);
            return this;
        }
        public Builder secondaryIpRanges(SubnetworkSecondaryRangeArgs... secondaryIpRanges) {
            return secondaryIpRanges(List.of(secondaryIpRanges));
        }
        public Builder stackType(@Nullable Output<SubnetworkStackType> stackType) {
            this.stackType = stackType;
            return this;
        }
        public Builder stackType(@Nullable SubnetworkStackType stackType) {
            this.stackType = Codegen.ofNullable(stackType);
            return this;
        }        public SubnetworkArgs build() {
            return new SubnetworkArgs(allowSubnetCidrRoutesOverlap, description, enableFlowLogs, ipCidrRange, ipv6AccessType, logConfig, name, network, privateIpGoogleAccess, privateIpv6GoogleAccess, project, purpose, region, requestId, role, secondaryIpRanges, stackType);
        }
    }
}
