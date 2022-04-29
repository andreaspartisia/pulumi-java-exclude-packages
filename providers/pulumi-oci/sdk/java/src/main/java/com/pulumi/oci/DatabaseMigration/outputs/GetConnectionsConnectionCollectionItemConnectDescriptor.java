// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetConnectionsConnectionCollectionItemConnectDescriptor {
    /**
     * @return Connect string.
     * 
     */
    private final String connectString;
    /**
     * @return Database service name.
     * 
     */
    private final String databaseServiceName;
    /**
     * @return Name of the host the SSH key is valid for.
     * 
     */
    private final String host;
    /**
     * @return Port of the connect descriptor.
     * 
     */
    private final Integer port;

    @CustomType.Constructor
    private GetConnectionsConnectionCollectionItemConnectDescriptor(
        @CustomType.Parameter("connectString") String connectString,
        @CustomType.Parameter("databaseServiceName") String databaseServiceName,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") Integer port) {
        this.connectString = connectString;
        this.databaseServiceName = databaseServiceName;
        this.host = host;
        this.port = port;
    }

    /**
     * @return Connect string.
     * 
     */
    public String connectString() {
        return this.connectString;
    }
    /**
     * @return Database service name.
     * 
     */
    public String databaseServiceName() {
        return this.databaseServiceName;
    }
    /**
     * @return Name of the host the SSH key is valid for.
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Port of the connect descriptor.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionsConnectionCollectionItemConnectDescriptor defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectString;
        private String databaseServiceName;
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionsConnectionCollectionItemConnectDescriptor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectString = defaults.connectString;
    	      this.databaseServiceName = defaults.databaseServiceName;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder connectString(String connectString) {
            this.connectString = Objects.requireNonNull(connectString);
            return this;
        }
        public Builder databaseServiceName(String databaseServiceName) {
            this.databaseServiceName = Objects.requireNonNull(databaseServiceName);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public GetConnectionsConnectionCollectionItemConnectDescriptor build() {
            return new GetConnectionsConnectionCollectionItemConnectDescriptor(connectString, databaseServiceName, host, port);
        }
    }
}
