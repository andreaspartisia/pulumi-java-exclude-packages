// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentConfigPrivateEnvironmentConfig {
    private final @Nullable String cloudComposerConnectionSubnetwork;
    private final @Nullable String cloudComposerNetworkIpv4CidrBlock;
    private final @Nullable String cloudSqlIpv4CidrBlock;
    private final @Nullable Boolean enablePrivateEndpoint;
    private final @Nullable Boolean enablePrivatelyUsedPublicIps;
    private final @Nullable String masterIpv4CidrBlock;
    private final @Nullable String webServerIpv4CidrBlock;

    @OutputCustomType.Constructor
    private EnvironmentConfigPrivateEnvironmentConfig(
        @OutputCustomType.Parameter("cloudComposerConnectionSubnetwork") @Nullable String cloudComposerConnectionSubnetwork,
        @OutputCustomType.Parameter("cloudComposerNetworkIpv4CidrBlock") @Nullable String cloudComposerNetworkIpv4CidrBlock,
        @OutputCustomType.Parameter("cloudSqlIpv4CidrBlock") @Nullable String cloudSqlIpv4CidrBlock,
        @OutputCustomType.Parameter("enablePrivateEndpoint") @Nullable Boolean enablePrivateEndpoint,
        @OutputCustomType.Parameter("enablePrivatelyUsedPublicIps") @Nullable Boolean enablePrivatelyUsedPublicIps,
        @OutputCustomType.Parameter("masterIpv4CidrBlock") @Nullable String masterIpv4CidrBlock,
        @OutputCustomType.Parameter("webServerIpv4CidrBlock") @Nullable String webServerIpv4CidrBlock) {
        this.cloudComposerConnectionSubnetwork = cloudComposerConnectionSubnetwork;
        this.cloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
        this.cloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
        this.enablePrivateEndpoint = enablePrivateEndpoint;
        this.enablePrivatelyUsedPublicIps = enablePrivatelyUsedPublicIps;
        this.masterIpv4CidrBlock = masterIpv4CidrBlock;
        this.webServerIpv4CidrBlock = webServerIpv4CidrBlock;
    }

    public Optional<String> getCloudComposerConnectionSubnetwork() {
        return Optional.ofNullable(this.cloudComposerConnectionSubnetwork);
    }
    public Optional<String> getCloudComposerNetworkIpv4CidrBlock() {
        return Optional.ofNullable(this.cloudComposerNetworkIpv4CidrBlock);
    }
    public Optional<String> getCloudSqlIpv4CidrBlock() {
        return Optional.ofNullable(this.cloudSqlIpv4CidrBlock);
    }
    public Optional<Boolean> getEnablePrivateEndpoint() {
        return Optional.ofNullable(this.enablePrivateEndpoint);
    }
    public Optional<Boolean> getEnablePrivatelyUsedPublicIps() {
        return Optional.ofNullable(this.enablePrivatelyUsedPublicIps);
    }
    public Optional<String> getMasterIpv4CidrBlock() {
        return Optional.ofNullable(this.masterIpv4CidrBlock);
    }
    public Optional<String> getWebServerIpv4CidrBlock() {
        return Optional.ofNullable(this.webServerIpv4CidrBlock);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentConfigPrivateEnvironmentConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudComposerConnectionSubnetwork;
        private @Nullable String cloudComposerNetworkIpv4CidrBlock;
        private @Nullable String cloudSqlIpv4CidrBlock;
        private @Nullable Boolean enablePrivateEndpoint;
        private @Nullable Boolean enablePrivatelyUsedPublicIps;
        private @Nullable String masterIpv4CidrBlock;
        private @Nullable String webServerIpv4CidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentConfigPrivateEnvironmentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudComposerConnectionSubnetwork = defaults.cloudComposerConnectionSubnetwork;
    	      this.cloudComposerNetworkIpv4CidrBlock = defaults.cloudComposerNetworkIpv4CidrBlock;
    	      this.cloudSqlIpv4CidrBlock = defaults.cloudSqlIpv4CidrBlock;
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivatelyUsedPublicIps = defaults.enablePrivatelyUsedPublicIps;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.webServerIpv4CidrBlock = defaults.webServerIpv4CidrBlock;
        }

        public Builder setCloudComposerConnectionSubnetwork(@Nullable String cloudComposerConnectionSubnetwork) {
            this.cloudComposerConnectionSubnetwork = cloudComposerConnectionSubnetwork;
            return this;
        }

        public Builder setCloudComposerNetworkIpv4CidrBlock(@Nullable String cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
            return this;
        }

        public Builder setCloudSqlIpv4CidrBlock(@Nullable String cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
            return this;
        }

        public Builder setEnablePrivateEndpoint(@Nullable Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = enablePrivateEndpoint;
            return this;
        }

        public Builder setEnablePrivatelyUsedPublicIps(@Nullable Boolean enablePrivatelyUsedPublicIps) {
            this.enablePrivatelyUsedPublicIps = enablePrivatelyUsedPublicIps;
            return this;
        }

        public Builder setMasterIpv4CidrBlock(@Nullable String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = masterIpv4CidrBlock;
            return this;
        }

        public Builder setWebServerIpv4CidrBlock(@Nullable String webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = webServerIpv4CidrBlock;
            return this;
        }
        public EnvironmentConfigPrivateEnvironmentConfig build() {
            return new EnvironmentConfigPrivateEnvironmentConfig(cloudComposerConnectionSubnetwork, cloudComposerNetworkIpv4CidrBlock, cloudSqlIpv4CidrBlock, enablePrivateEndpoint, enablePrivatelyUsedPublicIps, masterIpv4CidrBlock, webServerIpv4CidrBlock);
        }
    }
}
