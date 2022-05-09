// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryTaskTimerTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryTaskTimerTriggerArgs Empty = new RegistryTaskTimerTriggerArgs();

    /**
     * Should the trigger be enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Should the trigger be enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name which should be used for this trigger.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this trigger.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The CRON expression for the task schedule.
     * 
     */
    @Import(name="schedule", required=true)
    private Output<String> schedule;

    /**
     * @return The CRON expression for the task schedule.
     * 
     */
    public Output<String> schedule() {
        return this.schedule;
    }

    private RegistryTaskTimerTriggerArgs() {}

    private RegistryTaskTimerTriggerArgs(RegistryTaskTimerTriggerArgs $) {
        this.enabled = $.enabled;
        this.name = $.name;
        this.schedule = $.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryTaskTimerTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryTaskTimerTriggerArgs $;

        public Builder() {
            $ = new RegistryTaskTimerTriggerArgs();
        }

        public Builder(RegistryTaskTimerTriggerArgs defaults) {
            $ = new RegistryTaskTimerTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Should the trigger be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should the trigger be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name The name which should be used for this trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedule The CRON expression for the task schedule.
         * 
         * @return builder
         * 
         */
        public Builder schedule(Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The CRON expression for the task schedule.
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        public RegistryTaskTimerTriggerArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            return $;
        }
    }

}
