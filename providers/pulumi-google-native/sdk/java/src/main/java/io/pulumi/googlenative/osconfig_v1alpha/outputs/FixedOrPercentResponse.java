// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class FixedOrPercentResponse {
    /**
     * Specifies a fixed value.
     * 
     */
    private final Integer fixed;
    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
     */
    private final Integer percent;

    @CustomType.Constructor
    private FixedOrPercentResponse(
        @CustomType.Parameter("fixed") Integer fixed,
        @CustomType.Parameter("percent") Integer percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    /**
     * Specifies a fixed value.
     * 
    */
    public Integer fixed() {
        return this.fixed;
    }
    /**
     * Specifies the relative value defined as a percentage, which will be multiplied by a reference value.
     * 
    */
    public Integer percent() {
        return this.percent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FixedOrPercentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer fixed;
        private Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(FixedOrPercentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder fixed(Integer fixed) {
            this.fixed = Objects.requireNonNull(fixed);
            return this;
        }
        public Builder percent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }        public FixedOrPercentResponse build() {
            return new FixedOrPercentResponse(fixed, percent);
        }
    }
}
