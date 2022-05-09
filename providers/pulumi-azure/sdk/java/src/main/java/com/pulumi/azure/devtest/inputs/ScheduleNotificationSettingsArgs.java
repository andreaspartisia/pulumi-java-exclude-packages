// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.devtest.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleNotificationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleNotificationSettingsArgs Empty = new ScheduleNotificationSettingsArgs();

    /**
     * The status of the notification. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the notification. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Time in minutes before event at which notification will be sent.
     * 
     */
    @Import(name="timeInMinutes")
    private @Nullable Output<Integer> timeInMinutes;

    /**
     * @return Time in minutes before event at which notification will be sent.
     * 
     */
    public Optional<Output<Integer>> timeInMinutes() {
        return Optional.ofNullable(this.timeInMinutes);
    }

    /**
     * The webhook URL to which the notification will be sent.
     * 
     */
    @Import(name="webhookUrl")
    private @Nullable Output<String> webhookUrl;

    /**
     * @return The webhook URL to which the notification will be sent.
     * 
     */
    public Optional<Output<String>> webhookUrl() {
        return Optional.ofNullable(this.webhookUrl);
    }

    private ScheduleNotificationSettingsArgs() {}

    private ScheduleNotificationSettingsArgs(ScheduleNotificationSettingsArgs $) {
        this.status = $.status;
        this.timeInMinutes = $.timeInMinutes;
        this.webhookUrl = $.webhookUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleNotificationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleNotificationSettingsArgs $;

        public Builder() {
            $ = new ScheduleNotificationSettingsArgs();
        }

        public Builder(ScheduleNotificationSettingsArgs defaults) {
            $ = new ScheduleNotificationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param status The status of the notification. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the notification. Possible values are `Enabled` and `Disabled`. Defaults to `Disabled`
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param timeInMinutes Time in minutes before event at which notification will be sent.
         * 
         * @return builder
         * 
         */
        public Builder timeInMinutes(@Nullable Output<Integer> timeInMinutes) {
            $.timeInMinutes = timeInMinutes;
            return this;
        }

        /**
         * @param timeInMinutes Time in minutes before event at which notification will be sent.
         * 
         * @return builder
         * 
         */
        public Builder timeInMinutes(Integer timeInMinutes) {
            return timeInMinutes(Output.of(timeInMinutes));
        }

        /**
         * @param webhookUrl The webhook URL to which the notification will be sent.
         * 
         * @return builder
         * 
         */
        public Builder webhookUrl(@Nullable Output<String> webhookUrl) {
            $.webhookUrl = webhookUrl;
            return this;
        }

        /**
         * @param webhookUrl The webhook URL to which the notification will be sent.
         * 
         * @return builder
         * 
         */
        public Builder webhookUrl(String webhookUrl) {
            return webhookUrl(Output.of(webhookUrl));
        }

        public ScheduleNotificationSettingsArgs build() {
            return $;
        }
    }

}
