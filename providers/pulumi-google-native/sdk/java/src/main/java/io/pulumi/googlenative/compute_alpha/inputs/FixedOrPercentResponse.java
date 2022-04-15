// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Encapsulates numeric value that can be either absolute or relative.
 * 
 */
public final class FixedOrPercentResponse extends io.pulumi.resources.InvokeArgs {

    public static final FixedOrPercentResponse Empty = new FixedOrPercentResponse();

    /**
     * Absolute value of VM instances calculated based on the specific mode. - If the value is fixed, then the calculated value is equal to the fixed value. - If the value is a percent, then the calculated value is percent/100 * targetSize. For example, the calculated value of a 80% of a managed instance group with 150 instances would be (80/100 * 150) = 120 VM instances. If there is a remainder, the number is rounded.
     * 
     */
    @Import(name="calculated", required=true)
      private final Integer calculated;

    public Integer calculated() {
        return this.calculated;
    }

    /**
     * Specifies a fixed number of VM instances. This must be a positive integer.
     * 
     */
    @Import(name="fixed", required=true)
      private final Integer fixed;

    public Integer fixed() {
        return this.fixed;
    }

    /**
     * Specifies a percentage of instances between 0 to 100%, inclusive. For example, specify 80 for 80%.
     * 
     */
    @Import(name="percent", required=true)
      private final Integer percent;

    public Integer percent() {
        return this.percent;
    }

    public FixedOrPercentResponse(
        Integer calculated,
        Integer fixed,
        Integer percent) {
        this.calculated = Objects.requireNonNull(calculated, "expected parameter 'calculated' to be non-null");
        this.fixed = Objects.requireNonNull(fixed, "expected parameter 'fixed' to be non-null");
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
    }

    private FixedOrPercentResponse() {
        this.calculated = null;
        this.fixed = null;
        this.percent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FixedOrPercentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer calculated;
        private Integer fixed;
        private Integer percent;

        public Builder() {
    	      // Empty
        }

        public Builder(FixedOrPercentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.calculated = defaults.calculated;
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder calculated(Integer calculated) {
            this.calculated = Objects.requireNonNull(calculated);
            return this;
        }
        public Builder fixed(Integer fixed) {
            this.fixed = Objects.requireNonNull(fixed);
            return this;
        }
        public Builder percent(Integer percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }        public FixedOrPercentResponse build() {
            return new FixedOrPercentResponse(calculated, fixed, percent);
        }
    }
}
