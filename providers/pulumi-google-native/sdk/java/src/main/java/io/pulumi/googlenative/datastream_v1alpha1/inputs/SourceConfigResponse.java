// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.MysqlSourceConfigResponse;
import io.pulumi.googlenative.datastream_v1alpha1.inputs.OracleSourceConfigResponse;
import java.lang.String;
import java.util.Objects;


/**
 * The configuration of the stream source.
 * 
 */
public final class SourceConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceConfigResponse Empty = new SourceConfigResponse();

    /**
     * MySQL data source configuration
     * 
     */
    @Import(name="mysqlSourceConfig", required=true)
      private final MysqlSourceConfigResponse mysqlSourceConfig;

    public MysqlSourceConfigResponse mysqlSourceConfig() {
        return this.mysqlSourceConfig;
    }

    /**
     * Oracle data source configuration
     * 
     */
    @Import(name="oracleSourceConfig", required=true)
      private final OracleSourceConfigResponse oracleSourceConfig;

    public OracleSourceConfigResponse oracleSourceConfig() {
        return this.oracleSourceConfig;
    }

    /**
     * Source connection profile identifier.
     * 
     */
    @Import(name="sourceConnectionProfileName", required=true)
      private final String sourceConnectionProfileName;

    public String sourceConnectionProfileName() {
        return this.sourceConnectionProfileName;
    }

    public SourceConfigResponse(
        MysqlSourceConfigResponse mysqlSourceConfig,
        OracleSourceConfigResponse oracleSourceConfig,
        String sourceConnectionProfileName) {
        this.mysqlSourceConfig = Objects.requireNonNull(mysqlSourceConfig, "expected parameter 'mysqlSourceConfig' to be non-null");
        this.oracleSourceConfig = Objects.requireNonNull(oracleSourceConfig, "expected parameter 'oracleSourceConfig' to be non-null");
        this.sourceConnectionProfileName = Objects.requireNonNull(sourceConnectionProfileName, "expected parameter 'sourceConnectionProfileName' to be non-null");
    }

    private SourceConfigResponse() {
        this.mysqlSourceConfig = null;
        this.oracleSourceConfig = null;
        this.sourceConnectionProfileName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlSourceConfigResponse mysqlSourceConfig;
        private OracleSourceConfigResponse oracleSourceConfig;
        private String sourceConnectionProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlSourceConfig = defaults.mysqlSourceConfig;
    	      this.oracleSourceConfig = defaults.oracleSourceConfig;
    	      this.sourceConnectionProfileName = defaults.sourceConnectionProfileName;
        }

        public Builder mysqlSourceConfig(MysqlSourceConfigResponse mysqlSourceConfig) {
            this.mysqlSourceConfig = Objects.requireNonNull(mysqlSourceConfig);
            return this;
        }
        public Builder oracleSourceConfig(OracleSourceConfigResponse oracleSourceConfig) {
            this.oracleSourceConfig = Objects.requireNonNull(oracleSourceConfig);
            return this;
        }
        public Builder sourceConnectionProfileName(String sourceConnectionProfileName) {
            this.sourceConnectionProfileName = Objects.requireNonNull(sourceConnectionProfileName);
            return this;
        }        public SourceConfigResponse build() {
            return new SourceConfigResponse(mysqlSourceConfig, oracleSourceConfig, sourceConnectionProfileName);
        }
    }
}
