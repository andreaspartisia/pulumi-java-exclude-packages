// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.MeteringComputation.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.MeteringComputation.outputs.GetCustomTableSavedCustomTable;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCustomTableResult {
    /**
     * @return The custom table compartment OCID.
     * 
     */
    private final String compartmentId;
    private final String customTableId;
    /**
     * @return The custom table OCID.
     * 
     */
    private final String id;
    /**
     * @return The custom table for Cost Analysis UI rendering.
     * 
     */
    private final List<GetCustomTableSavedCustomTable> savedCustomTables;
    /**
     * @return The custom table associated saved report OCID.
     * 
     */
    private final String savedReportId;

    @CustomType.Constructor
    private GetCustomTableResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("customTableId") String customTableId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("savedCustomTables") List<GetCustomTableSavedCustomTable> savedCustomTables,
        @CustomType.Parameter("savedReportId") String savedReportId) {
        this.compartmentId = compartmentId;
        this.customTableId = customTableId;
        this.id = id;
        this.savedCustomTables = savedCustomTables;
        this.savedReportId = savedReportId;
    }

    /**
     * @return The custom table compartment OCID.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public String customTableId() {
        return this.customTableId;
    }
    /**
     * @return The custom table OCID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The custom table for Cost Analysis UI rendering.
     * 
     */
    public List<GetCustomTableSavedCustomTable> savedCustomTables() {
        return this.savedCustomTables;
    }
    /**
     * @return The custom table associated saved report OCID.
     * 
     */
    public String savedReportId() {
        return this.savedReportId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomTableResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String customTableId;
        private String id;
        private List<GetCustomTableSavedCustomTable> savedCustomTables;
        private String savedReportId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomTableResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.customTableId = defaults.customTableId;
    	      this.id = defaults.id;
    	      this.savedCustomTables = defaults.savedCustomTables;
    	      this.savedReportId = defaults.savedReportId;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder customTableId(String customTableId) {
            this.customTableId = Objects.requireNonNull(customTableId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder savedCustomTables(List<GetCustomTableSavedCustomTable> savedCustomTables) {
            this.savedCustomTables = Objects.requireNonNull(savedCustomTables);
            return this;
        }
        public Builder savedCustomTables(GetCustomTableSavedCustomTable... savedCustomTables) {
            return savedCustomTables(List.of(savedCustomTables));
        }
        public Builder savedReportId(String savedReportId) {
            this.savedReportId = Objects.requireNonNull(savedReportId);
            return this;
        }        public GetCustomTableResult build() {
            return new GetCustomTableResult(compartmentId, customTableId, id, savedCustomTables, savedReportId);
        }
    }
}
