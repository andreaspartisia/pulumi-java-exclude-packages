// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthentication {
    private @Nullable Boolean ocspEnabled;
    private @Nullable Boolean sendCaListToClient;
    private @Nullable String setId;

    private CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthentication() {}
    public Optional<Boolean> ocspEnabled() {
        return Optional.ofNullable(this.ocspEnabled);
    }
    public Optional<Boolean> sendCaListToClient() {
        return Optional.ofNullable(this.sendCaListToClient);
    }
    public Optional<String> setId() {
        return Optional.ofNullable(this.setId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean ocspEnabled;
        private @Nullable Boolean sendCaListToClient;
        private @Nullable String setId;
        public Builder() {}
        public Builder(CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ocspEnabled = defaults.ocspEnabled;
    	      this.sendCaListToClient = defaults.sendCaListToClient;
    	      this.setId = defaults.setId;
        }

        @CustomType.Setter
        public Builder ocspEnabled(@Nullable Boolean ocspEnabled) {

            this.ocspEnabled = ocspEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder sendCaListToClient(@Nullable Boolean sendCaListToClient) {

            this.sendCaListToClient = sendCaListToClient;
            return this;
        }
        @CustomType.Setter
        public Builder setId(@Nullable String setId) {

            this.setId = setId;
            return this;
        }
        public CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthentication build() {
            final var _resultValue = new CpsThirdPartyEnrollmentNetworkConfigurationClientMutualAuthentication();
            _resultValue.ocspEnabled = ocspEnabled;
            _resultValue.sendCaListToClient = sendCaListToClient;
            _resultValue.setId = setId;
            return _resultValue;
        }
    }
}
