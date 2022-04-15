// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v3.inputs.NotificationRateLimitResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Control over how the notification channels in notification_channels are notified when this alert fires.
 * 
 */
public final class AlertStrategyResponse extends io.pulumi.resources.InvokeArgs {

    public static final AlertStrategyResponse Empty = new AlertStrategyResponse();

    /**
     * If an alert policy that was active has no data for this long, any open incidents will close
     * 
     */
    @Import(name="autoClose", required=true)
      private final String autoClose;

    public String autoClose() {
        return this.autoClose;
    }

    /**
     * Required for alert policies with a LogMatch condition.This limit is not implemented for alert policies that are not log-based.
     * 
     */
    @Import(name="notificationRateLimit", required=true)
      private final NotificationRateLimitResponse notificationRateLimit;

    public NotificationRateLimitResponse notificationRateLimit() {
        return this.notificationRateLimit;
    }

    public AlertStrategyResponse(
        String autoClose,
        NotificationRateLimitResponse notificationRateLimit) {
        this.autoClose = Objects.requireNonNull(autoClose, "expected parameter 'autoClose' to be non-null");
        this.notificationRateLimit = Objects.requireNonNull(notificationRateLimit, "expected parameter 'notificationRateLimit' to be non-null");
    }

    private AlertStrategyResponse() {
        this.autoClose = null;
        this.notificationRateLimit = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertStrategyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoClose;
        private NotificationRateLimitResponse notificationRateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AlertStrategyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoClose = defaults.autoClose;
    	      this.notificationRateLimit = defaults.notificationRateLimit;
        }

        public Builder autoClose(String autoClose) {
            this.autoClose = Objects.requireNonNull(autoClose);
            return this;
        }
        public Builder notificationRateLimit(NotificationRateLimitResponse notificationRateLimit) {
            this.notificationRateLimit = Objects.requireNonNull(notificationRateLimit);
            return this;
        }        public AlertStrategyResponse build() {
            return new AlertStrategyResponse(autoClose, notificationRateLimit);
        }
    }
}
