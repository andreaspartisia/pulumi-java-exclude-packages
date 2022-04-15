// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudkms_v1.enums.CryptoKeyVersionTemplateAlgorithm;
import io.pulumi.googlenative.cloudkms_v1.enums.CryptoKeyVersionTemplateProtectionLevel;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A CryptoKeyVersionTemplate specifies the properties to use when creating a new CryptoKeyVersion, either manually with CreateCryptoKeyVersion or automatically as a result of auto-rotation.
 * 
 */
public final class CryptoKeyVersionTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CryptoKeyVersionTemplateArgs Empty = new CryptoKeyVersionTemplateArgs();

    /**
     * Algorithm to use when creating a CryptoKeyVersion based on this template. For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is implied if both this field is omitted and CryptoKey.purpose is ENCRYPT_DECRYPT.
     * 
     */
    @Import(name="algorithm", required=true)
      private final Output<CryptoKeyVersionTemplateAlgorithm> algorithm;

    public Output<CryptoKeyVersionTemplateAlgorithm> algorithm() {
        return this.algorithm;
    }

    /**
     * ProtectionLevel to use when creating a CryptoKeyVersion based on this template. Immutable. Defaults to SOFTWARE.
     * 
     */
    @Import(name="protectionLevel")
      private final @Nullable Output<CryptoKeyVersionTemplateProtectionLevel> protectionLevel;

    public Output<CryptoKeyVersionTemplateProtectionLevel> protectionLevel() {
        return this.protectionLevel == null ? Codegen.empty() : this.protectionLevel;
    }

    public CryptoKeyVersionTemplateArgs(
        Output<CryptoKeyVersionTemplateAlgorithm> algorithm,
        @Nullable Output<CryptoKeyVersionTemplateProtectionLevel> protectionLevel) {
        this.algorithm = Objects.requireNonNull(algorithm, "expected parameter 'algorithm' to be non-null");
        this.protectionLevel = protectionLevel;
    }

    private CryptoKeyVersionTemplateArgs() {
        this.algorithm = Codegen.empty();
        this.protectionLevel = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CryptoKeyVersionTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CryptoKeyVersionTemplateAlgorithm> algorithm;
        private @Nullable Output<CryptoKeyVersionTemplateProtectionLevel> protectionLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(CryptoKeyVersionTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.protectionLevel = defaults.protectionLevel;
        }

        public Builder algorithm(Output<CryptoKeyVersionTemplateAlgorithm> algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder algorithm(CryptoKeyVersionTemplateAlgorithm algorithm) {
            this.algorithm = Output.of(Objects.requireNonNull(algorithm));
            return this;
        }
        public Builder protectionLevel(@Nullable Output<CryptoKeyVersionTemplateProtectionLevel> protectionLevel) {
            this.protectionLevel = protectionLevel;
            return this;
        }
        public Builder protectionLevel(@Nullable CryptoKeyVersionTemplateProtectionLevel protectionLevel) {
            this.protectionLevel = Codegen.ofNullable(protectionLevel);
            return this;
        }        public CryptoKeyVersionTemplateArgs build() {
            return new CryptoKeyVersionTemplateArgs(algorithm, protectionLevel);
        }
    }
}
