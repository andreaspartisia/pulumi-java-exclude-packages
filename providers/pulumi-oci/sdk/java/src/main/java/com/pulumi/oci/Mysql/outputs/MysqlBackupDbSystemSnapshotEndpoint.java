// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Mysql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MysqlBackupDbSystemSnapshotEndpoint {
    /**
     * @return The network address of the DB System.
     * 
     */
    private final @Nullable String hostname;
    /**
     * @return The IP address the DB System is configured to listen on. A private IP address of the primary endpoint of the DB System. Must be an available IP address within the subnet&#39;s CIDR. This will be a &#34;dotted-quad&#34; style IPv4 address.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * @return The access modes from the client that this endpoint supports.
     * 
     */
    private final @Nullable List<String> modes;
    /**
     * @return The port for primary endpoint of the DB System to listen on.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin equivalent of port.
     * 
     */
    private final @Nullable Integer portX;
    /**
     * @return The state of the endpoints, as far as it can seen from the DB System. There may be some inconsistency with the actual state of the MySQL service.
     * 
     */
    private final @Nullable String status;
    /**
     * @return Additional information about the current endpoint status.
     * 
     */
    private final @Nullable String statusDetails;

    @CustomType.Constructor
    private MysqlBackupDbSystemSnapshotEndpoint(
        @CustomType.Parameter("hostname") @Nullable String hostname,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("modes") @Nullable List<String> modes,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("portX") @Nullable Integer portX,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("statusDetails") @Nullable String statusDetails) {
        this.hostname = hostname;
        this.ipAddress = ipAddress;
        this.modes = modes;
        this.port = port;
        this.portX = portX;
        this.status = status;
        this.statusDetails = statusDetails;
    }

    /**
     * @return The network address of the DB System.
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }
    /**
     * @return The IP address the DB System is configured to listen on. A private IP address of the primary endpoint of the DB System. Must be an available IP address within the subnet&#39;s CIDR. This will be a &#34;dotted-quad&#34; style IPv4 address.
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * @return The access modes from the client that this endpoint supports.
     * 
     */
    public List<String> modes() {
        return this.modes == null ? List.of() : this.modes;
    }
    /**
     * @return The port for primary endpoint of the DB System to listen on.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The network port on which X Plugin listens for TCP/IP connections. This is the X Plugin equivalent of port.
     * 
     */
    public Optional<Integer> portX() {
        return Optional.ofNullable(this.portX);
    }
    /**
     * @return The state of the endpoints, as far as it can seen from the DB System. There may be some inconsistency with the actual state of the MySQL service.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Additional information about the current endpoint status.
     * 
     */
    public Optional<String> statusDetails() {
        return Optional.ofNullable(this.statusDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlBackupDbSystemSnapshotEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostname;
        private @Nullable String ipAddress;
        private @Nullable List<String> modes;
        private @Nullable Integer port;
        private @Nullable Integer portX;
        private @Nullable String status;
        private @Nullable String statusDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlBackupDbSystemSnapshotEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ipAddress = defaults.ipAddress;
    	      this.modes = defaults.modes;
    	      this.port = defaults.port;
    	      this.portX = defaults.portX;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
        }

        public Builder hostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder modes(@Nullable List<String> modes) {
            this.modes = modes;
            return this;
        }
        public Builder modes(String... modes) {
            return modes(List.of(modes));
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder portX(@Nullable Integer portX) {
            this.portX = portX;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder statusDetails(@Nullable String statusDetails) {
            this.statusDetails = statusDetails;
            return this;
        }        public MysqlBackupDbSystemSnapshotEndpoint build() {
            return new MysqlBackupDbSystemSnapshotEndpoint(hostname, ipAddress, modes, port, portX, status, statusDetails);
        }
    }
}
