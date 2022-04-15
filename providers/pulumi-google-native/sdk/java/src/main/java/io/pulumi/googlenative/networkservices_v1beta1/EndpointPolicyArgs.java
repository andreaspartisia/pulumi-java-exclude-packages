// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkservices_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.networkservices_v1beta1.enums.EndpointPolicyType;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.EndpointMatcherArgs;
import io.pulumi.googlenative.networkservices_v1beta1.inputs.TrafficPortSelectorArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointPolicyArgs Empty = new EndpointPolicyArgs();

    /**
     * Optional. This field specifies the URL of AuthorizationPolicy resource that applies authorization policies to the inbound traffic at the matched endpoints. Refer to Authorization. If this field is not specified, authorization is disabled(no authz checks) for this endpoint.
     * 
     */
    @Import(name="authorizationPolicy")
      private final @Nullable Output<String> authorizationPolicy;

    public Output<String> authorizationPolicy() {
        return this.authorizationPolicy == null ? Codegen.empty() : this.authorizationPolicy;
    }

    /**
     * Optional. A URL referring to a ClientTlsPolicy resource. ClientTlsPolicy can be set to specify the authentication for traffic from the proxy to the actual endpoints. More specifically, it is applied to the outgoing traffic from the proxy to the endpoint. This is typically used for sidecar model where the proxy identifies itself as endpoint to the control plane, with the connection between sidecar and endpoint requiring authentication. If this field is not set, authentication is disabled(open). Applicable only when EndpointPolicyType is SIDECAR_PROXY.
     * 
     */
    @Import(name="clientTlsPolicy")
      private final @Nullable Output<String> clientTlsPolicy;

    public Output<String> clientTlsPolicy() {
        return this.clientTlsPolicy == null ? Codegen.empty() : this.clientTlsPolicy;
    }

    /**
     * Optional. A free-text description of the resource. Max length 1024 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * A matcher that selects endpoints to which the policies should be applied.
     * 
     */
    @Import(name="endpointMatcher", required=true)
      private final Output<EndpointMatcherArgs> endpointMatcher;

    public Output<EndpointMatcherArgs> endpointMatcher() {
        return this.endpointMatcher;
    }

    @Import(name="endpointPolicyId", required=true)
      private final Output<String> endpointPolicyId;

    public Output<String> endpointPolicyId() {
        return this.endpointPolicyId;
    }

    /**
     * Optional. Set of label tags associated with the EndpointPolicy resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of the EndpointPolicy resource. It matches pattern `projects/{project}/locations/global/endpointPolicies/{endpoint_policy}`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. A URL referring to ServerTlsPolicy resource. ServerTlsPolicy is used to determine the authentication policy to be applied to terminate the inbound traffic at the identified backends. If this field is not set, authentication is disabled(open) for this endpoint.
     * 
     */
    @Import(name="serverTlsPolicy")
      private final @Nullable Output<String> serverTlsPolicy;

    public Output<String> serverTlsPolicy() {
        return this.serverTlsPolicy == null ? Codegen.empty() : this.serverTlsPolicy;
    }

    /**
     * Optional. Port selector for the (matched) endpoints. If no port selector is provided, the matched config is applied to all ports.
     * 
     */
    @Import(name="trafficPortSelector")
      private final @Nullable Output<TrafficPortSelectorArgs> trafficPortSelector;

    public Output<TrafficPortSelectorArgs> trafficPortSelector() {
        return this.trafficPortSelector == null ? Codegen.empty() : this.trafficPortSelector;
    }

    /**
     * The type of endpoint policy. This is primarily used to validate the configuration.
     * 
     */
    @Import(name="type", required=true)
      private final Output<EndpointPolicyType> type;

    public Output<EndpointPolicyType> type() {
        return this.type;
    }

    public EndpointPolicyArgs(
        @Nullable Output<String> authorizationPolicy,
        @Nullable Output<String> clientTlsPolicy,
        @Nullable Output<String> description,
        Output<EndpointMatcherArgs> endpointMatcher,
        Output<String> endpointPolicyId,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> serverTlsPolicy,
        @Nullable Output<TrafficPortSelectorArgs> trafficPortSelector,
        Output<EndpointPolicyType> type) {
        this.authorizationPolicy = authorizationPolicy;
        this.clientTlsPolicy = clientTlsPolicy;
        this.description = description;
        this.endpointMatcher = Objects.requireNonNull(endpointMatcher, "expected parameter 'endpointMatcher' to be non-null");
        this.endpointPolicyId = Objects.requireNonNull(endpointPolicyId, "expected parameter 'endpointPolicyId' to be non-null");
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.serverTlsPolicy = serverTlsPolicy;
        this.trafficPortSelector = trafficPortSelector;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EndpointPolicyArgs() {
        this.authorizationPolicy = Codegen.empty();
        this.clientTlsPolicy = Codegen.empty();
        this.description = Codegen.empty();
        this.endpointMatcher = Codegen.empty();
        this.endpointPolicyId = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.serverTlsPolicy = Codegen.empty();
        this.trafficPortSelector = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationPolicy;
        private @Nullable Output<String> clientTlsPolicy;
        private @Nullable Output<String> description;
        private Output<EndpointMatcherArgs> endpointMatcher;
        private Output<String> endpointPolicyId;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> serverTlsPolicy;
        private @Nullable Output<TrafficPortSelectorArgs> trafficPortSelector;
        private Output<EndpointPolicyType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationPolicy = defaults.authorizationPolicy;
    	      this.clientTlsPolicy = defaults.clientTlsPolicy;
    	      this.description = defaults.description;
    	      this.endpointMatcher = defaults.endpointMatcher;
    	      this.endpointPolicyId = defaults.endpointPolicyId;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serverTlsPolicy = defaults.serverTlsPolicy;
    	      this.trafficPortSelector = defaults.trafficPortSelector;
    	      this.type = defaults.type;
        }

        public Builder authorizationPolicy(@Nullable Output<String> authorizationPolicy) {
            this.authorizationPolicy = authorizationPolicy;
            return this;
        }
        public Builder authorizationPolicy(@Nullable String authorizationPolicy) {
            this.authorizationPolicy = Codegen.ofNullable(authorizationPolicy);
            return this;
        }
        public Builder clientTlsPolicy(@Nullable Output<String> clientTlsPolicy) {
            this.clientTlsPolicy = clientTlsPolicy;
            return this;
        }
        public Builder clientTlsPolicy(@Nullable String clientTlsPolicy) {
            this.clientTlsPolicy = Codegen.ofNullable(clientTlsPolicy);
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
        public Builder endpointMatcher(Output<EndpointMatcherArgs> endpointMatcher) {
            this.endpointMatcher = Objects.requireNonNull(endpointMatcher);
            return this;
        }
        public Builder endpointMatcher(EndpointMatcherArgs endpointMatcher) {
            this.endpointMatcher = Output.of(Objects.requireNonNull(endpointMatcher));
            return this;
        }
        public Builder endpointPolicyId(Output<String> endpointPolicyId) {
            this.endpointPolicyId = Objects.requireNonNull(endpointPolicyId);
            return this;
        }
        public Builder endpointPolicyId(String endpointPolicyId) {
            this.endpointPolicyId = Output.of(Objects.requireNonNull(endpointPolicyId));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder serverTlsPolicy(@Nullable Output<String> serverTlsPolicy) {
            this.serverTlsPolicy = serverTlsPolicy;
            return this;
        }
        public Builder serverTlsPolicy(@Nullable String serverTlsPolicy) {
            this.serverTlsPolicy = Codegen.ofNullable(serverTlsPolicy);
            return this;
        }
        public Builder trafficPortSelector(@Nullable Output<TrafficPortSelectorArgs> trafficPortSelector) {
            this.trafficPortSelector = trafficPortSelector;
            return this;
        }
        public Builder trafficPortSelector(@Nullable TrafficPortSelectorArgs trafficPortSelector) {
            this.trafficPortSelector = Codegen.ofNullable(trafficPortSelector);
            return this;
        }
        public Builder type(Output<EndpointPolicyType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(EndpointPolicyType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public EndpointPolicyArgs build() {
            return new EndpointPolicyArgs(authorizationPolicy, clientTlsPolicy, description, endpointMatcher, endpointPolicyId, labels, location, name, project, serverTlsPolicy, trafficPortSelector, type);
        }
    }
}
