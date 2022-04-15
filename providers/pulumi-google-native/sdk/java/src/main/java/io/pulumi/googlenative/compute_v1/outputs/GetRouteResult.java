// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_v1.outputs.RouteAsPathResponse;
import io.pulumi.googlenative.compute_v1.outputs.RouteWarningsItemResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRouteResult {
    /**
     * AS path.
     * 
     */
    private final List<RouteAsPathResponse> asPaths;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    private final String description;
    /**
     * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
     */
    private final String destRange;
    /**
     * Type of this resource. Always compute#routes for Route resources.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    private final String name;
    /**
     * Fully-qualified URL of the network that this route applies to.
     * 
     */
    private final String network;
    /**
     * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
     */
    private final String nextHopGateway;
    /**
     * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
     */
    private final String nextHopIlb;
    /**
     * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
     */
    private final String nextHopInstance;
    /**
     * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
     */
    private final String nextHopIp;
    /**
     * The URL of the local network if it should handle matching packets.
     * 
     */
    private final String nextHopNetwork;
    /**
     * The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
     */
    private final String nextHopPeering;
    /**
     * The URL to a VpnTunnel that should handle matching packets.
     * 
     */
    private final String nextHopVpnTunnel;
    /**
     * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
     */
    private final Integer priority;
    /**
     * The type of this route, which can be one of the following values: - 'TRANSIT' for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - 'SUBNET' for a route from a subnet of the VPC - 'BGP' for a route learned from a BGP peer of this router - 'STATIC' for a static route
     * 
     */
    private final String routeType;
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
     */
    private final String selfLink;
    /**
     * A list of instance tags to which this route applies.
     * 
     */
    private final List<String> tags;
    /**
     * If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
     */
    private final List<RouteWarningsItemResponse> warnings;

    @CustomType.Constructor
    private GetRouteResult(
        @CustomType.Parameter("asPaths") List<RouteAsPathResponse> asPaths,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("destRange") String destRange,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("nextHopGateway") String nextHopGateway,
        @CustomType.Parameter("nextHopIlb") String nextHopIlb,
        @CustomType.Parameter("nextHopInstance") String nextHopInstance,
        @CustomType.Parameter("nextHopIp") String nextHopIp,
        @CustomType.Parameter("nextHopNetwork") String nextHopNetwork,
        @CustomType.Parameter("nextHopPeering") String nextHopPeering,
        @CustomType.Parameter("nextHopVpnTunnel") String nextHopVpnTunnel,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("routeType") String routeType,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("warnings") List<RouteWarningsItemResponse> warnings) {
        this.asPaths = asPaths;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.destRange = destRange;
        this.kind = kind;
        this.name = name;
        this.network = network;
        this.nextHopGateway = nextHopGateway;
        this.nextHopIlb = nextHopIlb;
        this.nextHopInstance = nextHopInstance;
        this.nextHopIp = nextHopIp;
        this.nextHopNetwork = nextHopNetwork;
        this.nextHopPeering = nextHopPeering;
        this.nextHopVpnTunnel = nextHopVpnTunnel;
        this.priority = priority;
        this.routeType = routeType;
        this.selfLink = selfLink;
        this.tags = tags;
        this.warnings = warnings;
    }

    /**
     * AS path.
     * 
    */
    public List<RouteAsPathResponse> asPaths() {
        return this.asPaths;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The destination range of outgoing packets that this route applies to. Both IPv4 and IPv6 are supported.
     * 
    */
    public String destRange() {
        return this.destRange;
    }
    /**
     * Type of this resource. Always compute#routes for Route resources.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Fully-qualified URL of the network that this route applies to.
     * 
    */
    public String network() {
        return this.network;
    }
    /**
     * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL: projects/ project/global/gateways/default-internet-gateway
     * 
    */
    public String nextHopGateway() {
        return this.nextHopGateway;
    }
    /**
     * The URL to a forwarding rule of type loadBalancingScheme=INTERNAL that should handle matching packets or the IP address of the forwarding Rule. For example, the following are all valid URLs: - 10.128.0.56 - https://www.googleapis.com/compute/v1/projects/project/regions/region /forwardingRules/forwardingRule - regions/region/forwardingRules/forwardingRule
     * 
    */
    public String nextHopIlb() {
        return this.nextHopIlb;
    }
    /**
     * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
     * 
    */
    public String nextHopInstance() {
        return this.nextHopInstance;
    }
    /**
     * The network IP address of an instance that should handle matching packets. Only IPv4 is supported.
     * 
    */
    public String nextHopIp() {
        return this.nextHopIp;
    }
    /**
     * The URL of the local network if it should handle matching packets.
     * 
    */
    public String nextHopNetwork() {
        return this.nextHopNetwork;
    }
    /**
     * The network peering name that should handle matching packets, which should conform to RFC1035.
     * 
    */
    public String nextHopPeering() {
        return this.nextHopPeering;
    }
    /**
     * The URL to a VpnTunnel that should handle matching packets.
     * 
    */
    public String nextHopVpnTunnel() {
        return this.nextHopVpnTunnel;
    }
    /**
     * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In cases where multiple routes have equal prefix length, the one with the lowest-numbered priority value wins. The default value is `1000`. The priority value must be from `0` to `65535`, inclusive.
     * 
    */
    public Integer priority() {
        return this.priority;
    }
    /**
     * The type of this route, which can be one of the following values: - 'TRANSIT' for a transit route that this router learned from another Cloud Router and will readvertise to one of its BGP peers - 'SUBNET' for a route from a subnet of the VPC - 'BGP' for a route learned from a BGP peer of this router - 'STATIC' for a static route
     * 
    */
    public String routeType() {
        return this.routeType;
    }
    /**
     * Server-defined fully-qualified URL for this resource.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * A list of instance tags to which this route applies.
     * 
    */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * If potential misconfigurations are detected for this route, this field will be populated with warning messages.
     * 
    */
    public List<RouteWarningsItemResponse> warnings() {
        return this.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RouteAsPathResponse> asPaths;
        private String creationTimestamp;
        private String description;
        private String destRange;
        private String kind;
        private String name;
        private String network;
        private String nextHopGateway;
        private String nextHopIlb;
        private String nextHopInstance;
        private String nextHopIp;
        private String nextHopNetwork;
        private String nextHopPeering;
        private String nextHopVpnTunnel;
        private Integer priority;
        private String routeType;
        private String selfLink;
        private List<String> tags;
        private List<RouteWarningsItemResponse> warnings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asPaths = defaults.asPaths;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.destRange = defaults.destRange;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nextHopGateway = defaults.nextHopGateway;
    	      this.nextHopIlb = defaults.nextHopIlb;
    	      this.nextHopInstance = defaults.nextHopInstance;
    	      this.nextHopIp = defaults.nextHopIp;
    	      this.nextHopNetwork = defaults.nextHopNetwork;
    	      this.nextHopPeering = defaults.nextHopPeering;
    	      this.nextHopVpnTunnel = defaults.nextHopVpnTunnel;
    	      this.priority = defaults.priority;
    	      this.routeType = defaults.routeType;
    	      this.selfLink = defaults.selfLink;
    	      this.tags = defaults.tags;
    	      this.warnings = defaults.warnings;
        }

        public Builder asPaths(List<RouteAsPathResponse> asPaths) {
            this.asPaths = Objects.requireNonNull(asPaths);
            return this;
        }
        public Builder asPaths(RouteAsPathResponse... asPaths) {
            return asPaths(List.of(asPaths));
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder destRange(String destRange) {
            this.destRange = Objects.requireNonNull(destRange);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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
        public Builder nextHopGateway(String nextHopGateway) {
            this.nextHopGateway = Objects.requireNonNull(nextHopGateway);
            return this;
        }
        public Builder nextHopIlb(String nextHopIlb) {
            this.nextHopIlb = Objects.requireNonNull(nextHopIlb);
            return this;
        }
        public Builder nextHopInstance(String nextHopInstance) {
            this.nextHopInstance = Objects.requireNonNull(nextHopInstance);
            return this;
        }
        public Builder nextHopIp(String nextHopIp) {
            this.nextHopIp = Objects.requireNonNull(nextHopIp);
            return this;
        }
        public Builder nextHopNetwork(String nextHopNetwork) {
            this.nextHopNetwork = Objects.requireNonNull(nextHopNetwork);
            return this;
        }
        public Builder nextHopPeering(String nextHopPeering) {
            this.nextHopPeering = Objects.requireNonNull(nextHopPeering);
            return this;
        }
        public Builder nextHopVpnTunnel(String nextHopVpnTunnel) {
            this.nextHopVpnTunnel = Objects.requireNonNull(nextHopVpnTunnel);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder routeType(String routeType) {
            this.routeType = Objects.requireNonNull(routeType);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder warnings(List<RouteWarningsItemResponse> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }
        public Builder warnings(RouteWarningsItemResponse... warnings) {
            return warnings(List.of(warnings));
        }        public GetRouteResult build() {
            return new GetRouteResult(asPaths, creationTimestamp, description, destRange, kind, name, network, nextHopGateway, nextHopIlb, nextHopInstance, nextHopIp, nextHopNetwork, nextHopPeering, nextHopVpnTunnel, priority, routeType, selfLink, tags, warnings);
        }
    }
}
