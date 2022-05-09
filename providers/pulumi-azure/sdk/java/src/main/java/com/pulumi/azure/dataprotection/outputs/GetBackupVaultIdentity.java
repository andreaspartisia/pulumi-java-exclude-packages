// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.dataprotection.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBackupVaultIdentity {
    /**
     * @return The Principal ID of the System Assigned Managed Service Identity that is configured on this Backup Vault.
     * 
     */
    private final String principalId;
    /**
     * @return The Tenant ID of the System Assigned Managed Service Identity that is configured on this Backup Vault.
     * 
     */
    private final String tenantId;
    /**
     * @return The type of Managed Service Identity that is configured on this Backup Vault.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetBackupVaultIdentity(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return The Principal ID of the System Assigned Managed Service Identity that is configured on this Backup Vault.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The Tenant ID of the System Assigned Managed Service Identity that is configured on this Backup Vault.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The type of Managed Service Identity that is configured on this Backup Vault.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupVaultIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupVaultIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetBackupVaultIdentity build() {
            return new GetBackupVaultIdentity(principalId, tenantId, type);
        }
    }
}
