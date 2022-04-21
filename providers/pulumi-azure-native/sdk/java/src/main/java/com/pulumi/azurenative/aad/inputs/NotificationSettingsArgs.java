// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aad.inputs;

import com.pulumi.azurenative.aad.enums.NotifyDcAdmins;
import com.pulumi.azurenative.aad.enums.NotifyGlobalAdmins;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for notification
 * 
 */
public final class NotificationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationSettingsArgs Empty = new NotificationSettingsArgs();

    /**
     * The list of additional recipients
     * 
     */
    @Import(name="additionalRecipients")
    private @Nullable Output<List<String>> additionalRecipients;

    public Optional<Output<List<String>>> additionalRecipients() {
        return Optional.ofNullable(this.additionalRecipients);
    }

    /**
     * Should domain controller admins be notified
     * 
     */
    @Import(name="notifyDcAdmins")
    private @Nullable Output<Either<String,NotifyDcAdmins>> notifyDcAdmins;

    public Optional<Output<Either<String,NotifyDcAdmins>>> notifyDcAdmins() {
        return Optional.ofNullable(this.notifyDcAdmins);
    }

    /**
     * Should global admins be notified
     * 
     */
    @Import(name="notifyGlobalAdmins")
    private @Nullable Output<Either<String,NotifyGlobalAdmins>> notifyGlobalAdmins;

    public Optional<Output<Either<String,NotifyGlobalAdmins>>> notifyGlobalAdmins() {
        return Optional.ofNullable(this.notifyGlobalAdmins);
    }

    private NotificationSettingsArgs() {}

    private NotificationSettingsArgs(NotificationSettingsArgs $) {
        this.additionalRecipients = $.additionalRecipients;
        this.notifyDcAdmins = $.notifyDcAdmins;
        this.notifyGlobalAdmins = $.notifyGlobalAdmins;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationSettingsArgs $;

        public Builder() {
            $ = new NotificationSettingsArgs();
        }

        public Builder(NotificationSettingsArgs defaults) {
            $ = new NotificationSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalRecipients(@Nullable Output<List<String>> additionalRecipients) {
            $.additionalRecipients = additionalRecipients;
            return this;
        }

        public Builder additionalRecipients(List<String> additionalRecipients) {
            return additionalRecipients(Output.of(additionalRecipients));
        }

        public Builder additionalRecipients(String... additionalRecipients) {
            return additionalRecipients(List.of(additionalRecipients));
        }

        public Builder notifyDcAdmins(@Nullable Output<Either<String,NotifyDcAdmins>> notifyDcAdmins) {
            $.notifyDcAdmins = notifyDcAdmins;
            return this;
        }

        public Builder notifyDcAdmins(Either<String,NotifyDcAdmins> notifyDcAdmins) {
            return notifyDcAdmins(Output.of(notifyDcAdmins));
        }

        public Builder notifyDcAdmins(String notifyDcAdmins) {
            return notifyDcAdmins(Either.ofLeft(notifyDcAdmins));
        }

        public Builder notifyDcAdmins(NotifyDcAdmins notifyDcAdmins) {
            return notifyDcAdmins(Either.ofRight(notifyDcAdmins));
        }

        public Builder notifyGlobalAdmins(@Nullable Output<Either<String,NotifyGlobalAdmins>> notifyGlobalAdmins) {
            $.notifyGlobalAdmins = notifyGlobalAdmins;
            return this;
        }

        public Builder notifyGlobalAdmins(Either<String,NotifyGlobalAdmins> notifyGlobalAdmins) {
            return notifyGlobalAdmins(Output.of(notifyGlobalAdmins));
        }

        public Builder notifyGlobalAdmins(String notifyGlobalAdmins) {
            return notifyGlobalAdmins(Either.ofLeft(notifyGlobalAdmins));
        }

        public Builder notifyGlobalAdmins(NotifyGlobalAdmins notifyGlobalAdmins) {
            return notifyGlobalAdmins(Either.ofRight(notifyGlobalAdmins));
        }

        public NotificationSettingsArgs build() {
            return $;
        }
    }

}
