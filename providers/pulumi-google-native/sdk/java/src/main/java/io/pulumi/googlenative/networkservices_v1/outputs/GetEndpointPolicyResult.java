// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.networkservices_v1.outputs.EndpointMatcherResponse;
import io.pulumi.googlenative.networkservices_v1.outputs.TrafficPortSelectorResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetEndpointPolicyResult {
    /**
     * Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
     * 
     */
    private final String authorizationPolicy;
    /**
     * Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
     * 
     */
    private final String clientTlsPolicy;
    /**
     * The timestamp when the resource was created.
     * 
     */
    private final String createTime;
    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    private final String description;
    /**
     * A matcher that selects endpoints to which the policies should be applied.
     * 
     */
    private final EndpointMatcherResponse endpointMatcher;
    /**
     * Optional. Set of label tags associated with the EndpointPolicy resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
     * 
     */
    private final String name;
    /**
     * Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
     * 
     */
    private final String serverTlsPolicy;
    /**
     * Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     * 
     */
    private final TrafficPortSelectorResponse trafficPortSelector;
    /**
     * The type of endpoint policy. This is primarily used to validate the configuration.
     * 
     */
    private final String type;
    /**
     * The timestamp when the resource was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetEndpointPolicyResult(
        @CustomType.Parameter("authorizationPolicy") String authorizationPolicy,
        @CustomType.Parameter("clientTlsPolicy") String clientTlsPolicy,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("endpointMatcher") EndpointMatcherResponse endpointMatcher,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("serverTlsPolicy") String serverTlsPolicy,
        @CustomType.Parameter("trafficPortSelector") TrafficPortSelectorResponse trafficPortSelector,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.authorizationPolicy = authorizationPolicy;
        this.clientTlsPolicy = clientTlsPolicy;
        this.createTime = createTime;
        this.description = description;
        this.endpointMatcher = endpointMatcher;
        this.labels = labels;
        this.name = name;
        this.serverTlsPolicy = serverTlsPolicy;
        this.trafficPortSelector = trafficPortSelector;
        this.type = type;
        this.updateTime = updateTime;
    }

    /**
     * Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
     * 
    */
    public String authorizationPolicy() {
        return this.authorizationPolicy;
    }
    /**
     * Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
     * 
    */
    public String clientTlsPolicy() {
        return this.clientTlsPolicy;
    }
    /**
     * The timestamp when the resource was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * A matcher that selects endpoints to which the policies should be applied.
     * 
    */
    public EndpointMatcherResponse endpointMatcher() {
        return this.endpointMatcher;
    }
    /**
     * Optional. Set of label tags associated with the EndpointPolicy resource.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
     * 
    */
    public String serverTlsPolicy() {
        return this.serverTlsPolicy;
    }
    /**
     * Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     * 
    */
    public TrafficPortSelectorResponse trafficPortSelector() {
        return this.trafficPortSelector;
    }
    /**
     * The type of endpoint policy. This is primarily used to validate the configuration.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The timestamp when the resource was updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEndpointPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationPolicy;
        private String clientTlsPolicy;
        private String createTime;
        private String description;
        private EndpointMatcherResponse endpointMatcher;
        private Map<String,String> labels;
        private String name;
        private String serverTlsPolicy;
        private TrafficPortSelectorResponse trafficPortSelector;
        private String type;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEndpointPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationPolicy = defaults.authorizationPolicy;
    	      this.clientTlsPolicy = defaults.clientTlsPolicy;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.endpointMatcher = defaults.endpointMatcher;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.serverTlsPolicy = defaults.serverTlsPolicy;
    	      this.trafficPortSelector = defaults.trafficPortSelector;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder authorizationPolicy(String authorizationPolicy) {
            this.authorizationPolicy = Objects.requireNonNull(authorizationPolicy);
            return this;
        }
        public Builder clientTlsPolicy(String clientTlsPolicy) {
            this.clientTlsPolicy = Objects.requireNonNull(clientTlsPolicy);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder endpointMatcher(EndpointMatcherResponse endpointMatcher) {
            this.endpointMatcher = Objects.requireNonNull(endpointMatcher);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder serverTlsPolicy(String serverTlsPolicy) {
            this.serverTlsPolicy = Objects.requireNonNull(serverTlsPolicy);
            return this;
        }
        public Builder trafficPortSelector(TrafficPortSelectorResponse trafficPortSelector) {
            this.trafficPortSelector = Objects.requireNonNull(trafficPortSelector);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetEndpointPolicyResult build() {
            return new GetEndpointPolicyResult(authorizationPolicy, clientTlsPolicy, createTime, description, endpointMatcher, labels, name, serverTlsPolicy, trafficPortSelector, type, updateTime);
        }
    }
}
