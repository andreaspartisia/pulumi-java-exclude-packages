// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.enums.FirewallDirection;
import io.pulumi.googlenative.compute_v1.inputs.FirewallAllowedItemArgs;
import io.pulumi.googlenative.compute_v1.inputs.FirewallDeniedItemArgs;
import io.pulumi.googlenative.compute_v1.inputs.FirewallLogConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallArgs Empty = new FirewallArgs();

    /**
     * The list of ALLOW rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a permitted connection.
     * 
     */
    @Import(name="allowed")
      private final @Nullable Output<List<FirewallAllowedItemArgs>> allowed;

    public Output<List<FirewallAllowedItemArgs>> allowed() {
        return this.allowed == null ? Codegen.empty() : this.allowed;
    }

    /**
     * The list of DENY rules specified by this firewall. Each rule specifies a protocol and port-range tuple that describes a denied connection.
     * 
     */
    @Import(name="denied")
      private final @Nullable Output<List<FirewallDeniedItemArgs>> denied;

    public Output<List<FirewallDeniedItemArgs>> denied() {
        return this.denied == null ? Codegen.empty() : this.denied;
    }

    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * If destination ranges are specified, the firewall rule applies only to traffic that has destination IP address in these ranges. These ranges must be expressed in CIDR format. Both IPv4 and IPv6 are supported.
     * 
     */
    @Import(name="destinationRanges")
      private final @Nullable Output<List<String>> destinationRanges;

    public Output<List<String>> destinationRanges() {
        return this.destinationRanges == null ? Codegen.empty() : this.destinationRanges;
    }

    /**
     * Direction of traffic to which this firewall applies, either `INGRESS` or `EGRESS`. The default is `INGRESS`. For `INGRESS` traffic, you cannot specify the destinationRanges field, and for `EGRESS` traffic, you cannot specify the sourceRanges or sourceTags fields.
     * 
     */
    @Import(name="direction")
      private final @Nullable Output<FirewallDirection> direction;

    public Output<FirewallDirection> direction() {
        return this.direction == null ? Codegen.empty() : this.direction;
    }

    /**
     * Denotes whether the firewall rule is disabled. When set to true, the firewall rule is not enforced and the network behaves as if it did not exist. If this is unspecified, the firewall rule will be enabled.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * This field denotes the logging options for a particular firewall rule. If logging is enabled, logs will be exported to Cloud Logging.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<FirewallLogConfigArgs> logConfig;

    public Output<FirewallLogConfigArgs> logConfig() {
        return this.logConfig == null ? Codegen.empty() : this.logConfig;
    }

    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * URL of the network resource for this firewall rule. If not specified when creating a firewall rule, the default network is used: global/networks/default If you choose to specify this field, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/myproject/global/networks/my-network - projects/myproject/global/networks/my-network - global/networks/default
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * Priority for this rule. This is an integer between `0` and `65535`, both inclusive. The default value is `1000`. Relative priorities determine which rule takes effect if multiple rules apply. Lower values indicate higher priority. For example, a rule with priority `0` has higher precedence than a rule with priority `1`. DENY rules take precedence over ALLOW rules if they have equal priority. Note that VPC networks have implied rules with a priority of `65535`. To avoid conflicts with the implied rules, use a priority number less than `65535`.
     * 
     */
    @Import(name="priority")
      private final @Nullable Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority == null ? Codegen.empty() : this.priority;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * If source ranges are specified, the firewall rule applies only to traffic that has a source IP address in these ranges. These ranges must be expressed in CIDR format. One or both of sourceRanges and sourceTags may be set. If both fields are set, the rule applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the rule to apply. Both IPv4 and IPv6 are supported.
     * 
     */
    @Import(name="sourceRanges")
      private final @Nullable Output<List<String>> sourceRanges;

    public Output<List<String>> sourceRanges() {
        return this.sourceRanges == null ? Codegen.empty() : this.sourceRanges;
    }

    /**
     * If source service accounts are specified, the firewall rules apply only to traffic originating from an instance with a service account in this list. Source service accounts cannot be used to control traffic to an instance's external IP address because service accounts are associated with an instance, not an IP address. sourceRanges can be set at the same time as sourceServiceAccounts. If both are set, the firewall applies to traffic that has a source IP address within the sourceRanges OR a source IP that belongs to an instance with service account listed in sourceServiceAccount. The connection does not need to match both fields for the firewall to apply. sourceServiceAccounts cannot be used at the same time as sourceTags or targetTags.
     * 
     */
    @Import(name="sourceServiceAccounts")
      private final @Nullable Output<List<String>> sourceServiceAccounts;

    public Output<List<String>> sourceServiceAccounts() {
        return this.sourceServiceAccounts == null ? Codegen.empty() : this.sourceServiceAccounts;
    }

    /**
     * If source tags are specified, the firewall rule applies only to traffic with source IPs that match the primary network interfaces of VM instances that have the tag and are in the same VPC network. Source tags cannot be used to control traffic to an instance's external IP address, it only applies to traffic between instances in the same virtual network. Because tags are associated with instances, not IP addresses. One or both of sourceRanges and sourceTags may be set. If both fields are set, the firewall applies to traffic that has a source IP address within sourceRanges OR a source IP from a resource with a matching tag listed in the sourceTags field. The connection does not need to match both fields for the firewall to apply.
     * 
     */
    @Import(name="sourceTags")
      private final @Nullable Output<List<String>> sourceTags;

    public Output<List<String>> sourceTags() {
        return this.sourceTags == null ? Codegen.empty() : this.sourceTags;
    }

    /**
     * A list of service accounts indicating sets of instances located in the network that may make network connections as specified in allowed[]. targetServiceAccounts cannot be used at the same time as targetTags or sourceTags. If neither targetServiceAccounts nor targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    @Import(name="targetServiceAccounts")
      private final @Nullable Output<List<String>> targetServiceAccounts;

    public Output<List<String>> targetServiceAccounts() {
        return this.targetServiceAccounts == null ? Codegen.empty() : this.targetServiceAccounts;
    }

    /**
     * A list of tags that controls which instances the firewall rule applies to. If targetTags are specified, then the firewall rule applies only to instances in the VPC network that have one of those tags. If no targetTags are specified, the firewall rule applies to all instances on the specified network.
     * 
     */
    @Import(name="targetTags")
      private final @Nullable Output<List<String>> targetTags;

    public Output<List<String>> targetTags() {
        return this.targetTags == null ? Codegen.empty() : this.targetTags;
    }

    public FirewallArgs(
        @Nullable Output<List<FirewallAllowedItemArgs>> allowed,
        @Nullable Output<List<FirewallDeniedItemArgs>> denied,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> destinationRanges,
        @Nullable Output<FirewallDirection> direction,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<FirewallLogConfigArgs> logConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<Integer> priority,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<List<String>> sourceRanges,
        @Nullable Output<List<String>> sourceServiceAccounts,
        @Nullable Output<List<String>> sourceTags,
        @Nullable Output<List<String>> targetServiceAccounts,
        @Nullable Output<List<String>> targetTags) {
        this.allowed = allowed;
        this.denied = denied;
        this.description = description;
        this.destinationRanges = destinationRanges;
        this.direction = direction;
        this.disabled = disabled;
        this.logConfig = logConfig;
        this.name = name;
        this.network = network;
        this.priority = priority;
        this.project = project;
        this.requestId = requestId;
        this.sourceRanges = sourceRanges;
        this.sourceServiceAccounts = sourceServiceAccounts;
        this.sourceTags = sourceTags;
        this.targetServiceAccounts = targetServiceAccounts;
        this.targetTags = targetTags;
    }

    private FirewallArgs() {
        this.allowed = Codegen.empty();
        this.denied = Codegen.empty();
        this.description = Codegen.empty();
        this.destinationRanges = Codegen.empty();
        this.direction = Codegen.empty();
        this.disabled = Codegen.empty();
        this.logConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.priority = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.sourceRanges = Codegen.empty();
        this.sourceServiceAccounts = Codegen.empty();
        this.sourceTags = Codegen.empty();
        this.targetServiceAccounts = Codegen.empty();
        this.targetTags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirewallAllowedItemArgs>> allowed;
        private @Nullable Output<List<FirewallDeniedItemArgs>> denied;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> destinationRanges;
        private @Nullable Output<FirewallDirection> direction;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<FirewallLogConfigArgs> logConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<Integer> priority;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<String>> sourceRanges;
        private @Nullable Output<List<String>> sourceServiceAccounts;
        private @Nullable Output<List<String>> sourceTags;
        private @Nullable Output<List<String>> targetServiceAccounts;
        private @Nullable Output<List<String>> targetTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowed = defaults.allowed;
    	      this.denied = defaults.denied;
    	      this.description = defaults.description;
    	      this.destinationRanges = defaults.destinationRanges;
    	      this.direction = defaults.direction;
    	      this.disabled = defaults.disabled;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.priority = defaults.priority;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.sourceRanges = defaults.sourceRanges;
    	      this.sourceServiceAccounts = defaults.sourceServiceAccounts;
    	      this.sourceTags = defaults.sourceTags;
    	      this.targetServiceAccounts = defaults.targetServiceAccounts;
    	      this.targetTags = defaults.targetTags;
        }

        public Builder allowed(@Nullable Output<List<FirewallAllowedItemArgs>> allowed) {
            this.allowed = allowed;
            return this;
        }
        public Builder allowed(@Nullable List<FirewallAllowedItemArgs> allowed) {
            this.allowed = Codegen.ofNullable(allowed);
            return this;
        }
        public Builder allowed(FirewallAllowedItemArgs... allowed) {
            return allowed(List.of(allowed));
        }
        public Builder denied(@Nullable Output<List<FirewallDeniedItemArgs>> denied) {
            this.denied = denied;
            return this;
        }
        public Builder denied(@Nullable List<FirewallDeniedItemArgs> denied) {
            this.denied = Codegen.ofNullable(denied);
            return this;
        }
        public Builder denied(FirewallDeniedItemArgs... denied) {
            return denied(List.of(denied));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destinationRanges(@Nullable Output<List<String>> destinationRanges) {
            this.destinationRanges = destinationRanges;
            return this;
        }
        public Builder destinationRanges(@Nullable List<String> destinationRanges) {
            this.destinationRanges = Codegen.ofNullable(destinationRanges);
            return this;
        }
        public Builder destinationRanges(String... destinationRanges) {
            return destinationRanges(List.of(destinationRanges));
        }
        public Builder direction(@Nullable Output<FirewallDirection> direction) {
            this.direction = direction;
            return this;
        }
        public Builder direction(@Nullable FirewallDirection direction) {
            this.direction = Codegen.ofNullable(direction);
            return this;
        }
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder logConfig(@Nullable Output<FirewallLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable FirewallLogConfigArgs logConfig) {
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
        public Builder priority(@Nullable Output<Integer> priority) {
            this.priority = priority;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = Codegen.ofNullable(priority);
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
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder sourceRanges(@Nullable Output<List<String>> sourceRanges) {
            this.sourceRanges = sourceRanges;
            return this;
        }
        public Builder sourceRanges(@Nullable List<String> sourceRanges) {
            this.sourceRanges = Codegen.ofNullable(sourceRanges);
            return this;
        }
        public Builder sourceRanges(String... sourceRanges) {
            return sourceRanges(List.of(sourceRanges));
        }
        public Builder sourceServiceAccounts(@Nullable Output<List<String>> sourceServiceAccounts) {
            this.sourceServiceAccounts = sourceServiceAccounts;
            return this;
        }
        public Builder sourceServiceAccounts(@Nullable List<String> sourceServiceAccounts) {
            this.sourceServiceAccounts = Codegen.ofNullable(sourceServiceAccounts);
            return this;
        }
        public Builder sourceServiceAccounts(String... sourceServiceAccounts) {
            return sourceServiceAccounts(List.of(sourceServiceAccounts));
        }
        public Builder sourceTags(@Nullable Output<List<String>> sourceTags) {
            this.sourceTags = sourceTags;
            return this;
        }
        public Builder sourceTags(@Nullable List<String> sourceTags) {
            this.sourceTags = Codegen.ofNullable(sourceTags);
            return this;
        }
        public Builder sourceTags(String... sourceTags) {
            return sourceTags(List.of(sourceTags));
        }
        public Builder targetServiceAccounts(@Nullable Output<List<String>> targetServiceAccounts) {
            this.targetServiceAccounts = targetServiceAccounts;
            return this;
        }
        public Builder targetServiceAccounts(@Nullable List<String> targetServiceAccounts) {
            this.targetServiceAccounts = Codegen.ofNullable(targetServiceAccounts);
            return this;
        }
        public Builder targetServiceAccounts(String... targetServiceAccounts) {
            return targetServiceAccounts(List.of(targetServiceAccounts));
        }
        public Builder targetTags(@Nullable Output<List<String>> targetTags) {
            this.targetTags = targetTags;
            return this;
        }
        public Builder targetTags(@Nullable List<String> targetTags) {
            this.targetTags = Codegen.ofNullable(targetTags);
            return this;
        }
        public Builder targetTags(String... targetTags) {
            return targetTags(List.of(targetTags));
        }        public FirewallArgs build() {
            return new FirewallArgs(allowed, denied, description, destinationRanges, direction, disabled, logConfig, name, network, priority, project, requestId, sourceRanges, sourceServiceAccounts, sourceTags, targetServiceAccounts, targetTags);
        }
    }
}
