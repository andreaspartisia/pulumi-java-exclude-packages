// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FirewallPolicyRuleNetworkProtocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule of type nat.
 * 
 */
public final class NatRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NatRuleArgs Empty = new NatRuleArgs();

    /**
     * Description of the rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
      private final @Nullable Output<List<String>> destinationAddresses;

    public Output<List<String>> destinationAddresses() {
        return this.destinationAddresses == null ? Codegen.empty() : this.destinationAddresses;
    }

    /**
     * List of destination ports.
     * 
     */
    @Import(name="destinationPorts")
      private final @Nullable Output<List<String>> destinationPorts;

    public Output<List<String>> destinationPorts() {
        return this.destinationPorts == null ? Codegen.empty() : this.destinationPorts;
    }

    /**
     * Array of FirewallPolicyRuleNetworkProtocols.
     * 
     */
    @Import(name="ipProtocols")
      private final @Nullable Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols;

    public Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols() {
        return this.ipProtocols == null ? Codegen.empty() : this.ipProtocols;
    }

    /**
     * Name of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Rule Type.
     * Expected value is 'NatRule'.
     * 
     */
    @Import(name="ruleType", required=true)
      private final Output<String> ruleType;

    public Output<String> ruleType() {
        return this.ruleType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
      private final @Nullable Output<List<String>> sourceAddresses;

    public Output<List<String>> sourceAddresses() {
        return this.sourceAddresses == null ? Codegen.empty() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
      private final @Nullable Output<List<String>> sourceIpGroups;

    public Output<List<String>> sourceIpGroups() {
        return this.sourceIpGroups == null ? Codegen.empty() : this.sourceIpGroups;
    }

    /**
     * The translated address for this NAT rule.
     * 
     */
    @Import(name="translatedAddress")
      private final @Nullable Output<String> translatedAddress;

    public Output<String> translatedAddress() {
        return this.translatedAddress == null ? Codegen.empty() : this.translatedAddress;
    }

    /**
     * The translated FQDN for this NAT rule.
     * 
     */
    @Import(name="translatedFqdn")
      private final @Nullable Output<String> translatedFqdn;

    public Output<String> translatedFqdn() {
        return this.translatedFqdn == null ? Codegen.empty() : this.translatedFqdn;
    }

    /**
     * The translated port for this NAT rule.
     * 
     */
    @Import(name="translatedPort")
      private final @Nullable Output<String> translatedPort;

    public Output<String> translatedPort() {
        return this.translatedPort == null ? Codegen.empty() : this.translatedPort;
    }

    public NatRuleArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> destinationAddresses,
        @Nullable Output<List<String>> destinationPorts,
        @Nullable Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols,
        @Nullable Output<String> name,
        Output<String> ruleType,
        @Nullable Output<List<String>> sourceAddresses,
        @Nullable Output<List<String>> sourceIpGroups,
        @Nullable Output<String> translatedAddress,
        @Nullable Output<String> translatedFqdn,
        @Nullable Output<String> translatedPort) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleType = Codegen.stringProp("ruleType").output().arg(ruleType).require();
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.translatedAddress = translatedAddress;
        this.translatedFqdn = translatedFqdn;
        this.translatedPort = translatedPort;
    }

    private NatRuleArgs() {
        this.description = Codegen.empty();
        this.destinationAddresses = Codegen.empty();
        this.destinationPorts = Codegen.empty();
        this.ipProtocols = Codegen.empty();
        this.name = Codegen.empty();
        this.ruleType = Codegen.empty();
        this.sourceAddresses = Codegen.empty();
        this.sourceIpGroups = Codegen.empty();
        this.translatedAddress = Codegen.empty();
        this.translatedFqdn = Codegen.empty();
        this.translatedPort = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> destinationAddresses;
        private @Nullable Output<List<String>> destinationPorts;
        private @Nullable Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols;
        private @Nullable Output<String> name;
        private Output<String> ruleType;
        private @Nullable Output<List<String>> sourceAddresses;
        private @Nullable Output<List<String>> sourceIpGroups;
        private @Nullable Output<String> translatedAddress;
        private @Nullable Output<String> translatedFqdn;
        private @Nullable Output<String> translatedPort;

        public Builder() {
    	      // Empty
        }

        public Builder(NatRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleType = defaults.ruleType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.translatedAddress = defaults.translatedAddress;
    	      this.translatedFqdn = defaults.translatedFqdn;
    	      this.translatedPort = defaults.translatedPort;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = Codegen.ofNullable(destinationAddresses);
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationPorts(@Nullable Output<List<String>> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = Codegen.ofNullable(destinationPorts);
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder ipProtocols(@Nullable Output<List<Either<String,FirewallPolicyRuleNetworkProtocol>>> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }
        public Builder ipProtocols(@Nullable List<Either<String,FirewallPolicyRuleNetworkProtocol>> ipProtocols) {
            this.ipProtocols = Codegen.ofNullable(ipProtocols);
            return this;
        }
        public Builder ipProtocols(Either<String,FirewallPolicyRuleNetworkProtocol>... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder ruleType(Output<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Output.of(Objects.requireNonNull(ruleType));
            return this;
        }
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = Codegen.ofNullable(sourceAddresses);
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = Codegen.ofNullable(sourceIpGroups);
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }
        public Builder translatedAddress(@Nullable Output<String> translatedAddress) {
            this.translatedAddress = translatedAddress;
            return this;
        }
        public Builder translatedAddress(@Nullable String translatedAddress) {
            this.translatedAddress = Codegen.ofNullable(translatedAddress);
            return this;
        }
        public Builder translatedFqdn(@Nullable Output<String> translatedFqdn) {
            this.translatedFqdn = translatedFqdn;
            return this;
        }
        public Builder translatedFqdn(@Nullable String translatedFqdn) {
            this.translatedFqdn = Codegen.ofNullable(translatedFqdn);
            return this;
        }
        public Builder translatedPort(@Nullable Output<String> translatedPort) {
            this.translatedPort = translatedPort;
            return this;
        }
        public Builder translatedPort(@Nullable String translatedPort) {
            this.translatedPort = Codegen.ofNullable(translatedPort);
            return this;
        }        public NatRuleArgs build() {
            return new NatRuleArgs(description, destinationAddresses, destinationPorts, ipProtocols, name, ruleType, sourceAddresses, sourceIpGroups, translatedAddress, translatedFqdn, translatedPort);
        }
    }
}
