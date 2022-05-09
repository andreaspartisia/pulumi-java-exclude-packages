// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.synapse;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlPoolWorkloadClassifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlPoolWorkloadClassifierArgs Empty = new SqlPoolWorkloadClassifierArgs();

    /**
     * Specifies the session context value that a request can be classified against.
     * 
     */
    @Import(name="context")
    private @Nullable Output<String> context;

    /**
     * @return Specifies the session context value that a request can be classified against.
     * 
     */
    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * The workload classifier end time for classification. It&#39;s of the `HH:MM` format in UTC time zone.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The workload classifier end time for classification. It&#39;s of the `HH:MM` format in UTC time zone.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The workload classifier importance. The allowed values are `low`, `below_normal`, `normal`, `above_normal` and `high`.
     * 
     */
    @Import(name="importance")
    private @Nullable Output<String> importance;

    /**
     * @return The workload classifier importance. The allowed values are `low`, `below_normal`, `normal`, `above_normal` and `high`.
     * 
     */
    public Optional<Output<String>> importance() {
        return Optional.ofNullable(this.importance);
    }

    /**
     * Specifies the label value that a request can be classified against.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return Specifies the label value that a request can be classified against.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The workload classifier member name used to classified against.
     * 
     */
    @Import(name="memberName", required=true)
    private Output<String> memberName;

    /**
     * @return The workload classifier member name used to classified against.
     * 
     */
    public Output<String> memberName() {
        return this.memberName;
    }

    /**
     * The name which should be used for this Synapse SQL Pool Workload Classifier. Changing this forces a new Synapse SQL Pool Workload Classifier to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Synapse SQL Pool Workload Classifier. Changing this forces a new Synapse SQL Pool Workload Classifier to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The workload classifier start time for classification. It&#39;s of the `HH:MM` format in UTC time zone.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The workload classifier start time for classification. It&#39;s of the `HH:MM` format in UTC time zone.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The ID of the Synapse SQL Pool Workload Group. Changing this forces a new Synapse SQL Pool Workload Classifier to be created.
     * 
     */
    @Import(name="workloadGroupId", required=true)
    private Output<String> workloadGroupId;

    /**
     * @return The ID of the Synapse SQL Pool Workload Group. Changing this forces a new Synapse SQL Pool Workload Classifier to be created.
     * 
     */
    public Output<String> workloadGroupId() {
        return this.workloadGroupId;
    }

    private SqlPoolWorkloadClassifierArgs() {}

    private SqlPoolWorkloadClassifierArgs(SqlPoolWorkloadClassifierArgs $) {
        this.context = $.context;
        this.endTime = $.endTime;
        this.importance = $.importance;
        this.label = $.label;
        this.memberName = $.memberName;
        this.name = $.name;
        this.startTime = $.startTime;
        this.workloadGroupId = $.workloadGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlPoolWorkloadClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlPoolWorkloadClassifierArgs $;

        public Builder() {
            $ = new SqlPoolWorkloadClassifierArgs();
        }

        public Builder(SqlPoolWorkloadClassifierArgs defaults) {
            $ = new SqlPoolWorkloadClassifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param context Specifies the session context value that a request can be classified against.
         * 
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context Specifies the session context value that a request can be classified against.
         * 
         * @return builder
         * 
         */
        public Builder context(String context) {
            return context(Output.of(context));
        }

        /**
         * @param endTime The workload classifier end time for classification. It&#39;s of the `HH:MM` format in UTC time zone.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The workload classifier end time for classification. It&#39;s of the `HH:MM` format in UTC time zone.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param importance The workload classifier importance. The allowed values are `low`, `below_normal`, `normal`, `above_normal` and `high`.
         * 
         * @return builder
         * 
         */
        public Builder importance(@Nullable Output<String> importance) {
            $.importance = importance;
            return this;
        }

        /**
         * @param importance The workload classifier importance. The allowed values are `low`, `below_normal`, `normal`, `above_normal` and `high`.
         * 
         * @return builder
         * 
         */
        public Builder importance(String importance) {
            return importance(Output.of(importance));
        }

        /**
         * @param label Specifies the label value that a request can be classified against.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label Specifies the label value that a request can be classified against.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param memberName The workload classifier member name used to classified against.
         * 
         * @return builder
         * 
         */
        public Builder memberName(Output<String> memberName) {
            $.memberName = memberName;
            return this;
        }

        /**
         * @param memberName The workload classifier member name used to classified against.
         * 
         * @return builder
         * 
         */
        public Builder memberName(String memberName) {
            return memberName(Output.of(memberName));
        }

        /**
         * @param name The name which should be used for this Synapse SQL Pool Workload Classifier. Changing this forces a new Synapse SQL Pool Workload Classifier to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Synapse SQL Pool Workload Classifier. Changing this forces a new Synapse SQL Pool Workload Classifier to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param startTime The workload classifier start time for classification. It&#39;s of the `HH:MM` format in UTC time zone.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The workload classifier start time for classification. It&#39;s of the `HH:MM` format in UTC time zone.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param workloadGroupId The ID of the Synapse SQL Pool Workload Group. Changing this forces a new Synapse SQL Pool Workload Classifier to be created.
         * 
         * @return builder
         * 
         */
        public Builder workloadGroupId(Output<String> workloadGroupId) {
            $.workloadGroupId = workloadGroupId;
            return this;
        }

        /**
         * @param workloadGroupId The ID of the Synapse SQL Pool Workload Group. Changing this forces a new Synapse SQL Pool Workload Classifier to be created.
         * 
         * @return builder
         * 
         */
        public Builder workloadGroupId(String workloadGroupId) {
            return workloadGroupId(Output.of(workloadGroupId));
        }

        public SqlPoolWorkloadClassifierArgs build() {
            $.memberName = Objects.requireNonNull($.memberName, "expected parameter 'memberName' to be non-null");
            $.workloadGroupId = Objects.requireNonNull($.workloadGroupId, "expected parameter 'workloadGroupId' to be non-null");
            return $;
        }
    }

}
