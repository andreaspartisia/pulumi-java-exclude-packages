// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ServiceCatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceCatalogArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceCatalogArgs Empty = new GetServiceCatalogArgs();

    /**
     * The unique identifier for the service catalog.
     * 
     */
    @Import(name="serviceCatalogId", required=true)
    private String serviceCatalogId;

    /**
     * @return The unique identifier for the service catalog.
     * 
     */
    public String serviceCatalogId() {
        return this.serviceCatalogId;
    }

    private GetServiceCatalogArgs() {}

    private GetServiceCatalogArgs(GetServiceCatalogArgs $) {
        this.serviceCatalogId = $.serviceCatalogId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceCatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceCatalogArgs $;

        public Builder() {
            $ = new GetServiceCatalogArgs();
        }

        public Builder(GetServiceCatalogArgs defaults) {
            $ = new GetServiceCatalogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceCatalogId The unique identifier for the service catalog.
         * 
         * @return builder
         * 
         */
        public Builder serviceCatalogId(String serviceCatalogId) {
            $.serviceCatalogId = serviceCatalogId;
            return this;
        }

        public GetServiceCatalogArgs build() {
            $.serviceCatalogId = Objects.requireNonNull($.serviceCatalogId, "expected parameter 'serviceCatalogId' to be non-null");
            return $;
        }
    }

}
