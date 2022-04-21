// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.PolybaseSettingsRejectType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PolyBase settings.
 * 
 */
public final class PolybaseSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolybaseSettingsArgs Empty = new PolybaseSettingsArgs();

    /**
     * Determines the number of rows to attempt to retrieve before the PolyBase recalculates the percentage of rejected rows. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="rejectSampleValue")
    private @Nullable Output<Object> rejectSampleValue;

    public Optional<Output<Object>> rejectSampleValue() {
        return Optional.ofNullable(this.rejectSampleValue);
    }

    /**
     * Reject type.
     * 
     */
    @Import(name="rejectType")
    private @Nullable Output<Either<String,PolybaseSettingsRejectType>> rejectType;

    public Optional<Output<Either<String,PolybaseSettingsRejectType>>> rejectType() {
        return Optional.ofNullable(this.rejectType);
    }

    /**
     * Specifies the value or the percentage of rows that can be rejected before the query fails. Type: number (or Expression with resultType number), minimum: 0.
     * 
     */
    @Import(name="rejectValue")
    private @Nullable Output<Object> rejectValue;

    public Optional<Output<Object>> rejectValue() {
        return Optional.ofNullable(this.rejectValue);
    }

    /**
     * Specifies how to handle missing values in delimited text files when PolyBase retrieves data from the text file. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="useTypeDefault")
    private @Nullable Output<Object> useTypeDefault;

    public Optional<Output<Object>> useTypeDefault() {
        return Optional.ofNullable(this.useTypeDefault);
    }

    private PolybaseSettingsArgs() {}

    private PolybaseSettingsArgs(PolybaseSettingsArgs $) {
        this.rejectSampleValue = $.rejectSampleValue;
        this.rejectType = $.rejectType;
        this.rejectValue = $.rejectValue;
        this.useTypeDefault = $.useTypeDefault;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolybaseSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolybaseSettingsArgs $;

        public Builder() {
            $ = new PolybaseSettingsArgs();
        }

        public Builder(PolybaseSettingsArgs defaults) {
            $ = new PolybaseSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder rejectSampleValue(@Nullable Output<Object> rejectSampleValue) {
            $.rejectSampleValue = rejectSampleValue;
            return this;
        }

        public Builder rejectSampleValue(Object rejectSampleValue) {
            return rejectSampleValue(Output.of(rejectSampleValue));
        }

        public Builder rejectType(@Nullable Output<Either<String,PolybaseSettingsRejectType>> rejectType) {
            $.rejectType = rejectType;
            return this;
        }

        public Builder rejectType(Either<String,PolybaseSettingsRejectType> rejectType) {
            return rejectType(Output.of(rejectType));
        }

        public Builder rejectType(String rejectType) {
            return rejectType(Either.ofLeft(rejectType));
        }

        public Builder rejectType(PolybaseSettingsRejectType rejectType) {
            return rejectType(Either.ofRight(rejectType));
        }

        public Builder rejectValue(@Nullable Output<Object> rejectValue) {
            $.rejectValue = rejectValue;
            return this;
        }

        public Builder rejectValue(Object rejectValue) {
            return rejectValue(Output.of(rejectValue));
        }

        public Builder useTypeDefault(@Nullable Output<Object> useTypeDefault) {
            $.useTypeDefault = useTypeDefault;
            return this;
        }

        public Builder useTypeDefault(Object useTypeDefault) {
            return useTypeDefault(Output.of(useTypeDefault));
        }

        public PolybaseSettingsArgs build() {
            return $;
        }
    }

}
