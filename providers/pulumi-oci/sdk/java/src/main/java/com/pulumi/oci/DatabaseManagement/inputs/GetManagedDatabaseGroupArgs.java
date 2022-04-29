// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseManagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetManagedDatabaseGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedDatabaseGroupArgs Empty = new GetManagedDatabaseGroupArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
     * 
     */
    @Import(name="managedDatabaseGroupId", required=true)
    private String managedDatabaseGroupId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
     * 
     */
    public String managedDatabaseGroupId() {
        return this.managedDatabaseGroupId;
    }

    private GetManagedDatabaseGroupArgs() {}

    private GetManagedDatabaseGroupArgs(GetManagedDatabaseGroupArgs $) {
        this.managedDatabaseGroupId = $.managedDatabaseGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedDatabaseGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedDatabaseGroupArgs $;

        public Builder() {
            $ = new GetManagedDatabaseGroupArgs();
        }

        public Builder(GetManagedDatabaseGroupArgs defaults) {
            $ = new GetManagedDatabaseGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedDatabaseGroupId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
         * 
         * @return builder
         * 
         */
        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            $.managedDatabaseGroupId = managedDatabaseGroupId;
            return this;
        }

        public GetManagedDatabaseGroupArgs build() {
            $.managedDatabaseGroupId = Objects.requireNonNull($.managedDatabaseGroupId, "expected parameter 'managedDatabaseGroupId' to be non-null");
            return $;
        }
    }

}
