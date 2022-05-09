// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.loganalytics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceWindowsPerformanceCounterArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceWindowsPerformanceCounterArgs Empty = new DataSourceWindowsPerformanceCounterArgs();

    /**
     * The friendly name of the performance counter.
     * 
     */
    @Import(name="counterName", required=true)
    private Output<String> counterName;

    /**
     * @return The friendly name of the performance counter.
     * 
     */
    public Output<String> counterName() {
        return this.counterName;
    }

    /**
     * The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
     * 
     */
    @Import(name="instanceName", required=true)
    private Output<String> instanceName;

    /**
     * @return The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }

    /**
     * The time of sample interval in seconds. Supports values between 10 and 2147483647.
     * 
     */
    @Import(name="intervalSeconds", required=true)
    private Output<Integer> intervalSeconds;

    /**
     * @return The time of sample interval in seconds. Supports values between 10 and 2147483647.
     * 
     */
    public Output<Integer> intervalSeconds() {
        return this.intervalSeconds;
    }

    /**
     * The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The object name of the Log Analytics Windows Performance Counter DataSource.
     * 
     */
    @Import(name="objectName", required=true)
    private Output<String> objectName;

    /**
     * @return The object name of the Log Analytics Windows Performance Counter DataSource.
     * 
     */
    public Output<String> objectName() {
        return this.objectName;
    }

    /**
     * The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    /**
     * @return The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
     * 
     */
    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private DataSourceWindowsPerformanceCounterArgs() {}

    private DataSourceWindowsPerformanceCounterArgs(DataSourceWindowsPerformanceCounterArgs $) {
        this.counterName = $.counterName;
        this.instanceName = $.instanceName;
        this.intervalSeconds = $.intervalSeconds;
        this.name = $.name;
        this.objectName = $.objectName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceWindowsPerformanceCounterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceWindowsPerformanceCounterArgs $;

        public Builder() {
            $ = new DataSourceWindowsPerformanceCounterArgs();
        }

        public Builder(DataSourceWindowsPerformanceCounterArgs defaults) {
            $ = new DataSourceWindowsPerformanceCounterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param counterName The friendly name of the performance counter.
         * 
         * @return builder
         * 
         */
        public Builder counterName(Output<String> counterName) {
            $.counterName = counterName;
            return this;
        }

        /**
         * @param counterName The friendly name of the performance counter.
         * 
         * @return builder
         * 
         */
        public Builder counterName(String counterName) {
            return counterName(Output.of(counterName));
        }

        /**
         * @param instanceName The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of the virtual machine instance to which the Windows Performance Counter DataSource be applied. Specify a `*` will apply to all instances.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param intervalSeconds The time of sample interval in seconds. Supports values between 10 and 2147483647.
         * 
         * @return builder
         * 
         */
        public Builder intervalSeconds(Output<Integer> intervalSeconds) {
            $.intervalSeconds = intervalSeconds;
            return this;
        }

        /**
         * @param intervalSeconds The time of sample interval in seconds. Supports values between 10 and 2147483647.
         * 
         * @return builder
         * 
         */
        public Builder intervalSeconds(Integer intervalSeconds) {
            return intervalSeconds(Output.of(intervalSeconds));
        }

        /**
         * @param name The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Name which should be used for this Log Analytics Windows Performance Counter DataSource. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param objectName The object name of the Log Analytics Windows Performance Counter DataSource.
         * 
         * @return builder
         * 
         */
        public Builder objectName(Output<String> objectName) {
            $.objectName = objectName;
            return this;
        }

        /**
         * @param objectName The object name of the Log Analytics Windows Performance Counter DataSource.
         * 
         * @return builder
         * 
         */
        public Builder objectName(String objectName) {
            return objectName(Output.of(objectName));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param workspaceName The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        /**
         * @param workspaceName The name of the Log Analytics Workspace where the Log Analytics Windows Performance Counter DataSource should exist. Changing this forces a new Log Analytics Windows Performance Counter DataSource to be created.
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public DataSourceWindowsPerformanceCounterArgs build() {
            $.counterName = Objects.requireNonNull($.counterName, "expected parameter 'counterName' to be non-null");
            $.instanceName = Objects.requireNonNull($.instanceName, "expected parameter 'instanceName' to be non-null");
            $.intervalSeconds = Objects.requireNonNull($.intervalSeconds, "expected parameter 'intervalSeconds' to be non-null");
            $.objectName = Objects.requireNonNull($.objectName, "expected parameter 'objectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
