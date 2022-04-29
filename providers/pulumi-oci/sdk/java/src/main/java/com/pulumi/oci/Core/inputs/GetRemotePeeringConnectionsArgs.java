// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetRemotePeeringConnectionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRemotePeeringConnectionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRemotePeeringConnectionsArgs Empty = new GetRemotePeeringConnectionsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     * 
     */
    @Import(name="drgId")
    private @Nullable String drgId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     * 
     */
    public Optional<String> drgId() {
        return Optional.ofNullable(this.drgId);
    }

    @Import(name="filters")
    private @Nullable List<GetRemotePeeringConnectionsFilter> filters;

    public Optional<List<GetRemotePeeringConnectionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetRemotePeeringConnectionsArgs() {}

    private GetRemotePeeringConnectionsArgs(GetRemotePeeringConnectionsArgs $) {
        this.compartmentId = $.compartmentId;
        this.drgId = $.drgId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRemotePeeringConnectionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRemotePeeringConnectionsArgs $;

        public Builder() {
            $ = new GetRemotePeeringConnectionsArgs();
        }

        public Builder(GetRemotePeeringConnectionsArgs defaults) {
            $ = new GetRemotePeeringConnectionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param drgId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
         * 
         * @return builder
         * 
         */
        public Builder drgId(@Nullable String drgId) {
            $.drgId = drgId;
            return this;
        }

        public Builder filters(@Nullable List<GetRemotePeeringConnectionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetRemotePeeringConnectionsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetRemotePeeringConnectionsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
