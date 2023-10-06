// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GtmAsmapAssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final GtmAsmapAssignmentArgs Empty = new GtmAsmapAssignmentArgs();

    @Import(name="asNumbers", required=true)
    private Output<List<Integer>> asNumbers;

    public Output<List<Integer>> asNumbers() {
        return this.asNumbers;
    }

    @Import(name="datacenterId", required=true)
    private Output<Integer> datacenterId;

    public Output<Integer> datacenterId() {
        return this.datacenterId;
    }

    @Import(name="nickname", required=true)
    private Output<String> nickname;

    public Output<String> nickname() {
        return this.nickname;
    }

    private GtmAsmapAssignmentArgs() {}

    private GtmAsmapAssignmentArgs(GtmAsmapAssignmentArgs $) {
        this.asNumbers = $.asNumbers;
        this.datacenterId = $.datacenterId;
        this.nickname = $.nickname;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GtmAsmapAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GtmAsmapAssignmentArgs $;

        public Builder() {
            $ = new GtmAsmapAssignmentArgs();
        }

        public Builder(GtmAsmapAssignmentArgs defaults) {
            $ = new GtmAsmapAssignmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder asNumbers(Output<List<Integer>> asNumbers) {
            $.asNumbers = asNumbers;
            return this;
        }

        public Builder asNumbers(List<Integer> asNumbers) {
            return asNumbers(Output.of(asNumbers));
        }

        public Builder asNumbers(Integer... asNumbers) {
            return asNumbers(List.of(asNumbers));
        }

        public Builder datacenterId(Output<Integer> datacenterId) {
            $.datacenterId = datacenterId;
            return this;
        }

        public Builder datacenterId(Integer datacenterId) {
            return datacenterId(Output.of(datacenterId));
        }

        public Builder nickname(Output<String> nickname) {
            $.nickname = nickname;
            return this;
        }

        public Builder nickname(String nickname) {
            return nickname(Output.of(nickname));
        }

        public GtmAsmapAssignmentArgs build() {
            if ($.asNumbers == null) {
                throw new MissingRequiredPropertyException("GtmAsmapAssignmentArgs", "asNumbers");
            }
            if ($.datacenterId == null) {
                throw new MissingRequiredPropertyException("GtmAsmapAssignmentArgs", "datacenterId");
            }
            if ($.nickname == null) {
                throw new MissingRequiredPropertyException("GtmAsmapAssignmentArgs", "nickname");
            }
            return $;
        }
    }

}
