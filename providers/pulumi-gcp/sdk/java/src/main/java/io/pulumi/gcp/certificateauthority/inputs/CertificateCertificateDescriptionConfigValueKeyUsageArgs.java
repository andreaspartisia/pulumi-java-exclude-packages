// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageArgs();

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="baseKeyUsages")
    private final @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs>> baseKeyUsages;

    public Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs>> getBaseKeyUsages() {
        return this.baseKeyUsages == null ? Input.empty() : this.baseKeyUsages;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * Structure is documented below.
     * 
     */
    @InputImport(name="extendedKeyUsages")
    private final @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs>> extendedKeyUsages;

    public Input<List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs>> getExtendedKeyUsages() {
        return this.extendedKeyUsages == null ? Input.empty() : this.extendedKeyUsages;
    }

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * Structure is documented below.
     * 
     */
    @InputImport(name="unknownExtendedKeyUsages")
    private final @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

    public Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs>> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? Input.empty() : this.unknownExtendedKeyUsages;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageArgs(
        @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs>> baseKeyUsages,
        @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs>> extendedKeyUsages,
        @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
        this.baseKeyUsages = baseKeyUsages;
        this.extendedKeyUsages = extendedKeyUsages;
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageArgs() {
        this.baseKeyUsages = Input.empty();
        this.extendedKeyUsages = Input.empty();
        this.unknownExtendedKeyUsages = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs>> baseKeyUsages;
        private @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs>> extendedKeyUsages;
        private @Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsages = defaults.baseKeyUsages;
    	      this.extendedKeyUsages = defaults.extendedKeyUsages;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsages(@Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs>> baseKeyUsages) {
            this.baseKeyUsages = baseKeyUsages;
            return this;
        }

        public Builder setBaseKeyUsages(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageBaseKeyUsageArgs> baseKeyUsages) {
            this.baseKeyUsages = Input.ofNullable(baseKeyUsages);
            return this;
        }

        public Builder setExtendedKeyUsages(@Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs>> extendedKeyUsages) {
            this.extendedKeyUsages = extendedKeyUsages;
            return this;
        }

        public Builder setExtendedKeyUsages(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageExtendedKeyUsageArgs> extendedKeyUsages) {
            this.extendedKeyUsages = Input.ofNullable(extendedKeyUsages);
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable Input<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs>> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = Input.ofNullable(unknownExtendedKeyUsages);
            return this;
        }

        public CertificateCertificateDescriptionConfigValueKeyUsageArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageArgs(baseKeyUsages, extendedKeyUsages, unknownExtendedKeyUsages);
        }
    }
}