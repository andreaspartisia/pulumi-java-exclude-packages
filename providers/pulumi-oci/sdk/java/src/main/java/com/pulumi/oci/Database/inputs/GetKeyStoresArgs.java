// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetKeyStoresFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyStoresArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyStoresArgs Empty = new GetKeyStoresArgs();

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetKeyStoresFilter> filters;

    public Optional<List<GetKeyStoresFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetKeyStoresArgs() {}

    private GetKeyStoresArgs(GetKeyStoresArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyStoresArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyStoresArgs $;

        public Builder() {
            $ = new GetKeyStoresArgs();
        }

        public Builder(GetKeyStoresArgs defaults) {
            $ = new GetKeyStoresArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetKeyStoresFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetKeyStoresFilter... filters) {
            return filters(List.of(filters));
        }

        public GetKeyStoresArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
