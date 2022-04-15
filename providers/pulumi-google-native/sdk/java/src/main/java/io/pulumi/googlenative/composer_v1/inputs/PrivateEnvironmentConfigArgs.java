// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.composer_v1.inputs.PrivateClusterConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration information for configuring a Private IP Cloud Composer environment.
 * 
 */
public final class PrivateEnvironmentConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEnvironmentConfigArgs Empty = new PrivateEnvironmentConfigArgs();

    /**
     * Optional. The CIDR block from which IP range for Cloud Composer Network in tenant project will be reserved. Needs to be disjoint from private_cluster_config.master_ipv4_cidr_block and cloud_sql_ipv4_cidr_block. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    @Import(name="cloudComposerNetworkIpv4CidrBlock")
      private final @Nullable Output<String> cloudComposerNetworkIpv4CidrBlock;

    public Output<String> cloudComposerNetworkIpv4CidrBlock() {
        return this.cloudComposerNetworkIpv4CidrBlock == null ? Codegen.empty() : this.cloudComposerNetworkIpv4CidrBlock;
    }

    /**
     * Optional. The CIDR block from which IP range in tenant project will be reserved for Cloud SQL. Needs to be disjoint from `web_server_ipv4_cidr_block`.
     * 
     */
    @Import(name="cloudSqlIpv4CidrBlock")
      private final @Nullable Output<String> cloudSqlIpv4CidrBlock;

    public Output<String> cloudSqlIpv4CidrBlock() {
        return this.cloudSqlIpv4CidrBlock == null ? Codegen.empty() : this.cloudSqlIpv4CidrBlock;
    }

    /**
     * Optional. If `true`, a Private IP Cloud Composer environment is created. If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be set to true for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="enablePrivateEnvironment")
      private final @Nullable Output<Boolean> enablePrivateEnvironment;

    public Output<Boolean> enablePrivateEnvironment() {
        return this.enablePrivateEnvironment == null ? Codegen.empty() : this.enablePrivateEnvironment;
    }

    /**
     * Optional. Configuration for the private GKE cluster for a Private IP Cloud Composer environment.
     * 
     */
    @Import(name="privateClusterConfig")
      private final @Nullable Output<PrivateClusterConfigArgs> privateClusterConfig;

    public Output<PrivateClusterConfigArgs> privateClusterConfig() {
        return this.privateClusterConfig == null ? Codegen.empty() : this.privateClusterConfig;
    }

    /**
     * Optional. The CIDR block from which IP range for web server will be reserved. Needs to be disjoint from `private_cluster_config.master_ipv4_cidr_block` and `cloud_sql_ipv4_cidr_block`. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="webServerIpv4CidrBlock")
      private final @Nullable Output<String> webServerIpv4CidrBlock;

    public Output<String> webServerIpv4CidrBlock() {
        return this.webServerIpv4CidrBlock == null ? Codegen.empty() : this.webServerIpv4CidrBlock;
    }

    public PrivateEnvironmentConfigArgs(
        @Nullable Output<String> cloudComposerNetworkIpv4CidrBlock,
        @Nullable Output<String> cloudSqlIpv4CidrBlock,
        @Nullable Output<Boolean> enablePrivateEnvironment,
        @Nullable Output<PrivateClusterConfigArgs> privateClusterConfig,
        @Nullable Output<String> webServerIpv4CidrBlock) {
        this.cloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
        this.cloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
        this.enablePrivateEnvironment = enablePrivateEnvironment;
        this.privateClusterConfig = privateClusterConfig;
        this.webServerIpv4CidrBlock = webServerIpv4CidrBlock;
    }

    private PrivateEnvironmentConfigArgs() {
        this.cloudComposerNetworkIpv4CidrBlock = Codegen.empty();
        this.cloudSqlIpv4CidrBlock = Codegen.empty();
        this.enablePrivateEnvironment = Codegen.empty();
        this.privateClusterConfig = Codegen.empty();
        this.webServerIpv4CidrBlock = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEnvironmentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudComposerNetworkIpv4CidrBlock;
        private @Nullable Output<String> cloudSqlIpv4CidrBlock;
        private @Nullable Output<Boolean> enablePrivateEnvironment;
        private @Nullable Output<PrivateClusterConfigArgs> privateClusterConfig;
        private @Nullable Output<String> webServerIpv4CidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEnvironmentConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudComposerNetworkIpv4CidrBlock = defaults.cloudComposerNetworkIpv4CidrBlock;
    	      this.cloudSqlIpv4CidrBlock = defaults.cloudSqlIpv4CidrBlock;
    	      this.enablePrivateEnvironment = defaults.enablePrivateEnvironment;
    	      this.privateClusterConfig = defaults.privateClusterConfig;
    	      this.webServerIpv4CidrBlock = defaults.webServerIpv4CidrBlock;
        }

        public Builder cloudComposerNetworkIpv4CidrBlock(@Nullable Output<String> cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
            return this;
        }
        public Builder cloudComposerNetworkIpv4CidrBlock(@Nullable String cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = Codegen.ofNullable(cloudComposerNetworkIpv4CidrBlock);
            return this;
        }
        public Builder cloudSqlIpv4CidrBlock(@Nullable Output<String> cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
            return this;
        }
        public Builder cloudSqlIpv4CidrBlock(@Nullable String cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = Codegen.ofNullable(cloudSqlIpv4CidrBlock);
            return this;
        }
        public Builder enablePrivateEnvironment(@Nullable Output<Boolean> enablePrivateEnvironment) {
            this.enablePrivateEnvironment = enablePrivateEnvironment;
            return this;
        }
        public Builder enablePrivateEnvironment(@Nullable Boolean enablePrivateEnvironment) {
            this.enablePrivateEnvironment = Codegen.ofNullable(enablePrivateEnvironment);
            return this;
        }
        public Builder privateClusterConfig(@Nullable Output<PrivateClusterConfigArgs> privateClusterConfig) {
            this.privateClusterConfig = privateClusterConfig;
            return this;
        }
        public Builder privateClusterConfig(@Nullable PrivateClusterConfigArgs privateClusterConfig) {
            this.privateClusterConfig = Codegen.ofNullable(privateClusterConfig);
            return this;
        }
        public Builder webServerIpv4CidrBlock(@Nullable Output<String> webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = webServerIpv4CidrBlock;
            return this;
        }
        public Builder webServerIpv4CidrBlock(@Nullable String webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = Codegen.ofNullable(webServerIpv4CidrBlock);
            return this;
        }        public PrivateEnvironmentConfigArgs build() {
            return new PrivateEnvironmentConfigArgs(cloudComposerNetworkIpv4CidrBlock, cloudSqlIpv4CidrBlock, enablePrivateEnvironment, privateClusterConfig, webServerIpv4CidrBlock);
        }
    }
}
