// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmSynthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConfigConfigurationReqAuthenticationDetailsAuthHeader {
    /**
     * @return (Updatable) Name of the header.
     * 
     */
    private final @Nullable String headerName;
    /**
     * @return (Updatable) Value of the header.
     * 
     */
    private final @Nullable String headerValue;

    @CustomType.Constructor
    private ConfigConfigurationReqAuthenticationDetailsAuthHeader(
        @CustomType.Parameter("headerName") @Nullable String headerName,
        @CustomType.Parameter("headerValue") @Nullable String headerValue) {
        this.headerName = headerName;
        this.headerValue = headerValue;
    }

    /**
     * @return (Updatable) Name of the header.
     * 
     */
    public Optional<String> headerName() {
        return Optional.ofNullable(this.headerName);
    }
    /**
     * @return (Updatable) Value of the header.
     * 
     */
    public Optional<String> headerValue() {
        return Optional.ofNullable(this.headerValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigConfigurationReqAuthenticationDetailsAuthHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String headerName;
        private @Nullable String headerValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigConfigurationReqAuthenticationDetailsAuthHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
        }

        public Builder headerName(@Nullable String headerName) {
            this.headerName = headerName;
            return this;
        }
        public Builder headerValue(@Nullable String headerValue) {
            this.headerValue = headerValue;
            return this;
        }        public ConfigConfigurationReqAuthenticationDetailsAuthHeader build() {
            return new ConfigConfigurationReqAuthenticationDetailsAuthHeader(headerName, headerValue);
        }
    }
}
