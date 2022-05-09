// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotSiteConfigCors {
    /**
     * @return Specifies a list of origins that should be allowed to make cross-origin calls.
     * 
     */
    private final List<String> allowedOrigins;
    /**
     * @return Whether CORS requests with credentials are allowed. Defaults to `false`
     * 
     */
    private final @Nullable Boolean supportCredentials;

    @CustomType.Constructor
    private WindowsWebAppSlotSiteConfigCors(
        @CustomType.Parameter("allowedOrigins") List<String> allowedOrigins,
        @CustomType.Parameter("supportCredentials") @Nullable Boolean supportCredentials) {
        this.allowedOrigins = allowedOrigins;
        this.supportCredentials = supportCredentials;
    }

    /**
     * @return Specifies a list of origins that should be allowed to make cross-origin calls.
     * 
     */
    public List<String> allowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * @return Whether CORS requests with credentials are allowed. Defaults to `false`
     * 
     */
    public Optional<Boolean> supportCredentials() {
        return Optional.ofNullable(this.supportCredentials);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotSiteConfigCors defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedOrigins;
        private @Nullable Boolean supportCredentials;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsWebAppSlotSiteConfigCors defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.supportCredentials = defaults.supportCredentials;
        }

        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }
        public Builder supportCredentials(@Nullable Boolean supportCredentials) {
            this.supportCredentials = supportCredentials;
            return this;
        }        public WindowsWebAppSlotSiteConfigCors build() {
            return new WindowsWebAppSlotSiteConfigCors(allowedOrigins, supportCredentials);
        }
    }
}
