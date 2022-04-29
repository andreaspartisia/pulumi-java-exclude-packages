// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TargetDatabaseDatabaseDetails {
    /**
     * @return (Updatable) The OCID of the autonomous database registered as a target database in Data Safe.
     * 
     */
    private final @Nullable String autonomousDatabaseId;
    /**
     * @return (Updatable) The database type.
     * 
     */
    private final String databaseType;
    /**
     * @return (Updatable) The OCID of the cloud database system registered as a target database in Data Safe.
     * 
     */
    private final @Nullable String dbSystemId;
    /**
     * @return (Updatable) The infrastructure type the database is running on.
     * 
     */
    private final String infrastructureType;
    /**
     * @return (Updatable) The OCID of the compute instance on which the database is running.
     * 
     */
    private final @Nullable String instanceId;
    /**
     * @return (Updatable) The list of database host IP Addresses. Fully qualified domain names can be used if connectionType is &#39;ONPREM_CONNECTOR&#39;.
     * 
     */
    private final @Nullable List<String> ipAddresses;
    /**
     * @return (Updatable) The port number of the database listener.
     * 
     */
    private final @Nullable Integer listenerPort;
    /**
     * @return (Updatable) The service name of the database registered as target database.
     * 
     */
    private final @Nullable String serviceName;
    /**
     * @return (Updatable) The OCID of the VM cluster in which the database is running.
     * 
     */
    private final @Nullable String vmClusterId;

    @CustomType.Constructor
    private TargetDatabaseDatabaseDetails(
        @CustomType.Parameter("autonomousDatabaseId") @Nullable String autonomousDatabaseId,
        @CustomType.Parameter("databaseType") String databaseType,
        @CustomType.Parameter("dbSystemId") @Nullable String dbSystemId,
        @CustomType.Parameter("infrastructureType") String infrastructureType,
        @CustomType.Parameter("instanceId") @Nullable String instanceId,
        @CustomType.Parameter("ipAddresses") @Nullable List<String> ipAddresses,
        @CustomType.Parameter("listenerPort") @Nullable Integer listenerPort,
        @CustomType.Parameter("serviceName") @Nullable String serviceName,
        @CustomType.Parameter("vmClusterId") @Nullable String vmClusterId) {
        this.autonomousDatabaseId = autonomousDatabaseId;
        this.databaseType = databaseType;
        this.dbSystemId = dbSystemId;
        this.infrastructureType = infrastructureType;
        this.instanceId = instanceId;
        this.ipAddresses = ipAddresses;
        this.listenerPort = listenerPort;
        this.serviceName = serviceName;
        this.vmClusterId = vmClusterId;
    }

    /**
     * @return (Updatable) The OCID of the autonomous database registered as a target database in Data Safe.
     * 
     */
    public Optional<String> autonomousDatabaseId() {
        return Optional.ofNullable(this.autonomousDatabaseId);
    }
    /**
     * @return (Updatable) The database type.
     * 
     */
    public String databaseType() {
        return this.databaseType;
    }
    /**
     * @return (Updatable) The OCID of the cloud database system registered as a target database in Data Safe.
     * 
     */
    public Optional<String> dbSystemId() {
        return Optional.ofNullable(this.dbSystemId);
    }
    /**
     * @return (Updatable) The infrastructure type the database is running on.
     * 
     */
    public String infrastructureType() {
        return this.infrastructureType;
    }
    /**
     * @return (Updatable) The OCID of the compute instance on which the database is running.
     * 
     */
    public Optional<String> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }
    /**
     * @return (Updatable) The list of database host IP Addresses. Fully qualified domain names can be used if connectionType is &#39;ONPREM_CONNECTOR&#39;.
     * 
     */
    public List<String> ipAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }
    /**
     * @return (Updatable) The port number of the database listener.
     * 
     */
    public Optional<Integer> listenerPort() {
        return Optional.ofNullable(this.listenerPort);
    }
    /**
     * @return (Updatable) The service name of the database registered as target database.
     * 
     */
    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }
    /**
     * @return (Updatable) The OCID of the VM cluster in which the database is running.
     * 
     */
    public Optional<String> vmClusterId() {
        return Optional.ofNullable(this.vmClusterId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetDatabaseDatabaseDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autonomousDatabaseId;
        private String databaseType;
        private @Nullable String dbSystemId;
        private String infrastructureType;
        private @Nullable String instanceId;
        private @Nullable List<String> ipAddresses;
        private @Nullable Integer listenerPort;
        private @Nullable String serviceName;
        private @Nullable String vmClusterId;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetDatabaseDatabaseDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autonomousDatabaseId = defaults.autonomousDatabaseId;
    	      this.databaseType = defaults.databaseType;
    	      this.dbSystemId = defaults.dbSystemId;
    	      this.infrastructureType = defaults.infrastructureType;
    	      this.instanceId = defaults.instanceId;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.listenerPort = defaults.listenerPort;
    	      this.serviceName = defaults.serviceName;
    	      this.vmClusterId = defaults.vmClusterId;
        }

        public Builder autonomousDatabaseId(@Nullable String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            return this;
        }
        public Builder databaseType(String databaseType) {
            this.databaseType = Objects.requireNonNull(databaseType);
            return this;
        }
        public Builder dbSystemId(@Nullable String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }
        public Builder infrastructureType(String infrastructureType) {
            this.infrastructureType = Objects.requireNonNull(infrastructureType);
            return this;
        }
        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder listenerPort(@Nullable Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder vmClusterId(@Nullable String vmClusterId) {
            this.vmClusterId = vmClusterId;
            return this;
        }        public TargetDatabaseDatabaseDetails build() {
            return new TargetDatabaseDatabaseDetails(autonomousDatabaseId, databaseType, dbSystemId, infrastructureType, instanceId, ipAddresses, listenerPort, serviceName, vmClusterId);
        }
    }
}
