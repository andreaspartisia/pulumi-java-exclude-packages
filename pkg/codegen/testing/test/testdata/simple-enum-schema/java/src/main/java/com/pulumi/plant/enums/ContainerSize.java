// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.plant.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.Integer;
import java.util.StringJoiner;

    /**
     * plant container sizes
     * 
     */
    @EnumType
    public enum ContainerSize {
        FourInch(4),
        SixInch(6),
        /**
         * @deprecated
         * Eight inch pots are no longer supported.
         */
        @Deprecated /* Eight inch pots are no longer supported. */
        EightInch(8);

        private final Integer value;

        ContainerSize(Integer value) {
            this.value = value;
        }

        @EnumType.Converter
        public Integer getValue() {
            return this.value;
        }

        @Override
        public java.lang.String toString() {
            return new StringJoiner(", ", "ContainerSize[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
