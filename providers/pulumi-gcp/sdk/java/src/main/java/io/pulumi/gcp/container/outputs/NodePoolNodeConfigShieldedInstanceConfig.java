// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodePoolNodeConfigShieldedInstanceConfig {
    private final @Nullable Boolean enableIntegrityMonitoring;
    private final @Nullable Boolean enableSecureBoot;

    @OutputCustomType.Constructor
    private NodePoolNodeConfigShieldedInstanceConfig(
        @OutputCustomType.Parameter("enableIntegrityMonitoring") @Nullable Boolean enableIntegrityMonitoring,
        @OutputCustomType.Parameter("enableSecureBoot") @Nullable Boolean enableSecureBoot) {
        this.enableIntegrityMonitoring = enableIntegrityMonitoring;
        this.enableSecureBoot = enableSecureBoot;
    }

    public Optional<Boolean> getEnableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }
    public Optional<Boolean> getEnableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableIntegrityMonitoring;
        private @Nullable Boolean enableSecureBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
        }

        public Builder setEnableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder setEnableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        public NodePoolNodeConfigShieldedInstanceConfig build() {
            return new NodePoolNodeConfigShieldedInstanceConfig(enableIntegrityMonitoring, enableSecureBoot);
        }
    }
}
