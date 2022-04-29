// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Identity.outputs.GetDomainsDomain;
import com.pulumi.oci.Identity.outputs.GetDomainsFilter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainsResult {
    /**
     * @return The OCID of the compartment containing the domain.
     * 
     */
    private final String compartmentId;
    /**
     * @return The mutable display name of the domain
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return The list of domains.
     * 
     */
    private final List<GetDomainsDomain> domains;
    private final @Nullable List<GetDomainsFilter> filters;
    /**
     * @return Region specific domain URL.
     * 
     */
    private final @Nullable String homeRegionUrl;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Indicates whether domain is hidden on login screen or not.
     * 
     */
    private final @Nullable Boolean isHiddenOnLogin;
    /**
     * @return The License type of Domain
     * 
     */
    private final @Nullable String licenseType;
    private final @Nullable String name;
    /**
     * @return The current state.
     * 
     */
    private final @Nullable String state;
    /**
     * @return The type of the domain.
     * 
     */
    private final @Nullable String type;
    /**
     * @return Region agnostic domain URL.
     * 
     */
    private final @Nullable String url;

    @CustomType.Constructor
    private GetDomainsResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("domains") List<GetDomainsDomain> domains,
        @CustomType.Parameter("filters") @Nullable List<GetDomainsFilter> filters,
        @CustomType.Parameter("homeRegionUrl") @Nullable String homeRegionUrl,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("isHiddenOnLogin") @Nullable Boolean isHiddenOnLogin,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("url") @Nullable String url) {
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.domains = domains;
        this.filters = filters;
        this.homeRegionUrl = homeRegionUrl;
        this.id = id;
        this.isHiddenOnLogin = isHiddenOnLogin;
        this.licenseType = licenseType;
        this.name = name;
        this.state = state;
        this.type = type;
        this.url = url;
    }

    /**
     * @return The OCID of the compartment containing the domain.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The mutable display name of the domain
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The list of domains.
     * 
     */
    public List<GetDomainsDomain> domains() {
        return this.domains;
    }
    public List<GetDomainsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Region specific domain URL.
     * 
     */
    public Optional<String> homeRegionUrl() {
        return Optional.ofNullable(this.homeRegionUrl);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Indicates whether domain is hidden on login screen or not.
     * 
     */
    public Optional<Boolean> isHiddenOnLogin() {
        return Optional.ofNullable(this.isHiddenOnLogin);
    }
    /**
     * @return The License type of Domain
     * 
     */
    public Optional<String> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The current state.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return The type of the domain.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Region agnostic domain URL.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private @Nullable String displayName;
        private List<GetDomainsDomain> domains;
        private @Nullable List<GetDomainsFilter> filters;
        private @Nullable String homeRegionUrl;
        private String id;
        private @Nullable Boolean isHiddenOnLogin;
        private @Nullable String licenseType;
        private @Nullable String name;
        private @Nullable String state;
        private @Nullable String type;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.displayName = defaults.displayName;
    	      this.domains = defaults.domains;
    	      this.filters = defaults.filters;
    	      this.homeRegionUrl = defaults.homeRegionUrl;
    	      this.id = defaults.id;
    	      this.isHiddenOnLogin = defaults.isHiddenOnLogin;
    	      this.licenseType = defaults.licenseType;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder domains(List<GetDomainsDomain> domains) {
            this.domains = Objects.requireNonNull(domains);
            return this;
        }
        public Builder domains(GetDomainsDomain... domains) {
            return domains(List.of(domains));
        }
        public Builder filters(@Nullable List<GetDomainsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetDomainsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder homeRegionUrl(@Nullable String homeRegionUrl) {
            this.homeRegionUrl = homeRegionUrl;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder isHiddenOnLogin(@Nullable Boolean isHiddenOnLogin) {
            this.isHiddenOnLogin = isHiddenOnLogin;
            return this;
        }
        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }        public GetDomainsResult build() {
            return new GetDomainsResult(compartmentId, displayName, domains, filters, homeRegionUrl, id, isHiddenOnLogin, licenseType, name, state, type, url);
        }
    }
}
