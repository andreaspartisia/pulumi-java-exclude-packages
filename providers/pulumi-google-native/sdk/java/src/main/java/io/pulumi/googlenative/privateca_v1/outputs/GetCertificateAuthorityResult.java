// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.privateca_v1.outputs.AccessUrlsResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateConfigResponse;
import io.pulumi.googlenative.privateca_v1.outputs.CertificateDescriptionResponse;
import io.pulumi.googlenative.privateca_v1.outputs.KeyVersionSpecResponse;
import io.pulumi.googlenative.privateca_v1.outputs.SubordinateConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCertificateAuthorityResult {
    /**
     * URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
     */
    private final AccessUrlsResponse accessUrls;
    /**
     * A structured description of this CertificateAuthority's CA certificate and its issuers. Ordered as self-to-root.
     * 
     */
    private final List<CertificateDescriptionResponse> caCertificateDescriptions;
    /**
     * Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    private final CertificateConfigResponse config;
    /**
     * The time at which this CertificateAuthority was created.
     * 
     */
    private final String createTime;
    /**
     * The time at which this CertificateAuthority was soft deleted, if it is in the DELETED state.
     * 
     */
    private final String deleteTime;
    /**
     * The time at which this CertificateAuthority will be permanently purged, if it is in the DELETED state.
     * 
     */
    private final String expireTime;
    /**
     * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    private final String gcsBucket;
    /**
     * Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    private final KeyVersionSpecResponse keySpec;
    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Immutable. The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate.
     * 
     */
    private final String lifetime;
    /**
     * The resource name for this CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
     */
    private final String name;
    /**
     * This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority's certificate.
     * 
     */
    private final List<String> pemCaCertificates;
    /**
     * The State for this CertificateAuthority.
     * 
     */
    private final String state;
    /**
     * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    private final SubordinateConfigResponse subordinateConfig;
    /**
     * The CaPool.Tier of the CaPool that includes this CertificateAuthority.
     * 
     */
    private final String tier;
    /**
     * Immutable. The Type of this CertificateAuthority.
     * 
     */
    private final String type;
    /**
     * The time at which this CertificateAuthority was last updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetCertificateAuthorityResult(
        @CustomType.Parameter("accessUrls") AccessUrlsResponse accessUrls,
        @CustomType.Parameter("caCertificateDescriptions") List<CertificateDescriptionResponse> caCertificateDescriptions,
        @CustomType.Parameter("config") CertificateConfigResponse config,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("deleteTime") String deleteTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("gcsBucket") String gcsBucket,
        @CustomType.Parameter("keySpec") KeyVersionSpecResponse keySpec,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lifetime") String lifetime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pemCaCertificates") List<String> pemCaCertificates,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("subordinateConfig") SubordinateConfigResponse subordinateConfig,
        @CustomType.Parameter("tier") String tier,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.accessUrls = accessUrls;
        this.caCertificateDescriptions = caCertificateDescriptions;
        this.config = config;
        this.createTime = createTime;
        this.deleteTime = deleteTime;
        this.expireTime = expireTime;
        this.gcsBucket = gcsBucket;
        this.keySpec = keySpec;
        this.labels = labels;
        this.lifetime = lifetime;
        this.name = name;
        this.pemCaCertificates = pemCaCertificates;
        this.state = state;
        this.subordinateConfig = subordinateConfig;
        this.tier = tier;
        this.type = type;
        this.updateTime = updateTime;
    }

    /**
     * URLs for accessing content published by this CA, such as the CA certificate and CRLs.
     * 
    */
    public AccessUrlsResponse accessUrls() {
        return this.accessUrls;
    }
    /**
     * A structured description of this CertificateAuthority's CA certificate and its issuers. Ordered as self-to-root.
     * 
    */
    public List<CertificateDescriptionResponse> caCertificateDescriptions() {
        return this.caCertificateDescriptions;
    }
    /**
     * Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
    */
    public CertificateConfigResponse config() {
        return this.config;
    }
    /**
     * The time at which this CertificateAuthority was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The time at which this CertificateAuthority was soft deleted, if it is in the DELETED state.
     * 
    */
    public String deleteTime() {
        return this.deleteTime;
    }
    /**
     * The time at which this CertificateAuthority will be permanently purged, if it is in the DELETED state.
     * 
    */
    public String expireTime() {
        return this.expireTime;
    }
    /**
     * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
    */
    public String gcsBucket() {
        return this.gcsBucket;
    }
    /**
     * Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
    */
    public KeyVersionSpecResponse keySpec() {
        return this.keySpec;
    }
    /**
     * Optional. Labels with user-defined metadata.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * Immutable. The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate.
     * 
    */
    public String lifetime() {
        return this.lifetime;
    }
    /**
     * The resource name for this CertificateAuthority in the format `projects/*{@literal /}locations/*{@literal /}caPools/*{@literal /}certificateAuthorities/*`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * This CertificateAuthority's certificate chain, including the current CertificateAuthority's certificate. Ordered such that the root issuer is the final element (consistent with RFC 5246). For a self-signed CA, this will only list the current CertificateAuthority's certificate.
     * 
    */
    public List<String> pemCaCertificates() {
        return this.pemCaCertificates;
    }
    /**
     * The State for this CertificateAuthority.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
    */
    public SubordinateConfigResponse subordinateConfig() {
        return this.subordinateConfig;
    }
    /**
     * The CaPool.Tier of the CaPool that includes this CertificateAuthority.
     * 
    */
    public String tier() {
        return this.tier;
    }
    /**
     * Immutable. The Type of this CertificateAuthority.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The time at which this CertificateAuthority was last updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessUrlsResponse accessUrls;
        private List<CertificateDescriptionResponse> caCertificateDescriptions;
        private CertificateConfigResponse config;
        private String createTime;
        private String deleteTime;
        private String expireTime;
        private String gcsBucket;
        private KeyVersionSpecResponse keySpec;
        private Map<String,String> labels;
        private String lifetime;
        private String name;
        private List<String> pemCaCertificates;
        private String state;
        private SubordinateConfigResponse subordinateConfig;
        private String tier;
        private String type;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessUrls = defaults.accessUrls;
    	      this.caCertificateDescriptions = defaults.caCertificateDescriptions;
    	      this.config = defaults.config;
    	      this.createTime = defaults.createTime;
    	      this.deleteTime = defaults.deleteTime;
    	      this.expireTime = defaults.expireTime;
    	      this.gcsBucket = defaults.gcsBucket;
    	      this.keySpec = defaults.keySpec;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.name = defaults.name;
    	      this.pemCaCertificates = defaults.pemCaCertificates;
    	      this.state = defaults.state;
    	      this.subordinateConfig = defaults.subordinateConfig;
    	      this.tier = defaults.tier;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder accessUrls(AccessUrlsResponse accessUrls) {
            this.accessUrls = Objects.requireNonNull(accessUrls);
            return this;
        }
        public Builder caCertificateDescriptions(List<CertificateDescriptionResponse> caCertificateDescriptions) {
            this.caCertificateDescriptions = Objects.requireNonNull(caCertificateDescriptions);
            return this;
        }
        public Builder caCertificateDescriptions(CertificateDescriptionResponse... caCertificateDescriptions) {
            return caCertificateDescriptions(List.of(caCertificateDescriptions));
        }
        public Builder config(CertificateConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder gcsBucket(String gcsBucket) {
            this.gcsBucket = Objects.requireNonNull(gcsBucket);
            return this;
        }
        public Builder keySpec(KeyVersionSpecResponse keySpec) {
            this.keySpec = Objects.requireNonNull(keySpec);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lifetime(String lifetime) {
            this.lifetime = Objects.requireNonNull(lifetime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pemCaCertificates(List<String> pemCaCertificates) {
            this.pemCaCertificates = Objects.requireNonNull(pemCaCertificates);
            return this;
        }
        public Builder pemCaCertificates(String... pemCaCertificates) {
            return pemCaCertificates(List.of(pemCaCertificates));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder subordinateConfig(SubordinateConfigResponse subordinateConfig) {
            this.subordinateConfig = Objects.requireNonNull(subordinateConfig);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetCertificateAuthorityResult build() {
            return new GetCertificateAuthorityResult(accessUrls, caCertificateDescriptions, config, createTime, deleteTime, expireTime, gcsBucket, keySpec, labels, lifetime, name, pemCaCertificates, state, subordinateConfig, tier, type, updateTime);
        }
    }
}
