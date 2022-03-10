// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference;
import java.util.Objects;

@OutputCustomType
public final class PreventionJobTriggerInspectJobStorageConfigBigQueryOptions {
    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
     */
    private final PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference tableReference;

    @OutputCustomType.Constructor
    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptions(@OutputCustomType.Parameter("tableReference") PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference tableReference) {
        this.tableReference = tableReference;
    }

    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
    */
    public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference getTableReference() {
        return this.tableReference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference tableReference;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableReference = defaults.tableReference;
        }

        public Builder setTableReference(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference tableReference) {
            this.tableReference = Objects.requireNonNull(tableReference);
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptions build() {
            return new PreventionJobTriggerInspectJobStorageConfigBigQueryOptions(tableReference);
        }
    }
}
