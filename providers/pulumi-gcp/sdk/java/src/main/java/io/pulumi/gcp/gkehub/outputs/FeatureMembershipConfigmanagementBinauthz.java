// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FeatureMembershipConfigmanagementBinauthz {
    /**
     * Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
     */
    private final @Nullable Boolean enabled;

    @OutputCustomType.Constructor
    private FeatureMembershipConfigmanagementBinauthz(@OutputCustomType.Parameter("enabled") @Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementBinauthz defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementBinauthz defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public FeatureMembershipConfigmanagementBinauthz build() {
            return new FeatureMembershipConfigmanagementBinauthz(enabled);
        }
    }
}
