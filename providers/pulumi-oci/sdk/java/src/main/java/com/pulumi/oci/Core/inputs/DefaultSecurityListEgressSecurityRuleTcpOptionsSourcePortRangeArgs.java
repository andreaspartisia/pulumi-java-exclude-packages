// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs Empty = new DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs();

    @Import(name="max", required=true)
    private Output<Integer> max;

    public Output<Integer> max() {
        return this.max;
    }

    @Import(name="min", required=true)
    private Output<Integer> min;

    public Output<Integer> min() {
        return this.min;
    }

    private DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs() {}

    private DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs(DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs $;

        public Builder() {
            $ = new DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs();
        }

        public Builder(DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs defaults) {
            $ = new DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs(Objects.requireNonNull(defaults));
        }

        public Builder max(Output<Integer> max) {
            $.max = max;
            return this;
        }

        public Builder max(Integer max) {
            return max(Output.of(max));
        }

        public Builder min(Output<Integer> min) {
            $.min = min;
            return this;
        }

        public Builder min(Integer min) {
            return min(Output.of(min));
        }

        public DefaultSecurityListEgressSecurityRuleTcpOptionsSourcePortRangeArgs build() {
            $.max = Objects.requireNonNull($.max, "expected parameter 'max' to be non-null");
            $.min = Objects.requireNonNull($.min, "expected parameter 'min' to be non-null");
            return $;
        }
    }

}
