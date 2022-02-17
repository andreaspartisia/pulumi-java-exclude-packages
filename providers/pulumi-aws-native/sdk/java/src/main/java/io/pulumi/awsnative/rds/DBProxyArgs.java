// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.rds;

import io.pulumi.awsnative.rds.enums.DBProxyEngineFamily;
import io.pulumi.awsnative.rds.inputs.DBProxyAuthFormatArgs;
import io.pulumi.awsnative.rds.inputs.DBProxyTagFormatArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DBProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DBProxyArgs Empty = new DBProxyArgs();

    /**
     * The authorization mechanism that the proxy uses.
     * 
     */
    @InputImport(name="auth", required=true)
    private final Input<List<DBProxyAuthFormatArgs>> auth;

    public Input<List<DBProxyAuthFormatArgs>> getAuth() {
        return this.auth;
    }

    /**
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region.
     * 
     */
    @InputImport(name="dBProxyName")
    private final @Nullable Input<String> dBProxyName;

    public Input<String> getDBProxyName() {
        return this.dBProxyName == null ? Input.empty() : this.dBProxyName;
    }

    /**
     * Whether the proxy includes detailed information about SQL statements in its logs.
     * 
     */
    @InputImport(name="debugLogging")
    private final @Nullable Input<Boolean> debugLogging;

    public Input<Boolean> getDebugLogging() {
        return this.debugLogging == null ? Input.empty() : this.debugLogging;
    }

    /**
     * The kinds of databases that the proxy can connect to.
     * 
     */
    @InputImport(name="engineFamily", required=true)
    private final Input<DBProxyEngineFamily> engineFamily;

    public Input<DBProxyEngineFamily> getEngineFamily() {
        return this.engineFamily;
    }

    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it.
     * 
     */
    @InputImport(name="idleClientTimeout")
    private final @Nullable Input<Integer> idleClientTimeout;

    public Input<Integer> getIdleClientTimeout() {
        return this.idleClientTimeout == null ? Input.empty() : this.idleClientTimeout;
    }

    /**
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * 
     */
    @InputImport(name="requireTLS")
    private final @Nullable Input<Boolean> requireTLS;

    public Input<Boolean> getRequireTLS() {
        return this.requireTLS == null ? Input.empty() : this.requireTLS;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<DBProxyTagFormatArgs>> tags;

    public Input<List<DBProxyTagFormatArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * VPC security group IDs to associate with the new proxy.
     * 
     */
    @InputImport(name="vpcSecurityGroupIds")
    private final @Nullable Input<List<String>> vpcSecurityGroupIds;

    public Input<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Input.empty() : this.vpcSecurityGroupIds;
    }

    /**
     * VPC subnet IDs to associate with the new proxy.
     * 
     */
    @InputImport(name="vpcSubnetIds", required=true)
    private final Input<List<String>> vpcSubnetIds;

    public Input<List<String>> getVpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    public DBProxyArgs(
        Input<List<DBProxyAuthFormatArgs>> auth,
        @Nullable Input<String> dBProxyName,
        @Nullable Input<Boolean> debugLogging,
        Input<DBProxyEngineFamily> engineFamily,
        @Nullable Input<Integer> idleClientTimeout,
        @Nullable Input<Boolean> requireTLS,
        Input<String> roleArn,
        @Nullable Input<List<DBProxyTagFormatArgs>> tags,
        @Nullable Input<List<String>> vpcSecurityGroupIds,
        Input<List<String>> vpcSubnetIds) {
        this.auth = Objects.requireNonNull(auth, "expected parameter 'auth' to be non-null");
        this.dBProxyName = dBProxyName;
        this.debugLogging = debugLogging;
        this.engineFamily = Objects.requireNonNull(engineFamily, "expected parameter 'engineFamily' to be non-null");
        this.idleClientTimeout = idleClientTimeout;
        this.requireTLS = requireTLS;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.vpcSubnetIds = Objects.requireNonNull(vpcSubnetIds, "expected parameter 'vpcSubnetIds' to be non-null");
    }

    private DBProxyArgs() {
        this.auth = Input.empty();
        this.dBProxyName = Input.empty();
        this.debugLogging = Input.empty();
        this.engineFamily = Input.empty();
        this.idleClientTimeout = Input.empty();
        this.requireTLS = Input.empty();
        this.roleArn = Input.empty();
        this.tags = Input.empty();
        this.vpcSecurityGroupIds = Input.empty();
        this.vpcSubnetIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DBProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<DBProxyAuthFormatArgs>> auth;
        private @Nullable Input<String> dBProxyName;
        private @Nullable Input<Boolean> debugLogging;
        private Input<DBProxyEngineFamily> engineFamily;
        private @Nullable Input<Integer> idleClientTimeout;
        private @Nullable Input<Boolean> requireTLS;
        private Input<String> roleArn;
        private @Nullable Input<List<DBProxyTagFormatArgs>> tags;
        private @Nullable Input<List<String>> vpcSecurityGroupIds;
        private Input<List<String>> vpcSubnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DBProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.dBProxyName = defaults.dBProxyName;
    	      this.debugLogging = defaults.debugLogging;
    	      this.engineFamily = defaults.engineFamily;
    	      this.idleClientTimeout = defaults.idleClientTimeout;
    	      this.requireTLS = defaults.requireTLS;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.vpcSubnetIds = defaults.vpcSubnetIds;
        }

        public Builder setAuth(Input<List<DBProxyAuthFormatArgs>> auth) {
            this.auth = Objects.requireNonNull(auth);
            return this;
        }

        public Builder setAuth(List<DBProxyAuthFormatArgs> auth) {
            this.auth = Input.of(Objects.requireNonNull(auth));
            return this;
        }

        public Builder setDBProxyName(@Nullable Input<String> dBProxyName) {
            this.dBProxyName = dBProxyName;
            return this;
        }

        public Builder setDBProxyName(@Nullable String dBProxyName) {
            this.dBProxyName = Input.ofNullable(dBProxyName);
            return this;
        }

        public Builder setDebugLogging(@Nullable Input<Boolean> debugLogging) {
            this.debugLogging = debugLogging;
            return this;
        }

        public Builder setDebugLogging(@Nullable Boolean debugLogging) {
            this.debugLogging = Input.ofNullable(debugLogging);
            return this;
        }

        public Builder setEngineFamily(Input<DBProxyEngineFamily> engineFamily) {
            this.engineFamily = Objects.requireNonNull(engineFamily);
            return this;
        }

        public Builder setEngineFamily(DBProxyEngineFamily engineFamily) {
            this.engineFamily = Input.of(Objects.requireNonNull(engineFamily));
            return this;
        }

        public Builder setIdleClientTimeout(@Nullable Input<Integer> idleClientTimeout) {
            this.idleClientTimeout = idleClientTimeout;
            return this;
        }

        public Builder setIdleClientTimeout(@Nullable Integer idleClientTimeout) {
            this.idleClientTimeout = Input.ofNullable(idleClientTimeout);
            return this;
        }

        public Builder setRequireTLS(@Nullable Input<Boolean> requireTLS) {
            this.requireTLS = requireTLS;
            return this;
        }

        public Builder setRequireTLS(@Nullable Boolean requireTLS) {
            this.requireTLS = Input.ofNullable(requireTLS);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTags(@Nullable Input<List<DBProxyTagFormatArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DBProxyTagFormatArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVpcSecurityGroupIds(@Nullable Input<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        public Builder setVpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Input.ofNullable(vpcSecurityGroupIds);
            return this;
        }

        public Builder setVpcSubnetIds(Input<List<String>> vpcSubnetIds) {
            this.vpcSubnetIds = Objects.requireNonNull(vpcSubnetIds);
            return this;
        }

        public Builder setVpcSubnetIds(List<String> vpcSubnetIds) {
            this.vpcSubnetIds = Input.of(Objects.requireNonNull(vpcSubnetIds));
            return this;
        }

        public DBProxyArgs build() {
            return new DBProxyArgs(auth, dBProxyName, debugLogging, engineFamily, idleClientTimeout, requireTLS, roleArn, tags, vpcSecurityGroupIds, vpcSubnetIds);
        }
    }
}