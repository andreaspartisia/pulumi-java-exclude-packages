// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Mysql.outputs.GetMysqlConfigurationsConfigurationVariables;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMysqlConfigurationsConfiguration {
    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return User-provided data about the Configuration.
     * 
     */
    private final String description;
    /**
     * @return A filter to return only the resource matching the given display name exactly.
     * 
     */
    private final String displayName;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the Configuration.
     * 
     */
    private final String id;
    /**
     * @return The OCID of the Configuration from which this Configuration is &#34;derived&#34;. This is entirely a metadata relationship. There is no relation between the values in this Configuration and its parent.
     * 
     */
    private final String parentConfigurationId;
    /**
     * @return The requested Shape name.
     * 
     */
    private final String shapeName;
    /**
     * @return Configuration Lifecycle State
     * 
     */
    private final String state;
    /**
     * @return The date and time the Configuration was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the Configuration was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * 
     */
    private final String timeUpdated;
    /**
     * @return The requested Configuration types.
     * 
     */
    private final String type;
    /**
     * @return User controllable service variables.
     * 
     */
    private final GetMysqlConfigurationsConfigurationVariables variables;

    @CustomType.Constructor
    private GetMysqlConfigurationsConfiguration(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("parentConfigurationId") String parentConfigurationId,
        @CustomType.Parameter("shapeName") String shapeName,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("variables") GetMysqlConfigurationsConfigurationVariables variables) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.parentConfigurationId = parentConfigurationId;
        this.shapeName = shapeName;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.type = type;
        this.variables = variables;
    }

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return User-provided data about the Configuration.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A filter to return only the resource matching the given display name exactly.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the Configuration.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The OCID of the Configuration from which this Configuration is &#34;derived&#34;. This is entirely a metadata relationship. There is no relation between the values in this Configuration and its parent.
     * 
     */
    public String parentConfigurationId() {
        return this.parentConfigurationId;
    }
    /**
     * @return The requested Shape name.
     * 
     */
    public String shapeName() {
        return this.shapeName;
    }
    /**
     * @return Configuration Lifecycle State
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the Configuration was created, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the Configuration was last updated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc3339).
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return The requested Configuration types.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return User controllable service variables.
     * 
     */
    public GetMysqlConfigurationsConfigurationVariables variables() {
        return this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMysqlConfigurationsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private String parentConfigurationId;
        private String shapeName;
        private String state;
        private String timeCreated;
        private String timeUpdated;
        private String type;
        private GetMysqlConfigurationsConfigurationVariables variables;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMysqlConfigurationsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.parentConfigurationId = defaults.parentConfigurationId;
    	      this.shapeName = defaults.shapeName;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.type = defaults.type;
    	      this.variables = defaults.variables;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
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
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder parentConfigurationId(String parentConfigurationId) {
            this.parentConfigurationId = Objects.requireNonNull(parentConfigurationId);
            return this;
        }
        public Builder shapeName(String shapeName) {
            this.shapeName = Objects.requireNonNull(shapeName);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder variables(GetMysqlConfigurationsConfigurationVariables variables) {
            this.variables = Objects.requireNonNull(variables);
            return this;
        }        public GetMysqlConfigurationsConfiguration build() {
            return new GetMysqlConfigurationsConfiguration(compartmentId, definedTags, description, displayName, freeformTags, id, parentConfigurationId, shapeName, state, timeCreated, timeUpdated, type, variables);
        }
    }
}
