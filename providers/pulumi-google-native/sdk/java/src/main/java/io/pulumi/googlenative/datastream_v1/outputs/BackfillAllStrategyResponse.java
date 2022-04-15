// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.datastream_v1.outputs.MysqlRdbmsResponse;
import io.pulumi.googlenative.datastream_v1.outputs.OracleRdbmsResponse;
import java.util.Objects;

@CustomType
public final class BackfillAllStrategyResponse {
    /**
     * MySQL data source objects to avoid backfilling.
     * 
     */
    private final MysqlRdbmsResponse mysqlExcludedObjects;
    /**
     * Oracle data source objects to avoid backfilling.
     * 
     */
    private final OracleRdbmsResponse oracleExcludedObjects;

    @CustomType.Constructor
    private BackfillAllStrategyResponse(
        @CustomType.Parameter("mysqlExcludedObjects") MysqlRdbmsResponse mysqlExcludedObjects,
        @CustomType.Parameter("oracleExcludedObjects") OracleRdbmsResponse oracleExcludedObjects) {
        this.mysqlExcludedObjects = mysqlExcludedObjects;
        this.oracleExcludedObjects = oracleExcludedObjects;
    }

    /**
     * MySQL data source objects to avoid backfilling.
     * 
    */
    public MysqlRdbmsResponse mysqlExcludedObjects() {
        return this.mysqlExcludedObjects;
    }
    /**
     * Oracle data source objects to avoid backfilling.
     * 
    */
    public OracleRdbmsResponse oracleExcludedObjects() {
        return this.oracleExcludedObjects;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackfillAllStrategyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlRdbmsResponse mysqlExcludedObjects;
        private OracleRdbmsResponse oracleExcludedObjects;

        public Builder() {
    	      // Empty
        }

        public Builder(BackfillAllStrategyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlExcludedObjects = defaults.mysqlExcludedObjects;
    	      this.oracleExcludedObjects = defaults.oracleExcludedObjects;
        }

        public Builder mysqlExcludedObjects(MysqlRdbmsResponse mysqlExcludedObjects) {
            this.mysqlExcludedObjects = Objects.requireNonNull(mysqlExcludedObjects);
            return this;
        }
        public Builder oracleExcludedObjects(OracleRdbmsResponse oracleExcludedObjects) {
            this.oracleExcludedObjects = Objects.requireNonNull(oracleExcludedObjects);
            return this;
        }        public BackfillAllStrategyResponse build() {
            return new BackfillAllStrategyResponse(mysqlExcludedObjects, oracleExcludedObjects);
        }
    }
}
