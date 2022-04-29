// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTargetDatabasesSchemasSchema {
    /**
     * @return A filter to return only items related to specific type of schema.
     * 
     */
    private final Boolean isOracleMaintained;
    /**
     * @return A filter to return only items related to specific schema name.
     * 
     */
    private final String schemaName;

    @CustomType.Constructor
    private GetTargetDatabasesSchemasSchema(
        @CustomType.Parameter("isOracleMaintained") Boolean isOracleMaintained,
        @CustomType.Parameter("schemaName") String schemaName) {
        this.isOracleMaintained = isOracleMaintained;
        this.schemaName = schemaName;
    }

    /**
     * @return A filter to return only items related to specific type of schema.
     * 
     */
    public Boolean isOracleMaintained() {
        return this.isOracleMaintained;
    }
    /**
     * @return A filter to return only items related to specific schema name.
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetDatabasesSchemasSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isOracleMaintained;
        private String schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetDatabasesSchemasSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isOracleMaintained = defaults.isOracleMaintained;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder isOracleMaintained(Boolean isOracleMaintained) {
            this.isOracleMaintained = Objects.requireNonNull(isOracleMaintained);
            return this;
        }
        public Builder schemaName(String schemaName) {
            this.schemaName = Objects.requireNonNull(schemaName);
            return this;
        }        public GetTargetDatabasesSchemasSchema build() {
            return new GetTargetDatabasesSchemasSchema(isOracleMaintained, schemaName);
        }
    }
}
