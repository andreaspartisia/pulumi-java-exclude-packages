// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.ExadataIormConfigDbPlanArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExadataIormConfigState extends com.pulumi.resources.ResourceArgs {

    public static final ExadataIormConfigState Empty = new ExadataIormConfigState();

    /**
     * (Updatable) Array of IORM Setting for all the database in this Exadata DB System
     * 
     */
    @Import(name="dbPlans")
    private @Nullable Output<List<ExadataIormConfigDbPlanArgs>> dbPlans;

    /**
     * @return (Updatable) Array of IORM Setting for all the database in this Exadata DB System
     * 
     */
    public Optional<Output<List<ExadataIormConfigDbPlanArgs>>> dbPlans() {
        return Optional.ofNullable(this.dbPlans);
    }

    /**
     * (Updatable) The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="dbSystemId")
    private @Nullable Output<String> dbSystemId;

    /**
     * @return (Updatable) The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Optional<Output<String>> dbSystemId() {
        return Optional.ofNullable(this.dbSystemId);
    }

    /**
     * Additional information about the current `lifecycleState`.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable Output<String> lifecycleDetails;

    /**
     * @return Additional information about the current `lifecycleState`.
     * 
     */
    public Optional<Output<String>> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * (Updatable) Value for the IORM objective Default is &#34;Auto&#34;
     * 
     */
    @Import(name="objective")
    private @Nullable Output<String> objective;

    /**
     * @return (Updatable) Value for the IORM objective Default is &#34;Auto&#34;
     * 
     */
    public Optional<Output<String>> objective() {
        return Optional.ofNullable(this.objective);
    }

    /**
     * The current state of IORM configuration for the Exadata DB system.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of IORM configuration for the Exadata DB system.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    private ExadataIormConfigState() {}

    private ExadataIormConfigState(ExadataIormConfigState $) {
        this.dbPlans = $.dbPlans;
        this.dbSystemId = $.dbSystemId;
        this.lifecycleDetails = $.lifecycleDetails;
        this.objective = $.objective;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExadataIormConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExadataIormConfigState $;

        public Builder() {
            $ = new ExadataIormConfigState();
        }

        public Builder(ExadataIormConfigState defaults) {
            $ = new ExadataIormConfigState(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbPlans (Updatable) Array of IORM Setting for all the database in this Exadata DB System
         * 
         * @return builder
         * 
         */
        public Builder dbPlans(@Nullable Output<List<ExadataIormConfigDbPlanArgs>> dbPlans) {
            $.dbPlans = dbPlans;
            return this;
        }

        /**
         * @param dbPlans (Updatable) Array of IORM Setting for all the database in this Exadata DB System
         * 
         * @return builder
         * 
         */
        public Builder dbPlans(List<ExadataIormConfigDbPlanArgs> dbPlans) {
            return dbPlans(Output.of(dbPlans));
        }

        /**
         * @param dbPlans (Updatable) Array of IORM Setting for all the database in this Exadata DB System
         * 
         * @return builder
         * 
         */
        public Builder dbPlans(ExadataIormConfigDbPlanArgs... dbPlans) {
            return dbPlans(List.of(dbPlans));
        }

        /**
         * @param dbSystemId (Updatable) The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(@Nullable Output<String> dbSystemId) {
            $.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * @param dbSystemId (Updatable) The DB system [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder dbSystemId(String dbSystemId) {
            return dbSystemId(Output.of(dbSystemId));
        }

        /**
         * @param lifecycleDetails Additional information about the current `lifecycleState`.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable Output<String> lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param lifecycleDetails Additional information about the current `lifecycleState`.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            return lifecycleDetails(Output.of(lifecycleDetails));
        }

        /**
         * @param objective (Updatable) Value for the IORM objective Default is &#34;Auto&#34;
         * 
         * @return builder
         * 
         */
        public Builder objective(@Nullable Output<String> objective) {
            $.objective = objective;
            return this;
        }

        /**
         * @param objective (Updatable) Value for the IORM objective Default is &#34;Auto&#34;
         * 
         * @return builder
         * 
         */
        public Builder objective(String objective) {
            return objective(Output.of(objective));
        }

        /**
         * @param state The current state of IORM configuration for the Exadata DB system.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of IORM configuration for the Exadata DB system.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        public ExadataIormConfigState build() {
            return $;
        }
    }

}
