// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.azurenative.hybridnetwork.outputs.LinuxConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OsProfileResponse {
    private final @Nullable String adminUsername;
    private final @Nullable String customData;
    private final @Nullable Boolean customDataRequired;
    private final @Nullable LinuxConfigurationResponse linuxConfiguration;

    @OutputCustomType.Constructor({"adminUsername","customData","customDataRequired","linuxConfiguration"})
    private OsProfileResponse(
        @Nullable String adminUsername,
        @Nullable String customData,
        @Nullable Boolean customDataRequired,
        @Nullable LinuxConfigurationResponse linuxConfiguration) {
        this.adminUsername = adminUsername;
        this.customData = customData;
        this.customDataRequired = customDataRequired;
        this.linuxConfiguration = linuxConfiguration;
    }

    public Optional<String> getAdminUsername() {
        return Optional.ofNullable(this.adminUsername);
    }
    public Optional<String> getCustomData() {
        return Optional.ofNullable(this.customData);
    }
    public Optional<Boolean> getCustomDataRequired() {
        return Optional.ofNullable(this.customDataRequired);
    }
    public Optional<LinuxConfigurationResponse> getLinuxConfiguration() {
        return Optional.ofNullable(this.linuxConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminUsername;
        private @Nullable String customData;
        private @Nullable Boolean customDataRequired;
        private @Nullable LinuxConfigurationResponse linuxConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(OsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsername = defaults.adminUsername;
    	      this.customData = defaults.customData;
    	      this.customDataRequired = defaults.customDataRequired;
    	      this.linuxConfiguration = defaults.linuxConfiguration;
        }

        public Builder setAdminUsername(@Nullable String adminUsername) {
            this.adminUsername = adminUsername;
            return this;
        }

        public Builder setCustomData(@Nullable String customData) {
            this.customData = customData;
            return this;
        }

        public Builder setCustomDataRequired(@Nullable Boolean customDataRequired) {
            this.customDataRequired = customDataRequired;
            return this;
        }

        public Builder setLinuxConfiguration(@Nullable LinuxConfigurationResponse linuxConfiguration) {
            this.linuxConfiguration = linuxConfiguration;
            return this;
        }

        public OsProfileResponse build() {
            return new OsProfileResponse(adminUsername, customData, customDataRequired, linuxConfiguration);
        }
    }
}