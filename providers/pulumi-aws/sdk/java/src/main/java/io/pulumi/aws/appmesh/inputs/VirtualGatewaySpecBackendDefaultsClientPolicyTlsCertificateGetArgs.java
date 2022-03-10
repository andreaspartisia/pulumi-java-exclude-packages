// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs Empty = new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs();

    /**
     * A local file certificate.
     * 
     */
    @InputImport(name="file")
      private final @Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file;

    public Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * A [Secret Discovery Service](https://www.envoyproxy.io/docs/envoy/latest/configuration/security/secret#secret-discovery-service-sds) certificate.
     * 
     */
    @InputImport(name="sds")
      private final @Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds;

    public Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> getSds() {
        return this.sds == null ? Input.empty() : this.sds;
    }

    public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs(
        @Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file,
        @Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds) {
        this.file = file;
        this.sds = sds;
    }

    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs() {
        this.file = Input.empty();
        this.sds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file;
        private @Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
    	      this.sds = defaults.sds;
        }

        public Builder setFile(@Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs> file) {
            this.file = file;
            return this;
        }

        public Builder setFile(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateFileGetArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder setSds(@Nullable Input<VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs> sds) {
            this.sds = sds;
            return this;
        }

        public Builder setSds(@Nullable VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateSdsGetArgs sds) {
            this.sds = Input.ofNullable(sds);
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsCertificateGetArgs(file, sds);
        }
    }
}