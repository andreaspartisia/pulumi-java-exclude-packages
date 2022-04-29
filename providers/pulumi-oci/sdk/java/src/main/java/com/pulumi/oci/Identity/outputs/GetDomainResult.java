// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Identity.outputs.GetDomainReplicaRegion;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDomainResult {
    private final String adminEmail;
    private final String adminFirstName;
    private final String adminLastName;
    private final String adminUserName;
    /**
     * @return The OCID of the compartment containing the domain.
     * 
     */
    private final String compartmentId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The domain descripition
     * 
     */
    private final String description;
    /**
     * @return The mutable display name of the domain
     * 
     */
    private final String displayName;
    private final String domainId;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The home region for the domain. See [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm) for the full list of supported region names.  Example: `us-phoenix-1`
     * 
     */
    private final String homeRegion;
    /**
     * @return Region specific domain URL.
     * 
     */
    private final String homeRegionUrl;
    /**
     * @return The OCID of the domain
     * 
     */
    private final String id;
    /**
     * @return Indicates whether domain is hidden on login screen or not.
     * 
     */
    private final Boolean isHiddenOnLogin;
    private final Boolean isNotificationBypassed;
    private final Boolean isPrimaryEmailRequired;
    /**
     * @return The License type of Domain
     * 
     */
    private final String licenseType;
    /**
     * @return Any additional details about the current state of the Domain.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return The regions domain is replication to.
     * 
     */
    private final List<GetDomainReplicaRegion> replicaRegions;
    /**
     * @return The current state.
     * 
     */
    private final String state;
    /**
     * @return Date and time the domain was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    private final String timeCreated;
    /**
     * @return The type of the domain.
     * 
     */
    private final String type;
    /**
     * @return Region agnostic domain URL.
     * 
     */
    private final String url;

    @CustomType.Constructor
    private GetDomainResult(
        @CustomType.Parameter("adminEmail") String adminEmail,
        @CustomType.Parameter("adminFirstName") String adminFirstName,
        @CustomType.Parameter("adminLastName") String adminLastName,
        @CustomType.Parameter("adminUserName") String adminUserName,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("domainId") String domainId,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("homeRegion") String homeRegion,
        @CustomType.Parameter("homeRegionUrl") String homeRegionUrl,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isHiddenOnLogin") Boolean isHiddenOnLogin,
        @CustomType.Parameter("isNotificationBypassed") Boolean isNotificationBypassed,
        @CustomType.Parameter("isPrimaryEmailRequired") Boolean isPrimaryEmailRequired,
        @CustomType.Parameter("licenseType") String licenseType,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("replicaRegions") List<GetDomainReplicaRegion> replicaRegions,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("url") String url) {
        this.adminEmail = adminEmail;
        this.adminFirstName = adminFirstName;
        this.adminLastName = adminLastName;
        this.adminUserName = adminUserName;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.domainId = domainId;
        this.freeformTags = freeformTags;
        this.homeRegion = homeRegion;
        this.homeRegionUrl = homeRegionUrl;
        this.id = id;
        this.isHiddenOnLogin = isHiddenOnLogin;
        this.isNotificationBypassed = isNotificationBypassed;
        this.isPrimaryEmailRequired = isPrimaryEmailRequired;
        this.licenseType = licenseType;
        this.lifecycleDetails = lifecycleDetails;
        this.replicaRegions = replicaRegions;
        this.state = state;
        this.timeCreated = timeCreated;
        this.type = type;
        this.url = url;
    }

    public String adminEmail() {
        return this.adminEmail;
    }
    public String adminFirstName() {
        return this.adminFirstName;
    }
    public String adminLastName() {
        return this.adminLastName;
    }
    public String adminUserName() {
        return this.adminUserName;
    }
    /**
     * @return The OCID of the compartment containing the domain.
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
     * @return The domain descripition
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The mutable display name of the domain
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    public String domainId() {
        return this.domainId;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The home region for the domain. See [Regions and Availability Domains](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm) for the full list of supported region names.  Example: `us-phoenix-1`
     * 
     */
    public String homeRegion() {
        return this.homeRegion;
    }
    /**
     * @return Region specific domain URL.
     * 
     */
    public String homeRegionUrl() {
        return this.homeRegionUrl;
    }
    /**
     * @return The OCID of the domain
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether domain is hidden on login screen or not.
     * 
     */
    public Boolean isHiddenOnLogin() {
        return this.isHiddenOnLogin;
    }
    public Boolean isNotificationBypassed() {
        return this.isNotificationBypassed;
    }
    public Boolean isPrimaryEmailRequired() {
        return this.isPrimaryEmailRequired;
    }
    /**
     * @return The License type of Domain
     * 
     */
    public String licenseType() {
        return this.licenseType;
    }
    /**
     * @return Any additional details about the current state of the Domain.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return The regions domain is replication to.
     * 
     */
    public List<GetDomainReplicaRegion> replicaRegions() {
        return this.replicaRegions;
    }
    /**
     * @return The current state.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return Date and time the domain was created, in the format defined by RFC3339.  Example: `2016-08-25T21:10:29.600Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The type of the domain.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Region agnostic domain URL.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String adminEmail;
        private String adminFirstName;
        private String adminLastName;
        private String adminUserName;
        private String compartmentId;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private String domainId;
        private Map<String,Object> freeformTags;
        private String homeRegion;
        private String homeRegionUrl;
        private String id;
        private Boolean isHiddenOnLogin;
        private Boolean isNotificationBypassed;
        private Boolean isPrimaryEmailRequired;
        private String licenseType;
        private String lifecycleDetails;
        private List<GetDomainReplicaRegion> replicaRegions;
        private String state;
        private String timeCreated;
        private String type;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminEmail = defaults.adminEmail;
    	      this.adminFirstName = defaults.adminFirstName;
    	      this.adminLastName = defaults.adminLastName;
    	      this.adminUserName = defaults.adminUserName;
    	      this.compartmentId = defaults.compartmentId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.domainId = defaults.domainId;
    	      this.freeformTags = defaults.freeformTags;
    	      this.homeRegion = defaults.homeRegion;
    	      this.homeRegionUrl = defaults.homeRegionUrl;
    	      this.id = defaults.id;
    	      this.isHiddenOnLogin = defaults.isHiddenOnLogin;
    	      this.isNotificationBypassed = defaults.isNotificationBypassed;
    	      this.isPrimaryEmailRequired = defaults.isPrimaryEmailRequired;
    	      this.licenseType = defaults.licenseType;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.replicaRegions = defaults.replicaRegions;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder adminEmail(String adminEmail) {
            this.adminEmail = Objects.requireNonNull(adminEmail);
            return this;
        }
        public Builder adminFirstName(String adminFirstName) {
            this.adminFirstName = Objects.requireNonNull(adminFirstName);
            return this;
        }
        public Builder adminLastName(String adminLastName) {
            this.adminLastName = Objects.requireNonNull(adminLastName);
            return this;
        }
        public Builder adminUserName(String adminUserName) {
            this.adminUserName = Objects.requireNonNull(adminUserName);
            return this;
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
        public Builder domainId(String domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder homeRegion(String homeRegion) {
            this.homeRegion = Objects.requireNonNull(homeRegion);
            return this;
        }
        public Builder homeRegionUrl(String homeRegionUrl) {
            this.homeRegionUrl = Objects.requireNonNull(homeRegionUrl);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isHiddenOnLogin(Boolean isHiddenOnLogin) {
            this.isHiddenOnLogin = Objects.requireNonNull(isHiddenOnLogin);
            return this;
        }
        public Builder isNotificationBypassed(Boolean isNotificationBypassed) {
            this.isNotificationBypassed = Objects.requireNonNull(isNotificationBypassed);
            return this;
        }
        public Builder isPrimaryEmailRequired(Boolean isPrimaryEmailRequired) {
            this.isPrimaryEmailRequired = Objects.requireNonNull(isPrimaryEmailRequired);
            return this;
        }
        public Builder licenseType(String licenseType) {
            this.licenseType = Objects.requireNonNull(licenseType);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder replicaRegions(List<GetDomainReplicaRegion> replicaRegions) {
            this.replicaRegions = Objects.requireNonNull(replicaRegions);
            return this;
        }
        public Builder replicaRegions(GetDomainReplicaRegion... replicaRegions) {
            return replicaRegions(List.of(replicaRegions));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public GetDomainResult build() {
            return new GetDomainResult(adminEmail, adminFirstName, adminLastName, adminUserName, compartmentId, definedTags, description, displayName, domainId, freeformTags, homeRegion, homeRegionUrl, id, isHiddenOnLogin, isNotificationBypassed, isPrimaryEmailRequired, licenseType, lifecycleDetails, replicaRegions, state, timeCreated, type, url);
        }
    }
}
