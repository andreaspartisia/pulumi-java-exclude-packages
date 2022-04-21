// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.azurenative.logic.enums.SegmentTerminatorSuffix;
import com.pulumi.azurenative.logic.enums.X12CharacterSet;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The X12 agreement framing settings.
 * 
 */
public final class X12FramingSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final X12FramingSettingsArgs Empty = new X12FramingSettingsArgs();

    /**
     * The X12 character set.
     * 
     */
    @Import(name="characterSet", required=true)
    private Output<Either<String,X12CharacterSet>> characterSet;

    public Output<Either<String,X12CharacterSet>> characterSet() {
        return this.characterSet;
    }

    /**
     * The component separator.
     * 
     */
    @Import(name="componentSeparator", required=true)
    private Output<Integer> componentSeparator;

    public Output<Integer> componentSeparator() {
        return this.componentSeparator;
    }

    /**
     * The data element separator.
     * 
     */
    @Import(name="dataElementSeparator", required=true)
    private Output<Integer> dataElementSeparator;

    public Output<Integer> dataElementSeparator() {
        return this.dataElementSeparator;
    }

    /**
     * The replacement character.
     * 
     */
    @Import(name="replaceCharacter", required=true)
    private Output<Integer> replaceCharacter;

    public Output<Integer> replaceCharacter() {
        return this.replaceCharacter;
    }

    /**
     * The value indicating whether to replace separators in payload.
     * 
     */
    @Import(name="replaceSeparatorsInPayload", required=true)
    private Output<Boolean> replaceSeparatorsInPayload;

    public Output<Boolean> replaceSeparatorsInPayload() {
        return this.replaceSeparatorsInPayload;
    }

    /**
     * The segment terminator.
     * 
     */
    @Import(name="segmentTerminator", required=true)
    private Output<Integer> segmentTerminator;

    public Output<Integer> segmentTerminator() {
        return this.segmentTerminator;
    }

    /**
     * The segment terminator suffix.
     * 
     */
    @Import(name="segmentTerminatorSuffix", required=true)
    private Output<SegmentTerminatorSuffix> segmentTerminatorSuffix;

    public Output<SegmentTerminatorSuffix> segmentTerminatorSuffix() {
        return this.segmentTerminatorSuffix;
    }

    private X12FramingSettingsArgs() {}

    private X12FramingSettingsArgs(X12FramingSettingsArgs $) {
        this.characterSet = $.characterSet;
        this.componentSeparator = $.componentSeparator;
        this.dataElementSeparator = $.dataElementSeparator;
        this.replaceCharacter = $.replaceCharacter;
        this.replaceSeparatorsInPayload = $.replaceSeparatorsInPayload;
        this.segmentTerminator = $.segmentTerminator;
        this.segmentTerminatorSuffix = $.segmentTerminatorSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(X12FramingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12FramingSettingsArgs $;

        public Builder() {
            $ = new X12FramingSettingsArgs();
        }

        public Builder(X12FramingSettingsArgs defaults) {
            $ = new X12FramingSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder characterSet(Output<Either<String,X12CharacterSet>> characterSet) {
            $.characterSet = characterSet;
            return this;
        }

        public Builder characterSet(Either<String,X12CharacterSet> characterSet) {
            return characterSet(Output.of(characterSet));
        }

        public Builder characterSet(String characterSet) {
            return characterSet(Either.ofLeft(characterSet));
        }

        public Builder characterSet(X12CharacterSet characterSet) {
            return characterSet(Either.ofRight(characterSet));
        }

        public Builder componentSeparator(Output<Integer> componentSeparator) {
            $.componentSeparator = componentSeparator;
            return this;
        }

        public Builder componentSeparator(Integer componentSeparator) {
            return componentSeparator(Output.of(componentSeparator));
        }

        public Builder dataElementSeparator(Output<Integer> dataElementSeparator) {
            $.dataElementSeparator = dataElementSeparator;
            return this;
        }

        public Builder dataElementSeparator(Integer dataElementSeparator) {
            return dataElementSeparator(Output.of(dataElementSeparator));
        }

        public Builder replaceCharacter(Output<Integer> replaceCharacter) {
            $.replaceCharacter = replaceCharacter;
            return this;
        }

        public Builder replaceCharacter(Integer replaceCharacter) {
            return replaceCharacter(Output.of(replaceCharacter));
        }

        public Builder replaceSeparatorsInPayload(Output<Boolean> replaceSeparatorsInPayload) {
            $.replaceSeparatorsInPayload = replaceSeparatorsInPayload;
            return this;
        }

        public Builder replaceSeparatorsInPayload(Boolean replaceSeparatorsInPayload) {
            return replaceSeparatorsInPayload(Output.of(replaceSeparatorsInPayload));
        }

        public Builder segmentTerminator(Output<Integer> segmentTerminator) {
            $.segmentTerminator = segmentTerminator;
            return this;
        }

        public Builder segmentTerminator(Integer segmentTerminator) {
            return segmentTerminator(Output.of(segmentTerminator));
        }

        public Builder segmentTerminatorSuffix(Output<SegmentTerminatorSuffix> segmentTerminatorSuffix) {
            $.segmentTerminatorSuffix = segmentTerminatorSuffix;
            return this;
        }

        public Builder segmentTerminatorSuffix(SegmentTerminatorSuffix segmentTerminatorSuffix) {
            return segmentTerminatorSuffix(Output.of(segmentTerminatorSuffix));
        }

        public X12FramingSettingsArgs build() {
            $.characterSet = Objects.requireNonNull($.characterSet, "expected parameter 'characterSet' to be non-null");
            $.componentSeparator = Objects.requireNonNull($.componentSeparator, "expected parameter 'componentSeparator' to be non-null");
            $.dataElementSeparator = Objects.requireNonNull($.dataElementSeparator, "expected parameter 'dataElementSeparator' to be non-null");
            $.replaceCharacter = Objects.requireNonNull($.replaceCharacter, "expected parameter 'replaceCharacter' to be non-null");
            $.replaceSeparatorsInPayload = Objects.requireNonNull($.replaceSeparatorsInPayload, "expected parameter 'replaceSeparatorsInPayload' to be non-null");
            $.segmentTerminator = Objects.requireNonNull($.segmentTerminator, "expected parameter 'segmentTerminator' to be non-null");
            $.segmentTerminatorSuffix = Objects.requireNonNull($.segmentTerminatorSuffix, "expected parameter 'segmentTerminatorSuffix' to be non-null");
            return $;
        }
    }

}
