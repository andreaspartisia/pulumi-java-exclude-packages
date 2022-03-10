// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.certificateauthority.outputs.CaPoolIssuancePolicyIdentityConstraintsCelExpression;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CaPoolIssuancePolicyIdentityConstraints {
    /**
     * If this is set, the SubjectAltNames extension may be copied from a certificate request into the signed certificate.
     * Otherwise, the requested SubjectAltNames will be discarded.
     * 
     */
    private final Boolean allowSubjectAltNamesPassthrough;
    /**
     * If this is set, the Subject field may be copied from a certificate request into the signed certificate.
     * Otherwise, the requested Subject will be discarded.
     * 
     */
    private final Boolean allowSubjectPassthrough;
    /**
     * A CEL expression that may be used to validate the resolved X.509 Subject and/or Subject Alternative Name before a
     * certificate is signed. To see the full allowed syntax and some examples,
     * see https://cloud.google.com/certificate-authority-service/docs/cel-guide
     * Structure is documented below.
     * 
     */
    private final @Nullable CaPoolIssuancePolicyIdentityConstraintsCelExpression celExpression;

    @OutputCustomType.Constructor
    private CaPoolIssuancePolicyIdentityConstraints(
        @OutputCustomType.Parameter("allowSubjectAltNamesPassthrough") Boolean allowSubjectAltNamesPassthrough,
        @OutputCustomType.Parameter("allowSubjectPassthrough") Boolean allowSubjectPassthrough,
        @OutputCustomType.Parameter("celExpression") @Nullable CaPoolIssuancePolicyIdentityConstraintsCelExpression celExpression) {
        this.allowSubjectAltNamesPassthrough = allowSubjectAltNamesPassthrough;
        this.allowSubjectPassthrough = allowSubjectPassthrough;
        this.celExpression = celExpression;
    }

    /**
     * If this is set, the SubjectAltNames extension may be copied from a certificate request into the signed certificate.
     * Otherwise, the requested SubjectAltNames will be discarded.
     * 
    */
    public Boolean getAllowSubjectAltNamesPassthrough() {
        return this.allowSubjectAltNamesPassthrough;
    }
    /**
     * If this is set, the Subject field may be copied from a certificate request into the signed certificate.
     * Otherwise, the requested Subject will be discarded.
     * 
    */
    public Boolean getAllowSubjectPassthrough() {
        return this.allowSubjectPassthrough;
    }
    /**
     * A CEL expression that may be used to validate the resolved X.509 Subject and/or Subject Alternative Name before a
     * certificate is signed. To see the full allowed syntax and some examples,
     * see https://cloud.google.com/certificate-authority-service/docs/cel-guide
     * Structure is documented below.
     * 
    */
    public Optional<CaPoolIssuancePolicyIdentityConstraintsCelExpression> getCelExpression() {
        return Optional.ofNullable(this.celExpression);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyIdentityConstraints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowSubjectAltNamesPassthrough;
        private Boolean allowSubjectPassthrough;
        private @Nullable CaPoolIssuancePolicyIdentityConstraintsCelExpression celExpression;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolIssuancePolicyIdentityConstraints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowSubjectAltNamesPassthrough = defaults.allowSubjectAltNamesPassthrough;
    	      this.allowSubjectPassthrough = defaults.allowSubjectPassthrough;
    	      this.celExpression = defaults.celExpression;
        }

        public Builder setAllowSubjectAltNamesPassthrough(Boolean allowSubjectAltNamesPassthrough) {
            this.allowSubjectAltNamesPassthrough = Objects.requireNonNull(allowSubjectAltNamesPassthrough);
            return this;
        }

        public Builder setAllowSubjectPassthrough(Boolean allowSubjectPassthrough) {
            this.allowSubjectPassthrough = Objects.requireNonNull(allowSubjectPassthrough);
            return this;
        }

        public Builder setCelExpression(@Nullable CaPoolIssuancePolicyIdentityConstraintsCelExpression celExpression) {
            this.celExpression = celExpression;
            return this;
        }
        public CaPoolIssuancePolicyIdentityConstraints build() {
            return new CaPoolIssuancePolicyIdentityConstraints(allowSubjectAltNamesPassthrough, allowSubjectPassthrough, celExpression);
        }
    }
}
