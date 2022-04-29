// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Identity.outputs.GetAllowedDomainLicenseTypesAllowedDomainLicenseType;
import com.pulumi.oci.Identity.outputs.GetAllowedDomainLicenseTypesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAllowedDomainLicenseTypesResult {
    /**
     * @return The list of allowed_domain_license_types.
     * 
     */
    private final List<GetAllowedDomainLicenseTypesAllowedDomainLicenseType> allowedDomainLicenseTypes;
    private final @Nullable String currentLicenseTypeName;
    private final @Nullable List<GetAllowedDomainLicenseTypesFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetAllowedDomainLicenseTypesResult(
        @CustomType.Parameter("allowedDomainLicenseTypes") List<GetAllowedDomainLicenseTypesAllowedDomainLicenseType> allowedDomainLicenseTypes,
        @CustomType.Parameter("currentLicenseTypeName") @Nullable String currentLicenseTypeName,
        @CustomType.Parameter("filters") @Nullable List<GetAllowedDomainLicenseTypesFilter> filters,
        @CustomType.Parameter("id") String id) {
        this.allowedDomainLicenseTypes = allowedDomainLicenseTypes;
        this.currentLicenseTypeName = currentLicenseTypeName;
        this.filters = filters;
        this.id = id;
    }

    /**
     * @return The list of allowed_domain_license_types.
     * 
     */
    public List<GetAllowedDomainLicenseTypesAllowedDomainLicenseType> allowedDomainLicenseTypes() {
        return this.allowedDomainLicenseTypes;
    }
    public Optional<String> currentLicenseTypeName() {
        return Optional.ofNullable(this.currentLicenseTypeName);
    }
    public List<GetAllowedDomainLicenseTypesFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAllowedDomainLicenseTypesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAllowedDomainLicenseTypesAllowedDomainLicenseType> allowedDomainLicenseTypes;
        private @Nullable String currentLicenseTypeName;
        private @Nullable List<GetAllowedDomainLicenseTypesFilter> filters;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAllowedDomainLicenseTypesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDomainLicenseTypes = defaults.allowedDomainLicenseTypes;
    	      this.currentLicenseTypeName = defaults.currentLicenseTypeName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
        }

        public Builder allowedDomainLicenseTypes(List<GetAllowedDomainLicenseTypesAllowedDomainLicenseType> allowedDomainLicenseTypes) {
            this.allowedDomainLicenseTypes = Objects.requireNonNull(allowedDomainLicenseTypes);
            return this;
        }
        public Builder allowedDomainLicenseTypes(GetAllowedDomainLicenseTypesAllowedDomainLicenseType... allowedDomainLicenseTypes) {
            return allowedDomainLicenseTypes(List.of(allowedDomainLicenseTypes));
        }
        public Builder currentLicenseTypeName(@Nullable String currentLicenseTypeName) {
            this.currentLicenseTypeName = currentLicenseTypeName;
            return this;
        }
        public Builder filters(@Nullable List<GetAllowedDomainLicenseTypesFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAllowedDomainLicenseTypesFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetAllowedDomainLicenseTypesResult build() {
            return new GetAllowedDomainLicenseTypesResult(allowedDomainLicenseTypes, currentLicenseTypeName, filters, id);
        }
    }
}
