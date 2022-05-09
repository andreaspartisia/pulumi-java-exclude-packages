// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs Empty = new SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs();

    /**
     * The days of the week to perform autoscale.
     * 
     */
    @Import(name="days", required=true)
    private Output<List<String>> days;

    /**
     * @return The days of the week to perform autoscale.
     * 
     */
    public Output<List<String>> days() {
        return this.days;
    }

    /**
     * The number of worker nodes to autoscale at the specified time.
     * 
     */
    @Import(name="targetInstanceCount", required=true)
    private Output<Integer> targetInstanceCount;

    /**
     * @return The number of worker nodes to autoscale at the specified time.
     * 
     */
    public Output<Integer> targetInstanceCount() {
        return this.targetInstanceCount;
    }

    /**
     * The time of day to perform the autoscale in 24hour format.
     * 
     */
    @Import(name="time", required=true)
    private Output<String> time;

    /**
     * @return The time of day to perform the autoscale in 24hour format.
     * 
     */
    public Output<String> time() {
        return this.time;
    }

    private SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs() {}

    private SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs(SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs $) {
        this.days = $.days;
        this.targetInstanceCount = $.targetInstanceCount;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs $;

        public Builder() {
            $ = new SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs();
        }

        public Builder(SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs defaults) {
            $ = new SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param days The days of the week to perform autoscale.
         * 
         * @return builder
         * 
         */
        public Builder days(Output<List<String>> days) {
            $.days = days;
            return this;
        }

        /**
         * @param days The days of the week to perform autoscale.
         * 
         * @return builder
         * 
         */
        public Builder days(List<String> days) {
            return days(Output.of(days));
        }

        /**
         * @param days The days of the week to perform autoscale.
         * 
         * @return builder
         * 
         */
        public Builder days(String... days) {
            return days(List.of(days));
        }

        /**
         * @param targetInstanceCount The number of worker nodes to autoscale at the specified time.
         * 
         * @return builder
         * 
         */
        public Builder targetInstanceCount(Output<Integer> targetInstanceCount) {
            $.targetInstanceCount = targetInstanceCount;
            return this;
        }

        /**
         * @param targetInstanceCount The number of worker nodes to autoscale at the specified time.
         * 
         * @return builder
         * 
         */
        public Builder targetInstanceCount(Integer targetInstanceCount) {
            return targetInstanceCount(Output.of(targetInstanceCount));
        }

        /**
         * @param time The time of day to perform the autoscale in 24hour format.
         * 
         * @return builder
         * 
         */
        public Builder time(Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time The time of day to perform the autoscale in 24hour format.
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        public SparkClusterRolesWorkerNodeAutoscaleRecurrenceScheduleArgs build() {
            $.days = Objects.requireNonNull($.days, "expected parameter 'days' to be non-null");
            $.targetInstanceCount = Objects.requireNonNull($.targetInstanceCount, "expected parameter 'targetInstanceCount' to be non-null");
            $.time = Objects.requireNonNull($.time, "expected parameter 'time' to be non-null");
            return $;
        }
    }

}
