// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.monitoring.outputs.AlertPolicyAlertStrategyNotificationRateLimit;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AlertPolicyAlertStrategy {
    /**
     * If an alert policy that was active has no data for this long, any open incidents will close.
     * 
     */
    private final @Nullable String autoClose;
    /**
     * Required for alert policies with a LogMatch condition.
     * This limit is not implemented for alert policies that are not log-based.
     * Structure is documented below.
     * 
     */
    private final @Nullable AlertPolicyAlertStrategyNotificationRateLimit notificationRateLimit;

    @OutputCustomType.Constructor
    private AlertPolicyAlertStrategy(
        @OutputCustomType.Parameter("autoClose") @Nullable String autoClose,
        @OutputCustomType.Parameter("notificationRateLimit") @Nullable AlertPolicyAlertStrategyNotificationRateLimit notificationRateLimit) {
        this.autoClose = autoClose;
        this.notificationRateLimit = notificationRateLimit;
    }

    /**
     * If an alert policy that was active has no data for this long, any open incidents will close.
     * 
    */
    public Optional<String> getAutoClose() {
        return Optional.ofNullable(this.autoClose);
    }
    /**
     * Required for alert policies with a LogMatch condition.
     * This limit is not implemented for alert policies that are not log-based.
     * Structure is documented below.
     * 
    */
    public Optional<AlertPolicyAlertStrategyNotificationRateLimit> getNotificationRateLimit() {
        return Optional.ofNullable(this.notificationRateLimit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyAlertStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoClose;
        private @Nullable AlertPolicyAlertStrategyNotificationRateLimit notificationRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertPolicyAlertStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoClose = defaults.autoClose;
    	      this.notificationRateLimit = defaults.notificationRateLimit;
        }

        public Builder setAutoClose(@Nullable String autoClose) {
            this.autoClose = autoClose;
            return this;
        }

        public Builder setNotificationRateLimit(@Nullable AlertPolicyAlertStrategyNotificationRateLimit notificationRateLimit) {
            this.notificationRateLimit = notificationRateLimit;
            return this;
        }
        public AlertPolicyAlertStrategy build() {
            return new AlertPolicyAlertStrategy(autoClose, notificationRateLimit);
        }
    }
}
