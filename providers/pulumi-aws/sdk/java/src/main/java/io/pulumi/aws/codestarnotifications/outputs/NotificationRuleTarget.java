// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarnotifications.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotificationRuleTarget {
    /**
     * The ARN of notification rule target. For example, a SNS Topic ARN.
     * 
     */
    private final String address;
    /**
     * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     * 
     */
    private final @Nullable String status;
    /**
     * The type of the notification target. Default value is `SNS`.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor
    private NotificationRuleTarget(
        @OutputCustomType.Parameter("address") String address,
        @OutputCustomType.Parameter("status") @Nullable String status,
        @OutputCustomType.Parameter("type") @Nullable String type) {
        this.address = address;
        this.status = status;
        this.type = type;
    }

    /**
     * The ARN of notification rule target. For example, a SNS Topic ARN.
     * 
    */
    public String getAddress() {
        return this.address;
    }
    /**
     * The status of the notification rule. Possible values are `ENABLED` and `DISABLED`, default is `ENABLED`.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The type of the notification target. Default value is `SNS`.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private @Nullable String status;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRuleTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
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
        public NotificationRuleTarget build() {
            return new NotificationRuleTarget(address, status, type);
        }
    }
}