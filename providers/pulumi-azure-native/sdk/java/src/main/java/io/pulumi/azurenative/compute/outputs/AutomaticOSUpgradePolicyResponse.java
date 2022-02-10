// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomaticOSUpgradePolicyResponse {
    private final @Nullable Boolean disableAutomaticRollback;
    private final @Nullable Boolean enableAutomaticOSUpgrade;

    @OutputCustomType.Constructor({"disableAutomaticRollback","enableAutomaticOSUpgrade"})
    private AutomaticOSUpgradePolicyResponse(
        @Nullable Boolean disableAutomaticRollback,
        @Nullable Boolean enableAutomaticOSUpgrade) {
        this.disableAutomaticRollback = disableAutomaticRollback;
        this.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
    }

    public Optional<Boolean> getDisableAutomaticRollback() {
        return Optional.ofNullable(this.disableAutomaticRollback);
    }
    public Optional<Boolean> getEnableAutomaticOSUpgrade() {
        return Optional.ofNullable(this.enableAutomaticOSUpgrade);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomaticOSUpgradePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableAutomaticRollback;
        private @Nullable Boolean enableAutomaticOSUpgrade;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomaticOSUpgradePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableAutomaticRollback = defaults.disableAutomaticRollback;
    	      this.enableAutomaticOSUpgrade = defaults.enableAutomaticOSUpgrade;
        }

        public Builder setDisableAutomaticRollback(@Nullable Boolean disableAutomaticRollback) {
            this.disableAutomaticRollback = disableAutomaticRollback;
            return this;
        }

        public Builder setEnableAutomaticOSUpgrade(@Nullable Boolean enableAutomaticOSUpgrade) {
            this.enableAutomaticOSUpgrade = enableAutomaticOSUpgrade;
            return this;
        }

        public AutomaticOSUpgradePolicyResponse build() {
            return new AutomaticOSUpgradePolicyResponse(disableAutomaticRollback, enableAutomaticOSUpgrade);
        }
    }
}