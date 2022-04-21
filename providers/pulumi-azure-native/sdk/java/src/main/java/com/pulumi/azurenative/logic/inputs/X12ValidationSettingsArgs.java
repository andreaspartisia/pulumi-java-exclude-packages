// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.TrailingSeparatorPolicy;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 agreement validation settings.
 * 
 */
public final class X12ValidationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final X12ValidationSettingsArgs Empty = new X12ValidationSettingsArgs();

    /**
     * The value indicating whether to allow leading and trailing spaces and zeroes.
     * 
     */
    @Import(name="allowLeadingAndTrailingSpacesAndZeroes", required=true)
    private Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes;

    public Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes() {
        return this.allowLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The value indicating whether to check for duplicate group control number.
     * 
     */
    @Import(name="checkDuplicateGroupControlNumber", required=true)
    private Output<Boolean> checkDuplicateGroupControlNumber;

    public Output<Boolean> checkDuplicateGroupControlNumber() {
        return this.checkDuplicateGroupControlNumber;
    }

    /**
     * The value indicating whether to check for duplicate interchange control number.
     * 
     */
    @Import(name="checkDuplicateInterchangeControlNumber", required=true)
    private Output<Boolean> checkDuplicateInterchangeControlNumber;

    public Output<Boolean> checkDuplicateInterchangeControlNumber() {
        return this.checkDuplicateInterchangeControlNumber;
    }

    /**
     * The value indicating whether to check for duplicate transaction set control number.
     * 
     */
    @Import(name="checkDuplicateTransactionSetControlNumber", required=true)
    private Output<Boolean> checkDuplicateTransactionSetControlNumber;

    public Output<Boolean> checkDuplicateTransactionSetControlNumber() {
        return this.checkDuplicateTransactionSetControlNumber;
    }

    /**
     * The validity period of interchange control number.
     * 
     */
    @Import(name="interchangeControlNumberValidityDays", required=true)
    private Output<Integer> interchangeControlNumberValidityDays;

    public Output<Integer> interchangeControlNumberValidityDays() {
        return this.interchangeControlNumberValidityDays;
    }

    /**
     * The trailing separator policy.
     * 
     */
    @Import(name="trailingSeparatorPolicy", required=true)
    private Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy;

    public Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy() {
        return this.trailingSeparatorPolicy;
    }

    /**
     * The value indicating whether to trim leading and trailing spaces and zeroes.
     * 
     */
    @Import(name="trimLeadingAndTrailingSpacesAndZeroes", required=true)
    private Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes;

    public Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes() {
        return this.trimLeadingAndTrailingSpacesAndZeroes;
    }

    /**
     * The value indicating whether to validate character set in the message.
     * 
     */
    @Import(name="validateCharacterSet", required=true)
    private Output<Boolean> validateCharacterSet;

    public Output<Boolean> validateCharacterSet() {
        return this.validateCharacterSet;
    }

    /**
     * The value indicating whether to Whether to validate EDI types.
     * 
     */
    @Import(name="validateEDITypes", required=true)
    private Output<Boolean> validateEDITypes;

    public Output<Boolean> validateEDITypes() {
        return this.validateEDITypes;
    }

    /**
     * The value indicating whether to Whether to validate XSD types.
     * 
     */
    @Import(name="validateXSDTypes", required=true)
    private Output<Boolean> validateXSDTypes;

    public Output<Boolean> validateXSDTypes() {
        return this.validateXSDTypes;
    }

    private X12ValidationSettingsArgs() {}

    private X12ValidationSettingsArgs(X12ValidationSettingsArgs $) {
        this.allowLeadingAndTrailingSpacesAndZeroes = $.allowLeadingAndTrailingSpacesAndZeroes;
        this.checkDuplicateGroupControlNumber = $.checkDuplicateGroupControlNumber;
        this.checkDuplicateInterchangeControlNumber = $.checkDuplicateInterchangeControlNumber;
        this.checkDuplicateTransactionSetControlNumber = $.checkDuplicateTransactionSetControlNumber;
        this.interchangeControlNumberValidityDays = $.interchangeControlNumberValidityDays;
        this.trailingSeparatorPolicy = $.trailingSeparatorPolicy;
        this.trimLeadingAndTrailingSpacesAndZeroes = $.trimLeadingAndTrailingSpacesAndZeroes;
        this.validateCharacterSet = $.validateCharacterSet;
        this.validateEDITypes = $.validateEDITypes;
        this.validateXSDTypes = $.validateXSDTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12ValidationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12ValidationSettingsArgs $;

        public Builder() {
            $ = new X12ValidationSettingsArgs();
        }

        public Builder(X12ValidationSettingsArgs defaults) {
            $ = new X12ValidationSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowLeadingAndTrailingSpacesAndZeroes(Output<Boolean> allowLeadingAndTrailingSpacesAndZeroes) {
            $.allowLeadingAndTrailingSpacesAndZeroes = allowLeadingAndTrailingSpacesAndZeroes;
            return this;
        }

        public Builder allowLeadingAndTrailingSpacesAndZeroes(Boolean allowLeadingAndTrailingSpacesAndZeroes) {
            return allowLeadingAndTrailingSpacesAndZeroes(Output.of(allowLeadingAndTrailingSpacesAndZeroes));
        }

        public Builder checkDuplicateGroupControlNumber(Output<Boolean> checkDuplicateGroupControlNumber) {
            $.checkDuplicateGroupControlNumber = checkDuplicateGroupControlNumber;
            return this;
        }

        public Builder checkDuplicateGroupControlNumber(Boolean checkDuplicateGroupControlNumber) {
            return checkDuplicateGroupControlNumber(Output.of(checkDuplicateGroupControlNumber));
        }

        public Builder checkDuplicateInterchangeControlNumber(Output<Boolean> checkDuplicateInterchangeControlNumber) {
            $.checkDuplicateInterchangeControlNumber = checkDuplicateInterchangeControlNumber;
            return this;
        }

        public Builder checkDuplicateInterchangeControlNumber(Boolean checkDuplicateInterchangeControlNumber) {
            return checkDuplicateInterchangeControlNumber(Output.of(checkDuplicateInterchangeControlNumber));
        }

        public Builder checkDuplicateTransactionSetControlNumber(Output<Boolean> checkDuplicateTransactionSetControlNumber) {
            $.checkDuplicateTransactionSetControlNumber = checkDuplicateTransactionSetControlNumber;
            return this;
        }

        public Builder checkDuplicateTransactionSetControlNumber(Boolean checkDuplicateTransactionSetControlNumber) {
            return checkDuplicateTransactionSetControlNumber(Output.of(checkDuplicateTransactionSetControlNumber));
        }

        public Builder interchangeControlNumberValidityDays(Output<Integer> interchangeControlNumberValidityDays) {
            $.interchangeControlNumberValidityDays = interchangeControlNumberValidityDays;
            return this;
        }

        public Builder interchangeControlNumberValidityDays(Integer interchangeControlNumberValidityDays) {
            return interchangeControlNumberValidityDays(Output.of(interchangeControlNumberValidityDays));
        }

        public Builder trailingSeparatorPolicy(Output<Either<String,TrailingSeparatorPolicy>> trailingSeparatorPolicy) {
            $.trailingSeparatorPolicy = trailingSeparatorPolicy;
            return this;
        }

        public Builder trailingSeparatorPolicy(Either<String,TrailingSeparatorPolicy> trailingSeparatorPolicy) {
            return trailingSeparatorPolicy(Output.of(trailingSeparatorPolicy));
        }

        public Builder trailingSeparatorPolicy(String trailingSeparatorPolicy) {
            return trailingSeparatorPolicy(Either.ofLeft(trailingSeparatorPolicy));
        }

        public Builder trailingSeparatorPolicy(TrailingSeparatorPolicy trailingSeparatorPolicy) {
            return trailingSeparatorPolicy(Either.ofRight(trailingSeparatorPolicy));
        }

        public Builder trimLeadingAndTrailingSpacesAndZeroes(Output<Boolean> trimLeadingAndTrailingSpacesAndZeroes) {
            $.trimLeadingAndTrailingSpacesAndZeroes = trimLeadingAndTrailingSpacesAndZeroes;
            return this;
        }

        public Builder trimLeadingAndTrailingSpacesAndZeroes(Boolean trimLeadingAndTrailingSpacesAndZeroes) {
            return trimLeadingAndTrailingSpacesAndZeroes(Output.of(trimLeadingAndTrailingSpacesAndZeroes));
        }

        public Builder validateCharacterSet(Output<Boolean> validateCharacterSet) {
            $.validateCharacterSet = validateCharacterSet;
            return this;
        }

        public Builder validateCharacterSet(Boolean validateCharacterSet) {
            return validateCharacterSet(Output.of(validateCharacterSet));
        }

        public Builder validateEDITypes(Output<Boolean> validateEDITypes) {
            $.validateEDITypes = validateEDITypes;
            return this;
        }

        public Builder validateEDITypes(Boolean validateEDITypes) {
            return validateEDITypes(Output.of(validateEDITypes));
        }

        public Builder validateXSDTypes(Output<Boolean> validateXSDTypes) {
            $.validateXSDTypes = validateXSDTypes;
            return this;
        }

        public Builder validateXSDTypes(Boolean validateXSDTypes) {
            return validateXSDTypes(Output.of(validateXSDTypes));
        }

        public X12ValidationSettingsArgs build() {
            $.allowLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull($.allowLeadingAndTrailingSpacesAndZeroes, "expected parameter 'allowLeadingAndTrailingSpacesAndZeroes' to be non-null");
            $.checkDuplicateGroupControlNumber = Objects.requireNonNull($.checkDuplicateGroupControlNumber, "expected parameter 'checkDuplicateGroupControlNumber' to be non-null");
            $.checkDuplicateInterchangeControlNumber = Objects.requireNonNull($.checkDuplicateInterchangeControlNumber, "expected parameter 'checkDuplicateInterchangeControlNumber' to be non-null");
            $.checkDuplicateTransactionSetControlNumber = Objects.requireNonNull($.checkDuplicateTransactionSetControlNumber, "expected parameter 'checkDuplicateTransactionSetControlNumber' to be non-null");
            $.interchangeControlNumberValidityDays = Objects.requireNonNull($.interchangeControlNumberValidityDays, "expected parameter 'interchangeControlNumberValidityDays' to be non-null");
            $.trailingSeparatorPolicy = Objects.requireNonNull($.trailingSeparatorPolicy, "expected parameter 'trailingSeparatorPolicy' to be non-null");
            $.trimLeadingAndTrailingSpacesAndZeroes = Objects.requireNonNull($.trimLeadingAndTrailingSpacesAndZeroes, "expected parameter 'trimLeadingAndTrailingSpacesAndZeroes' to be non-null");
            $.validateCharacterSet = Objects.requireNonNull($.validateCharacterSet, "expected parameter 'validateCharacterSet' to be non-null");
            $.validateEDITypes = Objects.requireNonNull($.validateEDITypes, "expected parameter 'validateEDITypes' to be non-null");
            $.validateXSDTypes = Objects.requireNonNull($.validateXSDTypes, "expected parameter 'validateXSDTypes' to be non-null");
            return $;
        }
    }

}
