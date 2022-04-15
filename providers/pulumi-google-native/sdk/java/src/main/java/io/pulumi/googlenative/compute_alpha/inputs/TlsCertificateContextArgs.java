// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_alpha.enums.TlsCertificateContextCertificateSource;
import io.pulumi.googlenative.compute_alpha.inputs.SdsConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.TlsCertificatePathsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Deprecated] Defines the mechanism to obtain the client or server certificate. Defines the mechanism to obtain the client or server certificate.
 * 
 */
public final class TlsCertificateContextArgs extends io.pulumi.resources.ResourceArgs {

    public static final TlsCertificateContextArgs Empty = new TlsCertificateContextArgs();

    /**
     * Specifies the certificate and private key paths. This field is applicable only if tlsCertificateSource is set to USE_PATH.
     * 
     */
    @Import(name="certificatePaths")
      private final @Nullable Output<TlsCertificatePathsArgs> certificatePaths;

    public Output<TlsCertificatePathsArgs> certificatePaths() {
        return this.certificatePaths == null ? Codegen.empty() : this.certificatePaths;
    }

    /**
     * Defines how TLS certificates are obtained.
     * 
     */
    @Import(name="certificateSource")
      private final @Nullable Output<TlsCertificateContextCertificateSource> certificateSource;

    public Output<TlsCertificateContextCertificateSource> certificateSource() {
        return this.certificateSource == null ? Codegen.empty() : this.certificateSource;
    }

    /**
     * Specifies the config to retrieve certificates through SDS. This field is applicable only if tlsCertificateSource is set to USE_SDS.
     * 
     */
    @Import(name="sdsConfig")
      private final @Nullable Output<SdsConfigArgs> sdsConfig;

    public Output<SdsConfigArgs> sdsConfig() {
        return this.sdsConfig == null ? Codegen.empty() : this.sdsConfig;
    }

    public TlsCertificateContextArgs(
        @Nullable Output<TlsCertificatePathsArgs> certificatePaths,
        @Nullable Output<TlsCertificateContextCertificateSource> certificateSource,
        @Nullable Output<SdsConfigArgs> sdsConfig) {
        this.certificatePaths = certificatePaths;
        this.certificateSource = certificateSource;
        this.sdsConfig = sdsConfig;
    }

    private TlsCertificateContextArgs() {
        this.certificatePaths = Codegen.empty();
        this.certificateSource = Codegen.empty();
        this.sdsConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsCertificateContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TlsCertificatePathsArgs> certificatePaths;
        private @Nullable Output<TlsCertificateContextCertificateSource> certificateSource;
        private @Nullable Output<SdsConfigArgs> sdsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsCertificateContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificatePaths = defaults.certificatePaths;
    	      this.certificateSource = defaults.certificateSource;
    	      this.sdsConfig = defaults.sdsConfig;
        }

        public Builder certificatePaths(@Nullable Output<TlsCertificatePathsArgs> certificatePaths) {
            this.certificatePaths = certificatePaths;
            return this;
        }
        public Builder certificatePaths(@Nullable TlsCertificatePathsArgs certificatePaths) {
            this.certificatePaths = Codegen.ofNullable(certificatePaths);
            return this;
        }
        public Builder certificateSource(@Nullable Output<TlsCertificateContextCertificateSource> certificateSource) {
            this.certificateSource = certificateSource;
            return this;
        }
        public Builder certificateSource(@Nullable TlsCertificateContextCertificateSource certificateSource) {
            this.certificateSource = Codegen.ofNullable(certificateSource);
            return this;
        }
        public Builder sdsConfig(@Nullable Output<SdsConfigArgs> sdsConfig) {
            this.sdsConfig = sdsConfig;
            return this;
        }
        public Builder sdsConfig(@Nullable SdsConfigArgs sdsConfig) {
            this.sdsConfig = Codegen.ofNullable(sdsConfig);
            return this;
        }        public TlsCertificateContextArgs build() {
            return new TlsCertificateContextArgs(certificatePaths, certificateSource, sdsConfig);
        }
    }
}
