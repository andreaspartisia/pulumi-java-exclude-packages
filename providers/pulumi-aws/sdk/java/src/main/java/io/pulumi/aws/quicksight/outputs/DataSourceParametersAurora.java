// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceParametersAurora {
    /**
     * The database to which to connect.
     * 
     */
    private final String database;
    /**
     * The host to which to connect.
     * 
     */
    private final String host;
    /**
     * The port to which to connect.
     * 
     */
    private final Integer port;

    @OutputCustomType.Constructor
    private DataSourceParametersAurora(
        @OutputCustomType.Parameter("database") String database,
        @OutputCustomType.Parameter("host") String host,
        @OutputCustomType.Parameter("port") Integer port) {
        this.database = database;
        this.host = host;
        this.port = port;
    }

    /**
     * The database to which to connect.
     * 
    */
    public String getDatabase() {
        return this.database;
    }
    /**
     * The host to which to connect.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * The port to which to connect.
     * 
    */
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAurora defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAurora defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public DataSourceParametersAurora build() {
            return new DataSourceParametersAurora(database, host, port);
        }
    }
}