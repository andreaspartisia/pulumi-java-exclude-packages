// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information for connecting to PostgreSQL server
 * 
 */
public final class PostgreSqlConnectionInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final PostgreSqlConnectionInfoArgs Empty = new PostgreSqlConnectionInfoArgs();

    /**
     * Name of the database
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName == null ? Codegen.empty() : this.databaseName;
    }

    /**
     * Password credential.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> password() {
        return this.password == null ? Codegen.empty() : this.password;
    }

    /**
     * Port for Server
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Name of the server
     * 
     */
    @Import(name="serverName", required=true)
      private final Output<String> serverName;

    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * Type of connection info
     * Expected value is 'PostgreSqlConnectionInfo'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * User name
     * 
     */
    @Import(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> userName() {
        return this.userName == null ? Codegen.empty() : this.userName;
    }

    public PostgreSqlConnectionInfoArgs(
        @Nullable Output<String> databaseName,
        @Nullable Output<String> password,
        Output<Integer> port,
        Output<String> serverName,
        Output<String> type,
        @Nullable Output<String> userName) {
        this.databaseName = databaseName;
        this.password = password;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
        this.type = Codegen.stringProp("type").output().arg(type).require();
        this.userName = userName;
    }

    private PostgreSqlConnectionInfoArgs() {
        this.databaseName = Codegen.empty();
        this.password = Codegen.empty();
        this.port = Codegen.empty();
        this.serverName = Codegen.empty();
        this.type = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgreSqlConnectionInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> databaseName;
        private @Nullable Output<String> password;
        private Output<Integer> port;
        private Output<String> serverName;
        private Output<String> type;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgreSqlConnectionInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.serverName = defaults.serverName;
    	      this.type = defaults.type;
    	      this.userName = defaults.userName;
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Codegen.ofNullable(databaseName);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Codegen.ofNullable(password);
            return this;
        }
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }
        public Builder serverName(Output<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Output.of(Objects.requireNonNull(serverName));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }
        public Builder userName(@Nullable String userName) {
            this.userName = Codegen.ofNullable(userName);
            return this;
        }        public PostgreSqlConnectionInfoArgs build() {
            return new PostgreSqlConnectionInfoArgs(databaseName, password, port, serverName, type, userName);
        }
    }
}
