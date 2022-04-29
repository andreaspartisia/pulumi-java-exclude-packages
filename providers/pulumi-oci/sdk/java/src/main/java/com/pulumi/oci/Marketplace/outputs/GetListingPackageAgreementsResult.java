// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Marketplace.outputs.GetListingPackageAgreementsAgreement;
import com.pulumi.oci.Marketplace.outputs.GetListingPackageAgreementsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetListingPackageAgreementsResult {
    /**
     * @return The list of agreements.
     * 
     */
    private final List<GetListingPackageAgreementsAgreement> agreements;
    /**
     * @return The unique identifier for the compartment.
     * 
     */
    private final @Nullable String compartmentId;
    private final @Nullable List<GetListingPackageAgreementsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String listingId;
    private final String packageVersion;

    @CustomType.Constructor
    private GetListingPackageAgreementsResult(
        @CustomType.Parameter("agreements") List<GetListingPackageAgreementsAgreement> agreements,
        @CustomType.Parameter("compartmentId") @Nullable String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetListingPackageAgreementsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("listingId") String listingId,
        @CustomType.Parameter("packageVersion") String packageVersion) {
        this.agreements = agreements;
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
        this.listingId = listingId;
        this.packageVersion = packageVersion;
    }

    /**
     * @return The list of agreements.
     * 
     */
    public List<GetListingPackageAgreementsAgreement> agreements() {
        return this.agreements;
    }
    /**
     * @return The unique identifier for the compartment.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }
    public List<GetListingPackageAgreementsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String listingId() {
        return this.listingId;
    }
    public String packageVersion() {
        return this.packageVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListingPackageAgreementsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetListingPackageAgreementsAgreement> agreements;
        private @Nullable String compartmentId;
        private @Nullable List<GetListingPackageAgreementsFilter> filters;
        private String id;
        private String listingId;
        private String packageVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListingPackageAgreementsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreements = defaults.agreements;
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.listingId = defaults.listingId;
    	      this.packageVersion = defaults.packageVersion;
        }

        public Builder agreements(List<GetListingPackageAgreementsAgreement> agreements) {
            this.agreements = Objects.requireNonNull(agreements);
            return this;
        }
        public Builder agreements(GetListingPackageAgreementsAgreement... agreements) {
            return agreements(List.of(agreements));
        }
        public Builder compartmentId(@Nullable String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }
        public Builder filters(@Nullable List<GetListingPackageAgreementsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetListingPackageAgreementsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder listingId(String listingId) {
            this.listingId = Objects.requireNonNull(listingId);
            return this;
        }
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = Objects.requireNonNull(packageVersion);
            return this;
        }        public GetListingPackageAgreementsResult build() {
            return new GetListingPackageAgreementsResult(agreements, compartmentId, filters, id, listingId, packageVersion);
        }
    }
}
