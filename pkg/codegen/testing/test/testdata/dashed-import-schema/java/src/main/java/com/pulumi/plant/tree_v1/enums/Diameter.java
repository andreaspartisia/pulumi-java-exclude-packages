// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.plant.tree_v1.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.Double;
import java.util.StringJoiner;

    @EnumType
    public enum Diameter {
        Sixinch(6.000000),
        Twelveinch(12.000000);

        private final Double value;

        Diameter(Double value) {
            this.value = value;
        }

        @EnumType.Converter
        public Double getValue() {
            return this.value;
        }

        @Override
        public java.lang.String toString() {
            return new StringJoiner(", ", "Diameter[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
