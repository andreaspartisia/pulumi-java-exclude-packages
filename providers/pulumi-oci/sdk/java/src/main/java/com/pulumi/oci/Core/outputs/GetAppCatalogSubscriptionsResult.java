// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Core.outputs.GetAppCatalogSubscriptionsAppCatalogSubscription;
import com.pulumi.oci.Core.outputs.GetAppCatalogSubscriptionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppCatalogSubscriptionsResult {
    /**
     * @return The list of app_catalog_subscriptions.
     * 
     */
    private final List<GetAppCatalogSubscriptionsAppCatalogSubscription> appCatalogSubscriptions;
    /**
     * @return The compartmentID of the subscription.
     * 
     */
    private final String compartmentId;
    private final @Nullable List<GetAppCatalogSubscriptionsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The ocid of the listing resource.
     * 
     */
    private final @Nullable String listingId;

    @CustomType.Constructor
    private GetAppCatalogSubscriptionsResult(
        @CustomType.Parameter("appCatalogSubscriptions") List<GetAppCatalogSubscriptionsAppCatalogSubscription> appCatalogSubscriptions,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("filters") @Nullable List<GetAppCatalogSubscriptionsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("listingId") @Nullable String listingId) {
        this.appCatalogSubscriptions = appCatalogSubscriptions;
        this.compartmentId = compartmentId;
        this.filters = filters;
        this.id = id;
        this.listingId = listingId;
    }

    /**
     * @return The list of app_catalog_subscriptions.
     * 
     */
    public List<GetAppCatalogSubscriptionsAppCatalogSubscription> appCatalogSubscriptions() {
        return this.appCatalogSubscriptions;
    }
    /**
     * @return The compartmentID of the subscription.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public List<GetAppCatalogSubscriptionsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ocid of the listing resource.
     * 
     */
    public Optional<String> listingId() {
        return Optional.ofNullable(this.listingId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppCatalogSubscriptionsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetAppCatalogSubscriptionsAppCatalogSubscription> appCatalogSubscriptions;
        private String compartmentId;
        private @Nullable List<GetAppCatalogSubscriptionsFilter> filters;
        private String id;
        private @Nullable String listingId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppCatalogSubscriptionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appCatalogSubscriptions = defaults.appCatalogSubscriptions;
    	      this.compartmentId = defaults.compartmentId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.listingId = defaults.listingId;
        }

        public Builder appCatalogSubscriptions(List<GetAppCatalogSubscriptionsAppCatalogSubscription> appCatalogSubscriptions) {
            this.appCatalogSubscriptions = Objects.requireNonNull(appCatalogSubscriptions);
            return this;
        }
        public Builder appCatalogSubscriptions(GetAppCatalogSubscriptionsAppCatalogSubscription... appCatalogSubscriptions) {
            return appCatalogSubscriptions(List.of(appCatalogSubscriptions));
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder filters(@Nullable List<GetAppCatalogSubscriptionsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetAppCatalogSubscriptionsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder listingId(@Nullable String listingId) {
            this.listingId = listingId;
            return this;
        }        public GetAppCatalogSubscriptionsResult build() {
            return new GetAppCatalogSubscriptionsResult(appCatalogSubscriptions, compartmentId, filters, id, listingId);
        }
    }
}
