// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataCatalog.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCatalogArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCatalogArgs Empty = new GetCatalogArgs();

    /**
     * Unique catalog identifier.
     * 
     */
    @Import(name="catalogId", required=true)
    private String catalogId;

    /**
     * @return Unique catalog identifier.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }

    private GetCatalogArgs() {}

    private GetCatalogArgs(GetCatalogArgs $) {
        this.catalogId = $.catalogId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCatalogArgs $;

        public Builder() {
            $ = new GetCatalogArgs();
        }

        public Builder(GetCatalogArgs defaults) {
            $ = new GetCatalogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogId Unique catalog identifier.
         * 
         * @return builder
         * 
         */
        public Builder catalogId(String catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public GetCatalogArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            return $;
        }
    }

}
