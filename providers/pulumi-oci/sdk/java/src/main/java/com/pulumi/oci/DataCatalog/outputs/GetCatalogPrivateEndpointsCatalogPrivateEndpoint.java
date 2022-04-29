// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCatalogPrivateEndpointsCatalogPrivateEndpoint {
    /**
     * @return The list of catalogs using the private reverse connection endpoint
     * 
     */
    private final List<String> attachedCatalogs;
    /**
     * @return The OCID of the compartment where you want to list resources.
     * 
     */
    private final String compartmentId;
    /**
     * @return Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    private final String displayName;
    /**
     * @return List of DNS zones to be used by the data assets to be harvested. Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
     * 
     */
    private final List<String> dnsZones;
    /**
     * @return Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return Unique identifier that is immutable
     * 
     */
    private final String id;
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in &#39;Failed&#39; state.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     * 
     */
    private final String state;
    /**
     * @return Subnet Identifier
     * 
     */
    private final String subnetId;
    /**
     * @return The time the private endpoint was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the private endpoint was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetCatalogPrivateEndpointsCatalogPrivateEndpoint(
        @CustomType.Parameter("attachedCatalogs") List<String> attachedCatalogs,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("dnsZones") List<String> dnsZones,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.attachedCatalogs = attachedCatalogs;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.dnsZones = dnsZones;
        this.freeformTags = freeformTags;
        this.id = id;
        this.lifecycleDetails = lifecycleDetails;
        this.state = state;
        this.subnetId = subnetId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return The list of catalogs using the private reverse connection endpoint
     * 
     */
    public List<String> attachedCatalogs() {
        return this.attachedCatalogs;
    }
    /**
     * @return The OCID of the compartment where you want to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: `{&#34;foo-namespace.bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A filter to return only resources that match the entire display name given. The match is not case sensitive.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return List of DNS zones to be used by the data assets to be harvested. Example: custpvtsubnet.oraclevcn.com for data asset: db.custpvtsubnet.oraclevcn.com
     * 
     */
    public List<String> dnsZones() {
        return this.dnsZones;
    }
    /**
     * @return Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only. Example: `{&#34;bar-key&#34;: &#34;value&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return Unique identifier that is immutable
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in &#39;Failed&#39; state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Subnet Identifier
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return The time the private endpoint was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the private endpoint was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCatalogPrivateEndpointsCatalogPrivateEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> attachedCatalogs;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String displayName;
        private List<String> dnsZones;
        private Map<String,Object> freeformTags;
        private String id;
        private String lifecycleDetails;
        private String state;
        private String subnetId;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCatalogPrivateEndpointsCatalogPrivateEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedCatalogs = defaults.attachedCatalogs;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.dnsZones = defaults.dnsZones;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder attachedCatalogs(List<String> attachedCatalogs) {
            this.attachedCatalogs = Objects.requireNonNull(attachedCatalogs);
            return this;
        }
        public Builder attachedCatalogs(String... attachedCatalogs) {
            return attachedCatalogs(List.of(attachedCatalogs));
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
        public Builder dnsZones(List<String> dnsZones) {
            this.dnsZones = Objects.requireNonNull(dnsZones);
            return this;
        }
        public Builder dnsZones(String... dnsZones) {
            return dnsZones(List.of(dnsZones));
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetCatalogPrivateEndpointsCatalogPrivateEndpoint build() {
            return new GetCatalogPrivateEndpointsCatalogPrivateEndpoint(attachedCatalogs, compartmentId, definedTags, displayName, dnsZones, freeformTags, id, lifecycleDetails, state, subnetId, timeCreated, timeUpdated);
        }
    }
}
