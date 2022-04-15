// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.privateca_v1beta1.enums.CertificateAuthorityTier;
import io.pulumi.googlenative.privateca_v1beta1.enums.CertificateAuthorityType;
import io.pulumi.googlenative.privateca_v1beta1.inputs.CertificateAuthorityPolicyArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.CertificateConfigArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.IssuingOptionsArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.KeyVersionSpecArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.SubordinateConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityArgs Empty = new CertificateAuthorityArgs();

    @Import(name="certificateAuthorityId", required=true)
      private final Output<String> certificateAuthorityId;

    public Output<String> certificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    /**
     * Optional. The CertificateAuthorityPolicy to enforce when issuing Certificates from this CertificateAuthority.
     * 
     */
    @Import(name="certificatePolicy")
      private final @Nullable Output<CertificateAuthorityPolicyArgs> certificatePolicy;

    public Output<CertificateAuthorityPolicyArgs> certificatePolicy() {
        return this.certificatePolicy == null ? Codegen.empty() : this.certificatePolicy;
    }

    /**
     * Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    @Import(name="config", required=true)
      private final Output<CertificateConfigArgs> config;

    public Output<CertificateConfigArgs> config() {
        return this.config;
    }

    /**
     * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    @Import(name="gcsBucket")
      private final @Nullable Output<String> gcsBucket;

    public Output<String> gcsBucket() {
        return this.gcsBucket == null ? Codegen.empty() : this.gcsBucket;
    }

    /**
     * Optional. The IssuingOptions to follow when issuing Certificates from this CertificateAuthority.
     * 
     */
    @Import(name="issuingOptions")
      private final @Nullable Output<IssuingOptionsArgs> issuingOptions;

    public Output<IssuingOptionsArgs> issuingOptions() {
        return this.issuingOptions == null ? Codegen.empty() : this.issuingOptions;
    }

    /**
     * Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    @Import(name="keySpec", required=true)
      private final Output<KeyVersionSpecArgs> keySpec;

    public Output<KeyVersionSpecArgs> keySpec() {
        return this.keySpec;
    }

    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate.
     * 
     */
    @Import(name="lifetime", required=true)
      private final Output<String> lifetime;

    public Output<String> lifetime() {
        return this.lifetime;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    @Import(name="subordinateConfig")
      private final @Nullable Output<SubordinateConfigArgs> subordinateConfig;

    public Output<SubordinateConfigArgs> subordinateConfig() {
        return this.subordinateConfig == null ? Codegen.empty() : this.subordinateConfig;
    }

    /**
     * Immutable. The Tier of this CertificateAuthority.
     * 
     */
    @Import(name="tier", required=true)
      private final Output<CertificateAuthorityTier> tier;

    public Output<CertificateAuthorityTier> tier() {
        return this.tier;
    }

    /**
     * Immutable. The Type of this CertificateAuthority.
     * 
     */
    @Import(name="type", required=true)
      private final Output<CertificateAuthorityType> type;

    public Output<CertificateAuthorityType> type() {
        return this.type;
    }

    public CertificateAuthorityArgs(
        Output<String> certificateAuthorityId,
        @Nullable Output<CertificateAuthorityPolicyArgs> certificatePolicy,
        Output<CertificateConfigArgs> config,
        @Nullable Output<String> gcsBucket,
        @Nullable Output<IssuingOptionsArgs> issuingOptions,
        Output<KeyVersionSpecArgs> keySpec,
        @Nullable Output<Map<String,String>> labels,
        Output<String> lifetime,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<SubordinateConfigArgs> subordinateConfig,
        Output<CertificateAuthorityTier> tier,
        Output<CertificateAuthorityType> type) {
        this.certificateAuthorityId = Objects.requireNonNull(certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
        this.certificatePolicy = certificatePolicy;
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.gcsBucket = gcsBucket;
        this.issuingOptions = issuingOptions;
        this.keySpec = Objects.requireNonNull(keySpec, "expected parameter 'keySpec' to be non-null");
        this.labels = labels;
        this.lifetime = Objects.requireNonNull(lifetime, "expected parameter 'lifetime' to be non-null");
        this.location = location;
        this.project = project;
        this.requestId = requestId;
        this.subordinateConfig = subordinateConfig;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CertificateAuthorityArgs() {
        this.certificateAuthorityId = Codegen.empty();
        this.certificatePolicy = Codegen.empty();
        this.config = Codegen.empty();
        this.gcsBucket = Codegen.empty();
        this.issuingOptions = Codegen.empty();
        this.keySpec = Codegen.empty();
        this.labels = Codegen.empty();
        this.lifetime = Codegen.empty();
        this.location = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.subordinateConfig = Codegen.empty();
        this.tier = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificateAuthorityId;
        private @Nullable Output<CertificateAuthorityPolicyArgs> certificatePolicy;
        private Output<CertificateConfigArgs> config;
        private @Nullable Output<String> gcsBucket;
        private @Nullable Output<IssuingOptionsArgs> issuingOptions;
        private Output<KeyVersionSpecArgs> keySpec;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> lifetime;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<SubordinateConfigArgs> subordinateConfig;
        private Output<CertificateAuthorityTier> tier;
        private Output<CertificateAuthorityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityId = defaults.certificateAuthorityId;
    	      this.certificatePolicy = defaults.certificatePolicy;
    	      this.config = defaults.config;
    	      this.gcsBucket = defaults.gcsBucket;
    	      this.issuingOptions = defaults.issuingOptions;
    	      this.keySpec = defaults.keySpec;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.subordinateConfig = defaults.subordinateConfig;
    	      this.tier = defaults.tier;
    	      this.type = defaults.type;
        }

        public Builder certificateAuthorityId(Output<String> certificateAuthorityId) {
            this.certificateAuthorityId = Objects.requireNonNull(certificateAuthorityId);
            return this;
        }
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = Output.of(Objects.requireNonNull(certificateAuthorityId));
            return this;
        }
        public Builder certificatePolicy(@Nullable Output<CertificateAuthorityPolicyArgs> certificatePolicy) {
            this.certificatePolicy = certificatePolicy;
            return this;
        }
        public Builder certificatePolicy(@Nullable CertificateAuthorityPolicyArgs certificatePolicy) {
            this.certificatePolicy = Codegen.ofNullable(certificatePolicy);
            return this;
        }
        public Builder config(Output<CertificateConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder config(CertificateConfigArgs config) {
            this.config = Output.of(Objects.requireNonNull(config));
            return this;
        }
        public Builder gcsBucket(@Nullable Output<String> gcsBucket) {
            this.gcsBucket = gcsBucket;
            return this;
        }
        public Builder gcsBucket(@Nullable String gcsBucket) {
            this.gcsBucket = Codegen.ofNullable(gcsBucket);
            return this;
        }
        public Builder issuingOptions(@Nullable Output<IssuingOptionsArgs> issuingOptions) {
            this.issuingOptions = issuingOptions;
            return this;
        }
        public Builder issuingOptions(@Nullable IssuingOptionsArgs issuingOptions) {
            this.issuingOptions = Codegen.ofNullable(issuingOptions);
            return this;
        }
        public Builder keySpec(Output<KeyVersionSpecArgs> keySpec) {
            this.keySpec = Objects.requireNonNull(keySpec);
            return this;
        }
        public Builder keySpec(KeyVersionSpecArgs keySpec) {
            this.keySpec = Output.of(Objects.requireNonNull(keySpec));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder lifetime(Output<String> lifetime) {
            this.lifetime = Objects.requireNonNull(lifetime);
            return this;
        }
        public Builder lifetime(String lifetime) {
            this.lifetime = Output.of(Objects.requireNonNull(lifetime));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder subordinateConfig(@Nullable Output<SubordinateConfigArgs> subordinateConfig) {
            this.subordinateConfig = subordinateConfig;
            return this;
        }
        public Builder subordinateConfig(@Nullable SubordinateConfigArgs subordinateConfig) {
            this.subordinateConfig = Codegen.ofNullable(subordinateConfig);
            return this;
        }
        public Builder tier(Output<CertificateAuthorityTier> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder tier(CertificateAuthorityTier tier) {
            this.tier = Output.of(Objects.requireNonNull(tier));
            return this;
        }
        public Builder type(Output<CertificateAuthorityType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(CertificateAuthorityType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public CertificateAuthorityArgs build() {
            return new CertificateAuthorityArgs(certificateAuthorityId, certificatePolicy, config, gcsBucket, issuingOptions, keySpec, labels, lifetime, location, project, requestId, subordinateConfig, tier, type);
        }
    }
}
