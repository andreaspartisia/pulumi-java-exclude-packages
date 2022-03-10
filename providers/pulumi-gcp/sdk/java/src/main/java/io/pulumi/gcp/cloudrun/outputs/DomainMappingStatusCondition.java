// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainMappingStatusCondition {
    private final @Nullable String message;
    private final @Nullable String reason;
    private final @Nullable String status;
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private DomainMappingStatusCondition(
        @OutputCustomType.Parameter("message") @Nullable String message,
        @OutputCustomType.Parameter("reason") @Nullable String reason,
        @OutputCustomType.Parameter("status") @Nullable String status,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<String> getReason() {
        return Optional.ofNullable(this.reason);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingStatusCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable String reason;
        private @Nullable String status;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingStatusCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setReason(@Nullable String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public DomainMappingStatusCondition build() {
            return new DomainMappingStatusCondition(message, reason, status, type);
        }
    }
}
