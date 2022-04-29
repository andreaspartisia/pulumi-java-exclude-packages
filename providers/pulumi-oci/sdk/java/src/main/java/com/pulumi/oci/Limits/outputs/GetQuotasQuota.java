// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Limits.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetQuotasQuota {
    /**
     * @return The OCID of the parent compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The description you assign to the quota.
     * 
     */
    private final String description;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the quota.
     * 
     */
    private final String id;
    /**
     * @return name
     * 
     */
    private final String name;
    /**
     * @return Filters returned quotas based on the given state.
     * 
     */
    private final String state;
    /**
     * @return An array of one or more quota statements written in the declarative quota statement language.
     * 
     */
    private final List<String> statements;
    /**
     * @return Date and time the quota was created, in the format defined by RFC 3339. Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    private final String timeCreated;

    @CustomType.Constructor
    private GetQuotasQuota(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("statements") List<String> statements,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.freeformTags = freeformTags;
        this.id = id;
        this.name = name;
        this.state = state;
        this.statements = statements;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The OCID of the parent compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The description you assign to the quota.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the quota.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Filters returned quotas based on the given state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return An array of one or more quota statements written in the declarative quota statement language.
     * 
     */
    public List<String> statements() {
        return this.statements;
    }
    /**
     * @return Date and time the quota was created, in the format defined by RFC 3339. Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetQuotasQuota defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private Map<String,Object> freeformTags;
        private String id;
        private String name;
        private String state;
        private List<String> statements;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuotasQuota defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.statements = defaults.statements;
    	      this.timeCreated = defaults.timeCreated;
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
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder statements(List<String> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public Builder statements(String... statements) {
            return statements(List.of(statements));
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }        public GetQuotasQuota build() {
            return new GetQuotasQuota(compartmentId, definedTags, description, freeformTags, id, name, state, statements, timeCreated);
        }
    }
}
