// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetDbSystemPatchesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbSystemPatchesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbSystemPatchesArgs Empty = new GetDbSystemPatchesArgs();

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="dbSystemId", required=true)
    private String dbSystemId;

    /**
     * @return The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String dbSystemId() {
        return this.dbSystemId;
    }

    @Import(name="filters")
    private @Nullable List<GetDbSystemPatchesFilter> filters;

    public Optional<List<GetDbSystemPatchesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetDbSystemPatchesArgs() {}

    private GetDbSystemPatchesArgs(GetDbSystemPatchesArgs $) {
        this.dbSystemId = $.dbSystemId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbSystemPatchesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbSystemPatchesArgs $;

        public Builder() {
            $ = new GetDbSystemPatchesArgs();
        }

        public Builder(GetDbSystemPatchesArgs defaults) {
            $ = new GetDbSystemPatchesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbSystemId The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(String dbSystemId) {
            $.dbSystemId = dbSystemId;
            return this;
        }

        public Builder filters(@Nullable List<GetDbSystemPatchesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDbSystemPatchesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetDbSystemPatchesArgs build() {
            $.dbSystemId = Objects.requireNonNull($.dbSystemId, "expected parameter 'dbSystemId' to be non-null");
            return $;
        }
    }

}
