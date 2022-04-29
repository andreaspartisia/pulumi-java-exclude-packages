// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetDbNodesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDbNodesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDbNodesArgs Empty = new GetDbNodesArgs();

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exacc Db server.
     * 
     */
    @Import(name="dbServerId")
    private @Nullable String dbServerId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exacc Db server.
     * 
     */
    public Optional<String> dbServerId() {
        return Optional.ofNullable(this.dbServerId);
    }

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
     * 
     */
    @Import(name="dbSystemId")
    private @Nullable String dbSystemId;

    /**
     * @return The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
     * 
     */
    public Optional<String> dbSystemId() {
        return Optional.ofNullable(this.dbSystemId);
    }

    @Import(name="filters")
    private @Nullable List<GetDbNodesFilter> filters;

    public Optional<List<GetDbNodesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources that match the given lifecycle state exactly.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
     * 
     */
    @Import(name="vmClusterId")
    private @Nullable String vmClusterId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
     * 
     */
    public Optional<String> vmClusterId() {
        return Optional.ofNullable(this.vmClusterId);
    }

    private GetDbNodesArgs() {}

    private GetDbNodesArgs(GetDbNodesArgs $) {
        this.compartmentId = $.compartmentId;
        this.dbServerId = $.dbServerId;
        this.dbSystemId = $.dbSystemId;
        this.filters = $.filters;
        this.state = $.state;
        this.vmClusterId = $.vmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDbNodesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDbNodesArgs $;

        public Builder() {
            $ = new GetDbNodesArgs();
        }

        public Builder(GetDbNodesArgs defaults) {
            $ = new GetDbNodesArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param dbServerId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exacc Db server.
         * 
         * @return builder
         * 
         */
        public Builder dbServerId(@Nullable String dbServerId) {
            $.dbServerId = dbServerId;
            return this;
        }

        /**
         * @param dbSystemId The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(@Nullable String dbSystemId) {
            $.dbSystemId = dbSystemId;
            return this;
        }

        public Builder filters(@Nullable List<GetDbNodesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDbNodesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param state A filter to return only resources that match the given lifecycle state exactly.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param vmClusterId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM cluster.
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(@Nullable String vmClusterId) {
            $.vmClusterId = vmClusterId;
            return this;
        }

        public GetDbNodesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
