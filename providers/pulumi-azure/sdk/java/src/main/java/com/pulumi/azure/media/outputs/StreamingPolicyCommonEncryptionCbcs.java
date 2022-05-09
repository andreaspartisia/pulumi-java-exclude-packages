// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.media.outputs;

import com.pulumi.azure.media.outputs.StreamingPolicyCommonEncryptionCbcsDefaultContentKey;
import com.pulumi.azure.media.outputs.StreamingPolicyCommonEncryptionCbcsDrmFairplay;
import com.pulumi.azure.media.outputs.StreamingPolicyCommonEncryptionCbcsEnabledProtocols;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamingPolicyCommonEncryptionCbcs {
    /**
     * @return A `default_content_key` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    private final @Nullable StreamingPolicyCommonEncryptionCbcsDefaultContentKey defaultContentKey;
    /**
     * @return A `drm_fairplay` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    private final @Nullable StreamingPolicyCommonEncryptionCbcsDrmFairplay drmFairplay;
    /**
     * @return A `enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    private final @Nullable StreamingPolicyCommonEncryptionCbcsEnabledProtocols enabledProtocols;

    @CustomType.Constructor
    private StreamingPolicyCommonEncryptionCbcs(
        @CustomType.Parameter("defaultContentKey") @Nullable StreamingPolicyCommonEncryptionCbcsDefaultContentKey defaultContentKey,
        @CustomType.Parameter("drmFairplay") @Nullable StreamingPolicyCommonEncryptionCbcsDrmFairplay drmFairplay,
        @CustomType.Parameter("enabledProtocols") @Nullable StreamingPolicyCommonEncryptionCbcsEnabledProtocols enabledProtocols) {
        this.defaultContentKey = defaultContentKey;
        this.drmFairplay = drmFairplay;
        this.enabledProtocols = enabledProtocols;
    }

    /**
     * @return A `default_content_key` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<StreamingPolicyCommonEncryptionCbcsDefaultContentKey> defaultContentKey() {
        return Optional.ofNullable(this.defaultContentKey);
    }
    /**
     * @return A `drm_fairplay` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<StreamingPolicyCommonEncryptionCbcsDrmFairplay> drmFairplay() {
        return Optional.ofNullable(this.drmFairplay);
    }
    /**
     * @return A `enabled_protocols` block as defined below. Changing this forces a new Streaming Policy to be created.
     * 
     */
    public Optional<StreamingPolicyCommonEncryptionCbcsEnabledProtocols> enabledProtocols() {
        return Optional.ofNullable(this.enabledProtocols);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyCommonEncryptionCbcs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StreamingPolicyCommonEncryptionCbcsDefaultContentKey defaultContentKey;
        private @Nullable StreamingPolicyCommonEncryptionCbcsDrmFairplay drmFairplay;
        private @Nullable StreamingPolicyCommonEncryptionCbcsEnabledProtocols enabledProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyCommonEncryptionCbcs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultContentKey = defaults.defaultContentKey;
    	      this.drmFairplay = defaults.drmFairplay;
    	      this.enabledProtocols = defaults.enabledProtocols;
        }

        public Builder defaultContentKey(@Nullable StreamingPolicyCommonEncryptionCbcsDefaultContentKey defaultContentKey) {
            this.defaultContentKey = defaultContentKey;
            return this;
        }
        public Builder drmFairplay(@Nullable StreamingPolicyCommonEncryptionCbcsDrmFairplay drmFairplay) {
            this.drmFairplay = drmFairplay;
            return this;
        }
        public Builder enabledProtocols(@Nullable StreamingPolicyCommonEncryptionCbcsEnabledProtocols enabledProtocols) {
            this.enabledProtocols = enabledProtocols;
            return this;
        }        public StreamingPolicyCommonEncryptionCbcs build() {
            return new StreamingPolicyCommonEncryptionCbcs(defaultContentKey, drmFairplay, enabledProtocols);
        }
    }
}
