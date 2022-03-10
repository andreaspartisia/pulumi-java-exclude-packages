// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pinpoint.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BaiduChannelState extends io.pulumi.resources.ResourceArgs {

    public static final BaiduChannelState Empty = new BaiduChannelState();

    /**
     * Platform credential API key from Baidu.
     * 
     */
    @InputImport(name="apiKey")
      private final @Nullable Input<String> apiKey;

    public Input<String> getApiKey() {
        return this.apiKey == null ? Input.empty() : this.apiKey;
    }

    /**
     * The application ID.
     * 
     */
    @InputImport(name="applicationId")
      private final @Nullable Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId == null ? Input.empty() : this.applicationId;
    }

    /**
     * Specifies whether to enable the channel. Defaults to `true`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Platform credential Secret key from Baidu.
     * 
     */
    @InputImport(name="secretKey")
      private final @Nullable Input<String> secretKey;

    public Input<String> getSecretKey() {
        return this.secretKey == null ? Input.empty() : this.secretKey;
    }

    public BaiduChannelState(
        @Nullable Input<String> apiKey,
        @Nullable Input<String> applicationId,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<String> secretKey) {
        this.apiKey = apiKey;
        this.applicationId = applicationId;
        this.enabled = enabled;
        this.secretKey = secretKey;
    }

    private BaiduChannelState() {
        this.apiKey = Input.empty();
        this.applicationId = Input.empty();
        this.enabled = Input.empty();
        this.secretKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaiduChannelState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiKey;
        private @Nullable Input<String> applicationId;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<String> secretKey;

        public Builder() {
    	      // Empty
        }

        public Builder(BaiduChannelState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.applicationId = defaults.applicationId;
    	      this.enabled = defaults.enabled;
    	      this.secretKey = defaults.secretKey;
        }

        public Builder setApiKey(@Nullable Input<String> apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public Builder setApiKey(@Nullable String apiKey) {
            this.apiKey = Input.ofNullable(apiKey);
            return this;
        }

        public Builder setApplicationId(@Nullable Input<String> applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        public Builder setApplicationId(@Nullable String applicationId) {
            this.applicationId = Input.ofNullable(applicationId);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setSecretKey(@Nullable Input<String> secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public Builder setSecretKey(@Nullable String secretKey) {
            this.secretKey = Input.ofNullable(secretKey);
            return this;
        }
        public BaiduChannelState build() {
            return new BaiduChannelState(apiKey, applicationId, enabled, secretKey);
        }
    }
}