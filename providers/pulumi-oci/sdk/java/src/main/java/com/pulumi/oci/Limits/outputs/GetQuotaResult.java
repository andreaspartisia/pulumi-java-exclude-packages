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
public final class GetQuotaResult {
    /**
     * @return The OCID of the compartment containing the resource this quota applies to.
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
     * @return The name you assign to the quota during creation. The name must be unique across all quotas in the tenancy and cannot be changed.
     * 
     */
    private final String name;
    private final String quotaId;
    /**
     * @return The quota&#39;s current state.
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
    private GetQuotaResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("quotaId") String quotaId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("statements") List<String> statements,
        @CustomType.Parameter("timeCreated") String timeCreated) {
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.freeformTags = freeformTags;
        this.id = id;
        this.name = name;
        this.quotaId = quotaId;
        this.state = state;
        this.statements = statements;
        this.timeCreated = timeCreated;
    }

    /**
     * @return The OCID of the compartment containing the resource this quota applies to.
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
     * @return The name you assign to the quota during creation. The name must be unique across all quotas in the tenancy and cannot be changed.
     * 
     */
    public String name() {
        return this.name;
    }
    public String quotaId() {
        return this.quotaId;
    }
    /**
     * @return The quota&#39;s current state.
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

    public static Builder builder(GetQuotaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private Map<String,Object> freeformTags;
        private String id;
        private String name;
        private String quotaId;
        private String state;
        private List<String> statements;
        private String timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetQuotaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.quotaId = defaults.quotaId;
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
        public Builder quotaId(String quotaId) {
            this.quotaId = Objects.requireNonNull(quotaId);
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
        }        public GetQuotaResult build() {
            return new GetQuotaResult(compartmentId, definedTags, description, freeformTags, id, name, quotaId, state, statements, timeCreated);
        }
    }
}
