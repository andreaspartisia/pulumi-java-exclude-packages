// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UefiSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final UefiSettingsResponse Empty = new UefiSettingsResponse();

    @InputImport(name="secureBootEnabled")
    private final @Nullable Boolean secureBootEnabled;

    public Optional<Boolean> getSecureBootEnabled() {
        return this.secureBootEnabled == null ? Optional.empty() : Optional.ofNullable(this.secureBootEnabled);
    }

    @InputImport(name="vTpmEnabled")
    private final @Nullable Boolean vTpmEnabled;

    public Optional<Boolean> getVTpmEnabled() {
        return this.vTpmEnabled == null ? Optional.empty() : Optional.ofNullable(this.vTpmEnabled);
    }

    public UefiSettingsResponse(
        @Nullable Boolean secureBootEnabled,
        @Nullable Boolean vTpmEnabled) {
        this.secureBootEnabled = secureBootEnabled;
        this.vTpmEnabled = vTpmEnabled;
    }

    private UefiSettingsResponse() {
        this.secureBootEnabled = null;
        this.vTpmEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UefiSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean secureBootEnabled;
        private @Nullable Boolean vTpmEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(UefiSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secureBootEnabled = defaults.secureBootEnabled;
    	      this.vTpmEnabled = defaults.vTpmEnabled;
        }

        public Builder setSecureBootEnabled(@Nullable Boolean secureBootEnabled) {
            this.secureBootEnabled = secureBootEnabled;
            return this;
        }

        public Builder setVTpmEnabled(@Nullable Boolean vTpmEnabled) {
            this.vTpmEnabled = vTpmEnabled;
            return this;
        }

        public UefiSettingsResponse build() {
            return new UefiSettingsResponse(secureBootEnabled, vTpmEnabled);
        }
    }
}