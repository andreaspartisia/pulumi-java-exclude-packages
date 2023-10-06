// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class CloudwrapperConfigurationLocationCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudwrapperConfigurationLocationCapacityArgs Empty = new CloudwrapperConfigurationLocationCapacityArgs();

    @Import(name="unit", required=true)
    private Output<String> unit;

    public Output<String> unit() {
        return this.unit;
    }

    @Import(name="value", required=true)
    private Output<Integer> value;

    public Output<Integer> value() {
        return this.value;
    }

    private CloudwrapperConfigurationLocationCapacityArgs() {}

    private CloudwrapperConfigurationLocationCapacityArgs(CloudwrapperConfigurationLocationCapacityArgs $) {
        this.unit = $.unit;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudwrapperConfigurationLocationCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudwrapperConfigurationLocationCapacityArgs $;

        public Builder() {
            $ = new CloudwrapperConfigurationLocationCapacityArgs();
        }

        public Builder(CloudwrapperConfigurationLocationCapacityArgs defaults) {
            $ = new CloudwrapperConfigurationLocationCapacityArgs(Objects.requireNonNull(defaults));
        }

        public Builder unit(Output<String> unit) {
            $.unit = unit;
            return this;
        }

        public Builder unit(String unit) {
            return unit(Output.of(unit));
        }

        public Builder value(Output<Integer> value) {
            $.value = value;
            return this;
        }

        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public CloudwrapperConfigurationLocationCapacityArgs build() {
            if ($.unit == null) {
                throw new MissingRequiredPropertyException("CloudwrapperConfigurationLocationCapacityArgs", "unit");
            }
            if ($.value == null) {
                throw new MissingRequiredPropertyException("CloudwrapperConfigurationLocationCapacityArgs", "value");
            }
            return $;
        }
    }

}
