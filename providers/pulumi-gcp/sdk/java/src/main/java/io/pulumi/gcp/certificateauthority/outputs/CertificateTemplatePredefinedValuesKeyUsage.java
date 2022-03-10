// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage;
import io.pulumi.gcp.certificateauthority.outputs.CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsage;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateTemplatePredefinedValuesKeyUsage {
    /**
     * Describes high-level ways in which a key may be used.
     * 
     */
    private final @Nullable CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsage baseKeyUsage;
    /**
     * Detailed scenarios in which a key may be used.
     * 
     */
    private final @Nullable CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage extendedKeyUsage;
    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
     */
    private final @Nullable List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages;

    @OutputCustomType.Constructor
    private CertificateTemplatePredefinedValuesKeyUsage(
        @OutputCustomType.Parameter("baseKeyUsage") @Nullable CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsage baseKeyUsage,
        @OutputCustomType.Parameter("extendedKeyUsage") @Nullable CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage extendedKeyUsage,
        @OutputCustomType.Parameter("unknownExtendedKeyUsages") @Nullable List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages) {
        this.baseKeyUsage = baseKeyUsage;
        this.extendedKeyUsage = extendedKeyUsage;
        this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
    }

    /**
     * Describes high-level ways in which a key may be used.
     * 
    */
    public Optional<CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsage> getBaseKeyUsage() {
        return Optional.ofNullable(this.baseKeyUsage);
    }
    /**
     * Detailed scenarios in which a key may be used.
     * 
    */
    public Optional<CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage> getExtendedKeyUsage() {
        return Optional.ofNullable(this.extendedKeyUsage);
    }
    /**
     * Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message.
     * 
    */
    public List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsage> getUnknownExtendedKeyUsages() {
        return this.unknownExtendedKeyUsages == null ? List.of() : this.unknownExtendedKeyUsages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsage baseKeyUsage;
        private @Nullable CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage extendedKeyUsage;
        private @Nullable List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseKeyUsage = defaults.baseKeyUsage;
    	      this.extendedKeyUsage = defaults.extendedKeyUsage;
    	      this.unknownExtendedKeyUsages = defaults.unknownExtendedKeyUsages;
        }

        public Builder setBaseKeyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageBaseKeyUsage baseKeyUsage) {
            this.baseKeyUsage = baseKeyUsage;
            return this;
        }

        public Builder setExtendedKeyUsage(@Nullable CertificateTemplatePredefinedValuesKeyUsageExtendedKeyUsage extendedKeyUsage) {
            this.extendedKeyUsage = extendedKeyUsage;
            return this;
        }

        public Builder setUnknownExtendedKeyUsages(@Nullable List<CertificateTemplatePredefinedValuesKeyUsageUnknownExtendedKeyUsage> unknownExtendedKeyUsages) {
            this.unknownExtendedKeyUsages = unknownExtendedKeyUsages;
            return this;
        }
        public CertificateTemplatePredefinedValuesKeyUsage build() {
            return new CertificateTemplatePredefinedValuesKeyUsage(baseKeyUsage, extendedKeyUsage, unknownExtendedKeyUsages);
        }
    }
}
