// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ServiceCatalog.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ServiceCatalog.inputs.GetServiceCatalogsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceCatalogsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceCatalogsArgs Empty = new GetServiceCatalogsArgs();

    /**
     * The unique identifier for the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The unique identifier for the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Exact match name filter.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Exact match name filter.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetServiceCatalogsFilter> filters;

    public Optional<List<GetServiceCatalogsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The unique identifier for the service catalog.
     * 
     */
    @Import(name="serviceCatalogId")
    private @Nullable String serviceCatalogId;

    /**
     * @return The unique identifier for the service catalog.
     * 
     */
    public Optional<String> serviceCatalogId() {
        return Optional.ofNullable(this.serviceCatalogId);
    }

    private GetServiceCatalogsArgs() {}

    private GetServiceCatalogsArgs(GetServiceCatalogsArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.serviceCatalogId = $.serviceCatalogId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceCatalogsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceCatalogsArgs $;

        public Builder() {
            $ = new GetServiceCatalogsArgs();
        }

        public Builder(GetServiceCatalogsArgs defaults) {
            $ = new GetServiceCatalogsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName Exact match name filter.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetServiceCatalogsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetServiceCatalogsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param serviceCatalogId The unique identifier for the service catalog.
         * 
         * @return builder
         * 
         */
        public Builder serviceCatalogId(@Nullable String serviceCatalogId) {
            $.serviceCatalogId = serviceCatalogId;
            return this;
        }

        public GetServiceCatalogsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
