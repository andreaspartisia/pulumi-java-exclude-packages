// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallNetworkRuleCollectionRule {
    /**
     * @return Specifies a description for the rule.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Either a list of destination IP addresses and/or IP ranges, or a list of destination [Service Tags](https://docs.microsoft.com/en-us/azure/virtual-network/service-tags-overview#available-service-tags).
     * 
     */
    private final @Nullable List<String> destinationAddresses;
    /**
     * @return A list of destination FQDNS for the rule.
     * 
     */
    private final @Nullable List<String> destinationFqdns;
    /**
     * @return A list of destination IP Group IDs for the rule.
     * 
     */
    private final @Nullable List<String> destinationIpGroups;
    /**
     * @return A list of destination ports.
     * 
     */
    private final List<String> destinationPorts;
    /**
     * @return Specifies the name of the rule.
     * 
     */
    private final String name;
    /**
     * @return A list of protocols. Possible values are `Any`, `ICMP`, `TCP` and `UDP`.
     * 
     */
    private final List<String> protocols;
    /**
     * @return A list of source IP addresses and/or IP ranges.
     * 
     */
    private final @Nullable List<String> sourceAddresses;
    /**
     * @return A list of IP Group IDs for the rule.
     * 
     */
    private final @Nullable List<String> sourceIpGroups;

    @CustomType.Constructor
    private FirewallNetworkRuleCollectionRule(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("destinationAddresses") @Nullable List<String> destinationAddresses,
        @CustomType.Parameter("destinationFqdns") @Nullable List<String> destinationFqdns,
        @CustomType.Parameter("destinationIpGroups") @Nullable List<String> destinationIpGroups,
        @CustomType.Parameter("destinationPorts") List<String> destinationPorts,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protocols") List<String> protocols,
        @CustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @CustomType.Parameter("sourceIpGroups") @Nullable List<String> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationFqdns = destinationFqdns;
        this.destinationIpGroups = destinationIpGroups;
        this.destinationPorts = destinationPorts;
        this.name = name;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    /**
     * @return Specifies a description for the rule.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Either a list of destination IP addresses and/or IP ranges, or a list of destination [Service Tags](https://docs.microsoft.com/en-us/azure/virtual-network/service-tags-overview#available-service-tags).
     * 
     */
    public List<String> destinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    /**
     * @return A list of destination FQDNS for the rule.
     * 
     */
    public List<String> destinationFqdns() {
        return this.destinationFqdns == null ? List.of() : this.destinationFqdns;
    }
    /**
     * @return A list of destination IP Group IDs for the rule.
     * 
     */
    public List<String> destinationIpGroups() {
        return this.destinationIpGroups == null ? List.of() : this.destinationIpGroups;
    }
    /**
     * @return A list of destination ports.
     * 
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }
    /**
     * @return Specifies the name of the rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A list of protocols. Possible values are `Any`, `ICMP`, `TCP` and `UDP`.
     * 
     */
    public List<String> protocols() {
        return this.protocols;
    }
    /**
     * @return A list of source IP addresses and/or IP ranges.
     * 
     */
    public List<String> sourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    /**
     * @return A list of IP Group IDs for the rule.
     * 
     */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallNetworkRuleCollectionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationFqdns;
        private @Nullable List<String> destinationIpGroups;
        private List<String> destinationPorts;
        private String name;
        private List<String> protocols;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallNetworkRuleCollectionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationFqdns = defaults.destinationFqdns;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationFqdns(@Nullable List<String> destinationFqdns) {
            this.destinationFqdns = destinationFqdns;
            return this;
        }
        public Builder destinationFqdns(String... destinationFqdns) {
            return destinationFqdns(List.of(destinationFqdns));
        }
        public Builder destinationIpGroups(@Nullable List<String> destinationIpGroups) {
            this.destinationIpGroups = destinationIpGroups;
            return this;
        }
        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
        }
        public Builder destinationPorts(List<String> destinationPorts) {
            this.destinationPorts = Objects.requireNonNull(destinationPorts);
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protocols(List<String> protocols) {
            this.protocols = Objects.requireNonNull(protocols);
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }        public FirewallNetworkRuleCollectionRule build() {
            return new FirewallNetworkRuleCollectionRule(description, destinationAddresses, destinationFqdns, destinationIpGroups, destinationPorts, name, protocols, sourceAddresses, sourceIpGroups);
        }
    }
}
