// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Jms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FleetInventoryLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final FleetInventoryLogArgs Empty = new FleetInventoryLogArgs();

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log group.
     * 
     */
    @Import(name="logGroupId", required=true)
    private Output<String> logGroupId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log group.
     * 
     */
    public Output<String> logGroupId() {
        return this.logGroupId;
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log.
     * 
     */
    @Import(name="logId", required=true)
    private Output<String> logId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log.
     * 
     */
    public Output<String> logId() {
        return this.logId;
    }

    private FleetInventoryLogArgs() {}

    private FleetInventoryLogArgs(FleetInventoryLogArgs $) {
        this.logGroupId = $.logGroupId;
        this.logId = $.logId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FleetInventoryLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FleetInventoryLogArgs $;

        public Builder() {
            $ = new FleetInventoryLogArgs();
        }

        public Builder(FleetInventoryLogArgs defaults) {
            $ = new FleetInventoryLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logGroupId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log group.
         * 
         * @return builder
         * 
         */
        public Builder logGroupId(Output<String> logGroupId) {
            $.logGroupId = logGroupId;
            return this;
        }

        /**
         * @param logGroupId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log group.
         * 
         * @return builder
         * 
         */
        public Builder logGroupId(String logGroupId) {
            return logGroupId(Output.of(logGroupId));
        }

        /**
         * @param logId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log.
         * 
         * @return builder
         * 
         */
        public Builder logId(Output<String> logId) {
            $.logId = logId;
            return this;
        }

        /**
         * @param logId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log.
         * 
         * @return builder
         * 
         */
        public Builder logId(String logId) {
            return logId(Output.of(logId));
        }

        public FleetInventoryLogArgs build() {
            $.logGroupId = Objects.requireNonNull($.logGroupId, "expected parameter 'logGroupId' to be non-null");
            $.logId = Objects.requireNonNull($.logId, "expected parameter 'logId' to be non-null");
            return $;
        }
    }

}
