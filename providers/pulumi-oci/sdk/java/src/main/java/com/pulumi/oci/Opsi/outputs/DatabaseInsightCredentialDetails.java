// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Opsi.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatabaseInsightCredentialDetails {
    /**
     * @return Credential source name that had been added in Management Agent wallet. This is supplied in the External Database Service.
     * 
     */
    private final @Nullable String credentialSourceName;
    /**
     * @return Credential type.
     * 
     */
    private final String credentialType;
    /**
     * @return The secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) mapping to the database credentials.
     * 
     */
    private final @Nullable String passwordSecretId;
    /**
     * @return database user role.
     * 
     */
    private final @Nullable String role;
    /**
     * @return database user name.
     * 
     */
    private final @Nullable String userName;

    @CustomType.Constructor
    private DatabaseInsightCredentialDetails(
        @CustomType.Parameter("credentialSourceName") @Nullable String credentialSourceName,
        @CustomType.Parameter("credentialType") String credentialType,
        @CustomType.Parameter("passwordSecretId") @Nullable String passwordSecretId,
        @CustomType.Parameter("role") @Nullable String role,
        @CustomType.Parameter("userName") @Nullable String userName) {
        this.credentialSourceName = credentialSourceName;
        this.credentialType = credentialType;
        this.passwordSecretId = passwordSecretId;
        this.role = role;
        this.userName = userName;
    }

    /**
     * @return Credential source name that had been added in Management Agent wallet. This is supplied in the External Database Service.
     * 
     */
    public Optional<String> credentialSourceName() {
        return Optional.ofNullable(this.credentialSourceName);
    }
    /**
     * @return Credential type.
     * 
     */
    public String credentialType() {
        return this.credentialType;
    }
    /**
     * @return The secret [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) mapping to the database credentials.
     * 
     */
    public Optional<String> passwordSecretId() {
        return Optional.ofNullable(this.passwordSecretId);
    }
    /**
     * @return database user role.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }
    /**
     * @return database user name.
     * 
     */
    public Optional<String> userName() {
        return Optional.ofNullable(this.userName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInsightCredentialDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String credentialSourceName;
        private String credentialType;
        private @Nullable String passwordSecretId;
        private @Nullable String role;
        private @Nullable String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInsightCredentialDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialSourceName = defaults.credentialSourceName;
    	      this.credentialType = defaults.credentialType;
    	      this.passwordSecretId = defaults.passwordSecretId;
    	      this.role = defaults.role;
    	      this.userName = defaults.userName;
        }

        public Builder credentialSourceName(@Nullable String credentialSourceName) {
            this.credentialSourceName = credentialSourceName;
            return this;
        }
        public Builder credentialType(String credentialType) {
            this.credentialType = Objects.requireNonNull(credentialType);
            return this;
        }
        public Builder passwordSecretId(@Nullable String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = userName;
            return this;
        }        public DatabaseInsightCredentialDetails build() {
            return new DatabaseInsightCredentialDetails(credentialSourceName, credentialType, passwordSecretId, role, userName);
        }
    }
}
