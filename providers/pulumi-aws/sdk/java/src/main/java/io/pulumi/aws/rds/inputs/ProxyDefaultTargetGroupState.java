// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.aws.rds.inputs.ProxyDefaultTargetGroupConnectionPoolConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyDefaultTargetGroupState extends io.pulumi.resources.ResourceArgs {

    public static final ProxyDefaultTargetGroupState Empty = new ProxyDefaultTargetGroupState();

    /**
     * The Amazon Resource Name (ARN) representing the target group.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The settings that determine the size and behavior of the connection pool for the target group.
     * 
     */
    @InputImport(name="connectionPoolConfig")
      private final @Nullable Input<ProxyDefaultTargetGroupConnectionPoolConfigGetArgs> connectionPoolConfig;

    public Input<ProxyDefaultTargetGroupConnectionPoolConfigGetArgs> getConnectionPoolConfig() {
        return this.connectionPoolConfig == null ? Input.empty() : this.connectionPoolConfig;
    }

    /**
     * Name of the RDS DB Proxy.
     * 
     */
    @InputImport(name="dbProxyName")
      private final @Nullable Input<String> dbProxyName;

    public Input<String> getDbProxyName() {
        return this.dbProxyName == null ? Input.empty() : this.dbProxyName;
    }

    /**
     * The name of the default target group.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ProxyDefaultTargetGroupState(
        @Nullable Input<String> arn,
        @Nullable Input<ProxyDefaultTargetGroupConnectionPoolConfigGetArgs> connectionPoolConfig,
        @Nullable Input<String> dbProxyName,
        @Nullable Input<String> name) {
        this.arn = arn;
        this.connectionPoolConfig = connectionPoolConfig;
        this.dbProxyName = dbProxyName;
        this.name = name;
    }

    private ProxyDefaultTargetGroupState() {
        this.arn = Input.empty();
        this.connectionPoolConfig = Input.empty();
        this.dbProxyName = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyDefaultTargetGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<ProxyDefaultTargetGroupConnectionPoolConfigGetArgs> connectionPoolConfig;
        private @Nullable Input<String> dbProxyName;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyDefaultTargetGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.connectionPoolConfig = defaults.connectionPoolConfig;
    	      this.dbProxyName = defaults.dbProxyName;
    	      this.name = defaults.name;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setConnectionPoolConfig(@Nullable Input<ProxyDefaultTargetGroupConnectionPoolConfigGetArgs> connectionPoolConfig) {
            this.connectionPoolConfig = connectionPoolConfig;
            return this;
        }

        public Builder setConnectionPoolConfig(@Nullable ProxyDefaultTargetGroupConnectionPoolConfigGetArgs connectionPoolConfig) {
            this.connectionPoolConfig = Input.ofNullable(connectionPoolConfig);
            return this;
        }

        public Builder setDbProxyName(@Nullable Input<String> dbProxyName) {
            this.dbProxyName = dbProxyName;
            return this;
        }

        public Builder setDbProxyName(@Nullable String dbProxyName) {
            this.dbProxyName = Input.ofNullable(dbProxyName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ProxyDefaultTargetGroupState build() {
            return new ProxyDefaultTargetGroupState(arn, connectionPoolConfig, dbProxyName, name);
        }
    }
}