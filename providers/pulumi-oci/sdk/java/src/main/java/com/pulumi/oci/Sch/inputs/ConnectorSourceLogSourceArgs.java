// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Sch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectorSourceLogSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorSourceLogSourceArgs Empty = new ConnectorSourceLogSourceArgs();

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Logging Analytics log group.
     * 
     */
    @Import(name="logGroupId")
    private @Nullable Output<String> logGroupId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Logging Analytics log group.
     * 
     */
    public Optional<Output<String>> logGroupId() {
        return Optional.ofNullable(this.logGroupId);
    }

    /**
     * (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log.
     * 
     */
    @Import(name="logId")
    private @Nullable Output<String> logId;

    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the log.
     * 
     */
    public Optional<Output<String>> logId() {
        return Optional.ofNullable(this.logId);
    }

    private ConnectorSourceLogSourceArgs() {}

    private ConnectorSourceLogSourceArgs(ConnectorSourceLogSourceArgs $) {
        this.compartmentId = $.compartmentId;
        this.logGroupId = $.logGroupId;
        this.logId = $.logId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorSourceLogSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorSourceLogSourceArgs $;

        public Builder() {
            $ = new ConnectorSourceLogSourceArgs();
        }

        public Builder(ConnectorSourceLogSourceArgs defaults) {
            $ = new ConnectorSourceLogSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the metric.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param logGroupId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Logging Analytics log group.
         * 
         * @return builder
         * 
         */
        public Builder logGroupId(@Nullable Output<String> logGroupId) {
            $.logGroupId = logGroupId;
            return this;
        }

        /**
         * @param logGroupId (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Logging Analytics log group.
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
        public Builder logId(@Nullable Output<String> logId) {
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

        public ConnectorSourceLogSourceArgs build() {
            return $;
        }
    }

}
