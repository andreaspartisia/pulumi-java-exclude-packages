// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare;

import com.pulumi.azurenative.datashare.enums.RecurrenceInterval;
import com.pulumi.azurenative.datashare.enums.SynchronizationMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledTriggerArgs Empty = new ScheduledTriggerArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Kind of synchronization on trigger.
     * Expected value is &#39;ScheduleBased&#39;.
     * 
     */
    @Import(name="kind", required=true)
    private Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * Recurrence Interval
     * 
     */
    @Import(name="recurrenceInterval", required=true)
    private Output<Either<String,RecurrenceInterval>> recurrenceInterval;

    public Output<Either<String,RecurrenceInterval>> recurrenceInterval() {
        return this.recurrenceInterval;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share subscription which will hold the data set sink.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
    private Output<String> shareSubscriptionName;

    public Output<String> shareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Synchronization mode
     * 
     */
    @Import(name="synchronizationMode")
    private @Nullable Output<Either<String,SynchronizationMode>> synchronizationMode;

    public Optional<Output<Either<String,SynchronizationMode>>> synchronizationMode() {
        return Optional.ofNullable(this.synchronizationMode);
    }

    /**
     * Synchronization time
     * 
     */
    @Import(name="synchronizationTime", required=true)
    private Output<String> synchronizationTime;

    public Output<String> synchronizationTime() {
        return this.synchronizationTime;
    }

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="triggerName")
    private @Nullable Output<String> triggerName;

    public Optional<Output<String>> triggerName() {
        return Optional.ofNullable(this.triggerName);
    }

    private ScheduledTriggerArgs() {}

    private ScheduledTriggerArgs(ScheduledTriggerArgs $) {
        this.accountName = $.accountName;
        this.kind = $.kind;
        this.recurrenceInterval = $.recurrenceInterval;
        this.resourceGroupName = $.resourceGroupName;
        this.shareSubscriptionName = $.shareSubscriptionName;
        this.synchronizationMode = $.synchronizationMode;
        this.synchronizationTime = $.synchronizationTime;
        this.triggerName = $.triggerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledTriggerArgs $;

        public Builder() {
            $ = new ScheduledTriggerArgs();
        }

        public Builder(ScheduledTriggerArgs defaults) {
            $ = new ScheduledTriggerArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder kind(Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder recurrenceInterval(Output<Either<String,RecurrenceInterval>> recurrenceInterval) {
            $.recurrenceInterval = recurrenceInterval;
            return this;
        }

        public Builder recurrenceInterval(Either<String,RecurrenceInterval> recurrenceInterval) {
            return recurrenceInterval(Output.of(recurrenceInterval));
        }

        public Builder recurrenceInterval(String recurrenceInterval) {
            return recurrenceInterval(Either.ofLeft(recurrenceInterval));
        }

        public Builder recurrenceInterval(RecurrenceInterval recurrenceInterval) {
            return recurrenceInterval(Either.ofRight(recurrenceInterval));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder shareSubscriptionName(Output<String> shareSubscriptionName) {
            $.shareSubscriptionName = shareSubscriptionName;
            return this;
        }

        public Builder shareSubscriptionName(String shareSubscriptionName) {
            return shareSubscriptionName(Output.of(shareSubscriptionName));
        }

        public Builder synchronizationMode(@Nullable Output<Either<String,SynchronizationMode>> synchronizationMode) {
            $.synchronizationMode = synchronizationMode;
            return this;
        }

        public Builder synchronizationMode(Either<String,SynchronizationMode> synchronizationMode) {
            return synchronizationMode(Output.of(synchronizationMode));
        }

        public Builder synchronizationMode(String synchronizationMode) {
            return synchronizationMode(Either.ofLeft(synchronizationMode));
        }

        public Builder synchronizationMode(SynchronizationMode synchronizationMode) {
            return synchronizationMode(Either.ofRight(synchronizationMode));
        }

        public Builder synchronizationTime(Output<String> synchronizationTime) {
            $.synchronizationTime = synchronizationTime;
            return this;
        }

        public Builder synchronizationTime(String synchronizationTime) {
            return synchronizationTime(Output.of(synchronizationTime));
        }

        public Builder triggerName(@Nullable Output<String> triggerName) {
            $.triggerName = triggerName;
            return this;
        }

        public Builder triggerName(String triggerName) {
            return triggerName(Output.of(triggerName));
        }

        public ScheduledTriggerArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.kind = Codegen.stringProp("kind").output().arg($.kind).require();
            $.recurrenceInterval = Objects.requireNonNull($.recurrenceInterval, "expected parameter 'recurrenceInterval' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareSubscriptionName = Objects.requireNonNull($.shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
            $.synchronizationTime = Objects.requireNonNull($.synchronizationTime, "expected parameter 'synchronizationTime' to be non-null");
            return $;
        }
    }

}
