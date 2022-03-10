// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CaPoolIssuancePolicyBaselineValuesKeyUsageBaseKeyUsage {
    /**
     * The key may be used to sign certificates.
     * 
     */
    private final @Nullable Boolean certSign;
    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation".
     * 
     */
    private final @Nullable Boolean contentCommitment;
    /**
     * The key may be used sign certificate revocation lists.
     * 
     */
    private final @Nullable Boolean crlSign;
    /**
     * The key may be used to encipher data.
     * 
     */
    private final @Nullable Boolean dataEncipherment;
    /**
     * The key may be used to decipher only.
     * 
     */
    private final @Nullable Boolean decipherOnly;
    /**
     * The key may be used for digital signatures.
     * 
     */
    private final @Nullable Boolean digitalSignature;
    /**
     * The key may be used to encipher only.
     * 
     */
    private final @Nullable Boolean encipherOnly;
    /**
     * The key may be used in a key agreement protocol.
     * 
     */
    private final @Nullable Boolean keyAgreement;
    /**
     * The key may be used to encipher other keys.
     * 
     */
    private final @Nullable Boolean keyEncipherment;

    @OutputCustomType.Constructor
    private CaPoolIssuancePolicyBaselineValuesKeyUsageBaseKeyUsage(
        @OutputCustomType.Parameter("certSign") @Nullable Boolean certSign,
        @OutputCustomType.Parameter("contentCommitment") @Nullable Boolean contentCommitment,
        @OutputCustomType.Parameter("crlSign") @Nullable Boolean crlSign,
        @OutputCustomType.Parameter("dataEncipherment") @Nullable Boolean dataEncipherment,
        @OutputCustomType.Parameter("decipherOnly") @Nullable Boolean decipherOnly,
        @OutputCustomType.Parameter("digitalSignature") @Nullable Boolean digitalSignature,
        @OutputCustomType.Parameter("encipherOnly") @Nullable Boolean encipherOnly,
        @OutputCustomType.Parameter("keyAgreement") @Nullable Boolean keyAgreement,
        @OutputCustomType.Parameter("keyEncipherment") @Nullable Boolean keyEncipherment) {
        this.certSign = certSign;
        this.contentCommitment = contentCommitment;
        this.crlSign = crlSign;
        this.dataEncipherment = dataEncipherment;
        this.decipherOnly = decipherOnly;
        this.digitalSignature = digitalSignature;
        this.encipherOnly = encipherOnly;
        this.keyAgreement = keyAgreement;
        this.keyEncipherment = keyEncipherment;
    }

    /**
     * The key may be used to sign certificates.
     * 
    */
    public Optional<Boolean> getCertSign() {
        return Optional.ofNullable(this.certSign);
    }
    /**
     * The key may be used for cryptographic commitments. Note that this may also be referred to as "non-repudiation".
     * 
    */
    public Optional<Boolean> getContentCommitment() {
        return Optional.ofNullable(this.contentCommitment);
    }
    /**
     * The key may be used sign certificate revocation lists.
     * 
    */
    public Optional<Boolean> getCrlSign() {
        return Optional.ofNullable(this.crlSign);
    }
    /**
     * The key may be used to encipher data.
     * 
    */
    public Optional<Boolean> getDataEncipherment() {
        return Optional.ofNullable(this.dataEncipherment);
    }
    /**
     * The key may be used to decipher only.
     * 
    */
    public Optional<Boolean> getDecipherOnly() {
        return Optional.ofNullable(this.decipherOnly);
    }
    /**
     * The key may be used for digital signatures.
     * 
    */
    public Optional<Boolean> getDigitalSignature() {
        return Optional.ofNullable(this.digitalSignature);
    }
    /**
     * The key may be used to encipher only.
     * 
    */
    public Optional<Boolean> getEncipherOnly() {
        return Optional.ofNullable(this.encipherOnly);
    }
    /**
     * The key may be used in a key agreement protocol.
     * 
    */
    public Optional<Boolean> getKeyAgreement() {
        return Optional.ofNullable(this.keyAgreement);
    }
    /**
     * The key may be used to encipher other keys.
     * 
    */
    public Optional<Boolean> getKeyEncipherment() {
        return Optional.ofNullable(this.keyEncipherment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyBaselineValuesKeyUsageBaseKeyUsage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean certSign;
        private @Nullable Boolean contentCommitment;
        private @Nullable Boolean crlSign;
        private @Nullable Boolean dataEncipherment;
        private @Nullable Boolean decipherOnly;
        private @Nullable Boolean digitalSignature;
        private @Nullable Boolean encipherOnly;
        private @Nullable Boolean keyAgreement;
        private @Nullable Boolean keyEncipherment;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyBaselineValuesKeyUsageBaseKeyUsage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certSign = defaults.certSign;
    	      this.contentCommitment = defaults.contentCommitment;
    	      this.crlSign = defaults.crlSign;
    	      this.dataEncipherment = defaults.dataEncipherment;
    	      this.decipherOnly = defaults.decipherOnly;
    	      this.digitalSignature = defaults.digitalSignature;
    	      this.encipherOnly = defaults.encipherOnly;
    	      this.keyAgreement = defaults.keyAgreement;
    	      this.keyEncipherment = defaults.keyEncipherment;
        }

        public Builder setCertSign(@Nullable Boolean certSign) {
            this.certSign = certSign;
            return this;
        }

        public Builder setContentCommitment(@Nullable Boolean contentCommitment) {
            this.contentCommitment = contentCommitment;
            return this;
        }

        public Builder setCrlSign(@Nullable Boolean crlSign) {
            this.crlSign = crlSign;
            return this;
        }

        public Builder setDataEncipherment(@Nullable Boolean dataEncipherment) {
            this.dataEncipherment = dataEncipherment;
            return this;
        }

        public Builder setDecipherOnly(@Nullable Boolean decipherOnly) {
            this.decipherOnly = decipherOnly;
            return this;
        }

        public Builder setDigitalSignature(@Nullable Boolean digitalSignature) {
            this.digitalSignature = digitalSignature;
            return this;
        }

        public Builder setEncipherOnly(@Nullable Boolean encipherOnly) {
            this.encipherOnly = encipherOnly;
            return this;
        }

        public Builder setKeyAgreement(@Nullable Boolean keyAgreement) {
            this.keyAgreement = keyAgreement;
            return this;
        }

        public Builder setKeyEncipherment(@Nullable Boolean keyEncipherment) {
            this.keyEncipherment = keyEncipherment;
            return this;
        }
        public CaPoolIssuancePolicyBaselineValuesKeyUsageBaseKeyUsage build() {
            return new CaPoolIssuancePolicyBaselineValuesKeyUsageBaseKeyUsage(certSign, contentCommitment, crlSign, dataEncipherment, decipherOnly, digitalSignature, encipherOnly, keyAgreement, keyEncipherment);
        }
    }
}
