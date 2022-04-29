// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Dns.outputs.GetSteeringPoliciesSteeringPolicyAnswer;
import com.pulumi.oci.Dns.outputs.GetSteeringPoliciesSteeringPolicyRule;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSteeringPoliciesSteeringPolicy {
    /**
     * @return The set of all answers that can potentially issue from the steering policy.
     * 
     */
    private final List<GetSteeringPoliciesSteeringPolicyAnswer> answers;
    /**
     * @return The OCID of the compartment the resource belongs to.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The displayName of a resource.
     * 
     */
    private final String displayName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return Search by health check monitor OCID. Will match any resource whose health check monitor ID matches the provided value.
     * 
     */
    private final String healthCheckMonitorId;
    /**
     * @return The OCID of a resource.
     * 
     */
    private final String id;
    /**
     * @return The series of rules that will be processed in sequence to reduce the pool of answers to a response for any given request.
     * 
     */
    private final List<GetSteeringPoliciesSteeringPolicyRule> rules;
    /**
     * @return The canonical absolute URL of the resource.
     * 
     */
    private final String self;
    /**
     * @return The state of a resource.
     * 
     */
    private final String state;
    /**
     * @return Search by steering template type. Will match any resource whose template type matches the provided value.
     * 
     */
    private final String template;
    /**
     * @return The date and time the resource was created, expressed in RFC 3339 timestamp format.
     * 
     */
    private final String timeCreated;
    /**
     * @return The Time To Live (TTL) for responses from the steering policy, in seconds. If not specified during creation, a value of 30 seconds will be used.
     * 
     */
    private final Integer ttl;

    @CustomType.Constructor
    private GetSteeringPoliciesSteeringPolicy(
        @CustomType.Parameter("answers") List<GetSteeringPoliciesSteeringPolicyAnswer> answers,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("healthCheckMonitorId") String healthCheckMonitorId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("rules") List<GetSteeringPoliciesSteeringPolicyRule> rules,
        @CustomType.Parameter("self") String self,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("template") String template,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("ttl") Integer ttl) {
        this.answers = answers;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.healthCheckMonitorId = healthCheckMonitorId;
        this.id = id;
        this.rules = rules;
        this.self = self;
        this.state = state;
        this.template = template;
        this.timeCreated = timeCreated;
        this.ttl = ttl;
    }

    /**
     * @return The set of all answers that can potentially issue from the steering policy.
     * 
     */
    public List<GetSteeringPoliciesSteeringPolicyAnswer> answers() {
        return this.answers;
    }
    /**
     * @return The OCID of the compartment the resource belongs to.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The displayName of a resource.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return Search by health check monitor OCID. Will match any resource whose health check monitor ID matches the provided value.
     * 
     */
    public String healthCheckMonitorId() {
        return this.healthCheckMonitorId;
    }
    /**
     * @return The OCID of a resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The series of rules that will be processed in sequence to reduce the pool of answers to a response for any given request.
     * 
     */
    public List<GetSteeringPoliciesSteeringPolicyRule> rules() {
        return this.rules;
    }
    /**
     * @return The canonical absolute URL of the resource.
     * 
     */
    public String self() {
        return this.self;
    }
    /**
     * @return The state of a resource.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Search by steering template type. Will match any resource whose template type matches the provided value.
     * 
     */
    public String template() {
        return this.template;
    }
    /**
     * @return The date and time the resource was created, expressed in RFC 3339 timestamp format.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The Time To Live (TTL) for responses from the steering policy, in seconds. If not specified during creation, a value of 30 seconds will be used.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSteeringPoliciesSteeringPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSteeringPoliciesSteeringPolicyAnswer> answers;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String healthCheckMonitorId;
        private String id;
        private List<GetSteeringPoliciesSteeringPolicyRule> rules;
        private String self;
        private String state;
        private String template;
        private String timeCreated;
        private Integer ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSteeringPoliciesSteeringPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.answers = defaults.answers;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.healthCheckMonitorId = defaults.healthCheckMonitorId;
    	      this.id = defaults.id;
    	      this.rules = defaults.rules;
    	      this.self = defaults.self;
    	      this.state = defaults.state;
    	      this.template = defaults.template;
    	      this.timeCreated = defaults.timeCreated;
    	      this.ttl = defaults.ttl;
        }

        public Builder answers(List<GetSteeringPoliciesSteeringPolicyAnswer> answers) {
            this.answers = Objects.requireNonNull(answers);
            return this;
        }
        public Builder answers(GetSteeringPoliciesSteeringPolicyAnswer... answers) {
            return answers(List.of(answers));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder healthCheckMonitorId(String healthCheckMonitorId) {
            this.healthCheckMonitorId = Objects.requireNonNull(healthCheckMonitorId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder rules(List<GetSteeringPoliciesSteeringPolicyRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetSteeringPoliciesSteeringPolicyRule... rules) {
            return rules(List.of(rules));
        }
        public Builder self(String self) {
            this.self = Objects.requireNonNull(self);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder template(String template) {
            this.template = Objects.requireNonNull(template);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder ttl(Integer ttl) {
            this.ttl = Objects.requireNonNull(ttl);
            return this;
        }        public GetSteeringPoliciesSteeringPolicy build() {
            return new GetSteeringPoliciesSteeringPolicy(answers, compartmentId, definedTags, displayName, freeformTags, healthCheckMonitorId, id, rules, self, state, template, timeCreated, ttl);
        }
    }
}
