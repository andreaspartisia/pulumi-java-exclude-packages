// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.metastore_v1alpha.outputs.KerberosConfigResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class HiveMetastoreConfigResponse {
    /**
     * A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service's primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
     */
    private final Map<String,String> auxiliaryVersions;
    /**
     * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version's AuxiliaryVersionConfig.
     * 
     */
    private final Map<String,String> configOverrides;
    /**
     * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
     * 
     */
    private final String endpointProtocol;
    /**
     * Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field's path (hive_metastore_config.kerberos_config) in the request's update_mask while omitting this field from the request's service.
     * 
     */
    private final KerberosConfigResponse kerberosConfig;
    /**
     * Immutable. The Hive metastore schema version.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private HiveMetastoreConfigResponse(
        @CustomType.Parameter("auxiliaryVersions") Map<String,String> auxiliaryVersions,
        @CustomType.Parameter("configOverrides") Map<String,String> configOverrides,
        @CustomType.Parameter("endpointProtocol") String endpointProtocol,
        @CustomType.Parameter("kerberosConfig") KerberosConfigResponse kerberosConfig,
        @CustomType.Parameter("version") String version) {
        this.auxiliaryVersions = auxiliaryVersions;
        this.configOverrides = configOverrides;
        this.endpointProtocol = endpointProtocol;
        this.kerberosConfig = kerberosConfig;
        this.version = version;
    }

    /**
     * A mapping of Hive metastore version to the auxiliary version configuration. When specified, a secondary Hive metastore service is created along with the primary service. All auxiliary versions must be less than the service's primary version. The key is the auxiliary service name and it must match the regular expression a-z?. This means that the first character must be a lowercase letter, and all the following characters must be hyphens, lowercase letters, or digits, except the last character, which cannot be a hyphen.
     * 
    */
    public Map<String,String> auxiliaryVersions() {
        return this.auxiliaryVersions;
    }
    /**
     * A mapping of Hive metastore configuration key-value pairs to apply to the Hive metastore (configured in hive-site.xml). The mappings override system defaults (some keys cannot be overridden). These overrides are also applied to auxiliary versions and can be further customized in the auxiliary version's AuxiliaryVersionConfig.
     * 
    */
    public Map<String,String> configOverrides() {
        return this.configOverrides;
    }
    /**
     * The protocol to use for the metastore service endpoint. If unspecified, defaults to THRIFT.
     * 
    */
    public String endpointProtocol() {
        return this.endpointProtocol;
    }
    /**
     * Information used to configure the Hive metastore service as a service principal in a Kerberos realm. To disable Kerberos, use the UpdateService method and specify this field's path (hive_metastore_config.kerberos_config) in the request's update_mask while omitting this field from the request's service.
     * 
    */
    public KerberosConfigResponse kerberosConfig() {
        return this.kerberosConfig;
    }
    /**
     * Immutable. The Hive metastore schema version.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HiveMetastoreConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> auxiliaryVersions;
        private Map<String,String> configOverrides;
        private String endpointProtocol;
        private KerberosConfigResponse kerberosConfig;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(HiveMetastoreConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auxiliaryVersions = defaults.auxiliaryVersions;
    	      this.configOverrides = defaults.configOverrides;
    	      this.endpointProtocol = defaults.endpointProtocol;
    	      this.kerberosConfig = defaults.kerberosConfig;
    	      this.version = defaults.version;
        }

        public Builder auxiliaryVersions(Map<String,String> auxiliaryVersions) {
            this.auxiliaryVersions = Objects.requireNonNull(auxiliaryVersions);
            return this;
        }
        public Builder configOverrides(Map<String,String> configOverrides) {
            this.configOverrides = Objects.requireNonNull(configOverrides);
            return this;
        }
        public Builder endpointProtocol(String endpointProtocol) {
            this.endpointProtocol = Objects.requireNonNull(endpointProtocol);
            return this;
        }
        public Builder kerberosConfig(KerberosConfigResponse kerberosConfig) {
            this.kerberosConfig = Objects.requireNonNull(kerberosConfig);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public HiveMetastoreConfigResponse build() {
            return new HiveMetastoreConfigResponse(auxiliaryVersions, configOverrides, endpointProtocol, kerberosConfig, version);
        }
    }
}
