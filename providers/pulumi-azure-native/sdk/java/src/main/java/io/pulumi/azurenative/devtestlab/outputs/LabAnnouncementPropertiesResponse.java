// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LabAnnouncementPropertiesResponse {
    private final @Nullable String enabled;
    private final @Nullable String expirationDate;
    private final @Nullable Boolean expired;
    private final @Nullable String markdown;
    private final String provisioningState;
    private final @Nullable String title;
    private final String uniqueIdentifier;

    @OutputCustomType.Constructor({"enabled","expirationDate","expired","markdown","provisioningState","title","uniqueIdentifier"})
    private LabAnnouncementPropertiesResponse(
        @Nullable String enabled,
        @Nullable String expirationDate,
        @Nullable Boolean expired,
        @Nullable String markdown,
        String provisioningState,
        @Nullable String title,
        String uniqueIdentifier) {
        this.enabled = enabled;
        this.expirationDate = expirationDate;
        this.expired = expired;
        this.markdown = markdown;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.title = title;
        this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
    }

    public Optional<String> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> getExpirationDate() {
        return Optional.ofNullable(this.expirationDate);
    }
    public Optional<Boolean> getExpired() {
        return Optional.ofNullable(this.expired);
    }
    public Optional<String> getMarkdown() {
        return Optional.ofNullable(this.markdown);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }
    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabAnnouncementPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String enabled;
        private @Nullable String expirationDate;
        private @Nullable Boolean expired;
        private @Nullable String markdown;
        private String provisioningState;
        private @Nullable String title;
        private String uniqueIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(LabAnnouncementPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.expirationDate = defaults.expirationDate;
    	      this.expired = defaults.expired;
    	      this.markdown = defaults.markdown;
    	      this.provisioningState = defaults.provisioningState;
    	      this.title = defaults.title;
    	      this.uniqueIdentifier = defaults.uniqueIdentifier;
        }

        public Builder setEnabled(@Nullable String enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setExpirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public Builder setExpired(@Nullable Boolean expired) {
            this.expired = expired;
            return this;
        }

        public Builder setMarkdown(@Nullable String markdown) {
            this.markdown = markdown;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder setUniqueIdentifier(String uniqueIdentifier) {
            this.uniqueIdentifier = Objects.requireNonNull(uniqueIdentifier);
            return this;
        }

        public LabAnnouncementPropertiesResponse build() {
            return new LabAnnouncementPropertiesResponse(enabled, expirationDate, expired, markdown, provisioningState, title, uniqueIdentifier);
        }
    }
}