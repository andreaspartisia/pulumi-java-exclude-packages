// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupRuleGroupRulesSourceStatefulRuleHeader {
    /**
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify `ANY`.
     * 
     */
    private final String destination;
    /**
     * The destination port to inspect for. To match with any address, specify `ANY`.
     * 
     */
    private final String destinationPort;
    /**
     * The direction of traffic flow to inspect. Valid values: `ANY` or `FORWARD`.
     * 
     */
    private final String direction;
    /**
     * The protocol to inspect. Valid values: `IP`, `TCP`, `UDP`, `ICMP`, `HTTP`, `FTP`, `TLS`, `SMB`, `DNS`, `DCERPC`, `SSH`, `SMTP`, `IMAP`, `MSN`, `KRB5`, `IKEV2`, `TFTP`, `NTP`, `DHCP`.
     * 
     */
    private final String protocol;
    /**
     * The source IP address or address range for, in CIDR notation. To match with any address, specify `ANY`.
     * 
     */
    private final String source;
    /**
     * The source port to inspect for. To match with any address, specify `ANY`.
     * 
     */
    private final String sourcePort;

    @OutputCustomType.Constructor
    private RuleGroupRuleGroupRulesSourceStatefulRuleHeader(
        @OutputCustomType.Parameter("destination") String destination,
        @OutputCustomType.Parameter("destinationPort") String destinationPort,
        @OutputCustomType.Parameter("direction") String direction,
        @OutputCustomType.Parameter("protocol") String protocol,
        @OutputCustomType.Parameter("source") String source,
        @OutputCustomType.Parameter("sourcePort") String sourcePort) {
        this.destination = destination;
        this.destinationPort = destinationPort;
        this.direction = direction;
        this.protocol = protocol;
        this.source = source;
        this.sourcePort = sourcePort;
    }

    /**
     * The destination IP address or address range to inspect for, in CIDR notation. To match with any address, specify `ANY`.
     * 
    */
    public String getDestination() {
        return this.destination;
    }
    /**
     * The destination port to inspect for. To match with any address, specify `ANY`.
     * 
    */
    public String getDestinationPort() {
        return this.destinationPort;
    }
    /**
     * The direction of traffic flow to inspect. Valid values: `ANY` or `FORWARD`.
     * 
    */
    public String getDirection() {
        return this.direction;
    }
    /**
     * The protocol to inspect. Valid values: `IP`, `TCP`, `UDP`, `ICMP`, `HTTP`, `FTP`, `TLS`, `SMB`, `DNS`, `DCERPC`, `SSH`, `SMTP`, `IMAP`, `MSN`, `KRB5`, `IKEV2`, `TFTP`, `NTP`, `DHCP`.
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * The source IP address or address range for, in CIDR notation. To match with any address, specify `ANY`.
     * 
    */
    public String getSource() {
        return this.source;
    }
    /**
     * The source port to inspect for. To match with any address, specify `ANY`.
     * 
    */
    public String getSourcePort() {
        return this.sourcePort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatefulRuleHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;
        private String destinationPort;
        private String direction;
        private String protocol;
        private String source;
        private String sourcePort;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatefulRuleHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationPort = defaults.destinationPort;
    	      this.direction = defaults.direction;
    	      this.protocol = defaults.protocol;
    	      this.source = defaults.source;
    	      this.sourcePort = defaults.sourcePort;
        }

        public Builder setDestination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestinationPort(String destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
            return this;
        }

        public Builder setDirection(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setProtocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSourcePort(String sourcePort) {
            this.sourcePort = Objects.requireNonNull(sourcePort);
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatefulRuleHeader build() {
            return new RuleGroupRuleGroupRulesSourceStatefulRuleHeader(destination, destinationPort, direction, protocol, source, sourcePort);
        }
    }
}