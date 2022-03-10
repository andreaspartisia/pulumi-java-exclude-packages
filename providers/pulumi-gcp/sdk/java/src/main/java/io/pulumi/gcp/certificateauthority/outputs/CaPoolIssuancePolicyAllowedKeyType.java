// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolIssuancePolicyAllowedKeyTypeEllipticCurve;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolIssuancePolicyAllowedKeyTypeRsa;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CaPoolIssuancePolicyAllowedKeyType {
    /**
     * Represents an allowed Elliptic Curve key type.
     * Structure is documented below.
     * 
     */
    private final @Nullable CaPoolIssuancePolicyAllowedKeyTypeEllipticCurve ellipticCurve;
    /**
     * Describes an RSA key that may be used in a Certificate issued from a CaPool.
     * Structure is documented below.
     * 
     */
    private final @Nullable CaPoolIssuancePolicyAllowedKeyTypeRsa rsa;

    @OutputCustomType.Constructor
    private CaPoolIssuancePolicyAllowedKeyType(
        @OutputCustomType.Parameter("ellipticCurve") @Nullable CaPoolIssuancePolicyAllowedKeyTypeEllipticCurve ellipticCurve,
        @OutputCustomType.Parameter("rsa") @Nullable CaPoolIssuancePolicyAllowedKeyTypeRsa rsa) {
        this.ellipticCurve = ellipticCurve;
        this.rsa = rsa;
    }

    /**
     * Represents an allowed Elliptic Curve key type.
     * Structure is documented below.
     * 
    */
    public Optional<CaPoolIssuancePolicyAllowedKeyTypeEllipticCurve> getEllipticCurve() {
        return Optional.ofNullable(this.ellipticCurve);
    }
    /**
     * Describes an RSA key that may be used in a Certificate issued from a CaPool.
     * Structure is documented below.
     * 
    */
    public Optional<CaPoolIssuancePolicyAllowedKeyTypeRsa> getRsa() {
        return Optional.ofNullable(this.rsa);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyAllowedKeyType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CaPoolIssuancePolicyAllowedKeyTypeEllipticCurve ellipticCurve;
        private @Nullable CaPoolIssuancePolicyAllowedKeyTypeRsa rsa;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyAllowedKeyType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ellipticCurve = defaults.ellipticCurve;
    	      this.rsa = defaults.rsa;
        }

        public Builder setEllipticCurve(@Nullable CaPoolIssuancePolicyAllowedKeyTypeEllipticCurve ellipticCurve) {
            this.ellipticCurve = ellipticCurve;
            return this;
        }

        public Builder setRsa(@Nullable CaPoolIssuancePolicyAllowedKeyTypeRsa rsa) {
            this.rsa = rsa;
            return this;
        }
        public CaPoolIssuancePolicyAllowedKeyType build() {
            return new CaPoolIssuancePolicyAllowedKeyType(ellipticCurve, rsa);
        }
    }
}
