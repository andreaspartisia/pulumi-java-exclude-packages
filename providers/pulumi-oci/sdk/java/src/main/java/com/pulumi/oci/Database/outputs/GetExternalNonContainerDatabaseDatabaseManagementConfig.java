// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExternalNonContainerDatabaseDatabaseManagementConfig {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
     * 
     */
    private final String databaseManagementConnectionId;
    /**
     * @return The status of the Database Management service.
     * 
     */
    private final String databaseManagementStatus;
    /**
     * @return The Oracle license model that applies to the external database.
     * 
     */
    private final String licenseModel;

    @CustomType.Constructor
    private GetExternalNonContainerDatabaseDatabaseManagementConfig(
        @CustomType.Parameter("databaseManagementConnectionId") String databaseManagementConnectionId,
        @CustomType.Parameter("databaseManagementStatus") String databaseManagementStatus,
        @CustomType.Parameter("licenseModel") String licenseModel) {
        this.databaseManagementConnectionId = databaseManagementConnectionId;
        this.databaseManagementStatus = databaseManagementStatus;
        this.licenseModel = licenseModel;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the [external database connector](https://docs.cloud.oracle.com/iaas/api/#/en/database/latest/datatypes/CreateExternalDatabaseConnectorDetails).
     * 
     */
    public String databaseManagementConnectionId() {
        return this.databaseManagementConnectionId;
    }
    /**
     * @return The status of the Database Management service.
     * 
     */
    public String databaseManagementStatus() {
        return this.databaseManagementStatus;
    }
    /**
     * @return The Oracle license model that applies to the external database.
     * 
     */
    public String licenseModel() {
        return this.licenseModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExternalNonContainerDatabaseDatabaseManagementConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseManagementConnectionId;
        private String databaseManagementStatus;
        private String licenseModel;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExternalNonContainerDatabaseDatabaseManagementConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseManagementConnectionId = defaults.databaseManagementConnectionId;
    	      this.databaseManagementStatus = defaults.databaseManagementStatus;
    	      this.licenseModel = defaults.licenseModel;
        }

        public Builder databaseManagementConnectionId(String databaseManagementConnectionId) {
            this.databaseManagementConnectionId = Objects.requireNonNull(databaseManagementConnectionId);
            return this;
        }
        public Builder databaseManagementStatus(String databaseManagementStatus) {
            this.databaseManagementStatus = Objects.requireNonNull(databaseManagementStatus);
            return this;
        }
        public Builder licenseModel(String licenseModel) {
            this.licenseModel = Objects.requireNonNull(licenseModel);
            return this;
        }        public GetExternalNonContainerDatabaseDatabaseManagementConfig build() {
            return new GetExternalNonContainerDatabaseDatabaseManagementConfig(databaseManagementConnectionId, databaseManagementStatus, licenseModel);
        }
    }
}
