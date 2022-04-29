// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAutonomousContainerDatabaseKeyHistoryEntry {
    /**
     * @return The id of the Autonomous Database [Vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts) service key management history entry.
     * 
     */
    private final String id;
    /**
     * @return The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     * 
     */
    private final String kmsKeyVersionId;
    /**
     * @return The date and time the kms key activated.
     * 
     */
    private final String timeActivated;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * 
     */
    private final String vaultId;

    @CustomType.Constructor
    private GetAutonomousContainerDatabaseKeyHistoryEntry(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kmsKeyVersionId") String kmsKeyVersionId,
        @CustomType.Parameter("timeActivated") String timeActivated,
        @CustomType.Parameter("vaultId") String vaultId) {
        this.id = id;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.timeActivated = timeActivated;
        this.vaultId = vaultId;
    }

    /**
     * @return The id of the Autonomous Database [Vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts) service key management history entry.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The OCID of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions. If none is specified, the current key version (latest) of the Key Id is used for the operation.
     * 
     */
    public String kmsKeyVersionId() {
        return this.kmsKeyVersionId;
    }
    /**
     * @return The date and time the kms key activated.
     * 
     */
    public String timeActivated() {
        return this.timeActivated;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.cloud.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * 
     */
    public String vaultId() {
        return this.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutonomousContainerDatabaseKeyHistoryEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String kmsKeyVersionId;
        private String timeActivated;
        private String vaultId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutonomousContainerDatabaseKeyHistoryEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.kmsKeyVersionId = defaults.kmsKeyVersionId;
    	      this.timeActivated = defaults.timeActivated;
    	      this.vaultId = defaults.vaultId;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = Objects.requireNonNull(kmsKeyVersionId);
            return this;
        }
        public Builder timeActivated(String timeActivated) {
            this.timeActivated = Objects.requireNonNull(timeActivated);
            return this;
        }
        public Builder vaultId(String vaultId) {
            this.vaultId = Objects.requireNonNull(vaultId);
            return this;
        }        public GetAutonomousContainerDatabaseKeyHistoryEntry build() {
            return new GetAutonomousContainerDatabaseKeyHistoryEntry(id, kmsKeyVersionId, timeActivated, vaultId);
        }
    }
}
