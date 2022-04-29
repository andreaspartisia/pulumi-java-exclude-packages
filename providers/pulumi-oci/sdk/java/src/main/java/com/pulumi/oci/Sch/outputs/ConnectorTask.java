// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Sch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorTask {
    /**
     * @return (Updatable) Size limit (kilobytes) for batch sent to invoke the function.
     * 
     */
    private final @Nullable Integer batchSizeInKbs;
    /**
     * @return (Updatable) Time limit (seconds) for batch sent to invoke the function.
     * 
     */
    private final @Nullable Integer batchTimeInSec;
    /**
     * @return (Updatable) A filter or mask to limit the source used in the flow defined by the service connector.
     * 
     */
    private final @Nullable String condition;
    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the function to be used as a task.
     * 
     */
    private final @Nullable String functionId;
    /**
     * @return (Updatable) The type descriminator.
     * 
     */
    private final String kind;

    @CustomType.Constructor
    private ConnectorTask(
        @CustomType.Parameter("batchSizeInKbs") @Nullable Integer batchSizeInKbs,
        @CustomType.Parameter("batchTimeInSec") @Nullable Integer batchTimeInSec,
        @CustomType.Parameter("condition") @Nullable String condition,
        @CustomType.Parameter("functionId") @Nullable String functionId,
        @CustomType.Parameter("kind") String kind) {
        this.batchSizeInKbs = batchSizeInKbs;
        this.batchTimeInSec = batchTimeInSec;
        this.condition = condition;
        this.functionId = functionId;
        this.kind = kind;
    }

    /**
     * @return (Updatable) Size limit (kilobytes) for batch sent to invoke the function.
     * 
     */
    public Optional<Integer> batchSizeInKbs() {
        return Optional.ofNullable(this.batchSizeInKbs);
    }
    /**
     * @return (Updatable) Time limit (seconds) for batch sent to invoke the function.
     * 
     */
    public Optional<Integer> batchTimeInSec() {
        return Optional.ofNullable(this.batchTimeInSec);
    }
    /**
     * @return (Updatable) A filter or mask to limit the source used in the flow defined by the service connector.
     * 
     */
    public Optional<String> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return (Updatable) The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the function to be used as a task.
     * 
     */
    public Optional<String> functionId() {
        return Optional.ofNullable(this.functionId);
    }
    /**
     * @return (Updatable) The type descriminator.
     * 
     */
    public String kind() {
        return this.kind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer batchSizeInKbs;
        private @Nullable Integer batchTimeInSec;
        private @Nullable String condition;
        private @Nullable String functionId;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.batchSizeInKbs = defaults.batchSizeInKbs;
    	      this.batchTimeInSec = defaults.batchTimeInSec;
    	      this.condition = defaults.condition;
    	      this.functionId = defaults.functionId;
    	      this.kind = defaults.kind;
        }

        public Builder batchSizeInKbs(@Nullable Integer batchSizeInKbs) {
            this.batchSizeInKbs = batchSizeInKbs;
            return this;
        }
        public Builder batchTimeInSec(@Nullable Integer batchTimeInSec) {
            this.batchTimeInSec = batchTimeInSec;
            return this;
        }
        public Builder condition(@Nullable String condition) {
            this.condition = condition;
            return this;
        }
        public Builder functionId(@Nullable String functionId) {
            this.functionId = functionId;
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public ConnectorTask build() {
            return new ConnectorTask(batchSizeInKbs, batchTimeInSec, condition, functionId, kind);
        }
    }
}
