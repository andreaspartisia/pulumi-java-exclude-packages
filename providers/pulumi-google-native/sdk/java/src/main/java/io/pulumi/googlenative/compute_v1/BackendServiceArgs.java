// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.enums.BackendServiceLoadBalancingScheme;
import io.pulumi.googlenative.compute_v1.enums.BackendServiceLocalityLbPolicy;
import io.pulumi.googlenative.compute_v1.enums.BackendServiceProtocol;
import io.pulumi.googlenative.compute_v1.enums.BackendServiceSessionAffinity;
import io.pulumi.googlenative.compute_v1.inputs.BackendArgs;
import io.pulumi.googlenative.compute_v1.inputs.BackendServiceCdnPolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.BackendServiceConnectionTrackingPolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.BackendServiceFailoverPolicyArgs;
import io.pulumi.googlenative.compute_v1.inputs.BackendServiceIAPArgs;
import io.pulumi.googlenative.compute_v1.inputs.BackendServiceLogConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.CircuitBreakersArgs;
import io.pulumi.googlenative.compute_v1.inputs.ConnectionDrainingArgs;
import io.pulumi.googlenative.compute_v1.inputs.ConsistentHashLoadBalancerSettingsArgs;
import io.pulumi.googlenative.compute_v1.inputs.DurationArgs;
import io.pulumi.googlenative.compute_v1.inputs.OutlierDetectionArgs;
import io.pulumi.googlenative.compute_v1.inputs.SecuritySettingsArgs;
import io.pulumi.googlenative.compute_v1.inputs.SubsettingArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceArgs Empty = new BackendServiceArgs();

    /**
     * Lifetime of cookies in seconds. This setting is applicable to external and internal HTTP(S) load balancers and Traffic Director and requires GENERATED_COOKIE or HTTP_COOKIE session affinity. If set to 0, the cookie is non-persistent and lasts only until the end of the browser session (or equivalent). The maximum allowed value is one day (86,400). Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="affinityCookieTtlSec")
      private final @Nullable Output<Integer> affinityCookieTtlSec;

    public Output<Integer> affinityCookieTtlSec() {
        return this.affinityCookieTtlSec == null ? Codegen.empty() : this.affinityCookieTtlSec;
    }

    /**
     * The list of backends that serve this BackendService.
     * 
     */
    @Import(name="backends")
      private final @Nullable Output<List<BackendArgs>> backends;

    public Output<List<BackendArgs>> backends() {
        return this.backends == null ? Codegen.empty() : this.backends;
    }

    /**
     * Cloud CDN configuration for this BackendService. Only available for specified load balancer types.
     * 
     */
    @Import(name="cdnPolicy")
      private final @Nullable Output<BackendServiceCdnPolicyArgs> cdnPolicy;

    public Output<BackendServiceCdnPolicyArgs> cdnPolicy() {
        return this.cdnPolicy == null ? Codegen.empty() : this.cdnPolicy;
    }

    @Import(name="circuitBreakers")
      private final @Nullable Output<CircuitBreakersArgs> circuitBreakers;

    public Output<CircuitBreakersArgs> circuitBreakers() {
        return this.circuitBreakers == null ? Codegen.empty() : this.circuitBreakers;
    }

    @Import(name="connectionDraining")
      private final @Nullable Output<ConnectionDrainingArgs> connectionDraining;

    public Output<ConnectionDrainingArgs> connectionDraining() {
        return this.connectionDraining == null ? Codegen.empty() : this.connectionDraining;
    }

    /**
     * Connection Tracking configuration for this BackendService. Connection tracking policy settings are only available for Network Load Balancing and Internal TCP/UDP Load Balancing.
     * 
     */
    @Import(name="connectionTrackingPolicy")
      private final @Nullable Output<BackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy;

    public Output<BackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy() {
        return this.connectionTrackingPolicy == null ? Codegen.empty() : this.connectionTrackingPolicy;
    }

    /**
     * Consistent Hash-based load balancing can be used to provide soft session affinity based on HTTP headers, cookies or other properties. This load balancing policy is applicable only for HTTP connections. The affinity to a particular destination host will be lost when one or more hosts are added/removed from the destination service. This field specifies parameters that control consistent hashing. This field is only applicable when localityLbPolicy is set to MAGLEV or RING_HASH. This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="consistentHash")
      private final @Nullable Output<ConsistentHashLoadBalancerSettingsArgs> consistentHash;

    public Output<ConsistentHashLoadBalancerSettingsArgs> consistentHash() {
        return this.consistentHash == null ? Codegen.empty() : this.consistentHash;
    }

    /**
     * Headers that the load balancer adds to proxied requests. See [Creating custom headers](https://cloud.google.com/load-balancing/docs/custom-headers).
     * 
     */
    @Import(name="customRequestHeaders")
      private final @Nullable Output<List<String>> customRequestHeaders;

    public Output<List<String>> customRequestHeaders() {
        return this.customRequestHeaders == null ? Codegen.empty() : this.customRequestHeaders;
    }

    /**
     * Headers that the load balancer adds to proxied responses. See [Creating custom headers](https://cloud.google.com/load-balancing/docs/custom-headers).
     * 
     */
    @Import(name="customResponseHeaders")
      private final @Nullable Output<List<String>> customResponseHeaders;

    public Output<List<String>> customResponseHeaders() {
        return this.customResponseHeaders == null ? Codegen.empty() : this.customResponseHeaders;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * If true, enables Cloud CDN for the backend service of an external HTTP(S) load balancer.
     * 
     */
    @Import(name="enableCDN")
      private final @Nullable Output<Boolean> enableCDN;

    public Output<Boolean> enableCDN() {
        return this.enableCDN == null ? Codegen.empty() : this.enableCDN;
    }

    /**
     * Requires at least one backend instance group to be defined as a backup (failover) backend. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
     */
    @Import(name="failoverPolicy")
      private final @Nullable Output<BackendServiceFailoverPolicyArgs> failoverPolicy;

    public Output<BackendServiceFailoverPolicyArgs> failoverPolicy() {
        return this.failoverPolicy == null ? Codegen.empty() : this.failoverPolicy;
    }

    /**
     * The list of URLs to the healthChecks, httpHealthChecks (legacy), or httpsHealthChecks (legacy) resource for health checking this backend service. Not all backend services support legacy health checks. See Load balancer guide. Currently, at most one health check can be specified for each backend service. Backend services with instance group or zonal NEG backends must have a health check. Backend services with internet or serverless NEG backends must not have a health check.
     * 
     */
    @Import(name="healthChecks")
      private final @Nullable Output<List<String>> healthChecks;

    public Output<List<String>> healthChecks() {
        return this.healthChecks == null ? Codegen.empty() : this.healthChecks;
    }

    /**
     * The configurations for Identity-Aware Proxy on this resource. Not available for Internal TCP/UDP Load Balancing and Network Load Balancing.
     * 
     */
    @Import(name="iap")
      private final @Nullable Output<BackendServiceIAPArgs> iap;

    public Output<BackendServiceIAPArgs> iap() {
        return this.iap == null ? Codegen.empty() : this.iap;
    }

    /**
     * Specifies the load balancer type. A backend service created for one type of load balancer cannot be used with another. For more information, refer to Choosing a load balancer.
     * 
     */
    @Import(name="loadBalancingScheme")
      private final @Nullable Output<BackendServiceLoadBalancingScheme> loadBalancingScheme;

    public Output<BackendServiceLoadBalancingScheme> loadBalancingScheme() {
        return this.loadBalancingScheme == null ? Codegen.empty() : this.loadBalancingScheme;
    }

    /**
     * The load balancing algorithm used within the scope of the locality. The possible values are: - ROUND_ROBIN: This is a simple policy in which each healthy backend is selected in round robin order. This is the default. - LEAST_REQUEST: An O(1) algorithm which selects two random healthy hosts and picks the host which has fewer active requests. - RING_HASH: The ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has the property that the addition/removal of a host from a set of N hosts only affects 1/N of the requests. - RANDOM: The load balancer selects a random healthy host. - ORIGINAL_DESTINATION: Backend host is selected based on the client connection metadata, i.e., connections are opened to the same address as the destination address of the incoming connection before the connection was redirected to the load balancer. - MAGLEV: used as a drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host selection times. For more information about Maglev, see https://ai.google/research/pubs/pub44824 This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED. If sessionAffinity is not NONE, and this field is not set to MAGLEV or RING_HASH, session affinity settings will not take effect. Only ROUND_ROBIN and RING_HASH are supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="localityLbPolicy")
      private final @Nullable Output<BackendServiceLocalityLbPolicy> localityLbPolicy;

    public Output<BackendServiceLocalityLbPolicy> localityLbPolicy() {
        return this.localityLbPolicy == null ? Codegen.empty() : this.localityLbPolicy;
    }

    /**
     * This field denotes the logging options for the load balancer traffic served by this backend service. If logging is enabled, logs will be exported to Stackdriver.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<BackendServiceLogConfigArgs> logConfig;

    public Output<BackendServiceLogConfigArgs> logConfig() {
        return this.logConfig == null ? Codegen.empty() : this.logConfig;
    }

    /**
     * Specifies the default maximum duration (timeout) for streams to this service. Duration is computed from the beginning of the stream until the response has been completely processed, including all retries. A stream that does not complete in this duration is closed. If not specified, there will be no timeout limit, i.e. the maximum duration is infinite. This value can be overridden in the PathMatcher configuration of the UrlMap that references this backend service. This field is only allowed when the loadBalancingScheme of the backend service is INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="maxStreamDuration")
      private final @Nullable Output<DurationArgs> maxStreamDuration;

    public Output<DurationArgs> maxStreamDuration() {
        return this.maxStreamDuration == null ? Codegen.empty() : this.maxStreamDuration;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The URL of the network to which this backend service belongs. This field can only be specified when the load balancing scheme is set to INTERNAL.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the backend service. If not set, this feature is considered disabled. This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="outlierDetection")
      private final @Nullable Output<OutlierDetectionArgs> outlierDetection;

    public Output<OutlierDetectionArgs> outlierDetection() {
        return this.outlierDetection == null ? Codegen.empty() : this.outlierDetection;
    }

    /**
     * A named port on a backend instance group representing the port for communication to the backend VMs in that group. The named port must be [defined on each backend instance group](https://cloud.google.com/load-balancing/docs/backend-service#named_ports). This parameter has no meaning if the backends are NEGs. For Internal TCP/UDP Load Balancing and Network Load Balancing, omit port_name.
     * 
     */
    @Import(name="portName")
      private final @Nullable Output<String> portName;

    public Output<String> portName() {
        return this.portName == null ? Codegen.empty() : this.portName;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The protocol this BackendService uses to communicate with backends. Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, UDP or GRPC. depending on the chosen load balancer or Traffic Director configuration. Refer to the documentation for the load balancers or for Traffic Director for more information. Must be set to GRPC when the backend service is referenced by a URL map that is bound to target gRPC proxy.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<BackendServiceProtocol> protocol;

    public Output<BackendServiceProtocol> protocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * This field specifies the security settings that apply to this backend service. This field is applicable to a global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="securitySettings")
      private final @Nullable Output<SecuritySettingsArgs> securitySettings;

    public Output<SecuritySettingsArgs> securitySettings() {
        return this.securitySettings == null ? Codegen.empty() : this.securitySettings;
    }

    /**
     * Type of session affinity to use. The default is NONE. Only NONE and HEADER_FIELD are supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. For more details, see: [Session Affinity](https://cloud.google.com/load-balancing/docs/backend-service#session_affinity).
     * 
     */
    @Import(name="sessionAffinity")
      private final @Nullable Output<BackendServiceSessionAffinity> sessionAffinity;

    public Output<BackendServiceSessionAffinity> sessionAffinity() {
        return this.sessionAffinity == null ? Codegen.empty() : this.sessionAffinity;
    }

    @Import(name="subsetting")
      private final @Nullable Output<SubsettingArgs> subsetting;

    public Output<SubsettingArgs> subsetting() {
        return this.subsetting == null ? Codegen.empty() : this.subsetting;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. Instead, use maxStreamDuration.
     * 
     */
    @Import(name="timeoutSec")
      private final @Nullable Output<Integer> timeoutSec;

    public Output<Integer> timeoutSec() {
        return this.timeoutSec == null ? Codegen.empty() : this.timeoutSec;
    }

    public BackendServiceArgs(
        @Nullable Output<Integer> affinityCookieTtlSec,
        @Nullable Output<List<BackendArgs>> backends,
        @Nullable Output<BackendServiceCdnPolicyArgs> cdnPolicy,
        @Nullable Output<CircuitBreakersArgs> circuitBreakers,
        @Nullable Output<ConnectionDrainingArgs> connectionDraining,
        @Nullable Output<BackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy,
        @Nullable Output<ConsistentHashLoadBalancerSettingsArgs> consistentHash,
        @Nullable Output<List<String>> customRequestHeaders,
        @Nullable Output<List<String>> customResponseHeaders,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableCDN,
        @Nullable Output<BackendServiceFailoverPolicyArgs> failoverPolicy,
        @Nullable Output<List<String>> healthChecks,
        @Nullable Output<BackendServiceIAPArgs> iap,
        @Nullable Output<BackendServiceLoadBalancingScheme> loadBalancingScheme,
        @Nullable Output<BackendServiceLocalityLbPolicy> localityLbPolicy,
        @Nullable Output<BackendServiceLogConfigArgs> logConfig,
        @Nullable Output<DurationArgs> maxStreamDuration,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<OutlierDetectionArgs> outlierDetection,
        @Nullable Output<String> portName,
        @Nullable Output<String> project,
        @Nullable Output<BackendServiceProtocol> protocol,
        @Nullable Output<String> requestId,
        @Nullable Output<SecuritySettingsArgs> securitySettings,
        @Nullable Output<BackendServiceSessionAffinity> sessionAffinity,
        @Nullable Output<SubsettingArgs> subsetting,
        @Nullable Output<Integer> timeoutSec) {
        this.affinityCookieTtlSec = affinityCookieTtlSec;
        this.backends = backends;
        this.cdnPolicy = cdnPolicy;
        this.circuitBreakers = circuitBreakers;
        this.connectionDraining = connectionDraining;
        this.connectionTrackingPolicy = connectionTrackingPolicy;
        this.consistentHash = consistentHash;
        this.customRequestHeaders = customRequestHeaders;
        this.customResponseHeaders = customResponseHeaders;
        this.description = description;
        this.enableCDN = enableCDN;
        this.failoverPolicy = failoverPolicy;
        this.healthChecks = healthChecks;
        this.iap = iap;
        this.loadBalancingScheme = loadBalancingScheme;
        this.localityLbPolicy = localityLbPolicy;
        this.logConfig = logConfig;
        this.maxStreamDuration = maxStreamDuration;
        this.name = name;
        this.network = network;
        this.outlierDetection = outlierDetection;
        this.portName = portName;
        this.project = project;
        this.protocol = protocol;
        this.requestId = requestId;
        this.securitySettings = securitySettings;
        this.sessionAffinity = sessionAffinity;
        this.subsetting = subsetting;
        this.timeoutSec = timeoutSec;
    }

    private BackendServiceArgs() {
        this.affinityCookieTtlSec = Codegen.empty();
        this.backends = Codegen.empty();
        this.cdnPolicy = Codegen.empty();
        this.circuitBreakers = Codegen.empty();
        this.connectionDraining = Codegen.empty();
        this.connectionTrackingPolicy = Codegen.empty();
        this.consistentHash = Codegen.empty();
        this.customRequestHeaders = Codegen.empty();
        this.customResponseHeaders = Codegen.empty();
        this.description = Codegen.empty();
        this.enableCDN = Codegen.empty();
        this.failoverPolicy = Codegen.empty();
        this.healthChecks = Codegen.empty();
        this.iap = Codegen.empty();
        this.loadBalancingScheme = Codegen.empty();
        this.localityLbPolicy = Codegen.empty();
        this.logConfig = Codegen.empty();
        this.maxStreamDuration = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.outlierDetection = Codegen.empty();
        this.portName = Codegen.empty();
        this.project = Codegen.empty();
        this.protocol = Codegen.empty();
        this.requestId = Codegen.empty();
        this.securitySettings = Codegen.empty();
        this.sessionAffinity = Codegen.empty();
        this.subsetting = Codegen.empty();
        this.timeoutSec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> affinityCookieTtlSec;
        private @Nullable Output<List<BackendArgs>> backends;
        private @Nullable Output<BackendServiceCdnPolicyArgs> cdnPolicy;
        private @Nullable Output<CircuitBreakersArgs> circuitBreakers;
        private @Nullable Output<ConnectionDrainingArgs> connectionDraining;
        private @Nullable Output<BackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy;
        private @Nullable Output<ConsistentHashLoadBalancerSettingsArgs> consistentHash;
        private @Nullable Output<List<String>> customRequestHeaders;
        private @Nullable Output<List<String>> customResponseHeaders;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableCDN;
        private @Nullable Output<BackendServiceFailoverPolicyArgs> failoverPolicy;
        private @Nullable Output<List<String>> healthChecks;
        private @Nullable Output<BackendServiceIAPArgs> iap;
        private @Nullable Output<BackendServiceLoadBalancingScheme> loadBalancingScheme;
        private @Nullable Output<BackendServiceLocalityLbPolicy> localityLbPolicy;
        private @Nullable Output<BackendServiceLogConfigArgs> logConfig;
        private @Nullable Output<DurationArgs> maxStreamDuration;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<OutlierDetectionArgs> outlierDetection;
        private @Nullable Output<String> portName;
        private @Nullable Output<String> project;
        private @Nullable Output<BackendServiceProtocol> protocol;
        private @Nullable Output<String> requestId;
        private @Nullable Output<SecuritySettingsArgs> securitySettings;
        private @Nullable Output<BackendServiceSessionAffinity> sessionAffinity;
        private @Nullable Output<SubsettingArgs> subsetting;
        private @Nullable Output<Integer> timeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieTtlSec = defaults.affinityCookieTtlSec;
    	      this.backends = defaults.backends;
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.circuitBreakers = defaults.circuitBreakers;
    	      this.connectionDraining = defaults.connectionDraining;
    	      this.connectionTrackingPolicy = defaults.connectionTrackingPolicy;
    	      this.consistentHash = defaults.consistentHash;
    	      this.customRequestHeaders = defaults.customRequestHeaders;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.enableCDN = defaults.enableCDN;
    	      this.failoverPolicy = defaults.failoverPolicy;
    	      this.healthChecks = defaults.healthChecks;
    	      this.iap = defaults.iap;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.localityLbPolicy = defaults.localityLbPolicy;
    	      this.logConfig = defaults.logConfig;
    	      this.maxStreamDuration = defaults.maxStreamDuration;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.outlierDetection = defaults.outlierDetection;
    	      this.portName = defaults.portName;
    	      this.project = defaults.project;
    	      this.protocol = defaults.protocol;
    	      this.requestId = defaults.requestId;
    	      this.securitySettings = defaults.securitySettings;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.subsetting = defaults.subsetting;
    	      this.timeoutSec = defaults.timeoutSec;
        }

        public Builder affinityCookieTtlSec(@Nullable Output<Integer> affinityCookieTtlSec) {
            this.affinityCookieTtlSec = affinityCookieTtlSec;
            return this;
        }
        public Builder affinityCookieTtlSec(@Nullable Integer affinityCookieTtlSec) {
            this.affinityCookieTtlSec = Codegen.ofNullable(affinityCookieTtlSec);
            return this;
        }
        public Builder backends(@Nullable Output<List<BackendArgs>> backends) {
            this.backends = backends;
            return this;
        }
        public Builder backends(@Nullable List<BackendArgs> backends) {
            this.backends = Codegen.ofNullable(backends);
            return this;
        }
        public Builder backends(BackendArgs... backends) {
            return backends(List.of(backends));
        }
        public Builder cdnPolicy(@Nullable Output<BackendServiceCdnPolicyArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }
        public Builder cdnPolicy(@Nullable BackendServiceCdnPolicyArgs cdnPolicy) {
            this.cdnPolicy = Codegen.ofNullable(cdnPolicy);
            return this;
        }
        public Builder circuitBreakers(@Nullable Output<CircuitBreakersArgs> circuitBreakers) {
            this.circuitBreakers = circuitBreakers;
            return this;
        }
        public Builder circuitBreakers(@Nullable CircuitBreakersArgs circuitBreakers) {
            this.circuitBreakers = Codegen.ofNullable(circuitBreakers);
            return this;
        }
        public Builder connectionDraining(@Nullable Output<ConnectionDrainingArgs> connectionDraining) {
            this.connectionDraining = connectionDraining;
            return this;
        }
        public Builder connectionDraining(@Nullable ConnectionDrainingArgs connectionDraining) {
            this.connectionDraining = Codegen.ofNullable(connectionDraining);
            return this;
        }
        public Builder connectionTrackingPolicy(@Nullable Output<BackendServiceConnectionTrackingPolicyArgs> connectionTrackingPolicy) {
            this.connectionTrackingPolicy = connectionTrackingPolicy;
            return this;
        }
        public Builder connectionTrackingPolicy(@Nullable BackendServiceConnectionTrackingPolicyArgs connectionTrackingPolicy) {
            this.connectionTrackingPolicy = Codegen.ofNullable(connectionTrackingPolicy);
            return this;
        }
        public Builder consistentHash(@Nullable Output<ConsistentHashLoadBalancerSettingsArgs> consistentHash) {
            this.consistentHash = consistentHash;
            return this;
        }
        public Builder consistentHash(@Nullable ConsistentHashLoadBalancerSettingsArgs consistentHash) {
            this.consistentHash = Codegen.ofNullable(consistentHash);
            return this;
        }
        public Builder customRequestHeaders(@Nullable Output<List<String>> customRequestHeaders) {
            this.customRequestHeaders = customRequestHeaders;
            return this;
        }
        public Builder customRequestHeaders(@Nullable List<String> customRequestHeaders) {
            this.customRequestHeaders = Codegen.ofNullable(customRequestHeaders);
            return this;
        }
        public Builder customRequestHeaders(String... customRequestHeaders) {
            return customRequestHeaders(List.of(customRequestHeaders));
        }
        public Builder customResponseHeaders(@Nullable Output<List<String>> customResponseHeaders) {
            this.customResponseHeaders = customResponseHeaders;
            return this;
        }
        public Builder customResponseHeaders(@Nullable List<String> customResponseHeaders) {
            this.customResponseHeaders = Codegen.ofNullable(customResponseHeaders);
            return this;
        }
        public Builder customResponseHeaders(String... customResponseHeaders) {
            return customResponseHeaders(List.of(customResponseHeaders));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enableCDN(@Nullable Output<Boolean> enableCDN) {
            this.enableCDN = enableCDN;
            return this;
        }
        public Builder enableCDN(@Nullable Boolean enableCDN) {
            this.enableCDN = Codegen.ofNullable(enableCDN);
            return this;
        }
        public Builder failoverPolicy(@Nullable Output<BackendServiceFailoverPolicyArgs> failoverPolicy) {
            this.failoverPolicy = failoverPolicy;
            return this;
        }
        public Builder failoverPolicy(@Nullable BackendServiceFailoverPolicyArgs failoverPolicy) {
            this.failoverPolicy = Codegen.ofNullable(failoverPolicy);
            return this;
        }
        public Builder healthChecks(@Nullable Output<List<String>> healthChecks) {
            this.healthChecks = healthChecks;
            return this;
        }
        public Builder healthChecks(@Nullable List<String> healthChecks) {
            this.healthChecks = Codegen.ofNullable(healthChecks);
            return this;
        }
        public Builder healthChecks(String... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }
        public Builder iap(@Nullable Output<BackendServiceIAPArgs> iap) {
            this.iap = iap;
            return this;
        }
        public Builder iap(@Nullable BackendServiceIAPArgs iap) {
            this.iap = Codegen.ofNullable(iap);
            return this;
        }
        public Builder loadBalancingScheme(@Nullable Output<BackendServiceLoadBalancingScheme> loadBalancingScheme) {
            this.loadBalancingScheme = loadBalancingScheme;
            return this;
        }
        public Builder loadBalancingScheme(@Nullable BackendServiceLoadBalancingScheme loadBalancingScheme) {
            this.loadBalancingScheme = Codegen.ofNullable(loadBalancingScheme);
            return this;
        }
        public Builder localityLbPolicy(@Nullable Output<BackendServiceLocalityLbPolicy> localityLbPolicy) {
            this.localityLbPolicy = localityLbPolicy;
            return this;
        }
        public Builder localityLbPolicy(@Nullable BackendServiceLocalityLbPolicy localityLbPolicy) {
            this.localityLbPolicy = Codegen.ofNullable(localityLbPolicy);
            return this;
        }
        public Builder logConfig(@Nullable Output<BackendServiceLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable BackendServiceLogConfigArgs logConfig) {
            this.logConfig = Codegen.ofNullable(logConfig);
            return this;
        }
        public Builder maxStreamDuration(@Nullable Output<DurationArgs> maxStreamDuration) {
            this.maxStreamDuration = maxStreamDuration;
            return this;
        }
        public Builder maxStreamDuration(@Nullable DurationArgs maxStreamDuration) {
            this.maxStreamDuration = Codegen.ofNullable(maxStreamDuration);
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
        public Builder outlierDetection(@Nullable Output<OutlierDetectionArgs> outlierDetection) {
            this.outlierDetection = outlierDetection;
            return this;
        }
        public Builder outlierDetection(@Nullable OutlierDetectionArgs outlierDetection) {
            this.outlierDetection = Codegen.ofNullable(outlierDetection);
            return this;
        }
        public Builder portName(@Nullable Output<String> portName) {
            this.portName = portName;
            return this;
        }
        public Builder portName(@Nullable String portName) {
            this.portName = Codegen.ofNullable(portName);
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
        public Builder protocol(@Nullable Output<BackendServiceProtocol> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable BackendServiceProtocol protocol) {
            this.protocol = Codegen.ofNullable(protocol);
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
        public Builder securitySettings(@Nullable Output<SecuritySettingsArgs> securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }
        public Builder securitySettings(@Nullable SecuritySettingsArgs securitySettings) {
            this.securitySettings = Codegen.ofNullable(securitySettings);
            return this;
        }
        public Builder sessionAffinity(@Nullable Output<BackendServiceSessionAffinity> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public Builder sessionAffinity(@Nullable BackendServiceSessionAffinity sessionAffinity) {
            this.sessionAffinity = Codegen.ofNullable(sessionAffinity);
            return this;
        }
        public Builder subsetting(@Nullable Output<SubsettingArgs> subsetting) {
            this.subsetting = subsetting;
            return this;
        }
        public Builder subsetting(@Nullable SubsettingArgs subsetting) {
            this.subsetting = Codegen.ofNullable(subsetting);
            return this;
        }
        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }
        public Builder timeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Codegen.ofNullable(timeoutSec);
            return this;
        }        public BackendServiceArgs build() {
            return new BackendServiceArgs(affinityCookieTtlSec, backends, cdnPolicy, circuitBreakers, connectionDraining, connectionTrackingPolicy, consistentHash, customRequestHeaders, customResponseHeaders, description, enableCDN, failoverPolicy, healthChecks, iap, loadBalancingScheme, localityLbPolicy, logConfig, maxStreamDuration, name, network, outlierDetection, portName, project, protocol, requestId, securitySettings, sessionAffinity, subsetting, timeoutSec);
        }
    }
}
