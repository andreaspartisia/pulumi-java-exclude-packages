// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs Empty = new AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs();

    /**
     * (Updatable) Name of the month of the year.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Updatable) Name of the month of the year.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs() {}

    private AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs(AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs $;

        public Builder() {
            $ = new AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs();
        }

        public Builder(AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs defaults) {
            $ = new AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name (Updatable) Name of the month of the year.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Updatable) Name of the month of the year.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AutonomousContainerDatabaseMaintenanceWindowDaysOfWeekArgs build() {
            return $;
        }
    }

}
